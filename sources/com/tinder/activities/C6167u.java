package com.tinder.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.dialogs.C8858i;

/* renamed from: com.tinder.activities.u */
final /* synthetic */ class C6167u implements OnClickListener {
    /* renamed from: a */
    private final LoginActivity f22686a;
    /* renamed from: b */
    private final C8858i f22687b;

    C6167u(LoginActivity loginActivity, C8858i c8858i) {
        this.f22686a = loginActivity;
        this.f22687b = c8858i;
    }

    public void onClick(View view) {
        this.f22686a.a(this.f22687b, view);
    }
}
