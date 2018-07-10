package com.engim.svilupposw.profilemanagement.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.engim.svilupposw.profilemanagement.R;

/**
 * Created by elisagiuliano on 29/03/18.
 */

public class EditDataActivity extends AppCompatActivity {

    private EditText nameEdit;
    private EditText priceEdit;

    private Button buttonSave;

    private String nameBenz;
    private String price;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.edit_data);

        nameEdit = findViewById(R.id.editNameBenz);
        priceEdit = findViewById(R.id.editPrice);

        buttonSave = findViewById(R.id.buttonSave);

        setListeners();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("nameBenz", nameBenz);
        outState.putString("price", price);
    }

    private void setListeners(){

        nameEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nameBenz = editable.toString();
            }
        });

        priceEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                price = editable.toString();
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                i.putExtra("nameBenz", nameBenz);
                i.putExtra("price", price);

                setResult(2,i);
                finish();
            }
        });
    }
}
