/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoantik.model;

/**
 *
 * @author ASUS
 */

public class BarangAntik extends Barang {
    private String asalNegara;
    private int tahunPembuatan;

    public BarangAntik(int id, String namaBarang, double harga, int stok, String asalNegara, int tahunPembuatan) {
        super(id, namaBarang, harga, stok);
        setAsalNegara(asalNegara);
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    public void setAsalNegara(String asalNegara) {
        if (asalNegara == null || asalNegara.trim().isEmpty()) {
            throw new IllegalArgumentException("Asal negara tidak boleh kosong");
        }
        this.asalNegara = asalNegara;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    @Override
    public String getJenisBarang() {
        return "Barang Antik";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Asal: %-12s | Tahun: %-4d", asalNegara, tahunPembuatan);
    }
}
