package com.example.bteusj.budgetmanagment;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, AddCategoryActivity.class));
    }


    public void calculateResult(View v){
        EditText e = (EditText) findViewById(R.id.editText);
        int einkommen = Integer.parseInt(e.getText().toString());

        EditText e1 = (EditText) findViewById(R.id.editText2);
        int abzug1 = Integer.parseInt(e1.getText().toString());

        EditText e2 = (EditText) findViewById(R.id.editText3);
        int abzug2 = Integer.parseInt(e2.getText().toString());

        EditText e3 = (EditText) findViewById(R.id.editText4);
        int abzug3 = Integer.parseInt(e3.getText().toString());

        int ausgabe = (einkommen - abzug1 - abzug2 - abzug3);

        TextView result1 = (TextView) findViewById(R.id.result);
        result1.setText(""+ausgabe);
    }

    public void inProgress(View v){
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setMessage("Not available yet!");
        alertDialog.show();
    }

}
