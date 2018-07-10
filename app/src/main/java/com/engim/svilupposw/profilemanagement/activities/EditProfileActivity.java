package com.engim.svilupposw.profilemanagement.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.engim.svilupposw.profilemanagement.R;


/**
 * Created by elisagiuliano on 20/03/18.
 */

public class EditProfileActivity extends AppCompatActivity {

    private EditText nameEdit;
    private EditText emailEdit;
    private EditText telEdit;
    private EditText bioEdit;

    private Button scattaButton;

    private Button buttonSave;


    private String name;
    private String bio;
    private String tel;
    private String email;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.edit_profile_activity);

        nameEdit = findViewById(R.id.editName);

        emailEdit = findViewById(R.id.editEmail);

        telEdit = findViewById(R.id.editTel);

        bioEdit = findViewById(R.id.editBio);

        scattaButton = findViewById(R.id.buttonImage);

        buttonSave = findViewById(R.id.buttonSave);

        // quando ricreo l'activity dopo averlo rigirato
        // se lo metto prima non funziona perchè non ho ancora le view, crasha tutta l'app, (stessa cosa per setListeners)
        if(savedInstanceState != null){
            name = savedInstanceState.getString("name");
            email = savedInstanceState.getString("email");
            tel = savedInstanceState.getString("tel");
            bio = savedInstanceState.getString("bio");

            nameEdit.setText(name);
            emailEdit.setText(email);
            telEdit.setText(tel);
            bioEdit.setText(bio);
        }

        // creo un metodo per avere il codice più ordinato
        setListeners();

    }

    // salviamo i dati -> creiamo il bundle
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", name);
        outState.putString("email", email);
        outState.putString("tel", tel);
        outState.putString("bio", bio);
    }

    private void setListeners() {

            // metodo chiamato ogni volta che il testo in input cambia
            nameEdit.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    // salvo quello che l'utente scrive
                    name = editable.toString();

                    // uguale a
                    // name = nameEdit.getText().toString();

                }
            });

                emailEdit.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    email = editable.toString();
                }
            });


                telEdit.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    tel = editable.toString();
                }
            });

                bioEdit.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    bio = editable.toString();
                }
            });

                scattaButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snapPhoto();
                    }
            });

                buttonSave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent();
                        i.putExtra("tel", tel);
                        i.putExtra("name", name);
                        i.putExtra("email", email);
                        i.putExtra("bio", bio);

                        setResult(1,i);
                        finish();
                    }
                });


        }

    private void snapPhoto() {

    }
}

