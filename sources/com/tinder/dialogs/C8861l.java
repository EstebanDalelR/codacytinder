package com.tinder.dialogs;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.utils.av;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.tinder.dialogs.l */
public class C8861l extends Dialog implements OnClickListener, OnDateChangedListener {
    @NonNull
    /* renamed from: a */
    private final DatePicker f31030a = ((DatePicker) findViewById(R.id.datepicker));
    /* renamed from: b */
    private final OnDateSetListener f31031b;
    /* renamed from: c */
    private Calendar f31032c;

    public C8861l(@NonNull Context context, OnDateSetListener onDateSetListener) {
        super(context, R.style.Theme.FloatingDialog);
        requestWindowFeature(1);
        setContentView(R.layout.view_dialog_datepicker);
        Window window = getWindow();
        window.setLayout(-2, -2);
        window.setGravity(17);
        TextView textView = (TextView) findViewById(R.id.btn_set);
        textView.setOnClickListener(this);
        av.b(textView);
        this.f31030a.setCalendarViewShown(false);
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        instance.set(1, instance.get(1) - 18);
        Calendar instance2 = Calendar.getInstance(Locale.getDefault());
        instance2.set(1, instance.get(1) - 125);
        this.f31030a.setMinDate(instance2.getTimeInMillis());
        this.f31030a.setMaxDate(instance.getTimeInMillis());
        this.f31030a.init(instance.get(1), instance.get(2), instance.get(5), this);
        this.f31031b = onDateSetListener;
        this.f31032c = Calendar.getInstance(Locale.getDefault());
    }

    public void onDateChanged(@NonNull DatePicker datePicker, int i, int i2, int i3) {
        if (this.f31032c == null) {
            this.f31032c = Calendar.getInstance(Locale.getDefault());
        }
        this.f31032c.set(i, i2, i3);
    }

    public void onClick(@NonNull View view) {
        if (view.getId() == R.id.btn_set) {
            this.f31031b.onDateSet(this.f31030a, this.f31032c.get(1), this.f31032c.get(2), this.f31032c.get(5));
            dismiss();
        }
    }
}
