package com.example.rxbro.inputui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private TextView resultTV;
    private EditText inputET;
    private Button submitBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = (TextView)findViewById(R.id.result_tv);
        inputET = (EditText)findViewById(R.id.input_et);
        submitBT = (Button)findViewById(R.id.submit_bt);
    }
    private String retrieveText() {
        String result = inputET.getText().toString();
        return result;

    }
    private void setResult(String result) {
        resultTV.setText(result);

    }

    public void doMagic(View view) {
        String s = inputET.getText().toString();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Name", s);
        startActivity(intent);

        
    }


}
