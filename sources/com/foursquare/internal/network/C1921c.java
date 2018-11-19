package com.foursquare.internal.network;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.ResponseV2;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.network.request.C1936a;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C15958m;
import okhttp3.C15964r;
import okhttp3.C15966s;
import okhttp3.C17690n;
import okhttp3.C17690n.C15959a;
import okhttp3.C17692o;
import okhttp3.HttpUrl;

/* renamed from: com.foursquare.internal.network.c */
public final class C1921c {
    /* renamed from: a */
    private static final String f5166a = "c";
    @NonNull
    /* renamed from: b */
    private final HttpUrl f5167b;
    @NonNull
    /* renamed from: c */
    private final String f5168c;
    /* renamed from: d */
    private final String f5169d;
    /* renamed from: e */
    private String f5170e;
    /* renamed from: f */
    private String f5171f;
    /* renamed from: g */
    private final String f5172g;
    /* renamed from: h */
    private final int f5173h;
    /* renamed from: i */
    private final String f5174i;
    /* renamed from: j */
    private final Map<String, String> f5175j;
    /* renamed from: k */
    private boolean f5176k;
    /* renamed from: l */
    private final C17692o f5177l;

    C1921c(C17692o c17692o, @NonNull HttpUrl httpUrl, @NonNull String str, String str2, String str3, int i, String str4) {
        this.f5177l = c17692o;
        this.f5167b = httpUrl;
        this.f5168c = str;
        this.f5169d = str2;
        this.f5172g = str3;
        this.f5173h = i;
        this.f5174i = str4;
        if (this.f5169d == null) {
            throw new IllegalStateException("User agent must be supplied to HttpImpl.");
        }
        this.f5175j = new HashMap();
        this.f5176k = null;
    }

    /* renamed from: a */
    public boolean m6712a() {
        return this.f5176k;
    }

    /* renamed from: b */
    public Map<String, String> m6714b() {
        return this.f5175j;
    }

    @NonNull
    /* renamed from: c */
    public HttpUrl m6716c() {
        return this.f5167b;
    }

    @NonNull
    /* renamed from: d */
    public String m6717d() {
        return this.f5168c;
    }

    /* renamed from: a */
    public void m6709a(String str) {
        this.f5170e = str;
    }

    /* renamed from: e */
    public String m6718e() {
        return this.f5171f;
    }

    /* renamed from: b */
    public void m6715b(String str) {
        this.f5171f = str;
    }

    /* renamed from: f */
    public String m6719f() {
        return this.f5172g;
    }

    /* renamed from: a */
    public void m6711a(boolean z) {
        this.f5176k = z;
    }

    /* renamed from: g */
    public String m6720g() {
        return this.f5170e;
    }

    /* renamed from: h */
    public String m6721h() {
        return this.f5169d;
    }

    /* renamed from: a */
    public void m6710a(String str, String str2) {
        if (str != null && str.length() > 0 && str2 != null) {
            this.f5175j.put(str, str2);
        }
    }

    @NonNull
    /* renamed from: a */
    public <T extends FoursquareType> C1932g<T> m6708a(Type type, String str, boolean z, C1936a... c1936aArr) {
        return m6707a(type, str, 0, z, c1936aArr);
    }

    @NonNull
    /* renamed from: b */
    public <T extends FoursquareType> C1932g<T> m6713b(Type type, String str, boolean z, C1936a... c1936aArr) {
        return m6707a(type, str, 1, z, c1936aArr);
    }

    /* renamed from: a */
    protected <T extends FoursquareType> C1932g<T> m6707a(Type type, String str, int i, boolean z, C1936a... c1936aArr) {
        return m6706a(type, str, i, z, null, null, null, null, c1936aArr);
    }

    /* renamed from: a */
    protected <T extends com.foursquare.api.types.FoursquareType> com.foursquare.internal.network.C1932g<T> m6706a(java.lang.reflect.Type r14, java.lang.String r15, int r16, boolean r17, java.lang.String r18, java.io.File r19, java.lang.String r20, byte[] r21, com.foursquare.internal.network.request.C1936a... r22) {
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
        r13 = this;
        r9 = r13;
        r10 = 0;
        r1 = 0;
        r1 = r10;
        r11 = 0;
    L_0x0005:
        r2 = 3;
        if (r11 >= r2) goto L_0x00cf;
    L_0x0008:
        r12 = -1;
        r1 = r9;
        r2 = r16;
        r3 = r15;
        r4 = r18;
        r5 = r19;
        r6 = r20;
        r7 = r21;
        r8 = r22;
        r1 = r1.m6702a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ UnknownHostException -> 0x00c4, SSLException -> 0x00b9, SocketTimeoutException -> 0x0063, SocketException -> 0x0057, IOException -> 0x004b, Exception -> 0x0031 }
        r2 = r9.f5177l;	 Catch:{ UnknownHostException -> 0x00c4, SSLException -> 0x00b9, SocketTimeoutException -> 0x0063, SocketException -> 0x0057, IOException -> 0x004b, Exception -> 0x0031 }
        r1 = r2.newCall(r1);	 Catch:{ UnknownHostException -> 0x00c4, SSLException -> 0x00b9, SocketTimeoutException -> 0x0063, SocketException -> 0x0057, IOException -> 0x004b, Exception -> 0x0031 }
        r1 = r1.execute();	 Catch:{ UnknownHostException -> 0x00c4, SSLException -> 0x00b9, SocketTimeoutException -> 0x0063, SocketException -> 0x0057, IOException -> 0x004b, Exception -> 0x0031 }
        r2 = r14;
        r1 = r9.m6700a(r2, r1);	 Catch:{ UnknownHostException -> 0x00c4, SSLException -> 0x00b9, SocketTimeoutException -> 0x0064, SocketException -> 0x0058, IOException -> 0x004c, Exception -> 0x0031 }
        r1.m6770a(r10);	 Catch:{ UnknownHostException -> 0x00c4, SSLException -> 0x00b9, SocketTimeoutException -> 0x0064, SocketException -> 0x0058, IOException -> 0x004c, Exception -> 0x0031 }
        r1.m6768a(r11);	 Catch:{ UnknownHostException -> 0x00c4, SSLException -> 0x00b9, SocketTimeoutException -> 0x0064, SocketException -> 0x0058, IOException -> 0x004c, Exception -> 0x0031 }
        goto L_0x006e;
    L_0x0031:
        r0 = move-exception;
        r1 = r0;
        r2 = new com.foursquare.internal.network.g;
        r2.<init>(r12);
        r3 = com.foursquare.internal.network.FoursquareError.CLIENT_UNKNOWN;
        r2.m6770a(r3);
        r3 = r9.m6712a();
        if (r3 == 0) goto L_0x004a;
    L_0x0043:
        r1 = r1.getMessage();
        r2.m6773b(r1);
    L_0x004a:
        return r2;
    L_0x004b:
        r2 = r14;
    L_0x004c:
        r1 = new com.foursquare.internal.network.g;
        r1.<init>(r12);
        r3 = com.foursquare.internal.network.FoursquareError.IO_EXCEPTION;
        r1.m6770a(r3);
        goto L_0x006e;
    L_0x0057:
        r2 = r14;
    L_0x0058:
        r1 = new com.foursquare.internal.network.g;
        r1.<init>(r12);
        r3 = com.foursquare.internal.network.FoursquareError.SOCKET_ERROR;
        r1.m6770a(r3);
        goto L_0x006e;
    L_0x0063:
        r2 = r14;
    L_0x0064:
        r1 = new com.foursquare.internal.network.g;
        r1.<init>(r12);
        r3 = com.foursquare.internal.network.FoursquareError.SOCKET_TIMEOUT;
        r1.m6770a(r3);
    L_0x006e:
        r3 = r1.m6767a();
        switch(r3) {
            case -1: goto L_0x00a0;
            case 200: goto L_0x009f;
            case 400: goto L_0x0099;
            case 401: goto L_0x0093;
            case 403: goto L_0x008d;
            case 404: goto L_0x0087;
            case 409: goto L_0x0081;
            case 500: goto L_0x007b;
            case 502: goto L_0x007b;
            case 503: goto L_0x007b;
            default: goto L_0x0075;
        };
    L_0x0075:
        r3 = com.foursquare.internal.network.FoursquareError.SERVER_UNKNOWN;
        r1.m6770a(r3);
        goto L_0x00a0;
    L_0x007b:
        r2 = com.foursquare.internal.network.FoursquareError.SERVER_ISSUE;
        r1.m6770a(r2);
        return r1;
    L_0x0081:
        r2 = com.foursquare.internal.network.FoursquareError.CONFLICT;
        r1.m6770a(r2);
        return r1;
    L_0x0087:
        r3 = com.foursquare.internal.network.FoursquareError.NOT_FOUND;
        r1.m6770a(r3);
        goto L_0x00a0;
    L_0x008d:
        r2 = com.foursquare.internal.network.FoursquareError.FORBIDDEN;
        r1.m6770a(r2);
        return r1;
    L_0x0093:
        r2 = com.foursquare.internal.network.FoursquareError.NOT_AUTHORIZED;
        r1.m6770a(r2);
        return r1;
    L_0x0099:
        r2 = com.foursquare.internal.network.FoursquareError.BAD_REQUEST;
        r1.m6770a(r2);
        return r1;
    L_0x009f:
        return r1;
    L_0x00a0:
        r3 = r9.m6712a();
        if (r3 == 0) goto L_0x00ad;
    L_0x00a6:
        r3 = java.lang.System.err;
        r4 = "  Retrying on status code.";
        r3.println(r4);
    L_0x00ad:
        if (r17 != 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00cf;
    L_0x00b0:
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        java.lang.Thread.sleep(r4);	 Catch:{ InterruptedException -> 0x00b5 }
    L_0x00b5:
        r11 = r11 + 1;
        goto L_0x0005;
    L_0x00b9:
        r1 = new com.foursquare.internal.network.g;
        r1.<init>(r12);
        r2 = com.foursquare.internal.network.FoursquareError.SSL_EXCEPTION;
        r1.m6770a(r2);
        return r1;
    L_0x00c4:
        r1 = new com.foursquare.internal.network.g;
        r1.<init>(r12);
        r2 = com.foursquare.internal.network.FoursquareError.NETWORK_UNAVAILABLE;
        r1.m6770a(r2);
        return r1;
    L_0x00cf:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.c.a(java.lang.reflect.Type, java.lang.String, int, boolean, java.lang.String, java.io.File, java.lang.String, byte[], com.foursquare.internal.network.request.a[]):com.foursquare.internal.network.g<T>");
    }

    /* renamed from: a */
    private okhttp3.C15963q m6702a(int r5, java.lang.String r6, java.lang.String r7, java.io.File r8, java.lang.String r9, byte[] r10, com.foursquare.internal.network.request.C1936a... r11) throws java.lang.Exception {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r6 = android.net.Uri.parse(r6);
        r6 = r6.buildUpon();
        r0 = 2;
        if (r5 == 0) goto L_0x000d;
    L_0x000b:
        if (r5 != r0) goto L_0x002d;
    L_0x000d:
        r1 = r4.m6701a(r11);
        r1 = r1.iterator();
    L_0x0015:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x002d;
    L_0x001b:
        r2 = r1.next();
        r2 = (com.foursquare.internal.network.request.C1936a) r2;
        r3 = r2.m6784a();
        r2 = r2.m6785b();
        r6.appendQueryParameter(r3, r2);
        goto L_0x0015;
    L_0x002d:
        r6 = r6.build();
        r1 = new java.net.URL;
        r6 = r6.toString();
        r1.<init>(r6);
        r6 = new okhttp3.q$a;
        r6.<init>();
        r6 = r6.a(r1);
        r1 = "X-Fs-Consumer";
        r2 = r4.f5173h;
        r2 = java.lang.Integer.toString(r2);
        r6 = r6.a(r1, r2);
        r1 = "User-Agent";
        r2 = r4.m6721h();
        r6 = r6.a(r1, r2);
        r1 = r4.m6718e();
        if (r1 == 0) goto L_0x0072;
    L_0x005f:
        r1 = r4.m6718e();
        r1 = r1.length();
        if (r1 <= 0) goto L_0x0072;
    L_0x0069:
        r1 = "Accept-Language";
        r2 = r4.m6718e();
        r6.a(r1, r2);
    L_0x0072:
        r1 = 1;
        if (r5 != r1) goto L_0x00a2;
    L_0x0075:
        r5 = r4.m6701a(r11);
        r7 = new okhttp3.j$a;
        r7.<init>();
        r5 = r5.iterator();
    L_0x0082:
        r8 = r5.hasNext();
        if (r8 == 0) goto L_0x009a;
    L_0x0088:
        r8 = r5.next();
        r8 = (com.foursquare.internal.network.request.C1936a) r8;
        r9 = r8.m6784a();
        r8 = r8.m6785b();
        r7.a(r9, r8);
        goto L_0x0082;
    L_0x009a:
        r5 = r7.a();
        r6.a(r5);
        goto L_0x00bc;
    L_0x00a2:
        if (r5 != r0) goto L_0x00bc;
    L_0x00a4:
        r5 = "Connection";
        r11 = "Keep-Alive";
        r6.a(r5, r11);
        if (r8 == 0) goto L_0x00b5;
    L_0x00ad:
        r5 = r4.m6703a(r7, r8);
        r6.a(r5);
        goto L_0x00bc;
    L_0x00b5:
        r5 = r4.m6704a(r7, r9, r10);
        r6.a(r5);
    L_0x00bc:
        r5 = r6.d();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.c.a(int, java.lang.String, java.lang.String, java.io.File, java.lang.String, byte[], com.foursquare.internal.network.request.a[]):okhttp3.q");
    }

    /* renamed from: a */
    private <T extends FoursquareType> C1932g<T> m6700a(Type type, C15966s c15966s) throws Exception {
        try {
            ResponseV2 responseV2 = (ResponseV2) C1913a.m6648a(c15966s.h().charStream(), type);
            C1932g<T> c1932g = new C1932g(c15966s.c());
            c1932g.m6771a(c15966s.e());
            c1932g.m6769a(responseV2);
            return c1932g;
        } finally {
            c15966s.h().close();
        }
    }

    /* renamed from: a */
    private C15964r m6703a(String str, File file) {
        String str2 = "";
        String name = file.getName();
        if (name.contains(".")) {
            str2 = name.substring(0, name.indexOf("."));
        }
        return new C15959a().a(C17690n.f55031e).a(str2, name, C15964r.create(C15958m.a(str), file)).a();
    }

    /* renamed from: a */
    private C15964r m6704a(String str, String str2, byte[] bArr) {
        String str3 = "";
        if (str2.contains(".")) {
            str3 = str2.substring(0, str2.indexOf("."));
        }
        return new C15959a().a(C17690n.f55031e).a(str3, str2, C15964r.create(C15958m.a(str), bArr)).a();
    }

    /* renamed from: a */
    private List<C1936a> m6701a(C1936a... c1936aArr) {
        c1936aArr = C1921c.m6705b(c1936aArr);
        if (m6720g() != null && m6720g().length() > 0) {
            c1936aArr.add(new C1936a("oauth_token", m6720g()));
        }
        if (m6719f() != null && m6719f().length() > 0) {
            c1936aArr.add(new C1936a("v", m6719f()));
        } else if (m6712a()) {
            throw new IllegalStateException("Missing v param.");
        }
        if (!TextUtils.isEmpty(this.f5174i)) {
            c1936aArr.add(new C1936a("wsid", this.f5174i));
        }
        for (Entry entry : m6714b().entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((String) entry.getValue()).length() <= 0)) {
                c1936aArr.add(new C1936a((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return c1936aArr;
    }

    /* renamed from: b */
    private static List<C1936a> m6705b(C1936a... c1936aArr) {
        List<C1936a> arrayList = new ArrayList();
        for (C1936a c1936a : c1936aArr) {
            if (!(c1936a == null || TextUtils.isEmpty(c1936a.m6785b()))) {
                arrayList.add(c1936a);
            }
        }
        return arrayList;
    }
}
