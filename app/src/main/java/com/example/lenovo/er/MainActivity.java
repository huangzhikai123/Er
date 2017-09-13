package com.example.lenovo.er;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {
    TextView A;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0)
        {
            String str=data.getStringExtra("input1");
            A = (TextView) findViewById(R.id.textView2);
            A.setText(str);
        }
        else if(requestCode==1 && resultCode==1)
            {
                String str=data.getStringExtra("input2");
                A = (TextView) findViewById(R.id.textView2);
                A.setText(str);
            }
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText tv =(EditText) findViewById(R.id.ss);
                String Tv = tv.getText().toString();
                Intent intent= new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("input",Tv);
                startActivityForResult(intent,0);
            }
        });


        Button button1=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText tv =(EditText) findViewById(R.id.ss);
                String Tv = tv.getText().toString();
                Intent intent= new Intent(MainActivity.this,Another2Activity.class);
                intent.putExtra("input",Tv);
                startActivityForResult(intent,1);
            }
        });



    }
}
