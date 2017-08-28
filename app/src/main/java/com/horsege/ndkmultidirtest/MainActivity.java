package com.horsege.ndkmultidirtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ndkBtn).setOnClickListener(this);
        findViewById(R.id.cmakeBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();

        switch (view.getId()) {
            case R.id.ndkBtn:
                intent.setClass(getBaseContext(), NDKActivity.class);
                break;
            case R.id.cmakeBtn:
                intent.setClass(getBaseContext(), CMakeActivity.class);
                break;
        }

        startActivity(intent);
    }
}
