package com.my_app_portfolio.p0kadevil.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast mCurrentToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return item.getItemId() == R.id.action_settings;
    }

    public void projectButtonPressed(View view){

        if(mCurrentToast != null) {
            mCurrentToast.cancel();
        }

        String message = "";

        switch(view.getId())
        {
            case R.id.btn_project1:
                message = getResources().getString(R.string.project_button_toast_text).
                        replace("%@", getResources().getString(R.string.project1_title) + " " +
                                getResources().getString(R.string.app));
                break;
            case R.id.btn_project2:
                message = getResources().getString(R.string.project_button_toast_text).
                        replace("%@", getResources().getString(R.string.project2_title));
                break;
            case R.id.btn_project3:
                message = getResources().getString(R.string.project_button_toast_text).
                        replace("%@", getResources().getString(R.string.project3_title));
                break;
            case R.id.btn_project4:
                message = getResources().getString(R.string.project_button_toast_text).
                        replace("%@", getResources().getString(R.string.project4_title) + " " +
                                getResources().getString(R.string.app));
                break;
            case R.id.btn_project5:
                message = getResources().getString(R.string.project_button_toast_text).
                        replace("%@", getResources().getString(R.string.project5_title) + " " +
                                getResources().getString(R.string.app));
                break;
            case R.id.btn_myproject:
                message = getResources().getString(R.string.project_button_toast_text).
                        replace("%@", getResources().getString(R.string.capstone) + " " +
                                getResources().getString(R.string.app));
                break;
            default:
                break;
        }

        if(message.length() > 0) {

            mCurrentToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
            mCurrentToast.show();
        }
    }
}
