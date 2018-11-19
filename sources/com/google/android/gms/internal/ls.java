package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class ls implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ JsPromptResult f16356a;

    ls(JsPromptResult jsPromptResult) {
        this.f16356a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16356a.cancel();
    }
}
