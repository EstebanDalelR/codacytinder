package com.tinder.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.dialogs.C8858i;

/* renamed from: com.tinder.activities.t */
final /* synthetic */ class C6166t implements OnClickListener {
    /* renamed from: a */
    private final LoginActivity f22684a;
    /* renamed from: b */
    private final C8858i f22685b;

    C6166t(LoginActivity loginActivity, C8858i c8858i) {
        this.f22684a = loginActivity;
        this.f22685b = c8858i;
    }

    public void onClick(View view) {
        this.f22684a.b(this.f22685b, view);
    }
}
