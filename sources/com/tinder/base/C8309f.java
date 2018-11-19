package com.tinder.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.tinder.base.f */
final /* synthetic */ class C8309f implements OnDismissListener {
    /* renamed from: a */
    private final ActivitySignedInBase f29588a;

    C8309f(ActivitySignedInBase activitySignedInBase) {
        this.f29588a = activitySignedInBase;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f29588a.e(dialogInterface);
    }
}
