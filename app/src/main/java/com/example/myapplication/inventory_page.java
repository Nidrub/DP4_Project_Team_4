package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inventory_page extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inventory_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button rewardsButton = findViewById(R.id.rewardsButton);
        rewardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inventory_page.this, rewards_page.class);
                startActivity(intent);
            }
        });

        Button homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inventory_page.this, main_game_page.class);
                startActivity(intent);
            }
        });

        setupHelmet1();
        setupArmor1();
        setupPants1();
        setupWeapon1();
        setupPants2();
        setupArmor2();
        setupHelmet2();
    }

    private void setupHelmet1() {
        ImageView helmet1 = findViewById(R.id.helmet1);
        helmet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(v.getContext()).inflate(R.layout.base_helmet_popup, null);
                PopupWindow popUpWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popUpWindow.showAsDropDown(v);

                Button helmet1Close = popUpView.findViewById(R.id.helmetclose);
                helmet1Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });

                Button equipButton = popUpView.findViewById(R.id.equipbutton);
                equipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedTracker = getSharedPreferences("tracker", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedTracker.edit();
                        editor.putInt("helmet", 1); // ID for base helmet
                        editor.apply();

                        popUpWindow.dismiss();
                    }
                });
            }
        });
    }

    private void setupArmor1() {
        ImageView armor1 = findViewById(R.id.armor1);
        armor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(v.getContext()).inflate(R.layout.base_chestplate_popup, null);
                PopupWindow popUpWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popUpWindow.showAsDropDown(v);

                Button armor1Close = popUpView.findViewById(R.id.armorclose);
                armor1Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });

                Button equipButton = popUpView.findViewById(R.id.equipbutton);
                equipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedTracker = getSharedPreferences("tracker", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedTracker.edit();
                        editor.putInt("chest", 1); // ID for base armor
                        editor.apply();

                        popUpWindow.dismiss();
                    }
                });
            }
        });
    }

    private void setupPants1() {
        ImageView pants1 = findViewById(R.id.pants1);
        pants1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(v.getContext()).inflate(R.layout.base_pants_popup, null);
                PopupWindow popUpWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popUpWindow.showAsDropDown(v);

                Button pants1Close = popUpView.findViewById(R.id.pantsclose);
                pants1Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });

                Button equipButton = popUpView.findViewById(R.id.equipbutton);
                equipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedTracker = getSharedPreferences("tracker", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedTracker.edit();
                        editor.putInt("pants", 1); // ID for base pants
                        editor.apply();

                        popUpWindow.dismiss();
                    }
                });
            }
        });
    }

    private void setupWeapon1() {
        ImageView weapon1 = findViewById(R.id.weapon1);
        weapon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(v.getContext()).inflate(R.layout.sword_popup, null);
                PopupWindow popUpWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popUpWindow.showAsDropDown(v);

                Button weapon1Close = popUpView.findViewById(R.id.swordclose);
                weapon1Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });
            }
        });
    }

    private void setupHelmet2() {
        ImageView helmet2 = findViewById(R.id.helmet2);
        helmet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(v.getContext()).inflate(R.layout.upgraded_helmet_popup, null);
                PopupWindow popUpWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popUpWindow.showAsDropDown(v);

                Button helmet2Close = popUpView.findViewById(R.id.upgradedhelmetclose);
                helmet2Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });

                Button equipButton = popUpView.findViewById(R.id.equipbutton);
                equipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedTracker = getSharedPreferences("tracker", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedTracker.edit();
                        editor.putInt("helmet", 2); // ID for upgraded helmet
                        editor.apply();

                        popUpWindow.dismiss();
                    }
                });
            }
        });
    }

    private void setupArmor2() {
        ImageView armor2 = findViewById(R.id.armor2);
        armor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(v.getContext()).inflate(R.layout.upgraded_chestplate_popup, null);
                PopupWindow popUpWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popUpWindow.showAsDropDown(v);

                Button armor2Close = popUpView.findViewById(R.id.upgradedarmorclose);
                armor2Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });

                Button equipButton = popUpView.findViewById(R.id.equipbutton);
                equipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedTracker = getSharedPreferences("tracker", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedTracker.edit();
                        editor.putInt("chest", 2); // ID for upgraded armor
                        editor.apply();

                        popUpWindow.dismiss();
                    }
                });
            }
        });
    }

    private void setupPants2() {
        ImageView pants2 = findViewById(R.id.pants2);
        pants2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(v.getContext()).inflate(R.layout.upgraded_pants_popup, null);
                PopupWindow popUpWindow = new PopupWindow(popUpView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popUpWindow.showAsDropDown(v);

                Button pants2Close = popUpView.findViewById(R.id.upgradedpantsclose);
                pants2Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });

                Button equipButton = popUpView.findViewById(R.id.equipbutton);
                equipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedTracker = getSharedPreferences("tracker", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedTracker.edit();
                        editor.putInt("pants", 2); // ID for upgraded pants
                        editor.apply();

                        popUpWindow.dismiss();
                    }
                });
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateInventoryUI();
    }

    public void updateInventoryUI() {
        SharedPreferences sharedPreferences = getSharedPreferences("inventory", Context.MODE_PRIVATE);
        boolean isTask1Complete = sharedPreferences.getBoolean("task1_complete", false);
        boolean isTask2Complete = sharedPreferences.getBoolean("task2_complete", false);
        boolean isTask3Complete = sharedPreferences.getBoolean("task3_complete", false);
        boolean isHelmet2Visible = sharedPreferences.getBoolean("helmet2_visible", false) && isTask1Complete;
        boolean isArmor2Visible = sharedPreferences.getBoolean("armor2_visible", false) && isTask2Complete;
        boolean arePantsVisible = sharedPreferences.getBoolean("pants2_visible", false) && isTask3Complete;

        ImageView helmet2 = findViewById(R.id.helmet2);
        ImageView armor2 = findViewById(R.id.armor2);
        ImageView pants2 = findViewById(R.id.pants2);

        helmet2.setVisibility(isHelmet2Visible ? View.VISIBLE : View.GONE);
        armor2.setVisibility(isArmor2Visible ? View.VISIBLE : View.GONE);
        pants2.setVisibility(arePantsVisible ? View.VISIBLE : View.GONE);
    }
}
