package com.github.fajarazay.belajarmaterialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.fajarazay.belajarmaterialdesign.feature.bottomnav.BottomNavActivity;
import com.github.fajarazay.belajarmaterialdesign.feature.navdrawer.NavDrawerActivity;
import com.github.fajarazay.belajarmaterialdesign.feature.tablayout.TabLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNavDrawer = findViewById(R.id.btn_nav_drawer);
        Button btnBottomNav = findViewById(R.id.btn_bottom_nav);
        Button btnTabLayout = findViewById(R.id.btn_tab);

        btnNavDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NavDrawerActivity.class));
            }
        });

        btnBottomNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BottomNavActivity.class));
            }
        });

        btnTabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TabLayoutActivity.class));
            }
        });
    }


}
