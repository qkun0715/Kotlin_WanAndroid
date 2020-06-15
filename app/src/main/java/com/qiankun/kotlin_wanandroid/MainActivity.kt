package com.qiankun.kotlin_wanandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mText.setOnClickListener {
            Toast.makeText(this, "测试一波", Toast.LENGTH_SHORT).show()
        }
    }
}