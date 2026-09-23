- Nama: Mikhel Febian
- NIM: 2509116056
- Kelas: B
- Angkatan: 2025
- Mata Kuliah: Pemrograman Berbasis Objek
- Tema: Sistem Penjualan Barang Antik
- Nama Sistem: Monarch Antiqu'e

# **1. Latar Belakang Program**


Monarch Antiqu'e adalah sebuah sistem atau aplikasi yang berfungsi untuk mempermudah proses dalam membeli barang antik. Aplikasi ini juga sangat berguna bagi para kolektor barang antik yang memiliki keterbatasan untuk bisa langsung datang ke toko Monarch Antiqu'e dan membeli barang yang tersedia, dengan berbagai fitur yang tersedia namun untuk sekarang pada proyek ini di khusus kan hanya untuk menu admin yang dimana aplikasi ini memiliki sistem CRUD yang berfungsi untuk mengelola data yang ada pada etalase online toko.

# **2. Deskripsi Program**

## Tools dan environment
- Bahasa: JAVA
- IDE: Apache NetBeans
- Database: Static Menggunakan struktur data ArrayList

## Entitas
- Barang

## Atribut
| Tipe Data | Nama Atribut |  Fungsi  |
|---|---|---|
| int | id | Untuk menyimpan kode unik dari barang untuk menghindari resiko duplikasi |
| string | namaBarang | Untuk menyimpan nama barang |
| string | kategori | Untuk menyimpan jenis kategori dari barang dan mempermudah pengelompokan |
| double | harga | untuk menyimpan harga dari barang |
| int | stok | untuk menenetukan jumlah yang tersedia dari stok barang |

# 3. Alur Program
## FLowchart
  
  <img width="1867" height="1373" alt="ini flowchart pebeo drawio" src="https://github.com/user-attachments/assets/46c60d6c-b779-4a0c-ae09-de1256c70584" />

## Penjelasan
### 1. Tambah Barang (`Menu 1`)
- Pengguna memasukkan detail barang baru meliputi **Nama**, **Kategori**, **Harga**, dan **Stok**.
- Sistem akan secara otomatis menggenerasi **ID unik** untuk barang tersebut.
- Data tersimpan dan sistem menampilkan konfirmasi keberhasilan beserta ID baru.

### 2. Tampilkan Semua Barang (`Menu 2`)
- Menampilkan seluruh daftar barang antik yang ada dalam sistem ke dalam bentuk tabel rapi.
- Informasi yang ditampilkan mencakup: `ID`, `Nama Barang`, `Kategori`, `Harga (Rp)`, dan `Stok`.

### 3. Cari Barang berdasarkan ID (`Menu 3`)
- Pengguna diminta memasukkan `ID` barang yang ingin dicari.
- Jika data ditemukan, sistem akan menampilkan detail spesifik dari barang tersebut.

### 4. Update Barang (`Menu 4`)
- Pengguna dapat memperbarui data barang yang sudah tersimpan dengan memasukkan `ID` barang terlebih dahulu.
- Pengguna kemudian memasukkan data terbaru (nama, kategori, harga, atau stok).

### 5. Hapus Barang (`Menu 5`)
- Menampilkan seluruh daftar barang terlebih dahulu agar pengguna bisa melihat ID yang ingin dihapus.
- Setelah pengguna memasukkan ID, sistem akan meminta konfirmasi ulang (`y/n`).
- Jika pengguna mengonfirmasi (`y`), data barang akan dihapus permanen dari sistem.

### 6. Keluar (`Menu 6`)
- Menghentikan perulangan program dan menampilkan pesan penutup/terima kasih.

## Demo Program
### 1. Menu Utama
<img width="478" height="263" alt="image" src="https://github.com/user-attachments/assets/5741728b-6354-4a01-a3c3-959e67d703bc" />

Tampilan tersebut merupakan halaman menu utama dari aplikasi Toko Barang Antik. Pada tampilan ini, sistem menyajikan 6 pilihan fitur yang dapat digunakan. Angka 1 yang di ketik di baris paling bawah menandakan bahwa kita baru saja memilih Menu 1 (Tambah Barang) untuk memasukkan data barang baru ke dalam sistem.

### 2. Tambah Barang (`Menu 1`)
<img width="491" height="413" alt="image" src="https://github.com/user-attachments/assets/29dd25ae-024a-4783-9d17-bfae8a904df8" />

Gambar diatas menampilkan proses penambahan data barang baru pada sistem Toko Barang Antik Monarch Antiqu'e. Pengguna memilih Menu 1 (Tambah Barang), lalu menginput detail barang berupa nama, kategori, harga, dan jumlah stok. Setelah data diisi, sistem secara otomatis menyimpan barang tersebut dan memberikan ID 4 sebagai identitas uniknya.

### 3. Tampilkan Semua Barang (`Menu 2`)
<img width="745" height="467" alt="image" src="https://github.com/user-attachments/assets/b5184c7c-4f1f-49c2-9439-714e85c66658" />

Gambar diatas menampilkan proses menampilkan seluruh daftar barang pada sistem Toko Barang Antik Monarch Antiqu'e. Pengguna memilih Menu 2 (Tampilkan Semua Barang), lalu sistem secara otomatis menampilkan tabel berisi seluruh data barang yang tersimpan beserta informasi ID, nama barang, kategori, harga, dan jumlah stoknya.

### 4. Cari Barang berdasarkan ID (`Menu 3`)
<img width="743" height="365" alt="image" src="https://github.com/user-attachments/assets/a27b7851-1312-44f9-9192-8be4351e6925" />

Gambar diatas menampilkan proses pencarian data barang berdasarkan ID pada sistem Toko Barang Antik Monarch Antiqu'e. Pengguna memilih Menu 3 (Cari Barang berdasarkan ID), lalu menginput ID barang yang ingin dicari (yaitu ID 4). Setelah ID dimasukkan, sistem secara otomatis mencari dan menampilkan detail spesifik dari barang tersebut.

### 5. Update Barang (`Menu 4`)
<img width="841" height="380" alt="image" src="https://github.com/user-attachments/assets/09afe693-c811-42be-953f-d618f5ece8bf" />

Gambar diatas menampilkan proses pembaruan (update) data barang pada sistem Toko Barang Antik Monarch Antiqu'e. Pengguna memilih Menu 4 (Update Barang), lalu menginput ID barang yang ingin diperbarui (yaitu ID 1). Setelah menampilkan data saat ini, sistem meminta input data baru berupa nama, kategori, harga, dan stok. Terdapat pula validasi input agar tidak boleh kosong, dan setelah seluruh data baru diisi, sistem secara otomatis memperbarui informasi barang tersebut.

### 6. Hapus Barang (`Menu 5`)
<img width="728" height="506" alt="image" src="https://github.com/user-attachments/assets/7e13e67c-7302-40ac-a1a7-30890e920621" />

Gambar diatas menampilkan proses penghapusan data barang pada sistem Toko Barang Antik Monarch Antiqu'e. Pengguna memilih Menu 5 (Hapus Barang), lalu menginput ID barang yang ingin dihapus (yaitu ID 1). Sebelum data dihapus, sistem meminta konfirmasi ulang (y/n). Setelah pengguna mengonfirmasi dengan mengetik y, sistem secara otomatis menghapus barang tersebut secara permanen.

### 7. Keluar (`Menu 6`)
<img width="486" height="281" alt="image" src="https://github.com/user-attachments/assets/5c303b4d-3d6b-4d9b-bef9-0471efea55d4" />

Gambar diatas menampilkan proses keluar dari aplikasi pada sistem Toko Barang Antik Monarch Antiqu'e. Pengguna memilih Menu 6 (Keluar), lalu sistem secara otomatis menghentikan perulangan program dan menampilkan pesan penutup/terima kasih.

## Nilai tambah 🤤
### 1. Access Modifier
<img width="436" height="191" alt="image" src="https://github.com/user-attachments/assets/2f5d4020-731b-4218-a4c6-8d7ae65de093" />


Gambar diatas menampilkan penerapan konsep Encapsulation dan penggunaan Access Modifier pada kelas Barang di sistem Toko Barang Antik Monarch Antiqu'e. Saya menggunakan access modifier private pada atribut id, namaBarang, kategori, harga, dan stok. Hal ini bertujuan untuk menyembunyikan data (data hiding) agar informasi barang tersebut tidak bisa diakses atau diubah secara langsung dari luar kelas tanpa melalui prosedur yang aman.

### 2. Encapsulation
<img width="992" height="187" alt="image" src="https://github.com/user-attachments/assets/133dfe25-c3ac-4558-b81e-db02f736cffa" />

Gambar diatas menampilkan penerapan Validasi Input dan Encapsulation pada metode setter setNamaBarang di sistem Toko Barang Antik Monarch Antiqu'e. Saya menggunakan pengecekan kondisi untuk memastikan bahwa nilai nama barang yang dimasukkan tidak bernilai kosong (null) atau hanya berisi spasi (isEmpty()). Jika input tidak valid, sistem secara otomatis melempar pengecualian (IllegalArgumentException), dan jika valid, nilai baru akan disimpan ke dalam atribut namaBarang.

### 3. validasi input
<img width="687" height="267" alt="image" src="https://github.com/user-attachments/assets/141469b5-d053-4507-86b7-11cd14254b8c" />

Gambar diatas menampilkan penerapan Validasi Input pada metode inputString di sistem Toko Barang Antik Monarch Antiqu'e. Saya menggunakan perulangan while (true) untuk memastikan masukan teks dari pengguna tidak kosong (isEmpty()). Jika pengguna memasukkan teks kosong atau hanya berisi spasi, sistem menampilkan pesan peringatan dan meminta input ulang hingga diperoleh masukan teks yang valid untuk dikembalikan oleh fungsi.
