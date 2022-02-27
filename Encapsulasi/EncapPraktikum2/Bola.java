
package EncapPraktikum2;

public class Bola {
    public double jariJari = 14;
    public double diameter;
    public double luasPermukaan;
    public double volume;
    
    public void setJarijari(){
        jariJari = 14;
        System.out.println("Jari-jari = " + jariJari);
    }
    public void showDiameter(){
        diameter = 2*jariJari;
        System.out.println("Diameter  = " + diameter);
    }
    public void showLuasPermukaan(){
        luasPermukaan = 4*Math.PI*jariJari*jariJari;
        System.out.println("Luas Permukaan Bola Adalah " + luasPermukaan);
    }
    public void showVolume(){
        volume = (4*Math.PI*jariJari*jariJari*jariJari)/3;
        System.out.println("Volume Bola         Adalah " + volume);
    }    
}
