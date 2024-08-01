package com.tom.bmi_2024_0626.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Record::class), version = 1)
abstract class GameDatabase : RoomDatabase() {

    abstract fun recordDao():RecordDAO

}