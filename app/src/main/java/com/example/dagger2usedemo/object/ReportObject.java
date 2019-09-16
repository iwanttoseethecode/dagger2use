package com.example.dagger2usedemo.object;

/**
 * Created by luoling on 2019/9/16.
 * description:
 */
public class ReportObject {

    String mInfo = null;
    public ReportObject(String info){
        this.mInfo = info;
    }

    @Override
    public String toString() {
        return mInfo;
    }
}
