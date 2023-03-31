package com.izaque.helloword;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn1);
        TextView txt = (TextView)findViewById(R.id.textView3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("Insira os dados!");
            }
        });

    }
    protected void onStart(Bundle savedInstanceState){
        super.onStart();
    }
    protected void onResume(Bundle savedInstanceState){

    }
    protected void onRestart(Bundle savedInstanceState){

    }
    protected void onPause(Bundle savedInstanceState){

    }
    protected void onStop(Bundle savedInstanceState){

    }
    protected void onDestroy(Bundle savedInstanceState){

    }
}