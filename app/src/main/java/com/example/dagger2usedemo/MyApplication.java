package com.example.dagger2usedemo;

import android.app.Application;
import com.example.dagger2usedemo.di.database_di.DatabaseModule;
import com.example.dagger2usedemo.di.http_di.DaggerMyComponent;
import com.example.dagger2usedemo.di.http_di.HttpModule;
import com.example.dagger2usedemo.di.http_di.MyComponent;
import com.example.dagger2usedemo.di.presenter_di.DaggerPresenterComponent;
import com.example.dagger2usedemo.di.presenter_di.PresenterModule;

/**
 * Created by luoling on 2019/9/12.
 * description:
 */

public class MyApplication extends Application {
    private MyComponent myComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder()
                .httpModule(new HttpModule())
                .databaseModule(new DatabaseModule())
                .presenterComponent(DaggerPresenterComponent.builder().presenterModule(new PresenterModule()).build())
                .build();

    }

    public MyComponent getMyComponent(){
        return myComponent;
    }

}
