package com.magdamiu.androidfundamentalsseria2.week7;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsseria2.R;

import java.util.Calendar;

public class MaterialDesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);

        setAnimation();
    }

    public void displayDatePickOnClick(View view) {
        // set today as default date
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // display the date picker dialog
        DialogFragment datePickerFragment = new CustomDatePickerFragment();
        ((CustomDatePickerFragment) datePickerFragment).setYear(year);
        ((CustomDatePickerFragment) datePickerFragment).setMonth(month);
        ((CustomDatePickerFragment) datePickerFragment).setDay(day);
        datePickerFragment.show(getSupportFragmentManager(), "DatePicker");
    }

    public void displayTimePickOnClick(View view) {
        // set today as default date
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // displayTime Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute) {
                        Toast.makeText(MaterialDesignActivity.this, hourOfDay + ":" + minute,
                                Toast.LENGTH_SHORT).show();
                    }
                }, hour, minute, false);
        timePickerDialog.show();
    }

    public void displayAlertdialogWitButtonsOnClick(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.notice));
        builder.setMessage(getString(R.string.alert_title));

        // add the buttons
        builder.setPositiveButton(getString(R.string.launch_app),
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MaterialDesignActivity.this,
                                getString(R.string.launch_app) + " " + getString(R.string.click),
                                Toast.LENGTH_SHORT).show();
                    }
                });
        builder.setNeutralButton(getString(R.string.reminde_me),
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MaterialDesignActivity.this,
                                getString(R.string.reminde_me) + " " + getString(R.string.click),
                                Toast.LENGTH_SHORT).show();
                    }
                });
        builder.setNegativeButton(getString(R.string.cancel),
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MaterialDesignActivity.this,
                                getString(R.string.cancel) + " " + getString(R.string.click),
                                Toast.LENGTH_SHORT).show();
                    }
                });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void setAnimation() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_parent_material);
        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
    }

    public void displaySnackBarOnClick(View view) {
        // setup Snack Bar and it should be inside of a CoordinatorLayout
        Snackbar snackbar = Snackbar
                .make(view, R.string.error_occured, Snackbar.LENGTH_LONG)
                .setAction(R.string.retry, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MaterialDesignActivity.this,
                                getString(R.string.retry_message), Toast.LENGTH_LONG).show();
                    }
                });

        // add some styles to the SnackBar (style customisation)
        snackbar.setActionTextColor(Color.RED);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green));
        TextView textView = snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.GREEN);

        // display it
        snackbar.show();
    }

    public void startPermissionActivity(View view) {
        startActivity(new Intent(MaterialDesignActivity.this, PhotoGalleryActivity.class));
    }

    public void startCollapsingToolbarActivity(View view) {
        startActivity(new Intent(MaterialDesignActivity.this, CollapsingToolbarActivity.class));
    }

    public void takePictureOnClick(View view) {
        startActivity(new Intent(MaterialDesignActivity.this, CameraActivity.class));
    }
}
