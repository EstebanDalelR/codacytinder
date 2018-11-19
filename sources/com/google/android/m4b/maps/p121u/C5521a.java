package com.google.android.m4b.maps.p121u;

import android.content.Context;
import android.os.Looper;
import com.google.android.m4b.maps.p108h.C5406b;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5406b.C5402b;
import com.google.android.m4b.maps.p108h.C5406b.C5403c;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p122v.C7707i;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.m4b.maps.u.a */
public final class C5521a {
    /* renamed from: a */
    public static final C5402b<C7707i, C5524d> f20527a = new C67711();
    /* renamed from: b */
    private static C5403c<C7707i> f20528b = new C5403c();
    /* renamed from: c */
    private static C5403c<C7707i> f20529c = new C5403c();
    /* renamed from: d */
    private static C5402b<C7707i, Object> f20530d = new C67722();
    /* renamed from: e */
    private static C5406b<C5524d> f20531e = new C5406b("SignIn.API", f20527a, f20528b, new C6690o[0]);
    /* renamed from: f */
    private static C5406b<Object> f20532f = new C5406b("SignIn.INTERNAL_API", f20530d, f20529c, new C6690o[0]);
    /* renamed from: g */
    private static C5522b f20533g = new C5522b();

    /* renamed from: com.google.android.m4b.maps.u.a$1 */
    class C67711 implements C5402b<C7707i, C5524d> {
        C67711() {
        }

        /* renamed from: a */
        public final /* synthetic */ C5401a mo5396a(Context context, Looper looper, C5441f c5441f, Object obj, C5409b c5409b, C5411d c5411d) {
            C5524d c5524d = (C5524d) obj;
            if (c5524d == null) {
                c5524d = C5524d.f20534a;
            }
            return new C7707i(context, looper, true, c5441f, c5524d, c5409b, c5411d, Executors.newSingleThreadExecutor());
        }
    }

    /* renamed from: com.google.android.m4b.maps.u.a$2 */
    class C67722 implements C5402b<C7707i, Object> {
        C67722() {
        }

        /* renamed from: a */
        public final /* synthetic */ C5401a mo5396a(Context context, Looper looper, C5441f c5441f, Object obj, C5409b c5409b, C5411d c5411d) {
            return new C7707i(context, looper, false, c5441f, C5524d.f20534a, c5409b, c5411d, Executors.newSingleThreadExecutor());
        }
    }
}
