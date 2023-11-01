package com.example.expire_check.data.localData

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class ExpireItemEntity(
    val icon: Int,
    val title: String,
    val startDay: String,
    val expireDay: String,
    val totalDays: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
