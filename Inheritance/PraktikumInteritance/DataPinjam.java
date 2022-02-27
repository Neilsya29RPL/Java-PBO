
package PraktikumInteritance;

public class DataPinjam {
    private String nama;
    private String kelas;
    private int absen;
    
    //konstrruktor
    public DataPinjam(String nama,String kelas,int absen){
        this.nama = nama;
        this.kelas = kelas;
        this.absen = absen;
    }
    //method
    public void data(){
        System.out.println("Nama  : " + this.nama);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("Absen : " + this.absen);   
    }
}
