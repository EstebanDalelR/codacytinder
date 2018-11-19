package com.tinder.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.tinder.R;

public class ConfirmLogoutDialog extends C8858i {

    public interface ListenerLogoutClick {
        void onLogoutClick();
    }

    public ConfirmLogoutDialog(@NonNull Context context, @NonNull ListenerLogoutClick listenerLogoutClick) {
        super(context, 0, (int) R.string.ask_logout, (int) R.string.logout_confirm);
        m37636b(R.string.logout, new C8850a(this, listenerLogoutClick));
    }

    /* renamed from: a */
    final /* synthetic */ void m43816a(@NonNull ListenerLogoutClick listenerLogoutClick, View view) {
        listenerLogoutClick.onLogoutClick();
        dismiss();
    }
}
