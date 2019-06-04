package com.example.jetpackdemo

import android.util.Log
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent

class LocationMPlus(private  val lifecycle:Lifecycle ,private val tag: String): LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create(){
        Log.d(tag,"create-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start(){
        Log.d(tag,"start-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume(){
        Log.d(tag,"resume-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause(){
        Log.d(tag,"pause-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop(){
        Log.d(tag,"stop-${lifecycle.currentState.name}")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy(){
        Log.d(tag,"destroy-${lifecycle.currentState.name}")
    }
}