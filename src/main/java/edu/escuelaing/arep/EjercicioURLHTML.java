package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class EjercicioURLHTML {

    public static void main(String[] args) throws Exception{
        try {
            System.out.println("URL:");
            Scanner objURL = new Scanner(System.in);
            String objectURL = objURL.next();
            URL objetoURL = new URL(objectURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(objetoURL.openStream()));
            FileWriter resultado = new FileWriter("resultado.html");
            BufferedWriter data = new BufferedWriter(resultado);
            int fin = reader.read();
            while(fin != -1){
                data.write(reader.readLine());
                fin = reader.read();
            }
            data.close();
            objURL.close();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }

    }
    
}
