package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class lp implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ JsResult f16353a;

    lp(JsResult jsResult) {
        this.f16353a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16353a.cancel();
    }
}
