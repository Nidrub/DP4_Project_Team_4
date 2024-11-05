package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Map;

public class User_intro_Display_Duplicate extends AppCompatActivity {
    // Updated display fields for the duplicate activity
    TextView incomeDuplicate;
    TextView expensesDuplicate;
    TextView amountDuplicate;
    Button startButtonDuplicate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_intro_display_duplicate);

        incomeDuplicate = findViewById(R.id.incomeDuplicate);
        expensesDuplicate = findViewById(R.id.expensesDuplicate);
        amountDuplicate = findViewById(R.id.amountDuplicate);
        startButtonDuplicate = findViewById(R.id.startButtonDuplicate);

        // Shared preferences setup with duplicate naming
        SharedPreferences sharedTracker = getSharedPreferences("trackerDuplicate", MODE_PRIVATE);
        SharedPreferences.Editor trackerEditor = sharedTracker.edit();
        trackerEditor.putString("hp", "50");
        trackerEditor.putString("chest defense", "10");
        trackerEditor.putString("pants defense", "10");
        trackerEditor.putString("head defense", "10");
        trackerEditor.putString("attack", "10");
        trackerEditor.putInt("helmet", 1);
        trackerEditor.putInt("chest", 1);
        trackerEditor.putInt("pants", 1);
        trackerEditor.putInt("sword", 1);
        trackerEditor.putBoolean("inventory", false);
        trackerEditor.putBoolean("reward", false);
        trackerEditor.putBoolean("person", false);
        trackerEditor.putBoolean("inventory color", false);
        trackerEditor.putBoolean("reward color", false);
        trackerEditor.putBoolean("person color", false);
        trackerEditor.putBoolean("home color", true);
        trackerEditor.putBoolean("last tracker", false);
        trackerEditor.putBoolean("last tracker2", false);
        trackerEditor.putBoolean("last sword", false);
        trackerEditor.putBoolean("empty list", false);
        trackerEditor.apply();

        SharedPreferences sharedList = getSharedPreferences("GamePagePrefsDuplicate", MODE_PRIVATE);
        SharedPreferences.Editor listEditor = sharedList.edit();
        listEditor.clear();
        listEditor.apply();

        SharedPreferences sharedPreferences = getSharedPreferences("money_trackerDuplicate", MODE_PRIVATE);
        SharedPreferences.Editor moneyEditor = sharedPreferences.edit();
        SharedPreferences preferences = getSharedPreferences("subscriptionsDuplicate", MODE_PRIVATE);
        SharedPreferences.Editor editor_s = preferences.edit();

        Map<String, ?> money_tracker = sharedPreferences.getAll();
        Map<String, ?> subscriptions = preferences.getAll();
        long income_have = sharedPreferences.getLong("income", 0);
        incomeDuplicate.setText("$ " + income_have);

        long total = 0;

        for (Map.Entry<String, ?> entry : money_tracker.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!key.toLowerCase().contains("income")) {
                if (value instanceof Integer) {
                    total += (Integer) value;
                } else if (value instanceof Long) {
                    total += (Long) value;
                }
            }
        }

        for (Map.Entry<String, ?> entry : subscriptions.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!key.toLowerCase().contains("income")) {
                if (value instanceof Integer) {
                    total += (Integer) value;
                } else if (value instanceof Long) {
                    total += (Long) value;
                }
            }
        }

        expensesDuplicate.setText("$ " + total);
        long amount_saved = income_have - total;
        if (amount_saved > 0) {
            amountDuplicate.setTextColor(getResources().getColor(R.color.dark_green));
            amountDuplicate.setText("$ " + amount_saved);
        } else if (amount_saved < 0) {
            amountDuplicate.setTextColor(getResources().getColor(R.color.dark_red));
            amountDuplicate.setText("$ " + amount_saved);
        } else {
            amountDuplicate.setText("$ " + amount_saved);
        }

        startButtonDuplicate.setOnClickListener(v -> {
            Intent intent = new Intent(User_intro_Display_Duplicate.this, main_game_page.class);
            startActivity(intent);
        });
    }
}
