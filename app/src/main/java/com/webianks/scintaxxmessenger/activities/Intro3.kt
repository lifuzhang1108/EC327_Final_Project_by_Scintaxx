package com.webianks.scintaxxmessenger.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.webianks.scintaxxmessenger.R
import kotlinx.android.synthetic.main.activity_intro3.*

class Intro3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro3)

        button4.setOnClickListener {
            val intent = Intent(this, Intro2::class.java)
            // start your next activity
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, Intro4::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
