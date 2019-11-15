package com.example.crudroomdatabase.Entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.crudroomdatabase.model.Barang;

//import com.example.crudroomdatabase.Barang;
@Dao
public interface BarangDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertBarang(Barang barang);
    @Update
    int updateBarang(Barang barang);
    @Delete
    int deleteBarang(Barang barang);
    @Query("SELECT * FROM tbarang")
    Barang[] selectAllBarangs();
}
