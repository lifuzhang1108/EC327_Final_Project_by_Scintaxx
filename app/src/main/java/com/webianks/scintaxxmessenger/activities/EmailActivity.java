package com.webianks.scintaxxmessenger.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.scintaxxmessenger.R;

public class EmailActivity extends AppCompatActivity  {

    EditText et_email, et_subject, et_message;

    Button b_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        et_email = findViewById(R.id.et_email);
        et_subject = findViewById(R.id.et_subject);
        et_message = findViewById(R.id.et_message);

        b_send = findViewById(R.id.b_send);

        b_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = et_email.getText().toString();
                String subject = et_subject.getText().toString();
                String message = et_message.getText().toString();

                Intent theintent = new Intent(Intent.ACTION_SEND);
                theintent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                theintent.putExtra(Intent.EXTRA_SUBJECT, subject);
                theintent.putExtra(Intent.EXTRA_TEXT, message);

                theintent.setType("message/rfc822");

                startActivity(Intent.createChooser(theintent, "Select Email app"));

            }
        });
    }
}
