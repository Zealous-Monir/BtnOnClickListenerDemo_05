package com.example.btnonclicklistenerdemo_05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1, btn2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        textView = findViewById(R.id.textView);





    }

    public void showMassage(View v){

        if(v.getId() == R.id.btn1){
            textView.setText("Login button is clicked");
        }
      else  if(v.getId() == R.id.btn2){
            textView.setText("Logout button is clicked");
        }


    }


}