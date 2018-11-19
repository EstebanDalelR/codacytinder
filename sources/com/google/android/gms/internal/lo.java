package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class lo implements OnCancelListener {
    /* renamed from: a */
    private /* synthetic */ JsResult f16352a;

    lo(JsResult jsResult) {
        this.f16352a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16352a.cancel();
    }
}
