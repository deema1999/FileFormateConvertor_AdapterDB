package com.company;

import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONwriter {
    private String json_data="";
    JSONParser parser = new JSONParser();

    public void Read_json_file (String path)
    {
        try {
            json_data = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String getjson_data()
    {
        return json_data;
    }
}
