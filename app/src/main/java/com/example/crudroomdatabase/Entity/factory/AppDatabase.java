package com.example.crudroomdatabase.Entity.factory;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.crudroomdatabase.Entity.BarangDAO;
import com.example.crudroomdatabase.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}
