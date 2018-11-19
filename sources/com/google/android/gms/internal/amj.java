package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.C0161b;
import android.support.customtabs.C0165d;
import android.support.customtabs.C0166e;
import java.util.List;

@zzzv
public final class amj implements zzftt {
    @Nullable
    /* renamed from: a */
    private C0166e f22990a;
    @Nullable
    /* renamed from: b */
    private C0161b f22991b;
    @Nullable
    /* renamed from: c */
    private C0165d f22992c;
    @Nullable
    /* renamed from: d */
    private zzof f22993d;

    /* renamed from: a */
    public static boolean m27136a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(aff.m19099a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m27137a(Activity activity) {
        if (this.f22992c != null) {
            activity.unbindService(this.f22992c);
            this.f22991b = null;
            this.f22990a = null;
            this.f22992c = null;
        }
    }

    /* renamed from: a */
    public final void m27138a(zzof zzof) {
        this.f22993d = zzof;
    }

    /* renamed from: a */
    public final boolean m27139a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.f22991b == null) {
            return false;
        }
        if (this.f22991b == null) {
            this.f22990a = null;
        } else if (this.f22990a == null) {
            this.f22990a = this.f22991b.a(null);
        }
        C0166e c0166e = this.f22990a;
        return c0166e == null ? false : c0166e.a(uri, null, null);
    }

    /* renamed from: b */
    public final void m27140b(Activity activity) {
        if (this.f22991b == null) {
            String a = aff.m19099a(activity);
            if (a != null) {
                this.f22992c = new afg(this);
                C0161b.a(activity, a, this.f22992c);
            }
        }
    }

    public final void zza(C0161b c0161b) {
        this.f22991b = c0161b;
        this.f22991b.a(0);
        if (this.f22993d != null) {
            this.f22993d.zzjl();
        }
    }

    public final void zzjk() {
        this.f22991b = null;
        this.f22990a = null;
    }
}
