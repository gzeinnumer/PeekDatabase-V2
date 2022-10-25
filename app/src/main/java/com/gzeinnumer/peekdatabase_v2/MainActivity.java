package com.gzeinnumer.peekdatabase_v2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.peekdatabase_v2.exampleSQLite.SqliteExampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSqlite = findViewById(R.id.btn_sqlite);
        btnSqlite.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), SqliteExampleActivity.class));
        });
    }
}