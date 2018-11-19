package com.google.android.m4b.maps.p105e;

import android.content.Context;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.cu.C5306g;
import com.google.android.m4b.maps.dd.C5326a.C7535d;
import com.google.android.m4b.maps.p106f.C6671a;
import com.google.android.m4b.maps.p106f.C7538b;
import com.google.android.m4b.maps.p108h.C5406b;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5406b.C5402b;
import com.google.android.m4b.maps.p108h.C5406b.C5403c;
import com.google.android.m4b.maps.p108h.C5414d;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p108h.C5425k;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p108h.C6691q;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p113m.C5477c;
import com.google.android.m4b.maps.p113m.C6715d;
import com.google.android.m4b.maps.p120t.C6770a;
import java.util.TimeZone;

/* renamed from: com.google.android.m4b.maps.e.a */
public final class C5362a {
    /* renamed from: a */
    public static final C5403c<C7538b> f20231a = new C5403c();
    /* renamed from: b */
    public static final C5406b<Object> f20232b = new C5406b("ClearcutLogger.API", f20233c, f20231a, new C6690o[0]);
    /* renamed from: c */
    private static C5402b<C7538b, Object> f20233c = new C66681();
    /* renamed from: d */
    private static C5363b f20234d = new C6671a();
    /* renamed from: e */
    private final String f20235e;
    /* renamed from: f */
    private final int f20236f;
    /* renamed from: g */
    private String f20237g;
    /* renamed from: h */
    private int f20238h;
    /* renamed from: i */
    private String f20239i;
    /* renamed from: j */
    private String f20240j;
    /* renamed from: k */
    private final boolean f20241k;
    /* renamed from: l */
    private final C5363b f20242l;
    /* renamed from: m */
    private final C5477c f20243m;
    /* renamed from: n */
    private final C5361c f20244n;

    /* renamed from: com.google.android.m4b.maps.e.a$a */
    public class C5359a {
        /* renamed from: a */
        private int f20223a;
        /* renamed from: b */
        private String f20224b;
        /* renamed from: c */
        private String f20225c;
        /* renamed from: d */
        private String f20226d;
        /* renamed from: e */
        private final C5360b f20227e;
        /* renamed from: f */
        private final C7535d f20228f;
        /* renamed from: g */
        private boolean f20229g;
        /* renamed from: h */
        private /* synthetic */ C5362a f20230h;

        private C5359a(C5362a c5362a, byte[] bArr) {
            this(c5362a, bArr, null);
        }

        private C5359a(C5362a c5362a, byte[] bArr, C5360b c5360b) {
            this.f20230h = c5362a;
            this.f20223a = this.f20230h.f20238h;
            this.f20224b = this.f20230h.f20237g;
            this.f20225c = this.f20230h.f20239i;
            this.f20226d = this.f20230h.f20240j;
            this.f20228f = new C7535d();
            this.f20229g = null;
            this.f20225c = c5362a.f20239i;
            this.f20226d = c5362a.f20240j;
            this.f20228f.f28127a = c5362a.f20243m.mo5485a();
            c5360b = this.f20228f;
            c5362a.f20244n;
            c5360b.f28129c = (long) (TimeZone.getDefault().getOffset(this.f20228f.f28127a) / AdError.NETWORK_ERROR_CODE);
            if (bArr != null) {
                this.f20228f.f28128b = bArr;
            }
            this.f20227e = null;
        }

        /* renamed from: a */
        public final C5425k<C6691q> m23546a(C5414d c5414d) {
            if (this.f20229g) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f20229g = true;
            return this.f20230h.f20242l.mo5398a(c5414d, new C6669c(new C6770a(this.f20230h.f20235e, this.f20230h.f20236f, this.f20223a, this.f20224b, this.f20225c, this.f20226d, this.f20230h.f20241k), this.f20228f, this.f20227e));
        }
    }

    /* renamed from: com.google.android.m4b.maps.e.a$b */
    public interface C5360b {
        /* renamed from: a */
        byte[] m23547a();
    }

    /* renamed from: com.google.android.m4b.maps.e.a$c */
    public static class C5361c {
    }

    /* renamed from: com.google.android.m4b.maps.e.a$1 */
    class C66681 implements C5402b<C7538b, Object> {
        C66681() {
        }

        /* renamed from: a */
        public final /* synthetic */ C5401a mo5396a(Context context, Looper looper, C5441f c5441f, Object obj, C5409b c5409b, C5411d c5411d) {
            return new C7538b(context, looper, c5409b, c5411d, c5441f.m23671h());
        }
    }

    public C5362a(Context context, String str, String str2) {
        this(context, -1, str, null, null, false, f20234d, C6715d.m29983b(), new C5361c());
    }

    private C5362a(Context context, int i, String str, String str2, String str3, boolean z, C5363b c5363b, C5477c c5477c, C5361c c5361c) {
        this.f20238h = -1;
        this.f20235e = context.getPackageName();
        this.f20236f = C5362a.m23548a(context);
        this.f20238h = -1;
        this.f20237g = str;
        this.f20239i = str2;
        this.f20240j = null;
        context = null;
        this.f20241k = false;
        this.f20242l = c5363b;
        this.f20243m = c5477c;
        this.f20244n = c5361c;
        if (this.f20241k != 0) {
            if (this.f20239i == 0) {
                context = true;
            }
            C5462v.m23773b(context, "can't be anonymous with an upload account");
        }
    }

    /* renamed from: a */
    private static int m23548a(android.content.Context r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r1.getPackageInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0010 }
        goto L_0x0018;
    L_0x0010:
        r2 = "ClearcutLogger";
        r1 = "This can't happen.";
        android.util.Log.wtf(r2, r1);
        r2 = 0;
    L_0x0018:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.e.a.a(android.content.Context):int");
    }

    /* renamed from: a */
    public final C5359a m23559a(C5306g c5306g) {
        return new C5359a(C5306g.m23531a(c5306g));
    }
}
