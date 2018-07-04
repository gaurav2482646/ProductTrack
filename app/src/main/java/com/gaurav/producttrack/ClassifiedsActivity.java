package com.gaurav.producttrack;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ClassifiedsActivity extends AppCompatActivity {

    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classifieds);


        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setSubtitle("Realtime Database");

        fm = getSupportFragmentManager();
        addClassifiedAdFrgmt();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ads_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_ad_m:
                addClassifiedAdFrgmt();
                return true;
            case R.id.view_ads_m:
                viewlassifiedAdFrgmt();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void addClassifiedAdFrgmt() {
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.adds_frame, new AddClassifiedFragment());
        ft.commit();
    }

    public void viewlassifiedAdFrgmt() {
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.adds_frame, new ViewClassifiedFragment());
        ft.commit();
    }
}