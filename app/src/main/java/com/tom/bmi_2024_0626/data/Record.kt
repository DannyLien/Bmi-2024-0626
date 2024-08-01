package com.tom.bmi_2024_0626.data

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
class Record(
    @ColumnInfo
    var nickname: String, var counter: Int) {
}