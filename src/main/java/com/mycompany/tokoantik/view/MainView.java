/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoantik.view;

/**
 *
 * @author ASUS
 */

import com.mycompany.tokoantik.controller.BarangController;
import com.mycompany.tokoantik.model.Barang;
import com.mycompany.tokoantik.model.BarangAntik;
import com.mycompany.tokoantik.model.BarangPerhiasan;
import com.mycompany.tokoantik.util.Validator;

import java.util.Scanner;

public class MainView {
    private BarangController controller;
    private Scanner sc;

    public MainView() {
        controller = new BarangController();
        sc = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            tampilkanMenu();
            int pilihan = Validator.inputPilihanMenu(sc, "Pilih menu (1-6) (Contoh: 1): ", 1, 6);

            switch (pilihan) {
                case 1 -> tambahBarang();
                case 2 -> tampilkanSemuaBarang();
                case 3 -> cariBarang();
                case 4 -> updateBarang();
                case 5 -> hapusBarang();
                case 6 -> {
                    System.out.println("\nTerima kasih telah menggunakan Monarch Antiqu'e System!");
                    running = false;
                }
            }
            System.out.println();
        }
    }

    private void tampilkanMenu() {
        System.out.println("===========================================");
        System.out.println("    TOKO BARANG ANTIK - MONARCH ANTIQU'E   ");
        System.out.println("===========================================");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Tampilkan Semua Barang");
        System.out.println("3. Cari Barang berdasarkan ID");
        System.out.println("4. Update Barang");
        System.out.println("5. Hapus Barang");
        System.out.println("6. Keluar");
        System.out.println("===========================================");
    }

    private void tambahBarang() {
        System.out.println("\n=== TAMBAH BARANG ===");
        System.out.println("1. Barang Antik Umum");
        System.out.println("2. Barang Perhiasan");
        int jenis = Validator.inputPilihanMenu(sc, "Pilih jenis barang (1-2) (Contoh: 1): ", 1, 2);

        String nama = Validator.inputString(sc, "Nama barang (Contoh: Vas Bunga Bronze): ");
        double harga = Validator.inputDoubleMin(sc, "Harga Rp (Contoh: 15000000): ", 0);
        int stok = Validator.inputIntMin(sc, "Stok barang (Contoh: 2): ", 0);

        if (jenis == 1) {
            String asal = Validator.inputString(sc, "Asal Negara (Contoh: Yunani): ");
            int tahun = Validator.inputInt(sc, "Tahun Pembuatan (Contoh: 1850): ");
            controller.tambahBarangAntik(nama, harga, stok, asal, tahun);
        } else {
            String material = Validator.inputString(sc, "Material (Contoh: Emas / Perak / Berlian): ");
            double berat = Validator.inputDoubleMin(sc, "Berat dalam gram (Contoh: 10.5): ", 0.1);
            controller.tambahBarangPerhiasan(nama, harga, stok, material, berat);
        }
        System.out.println("-> Data barang berhasil ditambahkan!");
    }

    private void tampilkanSemuaBarang() {
        System.out.println("\n=== DAFTAR BARANG ANTIK & PERHIASAN ===");
        if (controller.getDaftarBarang().isEmpty()) {
            System.out.println("Belum ada data barang.");
            return;
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-4s %-25s %-15s %-17s %-6s | %-20s%n", "ID", "Nama Barang", "Jenis", "Harga", "Stok", "Atribut Khusus");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (Barang b : controller.getDaftarBarang()) {
            System.out.println(b);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }

    private void cariBarang() {
        System.out.println("\n=== CARI BARANG ===");
        int id = Validator.inputIntMin(sc, "Masukkan ID barang (Contoh: 1): ", 1);
        Barang b = controller.cariBarangById(id);
        if (b == null) {
            System.out.println("-> Barang dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("-> Barang Ditemukan:");
            System.out.println(b);
        }
    }

    private void updateBarang() {
        System.out.println("\n=== UPDATE BARANG ===");
        tampilkanSemuaBarang();
        int id = Validator.inputIntMin(sc, "Masukkan ID barang yang ingin diupdate (Contoh: 1): ", 1);
        Barang b = controller.cariBarangById(id);

        if (b == null) {
            System.out.println("-> Barang dengan ID " + id + " tidak ditemukan.");
            return;
        }

        System.out.println("Data saat ini: " + b);
        String nama = Validator.inputString(sc, "Nama barang baru (Contoh: " + b.getNamaBarang() + "): ");
        double harga = Validator.inputDoubleMin(sc, "Harga baru Rp (Contoh: " + b.getHarga() + "): ", 0);
        int stok = Validator.inputIntMin(sc, "Stok baru (Contoh: " + b.getStok() + "): ", 0);

        b.setNamaBarang(nama);
        b.setHarga(harga);
        b.setStok(stok);

        if (b instanceof BarangAntik barangAntik) {
            String asal = Validator.inputString(sc, "Asal negara baru (Contoh: " + barangAntik.getAsalNegara() + "): ");
            int tahun = Validator.inputInt(sc, "Tahun pembuatan baru (Contoh: " + barangAntik.getTahunPembuatan() + "): ");
            barangAntik.setAsalNegara(asal);
            barangAntik.setTahunPembuatan(tahun);
        } else if (b instanceof BarangPerhiasan barangPerhiasan) {
            String material = Validator.inputString(sc, "Material baru (Contoh: " + barangPerhiasan.getMaterial() + "): ");
            double berat = Validator.inputDoubleMin(sc, "Berat baru (gram) (Contoh: " + barangPerhiasan.getBeratGram() + "): ", 0.1);
            barangPerhiasan.setMaterial(material);
            barangPerhiasan.setBeratGram(berat);
        }

        System.out.println("-> Barang berhasil diupdate.");
    }

    private void hapusBarang() {
        System.out.println("\n=== HAPUS BARANG ===");
        tampilkanSemuaBarang();
        int id = Validator.inputIntMin(sc, "Masukkan ID barang yang ingin dihapus (Contoh: 1): ", 1);
        Barang b = controller.cariBarangById(id);

        if (b == null) {
            System.out.println("-> Barang dengan ID " + id + " tidak ditemukan.");
            return;
        }

        String konfirmasi = Validator.inputString(sc, "Yakin ingin menghapus '" + b.getNamaBarang() + "'? (y/n) (Contoh: y): ");
        if (konfirmasi.equalsIgnoreCase("y")) {
            controller.hapusBarang(id);
            System.out.println("-> Barang berhasil dihapus.");
        } else {
            System.out.println("-> Penghapusan dibatalkan.");
        }
    }
}