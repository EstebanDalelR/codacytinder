package com.google.android.m4b.maps.bm;

import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bm.C6483g.C4826a;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C6517d;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bq.C4870j;
import com.google.android.m4b.maps.bq.C4870j.C4869a;
import com.google.android.m4b.maps.bq.C4872l;
import com.google.android.m4b.maps.br.C4875d;
import com.google.android.m4b.maps.bw.C4976e;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.m4b.maps.bm.h */
public final class C6485h implements C4875d {
    /* renamed from: a */
    public static final C6483g f24030a = new C6483g(ae.m27685e());
    /* renamed from: b */
    private final C4870j f24031b;
    /* renamed from: c */
    private final C4869a f24032c;
    /* renamed from: d */
    private final C4976e<ba, C6483g> f24033d;
    /* renamed from: e */
    private int f24034e;
    /* renamed from: f */
    private final Set<ba> f24035f = new HashSet();
    /* renamed from: g */
    private final Set<C4827a> f24036g = new CopyOnWriteArraySet();

    /* renamed from: com.google.android.m4b.maps.bm.h$a */
    public interface C4827a {
        void h_();
    }

    /* renamed from: com.google.android.m4b.maps.bm.h$1 */
    class C64841 implements C4869a {
        /* renamed from: a */
        private /* synthetic */ C6485h f24029a;

        C64841(C6485h c6485h) {
            this.f24029a = c6485h;
        }

        /* renamed from: a */
        public final void mo5092a() {
            this.f24029a.m28470a();
        }

        /* renamed from: a */
        public final void mo5093a(az azVar) {
            if (azVar != null) {
                this.f24029a.mo5079a(azVar.mo5099d(), 0, azVar);
            }
        }
    }

    public C6485h() {
        if (C4872l.m21829a(bg.f17758n)) {
            this.f24031b = C4872l.m21830b(bg.f17758n);
            this.f24033d = new C4976e(100);
            this.f24032c = new C64841(this);
            this.f24031b.mo7080a(this.f24032c);
            return;
        }
        this.f24031b = null;
        this.f24033d = null;
        this.f24032c = null;
        if (C4728u.m21050a("IndoorOutlineFetcher", 3)) {
            Log.d("IndoorOutlineFetcher", "No indoor tile store registered, doing nothing.");
        }
    }

    /* renamed from: a */
    public final synchronized C6483g m28469a(ba baVar) {
        C6483g c6483g = (C6483g) this.f24033d.m22251b((Object) baVar);
        if (c6483g != null) {
            return c6483g;
        }
        m28468b(baVar);
        this.f24034e++;
        return null;
    }

    /* renamed from: a */
    public final synchronized void m28470a() {
        this.f24033d.m22247a();
        this.f24035f.clear();
    }

    /* renamed from: b */
    private synchronized void m28468b(ba baVar) {
        if (!this.f24035f.contains(baVar)) {
            this.f24035f.add(baVar);
            this.f24031b.mo7079a(baVar, (C4875d) this);
        }
    }

    /* renamed from: a */
    private static C6483g m28466a(bo boVar) {
        C4826a c4826a = new C4826a();
        boVar = boVar.mo7546k();
        while (boVar.hasNext()) {
            C4848k c4848k = (C4848k) boVar.next();
            if (c4848k instanceof C6517d) {
                C6517d c6517d = (C6517d) c4848k;
                if (c6517d.m28696j()) {
                    c4826a.m21403a(c6517d);
                }
            }
        }
        return c4826a.m21402a();
    }

    /* renamed from: a */
    public final void mo5079a(ba baVar, int i, az azVar) {
        if (C4728u.m21050a("IndoorOutlineFetcher", 3)) {
            String valueOf = String.valueOf(baVar);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("handleTile ");
            stringBuilder.append(valueOf);
            stringBuilder.append(",");
            stringBuilder.append(i);
            Log.d("IndoorOutlineFetcher", stringBuilder.toString());
        }
        Object obj = null;
        Object obj2 = 1;
        C6483g c6483g = null;
        if (i != 4) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    c6483g = f24030a;
                    break;
                default:
                    obj2 = null;
                    break;
            }
        }
        if ((azVar instanceof bo) != 0) {
            i = C6485h.m28466a((bo) azVar);
        } else {
            i = f24030a;
        }
        c6483g = i;
        obj = 1;
        if (obj != null) {
            synchronized (this) {
                this.f24033d.m22255c(baVar, c6483g);
            }
        }
        if (obj2 != null) {
            m28467a(baVar, c6483g);
            synchronized (this) {
                this.f24035f.remove(baVar);
            }
        }
    }

    /* renamed from: a */
    public final void m28471a(C4827a c4827a) {
        this.f24036g.add(c4827a);
    }

    /* renamed from: b */
    public final void m28473b(C4827a c4827a) {
        this.f24036g.remove(c4827a);
    }

    /* renamed from: a */
    private void m28467a(ba baVar, C6483g c6483g) {
        for (C4827a h_ : this.f24036g) {
            h_.h_();
        }
    }
}
