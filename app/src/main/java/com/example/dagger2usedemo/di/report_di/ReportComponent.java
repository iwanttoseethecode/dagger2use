package com.example.dagger2usedemo.di.report_di;

import com.example.dagger2usedemo.ThreeActivity;
import dagger.Component;

/**
 * Created by luoling on 2019/9/16.
 * description:
 */
@Component(modules = {ReportModule.class})
public interface ReportComponent {
    void injectThreeActivity(ThreeActivity threeActivity);
}
