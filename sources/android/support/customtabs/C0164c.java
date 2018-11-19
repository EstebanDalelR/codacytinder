package android.support.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.AnimRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.C0386a;
import android.support.v4.app.C0390f;
import android.support.v4.content.C0432b;
import java.util.ArrayList;

/* renamed from: android.support.customtabs.c */
public final class C0164c {
    @NonNull
    /* renamed from: a */
    public final Intent f590a;
    @Nullable
    /* renamed from: b */
    public final Bundle f591b;

    /* renamed from: android.support.customtabs.c$a */
    public static final class C0163a {
        /* renamed from: a */
        private final Intent f585a;
        /* renamed from: b */
        private ArrayList<Bundle> f586b;
        /* renamed from: c */
        private Bundle f587c;
        /* renamed from: d */
        private ArrayList<Bundle> f588d;
        /* renamed from: e */
        private boolean f589e;

        public C0163a() {
            this(null);
        }

        public C0163a(@Nullable C0166e c0166e) {
            this.f585a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f586b = null;
            this.f587c = null;
            this.f588d = null;
            this.f589e = true;
            if (c0166e != null) {
                this.f585a.setPackage(c0166e.m605b().getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            if (c0166e != null) {
                iBinder = c0166e.m603a();
            }
            C0390f.m1454a(bundle, str, iBinder);
            this.f585a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0163a m596a(@ColorInt int i) {
            this.f585a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        /* renamed from: a */
        public C0163a m598a(boolean z) {
            this.f585a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z);
            return this;
        }

        /* renamed from: a */
        public C0163a m597a(@NonNull Context context, @AnimRes int i, @AnimRes int i2) {
            this.f587c = C0386a.m1447a(context, i, i2).mo398a();
            return this;
        }

        /* renamed from: b */
        public C0163a m600b(@NonNull Context context, @AnimRes int i, @AnimRes int i2) {
            this.f585a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C0386a.m1447a(context, i, i2).mo398a());
            return this;
        }

        /* renamed from: a */
        public C0164c m599a() {
            if (this.f586b != null) {
                this.f585a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f586b);
            }
            if (this.f588d != null) {
                this.f585a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f588d);
            }
            this.f585a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f589e);
            return new C0164c(this.f585a, this.f587c);
        }
    }

    /* renamed from: a */
    public void m601a(Context context, Uri uri) {
        this.f590a.setData(uri);
        C0432b.m1641a(context, this.f590a, this.f591b);
    }

    private C0164c(Intent intent, Bundle bundle) {
        this.f590a = intent;
        this.f591b = bundle;
    }
}
