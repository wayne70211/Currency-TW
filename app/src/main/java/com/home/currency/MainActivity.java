package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ntd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }
    private void findViews(){
        ntd = findViewById(R.id.ntd);

    }

    public void transfer(View view){
        try {
            String s = ntd.getText().toString();
            float ntd = Float.parseFloat(s);
            float usd = ntd/30.9f;
            new AlertDialog.Builder(this)
                    .setTitle("Result")
                    .setMessage("USD is "+usd)
                    .setPositiveButton("OK",null)
                    .show();

        }catch(Exception e){
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter your NTD amount")
                    .setPositiveButton("OK",null)
                    .show();
        }

    }




}
