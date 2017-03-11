package com.tyqtest.teststudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test=(TextView) findViewById(R.id.test1);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test.setText("good morning!!");
            }
        });

    }
}
