package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONtoXMLTest {

    @Test
    public void get_data() {
        JSONtoXML jtox = new JSONtoXML();
        String path = "C:\\Users\\Deema\\IdeaProjects\\FileFormateAdapterConvertor\\src\\com\\company\\json1";

        String Expected = "{\"widget\": {\n" +
                "  \"debug\": \"on\",\n" +
                "  \"window\": {\n" +
                "    \"title\": \"Sample Konfabulator Widget\",\n" +
                "    \"name\": \"main_window\",\n" +
                "    \"width\": 500,\n" +
                "    \"height\": 500\n" +
                "  },\n" +
                "  \"image\": {\n" +
                "    \"src\": \"Images/Sun.png\",\n" +
                "    \"name\": \"sun1\",\n" +
                "    \"hOffset\": 250,\n" +
                "    \"vOffset\": 250,\n" +
                "    \"alignment\": \"center\"\n" +
                "  },\n" +
                "  \"text\": {\n" +
                "    \"data\": \"Click Here\",\n" +
                "    \"size\": 36,\n" +
                "    \"style\": \"bold\",\n" +
                "    \"name\": \"text1\",\n" +
                "    \"hOffset\": 250,\n" +
                "    \"vOffset\": 100,\n" +
                "    \"alignment\": \"center\",\n" +
                "    \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" +
                "  }\n" +
                "}}";
        String Actual = jtox.get_data("json1");

        assertEquals(Expected,Actual);
    }

    @Test
    public void convert_data() {
        String json_data = "{\"widget\": {\n" +
                "  \"debug\": \"on\",\n" +
                "  \"window\": {\n" +
                "    \"title\": \"Sample Konfabulator Widget\",\n" +
                "    \"name\": \"main_window\",\n" +
                "    \"width\": 500,\n" +
                "    \"height\": 500\n" +
                "  },\n" +
                "  \"image\": {\n" +
                "    \"src\": \"Images/Sun.png\",\n" +
                "    \"name\": \"sun1\",\n" +
                "    \"hOffset\": 250,\n" +
                "    \"vOffset\": 250,\n" +
                "    \"alignment\": \"center\"\n" +
                "  },\n" +
                "  \"text\": {\n" +
                "    \"data\": \"Click Here\",\n" +
                "    \"size\": 36,\n" +
                "    \"style\": \"bold\",\n" +
                "    \"name\": \"text1\",\n" +
                "    \"hOffset\": 250,\n" +
                "    \"vOffset\": 100,\n" +
                "    \"alignment\": \"center\",\n" +
                "    \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" +
                "  }\n" +
                "}}";
        String Expected_xml_data = "<widget><image><vOffset>250</vOffset><src>Images/Sun.png</src><name>sun1</name><alignment>center</alignment><hOffset>250</hOffset></image><debug>on</debug><window><name>main_window</name><width>500</width><title>Sample Konfabulator Widget</title><height>500</height></window><text><vOffset>100</vOffset><data>Click Here</data><size>36</size><name>text1</name><style>bold</style><alignment>center</alignment><onMouseUp>sun1.opacity = (sun1.opacity / 100) * 90;</onMouseUp><hOffset>250</hOffset></text></widget>";
        JSONtoXML jtox = new JSONtoXML();
        String Actual_json_data = jtox.Convert_data(json_data);
        assertEquals(Expected_xml_data,Actual_json_data);
    }
}