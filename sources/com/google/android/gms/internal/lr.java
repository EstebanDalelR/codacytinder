package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class lr implements OnCancelListener {
    /* renamed from: a */
    private /* synthetic */ JsPromptResult f16355a;

    lr(JsPromptResult jsPromptResult) {
        this.f16355a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16355a.cancel();
    }
}
