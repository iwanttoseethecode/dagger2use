package com.example.dagger2usedemo.di.http_di;

import com.example.dagger2usedemo.MainActivity;
import com.example.dagger2usedemo.SecondActivity;
import com.example.dagger2usedemo.di.database_di.DatabaseModule;
import com.example.dagger2usedemo.di.presenter_di.PresenterComponent;
import com.example.dagger2usedemo.di.scope.AppScope;
import dagger.Component;

/**
 * 这就是一个组件
 * @Singleton只是一个模板，我们需要scope都自定义
 * dependencies:组件依赖
 * 1.多个组件之间的scope不能相同
 * 2.没有scope的不能依赖有scope的组件
 */
@AppScope
@Component(modules = {HttpModule.class, DatabaseModule.class},dependencies = {PresenterComponent.class})
public interface MyComponent {
    void injectMainActivity(MainActivity mainActivity);
    void injectSecondActivity(SecondActivity secondActivity);
}
