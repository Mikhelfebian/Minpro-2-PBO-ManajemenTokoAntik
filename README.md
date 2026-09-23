1. **Inisialisasi Data Awal (Read Pre-loaded Data)**: Program memuat *dummy data* awal secara otomatis saat dijalankan.
2. **Tambah Barang (`Menu 1`)**: Admin memilih kategori barang (`BarangAntik` / `BarangPerhiasan`) lalu mengisikan detail dengan panduan petunjuk format (*hint example*).
3. **Tampilkan Semua Barang (`Menu 2`)**: Menampilkan daftar barang lengkap beserta atribut spesifik subclass dalam bentuk tabel terformat.
4. **Cari Barang berdasarkan ID (`Menu 3`)**: Mencari dan menampilkan informasi detail satu barang berdasarkan ID uniknya.
5. **Update Barang (`Menu 4`)**: Memperbarui atribut umum dan atribut khusus barang berdasarkan ID yang dipilih.
6. **Hapus Barang (`Menu 5`)**: Menghapus data barang berdasarkan ID setelah melalui konfirmasi pengguna (`y/n`).
7. **Keluar (`Menu 6`)**: Menghentikan perulangan aplikasi.

---

## 🔐 5. Penjelasan Ketentuan Wajib PBO

### 5.1 Access Modifier & Encapsulation
Seluruh atribut dikapsulasi menggunakan modifikator `protected` pada superclass dan `private` pada subclass. Pembacaan dan pengubahan data dikontrol secara ketat melalui metode *Getter* dan *Setter* yang terintegrasi dengan validasi nilai.

### 5.2 Inheritance (Pewarisan)
Penerapan *Inheritance* dilakukan dengan membuat hirarki kelas:
* **Superclass**: `Barang.java`
* **Subclass**: `BarangAntik.java` dan `BarangPerhiasan.java` yang mewarisi sifat dasar `Barang`.

### 5.3 Validasi Input
Mencegah *error runtime* (misal: `NumberFormatException`) dan pengisian data kosong menggunakan utilitas khusus `Validator.java`. Seluruh instruksi input dilengkapi *hint* petunjuk format.

---

## ⭐ 6. Penjelasan Nilai Tambah

### 6.1 Arsitektur Model-View-Controller (MVC)
Kode program dipisahkan ke dalam beberapa package terstruktur:

```text
com.mycompany.tokoantik
├── model/
│   ├── Barang.java             <-- Superclass Entity
│   ├── BarangAntik.java        <-- Subclass 1
│   └── BarangPerhiasan.java    <-- Subclass 2
├── controller/
│   └── BarangController.java   <-- Logika Bisnis & Pengelolaan ArrayList
├── view/
│   └── MainView.java           <-- Interface CLI & Menampilkan Output

1. **Inisialisasi Data Awal (Read Pre-loaded Data)**: Program memuat *dummy data* awal secara otomatis saat dijalankan.
2. **Tambah Barang (`Menu 1`)**: Admin memilih kategori barang (`BarangAntik` / `BarangPerhiasan`) lalu mengisikan detail dengan panduan petunjuk format (*hint example*).
3. **Tampilkan Semua Barang (`Menu 2`)**: Menampilkan daftar barang lengkap beserta atribut spesifik subclass dalam bentuk tabel terformat.
4. **Cari Barang berdasarkan ID (`Menu 3`)**: Mencari dan menampilkan informasi detail satu barang berdasarkan ID uniknya.
5. **Update Barang (`Menu 4`)**: Memperbarui atribut umum dan atribut khusus barang berdasarkan ID yang dipilih.
6. **Hapus Barang (`Menu 5`)**: Menghapus data barang berdasarkan ID setelah melalui konfirmasi pengguna (`y/n`).
7. **Keluar (`Menu 6`)**: Menghentikan perulangan aplikasi.

---

## 🔐 5. Penjelasan Ketentuan Wajib PBO

### 5.1 Access Modifier & Encapsulation
Seluruh atribut dikapsulasi menggunakan modifikator `protected` pada superclass dan `private` pada subclass. Pembacaan dan pengubahan data dikontrol secara ketat melalui metode *Getter* dan *Setter* yang terintegrasi dengan validasi nilai.

### 5.2 Inheritance (Pewarisan)
Penerapan *Inheritance* dilakukan dengan membuat hirarki kelas:
* **Superclass**: `Barang.java`
* **Subclass**: `BarangAntik.java` dan `BarangPerhiasan.java` yang mewarisi sifat dasar `Barang`.

### 5.3 Validasi Input
Mencegah *error runtime* (misal: `NumberFormatException`) dan pengisian data kosong menggunakan utilitas khusus `Validator.java`. Seluruh instruksi input dilengkapi *hint* petunjuk format.

---

## ⭐ 6. Penjelasan Nilai Tambah

### 6.1 Arsitektur Model-View-Controller (MVC)
Kode program dipisahkan ke dalam beberapa package terstruktur:

```text
com.mycompany.tokoantik
├── model/
│   ├── Barang.java             <-- Superclass Entity
│   ├── BarangAntik.java        <-- Subclass 1
│   └── BarangPerhiasan.java    <-- Subclass 2
├── controller/
│   └── BarangController.java   <-- Logika Bisnis & Pengelolaan ArrayList
├── view/
│   └── MainView.java           <-- Interface CLI & Menampilkan Output
├── util/
│   └── Validator.java          <-- Utility Validasi Inputan
└── Main.java                   <-- Entry Point Aplikasi Utama
├── util/
│   └── Validator.java          <-- Utility Validasi Inputan
└── Main.java                   <-- Entry Point Aplikasi Utama
