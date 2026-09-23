# Dokumentasi Program Mini Project 2 PBO
## Sistem Manajemen Inventaris Toko Barang Antik (Monarch Antiqu'e)

---

### Informasi Mahasiswa
* **Nama** : Mikhel Febian
* **NIM** : 2509116056
* **Kelas** : B
* **Angkatan** : 2025
* **Mata Kuliah** : Pemrograman Berbasis Objek
* **Tema Program** : Sistem Penjualan dan Inventaris Barang Antik
* **Nama Sistem** : Monarch Antiqu'e System
* **Repository** : [Minpro-2-PBO-ManajemenTokoAntik](https://github.com/Mikhelfebian/Minpro-2-PBO-ManajemenTokoAntik/tree/main)

---

### 1. Deskripsi Singkat Program
Monarch Antiqu'e System adalah aplikasi pengelolaan inventaris barang antik berbasis *Command Line Interface* (CLI) yang dikembangkan menggunakan bahasa pemrograman Java. Program ini dirancang untuk memudahkan admin etalase toko dalam mengelola data koleksi barang antik dan perhiasan melalui operasi *Create, Read, Update, dan Delete* (CRUD).

Pada versi Mini Project 2 ini, arsitektur sistem telah disempurnakan dengan menerapkan prinsip-prinsip Pemrograman Berbasis Objek (*Object-Oriented Programming*) meliputi **Encapsulation**, **Inheritance**, **Polymorphism**, serta pemisahan struktur package berdasarkan pola arsitektur **Model-View-Controller (MVC)**.

---

### 2. Spesifikasi Lingkungan Pengembangan
* **Bahasa Pemrograman** : Java (JDK 17+)
* **Integrated Development Environment (IDE)** : Apache NetBeans
* **Struktur Data Memory** : `java.util.ArrayList`
* **Arsitektur Program** : Model-View-Controller (MVC)

---

### 3. Struktur Entitas dan Penerapan Inheritance

Sistem mengimplementasikan prinsip *Inheritance* (Pewarisan) dengan `Barang` sebagai *Superclass* serta `BarangAntik` dan `BarangPerhiasan` sebagai *Subclass*.

```text
               +-----------------------+
               |     class Barang      |
               |     (Superclass)      |
               +-----------------------+
                   /               \
                  /                 \
                 v                   v
    +-------------------+     +-----------------------+
    | class BarangAntik |     | class BarangPerhiasan |
    |   (Subclass 1)    |     |     (Subclass 2)      |
    +-------------------+     +-----------------------+
```

#### 3.1 Superclass: `Barang`
Menampung atribut dan perilaku umum yang dimiliki oleh seluruh entitas barang di toko.

| Modifikator Akses | Tipe Data | Nama Atribut | Deskripsi |
| :--- | :--- | :--- | :--- |
| `protected` | `int` | `id` | Identifikasi unik barang (*auto-increment*). |
| `protected` | `String` | `namaBarang` | Nama barang antik atau perhiasan. |
| `protected` | `double` | `harga` | Nominal harga barang dalam satuan Rupiah. |
| `protected` | `int` | `stok` | Ketersediaan jumlah unit barang. |

#### 3.2 Subclass 1: `BarangAntik` (Extends `Barang`)
Menampung data barang antik umum dengan atribut spesifik histori.

| Modifikator Akses | Tipe Data | Nama Atribut | Deskripsi |
| :--- | :--- | :--- | :--- |
| `private` | `String` | `asalNegara` | Negara asal ditemukannya objek antik. |
| `private` | `int` | `tahunPembuatan` | Tahun pembuatan atau estimasi usia barang. |

#### 3.3 Subclass 2: `BarangPerhiasan` (Extends `Barang`)
Menampung data barang koleksi perhiasan antik dengan atribut spesifik material fisik.

| Modifikator Akses | Tipe Data | Nama Atribut | Deskripsi |
| :--- | :--- | :--- | :--- |
| `private` | `String` | `material` | Jenis material pembuat perhiasan (Emas, Perak, dsb). |
| `private` | `double` | `beratGram` | Berat fisik perhiasan dalam satuan gram. |

---

### 4. Alur Kerja Sistem

```text
┌────────────────────────────────────────────────────────┐
│                   Start Program                        │
└──────────────────────────┬─────────────────────────────
                           │
                           v
┌────────────────────────────────────────────────────────┐
│        Load Pre-defined Dummy Data (ArrayList)         │
└──────────────────────────┬─────────────────────────────┘
                           │
                           v
┌────────────────────────────────────────────────────────┐
│                  Tampilkan Menu Utama                  │
│  1. Tambah  2. Tampilkan  3. Cari  4. Update           │
│  5. Hapus   6. Keluar                                  │
└──────────────────────────┬─────────────────────────────┘
                           │
                           v
┌────────────────────────────────────────────────────────┐
│              Input Pilihan Menu (Validator)            │
└──────────────────────────┬─────────────────────────────┘
                           │
      ┌────────────────────┼────────────────────┐
      │                    │                    │
      v                    v                    v
┌───────────┐        ┌───────────┐        ┌───────────┐
│ Fitur 1-5 │        │  Menu 6   │        │   Input   │
│ (Eksekusi)│        │ (Keluar)  │        │   Salah   │
└─────┬─────┘        └─────┬─────┘        └─────┬─────┘
      │                    │                    │
      v                    v                    │
 (Kembali ke           (Selesai)                │
 Menu Utama)                                    │
      ^                                         │
      └─────────────────────────────────────────┘
```
```mermaid
flowchart TD
    Start([Start Program]) --> LoadData[Load Pre-defined Dummy Data ArrayList]
    LoadData --> ShowMenu[\Tampilkan Menu Utama<br/>1. Tambah | 2. Tampilkan | 3. Cari<br/>4. Update | 5. Hapus | 6. Keluar/]
    ShowMenu --> InputMenu[/Input Pilihan Menu / Validator/]
    
    InputMenu --> CheckMenu{Pilihan Menu?}
    
    CheckMenu -->|Pilihan 1 - 5| ExecFitur[Eksekusi Fitur CRUD]
    ExecFitur --> ShowMenu
    
    CheckMenu -->|Pilihan 6| Selesai([Selesai / Exit Program])
    
    CheckMenu -->|Input Salah| ErrMsg[\Pesan Input Salah/]
    ErrMsg --> ShowMenu
```

1. **Inisialisasi Data (`Read Pre-loaded Data`)** :
   Sistem secara otomatis mengisikan beberapa data awal (*dummy data*) ke dalam `ArrayList` saat aplikasi dijalankan, sehingga fitur penampilan data langsung dapat diuji tanpa pengisian dari awal.
2. **Tambah Barang (`Menu 1`)** :
   Pengguna memilih tipe entitas yang ingin ditambahkan (`BarangAntik` atau `BarangPerhiasan`). Sistem meminta input detail sesuai tipe dengan disertai contoh format (*hint*).
3. **Tampilkan Semua Barang (`Menu 2`)** :
   Sistem menampilkan daftar barang dalam tabel terformat beserta detail atribut khusus dari masing-masing tipe kelas.
4. **Cari Barang Berdasarkan ID (`Menu 3`)** :
   Pengguna menginput ID barang. Sistem melakukan pencarian linier dan menampilkan entitas jika ditemukan.
5. **Update Barang (`Menu 4`)** :
   Sistem menampilkan data yang tersimpan berdasarkan ID, lalu menerima input pembaruan atribut umum dan atribut khusus subclass.
6. **Hapus Barang (`Menu 5`)** :
   Sistem meminta masukan ID barang yang akan dihapus, lalu meminta konfirmasi penghapusan (`y/n`) sebelum memuat operasi hapus.

---

### 5. Penjelasan Penerapan Prinsip PBO Wajib

#### 5.1 Encapsulation dan Access Modifier
* Seluruh variabel instans dikapsulasi ketat dengan modifikator `protected` pada *Superclass* dan `private` pada *Subclass*.
* Akses maupun pembacaan variabel dikendalikan melalui metode *Getter* dan *Setter*.
* Metode *Setter* dilengkapi dengan validasi data internal (misal: penolakan string kosong dan angka bernilai negatif dengan melempar `IllegalArgumentException`).

#### 5.2 Inheritance
* Implementasi hirarki dilakukan dengan membuat *Superclass* `Barang.java` yang diturunkan kepada dua *Subclass* yaitu `BarangAntik.java` dan `BarangPerhiasan.java`.
* *Subclass* menggunakan kata kunci `super` pada konstruktor untuk memanggil konstruktor dari *Superclass*.

#### 5.3 Validasi Input Usability
* Penanganan masukan pengguna terpusat pada kelas utilitas `Validator.java` untuk mengantisipasi *exception* masukan tipe data salah (seperti `NumberFormatException`).
* Setiap prompt instruksi inputan pada `MainView.java` dilengkapi dengan contoh format masukan (*hint*) untuk memperjelas ekspektasi masukan bagi pengguna.

---

### 6. Penjelasan Penerapan Nilai Tambah

#### 6.1 Arsitektur Model-View-Controller (MVC)
Kode program dipisahkan secara modular ke dalam struktur *package* terorganisir berikut:

```text
com.mycompany.tokoantik
├── model/
│   ├── Barang.java             (Superclass Entitas Utama)
│   ├── BarangAntik.java        (Subclass Entitas Barang Antik)
│   └── BarangPerhiasan.java    (Subclass Entitas Perhiasan)
├── controller/
│   └── BarangController.java   (Logika Bisnis, CRUD, & Pengelolaan ArrayList)
├── view/
│   └── MainView.java           (Interface CLI dan Alur Interaksi Pengguna)
├── util/
│   └── Validator.java          (Utility Pemrosesan dan Validasi Input)
└── Main.java                   (Kelas Utas Entry Point Utama)
```

#### 6.2 Polymorphism
* **Method Overriding** :
  Metode `getJenisBarang()` dan `toString()` dari kelas `Barang` di-*override* pada kelas `BarangAntik` dan `BarangPerhiasan`. Hal ini memungkinkan pencetakan tabel informasi barang secara dinamis menyesuaikan tipe objek pada run-time.
* **Method Overloading** :
  Kelas `BarangController` mengimplementasikan *method overloading* pada metode penambahan barang:
  - `tambahBarangAntik(String nama, double harga, int stok, String asal, int tahun)`
  - `tambahBarangPerhiasan(String nama, double harga, int stok, String material, double berat)`

---

### 7. Tangkapan Layar Eksekusi Program (Demo UI)

#### 7.1 Tampilan Menu Utama dan Read Data Bawaan
```text
===========================================
    TOKO BARANG ANTIK - MONARCH ANTIQU'E   
===========================================
1. Tambah Barang
2. Tampilkan Semua Barang
3. Cari Barang berdasarkan ID
4. Update Barang
5. Hapus Barang
6. Keluar
===========================================
Pilih menu (1-6) (Contoh: 1): 2

=== DAFTAR BARANG ANTIK & PERHIASAN ===
---------------------------------------------------------------------------------------------------------
ID   Nama Barang               Jenis           Harga             Stok   | Atribut Khusus      
---------------------------------------------------------------------------------------------------------
1    Mangkuk Dinasti Ming      Barang Antik    Rp18000000        2      | Asal: Tiongkok     | Tahun: 1430
2    Cincin Kecubung Antik     Perhiasan       Rp7500000         1      | Mat: Emas 18K      | Berat: 12.5 gram
3    Patung Singa Guennol      Barang Antik    Rp32000000        1      | Asal: Mesir        | Tahun: 1200
---------------------------------------------------------------------------------------------------------
```

#### 7.2 Tambah Data Baru dengan Petunjuk Format Input (UX Hint)
```text
=== TAMBAH BARANG ===
1. Barang Antik Umum
2. Barang Perhiasan
Pilih jenis barang (1-2) (Contoh: 1): 1
Nama barang (Contoh: Vas Bunga Bronze): Vas Bunga Bronze
Harga Rp (Contoh: 15000000): 12000000
Stok barang (Contoh: 2): 1
Asal Negara (Contoh: Yunani): Yunani
Tahun Pembuatan (Contoh: 1850): 1820
-> Data barang berhasil ditambahkan!
```

#### 7.3 Update Data Barang Spesifik Subclass
```text
=== UPDATE BARANG ===
Masukkan ID barang yang ingin diupdate (Contoh: 1): 1
Data saat ini: 1    Mangkuk Dinasti Ming      Barang Antik    Rp18000000        2      | Asal: Tiongkok     | Tahun: 1430
Nama barang baru (Contoh: Mangkuk Dinasti Ming): Mangkuk Dinasti Qing
Harga baru Rp (Contoh: 18000000.0): 20000000
Stok baru (Contoh: 2): 1
Asal negara baru (Contoh: Tiongkok): Tiongkok
Tahun pembuatan baru (Contoh: 1430): 1644
-> Barang berhasil diupdate.
```

#### 7.4 Hapus Data Barang
```text
=== HAPUS BARANG ===
Masukkan ID barang yang ingin dihapus (Contoh: 1): 2
Yakin ingin menghapus 'Cincin Kecubung Antik'? (y/n) (Contoh: y): y
-> Barang berhasil dihapus.
```
