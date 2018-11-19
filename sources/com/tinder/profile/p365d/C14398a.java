package com.tinder.profile.p365d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.Nullable;

/* renamed from: com.tinder.profile.d.a */
public class C14398a {
    @Nullable
    /* renamed from: a */
    public static Context m54830a(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return C14398a.m54830a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
