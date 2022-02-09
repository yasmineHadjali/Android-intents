package com.example.tp04;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class InscriptionActivity extends AppCompatActivity {
int codeRequete=0;
TextView nombre;
ImageButton b1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);


        b1=(ImageButton)findViewById(R.id.boutoninscrire);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InscriptionActivity.this, InformationActivity.class);

                intent.putExtra("nom", ((EditText) findViewById(R.id.nom)).getText().toString());

                intent.putExtra("prénom", ((EditText) findViewById(R.id.prenom)).getText().toString());

                intent.putExtra("mail", ((EditText) findViewById(R.id.email)).getText().toString());

                intent.putExtra("tel", ((EditText) findViewById(R.id.tel)).getText().toString());

                intent.putExtra("wilaya", ((Spinner) findViewById(R.id.wilaya)).getSelectedItem().toString());




            }});}}

                



