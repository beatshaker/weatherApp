package com.SzymonKajdan.weatherapp.Database;


import com.raizlabs.android.dbflow.annotation.Database;

@Database(name=AppDatabase.NAME,version = AppDatabase.VERSION)
public class AppDatabase {
    public static  final String NAME="AppDataBase";
    public static final int VERSION=5;
}
