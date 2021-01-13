package com.riji.calculatorapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun division(view: View) {
        intent= Intent(this,DivActivity::class.java);
        startActivity(intent);
    }
    fun multiply(view: View) {
        intent= Intent(this,MulActivity::class.java);
        startActivity(intent);
    }
    fun subtraction(view: View) {
        intent= Intent(this,SubActivity::class.java);
        startActivity(intent);
    }
    fun addition(view: View) {
        intent= Intent(this,AddActivity::class.java);
        startActivity(intent);
    }
}