package com.tinder.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.tinder.R;

public class InstagramDisconnectDialog extends C8858i {
    /* renamed from: a */
    ListenerLogout f35959a;

    public interface ListenerLogout {
        void onClick();
    }

    public InstagramDisconnectDialog(@NonNull Context context, ListenerLogout listenerLogout) {
        super(context, 0, (int) R.string.instagram_confirm_disconnect_title, (int) R.string.instagram_confirm_disconnect_body);
        this.f35959a = listenerLogout;
        m37632a(R.string.cancel, new C8870x(this));
        m37636b(R.string.ok, new C8871y(this));
    }

    /* renamed from: d */
    final /* synthetic */ void m43819d(View view) {
        dismiss();
    }

    /* renamed from: a */
    final /* synthetic */ void m43818a(View view) {
        this.f35959a.onClick();
        dismiss();
    }
}
