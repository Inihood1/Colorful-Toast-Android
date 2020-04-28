package com.inihood.colorfultoastsample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;

import com.inihood.colorfultoast.ColorfulToast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String sms = "Hello My Awesome Toast";

        new ColorfulToast.Builder(this)
                .setText(sms)
                .setStroke(2, Color.BLUE)
                .setBackgroundColor(Color.GRAY)
                .setToastPosition(Gravity.BOTTOM)
                .setTextColor(Color.BLACK)
                .setTextBold()
                .font(R.font.dosis)
                .iconStart(getIcon())
                .iconEnd(getIcon())
                .setCornerRadius(5)
                .setTextSize(18)
                .show();


    }
}
