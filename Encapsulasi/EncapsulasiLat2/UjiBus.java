
package EncapsulasiLat2;

public class UjiBus {
    public static void main (String[] args){
        
        //membuat objek busBesar dari class Bus
        Bus busBesar = new Bus (40);
        busBesar.cetak();
        
        //penambahan penumpang
        System.out.println("");
        busBesar.addPenumpang(15); //menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        System.out.println("");
        busBesar.addPenumpang(5); //menambah 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        System.out.println("");
        busBesar.addPenumpang(26); //menambahkan 26 penumpang
        busBesar.cetak();
    }
}

    
