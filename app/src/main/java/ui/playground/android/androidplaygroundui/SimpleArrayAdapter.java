package ui.playground.android.androidplaygroundui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.Locale;

public class SimpleArrayAdapter extends AppCompatActivity {

    private static ListView listView;
    private static final String DEFAULT_LOCAL = "Portugal";
    private static String TAG = SimpleArrayAdapter.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_array_adapter);

        updateSimpleArrayAdapter();
    }

    private void updateSimpleArrayAdapter() {
        String[] arraySpinner = getResources().getStringArray(R.array.country_arrays);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arraySpinner);

        listView = (ListView) findViewById(R.id.countries);
        listView.setAdapter(adapter);
        listView.setSelection(adapter.getPosition(DEFAULT_LOCAL));
    }
}
