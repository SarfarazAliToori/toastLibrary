package com.example.mytoastlibrarysecond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytoast.MyToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyToast.myToast(this, "Hekllo 'woejf")
    }
}