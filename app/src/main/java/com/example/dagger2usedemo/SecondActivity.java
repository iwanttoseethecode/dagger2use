package com.example.dagger2usedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.dagger2usedemo.object.HttpObject;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ((MyApplication) getApplication()).getMyComponent().injectSecondActivity(this);
        Log.i("luoling","sec="+httpObject.hashCode()+"");
    }

    public void click(View view) {
        Intent intent = new Intent(this,ThreeActivity.class);
        this.startActivity(intent);
    }
}
