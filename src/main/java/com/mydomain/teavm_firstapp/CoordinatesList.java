package com.mydomain.teavm_firstapp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class CoordinatesList {
    private static Coordinates line = new Coordinates(30, 40, 100, 100);
    private static Coordinates line2 = new Coordinates(50, 10, 200, 100);
    private static List<Coordinates> lines = new ArrayList<>();
    private static int i = 0;

    public static List<Coordinates> getCoordinatesList() {
        if (i == 0)
        {
            lines.add(line);
            lines.add(line2);
            i = 1;
        }
        return lines;
    }

    public static String getJson() {
        Type listType = new TypeToken<List<Coordinates>>()
        {
        }.getType();
        Gson gson = new Gson();
        String json = gson.toJson(CoordinatesList.getCoordinatesList(), listType);
        return json;
    }

}
