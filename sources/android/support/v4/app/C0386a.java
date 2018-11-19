package android.support.v4.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;

/* renamed from: android.support.v4.app.a */
public class C0386a {

    @RequiresApi(16)
    /* renamed from: android.support.v4.app.a$a */
    private static class C2825a extends C0386a {
        /* renamed from: a */
        protected final ActivityOptions f8932a;

        C2825a(ActivityOptions activityOptions) {
            this.f8932a = activityOptions;
        }

        /* renamed from: a */
        public Bundle mo398a() {
            return this.f8932a.toBundle();
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.app.a$b */
    private static class C4015b extends C2825a {
        C4015b(ActivityOptions activityOptions) {
            super(activityOptions);
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.v4.app.a$c */
    private static class C4310c extends C4015b {
        C4310c(ActivityOptions activityOptions) {
            super(activityOptions);
        }
    }

    @Nullable
    /* renamed from: a */
    public Bundle mo398a() {
        return null;
    }

    @NonNull
    /* renamed from: a */
    public static C0386a m1447a(@NonNull Context context, int i, int i2) {
        if (VERSION.SDK_INT >= 16) {
            return C0386a.m1446a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C0386a();
    }

    @RequiresApi(16)
    /* renamed from: a */
    private static C0386a m1446a(ActivityOptions activityOptions) {
        if (VERSION.SDK_INT >= 24) {
            return new C4310c(activityOptions);
        }
        if (VERSION.SDK_INT >= 23) {
            return new C4015b(activityOptions);
        }
        return new C2825a(activityOptions);
    }

    protected C0386a() {
    }
}
