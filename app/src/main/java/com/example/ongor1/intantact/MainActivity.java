package com.example.ongor1.intantact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goToSecondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToSecondButton =(Button) findViewById(R.id.showButtonID);
        goToSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Intent here
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                intent.putExtra("Message","Hello From MainActivity");
                intent.putExtra("SecondMessage","Hello Again");
                intent.putExtra("value",123);
                startActivity(intent);
            }
        });
    }
}
