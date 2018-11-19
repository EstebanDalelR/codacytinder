package com.tinder.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.tinder.base.a */
final /* synthetic */ class C8300a implements OnDismissListener {
    /* renamed from: a */
    private final ActivityBase f29574a;

    C8300a(ActivityBase activityBase) {
        this.f29574a = activityBase;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f29574a.d(dialogInterface);
    }
}
