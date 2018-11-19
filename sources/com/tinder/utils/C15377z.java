package com.tinder.utils;

import android.content.Context;
import android.content.Intent;
import com.tinder.module.ForApplication;
import javax.inject.Inject;

/* renamed from: com.tinder.utils.z */
public class C15377z {
    /* renamed from: a */
    private final Context f47646a;

    @Inject
    public C15377z(@ForApplication Context context) {
        this.f47646a = context;
    }

    /* renamed from: a */
    public boolean m57711a(Intent intent) {
        Context context = this.f47646a;
        boolean z = false;
        if (context == null) {
            return false;
        }
        intent = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (!(intent == null || intent.isEmpty() || intent.size() <= null)) {
            z = true;
        }
        return z;
    }
}
