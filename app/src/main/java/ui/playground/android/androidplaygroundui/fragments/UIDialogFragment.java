package ui.playground.android.androidplaygroundui.fragments;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.widget.DatePicker;

import java.util.Calendar;

public class UIDialogFragment extends DialogFragment {

    private static final String TAG = UIDialogFragment.class.getName();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                Log.d(TAG, "Selected date is: " + dayOfMonth);
            }
        };

        return new DatePickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, listener, year, month, day);
    }
}
