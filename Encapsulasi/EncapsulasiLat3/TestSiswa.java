
package EncapsulasiLat3;

public class TestSiswa {
    public static void main (String[] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Neilsya");
        siswa.setAge(29);
        siswa.setAddress("Tulungagung");
        
        System.out.println("Name    : " + siswa.getName());
        System.out.println("Absen   : " + siswa.getAbsen());
        System.out.println("Address : " + siswa.getAddress());
    }
}


