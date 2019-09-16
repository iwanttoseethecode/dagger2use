package com.example.dagger2usedemo.di.presenter_di;

import com.example.dagger2usedemo.di.scope.UserScope;
import com.example.dagger2usedemo.object.Presenter;
import dagger.Component;

/**
 * Created by luoling on 2019/9/12.
 * description:
 */
@UserScope
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {

    public Presenter providePresenter();

}
