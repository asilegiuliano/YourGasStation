package com.engim.svilupposw.profilemanagement.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.engim.svilupposw.profilemanagement.R;
import com.engim.svilupposw.profilemanagement.adapters.ShowDataAdapter;
import com.engim.svilupposw.profilemanagement.adapters.ShowDataRecyclerAdapter;
import com.engim.svilupposw.profilemanagement.models.Rifornimento;

import java.util.ArrayList;

/**
 * Created by elisagiuliano on 27/03/18.
 */

public class ShowDataActivity extends AppCompatActivity {

    private RecyclerView myShowDataList;

    private Toolbar toolbar;

    private FloatingActionButton fab;

    private DrawerLayout myDrawerLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.show_data);
        myShowDataList = findViewById(R.id.list);

        ArrayList<Rifornimento> data = new ArrayList<>();

        Rifornimento r = new Rifornimento("Eni", 30.0);
        data.add(r);
        data.add(r);
        data.add(r);
        data.add(r);
        data.add(r);

        // ShowDataAdapter adapter = new ShowDataAdapter(getApplicationContext(), data);

        // per il recyclerview
        ShowDataRecyclerAdapter adapter = new ShowDataRecyclerAdapter(getApplicationContext(), data);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myShowDataList.setLayoutManager(linearLayoutManager);

        myShowDataList.setAdapter(adapter);

        myShowDataList.setItemAnimator(new DefaultItemAnimator());

        toolbar = findViewById(R.id.my_toolbar);

        setSupportActionBar(toolbar);

         fab = findViewById(R.id.fab);

        startEditData();


        // menù laterale

        myDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        myDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);

        return true;
    }

    // --------------------- FUNZIONE CREATA PER IL CLICK SUL FAB
    private void startEditData() {
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View EditDataActivity) {
                Intent edit = new Intent(getApplicationContext(), EditDataActivity.class);
                startActivity(edit);
            }
        });
    }

//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode ==2){
//            String name = data.getStringExtra("nameEdit");
//            String priceEdit = data.getStringExtra("priceEdit");
//
//            nameEdit =
//        }
//    }


}
