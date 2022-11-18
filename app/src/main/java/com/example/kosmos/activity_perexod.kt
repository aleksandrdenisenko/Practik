package com.example.kosmos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_perexod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perexod)
    }

    fun Space(view: View) {
        val intent: Intent = Intent(this@activity_perexod, HomeActivity::class.java)
        startActivity(intent)
    }

    fun DED(view: View) {
        val intent: Intent = Intent(this@activity_perexod, activity_ran::class.java)
        startActivity(intent)

    }
    fun Fanat(view: View) {
        val intent: Intent = Intent(this@activity_perexod, activiti_ses::class.java)
        startActivity(intent)
    }
    fun Raynd(view: View) {
        val intent: Intent = Intent(this@activity_perexod, activiti_gen::class.java)
        startActivity(intent)
    }




}