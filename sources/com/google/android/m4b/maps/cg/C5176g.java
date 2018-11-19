package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.cg.g */
public final class C5176g {
    /* renamed from: a */
    private final Map<C5174f, C5175a> f19261a = ax.m20623b();
    /* renamed from: b */
    private final Context f19262b;

    /* renamed from: com.google.android.m4b.maps.cg.g$a */
    public static class C5175a {
        /* renamed from: a */
        private int f19259a = 1;
        /* renamed from: b */
        private final Bitmap f19260b;

        public C5175a(Bitmap bitmap) {
            this.f19260b = (Bitmap) C5571j.m24292a((Object) bitmap);
        }

        /* renamed from: a */
        final void m23125a() {
            this.f19259a++;
        }

        /* renamed from: b */
        final void m23126b() {
            this.f19259a--;
        }

        /* renamed from: c */
        public final Bitmap m23127c() {
            return this.f19260b;
        }

        /* renamed from: d */
        public final int m23128d() {
            return this.f19259a;
        }
    }

    private C5176g(Context context) {
        this.f19262b = (Context) C5571j.m24293a((Object) context, (Object) "processContext");
    }

    /* renamed from: a */
    public static C5176g m23129a(Context context) {
        return new C5176g(context);
    }

    /* renamed from: a */
    public final void m23130a(C5174f c5174f) {
        C5175a c5175a = (C5175a) this.f19261a.get(c5174f);
        if (c5175a == null) {
            this.f19261a.put(c5174f, new C5175a(c5174f.mo5311a(this.f19262b)));
            return;
        }
        c5175a.m23125a();
    }

    /* renamed from: b */
    public final C5175a m23131b(C5174f c5174f) {
        return (C5175a) this.f19261a.get(c5174f);
    }

    /* renamed from: c */
    public final void m23132c(C5174f c5174f) {
        C5175a c5175a = (C5175a) this.f19261a.get(c5174f);
        C5571j.m24298a(c5175a != null, (Object) "Released unknown imageData reference");
        if (c5175a.m23128d() == 1) {
            this.f19261a.remove(c5174f);
        } else {
            c5175a.m23126b();
        }
    }
}
