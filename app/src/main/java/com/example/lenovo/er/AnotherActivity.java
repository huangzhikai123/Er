package com.example.lenovo.er;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
TextView h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        h = (TextView) findViewById(R.id.text3);
        Intent intent = getIntent();
        String a= intent.getStringExtra("input");
        h.setText(a);
        Button button=(Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText tv =(EditText) findViewById(R.id.textView5);
                String Tv = tv.getText().toString();
                Intent intent = new Intent(AnotherActivity.this,MainActivity.class);
                intent.putExtra("input1",Tv);
                setResult(0,intent);
                finish();
            }
        });
    }

}
