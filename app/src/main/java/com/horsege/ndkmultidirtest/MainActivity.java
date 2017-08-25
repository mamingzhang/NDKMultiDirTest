package com.horsege.ndkmultidirtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.model1)).setText(new Model1().getModelName());
        ((TextView)findViewById(R.id.model2)).setText(new Model2().getModelName());

        findViewById(R.id.model3).setVisibility(View.GONE);

        findViewById(R.id.opBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        findViewById(R.id.model3).setVisibility(View.VISIBLE);
        ((TextView)findViewById(R.id.model3)).setText(new Model3().getModelName());
    }
}
