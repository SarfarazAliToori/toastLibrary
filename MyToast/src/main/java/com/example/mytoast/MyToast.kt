package com.example.mytoast

import android.content.Context
import android.os.Message
import android.widget.Toast

object MyToast {
    fun myToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}