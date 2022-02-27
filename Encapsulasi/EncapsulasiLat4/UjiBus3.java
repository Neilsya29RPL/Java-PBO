
package EncapsulasiLat4;

public class UjiBus3 {
    public static void main (String [] abc){
        Bus3 bus = new Bus3(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakPenumpang();
        
        //penambahan penumpang
        bus.addpenumpang(2); //tambah 2 penumpang 
        bus.cetakPenumpang();
        
        //penambahan penumpang
        bus.addpenumpang(1); //tambah 1 penumpang
        bus.cetakPenumpang();
        
        //penambahan penumpang
        bus.addpenumpang(2); //tambah 2 penumpang
        bus.cetakPenumpang();
        
        //penambahan penumpang
        bus.addpenumpang(2); //tambah 2 penumpang 
        bus.cetakPenumpang();
    }
}


