package com.tinder.dialogs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.dialogs.ConfirmLogoutDialog.ListenerLogoutClick;

/* renamed from: com.tinder.dialogs.a */
final /* synthetic */ class C8850a implements OnClickListener {
    /* renamed from: a */
    private final ConfirmLogoutDialog f30998a;
    /* renamed from: b */
    private final ListenerLogoutClick f30999b;

    C8850a(ConfirmLogoutDialog confirmLogoutDialog, ListenerLogoutClick listenerLogoutClick) {
        this.f30998a = confirmLogoutDialog;
        this.f30999b = listenerLogoutClick;
    }

    public void onClick(View view) {
        this.f30998a.m43816a(this.f30999b, view);
    }
}
