package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class lq implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ JsResult f16354a;

    lq(JsResult jsResult) {
        this.f16354a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16354a.confirm();
    }
}
