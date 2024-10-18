package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Input_Subscriptions_Activity6 extends AppCompatActivity {

    EditText netflix, spotify, hulu, amazon, addSub, addSub2, addSub3, addSub4, addSub5;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_input_subscriptions6);
        netflix=findViewById(R.id.Netflix);
        spotify=findViewById(R.id.Spotify);
        hulu=findViewById(R.id.Hulu);
        amazon=findViewById(R.id.AmazonPrime);
        submit=findViewById(R.id.submit);
        addSub=findViewById(R.id.addSub);
        addSub2=findViewById(R.id.addSub2);
        addSub3=findViewById(R.id.addSub3);
        addSub4=findViewById(R.id.addSub4);
        addSub5=findViewById(R.id.addSub5);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(netflix.getText().toString().isEmpty()||spotify.getText().toString().isEmpty()||
                        amazon.getText().toString().isEmpty()||hulu.getText().toString().isEmpty()||
                        addSub.getText().toString().isEmpty()|| addSub2.getText().toString().isEmpty()
                        || addSub3.getText().toString().isEmpty()||addSub4.getText().toString().isEmpty()
                        ||addSub5.getText().toString().isEmpty())
                {
                    Toast.makeText(Input_Subscriptions_Activity6.this, "Missing Information", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Input_Subscriptions_Activity6.this, "Completed", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Input_Subscriptions_Activity6.this,main_game_page.class);
                    startActivity(intent);
                }
            }
        });

    }
}