package com.sanchez.sanchez_practicalexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    EditText commA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);

        commA = findViewById(R.id.commA);
    }

    public void Save(View v) {
        String result = "LIST OF ACTIVITIES: ";
        String comment = " ";
        if (c1.isChecked()) {
            result += "\n" + c1.getText().toString();
            result += "\n" + commA.getText().toString();
        }

        if (c2.isChecked()) {
            result += "\n" + c2.getText().toString();
            result += "\n" + commA.getText().toString();
        }
        if (c3.isChecked()) {
            result += "\n" + c3.getText().toString();
            result += "\n" + commA.getText().toString();
        }
        if (c4.isChecked()) {
            result += "\n" + c4.getText().toString();
            result += "\n" + commA.getText().toString();
        }
        if (c5.isChecked()) {
            result += "\n" + c5.getText().toString();
            result += "\n" + commA.getText().toString();
        }
        if (c6.isChecked()) {
            result += "\n" + c6.getText().toString();
            result += "\n" + commA.getText().toString();
        }
        if (c7.isChecked()) {
            result += "\n" + c7.getText().toString();
            result += "\n" + commA.getText().toString();
        }
        if (c8.isChecked()) {
            result += "\n" + c8.getText().toString();
            result += "\n" + commA.getText().toString();
        }

        FileOutputStream writer = null;
        try {
            writer = openFileOutput("activities.txt", MODE_PRIVATE);
            writer.write(result.getBytes());
        } catch (FileNotFoundException e) {
            Log.d("error", "File Not Found");
        } catch (IOException e) {
            Log.d("error", "IO Error");
        }
        FileOutputStream commB = null;
        try {
            commB = openFileOutput("comment.txt", MODE_PRIVATE);
            commB.write(comment.getBytes());
        } catch (FileNotFoundException e) {
            Log.d(
                    "ERROR", "FILE NOT FOUND");

        } catch (IOException e) {
            Log.d("ERROR", "IO ERROR");

        } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    Log.d("error", "File Not Found");
                }
            }
            Toast.makeText(this, "Data saved....", Toast.LENGTH_LONG).show();


        }
    public void Next (View v){
        Intent i = new Intent(this, List.class);
        startActivity(i);
    }
    }







