package com.webianks.scintaxxmessenger.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.webianks.scintaxxmessenger.R
import kotlinx.android.synthetic.main.activity_intro1.*

class Intro1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_intro1)

        button.setOnClickListener {
            val intent = Intent(this, Intro2::class.java)
            // start next activity
            startActivity(intent)
        }
    }
}
