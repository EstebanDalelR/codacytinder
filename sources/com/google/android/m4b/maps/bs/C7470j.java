package com.google.android.m4b.maps.bs;

import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ap.C4658e;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4715g;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bh.C4784a;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bq.C4867g;
import com.google.android.m4b.maps.br.C4875d;
import com.google.android.m4b.maps.br.C6537a;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.google.android.m4b.maps.bs.j */
public final class C7470j implements C6538c {
    /* renamed from: a */
    private static final az f27413a = new aa();
    /* renamed from: b */
    private static final byte[] f27414b = new byte[0];
    /* renamed from: c */
    private final String f27415c;
    /* renamed from: d */
    private final int f27416d;
    /* renamed from: e */
    private final C4902c f27417e;
    /* renamed from: f */
    private final HashMap<ba, C4901b> f27418f;
    /* renamed from: g */
    private C4891e f27419g;
    /* renamed from: h */
    private final int f27420h;
    /* renamed from: i */
    private final bg f27421i;
    /* renamed from: j */
    private int f27422j = 0;
    /* renamed from: k */
    private C4712d f27423k = new C4712d();
    /* renamed from: l */
    private C6540a f27424l = null;
    /* renamed from: m */
    private final C5203e f27425m;

    /* renamed from: com.google.android.m4b.maps.bs.j$b */
    static class C4901b {
        /* renamed from: a */
        final int f17997a = 1;
        /* renamed from: b */
        final long f17998b;
        /* renamed from: c */
        final String f17999c;
        /* renamed from: d */
        final int f18000d;
        /* renamed from: e */
        final byte[] f18001e;
        /* renamed from: f */
        final az f18002f;
        /* renamed from: g */
        final ba f18003g;
        /* renamed from: h */
        final C4875d f18004h;

        C4901b(long j, String str, int i, ba baVar, C4875d c4875d) {
            this.f17998b = j;
            this.f17999c = str;
            this.f18000d = i;
            this.f18001e = null;
            this.f18003g = baVar;
            this.f18002f = null;
            this.f18004h = c4875d;
        }

        C4901b(long j, String str, int i, byte[] bArr, az azVar, C4875d c4875d) {
            this.f17998b = j;
            this.f17999c = str;
            this.f18000d = i;
            this.f18001e = bArr;
            if (azVar == null) {
                j = null;
            } else {
                j = azVar.mo5099d();
            }
            this.f18003g = j;
            this.f18002f = azVar;
            this.f18004h = c4875d;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.j$c */
    public interface C4902c {
        /* renamed from: a */
        az mo5126a(ba baVar, byte[] bArr, int i, long j, long j2);
    }

    /* renamed from: com.google.android.m4b.maps.bs.j$a */
    static class C6540a implements C4892f {
        /* renamed from: a */
        private bg f24264a;
        /* renamed from: b */
        private Queue<Object> f24265b = new LinkedList();
        /* renamed from: c */
        private Map<ba, az> f24266c = new HashMap();
        /* renamed from: d */
        private C4881d f24267d;

        /* renamed from: com.google.android.m4b.maps.bs.j$a$a */
        class C4895a {
            /* renamed from: a */
            private /* synthetic */ C6540a f17985a;

            private C4895a(C6540a c6540a) {
                this.f17985a = c6540a;
            }
        }

        /* renamed from: com.google.android.m4b.maps.bs.j$a$b */
        class C4896b {
            /* renamed from: a */
            private /* synthetic */ C6540a f17986a;

            private C4896b(C6540a c6540a) {
                this.f17986a = c6540a;
            }
        }

        /* renamed from: com.google.android.m4b.maps.bs.j$a$c */
        class C4897c {
            /* renamed from: a */
            private int f17987a;
            /* renamed from: b */
            private /* synthetic */ C6540a f17988b;

            public C4897c(C6540a c6540a, int i) {
                this.f17988b = c6540a;
                this.f17987a = i;
            }
        }

        /* renamed from: com.google.android.m4b.maps.bs.j$a$d */
        class C4898d {
            /* renamed from: a */
            private az f17989a;
            /* renamed from: b */
            private int f17990b;
            /* renamed from: c */
            private /* synthetic */ C6540a f17991c;

            public C4898d(C6540a c6540a, az azVar, int i) {
                this.f17991c = c6540a;
                this.f17989a = azVar;
                this.f17990b = i;
            }
        }

        /* renamed from: com.google.android.m4b.maps.bs.j$a$e */
        class C4899e {
            /* renamed from: a */
            private ba f17992a;
            /* renamed from: b */
            private int f17993b;
            /* renamed from: c */
            private /* synthetic */ C6540a f17994c;

            public C4899e(C6540a c6540a, ba baVar, int i) {
                this.f17994c = c6540a;
                this.f17992a = baVar;
                this.f17993b = i;
            }
        }

        /* renamed from: com.google.android.m4b.maps.bs.j$a$f */
        class C4900f {
            /* renamed from: a */
            private ba f17995a;
            /* renamed from: b */
            private /* synthetic */ C6540a f17996b;

            public C4900f(C6540a c6540a, ba baVar) {
                this.f17996b = c6540a;
                this.f17995a = baVar;
            }
        }

        public C6540a(bg bgVar, C4881d c4881d) {
            this.f24264a = bgVar;
            this.f24267d = c4881d;
        }

        /* renamed from: a */
        public final void m28843a(az azVar) {
            this.f24266c.put(azVar.mo5099d(), azVar);
        }

        /* renamed from: b */
        public final void m28844b() {
            while (this.f24265b.size() > 0) {
                this.f24265b.poll();
            }
            if (this.f24266c.size() > 0) {
                if (C4728u.m21050a("SDCardTileCache", 6)) {
                    int size = this.f24266c.size();
                    StringBuilder stringBuilder = new StringBuilder(56);
                    stringBuilder.append(size);
                    stringBuilder.append(" tiles were not inserted into the disk cache.");
                    Log.e("SDCardTileCache", stringBuilder.toString());
                }
                this.f24266c.clear();
            }
        }

        /* renamed from: a */
        public final void mo5162a(long j, int i) {
            j = C4733b.m21064a(j);
            az azVar = (az) this.f24266c.remove(j);
            if (j != null && azVar != null) {
                this.f24265b.offer(new C4898d(this, azVar, i));
            }
        }

        /* renamed from: b */
        public final void mo5163b(long j, int i) {
            j = C4733b.m21064a(j);
            if (j != null) {
                this.f24265b.offer(new C4899e(this, j, i));
            }
        }

        /* renamed from: a */
        public final void mo5161a(long j) {
            j = C4733b.m21064a(j);
            if (j != null) {
                this.f24265b.offer(new C4900f(this, j));
            }
        }

        /* renamed from: a */
        public final void mo5160a(int i) {
            this.f24265b.offer(new C4897c(this, i));
        }

        /* renamed from: a */
        public final void mo5159a() {
            this.f24265b.clear();
            this.f24265b.offer(new C4895a());
        }

        /* renamed from: c */
        public final void m28846c() {
            this.f24265b.offer(new C4896b());
        }
    }

    public C7470j(String str, int i, C4902c c4902c, bg bgVar, C4881d c4881d, C5203e c5203e) {
        this.f27415c = str;
        this.f27416d = i;
        this.f27417e = c4902c;
        this.f27420h = Math.max(Math.min(256, (ao.m22338e() >> 3) * 32), 64);
        this.f27418f = ax.m20617a(this.f27420h);
        this.f27421i = bgVar;
        if (c4881d != null) {
            this.f27424l = new C6540a(this.f27421i, c4881d);
        }
        this.f27425m = c5203e;
    }

    /* renamed from: a */
    public final synchronized boolean mo7089a(File file) {
        C4784a.m21186a();
        file = m32343b(file);
        C4784a.m21187b();
        return file;
    }

    /* renamed from: b */
    private boolean m32343b(java.io.File r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r12 = this;
        r0 = r12.f27419g;
        r1 = 1;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r6 = new com.google.android.m4b.maps.bg.a$a;
        r6.<init>(r13);
        r9 = com.google.android.m4b.maps.ay.C4712d.m20957c();
        r13 = 0;
        r0 = r12.f27415c;	 Catch:{ IOException -> 0x001e }
        r2 = r12.f27424l;	 Catch:{ IOException -> 0x001e }
        r3 = r12.f27425m;	 Catch:{ IOException -> 0x001e }
        r0 = com.google.android.m4b.maps.bs.C4891e.m21894a(r0, r6, r2, r3);	 Catch:{ IOException -> 0x001e }
        r12.f27419g = r0;	 Catch:{ IOException -> 0x001e }
        r0 = 0;
        goto L_0x001f;
    L_0x001e:
        r0 = 1;
    L_0x001f:
        if (r0 != 0) goto L_0x0032;
    L_0x0021:
        r2 = r12.m32345g();
        r0 = r12.f27419g;
        r4 = r0.m21934b();
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0032;
    L_0x0030:
        r0 = 0;
        goto L_0x0033;
    L_0x0032:
        r0 = 1;
    L_0x0033:
        if (r0 == 0) goto L_0x008c;
    L_0x0035:
        r2 = r12.f27415c;	 Catch:{ IOException -> 0x005d }
        r3 = r12.f27416d;	 Catch:{ IOException -> 0x005d }
        r4 = -1;	 Catch:{ IOException -> 0x005d }
        r5 = new java.util.Locale;	 Catch:{ IOException -> 0x005d }
        r0 = "";	 Catch:{ IOException -> 0x005d }
        r5.<init>(r0);	 Catch:{ IOException -> 0x005d }
        r7 = r12.f27424l;	 Catch:{ IOException -> 0x005d }
        r8 = r12.f27425m;	 Catch:{ IOException -> 0x005d }
        r0 = com.google.android.m4b.maps.bs.C4891e.m21893a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x005d }
        r12.f27419g = r0;	 Catch:{ IOException -> 0x005d }
        r12.m32344f();	 Catch:{ IOException -> 0x005d }
        r0 = r12.f27424l;	 Catch:{ IOException -> 0x005d }
        if (r0 == 0) goto L_0x008c;	 Catch:{ IOException -> 0x005d }
    L_0x0052:
        r0 = r12.f27424l;	 Catch:{ IOException -> 0x005d }
        r0.mo5159a();	 Catch:{ IOException -> 0x005d }
        r0 = r12.f27424l;	 Catch:{ IOException -> 0x005d }
        r0.m28844b();	 Catch:{ IOException -> 0x005d }
        goto L_0x008c;
    L_0x005d:
        r0 = move-exception;
        r1 = "SDCardTileCache";
        r2 = 6;
        r1 = com.google.android.m4b.maps.ay.C4728u.m21050a(r1, r2);
        if (r1 == 0) goto L_0x008b;
    L_0x0067:
        r1 = "SDCardTileCache";
        r0 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 16;
        r2.<init>(r3);
        r3 = "Creating cache: ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.e(r1, r0);
    L_0x008b:
        return r13;
    L_0x008c:
        r2 = com.google.android.m4b.maps.ay.C4712d.m20957c();
        r4 = r2 - r9;
        r13 = "SDCardTileCache";
        r0 = 3;
        r13 = com.google.android.m4b.maps.ay.C4728u.m21050a(r13, r0);
        if (r13 == 0) goto L_0x010a;
    L_0x009b:
        r13 = "SDCardTileCache";
        r0 = r12.f27415c;
        r2 = r12.f27419g;
        r2 = r2.m21937d();
        r3 = r12.f27419g;
        r3 = r3.m21928a();
        r6 = r12.f27419g;
        r6 = r6.m21936c();
        r6 = java.lang.String.valueOf(r6);
        r7 = r12.f27419g;
        r7 = r7.m21934b();
        r9 = new java.lang.StringBuilder;
        r10 = java.lang.String.valueOf(r0);
        r10 = r10.length();
        r10 = r10 + 136;
        r11 = java.lang.String.valueOf(r6);
        r11 = r11.length();
        r10 = r10 + r11;
        r9.<init>(r10);
        r10 = "Loaded cache: ";
        r9.append(r10);
        r9.append(r0);
        r0 = " with ";
        r9.append(r0);
        r9.append(r2);
        r0 = " entries, data version: ";
        r9.append(r0);
        r9.append(r3);
        r0 = ", locale: ";
        r9.append(r0);
        r9.append(r6);
        r0 = ", ";
        r9.append(r0);
        r9.append(r4);
        r0 = "ms, creationTime: ";
        r9.append(r0);
        r9.append(r7);
        r0 = r9.toString();
        android.util.Log.d(r13, r0);
    L_0x010a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.j.b(java.io.File):boolean");
    }

    /* renamed from: e */
    public final synchronized void mo7095e() {
        if (this.f27419g == null) {
            throw new IllegalStateException("Uninitialized");
        }
        try {
            this.f27419g.m21938e();
        } catch (IOException e) {
            if (C4728u.m21050a("SDCardTileCache", 6)) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
                stringBuilder.append("shutDown(): ");
                stringBuilder.append(valueOf);
                Log.e("SDCardTileCache", stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo7087a(ba baVar, C4875d c4875d, int i) {
        if (this.f27419g == null) {
            throw new IllegalStateException("Uninitialized");
        }
        synchronized (this.f27418f) {
            C4901b c4901b = (C4901b) this.f27418f.get(baVar);
            if (c4901b != null) {
                Object c4901b2;
                if (c4901b.f18004h != null) {
                    if (c4875d != null) {
                        c4875d = new C6537a(c4901b.f18004h, c4875d);
                    } else {
                        c4875d = c4901b.f18004h;
                    }
                }
                if (c4901b.f18002f != null) {
                    c4901b2 = new C4901b(c4901b.f17998b, c4901b.f17999c, C4867g.m21800a(c4901b.f18000d, i), c4901b.f18001e, c4901b.f18002f, c4875d);
                } else {
                    c4901b = new C4901b(c4901b.f17998b, c4901b.f17999c, C4867g.m21800a(c4901b.f18000d, i), baVar, c4875d);
                }
                this.f27418f.put(baVar, c4901b2);
            } else {
                Pair a = C4733b.m21062a(this.f27421i, baVar);
                this.f27418f.put(baVar, new C4901b(((Long) a.first).longValue(), (String) a.second, i, baVar, c4875d));
            }
        }
    }

    /* renamed from: a */
    public final void mo5153a(ba baVar, az azVar) {
        throw new IllegalStateException("Don't store unencrypted tiles into SD cache.");
    }

    public final void a_(ba baVar) {
        mo7086a(baVar, f27413a, f27414b);
    }

    /* renamed from: c */
    public final int mo7093c() {
        if (this.f27419g != null) {
            return this.f27419g.m21928a();
        }
        throw new IllegalStateException("Uninitialized");
    }

    /* renamed from: a */
    public final boolean mo7088a(int i) {
        if (this.f27419g == null) {
            throw new IllegalStateException("Uninitialized");
        }
        try {
            this.f27419g.m21931a(i);
            return true;
        } catch (int i2) {
            if (C4728u.m21050a("SDCardTileCache", 6)) {
                Log.e("SDCardTileCache", "Error writing in the cache", i2);
            }
            return false;
        }
    }

    /* renamed from: d */
    public final Locale mo7094d() {
        if (this.f27419g != null) {
            return this.f27419g.m21936c();
        }
        throw new IllegalStateException("Uninitialized");
    }

    /* renamed from: a */
    public final boolean mo7090a(Locale locale) {
        if (this.f27419g != null) {
            return m32342a(this.f27419g.m21928a(), locale);
        }
        throw new IllegalStateException("Uninitialized");
    }

    /* renamed from: a */
    public final boolean mo5154a() {
        if (this.f27419g != null) {
            return m32342a(this.f27419g.m21928a(), this.f27419g.m21936c());
        }
        throw new IllegalStateException("Uninitialized");
    }

    /* renamed from: a */
    private boolean m32342a(int i, Locale locale) {
        try {
            synchronized (this.f27418f) {
                this.f27418f.clear();
                this.f27419g.m21932a(i, locale);
                m32344f();
                if (this.f27424l != 0) {
                    this.f27424l.m28844b();
                }
            }
            return true;
        } catch (int i2) {
            if (C4728u.m21050a("SDCardTileCache", 6) != null) {
                Log.e("SDCardTileCache", "Error writing in the cache", i2);
            }
            return false;
        }
    }

    /* renamed from: f */
    private void m32344f() {
        C4715g c4715g = new C4715g();
        try {
            c4715g.writeLong(this.f27419g.m21934b());
            C4658e c = C4725p.m21026c();
            byte[] a = c4715g.m20962a();
            String valueOf = String.valueOf("disk_creation_time_");
            String valueOf2 = String.valueOf(this.f27415c);
            c.mo7027a(a, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } finally {
            c4715g.close();
        }
    }

    /* renamed from: g */
    private long m32345g() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = com.google.android.m4b.maps.ay.C4725p.m21026c();
        r1 = "disk_creation_time_";
        r1 = java.lang.String.valueOf(r1);
        r2 = r6.f27415c;
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 == 0) goto L_0x001b;
    L_0x0016:
        r1 = r1.concat(r2);
        goto L_0x0021;
    L_0x001b:
        r2 = new java.lang.String;
        r2.<init>(r1);
        r1 = r2;
    L_0x0021:
        r0 = r0.mo7029b(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r3 = new com.google.android.m4b.maps.as.a;
        r3.<init>(r0);
        r3 = r3.readLong();	 Catch:{ IOException -> 0x0034 }
        return r3;
    L_0x0034:
        r0 = com.google.android.m4b.maps.ay.C4725p.m21026c();
        r3 = "disk_creation_time_";
        r3 = java.lang.String.valueOf(r3);
        r4 = r6.f27415c;
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        if (r5 == 0) goto L_0x004f;
    L_0x004a:
        r3 = r3.concat(r4);
        goto L_0x0055;
    L_0x004f:
        r4 = new java.lang.String;
        r4.<init>(r3);
        r3 = r4;
    L_0x0055:
        r0.mo7028a(r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.j.g():long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public final com.google.android.m4b.maps.bo.az mo5158c(com.google.android.m4b.maps.bo.ba r19) {
        /*
        r18 = this;
        r1 = r18;
        r10 = r19;
        r2 = r1.f27419g;
        if (r2 != 0) goto L_0x0010;
    L_0x0008:
        r2 = new java.lang.IllegalStateException;
        r3 = "Uninitialized";
        r2.<init>(r3);
        throw r2;
    L_0x0010:
        r2 = r19.m21619b();
        r3 = 21;
        r11 = 0;
        if (r2 <= r3) goto L_0x001a;
    L_0x0019:
        return r11;
    L_0x001a:
        r2 = r1.f27418f;
        monitor-enter(r2);
        r3 = r1.f27418f;	 Catch:{ all -> 0x0100 }
        r3 = r3.get(r10);	 Catch:{ all -> 0x0100 }
        r3 = (com.google.android.m4b.maps.bs.C7470j.C4901b) r3;	 Catch:{ all -> 0x0100 }
        if (r3 == 0) goto L_0x002b;
    L_0x0027:
        r3 = r3.f18002f;	 Catch:{ all -> 0x0100 }
        monitor-exit(r2);	 Catch:{ all -> 0x0100 }
        return r3;
    L_0x002b:
        monitor-exit(r2);	 Catch:{ all -> 0x0100 }
        r2 = r1.f27421i;
        r2 = com.google.android.m4b.maps.az.C4733b.m21062a(r2, r10);
        r3 = r1.f27419g;
        r4 = r2.first;
        r4 = (java.lang.Long) r4;
        r4 = r4.longValue();
        r2 = r2.second;
        r2 = (java.lang.String) r2;
        r4 = r3.m21933a(r4, r2);
        if (r4 != 0) goto L_0x0047;
    L_0x0046:
        return r11;
    L_0x0047:
        r2 = r4.length;	 Catch:{ IOException -> 0x00a8 }
        if (r2 != 0) goto L_0x004d;
    L_0x004a:
        r2 = f27413a;	 Catch:{ IOException -> 0x00a8 }
        return r2;
    L_0x004d:
        r2 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x00a8 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x00a8 }
        r3 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x00a8 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x00a8 }
        r5 = r3.readInt();	 Catch:{ IOException -> 0x00a8 }
        r3.readInt();	 Catch:{ IOException -> 0x00a8 }
        r6 = r3.readLong();	 Catch:{ IOException -> 0x00a8 }
        r8 = -1;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        r12 = 0;
        if (r2 == 0) goto L_0x007f;
    L_0x006a:
        r14 = com.google.android.m4b.maps.ay.C4712d.m20956b();	 Catch:{ IOException -> 0x00a8 }
        r2 = 0;
        r16 = r6 - r14;
        r6 = com.google.android.m4b.maps.ay.C4712d.m20957c();	 Catch:{ IOException -> 0x00a8 }
        r2 = 0;
        r14 = r16 + r6;
        r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r2 >= 0) goto L_0x007e;
    L_0x007c:
        r6 = r12;
        goto L_0x007f;
    L_0x007e:
        r6 = r14;
    L_0x007f:
        r2 = 16;
        if (r5 <= r2) goto L_0x00a0;
    L_0x0083:
        r2 = r3.readLong();	 Catch:{ IOException -> 0x00a8 }
        r14 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r14 == 0) goto L_0x009f;
    L_0x008b:
        r8 = com.google.android.m4b.maps.ay.C4712d.m20956b();	 Catch:{ IOException -> 0x00a8 }
        r14 = 0;
        r14 = r2 - r8;
        r2 = com.google.android.m4b.maps.ay.C4712d.m20957c();	 Catch:{ IOException -> 0x00a8 }
        r8 = 0;
        r8 = r14 + r2;
        r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r2 >= 0) goto L_0x00a0;
    L_0x009d:
        r8 = r12;
        goto L_0x00a0;
    L_0x009f:
        r8 = r2;
    L_0x00a0:
        r2 = r1.f27417e;	 Catch:{ IOException -> 0x00a8 }
        r3 = r10;
        r2 = r2.mo5126a(r3, r4, r5, r6, r8);	 Catch:{ IOException -> 0x00a8 }
        return r2;
    L_0x00a8:
        r0 = move-exception;
        r2 = r0;
        r3 = "SDCardTileCache";
        r4 = 6;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r4);
        if (r3 == 0) goto L_0x00ff;
    L_0x00b3:
        r3 = "SDCardTileCache";
        r4 = r1.f27415c;
        r5 = java.lang.String.valueOf(r19);
        r2 = java.lang.String.valueOf(r2);
        r6 = new java.lang.StringBuilder;
        r7 = java.lang.String.valueOf(r4);
        r7 = r7.length();
        r7 = r7 + 27;
        r8 = java.lang.String.valueOf(r5);
        r8 = r8.length();
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r2);
        r8 = r8.length();
        r7 = r7 + r8;
        r6.<init>(r7);
        r7 = "Could not unpack tile in ";
        r6.append(r7);
        r6.append(r4);
        r4 = ":";
        r6.append(r4);
        r6.append(r5);
        r4 = ":";
        r6.append(r4);
        r6.append(r2);
        r2 = r6.toString();
        android.util.Log.e(r3, r2);
    L_0x00ff:
        return r11;
    L_0x0100:
        r0 = move-exception;
        r3 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x0100 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.j.c(com.google.android.m4b.maps.bo.ba):com.google.android.m4b.maps.bo.az");
    }

    /* renamed from: a */
    public final byte[] mo7091a(ba baVar) {
        Object e;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        if (this.f27419g == null) {
            throw new IllegalStateException("Uninitialized");
        }
        byte[] bArr = null;
        if (baVar.m21619b() > 21) {
            return null;
        }
        byte[] bArr2;
        synchronized (this.f27418f) {
            C4901b c4901b = (C4901b) this.f27418f.get(baVar);
            bArr2 = c4901b != null ? c4901b.f18001e : null;
        }
        if (bArr2 == null) {
            Pair a = C4733b.m21062a(this.f27421i, baVar);
            bArr2 = this.f27419g.m21933a(((Long) a.first).longValue(), (String) a.second);
        }
        if (bArr2 != null) {
            if (bArr2.length != 0) {
                try {
                    int readInt = new DataInputStream(new ByteArrayInputStream(bArr2)).readInt();
                    int length = bArr2.length - readInt;
                    if (length >= 0) {
                        if (readInt <= 24) {
                            Object obj = new byte[length];
                            try {
                                System.arraycopy(bArr2, readInt, obj, 0, length);
                                bArr2 = obj;
                            } catch (IOException e2) {
                                e = e2;
                                bArr = obj;
                                if (C4728u.m21050a("SDCardTileCache", 6)) {
                                    str = this.f27415c;
                                    baVar = String.valueOf(baVar);
                                    valueOf = String.valueOf(e);
                                    stringBuilder = new StringBuilder(((String.valueOf(str).length() + 23) + String.valueOf(baVar).length()) + String.valueOf(valueOf).length());
                                    stringBuilder.append("invalid tile data in ");
                                    stringBuilder.append(str);
                                    stringBuilder.append(":");
                                    stringBuilder.append(baVar);
                                    stringBuilder.append(":");
                                    stringBuilder.append(valueOf);
                                    Log.e("SDCardTileCache", stringBuilder.toString());
                                }
                                bArr2 = bArr;
                                return bArr2;
                            }
                        }
                    }
                    if (C4728u.m21050a("SDCardTileCache", 6)) {
                        int length2 = bArr2.length;
                        String str2 = this.f27415c;
                        String valueOf2 = String.valueOf(baVar);
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str2).length() + 42) + String.valueOf(valueOf2).length());
                        stringBuilder2.append("invalid tile data length[");
                        stringBuilder2.append(length2);
                        stringBuilder2.append("] in ");
                        stringBuilder2.append(str2);
                        stringBuilder2.append(":");
                        stringBuilder2.append(valueOf2);
                        Log.e("SDCardTileCache", stringBuilder2.toString());
                    }
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    if (C4728u.m21050a("SDCardTileCache", 6)) {
                        str = this.f27415c;
                        baVar = String.valueOf(baVar);
                        valueOf = String.valueOf(e);
                        stringBuilder = new StringBuilder(((String.valueOf(str).length() + 23) + String.valueOf(baVar).length()) + String.valueOf(valueOf).length());
                        stringBuilder.append("invalid tile data in ");
                        stringBuilder.append(str);
                        stringBuilder.append(":");
                        stringBuilder.append(baVar);
                        stringBuilder.append(":");
                        stringBuilder.append(valueOf);
                        Log.e("SDCardTileCache", stringBuilder.toString());
                    }
                    bArr2 = bArr;
                    return bArr2;
                }
            }
        }
        return bArr2;
    }

    /* renamed from: b */
    public final boolean mo5157b(ba baVar) {
        if (this.f27419g == null) {
            throw new IllegalStateException("Uninitialized");
        } else if (baVar.m21619b() > 21) {
            return false;
        } else {
            Pair a = C4733b.m21062a(this.f27421i, baVar);
            boolean z = true;
            if (this.f27419g.m21935b(((Long) a.first).longValue(), (String) a.second)) {
                return true;
            }
            synchronized (this.f27418f) {
                C4901b c4901b = (C4901b) this.f27418f.get(baVar);
                if (c4901b == null || c4901b.f18001e == null) {
                    z = false;
                }
            }
            return z;
        }
    }

    /* renamed from: a */
    public final boolean mo5155a(az azVar) {
        return azVar == f27413a ? true : null;
    }

    public final void g_() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r11 = this;
        com.google.android.m4b.maps.ay.C4712d.m20957c();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r11.f27418f;
        monitor-enter(r3);
        r4 = r11.f27418f;	 Catch:{ all -> 0x00f4 }
        r4 = r4.values();	 Catch:{ all -> 0x00f4 }
        r4 = r4.iterator();	 Catch:{ all -> 0x00f4 }
    L_0x001f:
        r5 = r4.hasNext();	 Catch:{ all -> 0x00f4 }
        if (r5 == 0) goto L_0x005f;	 Catch:{ all -> 0x00f4 }
    L_0x0025:
        r5 = r4.next();	 Catch:{ all -> 0x00f4 }
        r5 = (com.google.android.m4b.maps.bs.C7470j.C4901b) r5;	 Catch:{ all -> 0x00f4 }
        r6 = r5.f17997a;	 Catch:{ all -> 0x00f4 }
        switch(r6) {
            case 0: goto L_0x0035;
            case 1: goto L_0x0031;
            default: goto L_0x0030;
        };	 Catch:{ all -> 0x00f4 }
    L_0x0030:
        goto L_0x001f;	 Catch:{ all -> 0x00f4 }
    L_0x0031:
        r2.add(r5);	 Catch:{ all -> 0x00f4 }
        goto L_0x001f;	 Catch:{ all -> 0x00f4 }
    L_0x0035:
        r6 = r5.f17998b;	 Catch:{ all -> 0x00f4 }
        r8 = r5.f17999c;	 Catch:{ all -> 0x00f4 }
        r9 = r5.f18000d;	 Catch:{ all -> 0x00f4 }
        r10 = r5.f18001e;	 Catch:{ all -> 0x00f4 }
        r6 = com.google.android.m4b.maps.bs.C4891e.m21887a(r6, r8, r9, r10);	 Catch:{ all -> 0x00f4 }
        r0.add(r6);	 Catch:{ all -> 0x00f4 }
        r6 = r11.f27424l;	 Catch:{ all -> 0x00f4 }
        if (r6 == 0) goto L_0x004f;	 Catch:{ all -> 0x00f4 }
    L_0x0048:
        r6 = r11.f27424l;	 Catch:{ all -> 0x00f4 }
        r7 = r5.f18002f;	 Catch:{ all -> 0x00f4 }
        r6.m28843a(r7);	 Catch:{ all -> 0x00f4 }
    L_0x004f:
        r6 = r5.f18004h;	 Catch:{ all -> 0x00f4 }
        if (r6 == 0) goto L_0x001f;	 Catch:{ all -> 0x00f4 }
    L_0x0053:
        r6 = r5.f18004h;	 Catch:{ all -> 0x00f4 }
        r5 = r5.f18002f;	 Catch:{ all -> 0x00f4 }
        r5 = android.util.Pair.create(r6, r5);	 Catch:{ all -> 0x00f4 }
        r1.add(r5);	 Catch:{ all -> 0x00f4 }
        goto L_0x001f;	 Catch:{ all -> 0x00f4 }
    L_0x005f:
        r4 = 0;	 Catch:{ all -> 0x00f4 }
        r11.f27422j = r4;	 Catch:{ all -> 0x00f4 }
        r5 = r11.f27418f;	 Catch:{ all -> 0x00f4 }
        r5.clear();	 Catch:{ all -> 0x00f4 }
        monitor-exit(r3);	 Catch:{ all -> 0x00f4 }
        r3 = r0.size();
        r5 = -1;
        r6 = 1;
        if (r3 <= 0) goto L_0x00b1;
    L_0x0070:
        r3 = r11.f27419g;	 Catch:{ IOException -> 0x007b }
        r0 = r3.m21930a(r0);	 Catch:{ IOException -> 0x007b }
        if (r0 != r5) goto L_0x0079;
    L_0x0078:
        goto L_0x008c;
    L_0x0079:
        r0 = 0;
        goto L_0x008d;
    L_0x007b:
        r0 = move-exception;
        r3 = "SDCardTileCache";
        r7 = 6;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r7);
        if (r3 == 0) goto L_0x008c;
    L_0x0085:
        r3 = "SDCardTileCache";
        r7 = "Error writing in the cache";
        android.util.Log.e(r3, r7, r0);
    L_0x008c:
        r0 = 1;
    L_0x008d:
        r1 = r1.iterator();
    L_0x0091:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x00b1;
    L_0x0097:
        r3 = r1.next();
        r3 = (android.util.Pair) r3;
        r7 = r3.first;
        r7 = (com.google.android.m4b.maps.br.C4875d) r7;
        r8 = r3.second;
        r8 = (com.google.android.m4b.maps.bo.az) r8;
        r8 = r8.mo5099d();
        r3 = r3.second;
        r3 = (com.google.android.m4b.maps.bo.az) r3;
        r7.mo5079a(r8, r0, r3);
        goto L_0x0091;
    L_0x00b1:
        r0 = r2.iterator();
    L_0x00b5:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00e5;
    L_0x00bb:
        r1 = r0.next();
        r1 = (com.google.android.m4b.maps.bs.C7470j.C4901b) r1;
        r2 = r1.f18000d;
        if (r2 <= 0) goto L_0x00d7;
    L_0x00c5:
        r2 = r11.f27419g;	 Catch:{ IOException -> 0x00d5 }
        r7 = r1.f17998b;	 Catch:{ IOException -> 0x00d5 }
        r3 = r1.f17999c;	 Catch:{ IOException -> 0x00d5 }
        r9 = r1.f18000d;	 Catch:{ IOException -> 0x00d5 }
        r2 = r2.m21929a(r7, r3, r9);	 Catch:{ IOException -> 0x00d5 }
        if (r2 != r5) goto L_0x00d7;
    L_0x00d3:
        r2 = 2;
        goto L_0x00d8;
    L_0x00d5:
        r2 = 1;
        goto L_0x00d8;
    L_0x00d7:
        r2 = 0;
    L_0x00d8:
        r3 = r1.f18004h;
        if (r3 == 0) goto L_0x00b5;
    L_0x00dc:
        r3 = r1.f18004h;
        r1 = r1.f18003g;
        r7 = 0;
        r3.mo5079a(r1, r2, r7);
        goto L_0x00b5;
    L_0x00e5:
        r0 = r11.f27424l;
        if (r0 == 0) goto L_0x00f3;
    L_0x00e9:
        r0 = r11.f27424l;
        r0.m28846c();
        r0 = r11.f27424l;
        r0.m28844b();
    L_0x00f3:
        return;
    L_0x00f4:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00f4 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.j.g_():void");
    }

    /* renamed from: b */
    public final boolean mo7092b() {
        return !this.f27418f.isEmpty();
    }

    /* renamed from: a */
    public final void mo7086a(com.google.android.m4b.maps.bo.ba r19, com.google.android.m4b.maps.bo.az r20, byte[] r21) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r18 = this;
        r1 = r18;
        r2 = r19;
        r9 = r20;
        r3 = r21;
        r4 = r1.f27419g;
        if (r4 != 0) goto L_0x0014;
    L_0x000c:
        r2 = new java.lang.IllegalStateException;
        r3 = "Uninitialized";
        r2.<init>(r3);
        throw r2;
    L_0x0014:
        r4 = r9 instanceof com.google.android.m4b.maps.bo.ad;
        if (r4 == 0) goto L_0x0020;
    L_0x0018:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Can't insert a MutableVectorTile into SD cache";
        r2.<init>(r3);
        throw r2;
    L_0x0020:
        r4 = r19.m21619b();
        r5 = 21;
        if (r4 > r5) goto L_0x00fe;
    L_0x0028:
        r4 = r1.f27421i;
        r4 = com.google.android.m4b.maps.az.C4733b.m21062a(r4, r2);
        r5 = r3.length;
        r6 = 0;
        if (r5 <= 0) goto L_0x00b0;
    L_0x0032:
        r5 = r9 instanceof com.google.android.m4b.maps.bo.C6521j;
        r7 = 0;
        r10 = -1;
        if (r5 == 0) goto L_0x0072;
    L_0x003a:
        r5 = r9;
        r5 = (com.google.android.m4b.maps.bo.C6521j) r5;
        r12 = r5.mo7073a();
        r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r14 == 0) goto L_0x0058;
    L_0x0045:
        r14 = com.google.android.m4b.maps.ay.C4712d.m20957c();
        r16 = r12 - r14;
        r12 = com.google.android.m4b.maps.ay.C4712d.m20956b();
        r14 = r16 + r12;
        r12 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1));
        if (r12 >= 0) goto L_0x0057;
    L_0x0055:
        r12 = r7;
        goto L_0x0058;
    L_0x0057:
        r12 = r14;
    L_0x0058:
        r14 = r5.mo7074b();
        r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r5 == 0) goto L_0x0074;
    L_0x0060:
        r10 = com.google.android.m4b.maps.ay.C4712d.m20957c();
        r16 = r14 - r10;
        r10 = com.google.android.m4b.maps.ay.C4712d.m20956b();
        r14 = r16 + r10;
        r5 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1));
        if (r5 >= 0) goto L_0x0074;
    L_0x0070:
        r14 = r7;
        goto L_0x0074;
    L_0x0072:
        r12 = r10;
        r14 = r12;
    L_0x0074:
        r5 = new java.io.ByteArrayOutputStream;
        r7 = r3.length;
        r8 = 24;
        r7 = r7 + r8;
        r5.<init>(r7);
        r7 = new java.io.DataOutputStream;
        r7.<init>(r5);
        r7.writeInt(r8);	 Catch:{ IOException -> 0x00a8, all -> 0x009c }
        r7.writeInt(r6);	 Catch:{ IOException -> 0x00a8, all -> 0x009c }
        r7.writeLong(r12);	 Catch:{ IOException -> 0x00a8, all -> 0x009c }
        r7.writeLong(r14);	 Catch:{ IOException -> 0x00a8, all -> 0x009c }
        r7.write(r3);	 Catch:{ IOException -> 0x00a8, all -> 0x009c }
        r3 = r5.toByteArray();
        r7.close();	 Catch:{ IOException -> 0x00b0 }
    L_0x0098:
        r5.close();	 Catch:{ IOException -> 0x00b0 }
        goto L_0x00b0;
    L_0x009c:
        r0 = move-exception;
        r2 = r0;
        r5.toByteArray();
        r7.close();	 Catch:{ IOException -> 0x00a7 }
        r5.close();	 Catch:{ IOException -> 0x00a7 }
    L_0x00a7:
        throw r2;
    L_0x00a8:
        r3 = r5.toByteArray();
        r7.close();	 Catch:{ IOException -> 0x00b0 }
        goto L_0x0098;
    L_0x00b0:
        r8 = r3;
        r11 = r1.f27418f;
        monitor-enter(r11);
        r3 = r1.f27418f;	 Catch:{ all -> 0x00fa }
        r3 = r3.get(r2);	 Catch:{ all -> 0x00fa }
        r12 = r3;	 Catch:{ all -> 0x00fa }
        r12 = (com.google.android.m4b.maps.bs.C7470j.C4901b) r12;	 Catch:{ all -> 0x00fa }
        if (r12 == 0) goto L_0x00c7;	 Catch:{ all -> 0x00fa }
    L_0x00bf:
        r3 = r12.f18000d;	 Catch:{ all -> 0x00fa }
        r3 = com.google.android.m4b.maps.bq.C4867g.m21800a(r3, r6);	 Catch:{ all -> 0x00fa }
        r7 = r3;	 Catch:{ all -> 0x00fa }
        goto L_0x00c8;	 Catch:{ all -> 0x00fa }
    L_0x00c7:
        r7 = 0;	 Catch:{ all -> 0x00fa }
    L_0x00c8:
        r13 = new com.google.android.m4b.maps.bs.j$b;	 Catch:{ all -> 0x00fa }
        r3 = r4.first;	 Catch:{ all -> 0x00fa }
        r3 = (java.lang.Long) r3;	 Catch:{ all -> 0x00fa }
        r5 = r3.longValue();	 Catch:{ all -> 0x00fa }
        r3 = r4.second;	 Catch:{ all -> 0x00fa }
        r10 = r3;	 Catch:{ all -> 0x00fa }
        r10 = (java.lang.String) r10;	 Catch:{ all -> 0x00fa }
        if (r12 == 0) goto L_0x00dc;	 Catch:{ all -> 0x00fa }
    L_0x00d9:
        r3 = r12.f18004h;	 Catch:{ all -> 0x00fa }
        goto L_0x00dd;	 Catch:{ all -> 0x00fa }
    L_0x00dc:
        r3 = 0;	 Catch:{ all -> 0x00fa }
    L_0x00dd:
        r14 = r3;	 Catch:{ all -> 0x00fa }
        r3 = r13;	 Catch:{ all -> 0x00fa }
        r4 = r5;	 Catch:{ all -> 0x00fa }
        r6 = r10;	 Catch:{ all -> 0x00fa }
        r10 = r14;	 Catch:{ all -> 0x00fa }
        r3.<init>(r4, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x00fa }
        r3 = r1.f27422j;	 Catch:{ all -> 0x00fa }
        r4 = r1.f27420h;	 Catch:{ all -> 0x00fa }
        if (r3 >= r4) goto L_0x00f8;	 Catch:{ all -> 0x00fa }
    L_0x00eb:
        r3 = r1.f27418f;	 Catch:{ all -> 0x00fa }
        r3.put(r2, r13);	 Catch:{ all -> 0x00fa }
        if (r12 != 0) goto L_0x00f8;	 Catch:{ all -> 0x00fa }
    L_0x00f2:
        r2 = r1.f27422j;	 Catch:{ all -> 0x00fa }
        r2 = r2 + 1;	 Catch:{ all -> 0x00fa }
        r1.f27422j = r2;	 Catch:{ all -> 0x00fa }
    L_0x00f8:
        monitor-exit(r11);	 Catch:{ all -> 0x00fa }
        return;	 Catch:{ all -> 0x00fa }
    L_0x00fa:
        r0 = move-exception;	 Catch:{ all -> 0x00fa }
        r2 = r0;	 Catch:{ all -> 0x00fa }
        monitor-exit(r11);	 Catch:{ all -> 0x00fa }
        throw r2;
    L_0x00fe:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.j.a(com.google.android.m4b.maps.bo.ba, com.google.android.m4b.maps.bo.az, byte[]):void");
    }
}
