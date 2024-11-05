package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityInputSubscriptionsDuplicateBinding;

import java.util.Map;

public class Input_Subscriptions_Activity_Duplicate extends AppCompatActivity {

    EditText sub_nameDuplicate, sub_amountDuplicate, sub_name_2Duplicate, sub_amount_2Duplicate, sub_name_3Duplicate, sub_amount_3Duplicate;
    Button submitDuplicate, addMoreDuplicate;

    LinearLayout subscriptionContainerDuplicate;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private ActivityInputSubscriptionsDuplicateBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_input_subscriptions_duplicate);

        sub_nameDuplicate = findViewById(R.id.sub_nameDuplicate);
        sub_amountDuplicate = findViewById(R.id.sub_amountDuplicate);
        sub_name_2Duplicate = findViewById(R.id.sub_name_2Duplicate);
        sub_amount_2Duplicate = findViewById(R.id.sub_amount_2Duplicate);
        sub_name_3Duplicate = findViewById(R.id.sub_name_3Duplicate);
        sub_amount_3Duplicate = findViewById(R.id.sub_amount_3Duplicate);
        submitDuplicate = findViewById(R.id.submitDuplicate);
        addMoreDuplicate = findViewById(R.id.addMoreDuplicate);
        subscriptionContainerDuplicate = findViewById(R.id.subscriptionContainerDuplicate);

        sharedPreferences = getSharedPreferences("subscriptions", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.clear();

        submitDuplicate.setOnClickListener(view -> handleSubmit());

        binding = ActivityInputSubscriptionsDuplicateBinding.inflate(getLayoutInflater());

        addMoreDuplicate.setOnClickListener(view -> addMoreSub());
    }

    private void handleSubmit() {
        String name;
        Long amount;
        boolean completed = false;
        int allCompleted = 0;

        if (!sub_nameDuplicate.getText().toString().isEmpty() && !sub_amountDuplicate.getText().toString().isEmpty()) {
            name = sub_nameDuplicate.getText().toString();
            amount = Long.parseLong(sub_amountDuplicate.getText().toString());
            editor.putLong(name, amount);
            completed = true;
            allCompleted++;
        }
        if (!sub_name_2Duplicate.getText().toString().isEmpty() && !sub_amount_2Duplicate.getText().toString().isEmpty()) {
            name = sub_name_2Duplicate.getText().toString();
            amount = Long.parseLong(sub_amount_2Duplicate.getText().toString());
            editor.putLong(name, amount);
            completed = true;
            allCompleted++;
        }
        if (!sub_name_3Duplicate.getText().toString().isEmpty() && !sub_amount_3Duplicate.getText().toString().isEmpty()) {
            name = sub_name_3Duplicate.getText().toString();
            amount = Long.parseLong(sub_amount_3Duplicate.getText().toString());
            editor.putLong(name, amount);
            completed = true;
            allCompleted++;
        }

        if (completed) {
            editor.apply();
            Map<String, ?> allEntries = sharedPreferences.getAll();
            for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            Intent intent = new Intent(Input_Subscriptions_Activity_Duplicate.this, User_intro_Display.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Please fill in at least one subscription", Toast.LENGTH_LONG).show();
        }
    }

    private void addMoreSub() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.add_subscription_duplicate, null);
        subscriptionContainerDuplicate.addView(view);
    }
}
