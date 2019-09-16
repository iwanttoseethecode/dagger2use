package com.example.dagger2usedemo.di.presenter_di;

import com.example.dagger2usedemo.di.scope.UserScope;
import com.example.dagger2usedemo.object.Presenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by luoling on 2019/9/12.
 * description:
 */
@UserScope
@Module
public class PresenterModule {
    @UserScope
    @Provides
    public Presenter providerPresenter(){
        return new Presenter();
    }

}
