package PRAK201_2010817210023_MuhammadAuliaAkbar;

public class Buah {
    private String nama;

    private double hargakasar;

    private double pembagianperkilo;

    private double jumlahbeliperkilo;

    private double harga;

    private double hargaseluruhsebelumdiskon;

    private double totaldiskon;

    private double hargaseluruhsetelahdiskon;




    Buah(String nama, double hargakasar, double pembagianperkilo, double jumlahbeliperkilo){
        this.nama = nama;
        this.hargakasar = hargakasar;
        this.pembagianperkilo = pembagianperkilo;
        this.jumlahbeliperkilo = jumlahbeliperkilo;
    }

    public String getNama() {
        return this.nama;
    }

    public double getHargakasar() {
        return this.hargakasar;
    }

    public double getPembagianperkilo() {
        return this.pembagianperkilo;
    }

    public double getJumlahbeliperkilo() {
        return this.jumlahbeliperkilo;
    }

    public double gethargaSebelumDiskon(){
        this.harga = this.hargakasar/this.pembagianperkilo;
        this.hargaseluruhsebelumdiskon = this.harga * this.jumlahbeliperkilo;
        return hargaseluruhsebelumdiskon;
    }

    public double gettotaldiskon(){
        double diskon = this.jumlahbeliperkilo / 4;
        double pembulatandiskon = Math.floor(diskon);
        this.totaldiskon = this.hargaseluruhsebelumdiskon * (2*pembulatandiskon)/100;
        return this.totaldiskon;
    }

    public double gethargaSetelahDiskon(){
        this.hargaseluruhsetelahdiskon = this.hargaseluruhsebelumdiskon - this.totaldiskon;
        return this.hargaseluruhsetelahdiskon;
    }

    public void display(){
        System.out.println("\nNama Buah : " + getNama());
        System.out.println("Berat: " + getPembagianperkilo());
        System.out.println("Harga : "+ getHargakasar());
        System.out.println("Jumlah Beli : " + getJumlahbeliperkilo());
        System.out.println("Harga Sebelum Diskon " + gethargaSebelumDiskon());
        System.out.println("Total Diskon : " + gettotaldiskon());
        System.out.println("Harga Setelah Diskon : " + gethargaSetelahDiskon());

    }
}
