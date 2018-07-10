package com.engim.svilupposw.profilemanagement.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.engim.svilupposw.profilemanagement.R;
import com.engim.svilupposw.profilemanagement.activities.EditProfileActivity;


/**
 * Created by elisagiuliano on 20/03/18.
 */

// creiamo la classe ed estendiamo activity, con ctrl + spazio e importiamo AppCompatActivity
public class ShowProfileActivity extends AppCompatActivity {

    // creiamo gli oggetti view creati nell'xml (e istanziati nell'xml)
    private ImageView profilePhoto;
    private TextView nameText;
    private TextView bioText;
    private TextView telText;
    private TextView emailText;

    private Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.show_profile_activity);

        profilePhoto = findViewById(R.id.profileImage);
        nameText = findViewById(R.id.nameText);
        bioText = findViewById(R.id.bioText);
        telText = findViewById(R.id.telText);
        emailText = findViewById(R.id.emailText);

        toolbar = findViewById(R.id.my_toolbar);

        // prendo il testo da strings.xml

        String nameText = getResources().getString(R.string.nameText);
        String bioText = getResources().getString(R.string.bioText);
        String telText = getResources().getString(R.string.telText);
        String emailText = getResources().getString(R.string.emailText);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.action_edit){
            Intent intent = new Intent(getApplicationContext(), EditProfileActivity.class);
            startActivityForResult(intent, 1);
            return true;
        }

        // lo rimando al sistema operativo se non entra nel metodo
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            String tel = data.getStringExtra("tel");
            String bio = data.getStringExtra("bio");
            String email = data.getStringExtra("email");
            String name = data.getStringExtra("name");

            nameText.setText(name);
            bioText.setText(bio);
            telText.setText(tel);
            emailText.setText(email);

        }
    }
}
