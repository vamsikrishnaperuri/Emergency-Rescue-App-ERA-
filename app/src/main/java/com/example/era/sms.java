package com.example.era;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sms extends AppCompatActivity {

    EditText phno,msg;
    Button sendbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        sendbtn = findViewById(R.id.send);
        phno = findViewById(R.id.phnm);
        msg = findViewById(R.id.sendmsg);

        //SMS button
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(sms.this, android.Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){

                    sendsms();
                }else{
                    ActivityCompat.requestPermissions(sms.this,new String[]{Manifest.permission.SEND_SMS},7);
                }
            }
        });

    }

    //runtime pwrmission for sms
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        //SMS
        if(requestCode==7 && grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            sendsms();
        }else{
            Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
        }

    }

    //SMS
    private void sendsms() {
        String phnom = phno.getText().toString();
        String smsg = msg.getText().toString();

        if(!phnom.isEmpty() && !smsg.isEmpty()){
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phnom,null,smsg,null,null);
            Toast.makeText(this, "SMS sent successfully", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Please enter Phone number and message", Toast.LENGTH_SHORT).show();
        }
    }

}