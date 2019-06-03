package com.example.jetpackdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LocationM : LifecycleObserver {
    val TAG = "LocationM";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public fun create(){
        Log.d(TAG,"create location manager")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public fun start(){
        Log.d(TAG,"start locate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public fun stop(){
        Log.d(TAG,"stop locate")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public fun any(){
        //Log.d(TAG,"any()")
    }
}