package com.tinder.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final /* synthetic */ class ag implements OnDismissListener {
    /* renamed from: a */
    private final MainActivity f22673a;

    ag(MainActivity mainActivity) {
        this.f22673a = mainActivity;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f22673a.b(dialogInterface);
    }
}
