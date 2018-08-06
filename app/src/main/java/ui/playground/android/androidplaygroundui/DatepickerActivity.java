package ui.playground.android.androidplaygroundui;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ui.playground.android.androidplaygroundui.fragments.UIDialogFragment;

public class DatepickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
    }

    public void showDatePicker(View v) {
        DialogFragment fragment = new UIDialogFragment();
        fragment.show(getSupportFragmentManager(), "date picker");
    }
}
