package edu.escuelaing.arep;

import java.net.MalformedURLException;
import java.net.URL;

public class EjercicioURL{

    public static void main(String[] args) throws Exception{
       try {
        URL objetoURL = new URL("https://www.spanishwithedyta.com:80/hom/SearchForm?Search=subjenctive&searchlocale=en_GB&action_results=Go");    
        System.out.println("Protocol: " + objetoURL.getProtocol());
        System.out.println("Authority: " + objetoURL.getAuthority());
        System.out.println("Host: " + objetoURL.getHost());
        System.out.println("Port: " + objetoURL.getPort());
        System.out.println("Path: " + objetoURL.getPath());
        System.out.println("Query: " + objetoURL.getQuery());
        System.out.println("File: " + objetoURL.getFile());
        System.out.println("Ref: " + objetoURL.getRef());
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }    
    }
    
    
}
