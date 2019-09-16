package com.example.dagger2usedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.dagger2usedemo.di.report_di.DaggerReportComponent;
import com.example.dagger2usedemo.di.report_di.ReportComponent;
import com.example.dagger2usedemo.di.report_di.ReportModule;
import com.example.dagger2usedemo.object.ReportObject;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;

public class ThreeActivity extends AppCompatActivity {

    ReportComponent reportComponent;

    @Inject
    @Named("use1")
    ReportObject reportObject1;
    @Inject
    @Named("use2")
    ReportObject reportObject2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        initList();
        reportComponent = DaggerReportComponent.builder()
                .reportModule(new ReportModule(initList())).build();
        reportComponent.injectThreeActivity(this);

        Log.d("luoling","ReportObject1:"+reportObject1.toString());
        Log.d("luoling","ReportObject2:"+reportObject2.toString());
    }

    public ArrayList<String> initList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("绝密信息");
        list.add("添油加醋信息");
        return list;
    }

}
