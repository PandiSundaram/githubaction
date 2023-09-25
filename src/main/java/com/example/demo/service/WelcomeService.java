package com.example.demo.service;




import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WelcomeService {


public JSONArray parseJsondata(){

    JSONParser jsonParser = new JSONParser();
    JSONArray employeeList = null;

    try (FileReader reader = new FileReader("test.json"))
    {
        //Read JSON file
        Object obj = jsonParser.parse(reader);

         employeeList = (JSONArray) obj;
        System.out.println(employeeList);


        //Iterate over employee array

    } catch (Exception e) {
        e.printStackTrace();
    }
    return employeeList;
}


}
