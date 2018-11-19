package com.tinder.managers;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.tinder.common.CrashReporter;
import com.tinder.utils.ad;

@Deprecated
public class LegacyBreadCrumbTracker {
    /* renamed from: a */
    private final CrashReporter f32557a;
    /* renamed from: b */
    private boolean f32558b = false;

    public LegacyBreadCrumbTracker(CrashReporter crashReporter) {
        this.f32557a = crashReporter;
    }

    /* renamed from: a */
    public void m40474a(@NonNull Activity activity) {
        if (this.f32558b) {
            ad.a(activity.getClass().getSimpleName());
        } else {
            this.f32557a.log(activity.getClass().getSimpleName());
        }
    }

    /* renamed from: a */
    public void m40475a(@NonNull Fragment fragment) {
        if (this.f32558b) {
            ad.a(fragment.getClass().getSimpleName());
        } else {
            this.f32557a.log(fragment.getClass().getSimpleName());
        }
    }

    /* renamed from: a */
    public void m40476a(String str) {
        if (this.f32558b) {
            ad.a(str);
        } else {
            this.f32557a.log(str);
        }
    }
}
