package com.company;



import org.json.JSONObject;
import org.json.XML;
public class XMLtoJSON implements Adapter {


    public static int INDENTATION = 4;
    String json_data;
    //String xml_data;

    @Override
    public String getXML_data(String Filename) {
        XMLwriter xml = new XMLwriter();
        String path = "C:\\Users\\Deema\\IdeaProjects\\FileFormateAdapterConvertor\\src\\com\\company\\"+Filename;
        xml.Read_xml_file(path);
        String xml_data = xml.getXml_data();
        return xml_data;
    }

    @Override
     public String Convert_data(String xml_data){
         try {
         JSONObject jsonObj = XML.toJSONObject(xml_data);
         json_data = jsonObj.toString(INDENTATION);
        } catch (Exception e) {
            e.printStackTrace();
        }
              return json_data;

    }

    @Override
    public void displayJSON_data() {
        System.out.println(json_data);
    }










}
