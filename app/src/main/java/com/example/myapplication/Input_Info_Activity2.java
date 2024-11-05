//Syed Shah
// sjs210000
package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Input_Info_Activity2 extends AppCompatActivity {
    EditText Income_2;
    EditText food_2;
    EditText mortage_2;
    EditText waterBill_2;
    EditText electricBill_2;
    EditText gasBill_2;
    EditText internetBill_2;
    Button nextButton_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_input_info2);

        Income_2 = findViewById(R.id.Income_2);
        food_2 = findViewById(R.id.food_2);
        mortage_2 = findViewById(R.id.mortage_2);
        waterBill_2 = findViewById(R.id.waterBill_2);
        electricBill_2 = findViewById(R.id.electricBill_2);
        gasBill_2 = findViewById(R.id.gasBill_2);
        internetBill_2 = findViewById(R.id.internetBill_2);

        nextButton_2 = findViewById(R.id.nextButton_2);

        SharedPreferences sharedPreferences = getSharedPreferences("money_tracker", MODE_PRIVATE);
        SharedPreferences.Editor moneyTrackerEditor = sharedPreferences.edit();

        nextButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (
                        Income_2.getText().toString().isEmpty() ||
                                food_2.getText().toString().isEmpty() ||
                                mortage_2.getText().toString().isEmpty() ||
                                waterBill_2.getText().toString().isEmpty() ||
                                electricBill_2.getText().toString().isEmpty() ||
                                gasBill_2.getText().toString().isEmpty() ||
                                internetBill_2.getText().toString().isEmpty()
                ) {
                    Toast.makeText(Input_Info_Activity2.this, "Missing Information", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Input_Info_Activity2.this, "Completed", Toast.LENGTH_SHORT).show();

                    moneyTrackerEditor.putLong("income_2", Long.parseLong(Income_2.getText().toString()));
                    moneyTrackerEditor.putLong("food_2", Long.parseLong(food_2.getText().toString()));
                    moneyTrackerEditor.putLong("mortage_2", Long.parseLong(mortage_2.getText().toString()));
                    moneyTrackerEditor.putLong("waterBill_2", Long.parseLong(waterBill_2.getText().toString()));
                    moneyTrackerEditor.putLong("electricBill_2", Long.parseLong(electricBill_2.getText().toString()));
                    moneyTrackerEditor.putLong("gasBill_2", Long.parseLong(gasBill_2.getText().toString()));
                    moneyTrackerEditor.putLong("internetBill_2", Long.parseLong(internetBill_2.getText().toString()));
                    moneyTrackerEditor.apply();


                    Intent intent = new Intent(Input_Info_Activity2.this, Input_Subscriptions_Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
