package com.example.studydaggerbasic.dipattern.facade_pattern;

import android.os.Bundle;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;


public class FacadePatternActivity extends AppCompatActivity {
    @Inject
    ShopKeeper shopKeeper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_pattern);
        shopKeeper = DaggerShopKeeperComponent.create().getShopkeeper();
        shopKeeper.getIphoneDetail();
        shopKeeper.getSamsungDetail();

    }

}
