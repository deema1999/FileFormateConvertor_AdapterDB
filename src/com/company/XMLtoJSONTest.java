package com.company;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;

import static org.junit.Assert.*;

public class XMLtoJSONTest {



    @Test
    public void convert_dataTest(){
        String xml_data = "<note>\n" +
                "    <to>Tove</to>\n" +
                "    <from>Jani</from>\n" +
                "    <heading>Reminder</heading>\n" +
                "    <body>Don't forget me this weekend!</body>\n" +
                "</note>\n";
        String Expected_json_data = "{\"note\": {\n" +
                "    \"body\": \"Don't forget me this weekend!\",\n" +
                "    \"from\": \"Jani\",\n" +
                "    \"heading\": \"Reminder\",\n" +
                "    \"to\": \"Tove\"\n" +
                "}}";
        XMLtoJSON xtj = new XMLtoJSON();
        String Actual_json_data = xtj.Convert_data(xml_data);
        assertEquals(Expected_json_data,Actual_json_data);
    }
    @Test
    public void getXml_datTest(){
        XMLtoJSON xtj = new XMLtoJSON();
        String path = "C:\\Users\\Deema\\IdeaProjects\\FileFormateAdapterConvertor\\src\\com\\company\\xml";

        String Expected = "<note>\n" +
                "    <to>Tove</to>\n" +
                "    <from>Jani</from>\n" +
                "    <heading>Reminder</heading>\n" +
                "    <body>Don't forget me this weekend!</body>\n" +
                "</note>\n";
        String Actual = xtj.get_data("xml");

        assertEquals(Expected,Actual);
    }
}