package PRAK203_2010817210023_MuhammadAuliaAkbar;

public class Pegawai {
    public String nama;
//    public char asal; // Asal Harus Menggunakan String
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //public void setJabatan() //kurang String j pada argument
    public void setJabatan(String j){
        this.jabatan = j;
    }

}
