
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi sistem monitoring peternakan ayam menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

---

## Deskripsi

Aplikasi ini digunakan untuk mengelola data operasional pada sebuah peternakan ayam, pengguna dapat melihat daftar kandang, mencari informasi kandang berdasarkan kapasitas, memperbarui status stok pakan, serta keluar dari program.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

---

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

### 1. Class
Class adalah template atau blueprint dari object. Pada kode ini, `Peternakan`, `Kandang`, `Ayam`, dan `main` adalah contoh dari class.
```java
public class Peternakan {
    ...
}

public class Kandang extends Peternakan {
    ...
}

public class Ayam {
    ...
}

public class main {
    ...
}

```
### 2. Object
Object adalah instance dari class. Berikut adalah contoh pembuatan object.
```java
Ayam ayam = new Ayam();

private Kandang[] daftarKandang = {
    new Kandang(1, "Kandang A", 500, true),
    new Kandang(2, "Kandang B", 500, true),
    new Kandang(3, "Kandang C", 400, false),
    new Kandang(4, "Kandang D", 600, true)
};

```
### 3. Atribut
Atribut adalah variabel yang ada dalam class.
```java
int idKandang;
private String namaKandang;
private int kapasitas;
private boolean aktif;

```
### 4. Constructor
Constructor adalah method yang pertama kali dijalankan pada saat pembuatan object.
```java
public Peternakan(int idKandang, String namaKandang, int kapasitas) {
    this.idKandang = idKandang;
    this.namaKandang = namaKandang;
    this.kapasitas = kapasitas;
}

public Kandang(int idKandang, String namaKandang, int kapasitas, boolean aktif) {
    super(idKandang, namaKandang, kapasitas);
    this.aktif = aktif;
}

```
### 5. Mutator
Mutator atau setter digunakan untuk mengubah nilai dari suatu atribut.
```java
public void setKapasitas(int kapasitas) {
    this.kapasitas = kapasitas;
}

public void setAktif(boolean aktif) {
    this.aktif = aktif;
}

```
### 6. Accessor
Accessor atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getIdKandang, getNamaKandang, getKapasitas, adalah contoh method accessor.
```java
public int getIdKandang() {
    return idKandang;
}

public String getNamaKandang() {
    return namaKandang;
}

public int getKapasitas() {
    return kapasitas;
}

public boolean isAktif() {
    return aktif;
}

```
### 7. Encapsulation
Encapsulation adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Atribut dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.
```java
private String namaKandang;
private int kapasitas;
private boolean aktif;

```
### 8. Inheritance
Inheritance adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, Kandang mewarisi Peternakan dengan sintaks extends.
```java
public class Kandang extends Peternakan {
    ...
}

```
### 9. Polymorphism
Polymorphism adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Polymorphism bisa berbentuk Overloading ataupun Overriding.
```java
public void tampilkanInfo() {
    System.out.println("ID Kandang  : " + idKandang);
    System.out.println("Nama        : " + namaKandang);
    System.out.println("Kapasitas   : " + kapasitas + " ekor");
}

@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Status      : " + (aktif ? "Aktif Beroperasi" : "Kosong/Sterilisasi"));
    System.out.println("-----------------------------------");
}

```
### 10. Seleksi
Seleksi adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dan seleksi switch dalam method.
```java
if (kandang == null) {
    System.out.println("Kandang tidak ditemukan.");
} else if (!kandang.isAktif()) {
    System.out.println("Maaf, kandang sedang dinonaktifkan.");
} else {
    kandang.setAktif(false);
}

switch (pilihan) {
    case 1:
        ayam.tampilkanDaftarKandang();
        break;
    case 2:
        break;
    case 3:
        break;
    case 4:
        break;
    default:
        System.out.println("Pilihan tidak tersedia.");
}

```
### 11. Perulangan
Perulangan adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.
```java
for (Kandang kandang : daftarKandang) {
    kandang.tampilkanInfo();
}

do {
    ...
} while (pilihan != 4);

```
### 12. Input Output Sederhana
Input Output Sederhana digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.
```java
Scanner input = new Scanner(System.in);

System.out.print("Pilih Menu : ");
pilihan = input.nextInt();

```
### 13. Array
Array adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Berikut adalah contoh penggunaan array.
```java
System.out.println("Sistem Monitoring Ayam Berkelanjutan");
private Kandang[] daftarKandang = {
    new Kandang(1, "Kandang A", 500, true),
    new Kandang(2, "Kandang B", 500, true),
    new Kandang(3, "Kandang C", 400, false),
    new Kandang(4, "Kandang D", 600, true)
};

```
### 14. Error Handling
Error Handling digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.
```java
try {
    System.out.print("Pilih Menu : ");
    pilihan = input.nextInt();
} catch (Exception e) {
    System.out.println("Input harus berupa angka!");
    input.nextLine();
}

```
## Usulan Nilai
| No | Materi | Nilai |
|---|---|---|
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Atribut | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | IO Sederhana | 10 |
| 13 | Array | 15 |
| 14 | Error Handling | 15 |
| **TOTAL** |  | **100** |
## Pembuat
Nama : Muhammad Sandi Arsyad
NPM : 2410010627
Kelas : 4B PBO1
```
