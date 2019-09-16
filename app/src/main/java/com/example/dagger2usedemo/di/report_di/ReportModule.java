package com.example.dagger2usedemo.di.report_di;

import com.example.dagger2usedemo.object.ReportObject;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import java.util.ArrayList;

/**
 * Created by luoling on 2019/9/16.
 * description:
 */
@Module
public class ReportModule {

    ArrayList<String> mList = new ArrayList<>();

    public ReportModule(ArrayList<String> list){
        this.mList = list;
    }

    @Named("use1")
    @Provides
    public ReportObject provideReportObject1(){
        return new ReportObject(mList.get(0));
    }

    @Named("use2")
    @Provides
    public ReportObject provideReportObject2(){
        return new ReportObject(mList.get(1));
    }

}
