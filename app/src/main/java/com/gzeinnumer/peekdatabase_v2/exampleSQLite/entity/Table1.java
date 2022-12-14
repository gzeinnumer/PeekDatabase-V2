package com.gzeinnumer.peekdatabase_v2.exampleSQLite.entity;

import android.database.sqlite.SQLiteDatabase;

import com.gzeinnumer.esc.SQLiteLIB;
import com.gzeinnumer.esc.struck.SQLiteTable;
import com.gzeinnumer.esc.typeData.DecimalTypeData;
import com.gzeinnumer.esc.typeData.IntegerTypeData;
import com.gzeinnumer.esc.typeData.PrimaryKeyTypeData;
import com.gzeinnumer.esc.typeData.TextTypeData;
import com.gzeinnumer.esc.typeData.TimeStampTypeData;
import com.gzeinnumer.esc.typeData.VarcharTypeData;
import com.gzeinnumer.sb.struct.CreateTableQuery;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.Random;

@CreateTableQuery(
        query = "CREATE TABLE table1 (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, rating REAL, desc TEXT, flag_active INTEGER, created_at TEXT)"
)
@SQLiteTable(tableName = "table1")
public class Table1 extends SQLiteLIB<Table1> {

    @PrimaryKeyTypeData
    private int id;
    @VarcharTypeData
    private String name;
    @DecimalTypeData
    private double rating;
    @TextTypeData
    private String desc;
    @IntegerTypeData
    private int flag_active;
    @TimeStampTypeData
    private String created_at;

    private SQLiteDatabase sqLiteDatabase;

    public Table1() {
    }

    public Table1(SQLiteDatabase sqLiteDatabase) {
        this.sqLiteDatabase = sqLiteDatabase;
    }

    public boolean insert() {
        Table1 data = new Table1();
        data.setName(genString(5));
        data.setRating(genInteger(1, 10000));
        data.setDesc(genString(10));
        data.setFlag_active(1);
        data.setCreated_at("12-12-2020");

        return insertData(Table1.class, sqLiteDatabase, data);
    }

    public String genString(int length){
        byte[] array = new byte[length]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    public static int genInteger(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public int queryCount() {
        String query = "SELECT COUNT(id) FROM table1;";
        return queryCount(Table1.class, sqLiteDatabase, query);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getFlag_active() {
        return flag_active;
    }

    public void setFlag_active(int flag_active) {
        this.flag_active = flag_active;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
