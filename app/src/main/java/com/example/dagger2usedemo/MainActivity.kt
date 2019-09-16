package com.example.dagger2usedemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.dagger2usedemo.`object`.HttpObject
import com.example.dagger2usedemo.`object`.Presenter
import com.example.dagger2usedemo.di.http_di.MyComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var httpObject1: HttpObject
    @Inject
    lateinit var httpObject2: HttpObject
    @Inject
    lateinit var databaseObject: HttpObject
    @Inject
    lateinit var presenter: Presenter

    var myComponent: MyComponent? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).getMyComponent().injectMainActivity(this)
        Log.i("luoling","httpObject1:${httpObject1.hashCode().toString()}");
        Log.i("luoling","httpObject2: ${httpObject2.hashCode().toString()}");
        Log.i("luoling","databaseObject: ${databaseObject.hashCode().toString()}");
        Log.i("luoling","presenter: ${presenter.hashCode()}")
    }


    fun click(view:View){
        var intent = Intent(this,SecondActivity::class.java);
        this.startActivity(intent)
    }
}
