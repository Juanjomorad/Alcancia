/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcancia;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author JyK
 */ 
//ESTA CLASE SE UTILIZA para el manejo del archivo Json el cual va a contener el parcial de la alcancia cuando se cierre el programa
public class HandlerFile {

    private int contMoneda50;
    private int contMoneda100;
    private int contMoneda200;
    private int contMoneda500;
    private int contMoneda1000;

    public HandlerFile() {
    }
     //Se crea el Json verificando anteriormente su existencia utilizando de refencia un obj    
    public JsonAlcancia getJsonFile() {
        JsonAlcancia ja = new JsonAlcancia();
        try {
            String ruta = new File(".").getCanonicalPath();
            File file = new File(ruta + "/jsonfile.json");
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                Gson g = new Gson();
                String str = g.toJson(ja);
                bw.write(str);
                bw.close();
            } else {
                String json = "";
                BufferedReader br = new BufferedReader(new FileReader(file));
                String linea;
                while ((linea = br.readLine()) != null) {
                    json += linea;
                }
                br.close();
                Gson g = new Gson();
                ja = g.fromJson(json, JsonAlcancia.class);

            }

        } catch (Exception e) {
        }
        return ja;

    }
 //Actualiza el Json eliminando y creando otro con la parcialidad hasta el momento
    public JsonAlcancia JsonUpdateFile(int contMoneda50, int contMoneda100, int contMoneda200, int contMoneda500, int contMoneda1000) {
       JsonAlcancia ja = new JsonAlcancia(contMoneda50,contMoneda100,contMoneda200,contMoneda500,contMoneda1000);
        try { 
            String ruta = new File(".").getCanonicalPath();
            File file = new File(ruta + "/jsonfile.json");
            if (file.exists()) 
                file.delete();
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            Gson g = new Gson();
            String str = g.toJson(ja);
            bw.write(str);
            bw.close();

        } catch (Exception e) {
        }
        return ja;

    }
}
