package com.horsege.ndkmultidirtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CMakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmake);

        ((TextView)findViewById(R.id.model4)).setText(new Model4().getModelName());

    }
}
