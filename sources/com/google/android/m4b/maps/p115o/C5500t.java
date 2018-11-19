package com.google.android.m4b.maps.p115o;

import android.content.Context;
import android.os.Looper;
import com.google.android.m4b.maps.p108h.C5406b;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5406b.C5402b;
import com.google.android.m4b.maps.p108h.C5406b.C5403c;
import com.google.android.m4b.maps.p108h.C5407c.C7690a;
import com.google.android.m4b.maps.p108h.C5414d;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p108h.C5427m;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p117q.C6754d;
import com.google.android.m4b.maps.p117q.C8090i;

/* renamed from: com.google.android.m4b.maps.o.t */
public final class C5500t {
    /* renamed from: a */
    public static final C5406b<Object> f20508a = new C5406b("LocationServices.API", f20511d, f20510c, new C6690o[0]);
    /* renamed from: b */
    public static final C5490e f20509b = new C6754d();
    /* renamed from: c */
    private static final C5403c<C8090i> f20510c = new C5403c();
    /* renamed from: d */
    private static final C5402b<C8090i, Object> f20511d = new C67471();
    /* renamed from: e */
    private static C5491f f20512e = new C5491f();
    /* renamed from: f */
    private static aa f20513f = new aa();

    /* renamed from: com.google.android.m4b.maps.o.t$1 */
    class C67471 implements C5402b<C8090i, Object> {
        C67471() {
        }

        /* renamed from: a */
        public final /* synthetic */ C5401a mo5396a(Context context, Looper looper, C5441f c5441f, Object obj, C5409b c5409b, C5411d c5411d) {
            return new C8090i(context, looper, c5409b, c5411d, "locationServices", c5441f);
        }
    }

    /* renamed from: com.google.android.m4b.maps.o.t$a */
    public static abstract class C8089a<R extends C5427m> extends C7690a<R, C8090i> {
        public C8089a(C5414d c5414d) {
            super(C5500t.f20510c, c5414d);
        }
    }
}
