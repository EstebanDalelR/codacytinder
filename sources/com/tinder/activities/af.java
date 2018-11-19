package com.tinder.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final /* synthetic */ class af implements OnDismissListener {
    /* renamed from: a */
    private final MainActivity f22672a;

    af(MainActivity mainActivity) {
        this.f22672a = mainActivity;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f22672a.c(dialogInterface);
    }
}
