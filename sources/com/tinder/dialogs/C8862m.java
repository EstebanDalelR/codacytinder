package com.tinder.dialogs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.dialogs.DialogError.C8846a;

/* renamed from: com.tinder.dialogs.m */
final /* synthetic */ class C8862m implements OnClickListener {
    /* renamed from: a */
    private final DialogError f31033a;
    /* renamed from: b */
    private final C8846a f31034b;

    C8862m(DialogError dialogError, C8846a c8846a) {
        this.f31033a = dialogError;
        this.f31034b = c8846a;
    }

    public void onClick(View view) {
        this.f31033a.m37619a(this.f31034b, view);
    }
}
