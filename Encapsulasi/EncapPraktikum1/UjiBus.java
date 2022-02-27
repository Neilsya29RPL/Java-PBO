
package EncapPraktikum1;

public class UjiBus {
   public static void main (String[] args){
       Bus busKota = new Bus(80);
       busKota.getPenumpang(29);
       busKota.cetak();
       System.out.println();
       
       //penambahan penumpang
       busKota.getPenumpang(11);
       busKota.addPenumpang(26);
       busKota.cetak();
       System.out.println();
       
       //penambahan penumpang
       busKota.getPenumpang(29);
       busKota.addPenumpang(34);
       busKota.cetak();
       System.out.println();
       
       //penambahan penumpang
       busKota.getPenumpang(29);
       busKota.addPenumpang(17);
       busKota.cetak();
       System.out.println();
       
       //penambahan penumpang
       busKota.getPenumpang(23);
       busKota.addPenumpang(16);
       busKota.cetak();
       System.out.println();
       
       System.out.println("Rata-rata Berat Penumpang Bus Sekarang Adalah " + busKota.getAverage());
   } 
}
