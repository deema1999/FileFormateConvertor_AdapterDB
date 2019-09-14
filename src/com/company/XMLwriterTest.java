package com.company;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class XMLwriterTest {

    @Test
    public void getXml_dataTest() {
        XMLwriter xml = new XMLwriter();
        String path = "C:\\Users\\Deema\\IdeaProjects\\FileFormateAdapterConvertor\\src\\com\\company\\xml";

        String Expected = "<note>\n" +
                "    <to>Tove</to>\n" +
                "    <from>Jani</from>\n" +
                "    <heading>Reminder</heading>\n" +
                "    <body>Don't forget me this weekend!</body>\n" +
                "</note>\n";
        xml.Read_xml_file(path);
        String Actual = xml.getXml_data();
        assertEquals(Expected,Actual);


    }
}