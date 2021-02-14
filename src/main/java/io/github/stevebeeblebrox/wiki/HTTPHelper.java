package com.example.examplemod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPHelper {
    public static String GET(String url) throws IOException {
        StringBuilder result = new StringBuilder();
          
          HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
          connection.setRequestMethod("GET");
          BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
          String line;
          while ((line = rd.readLine()) != null) {
             result.append(line);
             result.append("\n");
          }
          rd.close();
          return result.toString();
    }
}
