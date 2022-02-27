
package EncapPraktikum3;

public class EncapNilai {
     public static void main(String[] args) {
        // TODO code application logic here
         Nilai Biodata = new Nilai();
        Biodata.Nama = "Faishal";
        Biodata.NIS = "2020111001";
        Biodata.Kelas = "X RPL 1";
        Biodata.setNilai(95);
        System.out.println("Nama = "+Biodata.Nama);
        System.out.println("NIS = "+Biodata.NIS);
        System.out.println("Kelas = "+Biodata.Kelas);
        System.out.println("Nilai = "+Biodata.getNilai());
    }
}
