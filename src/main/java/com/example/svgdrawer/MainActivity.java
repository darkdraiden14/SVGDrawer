package com.example.svgdrawer;

import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    int svg;
    ContextThemeWrapper wrapper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        svg= R.drawable.ic_car;
        iv = (ImageView) findViewById(R.id.imageView);
        wrapper= new ContextThemeWrapper(this, R.style.DefaultScene);
        changeTheme(wrapper.getTheme());
    }

    private void changeTheme(final Resources.Theme theme) {
        final Drawable drawable = VectorDrawableCompat.create(getResources(),svg, theme);
        iv.setImageDrawable(drawable);
    }

    public void colorChange(View view) {
        final Resources.Theme theme = getResources().newTheme();
        theme.applyStyle(R.style.Variant, false);
        changeTheme(theme);
    }

    public void colorChange1(View view) {
        final Resources.Theme theme = getResources().newTheme();
        theme.applyStyle(R.style.Variant1, false);
        changeTheme(theme);
    }

    public void colorChange2(View view) {
        final Resources.Theme theme = getResources().newTheme();
        theme.applyStyle(R.style.Variant2, false);
        changeTheme(theme);
    }

    public void colorChange3(View view) {
        final Resources.Theme theme = getResources().newTheme();
        theme.applyStyle(R.style.Variant3, false);
        changeTheme(theme);
    }

    public void colorChange4(View view) {
        final Resources.Theme theme = getResources().newTheme();
        theme.applyStyle(R.style.Variant4, false);
        changeTheme(theme);
    }

    public void colorChange5(View view) {
        final Resources.Theme theme = getResources().newTheme();
        theme.applyStyle(R.style.Variant5, false);
        changeTheme(theme);
    }

    public void changeSVG2(View view) {
        svg= R.drawable.ic_jeep;
        wrapper = new ContextThemeWrapper(this, R.style.DefaultScene);
        changeTheme(wrapper.getTheme());
    }

    public void changeSVG(View view) {
        svg= R.drawable.ic_car;
        wrapper = new ContextThemeWrapper(this, R.style.DefaultScene);
        changeTheme(wrapper.getTheme());
    }
}
