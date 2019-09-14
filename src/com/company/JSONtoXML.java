package com.company;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONWriter;
import org.json.XML;

public class JSONtoXML implements Adapter{

    String xml_data;
    @Override
    public String get_data(String File) {
        JSONwriter json = new JSONwriter();
        String path = "C:\\Users\\Deema\\IdeaProjects\\FileFormateAdapterConvertor\\src\\com\\company\\"+File;
        json.Read_json_file(path);
        String json_data = json.getjson_data();
        return json_data;
    }

    @Override
    public String Convert_data(String data) {
        try {
            JSONObject jsoObject = new JSONObject(data);
            xml_data = XML.toString(jsoObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return xml_data;
    }

    @Override
    public void display_data() {
        System.out.println(xml_data);
    }
}
