package com.example.dagger2usedemo.di.http_di;

import com.example.dagger2usedemo.di.scope.AppScope;
import com.example.dagger2usedemo.object.HttpObject;
import dagger.Module;
import dagger.Provides;

/**
 * Created by luoling on 2019/9/12.
 * description:
 */
@AppScope
@Module
public class HttpModule {
    @AppScope
    @Provides
    public HttpObject providerHttpObject(){
        return new HttpObject();
    }
}
