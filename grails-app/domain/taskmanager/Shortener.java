/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;
        
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RenukaJ
 */
public class Shortener {

    private String googUrl = "https://www.googleapis.com/urlshortener/v1/url?shortUrl=http://goo.gl/fbsS&key=AIzaSyCGHfX4SZpxwWCUMj2L1u-e8zqLTgvqmEc";

    public String shorten(String longUrl) {
        String shortUrl = "";

        try {
            System.out.println("debuggingJava1");
            URLConnection conn = new URL(googUrl).openConnection();
            System.out.println("debuggingJava2");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter wr
                    = new OutputStreamWriter(conn.getOutputStream());
            wr.write("{\"longUrl\":\"" + longUrl + "\"}");
            wr.flush();

            // Get the response
            BufferedReader rd
                    = new BufferedReader(
                            new InputStreamReader(conn.getInputStream()));
            String line;

            while ((line = rd.readLine()) != null) {
                if (line.indexOf("id") > -1) {
                    // I'm sure there's a more elegant way of parsing
                    // the JSON response, but this is quick/dirty =)
                    shortUrl = line.substring(8, line.length() - 2);
                    break;
                }
            }

            wr.close();
            rd.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Shortener.class.getName()).log(
                    Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Shortener.class.getName()).log(
                    Level.SEVERE, null, ex);
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("shorturl in Shortener java:"+shortUrl);
        return shortUrl;
    }
}
