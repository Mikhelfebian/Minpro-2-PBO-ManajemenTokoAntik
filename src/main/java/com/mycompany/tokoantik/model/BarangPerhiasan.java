/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoantik.model;

/**
 *
 * @author ASUS
 */

public class BarangPerhiasan extends Barang {
    private String material;
    private double beratGram;

    public BarangPerhiasan(int id, String namaBarang, double harga, int stok, String material, double beratGram) {
        super(id, namaBarang, harga, stok);
        setMaterial(material);
        setBeratGram(beratGram);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("Material tidak boleh kosong");
        }
        this.material = material;
    }

    public double getBeratGram() {
        return beratGram;
    }

    public void setBeratGram(double beratGram) {
        if (beratGram <= 0) {
            throw new IllegalArgumentException("Berat harus lebih dari 0");
        }
        this.beratGram = beratGram;
    }

    @Override
    public String getJenisBarang() {
        return "Perhiasan";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Mat: %-13s | Berat: %.1f gram", material, beratGram);
    }
}