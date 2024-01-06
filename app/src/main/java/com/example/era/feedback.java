package com.example.era;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

public class feedback extends AppCompatActivity {
    TextView fdname,fdmail,fdmsg;
    Button fdbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


        fdbtn = findViewById(R.id.feedbtn);
        fdname = findViewById(R.id.feedname);
        fdmsg = findViewById(R.id.feedmsg);
        fdmail = findViewById(R.id.feedmail);

        fdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploaddata();
            }
        });

        fdname.setText("");
        fdmail.setText("");
        fdmsg.setText("");

    }

    public void uploaddata(){

        String Name = fdname.getText().toString();
        String mail = fdmail.getText().toString();
        String message = fdmsg.getText().toString();

        DataClass dataClass = new DataClass(Name, mail, message);

        FirebaseDatabase.getInstance().getReference("Data").child(Name).
                setValue(dataClass).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(feedback.this, "your response is successfully Submitted", Toast.LENGTH_SHORT).show();
                            Toast.makeText(feedback.this, "Thank you for your response", Toast.LENGTH_SHORT).show();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(feedback.this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                    }
                });


    }
}
