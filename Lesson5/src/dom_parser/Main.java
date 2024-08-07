package dom_parser;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        // Get the dom builder factory
        DocumentBuilderFactory factoryBuilderDocument = DocumentBuilderFactory.newInstance();

        // Get the dom builder
        DocumentBuilder builderDocument = factoryBuilderDocument.newDocumentBuilder();

        // Land and parse the xml document
        // Object document contains the complete xml as a tree
        Document document = builderDocument.parse(ClassLoader.getSystemResourceAsStream("dom_parser/data/Student.xml"));

        List<Student> arrayListStudent = new ArrayList<Student>();

        // Iterating through the nodes list and extracting the data
        NodeList listNode = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < listNode.getLength(); i++) {

            // We have encountered on <student> tag
            Node node = listNode.item(i);

            // Check if the current node is an instance of element
            if (node instanceof Element) {

                Student student = new Student();

                // Check if the current node is a student tag
                if (node.getNodeName() == "student") {

                    NamedNodeMap mapNodeNamed = node.getAttributes();

                    // Get the student id & active attributes
                    student.id = mapNodeNamed.getNamedItem("id").getNodeValue();
                    student.active = mapNodeNamed.getNamedItem("active").getNodeName();
                }

                // We get the list of the child nodes of student element
                NodeList listNodesChild = node.getChildNodes();

                for (int j = 0; j < listNodesChild.getLength(); j++) {

                    Node nodeC = listNodesChild.item(j);

                    // Identifying the child tag of student encountered
                    if (nodeC instanceof Element) {

                        // We get the last child of the current tag
                        // The last child will be the text node
                        String content = nodeC.getLastChild().getNodeValue().trim();

                        switch (nodeC.getNodeName()) {
                            case "firstName":
                                student.firstName = content;
                                break;
                            case "lastName":
                                student.lastName = content;
                                break;
                            case "location":
                                student.location = content;
                                break;
                        }
                    }
                }
                arrayListStudent.add(student);
            }
        }

        // Printing the student list populated
        for (Student student: arrayListStudent) {
            System.out.println(student);
        }
    }
}

