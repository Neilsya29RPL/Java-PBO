
package EncapsulasiLat1;

public class UjiBus {
    public static void main (String args[]){
        //membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        //memasukkan nilaijumlah penumpang dan penumpang maksimal ke dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        System.out.println("");
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        System.out.println("");
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        System.out.println("");
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
    }
}


