package com.mytesting;

import java.net.*;
import java.io.*;


public class UrlTesting {
	
	public static void main(String[] args) throws Exception {
	    System.setProperty("http.proxyHost","iproxy.buildings.nycnet");
	    System.setProperty("http.proxyPort", "8080");
        URL oracle = new URL("http://10.152.8.167/");
        for(int i =0; i < 1; i++){
	        URLConnection yc = oracle.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
        }
    }
}
