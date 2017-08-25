package com.horsege.ndkmultidirtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.model1)).setText(new Model1().getModelName());
        ((TextView)findViewById(R.id.model2)).setText(new Model2().getModelName());
    }
}
