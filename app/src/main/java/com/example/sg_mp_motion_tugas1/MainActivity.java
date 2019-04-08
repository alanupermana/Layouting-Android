package com.example.sg_mp_motion_tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvPanjang;
    TextView tvPanjang2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvPanjang = findViewById(R.id.tvPanjang);
        String msg = "Android adalah sistem operasi berbasis Linux yang dirancang untuk perangkat bergerak layar sentuh seperti telepon pintar dan komputer tablet." +
                "<br><br>Lokasi kelas : <b>Kost Beverly Park</b><br>";

        tvPanjang.setText(Html.fromHtml(msg));


        TextView tvPanjang2 = findViewById(R.id.tvPanjang2);
        String msg2 = "Jumlah Peserta : <b> 3 Orang sudah terdaftar <b>";

        tvPanjang2.setText(Html.fromHtml(msg2));
    }
}
