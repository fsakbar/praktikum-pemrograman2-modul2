package PRAK202_2010817210023_MuhammadAuliaAkbar;

import PRAK201_2010817210023_MuhammadAuliaAkbar.Buah;

public class Main {
    public static void main(String [] args){
        Kopi kopi1 = new Kopi();
        kopi1.namaKopi = "Espresso";
        kopi1.ukuran = "Medium";
        kopi1.harga = 25000;

        kopi1.info();
        kopi1.setPembeli("Alice");
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
        System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak());

    }
}
