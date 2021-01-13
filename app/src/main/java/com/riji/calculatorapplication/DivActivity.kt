package com.riji.calculatorapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class DivActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_div)
    }

    fun division(view: View) {
        var getFirstNumber=findViewById<EditText>(R.id.num1);
        var getSecondNumber=findViewById<EditText>(R.id.num2);
        var n1 =getFirstNumber.text.toString().toDouble();
        var n2=getSecondNumber.text.toString().toDouble();
        Toast.makeText(this,"RESULT = "+(n1/n2).toString(), Toast.LENGTH_LONG).show();
    }

    fun back(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}