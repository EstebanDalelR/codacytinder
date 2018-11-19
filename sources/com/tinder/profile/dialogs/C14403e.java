package com.tinder.profile.dialogs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.profile.listener.InstagramConnectErrorDialogListener;

/* renamed from: com.tinder.profile.dialogs.e */
final /* synthetic */ class C14403e implements OnClickListener {
    /* renamed from: a */
    private final C16103c f45604a;
    /* renamed from: b */
    private final InstagramConnectErrorDialogListener f45605b;

    C14403e(C16103c c16103c, InstagramConnectErrorDialogListener instagramConnectErrorDialogListener) {
        this.f45604a = c16103c;
        this.f45605b = instagramConnectErrorDialogListener;
    }

    public void onClick(View view) {
        this.f45604a.m60922a(this.f45605b, view);
    }
}
