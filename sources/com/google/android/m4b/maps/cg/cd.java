package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ad.C4597a.C7425a;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.ac;
import com.google.android.m4b.maps.ay.ae;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.cg.cc.C5165a;
import com.google.android.m4b.maps.cg.cc.C5166b;
import com.google.android.m4b.maps.cg.cc.C5167c;
import com.google.android.m4b.maps.cu.C5306g;
import com.google.android.m4b.maps.p105e.C5362a;
import com.google.android.m4b.maps.p107g.C5371d;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p107g.C5399h;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5414d;
import com.google.android.m4b.maps.p108h.C5414d.C5408a;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

public final class cd implements cb, Runnable {
    /* renamed from: a */
    private static final String f24788a = "cd";
    /* renamed from: b */
    private final Map<C5169a, C5170b> f24789b = ax.m20623b();
    /* renamed from: c */
    private long f24790c;
    /* renamed from: d */
    private final C4712d f24791d;
    /* renamed from: e */
    private final Handler f24792e;
    /* renamed from: f */
    private final C5171c f24793f;
    /* renamed from: g */
    private final Context f24794g;
    /* renamed from: h */
    private final String f24795h;
    /* renamed from: i */
    private final cc f24796i;

    /* renamed from: com.google.android.m4b.maps.cg.cd$2 */
    class C51682 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C5414d f19226a;

        C51682(C5414d c5414d) {
            this.f19226a = c5414d;
        }

        public final void run() {
            synchronized (this.f19226a) {
                this.f19226a.mo5423c();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.cd$a */
    static final class C5169a {
        /* renamed from: a */
        public final C5164a f19227a;
        /* renamed from: b */
        public final String f19228b;

        public C5169a(C5164a c5164a, String str) {
            this.f19227a = c5164a;
            this.f19228b = str;
        }

        public final int hashCode() {
            String valueOf = String.valueOf(this.f19227a.ci);
            String valueOf2 = String.valueOf(this.f19228b);
            return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C5169a) {
                C5169a c5169a = (C5169a) obj;
                if (c5169a.f19227a.ci.equals(this.f19227a.ci) && c5169a.f19228b.equals(this.f19228b) != null) {
                    return true;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.cd$b */
    static final class C5170b {
        /* renamed from: a */
        public int f19229a = 0;
        /* renamed from: b */
        private final long f19230b;

        public C5170b(long j) {
            this.f19230b = j;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.cd$c */
    interface C5171c {
        /* renamed from: a */
        void mo5301a();

        /* renamed from: a */
        void mo5302a(String str, String str2);
    }

    /* renamed from: com.google.android.m4b.maps.cg.cd$1 */
    class C66081 implements C5171c {
        /* renamed from: a */
        private /* synthetic */ ae f24781a;

        C66081(ae aeVar) {
            this.f24781a = aeVar;
        }

        /* renamed from: a */
        public final void mo5302a(String str, String str2) {
            this.f24781a.m20936a(113, str, str2);
        }

        /* renamed from: a */
        public final void mo5301a() {
            this.f24781a.m20935a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.cd$3 */
    class C66093 implements C5166b {
        /* renamed from: a */
        private /* synthetic */ Context f24782a;
        /* renamed from: b */
        private /* synthetic */ String f24783b;
        /* renamed from: c */
        private /* synthetic */ ce f24784c;

        C66093(Context context, String str, ce ceVar) {
            this.f24782a = context;
            this.f24783b = str;
            this.f24784c = ceVar;
        }

        /* renamed from: a */
        public final C7425a mo5303a() {
            return cd.m29512a(this.f24782a, this.f24783b, this.f24784c, C5399h.m23591a(), C5371d.m23570a());
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.cd$4 */
    class C66104 implements C5165a {
        /* renamed from: a */
        private /* synthetic */ C5414d f24785a;
        /* renamed from: b */
        private /* synthetic */ ac f24786b;
        /* renamed from: c */
        private /* synthetic */ C5362a f24787c;

        C66104(C5414d c5414d, ac acVar, C5362a c5362a) {
            this.f24785a = c5414d;
            this.f24786b = acVar;
            this.f24787c = c5362a;
        }

        /* renamed from: a */
        public final void mo5304a(List<C7425a> list) {
            cd.m29514a((List) list, this.f24785a, this.f24786b, this.f24787c);
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.cd$d */
    static class C6611d implements C5409b, C5411d {
        private C6611d() {
        }

        /* renamed from: a */
        public final void mo5306a(Bundle bundle) {
            if (C4728u.m21050a(cd.f24788a, 4) != null) {
                Log.i(cd.f24788a, "Connected to Clearcut logger service.");
            }
        }

        /* renamed from: a */
        public final void mo5305a(int i) {
            if (C4728u.m21050a(cd.f24788a, 5) != 0) {
                Log.w(cd.f24788a, "Connection to Clearcut logger service is suspended.");
            }
        }

        /* renamed from: a */
        public final void mo5307a(C6676a c6676a) {
            if (C4728u.m21050a(cd.f24788a, 5) != null) {
                Log.w(cd.f24788a, "Connection to Clearcut logger service has failed.");
            }
        }
    }

    private cd(Context context, Handler handler, C4712d c4712d, C5171c c5171c, String str, cc ccVar) {
        this.f24794g = context;
        this.f24792e = handler;
        this.f24791d = c4712d;
        this.f24790c = null;
        this.f24793f = c5171c;
        this.f24795h = str;
        this.f24796i = ccVar;
    }

    /* renamed from: a */
    public static cb m29513a(Context context, ae aeVar, ce ceVar, String str) {
        String str2;
        cc ccVar;
        Context context2 = context;
        C5171c c66081 = new C66081(aeVar);
        C5411d c6611d = new C6611d();
        C5414d b = new C5408a(context2).m23606a(C5362a.f20232b).m23607a((C5409b) c6611d).m23608a(c6611d).m23610b();
        Handler handler = new Handler(Looper.getMainLooper());
        C4712d a = C4712d.m20955a();
        ac acVar = new ac(by.m23063b(handler), new C51682(b), a, 5000);
        C5371d.m23570a();
        if (((long) C5371d.m23569a(context)) >= 7300000) {
            str2 = str;
            ccVar = new cc(new C66093(context2, str2, ceVar), new C66104(b, acVar, new C5362a(context2, "MAPS_API", null)), DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL, Executors.newSingleThreadExecutor(), new C5167c());
        } else {
            str2 = str;
            ccVar = null;
        }
        return new cd(context2, handler, a, c66081, str2, ccVar);
    }

    public final synchronized void run() {
        this.f24790c = 0;
        long c = C4712d.m20957c();
        Iterator it = au.m20525a(this.f24789b.keySet()).iterator();
        while (it.hasNext()) {
            C5169a c5169a = (C5169a) it.next();
            C5170b c5170b = (C5170b) this.f24789b.get(c5169a);
            if (c >= c5170b.f19230b) {
                C5171c c5171c = this.f24793f;
                String str = c5169a.f19227a.ci;
                String str2 = c5169a.f19228b;
                int i = c5170b.f19229a;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 14);
                stringBuilder.append(str2);
                stringBuilder.append("|c=");
                stringBuilder.append(i);
                c5171c.mo5302a(str, stringBuilder.toString());
                this.f24789b.remove(c5169a);
            }
        }
        m29516c();
    }

    /* renamed from: b */
    public final synchronized void mo5310b(C5164a c5164a) {
        if (C4728u.m21050a(f24788a, 3)) {
            String str = f24788a;
            String valueOf = String.valueOf(c5164a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 13);
            stringBuilder.append("Added event: ");
            stringBuilder.append(valueOf);
            Log.d(str, stringBuilder.toString());
        }
        if (!C5398g.m23589e(this.f24794g)) {
            str = "r=";
            valueOf = String.valueOf(this.f24795h);
            C5169a c5169a = new C5169a(c5164a, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            C5170b c5170b = (C5170b) this.f24789b.get(c5169a);
            if (c5170b == null) {
                c5170b = new C5170b(C4712d.m20957c() + 10000);
                this.f24789b.put(c5169a, c5170b);
            }
            r0.f19229a++;
            m29516c();
        }
        if (this.f24796i != null) {
            this.f24796i.m23089a(c5164a);
        }
    }

    /* renamed from: c */
    private void m29516c() {
        if (this.f24790c == 0) {
            if (!this.f24789b.isEmpty()) {
                this.f24790c = Format.OFFSET_SAMPLE_RELATIVE;
                for (C5170b a : this.f24789b.values()) {
                    this.f24790c = Math.min(this.f24790c, a.f19230b);
                }
                this.f24792e.removeCallbacks(this);
                this.f24792e.postAtTime(this, this.f24790c);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo5309a(C5164a c5164a) {
        C5171c c5171c = this.f24793f;
        String str = c5164a.ci;
        String str2 = "r=";
        String valueOf = String.valueOf(this.f24795h);
        c5171c.mo5302a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        if (this.f24796i != null) {
            this.f24796i.m23089a(c5164a);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static com.google.android.m4b.maps.ad.C4597a.C7425a m29512a(android.content.Context r5, java.lang.String r6, com.google.android.m4b.maps.cg.ce r7, com.google.android.m4b.maps.p107g.C5399h r8, com.google.android.m4b.maps.p107g.C5371d r9) {
        /*
        r9 = new com.google.android.m4b.maps.ad.a$a;
        r9.<init>();
        r0 = "2.17.0";
        r9.f27224b = r0;
        r0 = 1;
        r9.f27223a = r0;
        r1 = r6.hashCode();
        r2 = 71;
        r3 = 0;
        r4 = 2;
        if (r1 == r2) goto L_0x002e;
    L_0x0016:
        switch(r1) {
            case 76: goto L_0x0024;
            case 77: goto L_0x001a;
            default: goto L_0x0019;
        };
    L_0x0019:
        goto L_0x0038;
    L_0x001a:
        r1 = "M";
        r6 = r6.equals(r1);
        if (r6 == 0) goto L_0x0038;
    L_0x0022:
        r6 = 1;
        goto L_0x0039;
    L_0x0024:
        r1 = "L";
        r6 = r6.equals(r1);
        if (r6 == 0) goto L_0x0038;
    L_0x002c:
        r6 = 0;
        goto L_0x0039;
    L_0x002e:
        r1 = "G";
        r6 = r6.equals(r1);
        if (r6 == 0) goto L_0x0038;
    L_0x0036:
        r6 = 2;
        goto L_0x0039;
    L_0x0038:
        r6 = -1;
    L_0x0039:
        r1 = 3;
        switch(r6) {
            case 0: goto L_0x0046;
            case 1: goto L_0x0043;
            case 2: goto L_0x0040;
            default: goto L_0x003d;
        };
    L_0x003d:
        r9.f27225c = r3;
        goto L_0x0048;
    L_0x0040:
        r9.f27225c = r0;
        goto L_0x0048;
    L_0x0043:
        r9.f27225c = r4;
        goto L_0x0048;
    L_0x0046:
        r9.f27225c = r1;
    L_0x0048:
        r6 = r5.getPackageName();
        r2 = com.google.android.m4b.maps.ay.C4725p.m21021a(r5, r6);
        r9.f27226d = r6;
        r2 = r2.versionCode;
        r9.f27227e = r2;
        r2 = com.google.android.m4b.maps.ay.C4717k.m20982a(r5, r6);
        r9.f27231i = r2;
        r2 = com.google.android.m4b.maps.ay.C4725p.m21036m();
        if (r2 == 0) goto L_0x0065;
    L_0x0062:
        r9.f27232j = r1;
        goto L_0x0070;
    L_0x0065:
        r1 = com.google.android.m4b.maps.ay.C4725p.m21037n();
        if (r1 == 0) goto L_0x006e;
    L_0x006b:
        r9.f27232j = r4;
        goto L_0x0070;
    L_0x006e:
        r9.f27232j = r0;
    L_0x0070:
        r1 = r5.getPackageManager();
        r6 = r8.m23593a(r1, r6);
        r9.f27233k = r6;
        r9.f27230h = r0;
        r6 = r7.m23093a();
        r9.f27228f = r6;
        r5 = com.google.android.m4b.maps.p107g.C5371d.m23569a(r5);
        r9.f27229g = r5;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.cd.a(android.content.Context, java.lang.String, com.google.android.m4b.maps.cg.ce, com.google.android.m4b.maps.g.h, com.google.android.m4b.maps.g.d):com.google.android.m4b.maps.ad.a$a");
    }

    /* renamed from: a */
    public final synchronized void mo5308a() {
        for (C5169a c5169a : this.f24789b.keySet()) {
            C5170b c5170b = (C5170b) this.f24789b.get(c5169a);
            C5171c c5171c = this.f24793f;
            String str = c5169a.f19227a.ci;
            String str2 = c5169a.f19228b;
            int i = c5170b.f19229a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 14);
            stringBuilder.append(str2);
            stringBuilder.append("|c=");
            stringBuilder.append(i);
            c5171c.mo5302a(str, stringBuilder.toString());
        }
        this.f24789b.clear();
        this.f24793f.mo5301a();
        this.f24792e.removeCallbacks(this);
    }

    /* renamed from: a */
    static void m29514a(List<C7425a> list, C5414d c5414d, ac acVar, C5362a c5362a) {
        synchronized (c5414d) {
            acVar.m20914a();
            c5414d.mo5420b();
            for (C5306g a : list) {
                c5362a.m23559a(a).m23546a(c5414d);
            }
        }
    }
}
