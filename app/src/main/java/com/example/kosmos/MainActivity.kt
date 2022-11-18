package com.example.kosmos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun IdiDalshe(view: View) {
        val intent: Intent = Intent(this@MainActivity, activity_perexod::class.java)
        startActivity(intent)
    }
}