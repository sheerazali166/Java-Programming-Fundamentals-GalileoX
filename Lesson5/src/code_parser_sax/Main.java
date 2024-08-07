package code_parser_sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {

    public static void main(String[] args) throws Exception {

        String path = "/Users/sheeraz/Desktop/JAVA/Java Fundaments For Android/Lesson5/src/code_parser_sax/data/Student.xml";

        SAXParserFactory factorySAXParser = SAXParserFactory.newInstance();
        SAXParser parserSAX = factorySAXParser.newSAXParser();
        SAXHandler handlerSAX = new SAXHandler();

        parserSAX.parse(ClassLoader.getSystemResourceAsStream("code_parser_sax/data/Student.xml"), handlerSAX);



    }
}
