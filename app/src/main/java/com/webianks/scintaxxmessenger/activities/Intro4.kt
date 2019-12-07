package com.webianks.scintaxxmessenger.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.webianks.scintaxxmessenger.R
import kotlinx.android.synthetic.main.activity_intro3.*
import kotlinx.android.synthetic.main.activity_intro4.*

class Intro4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro4)


        button5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
