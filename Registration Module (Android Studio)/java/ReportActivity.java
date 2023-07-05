package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Criminal Background");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        ImageView imPictureReceiver = findViewById(R.id.imPictureReceiver);
//        Bundle i = getIntent().getExtras();
//        byte[] byteArray = i.getByteArray("imageArray");
//        Bitmap photo = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
//        imPictureReceiver.setImageBitmap(photo);

        Intent mess = getIntent();
        String mensahe = mess.getStringExtra("message");
        TextView txt = findViewById(R.id.textView10);
        txt.setText(mensahe);

        TextView dispLastName = findViewById(R.id.dispLname);
        Intent report = getIntent();
        String output = report.getStringExtra("huliName");

        dispLastName.setText("Last Name: " + output);
    }
}
