package code_parser_sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

// The handler for sax events
public class SAXHandler extends DefaultHandler {

    List<Student> studentsArrayList;
    Student student = null;
    String content = null;


    @Override
    public void startDocument() throws SAXException {
        studentsArrayList = new ArrayList<Student>();
    }

    // Triggered when the start of tag is found
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        switch (qName) {
            // Create a new student object when the start tag is found
            case "student":
                student = new Student();
                student.id = attributes.getValue("id");
                student.active = attributes.getValue("active");
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        switch (qName) {
            // Add the student to list once end tag is found
            case "student":
                studentsArrayList.add(student);
                break;
            // For all other end tags the student has to be updated
            case "firstName":
                student.firstName = this.content;
                break;
            case "lastName":
                student.lastName = this.content;
                break;
            case "location":
                student.location = this.content;
                break;
        }
    }

    @Override
    public void characters(char[] chr, int start, int length) throws SAXException {
        this.content = String.copyValueOf(chr, start, length).trim();
    }

    @Override
    public void endDocument() throws SAXException {

        // Printing the list of students obtained from xml
        for (Student _student: studentsArrayList) {
            System.out.println(_student);
        }
    }
}
