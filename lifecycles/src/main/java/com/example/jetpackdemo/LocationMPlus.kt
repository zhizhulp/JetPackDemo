package com.example.jetpackdemo

import android.util.Log
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent

class LocationMPlus(private  val lifecycle:Lifecycle): LifecycleObserver {
    private val TAG ="LocationM"
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create(){
        Log.d(TAG,"create-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start(){
        Log.d(TAG,"start-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume(){
        Log.d(TAG,"resume-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause(){
        Log.d(TAG,"pause-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop(){
        Log.d(TAG,"stop-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy(){
        Log.d(TAG,"destroy-${lifecycle.currentState.name}")
    }
}