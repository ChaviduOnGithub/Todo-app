package com.coding.meet.todo_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide



class landing_page: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing_page)



        Handler().postDelayed({
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
            finish()
        }, 1000)


    }
}