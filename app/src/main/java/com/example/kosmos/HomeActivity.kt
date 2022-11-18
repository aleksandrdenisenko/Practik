package com.example.kosmos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun IdiDalsh(view: View) {
        val intent: Intent = Intent(this@HomeActivity,activity_ran::class.java)
        startActivity(intent)
    }
}