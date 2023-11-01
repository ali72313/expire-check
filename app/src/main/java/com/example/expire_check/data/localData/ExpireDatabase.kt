package com.example.expire_check.data.localData

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [ExpireItemEntity::class], version = 1)
abstract class ExpireDatabase : RoomDatabase() {

}