package com.tom.bmi_2024_0626.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RecordDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(record: Record)

    @Query("select * from Record")
    fun getAll(): List<Record>

}