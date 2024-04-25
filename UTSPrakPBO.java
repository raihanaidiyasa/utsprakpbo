abstract class Kendaraan {  // Kelas Interface atau Abstract
    public abstract void info();
    public abstract void kecepatan();
    public abstract void kecepatan(int kecepatan);
}

class Mobil {
    private String warna;   // Enkapsulasi
    private int jumlahRoda; // Enkapsulasi
    public Mobil (String warna, int jumlahRoda) {
        this.warna = warna;
        this.jumlahRoda = jumlahRoda;
    }
    public void info() {    // Override
        System.out.println("Mobil");
        System.out.println("Warna       : " + warna);
        System.out.println("Jumlah Roda : " + jumlahRoda);
    }
    public void kecepatan() {
        System.out.println("Mobil ini sangat cepat!");
    }
    public void kecepatan(int kecepatan) {
        System.out.println("Mobil ini melaju dengan kecepatan " + kecepatan + " km!");
    }
    public String getWarna() {  // Enkapsulasi
        return warna;
    }
    public int getJumlahRoda() {    // Enkapsulasi
        return jumlahRoda;
    }
}

class Toyota extends Mobil {
    public Toyota(String warna, int jumlahRoda) {
        super(warna, jumlahRoda);
    }
    private String merk = "Toyota";
    
    public void info() {    // Override
        System.out.println("Mobil");
        System.out.println("Warna       : " + getWarna());
        System.out.println("Jumlah Roda : " + getJumlahRoda());
        System.out.println("Merk        : " + merk);
    }
    public void kecepatan() {
        System.out.println("Mobil Toyota ini sangat cepat!"); // Overload
    }
    public void kecepatan(int kecepatan) {
        System.out.println("Mobil Toyota ini melaju dengan kecepatan " + kecepatan + " km!"); // Overload
    }
}

public class UTSPrakPBO {
    public static void main (String[] args) {
        Mobil myToyota = new Toyota("Hitam", 4);
        Mobil myMobil = new Mobil("Hijau", 4);

        myToyota.info();
        myToyota.kecepatan();
        myToyota.kecepatan(100);
        myMobil.info();
        myMobil.kecepatan();
        myMobil.kecepatan(50);
    }
}
