package com.example.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

open class User: BaseObservable(){
    @get:Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
    @get:Bindable
    var id:Int = 0
        set(value) {
            field = value
        }
}