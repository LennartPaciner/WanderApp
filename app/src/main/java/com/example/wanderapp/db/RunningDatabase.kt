package com.example.wanderapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

//man braucht mindestens room version 2.3.0 im gradle sonst kompiliert es nicht!!
@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}