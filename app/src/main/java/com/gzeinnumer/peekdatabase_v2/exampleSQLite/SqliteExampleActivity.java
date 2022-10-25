package com.gzeinnumer.peekdatabase_v2.exampleSQLite;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.pdb.helper.DialogTableBuilder;
import com.gzeinnumer.peekdatabase_v2.R;
import com.gzeinnumer.peekdatabase_v2.exampleSQLite.data.DBInstance;
import com.gzeinnumer.peekdatabase_v2.exampleSQLite.entity.Table1;


public class SqliteExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_example);

        ((TextView) findViewById(R.id.tv)).setText("" +
                "1. Make database instance to SQLITE\n" +
                "2. Make some table\n" +
                "3. Input some data\n" +
                "4. Click FloatActionButton <>\n" +
                "5. Easy debug");

        setTitle("Sqlite");

        SQLiteDatabase sqLiteDatabase = DBInstance.getDataBase(getApplicationContext());

        Button btnInsert = findViewById(R.id.btn_insert);
        btnInsert.setOnClickListener(view -> {
            Table1 table1 = new Table1(sqLiteDatabase);
            table1.insert();
        });

        Button fo1 = findViewById(R.id.fo_1);
        fo1.setOnClickListener(view -> {
            DialogTableBuilder
                    .newInstanse(this, sqLiteDatabase)
                    .build();
        });

        Button fo2 = findViewById(R.id.fo_2);
        fo2.setOnClickListener(view -> {
            DialogTableBuilder
                    .newInstanse(this, sqLiteDatabase)
                    .addTable("table1")
                    .build();
        });
    }
}