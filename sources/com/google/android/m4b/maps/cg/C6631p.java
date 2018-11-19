package com.google.android.m4b.maps.cg;

import android.util.Log;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.C5186o.C5185a;
import com.google.android.m4b.maps.p101a.C4529m.C4527a;
import com.google.android.m4b.maps.p101a.C4529m.C4528b;
import com.google.android.m4b.maps.p101a.C4532r;
import com.google.android.m4b.maps.p102b.C6426j;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5579p;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.cg.p */
final class C6631p implements C5186o {
    /* renamed from: a */
    private static final String f24840a = C5186o.class.getSimpleName();
    /* renamed from: j */
    private static final C4527a f24841j = new C66291();
    /* renamed from: k */
    private static final C4528b<String> f24842k = new C66302();
    /* renamed from: b */
    private final C4712d f24843b;
    /* renamed from: c */
    private final String f24844c;
    /* renamed from: d */
    private final Map<String, C5185a> f24845d = ax.m20623b();
    /* renamed from: e */
    private final boolean f24846e;
    /* renamed from: f */
    private boolean f24847f;
    /* renamed from: g */
    private boolean f24848g;
    /* renamed from: h */
    private long f24849h;
    /* renamed from: i */
    private C5184n f24850i;

    /* renamed from: com.google.android.m4b.maps.cg.p$1 */
    class C66291 implements C4527a {
        C66291() {
        }

        /* renamed from: a */
        public final void mo4905a(C4532r c4532r) {
            if (!C5579p.m24319b(c4532r.getMessage()) && C4728u.m21050a(C6631p.f24840a, 6)) {
                Log.e(C6631p.f24840a, c4532r.getMessage());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.p$2 */
    class C66302 implements C4528b<String> {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo4906a(Object obj) {
        }

        C66302() {
        }
    }

    C6631p(C4712d c4712d, String str, boolean z, C5184n c5184n) {
        this.f24843b = c4712d;
        this.f24844c = str;
        this.f24846e = z;
        this.f24850i = c5184n;
    }

    /* renamed from: a */
    public final synchronized void mo5315a() {
        C5571j.m24302b(this.f24847f ^ true, String.format("Action with name %s already started", new Object[]{this.f24844c}));
        this.f24849h = C4712d.m20957c();
        this.f24847f = true;
    }

    /* renamed from: a */
    public final synchronized C5185a mo5314a(String str) {
        C5185a c5185a;
        C5571j.m24303b(this.f24847f, "Action with name %s not started", this.f24844c);
        c5185a = new C5185a(str);
        c5185a.f19287b = C4712d.m20957c();
        return c5185a;
    }

    /* renamed from: a */
    public final synchronized void mo5316a(C5185a c5185a) {
        C5571j.m24303b(this.f24847f, "Action with name %s not started", this.f24844c);
        C5571j.m24303b(this.f24845d.get(c5185a.f19286a) != c5185a, "This event with name %s already ended", c5185a.f19286a);
        if (!this.f24848g) {
            if (!this.f24845d.containsKey(c5185a.f19286a)) {
                c5185a.f19288c = C4712d.m20957c();
                this.f24845d.put(c5185a.f19286a, c5185a);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo5317b() {
        boolean z = this.f24847f && !this.f24848g;
        C5571j.m24301b(z);
        this.f24848g = true;
        List<C5185a> a = au.m20525a(this.f24845d.values());
        this.f24845d.clear();
        if (this.f24846e) {
            StringBuilder stringBuilder = new StringBuilder("https://csi.gstatic.com/csi");
            stringBuilder.append("?s=");
            stringBuilder.append("maps_android_api");
            stringBuilder.append("&v=");
            stringBuilder.append(3);
            stringBuilder.append("&action=");
            stringBuilder.append(this.f24844c);
            String str = "&it=";
            for (C5185a c5185a : a) {
                stringBuilder.append(str);
                stringBuilder.append(c5185a.f19286a);
                stringBuilder.append(".");
                stringBuilder.append(c5185a.m23172a());
                str = ",";
            }
            str = "&irt=";
            for (C5185a c5185a2 : a) {
                stringBuilder.append(str);
                stringBuilder.append(c5185a2.f19288c - this.f24849h);
                str = ",";
            }
            this.f24850i.m23170b().mo4884a(new C6426j(stringBuilder.toString(), f24842k, f24841j));
        }
    }
}
