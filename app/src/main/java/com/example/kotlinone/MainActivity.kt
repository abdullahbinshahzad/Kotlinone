package com.example.kotlinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var btn_add : Button
    lateinit var btn_sub : Button
    lateinit var btn_mul : Button
    lateinit var btn_div : Button
    lateinit var num_first : EditText
    lateinit var num_second : EditText
    lateinit var view_result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add = findViewById(R.id.add_btn)
        btn_sub = findViewById(R.id.sub_btn)
        btn_mul = findViewById(R.id.mul_btn)
        btn_div = findViewById(R.id.div_btn)
        num_first = findViewById(R.id.first_num)
        num_second = findViewById(R.id.second_num)
        view_result = findViewById(R.id.result)

        btn_add.setOnClickListener(this)
        btn_sub.setOnClickListener(this)
        btn_mul.setOnClickListener(this)
        btn_div.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var f_num = num_first.text.toString().toDouble()
        var s_num = num_second.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.add_btn -> {
                result = f_num + s_num
            }
            R.id.sub_btn -> {
                result = f_num - s_num
            }
            R.id.mul_btn -> {
                result = f_num * s_num
            }
            R.id.div_btn -> {
                result = f_num / s_num
            }
        }
        view_result.text = "RESULT IS $result"
    }
}