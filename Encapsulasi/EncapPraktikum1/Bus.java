
package EncapPraktikum1;

public class Bus {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator
    public void addPenumpang (double penumpang){
        double temp;
        temp = this.penumpang + penumpang;
        if(temp > maxPenumpang){
            System.out.println("Berat Penumpang Melebihi Batas Maksimum");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    
    public void getPenumpang (double password){
        if(password == 29){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    
    public double getAverage(){
        double average;
        return penumpang / counter;
    }
    
    public void cetak(){
        System.out.println("Berat Penumpang Bus Sekarang Adalah " + penumpang);
        System.out.println("Maksimum Berat Penumpang Yang Seharusnya Adalah " + maxPenumpang);
    }
}
