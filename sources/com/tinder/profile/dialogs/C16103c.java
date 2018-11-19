package com.tinder.profile.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.tinder.R;
import com.tinder.dialogs.C8858i;
import com.tinder.profile.listener.InstagramConnectErrorDialogListener;

/* renamed from: com.tinder.profile.dialogs.c */
public class C16103c extends C8858i {
    public C16103c(@NonNull Context context, InstagramConnectErrorDialogListener instagramConnectErrorDialogListener) {
        super(context, 0, R.string.instagram_connect_error_title, R.string.instagram_connect_error_body);
        a(R.string.cancel, new C14402d(this, instagramConnectErrorDialogListener));
        b(R.string.retry, new C14403e(this, instagramConnectErrorDialogListener));
    }

    /* renamed from: b */
    final /* synthetic */ void m60923b(InstagramConnectErrorDialogListener instagramConnectErrorDialogListener, View view) {
        dismiss();
        instagramConnectErrorDialogListener.finishActivity();
    }

    /* renamed from: a */
    final /* synthetic */ void m60922a(InstagramConnectErrorDialogListener instagramConnectErrorDialogListener, View view) {
        instagramConnectErrorDialogListener.retryInstagramLogin();
        dismiss();
    }
}
