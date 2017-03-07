package com.deity.design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.HumanMessageAnnotation;
import com.example.MyAnnotation;

@MyAnnotation("Hello Annotation")
public class MainActivity extends AppCompatActivity {

    @Override
    @HumanMessageAnnotation(userName = "KEYTOP",getMyBrithday = "2017-3-8 00:00:00",getMyAge = 10)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
