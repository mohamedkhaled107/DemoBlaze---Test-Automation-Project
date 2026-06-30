package com.demoblaze.utils;

import com.jayway.jsonpath.JsonPath;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonReader {

    String jsonReader;
    String jsonFileName;
    private final String testDataPath="src/test/java/testdata/";

    //constructor
    public JsonReader(String jsonFileName)
    {
        this.jsonFileName = jsonFileName;
        try {
            JSONObject data = (JSONObject) new JSONParser().parse(new FileReader(testDataPath+jsonFileName+".json"));
            jsonReader = data.toJSONString();
        }catch (Exception e)
        {
            System.out.println("Error reading json file");
        }
    }
    public String getJsonData(String jsonPath)
    {
        try {
            return JsonPath.read(jsonReader,jsonPath);
        }
        catch (Exception e)
        {
            System.out.println("Error reading json file");
            return "";
        }
    }

}
