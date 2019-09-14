package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONwriterTest {

    @Test
    public void getjson_data() {

        JSONwriter json = new JSONwriter();
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
        json.Read_json_file(path);
        String Actual = json.getjson_data();
        assertEquals(Expected, Actual);
    }
}