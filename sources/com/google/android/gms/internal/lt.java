package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class lt implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ JsPromptResult f16357a;
    /* renamed from: b */
    private /* synthetic */ EditText f16358b;

    lt(JsPromptResult jsPromptResult, EditText editText) {
        this.f16357a = jsPromptResult;
        this.f16358b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16357a.confirm(this.f16358b.getText().toString());
    }
}
