/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoantik.controller;

/**
 *
 * @author ASUS
 */
import com.mycompany.tokoantik.model.Barang;
import com.mycompany.tokoantik.model.BarangAntik;
import com.mycompany.tokoantik.model.BarangPerhiasan;
import java.util.ArrayList;

public class BarangController {
    private ArrayList<Barang> daftarBarang;
    private int nextId;

    public BarangController() {
        this.daftarBarang = new ArrayList<>();
        this.nextId = 1;
        isiDummyData();
    }

    private void isiDummyData() {
        tambahBarangAntik("Mangkuk Dinasti Ming", 18000000, 2, "Tiongkok", 1430);
        tambahBarangPerhiasan("Cincin Kecubung Antik", 7500000, 1, "Emas 18K", 12.5);
        tambahBarangAntik("Patung Singa Guennol", 32000000, 1, "Mesir", 1200);
    }

    public Barang tambahBarangAntik(String nama, double harga, int stok, String asal, int tahun) {
        BarangAntik b = new BarangAntik(nextId++, nama, harga, stok, asal, tahun);
        daftarBarang.add(b);
        return b;
    }

    public Barang tambahBarangPerhiasan(String nama, double harga, int stok, String material, double berat) {
        BarangPerhiasan b = new BarangPerhiasan(nextId++, nama, harga, stok, material, berat);
        daftarBarang.add(b);
        return b;
    }

    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public Barang cariBarangById(int id) {
        for (Barang b : daftarBarang) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public boolean hapusBarang(int id) {
        Barang b = cariBarangById(id);
        if (b != null) {
            return daftarBarang.remove(b);
        }
        return false;
    }
}
