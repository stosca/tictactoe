package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String FIRST_NAME = "null";
    public static String SECOND_NAME = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void setNames(View view) {
        Intent intent = new Intent(this, SetupGame.class);
        EditText firstName = (EditText) findViewById(R.id.nameOne);
        EditText secondName = (EditText) findViewById(R.id.nameTwo);
        String first_name = firstName.getText().toString();
        String second_name = secondName.getText().toString();
        intent.putExtra(FIRST_NAME, first_name);
        intent.putExtra(SECOND_NAME, second_name);
        startActivity(intent);
    }


}
