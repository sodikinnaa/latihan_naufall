package com.uti.latihannaufal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //deklarasi variabel
    EditText edtNilai1, edtNilai2, edtHasil;
    Button btnpersegip, btnsegitiga, btnlingkaran, btnpersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNilai1 = (EditText) findViewById(R.id.edtNilai1);
        edtNilai2 = (EditText) findViewById(R.id.edtNilai2);
        edtHasil = (EditText) findViewById(R.id.edtHasil);
        btnpersegip = (Button) findViewById(R.id.btnpersegip);
        btnsegitiga = (Button) findViewById(R.id.btnsegitiga);
        btnlingkaran = (Button) findViewById(R.id.btnlingkaran);
        btnpersegi = (Button) findViewById(R.id.btnpersegi);
        edtHasil.setFocusable(false);
        //      edtHasil.setBackgroundColor(Color.TRANSPARENT);
        edtHasil.setBackgroundColor(Color.parseColor("#FFCCCC"));
        edtHasil.setGravity(Gravity.RIGHT);
        //buat event
        btnpersegip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //jika salah satu komponen tidak terisi
                if (edtNilai1.getText().toString().isEmpty() || edtNilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nilai 1 dan Nilai 2 harus diisi woy!!!", Toast.LENGTH_SHORT).show();
                }
                //             jika seluruh komponen diisi
                else {
                    float nilai1, nilai2, hasil;
                    // input
                    nilai1 = Float.parseFloat(edtNilai1.getText().toString());
                    nilai2 = Float.parseFloat(edtNilai2.getText().toString());
                    //proses
                    hasil = nilai1 * nilai2;
                    //output
                    edtHasil.setText(Float.toString(hasil));


                }
            }
        });
        btnsegitiga.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //jika salah satu komponen tidak terisi
                if (edtNilai1.getText().toString().isEmpty() || edtNilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nilai 1 dan Nilai 2 harus diisi woy!!!", Toast.LENGTH_SHORT).show();
                }
                //             jika seluruh komponen diisi
                else {
                    float nilai1, nilai2, hasil;
                    // input
                    nilai1 = Float.parseFloat(edtNilai1.getText().toString());
                    nilai2 = Float.parseFloat(edtNilai2.getText().toString());
                    //proses
                    hasil =  (nilai1 * nilai2) / 2;
                    //output
                    edtHasil.setText(Float.toString(hasil));


                }
            }
        });
        btnlingkaran.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //jika salah satu komponen tidak terisi
                if (edtNilai1.getText().toString().isEmpty() || edtNilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nilai 1 dan Nilai 2 harus diisi woy!!!", Toast.LENGTH_SHORT).show();
                }
                //             jika seluruh komponen diisi
                else {
                    double nilai1, nilai2, hasil;
                    // input
                    nilai1 = Float.parseFloat(edtNilai1.getText().toString());
                    nilai2 = Float.parseFloat(edtNilai2.getText().toString());
                    //proses
                    hasil = 3.14 * nilai1 * nilai2 ;
                    //output
                    edtHasil.setText(String.valueOf(hasil));


                }
            }
        });
        btnpersegi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //jika salah satu komponen tidak terisi
                if (edtNilai1.getText().toString().isEmpty() || edtNilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nilai 1 dan Nilai 2 harus diisi woy!!!", Toast.LENGTH_SHORT).show();
                }
                //             jika seluruh komponen diisi
                else {
                    float nilai1, nilai2, hasil;
                    // input
                    nilai1 = Float.parseFloat(edtNilai1.getText().toString());
                    nilai2 = Float.parseFloat(edtNilai2.getText().toString());
                    //proses
                    hasil = nilai1 * nilai2;
                    //output
                    edtHasil.setText(Float.toString(hasil));


                }
            }
        });
        }
    }
