package com.example.mon3hom41;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class descriptionActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        imageView = findViewById(R.id.img);
        textView = findViewById(R.id.desc);
        Intent intent = getIntent();
        imageView.setImageResource(((Intent) intent).getIntExtra("image",0));
        textView.setText(intent.getStringExtra("desc"));

    }


}