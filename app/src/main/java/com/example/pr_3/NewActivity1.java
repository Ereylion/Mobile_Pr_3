package com.example.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new1);

        TextView messageText = findViewById(R.id.messageText);

        MyObject myObjectInput = (MyObject) getIntent().getSerializableExtra("myObject");
        if(myObjectInput != null){
            messageText.setText("FIO: " + myObjectInput.getFio() + "\nGroup number: " + myObjectInput.getGroup_num() + "\nAge: " + myObjectInput.getAge() + "\nGrade: " + myObjectInput.getGrate());
        }
    }

    public void onBackActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


