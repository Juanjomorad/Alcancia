/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcancia;

/**
 *
 * @author JyK
 */ 

//Obj de referencia para la creacion del json
public class JsonAlcancia {

   private int moneda50 ;  
   private int moneda100;
   private int moneda200; 
   private int moneda500; 
   private int moneda1000; 

    public JsonAlcancia(int moneda50, int moneda100, int moneda200, int moneda500, int moneda1000) {
        this.moneda50 = moneda50;
        this.moneda100 = moneda100;
        this.moneda200 = moneda200;
        this.moneda500 = moneda500;
        this.moneda1000 = moneda1000;
    }

    public JsonAlcancia() {
    }
   
    public int getMoneda50() {
        return moneda50;
    }

    public void setMoneda50(int moneda50) {
        this.moneda50 = moneda50;
    }

    public int getMoneda100() {
        return moneda100;
    }

    public void setMoneda100(int moneda100) {
        this.moneda100 = moneda100;
    }

    public int getMoneda200() {
        return moneda200;
    }

    public void setMoneda200(int moneda200) {
        this.moneda200 = moneda200;
    }

    public int getMoneda500() {
        return moneda500;
    }

    public void setMoneda500(int moneda500) {
        this.moneda500 = moneda500;
    }

    public int getMoneda1000() {
        return moneda1000;
    }

    public void setMoneda1000(int moneda1000) {
        this.moneda1000 = moneda1000;
    }


    @Override
    public String toString() {
        return "JsonAlcancia{" + "moneda50=" + moneda50 + ", moneda100=" + moneda100 + ", moneda200=" + moneda200 + ", moneda500=" + moneda500 + ", moneda1000=" + moneda1000 + '}';
    }
    


   
}
