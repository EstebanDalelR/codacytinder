package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Looper;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import android.widget.Toast;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C4714e.C4713a;
import com.google.android.m4b.maps.p101a.C4522h;
import com.google.android.m4b.maps.p101a.C4525k;
import com.google.android.m4b.maps.p101a.C4526l;
import com.google.android.m4b.maps.p101a.C4529m;
import com.google.android.m4b.maps.p101a.C4529m.C4527a;
import com.google.android.m4b.maps.p101a.C4532r;
import com.google.android.m4b.maps.p102b.C6425i;
import com.google.android.m4b.maps.p125y.C5566g;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5579p;
import com.tinder.api.ManagerWebServices;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.ay.m */
public class C6413m implements C4713a, C4723n {
    /* renamed from: g */
    private static final String f23780g = "m";
    /* renamed from: n */
    private static final long f23781n = TimeUnit.SECONDS.toMillis(15);
    /* renamed from: o */
    private static final long f23782o = TimeUnit.SECONDS.toMillis(2);
    /* renamed from: p */
    private static final long f23783p = TimeUnit.SECONDS.toMillis(30);
    /* renamed from: A */
    private volatile C4714e f23784A;
    /* renamed from: B */
    private int f23785B = -1;
    /* renamed from: C */
    private final SharedPreferences f23786C;
    /* renamed from: D */
    private C4526l f23787D;
    /* renamed from: a */
    protected final String f23788a;
    /* renamed from: b */
    protected final String f23789b;
    /* renamed from: c */
    protected final boolean f23790c;
    /* renamed from: d */
    protected final C4719b f23791d;
    /* renamed from: e */
    protected C4722e f23792e;
    /* renamed from: f */
    protected volatile boolean f23793f;
    /* renamed from: h */
    private String f23794h;
    /* renamed from: i */
    private volatile boolean f23795i;
    /* renamed from: j */
    private final String f23796j;
    /* renamed from: k */
    private Long f23797k;
    /* renamed from: l */
    private final List<C4724o> f23798l = new ArrayList();
    /* renamed from: m */
    private final Random f23799m = new Random();
    /* renamed from: q */
    private volatile boolean f23800q = false;
    /* renamed from: r */
    private volatile int f23801r;
    /* renamed from: s */
    private volatile boolean f23802s;
    /* renamed from: t */
    private long f23803t = 0;
    /* renamed from: u */
    private long f23804u = Long.MIN_VALUE;
    /* renamed from: v */
    private volatile int f23805v = 0;
    /* renamed from: w */
    private volatile String f23806w;
    /* renamed from: x */
    private C4729v f23807x;
    /* renamed from: y */
    private boolean f23808y = false;
    /* renamed from: z */
    private final C4712d f23809z;

    /* renamed from: com.google.android.m4b.maps.ay.m$b */
    public class C4719b {
        /* renamed from: a */
        private volatile String f17336a;
        /* renamed from: b */
        private /* synthetic */ C6413m f17337b;

        private C4719b(C6413m c6413m, String str) {
            this.f17337b = c6413m;
            this.f17336a = str;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private synchronized void m20994a() {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.f17337b;	 Catch:{ all -> 0x0027 }
            r0 = r0.m27996o();	 Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x000b;
        L_0x0009:
            monitor-exit(r3);
            return;
        L_0x000b:
            r0 = r3.f17337b;	 Catch:{ all -> 0x0027 }
            r0 = r0.f23792e;	 Catch:{ all -> 0x0027 }
            r1 = 1;
            r0 = r0.m21009a(true);	 Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025;
        L_0x0016:
            r1 = r0.f17338a;	 Catch:{ all -> 0x0027 }
            r1.m27990l();	 Catch:{ all -> 0x0027 }
            r1 = new java.lang.Thread;	 Catch:{ all -> 0x0027 }
            r2 = "DataRequestDispatcher";
            r1.<init>(r0, r2);	 Catch:{ all -> 0x0027 }
            r1.start();	 Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r3);
            return;
        L_0x0027:
            r0 = move-exception;
            monitor-exit(r3);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.m.b.a():void");
        }

        /* renamed from: c */
        private synchronized long m20998c() {
            if (this.f17337b.f23785B != 4) {
                return this.f17337b.f23803t;
            }
            return (this.f17337b.f23803t + 800) + (this.f17337b.f23799m.nextLong() % this.f17337b.f23803t);
        }

        /* renamed from: b */
        private void m20997b() {
            Object obj = (this.f17337b.m28009a() || !this.f17337b.f23792e.f17342b) ? null : 1;
            if (obj != null) {
                m20994a();
            }
        }

        /* renamed from: c */
        static /* synthetic */ void m20999c(C4719b c4719b) {
            c4719b.f17337b.mo4894f();
            c4719b.f17337b.m28000a(0);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.m$c */
    class C4720c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C6413m f17338a;
        /* renamed from: b */
        private final Vector<C4718l> f17339b;
        /* renamed from: c */
        private final C4716j f17340c;

        /* renamed from: com.google.android.m4b.maps.ay.m$c$1 */
        class C64121 extends C4525k<byte[]> {
            /* renamed from: a */
            private /* synthetic */ byte[] f23776a;
            /* renamed from: b */
            private /* synthetic */ C6425i f23777b;
            /* renamed from: c */
            private /* synthetic */ C4726q f23778c;
            /* renamed from: d */
            private /* synthetic */ C4720c f23779d;

            /* renamed from: j */
            public final String mo4888j() {
                return "application/binary";
            }

            C64121(C4720c c4720c, int i, String str, C4527a c4527a, byte[] bArr, C6425i c6425i, C4726q c4726q) {
                this.f23779d = c4720c;
                this.f23776a = bArr;
                this.f23777b = c6425i;
                this.f23778c = c4726q;
                super(1, str, c4527a);
            }

            /* renamed from: a */
            protected final /* synthetic */ void mo4886a(Object obj) {
                this.f23777b.mo4906a((byte[]) obj);
            }

            /* renamed from: h */
            public final Map<String, String> mo4887h() {
                return C4720c.m21004a(this.f23779d, this.f23776a);
            }

            /* renamed from: a */
            protected final C4529m<byte[]> mo4885a(C4522h c4522h) {
                try {
                    C4720c.m21005a(this.f23779d, c4522h.f16796a, (String) c4522h.f16798c.get(ManagerWebServices.PARAM_CONTENT_TYPE));
                    this.f23778c.m21038a();
                    return C4529m.m20455a(c4522h.f16797b, null);
                } catch (Throwable e) {
                    return C4529m.m20454a(new C4532r(e));
                }
            }

            /* renamed from: k */
            public final byte[] mo4889k() {
                return this.f23776a;
            }
        }

        C4720c(C6413m c6413m, Vector<C4718l> vector, C4716j c4716j) {
            this.f17338a = c6413m;
            this.f17339b = vector;
            this.f17340c = c4716j;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
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
            r9 = r18;
        L_0x0002:
            r1 = r9.f17338a;	 Catch:{ all -> 0x034e }
            r1 = r1.f23800q;	 Catch:{ all -> 0x034e }
            if (r1 == 0) goto L_0x0341;	 Catch:{ all -> 0x034e }
        L_0x000a:
            r1 = r9.f17339b;	 Catch:{ all -> 0x034e }
            r1 = r1.size();	 Catch:{ all -> 0x034e }
            if (r1 <= 0) goto L_0x0341;	 Catch:{ all -> 0x034e }
        L_0x0012:
            monitor-enter(r18);	 Catch:{ all -> 0x034e }
            r1 = r9.f17338a;	 Catch:{ all -> 0x033d }
            r1 = r1.f23791d;	 Catch:{ all -> 0x033d }
            r1 = r1.m20998c();	 Catch:{ all -> 0x033d }
            r3 = 0;
            r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
            if (r5 <= 0) goto L_0x0024;
        L_0x0021:
            r9.wait(r1);	 Catch:{ InterruptedException -> 0x0024 }
        L_0x0024:
            monitor-exit(r18);	 Catch:{ all -> 0x033d }
            r11 = 3;
            r1 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r12 = r1.size();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = new java.io.ByteArrayOutputStream;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1.<init>();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = new java.io.DataOutputStream;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.<init>(r1);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = new com.google.android.m4b.maps.ay.i;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = r9.f17340c;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3.<init>(r4, r5);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = r4.size();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r13 = 0;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r4 <= 0) goto L_0x0060;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0048:
            r4 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = r4.elementAt(r13);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = (com.google.android.m4b.maps.ay.C4718l) r4;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = r4 instanceof com.google.android.m4b.maps.ay.C7438i;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r4 == 0) goto L_0x005a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0054:
            r4 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4.setElementAt(r3, r13);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            goto L_0x0065;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x005a:
            r4 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4.insertElementAt(r3, r13);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            goto L_0x0065;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0060:
            r4 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4.insertElementAt(r3, r13);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0065:
            r14 = 23;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.writeShort(r14);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r3.m27999q();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.writeLong(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = com.google.android.m4b.maps.ay.C4725p.m21022a();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.writeUTF(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r3.f23788a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.writeUTF(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r3.f23789b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.writeUTF(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r3.f23796j;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.writeUTF(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r3.iterator();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0097:
            r4 = r3.hasNext();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r4 == 0) goto L_0x00ae;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x009d:
            r4 = r3.next();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = (com.google.android.m4b.maps.ay.C4718l) r4;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r4.mo7034g();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.writeByte(r5);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4.mo7032a(r2);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            goto L_0x0097;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x00ae:
            r2.flush();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r15 = r1.toByteArray();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = new com.google.android.m4b.maps.ay.q;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = r2.f23809z;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8.<init>(r1, r2);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7 = com.google.android.m4b.maps.p102b.C6425i.m28072a();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r1.f23791d;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = r1.f17336a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = new com.google.android.m4b.maps.ay.m$c$1;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = 1;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r6;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = r9;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r7;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r10 = r6;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = r15;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r16 = r7;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r17 = r8;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r10.m20427a(r13);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r1.f23787D;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1.mo4884a(r10);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = 0;
            r2 = r16;
            r2 = r2.get();	 Catch:{ ExecutionException -> 0x0220, IOException -> 0x0208, all -> 0x0204 }
            r2 = (byte[]) r2;	 Catch:{ ExecutionException -> 0x0220, IOException -> 0x0208, all -> 0x0204 }
            r3 = new java.io.DataInputStream;	 Catch:{ ExecutionException -> 0x0220, IOException -> 0x0208, all -> 0x0204 }
            r4 = new java.io.ByteArrayInputStream;	 Catch:{ ExecutionException -> 0x0220, IOException -> 0x0208, all -> 0x0204 }
            r4.<init>(r2);	 Catch:{ ExecutionException -> 0x0220, IOException -> 0x0208, all -> 0x0204 }
            r3.<init>(r4);	 Catch:{ ExecutionException -> 0x0220, IOException -> 0x0208, all -> 0x0204 }
            r1 = r3.readUnsignedShort();	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r4 = 1;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            if (r1 == r14) goto L_0x0110;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
        L_0x0103:
            r1 = r9.f17338a;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r1.m28000a(r4);	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r1 = new java.io.IOException;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r2 = "Protocol version mismatch with the server";	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r1.<init>(r2);	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            throw r1;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
        L_0x0110:
            r9.m21006a(r3);	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r1 = r15.length;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r2 = r2.length;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r5 = r17;	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r5.m21039a(r1, r2);	 Catch:{ ExecutionException -> 0x0202, IOException -> 0x0200 }
            r3.close();	 Catch:{ IOException -> 0x011e, SecurityException -> 0x0334, d -> 0x032a, Throwable -> 0x0317 }
            goto L_0x014f;
        L_0x011e:
            r0 = move-exception;
            r1 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = com.google.android.m4b.maps.ay.C4728u.m21050a(r1, r11);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r1 == 0) goto L_0x014f;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0129:
            r1 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = java.lang.String.valueOf(r0);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = java.lang.String.valueOf(r2);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r5.length();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r5 + 12;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3.<init>(r5);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = "Closing is: ";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3.append(r5);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3.append(r2);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = r3.toString();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            android.util.Log.d(r1, r2);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x014f:
            r1 = new java.util.ArrayList;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1.<init>();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = r2.iterator();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x015a:
            r3 = r2.hasNext();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r3 == 0) goto L_0x01dc;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0160:
            r3 = r2.next();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = (com.google.android.m4b.maps.ay.C4718l) r3;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r3.mo4879b();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r5 != 0) goto L_0x01a7;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x016c:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = com.google.android.m4b.maps.ay.C4728u.m21050a(r5, r11);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r5 == 0) goto L_0x01a1;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0176:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = java.lang.String.valueOf(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = java.lang.String.valueOf(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8.length();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8 + 31;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.<init>(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = "Error processing: ";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = " not retrying";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = r7.toString();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            android.util.Log.d(r5, r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x01a1:
            r5 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5.m28012b(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            goto L_0x015a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x01a7:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = com.google.android.m4b.maps.ay.C4728u.m21050a(r5, r11);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r5 == 0) goto L_0x01d7;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x01b1:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = java.lang.String.valueOf(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = java.lang.String.valueOf(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8.length();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8 + 10;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.<init>(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = "Retrying: ";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = r7.toString();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            android.util.Log.d(r5, r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x01d7:
            r1.add(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            goto L_0x015a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x01dc:
            r2 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.removeAllElements();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.addAll(r1);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1.f23808y = true;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1.m27998p();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1 = r1.size();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r12 != r1) goto L_0x0002;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x01f8:
            r1 = new java.io.IOException;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = "No requests are processed";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r1.<init>(r2);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            throw r1;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0200:
            r0 = move-exception;
            goto L_0x020a;
        L_0x0202:
            r0 = move-exception;
            goto L_0x0222;
        L_0x0204:
            r0 = move-exception;
            r3 = r1;
        L_0x0206:
            r1 = r0;
            goto L_0x0248;
        L_0x0208:
            r0 = move-exception;
            r3 = r1;
        L_0x020a:
            r1 = r0;
            r2 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ all -> 0x0246 }
            r4 = 5;	 Catch:{ all -> 0x0246 }
            r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r4);	 Catch:{ all -> 0x0246 }
            if (r2 == 0) goto L_0x021f;	 Catch:{ all -> 0x0246 }
        L_0x0216:
            r2 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ all -> 0x0246 }
            r4 = "Exception when processing the responses";	 Catch:{ all -> 0x0246 }
            android.util.Log.w(r2, r4, r1);	 Catch:{ all -> 0x0246 }
        L_0x021f:
            throw r1;	 Catch:{ all -> 0x0246 }
        L_0x0220:
            r0 = move-exception;	 Catch:{ all -> 0x0246 }
            r3 = r1;	 Catch:{ all -> 0x0246 }
        L_0x0222:
            r1 = r0;	 Catch:{ all -> 0x0246 }
            r1 = r1.getCause();	 Catch:{ all -> 0x0246 }
            r1 = (com.google.android.m4b.maps.p101a.C4532r) r1;	 Catch:{ all -> 0x0246 }
            r2 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ all -> 0x0246 }
            r4 = 5;	 Catch:{ all -> 0x0246 }
            r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r4);	 Catch:{ all -> 0x0246 }
            if (r2 == 0) goto L_0x0241;	 Catch:{ all -> 0x0246 }
        L_0x0234:
            r2 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ all -> 0x0246 }
            r4 = "Exception when executing the requests";	 Catch:{ all -> 0x0246 }
            r5 = r1.getCause();	 Catch:{ all -> 0x0246 }
            android.util.Log.w(r2, r4, r5);	 Catch:{ all -> 0x0246 }
        L_0x0241:
            r1 = r1.getCause();	 Catch:{ all -> 0x0246 }
            throw r1;	 Catch:{ all -> 0x0246 }
        L_0x0246:
            r0 = move-exception;
            goto L_0x0206;
        L_0x0248:
            if (r3 == 0) goto L_0x027f;
        L_0x024a:
            r3.close();	 Catch:{ IOException -> 0x024e, SecurityException -> 0x0334, d -> 0x032a, Throwable -> 0x0317 }
            goto L_0x027f;
        L_0x024e:
            r0 = move-exception;
            r2 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r11);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r2 == 0) goto L_0x027f;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0259:
            r2 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = java.lang.String.valueOf(r0);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = java.lang.String.valueOf(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r5.length();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r5 + 12;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4.<init>(r5);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = "Closing is: ";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4.append(r5);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4.append(r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r4.toString();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            android.util.Log.d(r2, r3);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x027f:
            r2 = new java.util.ArrayList;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r2.<init>();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r3.iterator();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x028a:
            r4 = r3.hasNext();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r4 == 0) goto L_0x030c;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0290:
            r4 = r3.next();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r4 = (com.google.android.m4b.maps.ay.C4718l) r4;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = r4.mo4879b();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r5 != 0) goto L_0x02d7;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x029c:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = com.google.android.m4b.maps.ay.C4728u.m21050a(r5, r11);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r5 == 0) goto L_0x02d1;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x02a6:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = java.lang.String.valueOf(r4);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = java.lang.String.valueOf(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8.length();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8 + 31;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.<init>(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = "Error processing: ";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = " not retrying";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = r7.toString();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            android.util.Log.d(r5, r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x02d1:
            r5 = r9.f17338a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5.m28012b(r4);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            goto L_0x028a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x02d7:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r5 = com.google.android.m4b.maps.ay.C4728u.m21050a(r5, r11);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            if (r5 == 0) goto L_0x0307;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x02e1:
            r5 = com.google.android.m4b.maps.ay.C6413m.f23780g;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = java.lang.String.valueOf(r4);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = java.lang.String.valueOf(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8.length();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = r8 + 10;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.<init>(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r8 = "Retrying: ";	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r8);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r7.append(r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r6 = r7.toString();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            android.util.Log.d(r5, r6);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0307:
            r2.add(r4);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            goto L_0x028a;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x030c:
            r3 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3.removeAllElements();	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3 = r9.f17339b;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            r3.addAll(r2);	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
            throw r1;	 Catch:{ SecurityException -> 0x0334, d -> 0x032a, IOException -> 0x0321, Throwable -> 0x0317 }
        L_0x0317:
            r0 = move-exception;
            r1 = r0;
            r2 = r9.f17338a;	 Catch:{ all -> 0x034e }
            r3 = 5;	 Catch:{ all -> 0x034e }
            com.google.android.m4b.maps.ay.C6413m.m27973a(r2, r3, r1);	 Catch:{ all -> 0x034e }
            goto L_0x0002;	 Catch:{ all -> 0x034e }
        L_0x0321:
            r0 = move-exception;	 Catch:{ all -> 0x034e }
            r1 = r0;	 Catch:{ all -> 0x034e }
            r2 = r9.f17338a;	 Catch:{ all -> 0x034e }
            com.google.android.m4b.maps.ay.C6413m.m27973a(r2, r11, r1);	 Catch:{ all -> 0x034e }
            goto L_0x0002;	 Catch:{ all -> 0x034e }
        L_0x032a:
            r0 = move-exception;	 Catch:{ all -> 0x034e }
            r1 = r0;	 Catch:{ all -> 0x034e }
            r2 = r9.f17338a;	 Catch:{ all -> 0x034e }
            r3 = 4;	 Catch:{ all -> 0x034e }
            com.google.android.m4b.maps.ay.C6413m.m27973a(r2, r3, r1);	 Catch:{ all -> 0x034e }
            goto L_0x0002;	 Catch:{ all -> 0x034e }
        L_0x0334:
            r1 = r9.f17338a;	 Catch:{ all -> 0x034e }
            r1 = r1.f23791d;	 Catch:{ all -> 0x034e }
            com.google.android.m4b.maps.ay.C6413m.C4719b.m20999c(r1);	 Catch:{ all -> 0x034e }
            goto L_0x0002;
        L_0x033d:
            r0 = move-exception;
            r1 = r0;
            monitor-exit(r18);	 Catch:{ all -> 0x033d }
            throw r1;	 Catch:{ all -> 0x034e }
        L_0x0341:
            r1 = r9.f17338a;
            r1.m27991m();
            r1 = r9.f17338a;
            r1 = r1.f23791d;
            r1.m20997b();
            return;
        L_0x034e:
            r0 = move-exception;
            r1 = r0;
            r2 = r9.f17338a;
            r2.m27991m();
            r2 = r9.f17338a;
            r2 = r2.f23791d;
            r2.m20997b();
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.m.c.run():void");
        }

        /* renamed from: a */
        private String m21003a() {
            StringBuilder stringBuilder = new StringBuilder();
            String str = "";
            Iterator it = this.f17339b.iterator();
            while (it.hasNext()) {
                C4718l c4718l = (C4718l) it.next();
                stringBuilder.append(str);
                str = ",";
                stringBuilder.append(c4718l.mo7034g());
            }
            return stringBuilder.toString();
        }

        /* renamed from: a */
        private void m21006a(DataInput dataInput) {
            Collection arrayList = new ArrayList();
            C4718l c4718l = null;
            int i = 0;
            while (i < this.f17339b.size()) {
                C4718l c4718l2;
                int readUnsignedByte;
                int g;
                try {
                    c4718l2 = (C4718l) this.f17339b.get(i);
                    try {
                        if (C4728u.m21050a(C6413m.f23780g, 3)) {
                            String k = C6413m.f23780g;
                            String valueOf = String.valueOf(c4718l2);
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                            stringBuilder.append("Processing DataRequest: ");
                            stringBuilder.append(valueOf);
                            Log.d(k, stringBuilder.toString());
                        }
                        readUnsignedByte = dataInput.readUnsignedByte();
                        if (readUnsignedByte != c4718l2.mo7034g()) {
                            StringBuilder stringBuilder2;
                            if (C4728u.m21050a(C6413m.f23780g, 3) != null) {
                                dataInput = C6413m.f23780g;
                                g = c4718l2.mo7034g();
                                stringBuilder2 = new StringBuilder(64);
                                stringBuilder2.append("Expecting request type: ");
                                stringBuilder2.append(g);
                                stringBuilder2.append(" got: ");
                                stringBuilder2.append(readUnsignedByte);
                                stringBuilder2.append(".  ABORTING!");
                                Log.d(dataInput, stringBuilder2.toString());
                            }
                            g = c4718l2.mo7034g();
                            stringBuilder2 = new StringBuilder(30);
                            stringBuilder2.append("RT: ");
                            stringBuilder2.append(readUnsignedByte);
                            stringBuilder2.append(" != ");
                            stringBuilder2.append(g);
                            throw new IOException(stringBuilder2.toString());
                        }
                        Object obj;
                        if (c4718l2.mo7033a(dataInput)) {
                            this.f17338a.m28005a(c4718l2);
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            arrayList.add(c4718l2);
                        }
                        i++;
                        c4718l = c4718l2;
                    } catch (IOException e) {
                        dataInput = e;
                    } catch (RuntimeException e2) {
                        dataInput = e2;
                    }
                } catch (IOException e3) {
                    dataInput = e3;
                    c4718l2 = c4718l;
                } catch (RuntimeException e4) {
                    dataInput = e4;
                    c4718l2 = c4718l;
                } catch (Throwable th) {
                    if (i < this.f17339b.size()) {
                        arrayList.addAll(this.f17339b.subList(i, this.f17339b.size()));
                    }
                    this.f17339b.clear();
                    this.f17339b.addAll(arrayList);
                }
            }
            if (i < this.f17339b.size()) {
                arrayList.addAll(this.f17339b.subList(i, this.f17339b.size()));
            }
            this.f17339b.clear();
            this.f17339b.addAll(arrayList);
            return;
            if (C4728u.m21050a(C6413m.f23780g, 6)) {
                String k2 = C6413m.f23780g;
                readUnsignedByte = c4718l2.mo7034g();
                StringBuilder stringBuilder3 = new StringBuilder(29);
                stringBuilder3.append("RunTimeException: ");
                stringBuilder3.append(readUnsignedByte);
                Log.e(k2, stringBuilder3.toString());
            }
            throw dataInput;
            if (C4728u.m21050a(C6413m.f23780g, 6)) {
                k2 = C6413m.f23780g;
                readUnsignedByte = c4718l2.mo7034g();
                stringBuilder3 = new StringBuilder(24);
                stringBuilder3.append("IOException: ");
                stringBuilder3.append(readUnsignedByte);
                Log.e(k2, stringBuilder3.toString());
            }
            if (dataInput instanceof EOFException) {
                c4718l2.mo4880c();
                if (this.f17338a.f23790c) {
                    g = c4718l2.mo7034g();
                    StringBuilder stringBuilder4 = new StringBuilder(47);
                    stringBuilder4.append("No server support for data request: ");
                    stringBuilder4.append(g);
                    this.f17338a.m28001a(7, stringBuilder4.toString());
                }
            }
            throw dataInput;
        }

        /* renamed from: a */
        static /* synthetic */ Map m21004a(C4720c c4720c, byte[] bArr) {
            Map hashMap = new HashMap();
            hashMap.put(ManagerWebServices.PARAM_CONTENT_TYPE, "application/binary");
            hashMap.put("Content-Length", String.valueOf(bArr.length));
            if (C5579p.m24319b(c4720c.f17338a.f23806w) == null) {
                bArr = "Authorization";
                String str = "Bearer ";
                String valueOf = String.valueOf(c4720c.f17338a.f23806w);
                hashMap.put(bArr, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            if (c4720c.f17338a.f23795i != null) {
                bArr = "X-Google-Maps-Mobile-API";
                str = c4720c.f17338a.mo4895j();
                valueOf = c4720c.f17340c.m20971c();
                String b = c4720c.f17340c.m20967b();
                C5571j.m24302b(valueOf != null, (Object) "app version not set");
                C5571j.m24302b(b != null, (Object) "gmm version not set");
                hashMap.put(bArr, C5566g.m24265a(',').m24270a(str, valueOf, c4720c.f17338a.f23789b, b, c4720c.f17338a.f23788a));
            }
            return hashMap;
        }

        /* renamed from: a */
        static /* synthetic */ void m21005a(C4720c c4720c, int i, String str) {
            StringBuilder stringBuilder;
            String str2;
            if (i != Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                if (C4728u.m21050a(C6413m.f23780g, 5) != null) {
                    str = C6413m.f23780g;
                    stringBuilder = new StringBuilder(35);
                    stringBuilder.append("Bad HTTP response code: ");
                    stringBuilder.append(i);
                    Log.w(str, stringBuilder.toString());
                }
                if (i == 500) {
                    str = c4720c.f17339b.iterator();
                    while (str.hasNext()) {
                        ((C4718l) str.next()).mo4880c();
                    }
                    if (c4720c.f17338a.f23790c != null) {
                        str = c4720c.f17338a;
                        str2 = "Server 500 for request types: ";
                        String valueOf = String.valueOf(c4720c.m21003a());
                        str.m28001a(7, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    c4720c = c4720c.m21003a();
                    stringBuilder = new StringBuilder(String.valueOf(c4720c).length() + 41);
                    stringBuilder.append("Serverside failure (HTTP");
                    stringBuilder.append(i);
                    stringBuilder.append(") for ");
                    stringBuilder.append(c4720c);
                    throw new C4721d(stringBuilder.toString());
                }
                if (i != 403 || c4720c.f17338a.f23795i == null) {
                    if (i == 501) {
                        c4720c.f17338a.m28000a(2);
                        throw new IOException("Server side HTTP not implemented");
                    } else if (i == 400 && c4720c.f17338a.f23795i != null) {
                        c4720c.f17338a.m28018d();
                    }
                } else if (c4720c.f17338a.f23784A != null) {
                    c4720c.f17338a.f23784A.mo4869d();
                    c4720c.f17338a.f23784A.mo4865a(c4720c.f17338a);
                }
                c4720c = c4720c.m21003a();
                stringBuilder = new StringBuilder(String.valueOf(c4720c).length() + 40);
                stringBuilder.append("Bad HTTP response code: ");
                stringBuilder.append(i);
                stringBuilder.append(" for ");
                stringBuilder.append(c4720c);
                throw new IOException(stringBuilder.toString());
            } else if ("application/binary".equals(str) == 0) {
                if (C4728u.m21050a(C6413m.f23780g, 6) != 0) {
                    i = C6413m.f23780g;
                    String str3 = "Bad HTTP content type: ";
                    str2 = String.valueOf(str);
                    Log.e(i, str2.length() != 0 ? str3.concat(str2) : new String(str3));
                }
                c4720c = c4720c.m21003a();
                stringBuilder = new StringBuilder((String.valueOf(str).length() + 28) + String.valueOf(c4720c).length());
                stringBuilder.append("Bad HTTP content type: ");
                stringBuilder.append(str);
                stringBuilder.append(" for ");
                stringBuilder.append(c4720c);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.m$d */
    static class C4721d extends Exception {
        C4721d(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.m$e */
    public class C4722e {
        /* renamed from: a */
        private Vector<C4718l> f17341a;
        /* renamed from: b */
        private boolean f17342b;
        /* renamed from: c */
        private final C4716j f17343c;
        /* renamed from: d */
        private /* synthetic */ C6413m f17344d;

        private C4722e(C6413m c6413m, C4716j c4716j) {
            this.f17344d = c6413m;
            this.f17341a = new Vector();
            this.f17342b = null;
            this.f17343c = c4716j;
        }

        /* renamed from: a */
        public final void m21011a(C4718l c4718l) {
            c4718l.mo4883f();
            if (C4728u.m21050a(C6413m.f23780g, 3)) {
                String k = C6413m.f23780g;
                int g = c4718l.mo7034g();
                StringBuilder stringBuilder = new StringBuilder(29);
                stringBuilder.append("Add Data Request: ");
                stringBuilder.append(g);
                Log.d(k, stringBuilder.toString());
            }
            boolean z = this.f17344d.f23793f;
            synchronized (this) {
                if (c4718l.mo4878a()) {
                    this.f17342b = true;
                }
                this.f17341a.add(c4718l);
            }
            if (c4718l.mo4878a() != null && this.f17344d.m28009a() == null) {
                this.f17344d.f23791d.m20994a();
            }
        }

        /* renamed from: a */
        private C4720c m21009a(boolean z) {
            synchronized (this) {
                if (this.f17341a.size() == 0) {
                    return null;
                } else if (!z || this.f17342b) {
                    if (this.f17344d.f23784A) {
                        z = this.f17344d.f23784A.mo4868c();
                        if (z) {
                            synchronized (this.f17344d.f23792e.f17343c) {
                                this.f17344d.f23792e.f17343c.m20976d(z);
                            }
                        }
                    }
                    z = new C4720c(this.f17344d, this.f17341a, this.f17343c);
                    this.f17341a = new Vector();
                    this.f17342b = false;
                    return z;
                } else {
                    return null;
                }
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.m$a */
    class C7439a extends C6409f {
        /* renamed from: a */
        private /* synthetic */ C6413m f27248a;

        /* renamed from: a */
        public final void mo7032a(DataOutput dataOutput) {
        }

        /* renamed from: a */
        public final boolean mo4878a() {
            return false;
        }

        /* renamed from: g */
        public final int mo7034g() {
            return 15;
        }

        private C7439a(C6413m c6413m) {
            this.f27248a = c6413m;
        }

        /* renamed from: a */
        public final synchronized boolean mo7033a(DataInput dataInput) {
            this.f27248a.f23797k = Long.valueOf(dataInput.readLong());
            if (C4728u.m21050a(C6413m.f23780g, 4) != null) {
                dataInput = C6413m.f23780g;
                String str = "GMM Server Cookie: ";
                String valueOf = String.valueOf(Long.toHexString(this.f27248a.f23797k.longValue()));
                Log.i(dataInput, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            C6413m.m27974a(this.f27248a, this.f27248a.f23797k.longValue());
            return true;
        }
    }

    /* renamed from: l */
    private synchronized void m27990l() {
        this.f23805v++;
    }

    /* renamed from: m */
    private synchronized void m27991m() {
        this.f23805v--;
    }

    /* renamed from: a */
    public static C6413m m27971a(Context context, String str, String str2, boolean z, C4716j c4716j, C4526l c4526l) {
        return new C6413m(context, str, str2, z, c4716j, c4526l);
    }

    private C6413m(Context context, String str, String str2, boolean z, C4716j c4716j, C4526l c4526l) {
        String str3 = "https://clients4.google.com/glm/mmap";
        String str4 = (String) C4731z.m21053a("debug.mapview.gmmserver").mo5813a("");
        if (str4.startsWith("http")) {
            Object obj;
            String valueOf;
            String host = Uri.parse(str4).getHost();
            if (!host.endsWith(".google.com")) {
                if (!host.equals("localhost")) {
                    obj = null;
                    if (obj != null) {
                        if (C4728u.m21050a(f23780g, 4)) {
                            str3 = f23780g;
                            host = "Hitting custom GMM server: ";
                            valueOf = String.valueOf(str4);
                            Log.i(str3, valueOf.length() == 0 ? host.concat(valueOf) : new String(host));
                        }
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            str3 = "Hitting custom GMM server: ";
                            host = String.valueOf(str4);
                            Toast.makeText(context, host.length() == 0 ? str3.concat(host) : new String(str3), 1).show();
                        }
                        str3 = str4;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                if (C4728u.m21050a(f23780g, 4)) {
                    str3 = f23780g;
                    host = "Hitting custom GMM server: ";
                    valueOf = String.valueOf(str4);
                    if (valueOf.length() == 0) {
                    }
                    Log.i(str3, valueOf.length() == 0 ? host.concat(valueOf) : new String(host));
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    str3 = "Hitting custom GMM server: ";
                    host = String.valueOf(str4);
                    if (host.length() == 0) {
                    }
                    Toast.makeText(context, host.length() == 0 ? str3.concat(host) : new String(str3), 1).show();
                }
                str3 = str4;
            }
        }
        if (!str3.endsWith("/api")) {
            str3 = String.valueOf(str3).concat("/api");
        }
        this.f23794h = str3;
        this.f23789b = str2;
        this.f23788a = str;
        this.f23796j = af.m20940b(context);
        this.f23786C = context.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
        this.f23790c = z;
        this.f23809z = new C4712d();
        this.f23787D = c4526l;
        this.f23791d = new C4719b(this.f23794h);
        this.f23792e = new C4722e(c4716j);
        if (C4728u.m21050a(f23780g, 3) != null) {
            context = f23780g;
            str = "Using server: ";
            str2 = String.valueOf(this.f23794h);
            Log.d(context, str2.length() ? str.concat(str2) : new String(str));
        }
    }

    /* renamed from: a */
    public final synchronized boolean m28009a() {
        return this.f23801r > 0;
    }

    /* renamed from: b */
    public final synchronized void m28010b() {
        this.f23801r++;
    }

    /* renamed from: c */
    public final void m28015c() {
        synchronized (this) {
            this.f23801r--;
            if (m28009a()) {
                return;
            }
            this.f23791d.m20997b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo4892a(C4724o c4724o) {
        if (!this.f23798l.contains(c4724o)) {
            this.f23798l.add(c4724o);
        }
    }

    /* renamed from: b */
    public final synchronized void m28013b(C4724o c4724o) {
        this.f23798l.remove(c4724o);
    }

    /* renamed from: n */
    private synchronized C4724o[] m27994n() {
        C4724o[] c4724oArr;
        c4724oArr = new C4724o[this.f23798l.size()];
        this.f23798l.toArray(c4724oArr);
        return c4724oArr;
    }

    /* renamed from: a */
    protected final void m28005a(C4718l c4718l) {
        for (C4724o a : m27994n()) {
            a.mo4873a(c4718l);
        }
    }

    /* renamed from: a */
    protected final void m28001a(int i, String str) {
        for (C4724o a : m27994n()) {
            a.mo4872a(i, str);
        }
    }

    /* renamed from: b */
    protected final void m28012b(C4718l c4718l) {
        for (C4724o b : m27994n()) {
            b.mo4874b(c4718l);
        }
    }

    /* renamed from: d */
    protected final void m28018d() {
        m27994n();
    }

    /* renamed from: a */
    protected final void m28000a(int i) {
        synchronized (this) {
            boolean z = true;
            if (this.f23802s) {
                z = false;
            } else {
                if (C4728u.m21050a(f23780g, 6)) {
                    Log.e(f23780g, "In Error Mode");
                }
                this.f23802s = true;
                this.f23804u = Long.MIN_VALUE;
            }
        }
        if (z) {
            m28001a(i, null);
        }
    }

    /* renamed from: c */
    public final void mo4893c(C4718l c4718l) {
        this.f23792e.m21011a(c4718l);
    }

    /* renamed from: e */
    public final synchronized boolean m28019e() {
        return this.f23802s;
    }

    /* renamed from: o */
    private synchronized boolean m27996o() {
        boolean z;
        z = this.f23800q && this.f23805v < 10 && (this.f23808y || this.f23805v == 0);
        return z;
    }

    /* renamed from: f */
    public final void mo4894f() {
        this.f23800q = false;
    }

    /* renamed from: g */
    public final void m28021g() {
        this.f23800q = true;
        this.f23791d.m20997b();
    }

    /* renamed from: p */
    private synchronized void m27998p() {
        this.f23804u = Long.MIN_VALUE;
        this.f23802s = false;
        this.f23803t = 0;
        this.f23785B = -1;
    }

    /* renamed from: a */
    public final void mo4890a(int i, byte[] bArr, boolean z, boolean z2, boolean z3) {
        this.f23792e.m21011a(new C7441y(i, bArr, z, null));
    }

    /* renamed from: q */
    private synchronized long m27999q() {
        if (this.f23797k == null) {
            long j = this.f23786C.getLong("SessionID", 0);
            if (j == 0) {
                this.f23792e.m21011a(new C7439a());
            } else if (C4728u.m21050a(f23780g, 4)) {
                String str = f23780g;
                String str2 = "GMM Server Cookie (cached): ";
                String valueOf = String.valueOf(Long.toHexString(j));
                Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.f23797k = Long.valueOf(j);
        }
        return this.f23797k.longValue();
    }

    /* renamed from: h */
    public final String m28022h() {
        return m27979d("Cohort");
    }

    /* renamed from: a */
    final void m28007a(String str) {
        m27975a("Cohort", str);
    }

    /* renamed from: i */
    public final String m28023i() {
        return m27979d("LegalCountry");
    }

    /* renamed from: b */
    final void m28014b(String str) {
        m27975a("LegalCountry", str);
    }

    /* renamed from: d */
    private String m27979d(String str) {
        return this.f23786C.getString(str, null);
    }

    /* renamed from: a */
    private void m27975a(String str, String str2) {
        Editor edit = this.f23786C.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: a */
    public final void m28008a(boolean z) {
        this.f23795i = true;
    }

    /* renamed from: c */
    public final void m28017c(String str) {
        this.f23806w = str;
    }

    /* renamed from: b */
    public final void m28011b(C4714e c4714e) {
        this.f23784A = c4714e;
    }

    /* renamed from: j */
    public final String mo4895j() {
        return this.f23792e.f17343c.m20975d();
    }

    /* renamed from: a */
    public final void mo4891a(C4714e c4714e) {
        synchronized (this.f23792e.f17343c) {
            this.f23792e.f17343c.m20976d(c4714e.mo4868c());
        }
        this.f23791d.m20994a();
    }

    /* renamed from: a */
    public final void m28003a(C4662a c4662a) {
        if (this.f23807x == null) {
            this.f23807x = new C4729v();
        }
        this.f23807x.m21051a(c4662a, this.f23786C);
    }

    /* renamed from: a */
    static /* synthetic */ void m27973a(C6413m c6413m, int i, Throwable th) {
        synchronized (c6413m) {
            c6413m.f23785B = i;
            if (i == 4) {
                if (c6413m.f23803t != 0) {
                    if (c6413m.f23802s == null) {
                        if (c6413m.f23803t < f23783p) {
                            c6413m.f23803t *= 2;
                        }
                    }
                }
                c6413m.m27998p();
                c6413m.f23785B = i;
                c6413m.f23803t = 200;
            } else if (c6413m.f23802s == null) {
                c6413m.f23803t = 200;
                if (c6413m.f23804u == Long.MIN_VALUE) {
                    c6413m.f23804u = C4712d.m20957c();
                } else if (c6413m.f23804u + f23781n < C4712d.m20957c()) {
                    th = true;
                }
            } else {
                if (c6413m.f23803t < f23782o) {
                    c6413m.f23803t = f23782o;
                } else {
                    c6413m.f23803t = (c6413m.f23803t * 5) / 4;
                }
                if (c6413m.f23803t > f23783p) {
                    c6413m.f23803t = f23783p;
                }
            }
            th = null;
        }
        if (th != null) {
            c6413m.m28000a(i);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m27974a(C6413m c6413m, long j) {
        c6413m = c6413m.f23786C.edit();
        c6413m.putLong("SessionID", j);
        c6413m.commit();
    }
}
