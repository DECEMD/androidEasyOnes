package com.example.myfirstapp

import android.util.Log

class User(var name:String, var id:String, var age:Int) {
    fun addAge(years: Int){
        age = age.plus(years)
    }
    fun printUserInfo(){
        Log.d("MyLog","UserName: $name UserId: $id UserAge: $age")
    }
}