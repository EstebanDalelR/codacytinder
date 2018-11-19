package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0164c;
import android.support.customtabs.C0164c.C0163a;
import com.facebook.FacebookSdk;

/* renamed from: com.facebook.internal.c */
public class C1702c {
    /* renamed from: a */
    private Uri f4704a;

    public C1702c(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String a = C1747v.m6054a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FacebookSdk.m3995f());
        stringBuilder.append("/");
        stringBuilder.append("dialog/");
        stringBuilder.append(str);
        this.f4704a = Utility.m5750a(a, stringBuilder.toString(), bundle);
    }

    /* renamed from: a */
    public void m5877a(Activity activity, String str) {
        C0164c a = new C0163a().m599a();
        a.f590a.setPackage(str);
        a.f590a.addFlags(1073741824);
        a.m601a(activity, this.f4704a);
    }
}
