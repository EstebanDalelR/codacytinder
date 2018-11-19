package com.tinder.profile.dialogs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.profile.listener.InstagramConnectErrorDialogListener;

/* renamed from: com.tinder.profile.dialogs.d */
final /* synthetic */ class C14402d implements OnClickListener {
    /* renamed from: a */
    private final C16103c f45602a;
    /* renamed from: b */
    private final InstagramConnectErrorDialogListener f45603b;

    C14402d(C16103c c16103c, InstagramConnectErrorDialogListener instagramConnectErrorDialogListener) {
        this.f45602a = c16103c;
        this.f45603b = instagramConnectErrorDialogListener;
    }

    public void onClick(View view) {
        this.f45602a.m60923b(this.f45603b, view);
    }
}
