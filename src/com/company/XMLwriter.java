package com.company;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import static com.company.XMLtoJSON.INDENTATION;

public class XMLwriter {

   private String Xml_data="";

   public void Read_xml_file (String path)
   {

      try{
         File xmlFile = new File(path); // Let's get XML file as String using BufferedReader //
         Reader fileReader = new FileReader(xmlFile);
         BufferedReader bufReader = new BufferedReader(fileReader);
         StringBuilder sb = new StringBuilder();
         String line = bufReader.readLine();
         while (line != null) {
            sb.append(line).append("\n");
            line = bufReader.readLine();
         }
         Xml_data = sb.toString();
         bufReader.close();
        // System.out.println(Xml_data);
      } catch (Exception e) {
          e.printStackTrace();
      }

   }
   public String getXml_data()
   {
      return Xml_data;
   }
}
