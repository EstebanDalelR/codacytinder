package com.tinder.boost.dialog;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDialog;
import com.tinder.R;

/* renamed from: com.tinder.boost.dialog.a */
public abstract class C12627a extends AppCompatDialog {
    public C12627a(@NonNull Context context) {
        super(context, R.style.PlusPaywallDialog);
        supportRequestWindowFeature(1);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        setCanceledOnTouchOutside(true);
    }

    public void setContentView(@LayoutRes int i) {
        super.setContentView(i);
        getWindow().setLayout(-1, -1);
        getWindow().setGravity(17);
    }
}
