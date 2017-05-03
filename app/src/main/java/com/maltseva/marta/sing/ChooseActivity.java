package com.maltseva.marta.sing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.maltseva.marta.sing.R.id.basic_btn;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener {
    Button basic;
    Button medium;
    Button advanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        initButtons();
        setListeners();
    }

    private void initButtons() {
        basic = (Button) findViewById(basic_btn);
        medium = (Button) findViewById(R.id.medium_btn);
        advanced = (Button) findViewById(R.id.adv_btn);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ChooseActivity.this, PlayActivity.class);
        startActivity(intent);
    }

    public void setListeners() {
        basic.setOnClickListener(this);
        medium.setOnClickListener(this);
        advanced.setOnClickListener(this);
    }
}