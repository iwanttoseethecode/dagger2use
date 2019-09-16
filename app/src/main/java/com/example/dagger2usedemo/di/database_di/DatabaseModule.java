package com.example.dagger2usedemo.di.database_di;

import com.example.dagger2usedemo.object.DatabaseObject;
import dagger.Module;
import dagger.Provides;

/**
 * Created by luoling on 2019/9/12.
 * description:
 */
@Module
public class DatabaseModule {
    @Provides
    public DatabaseObject providerDatabaseObject(){
        return new DatabaseObject();
    }
}
