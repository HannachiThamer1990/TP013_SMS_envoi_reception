package com.example.messageapp;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText phone ;
    private EditText message ;
    private Button envoi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActivity();}

    private void initActivity(){
        phone=(EditText) findViewById(R.id.editTextPhoneNumber);
        message=(EditText) findViewById(R.id.editTextMessage);
        envoi=(Button) findViewById(R.id.buttonSendSms);
        createOnclickEnvoieButton();
    }
    private void createOnclickEnvoieButton(){
        envoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager.getDefault().sendTextMessage(phone.getText().toString(),
                        null,message.getText().toString(),
                        null,null);
            }
        });
    }
}