package com.tinder.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.R;

/* renamed from: com.tinder.dialogs.u */
public class C11118u extends C8858i {
    public C11118u(@NonNull Context context, OnClickListener onClickListener) {
        super(context, 0, (int) R.string.instagram_disconnect_error_title, (int) R.string.instagram_disconnect_error_body);
        m37632a(R.string.cancel, new C8868v(this));
        m37636b(R.string.retry, new C8869w(this, onClickListener));
    }

    /* renamed from: a */
    final /* synthetic */ void m43858a(View view) {
        dismiss();
    }

    /* renamed from: a */
    final /* synthetic */ void m43857a(OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        dismiss();
    }
}
