package com.example.crudroomdatabase.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "tbarang")
public class Barang implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public int barangId;
    @ColumnInfo(name = "nama_barang")
    public String namaBarang;
    @ColumnInfo(name = "merk_barang")
    public String merkBarang;
    @ColumnInfo(name = "harga_barang")
    public String hargaBarang;
    public int getBarangId() {
        return barangId;
    }
    public void setBarangId(int barangId) {
        this.barangId = barangId;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public String getMerkBarang() {
        return merkBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public void setMerkBarang(String merkBarang) {
        this.merkBarang = merkBarang;
    }
    public String getHargaBarang() {
        return hargaBarang;
    }
    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
}
