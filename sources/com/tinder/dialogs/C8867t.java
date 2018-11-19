package com.tinder.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.utils.ad;

/* renamed from: com.tinder.dialogs.t */
public class C8867t extends Dialog {
    public C8867t(@NonNull Context context) {
        super(context, R.style.Theme.ProgressDialog);
        ad.a();
        m37641a();
    }

    /* renamed from: a */
    private void m37641a() {
        getWindow().setFlags(1024, 1024);
        getWindow().setLayout(-1, -1);
        setContentView(R.layout.view_progress);
    }
}
