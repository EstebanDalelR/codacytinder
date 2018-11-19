package com.tinder.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.listeners.ListenerSelectGender;
import com.tinder.utils.av;

/* renamed from: com.tinder.dialogs.n */
public class C8863n extends Dialog implements OnClickListener {
    @NonNull
    /* renamed from: a */
    private final RadioGroup f31035a = ((RadioGroup) findViewById(R.id.radiogroup_gender));
    /* renamed from: b */
    private ListenerSelectGender f31036b;

    public C8863n(@NonNull Context context, ListenerSelectGender listenerSelectGender) {
        super(context, R.style.Theme.FloatingDialog);
        setContentView(R.layout.view_dialog_gender);
        context = getWindow();
        context.setLayout(-2, -2);
        context.setGravity(17);
        TextView textView = (TextView) findViewById(R.id.btn_confirm);
        textView.setOnClickListener(this);
        av.b(textView);
        this.f31036b = listenerSelectGender;
    }

    public void onClick(@NonNull View view) {
        if (view.getId() == R.id.btn_confirm) {
            view = this.f31035a.getCheckedRadioButtonId();
            if (view == R.id.radio_male) {
                this.f31036b.onMaleSelected();
            } else if (view == R.id.radio_female) {
                this.f31036b.onFemaleSelected();
            }
            dismiss();
        }
    }
}
