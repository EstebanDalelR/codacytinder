package com.tinder.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.R;

/* renamed from: com.tinder.dialogs.d */
public class C11114d extends C8858i {
    public C11114d(@NonNull Context context, OnClickListener onClickListener) {
        super(context, 0, (int) R.string.instagram_connect_error_title, (int) R.string.instagram_connect_error_body);
        m37632a(R.string.cancel, new C8853e(this));
        m37636b(R.string.retry, new C8854f(this, onClickListener));
    }

    /* renamed from: a */
    final /* synthetic */ void m43850a(View view) {
        dismiss();
    }

    /* renamed from: a */
    final /* synthetic */ void m43849a(OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        dismiss();
    }
}
