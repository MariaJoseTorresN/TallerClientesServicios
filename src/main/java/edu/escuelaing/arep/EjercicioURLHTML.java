package edu.escuelaing.arep;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class EjercicioURLHTML {

    public static void main(String[] args) throws Exception{
        System.out.println("URL:");
        Scanner objURL = new Scanner(System.in);
        String objectURL = objURL.next();
        try {
            URL objetoURL = new URL(objectURL);
            System.out.println("Protocol: " + objetoURL.getProtocol());
            System.out.println("Authority: " + objetoURL.getAuthority());
            System.out.println("Host: " + objetoURL.getHost());
            System.out.println("Port: " + objetoURL.getPort());
            System.out.println("Path: " + objetoURL.getPath());
            System.out.println("Query: " + objetoURL.getQuery());
            System.out.println("File: " + objetoURL.getFile());
            System.out.println("Ref: " + objetoURL.getRef());
        }catch(MalformedURLException e){
            e.printStackTrace();
        }

    }
    
}
