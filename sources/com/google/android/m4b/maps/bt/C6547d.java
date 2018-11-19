package com.google.android.m4b.maps.bt;

import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bq.C6536f;
import com.google.android.m4b.maps.bq.C8066a.C4861b;
import com.google.android.m4b.maps.br.C4875d;
import com.google.android.m4b.maps.bw.C4967a;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.by.C5043a.C5042d;
import com.google.android.m4b.maps.cc.C6587q;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bt.d */
public final class C6547d extends C4909c {
    /* renamed from: a */
    private final C6536f f24275a;
    /* renamed from: b */
    private final C4875d f24276b;
    /* renamed from: c */
    private final Set<Integer> f24277c = new HashSet();

    /* renamed from: com.google.android.m4b.maps.bt.d$1 */
    class C65461 implements C4875d {
        /* renamed from: a */
        private /* synthetic */ C6547d f24274a;

        C65461(C6547d c6547d) {
            this.f24274a = c6547d;
        }

        /* renamed from: a */
        public final void mo5079a(ba baVar, int i, az azVar) {
            if (i == 1) {
                synchronized (this.f24274a.f24277c) {
                    this.f24274a.f24277c.remove(Integer.valueOf(baVar.hashCode()));
                }
            }
        }
    }

    public C6547d(bg bgVar, C6536f c6536f, C5042d c5042d, C4906a c4906a, C4967a c4967a, C5203e c5203e, C4981g c4981g) {
        super(bgVar, c5042d, c4906a, c4967a, c5203e, c4981g);
        this.f24275a = (C6536f) C5571j.m24293a((Object) c6536f, (Object) "Prefetcher should not be null");
        this.f24276b = new C65461(this);
    }

    /* renamed from: a */
    public final C6587q mo5164a(ba baVar) {
        m28861c(baVar);
        return super.mo5164a(baVar);
    }

    /* renamed from: b */
    protected final C6587q mo5165b(ba baVar) {
        m28861c(baVar);
        return super.mo5165b(baVar);
    }

    /* renamed from: c */
    private void m28861c(ba baVar) {
        synchronized (this.f24277c) {
            if (this.f24277c.contains(Integer.valueOf(baVar.hashCode()))) {
                return;
            }
            this.f24277c.add(Integer.valueOf(baVar.hashCode()));
            this.f24275a.mo7077a(baVar, this.f24276b, C4861b.PREFETCH_AREA, false).mo5148a();
        }
    }
}
