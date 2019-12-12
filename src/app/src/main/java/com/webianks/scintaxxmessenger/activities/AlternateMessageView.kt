package com.webianks.scintaxxmessenger.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.webianks.scintaxxmessenger.R
import kotlinx.android.synthetic.main.activity_alternate_message_view.*
import kotlinx.android.synthetic.main.activity_intro2.*
import kotlinx.android.synthetic.main.activity_sms_detailed_view.*

class AlternateMessageView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alternate_message_view)

        val title = "Quick reply"

        val actionBar = supportActionBar
        actionBar!!.title = title


    }
}
