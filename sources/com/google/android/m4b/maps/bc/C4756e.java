package com.google.android.m4b.maps.bc;

import android.content.Context;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.ay.C4724o;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.cg.C5173d;
import com.google.android.m4b.maps.cg.C5184n;
import com.google.android.m4b.maps.cg.C7511i;
import com.google.android.m4b.maps.cg.C7511i.C5178a;
import com.google.android.m4b.maps.ch.C5203e;

/* renamed from: com.google.android.m4b.maps.bc.e */
public final class C4756e {
    /* renamed from: a */
    private static boolean f17426a;

    /* renamed from: com.google.android.m4b.maps.bc.e$1 */
    class C64321 implements C5178a {
        C64321() {
        }

        /* renamed from: a */
        public final void mo4948a() {
            ao.m22337d();
        }
    }

    /* renamed from: a */
    public static synchronized void m21101a(C5173d c5173d, C4981g c4981g) {
        synchronized (C4756e.class) {
            if (f17426a) {
                return;
            }
            f17426a = true;
            bg[] bgVarArr = new bg[]{bg.f17745a, bg.f17748d, bg.f17750f, bg.f17749e, bg.f17759o, bg.f17758n};
            C5184n a = c5173d.m23111a();
            C6413m a2 = a.m23167a();
            Context c = c5173d.m23113c();
            C5203e i = c5173d.m23119i();
            ao.m22332a(c, c5173d.m23114d(), bgVarArr, C4513R.raw.maps_dav_k2, a2, i, c4981g);
            C4724o c7511i = new C7511i(a, c.getSharedPreferences("MapviewInitializerPreferences", 0), new C64321());
            a2.mo4892a(c7511i);
            c7511i.m33010a(i.m23226b().m23202a());
        }
    }
}
