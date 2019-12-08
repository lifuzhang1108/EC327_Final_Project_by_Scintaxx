package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText et_email, et_subject, et_message;

    Button b_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_email = (EditText) findViewById(R.id.et_email);
        et_subject = (EditText) findViewById(R.id.et_subject);
        et_message = (EditText) findViewById(R.id.et_message);

        b_send = (Button) findViewById(R.id.b_send);

        b_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = et_email.getText().toString();
                String subject = et_subject.getText().toString();
                String message = et_message.getText().toString();

                Intent intent = new Intent(intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);

                intent.setType("message/rfc822");

                startActivity(Intent.createChooser(intent, "Select Email app"));

            }
        });
    }
}
