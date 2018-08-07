package ui.playground.android.androidplaygroundui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mDatepicker;
    private Button mSimpleArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeDatepicker();
        initializeSimpleArrayAdapter();
    }

    private void initializeDatepicker() {
        mDatepicker = (Button) findViewById(R.id.datepicker);

        mDatepicker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            loadNewActivity(DatepickerActivity.class);
            }
        });
    }

    private void initializeSimpleArrayAdapter() {
        mSimpleArrayAdapter = (Button) findViewById(R.id.simpleArrayAdapter);

        mSimpleArrayAdapter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                loadNewActivity(SimpleArrayAdapter.class);
            }
        });
    }

    private void loadNewActivity(Class destinationActivity) {
        Context context = MainActivity.this;
        Intent startChildActivityIntent = new Intent(context, destinationActivity);
        startActivity(startChildActivityIntent);
    }
}
