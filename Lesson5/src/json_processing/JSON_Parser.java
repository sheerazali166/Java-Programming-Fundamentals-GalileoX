package json_processing;

import jdk.nashorn.internal.parser.JSONParser;

import javax.json.*;
import java.io.FileReader;

public class JSON_Parser {

    public static void main(String[] args) throws Exception {

        // Create the json reader object with the file location
        JsonReader readerJson = Json.createReader(new FileReader("json_processing/data/Student.json"));

        // Creates the json tree structure
        JsonStructure structureJson = readerJson.read();
        JsonObject objectJson = (JsonObject) structureJson;

        // To navigate the tree we will use a custom method that recursively navigates the complete structure
        navigateTree(structureJson, "Students");
    }

    public static void navigateTree(JsonValue treeValueJson, String key) {

        if (key != null) {
            System.out.println("Key " + key + ": ");
        }

        // Get the element value type, and depending on the type will execute the code of the matching condition of the switch statement
        switch (treeValueJson.getValueType()) {
            case OBJECT:
                System.out.println("OBJECT");
                JsonObject objectJson = (JsonObject) treeValueJson;
                for (String nameString: objectJson.keySet()) {
                    navigateTree(objectJson.get(nameString), nameString);
                }
                break;
            case ARRAY:
                System.out.println("ARRAY");
                JsonArray arrayJson = (JsonArray) treeValueJson;
                for (JsonValue valueJSon: arrayJson) {
                    navigateTree(valueJSon, null);
                }
                break;
            case STRING:
                JsonNumber numberJson = (JsonNumber) treeValueJson;
                System.out.println("Number: " + numberJson.toString());
                break;
            case TRUE:
            case FALSE:
            case NULL:
                System.out.println(treeValueJson.getValueType().toString());
                break;

        }
    }
}
