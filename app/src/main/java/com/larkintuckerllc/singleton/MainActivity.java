package com.larkintuckerllc.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mDateTextView = findViewById(R.id.tvDate);
        MyExample myExample = MyExample.getInstance();
        mDateTextView.setText((new Date(myExample.getDate())).toString());
    }
}
