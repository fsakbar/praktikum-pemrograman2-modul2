package PRAK202_2010817210023_MuhammadAuliaAkbar;

public class Kopi {
    public String namaKopi;
    public String ukuran;
    public int harga;
    public String pembeli;
    public double pajak;

    public void info(){
        System.out.println("Nama Kopi: " + this.namaKopi);
        System.out.println("Ukuran: " + this.ukuran);
        System.out.println("Harga: " + this.harga);
    }
    public void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }

    public String getPembeli(){
        return this.pembeli;
    }

    public double getPajak(){
        this.pajak = (double)this.harga * 0.11;
        return this.pajak;
    }

}
