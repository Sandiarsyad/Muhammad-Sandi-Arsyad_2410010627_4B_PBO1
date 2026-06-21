package monitoringayam;

import java.util.InputMismatchException;
import java.util.Scanner;

// INTERFACE
interface Produktif {
    void tampilProduksi();
}

// ABSTRACT CLASS
abstract class Ayam {
    private String nama;
    private int umur;

    // Constructor
    public Ayam(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Accessor
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    // Abstract Method
    public abstract void suara();
}

// CLASS 1
class AyamPetelur extends Ayam implements Produktif {

    private int produksiTelur;

    public AyamPetelur(String nama, int umur, int produksiTelur) {
        super(nama, umur);
        this.produksiTelur = produksiTelur;
    }

    public int getProduksiTelur() {
        return produksiTelur;
    }

    public void setProduksiTelur(int produksiTelur) {
        if (produksiTelur >= 0) {
            this.produksiTelur = produksiTelur;
        }
    }

    @Override
    public void suara() {
        System.out.println("Ayam Petelur: Tek Tek Tek!");
    }

    @Override
    public void tampilProduksi() {
        System.out.println("Produksi Telur : " + produksiTelur + " butir");
    }
}

// CLASS 2
class AyamPedaging extends Ayam {

    private double berat;

    public AyamPedaging(String nama, int umur, double berat) {
        super(nama, umur);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        if (berat >= 0) {
            this.berat = berat;
        }
    }

    @Override
    public void suara() {
        System.out.println("Ayam Pedaging: Pok Pok Pok!");
    }
}

// CLASS 3
class Peternakan {

    public void tampilInfo(Ayam ayam) {
        System.out.println("Nama : " + ayam.getNama());
        System.out.println("Umur : " + ayam.getUmur() + " bulan");
        ayam.suara();
    }
}

// MAIN CLASS (CLASS 4)
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Masukkan jumlah ayam petelur: ");
            int jumlah = input.nextInt();
            input.nextLine();

            // ARRAY
            AyamPetelur[] daftarAyam = new AyamPetelur[jumlah];

            // PERULANGAN INPUT
            for (int i = 0; i < jumlah; i++) {

                System.out.println("\n=== Data Ayam Petelur Ke-" + (i + 1) + " ===");

                System.out.print("Nama Ayam : ");
                String nama = input.nextLine();

                System.out.print("Umur Ayam : ");
                int umur = input.nextInt();

                System.out.print("Produksi Telur : ");
                int produksi = input.nextInt();
                input.nextLine();

                // SELEKSI
                if (umur < 0 || produksi < 0) {
                    System.out.println("Data tidak valid, nilai diubah menjadi 0");
                    umur = 0;
                    produksi = 0;
                }

                // OBJECT
                daftarAyam[i] = new AyamPetelur(nama, umur, produksi);
            }

            System.out.println("\n==============================");
            System.out.println("DATA AYAM PETERNAKAN");
            System.out.println("==============================");

            // OBJECT PETERNAKAN
            Peternakan peternakan = new Peternakan();

            // PERULANGAN OUTPUT
            for (int i = 0; i < daftarAyam.length; i++) {

                System.out.println("\nAyam Ke-" + (i + 1));

                peternakan.tampilInfo(daftarAyam[i]);

                daftarAyam[i].tampilProduksi();
            }

            System.out.println("\n==============================");
            System.out.println("CONTOH POLYMORPHISM");
            System.out.println("==============================");

            // POLYMORPHISM
            Ayam ayam1 = new AyamPetelur("Layer Super", 12, 30);
            Ayam ayam2 = new AyamPedaging("Broiler Jumbo", 8, 2.5);

            ayam1.suara();
            ayam2.suara();

        } catch (InputMismatchException e) {

            // ERROR HANDLING
            System.out.println("Input harus berupa angka!");

        } catch (Exception e) {

            System.out.println("Terjadi kesalahan: " + e.getMessage());

        } finally {

            input.close();
            System.out.println("\nProgram selesai.");

        }
    }
}
```
