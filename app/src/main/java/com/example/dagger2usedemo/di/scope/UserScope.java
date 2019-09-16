package com.example.dagger2usedemo.di.scope;

import javax.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by luoling on 2019/9/12.
 * description:
 */

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
