package com.ziadsyahrul.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Membuat variable global
    TextView txtJdl;
    Button btnStart;
    EditText edtText;
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;

    //membuat variable global untuk menghitung luas
    Integer panjang,lebar,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisiasi widget ke dalam variable java agar dapat digunakan
        txtJdl = findViewById(R.id.txtJudul);
        edtText = findViewById(R.id.edtText);
        btnStart = findViewById(R.id.btnStart);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hitung();
            }
        });
    }

    public void hitung(){
        //memasukkan input nama dari user ke dalam variable
        String isiEditTxt = edtText.getText().toString();

        //memasukkan input panjang dan lebar dari user ke dalam variable
        panjang = Integer.valueOf(edtPanjang.getText().toString());
        lebar = Integer.valueOf(edtLebar.getText().toString());

        //menghitung luas persegi panjang = P * L
        hasil = panjang * lebar;

        //cetak hasil
        txtHasil.setText("Hello " + isiEditTxt + ",  Hasilnya adalah :" + hasil);
    }
}
