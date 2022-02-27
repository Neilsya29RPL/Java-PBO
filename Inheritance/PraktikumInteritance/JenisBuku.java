
package PraktikumInteritance;

public class JenisBuku extends DataPinjam{
    private String hari;
    private String judul;
    private String warna;
    private int jumlahHalaman;
    
    //konstruktor
    public JenisBuku (String nama,String kelas,int absen,String hari,String judul,String warna,int jumlahHalaman){
        super (nama,kelas,absen);
        this.hari = hari;
        this.judul = judul;
        this.warna = warna;
        this.jumlahHalaman = jumlahHalaman;
    }
    
    //method
    public void data(){
        System.out.println("===============  DATA SISWA  ===============");
        super.data();
        System.out.println("==========  DATA PEMINJAMAN BUKU  ==========");
        System.out.println("Hari Peminjaman Buku     : " + this.hari);
        System.out.println("Judul Buku Yang Dipinjam : " + this.judul);
        System.out.println("Warna Buku Yang Dipinjam : " + this.warna);
        System.out.println("Jumlah Halaman Buku      : " + this.jumlahHalaman + " Halaman ");
    }   
}
