package com.facebook.ads.internal.server;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.C1373b;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.p040g.C1409d;
import com.facebook.ads.internal.p040g.C1413g;
import com.facebook.ads.internal.p043j.p044a.C1433a;
import com.facebook.ads.internal.p043j.p044a.C1434b;
import com.facebook.ads.internal.p043j.p044a.C1439m;
import com.facebook.ads.internal.p043j.p044a.C1440n;
import com.facebook.ads.internal.p047k.C1476a;
import com.facebook.ads.internal.p047k.C1484d;
import com.facebook.ads.internal.p047k.C1502p;
import com.facebook.ads.internal.p047k.C1509v;
import com.facebook.ads.internal.p047k.ab;
import com.facebook.ads.internal.p047k.p048a.C1475a;
import com.facebook.ads.internal.p047k.p048a.C1475a.C1474a;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1523d;
import java.security.MessageDigest;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.internal.server.a */
public class C1527a {
    /* renamed from: i */
    private static final ab f4270i = new ab();
    /* renamed from: j */
    private static final ThreadPoolExecutor f4271j = ((ThreadPoolExecutor) Executors.newCachedThreadPool(f4270i));
    /* renamed from: a */
    private final Context f4272a;
    /* renamed from: b */
    private final C1530d f4273b = C1530d.m5388a();
    /* renamed from: c */
    private final C1418g f4274c = new C1418g(this.f4272a);
    /* renamed from: d */
    private Map<String, String> f4275d;
    /* renamed from: e */
    private C1526a f4276e;
    /* renamed from: f */
    private C1413g f4277f;
    /* renamed from: g */
    private C1433a f4278g;
    /* renamed from: h */
    private final String f4279h = C1528b.m5383a();

    /* renamed from: com.facebook.ads.internal.server.a$a */
    public interface C1526a {
        /* renamed from: a */
        void mo1715a(C1373b c1373b);

        /* renamed from: a */
        void mo1716a(C3323f c3323f);
    }

    /* renamed from: com.facebook.ads.internal.server.a$2 */
    class C33222 extends C1434b {
        /* renamed from: a */
        final /* synthetic */ C1527a f10125a;

        C33222(C1527a c1527a) {
            this.f10125a = c1527a;
        }

        /* renamed from: a */
        void m12828a(com.facebook.ads.internal.p043j.p044a.C1439m r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.f10125a;
            r0 = r0.f4277f;
            com.facebook.ads.internal.p047k.C1484d.m5223b(r0);
            r0 = r4.f10125a;
            r1 = 0;
            r0.f4278g = r1;
            r0 = r5.m5041a();	 Catch:{ JSONException -> 0x0049 }
            if (r0 == 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0049 }
        L_0x0015:
            r0 = r0.m5046e();	 Catch:{ JSONException -> 0x0049 }
            r1 = r4.f10125a;	 Catch:{ JSONException -> 0x0049 }
            r1 = r1.f4273b;	 Catch:{ JSONException -> 0x0049 }
            r1 = r1.m5392a(r0);	 Catch:{ JSONException -> 0x0049 }
            r2 = r1.m5394b();	 Catch:{ JSONException -> 0x0049 }
            r3 = com.facebook.ads.internal.server.C1532e.C1531a.ERROR;	 Catch:{ JSONException -> 0x0049 }
            if (r2 != r3) goto L_0x0049;	 Catch:{ JSONException -> 0x0049 }
        L_0x002b:
            r1 = (com.facebook.ads.internal.server.C3324g) r1;	 Catch:{ JSONException -> 0x0049 }
            r2 = r1.m12833e();	 Catch:{ JSONException -> 0x0049 }
            r1 = r1.m12834f();	 Catch:{ JSONException -> 0x0049 }
            r3 = com.facebook.ads.internal.protocol.AdErrorType.ERROR_MESSAGE;	 Catch:{ JSONException -> 0x0049 }
            r1 = com.facebook.ads.internal.protocol.AdErrorType.adErrorTypeFromCode(r1, r3);	 Catch:{ JSONException -> 0x0049 }
            r3 = r4.f10125a;	 Catch:{ JSONException -> 0x0049 }
            if (r2 != 0) goto L_0x0040;	 Catch:{ JSONException -> 0x0049 }
        L_0x003f:
            goto L_0x0041;	 Catch:{ JSONException -> 0x0049 }
        L_0x0040:
            r0 = r2;	 Catch:{ JSONException -> 0x0049 }
        L_0x0041:
            r0 = com.facebook.ads.internal.C1373b.m4793a(r1, r0);	 Catch:{ JSONException -> 0x0049 }
            r3.m5368a(r0);	 Catch:{ JSONException -> 0x0049 }
            return;
        L_0x0049:
            r0 = r4.f10125a;
            r1 = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            r5 = r5.getMessage();
            r5 = com.facebook.ads.internal.C1373b.m4793a(r1, r5);
            r0.m5368a(r5);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.server.a.2.a(com.facebook.ads.internal.j.a.m):void");
        }

        /* renamed from: a */
        public void mo1782a(C1440n c1440n) {
            if (c1440n != null) {
                String e = c1440n.m5046e();
                C1484d.m5223b(this.f10125a.f4277f);
                this.f10125a.f4278g = null;
                this.f10125a.m5372a(e);
            }
        }

        /* renamed from: a */
        public void mo1783a(Exception exception) {
            if (C1439m.class.equals(exception.getClass())) {
                m12828a((C1439m) exception);
            } else {
                this.f10125a.m5368a(C1373b.m4793a(AdErrorType.NETWORK_ERROR, exception.getMessage()));
            }
        }
    }

    public C1527a(Context context) {
        this.f4272a = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m5368a(C1373b c1373b) {
        if (this.f4276e != null) {
            this.f4276e.mo1715a(c1373b);
        }
        m5380a();
    }

    /* renamed from: a */
    private void m5371a(C3323f c3323f) {
        if (this.f4276e != null) {
            this.f4276e.mo1716a(c3323f);
        }
        m5380a();
    }

    /* renamed from: a */
    private void m5372a(String str) {
        try {
            C1373b a;
            C1532e a2 = this.f4273b.m5392a(str);
            C1409d a3 = a2.mo1784a();
            if (a3 != null) {
                this.f4274c.m4951a(a3.m4897b());
                C1484d.m5220a(a3.m4895a().m4904d(), this.f4277f);
            }
            String c;
            switch (a2.m5394b()) {
                case ADS:
                    C3323f c3323f = (C3323f) a2;
                    if (a3 != null) {
                        if (a3.m4895a().m4905e()) {
                            C1484d.m5221a(str, this.f4277f);
                        }
                        str = this.f4275d != null ? (String) this.f4275d.get("CLIENT_REQUEST_ID") : null;
                        c = a2.m5395c();
                        if (!(!C1418g.m4946q(this.f4272a) || TextUtils.isEmpty(c) || TextUtils.isEmpty(str))) {
                            StringBuilder stringBuilder = new StringBuilder();
                            for (int i = 0; i < "4a3fb0fa71de48fa8e616c81da937e7e".length(); i++) {
                                int i2;
                                char charAt = "4a3fb0fa71de48fa8e616c81da937e7e".charAt(i);
                                if ((charAt < 'a' || charAt > 'm') && (charAt < 'A' || charAt > 'M')) {
                                    if ((charAt >= 'n' && charAt <= 'z') || (charAt >= 'N' && charAt <= 'Z')) {
                                        i2 = charAt - 13;
                                    }
                                    stringBuilder.append(charAt);
                                } else {
                                    i2 = charAt + 13;
                                }
                                charAt = (char) i2;
                                stringBuilder.append(charAt);
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(str);
                            stringBuilder2.append(c);
                            stringBuilder2.append(stringBuilder.toString());
                            byte[] bytes = stringBuilder2.toString().getBytes("iso-8859-1");
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            instance.update(bytes, 0, bytes.length);
                            if (!a2.m5396d().equals(C1509v.m5308a(instance.digest()))) {
                                C1502p.m5285a(new C1523d(), this.f4272a);
                            }
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(c);
                            stringBuilder3.append(str);
                            stringBuilder3.append(stringBuilder.toString());
                            byte[] bytes2 = stringBuilder3.toString().getBytes("iso-8859-1");
                            MessageDigest instance2 = MessageDigest.getInstance("SHA-1");
                            instance2.update(bytes2, 0, bytes2.length);
                            new C1529c(this.f4272a).m5386a(C1509v.m5308a(instance2.digest()));
                        }
                    }
                    m5371a(c3323f);
                    return;
                case ERROR:
                    C3324g c3324g = (C3324g) a2;
                    c = c3324g.m12833e();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c3324g.m12834f(), AdErrorType.ERROR_MESSAGE);
                    if (c != null) {
                        str = c;
                    }
                    a = C1373b.m4793a(adErrorTypeFromCode, str);
                    break;
                default:
                    a = C1373b.m4793a(AdErrorType.UNKNOWN_RESPONSE, str);
                    break;
            }
            m5368a(a);
        } catch (Exception e) {
            m5368a(C1373b.m4793a(AdErrorType.PARSER_FAILURE, e.getMessage()));
        }
    }

    /* renamed from: b */
    private C1434b m5373b() {
        return new C33222(this);
    }

    /* renamed from: a */
    public void m5380a() {
        if (this.f4278g != null) {
            this.f4278g.m5029c(1);
            this.f4278g.m5027b(1);
            this.f4278g = null;
        }
    }

    /* renamed from: a */
    public void m5381a(final C1413g c1413g) {
        m5380a();
        if (C1475a.m5158c(this.f4272a) == C1474a.NONE) {
            m5368a(new C1373b(AdErrorType.NETWORK_ERROR, "No network connection"));
            return;
        }
        this.f4277f = c1413g;
        C1476a.m5162a(this.f4272a);
        if (C1484d.m5222a(c1413g)) {
            String c = C1484d.m5224c(c1413g);
            if (c != null) {
                m5372a(c);
                return;
            } else {
                m5368a(C1373b.m4793a(AdErrorType.LOAD_TOO_FREQUENTLY, null));
                return;
            }
        }
        f4271j.submit(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C1527a f4268b;

            public void run() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r6 = this;
                r0 = r6.f4268b;
                r0 = r0.f4272a;
                com.facebook.ads.internal.p040g.C1411f.m4911a(r0);
                r0 = r3;
                r0 = r0.m4918e();
                r0 = r0.m5266a();
                if (r0 == 0) goto L_0x003b;
            L_0x0015:
                r0 = r3;	 Catch:{ a -> 0x0021 }
                r0 = r0.m4918e();	 Catch:{ a -> 0x0021 }
                r1 = com.facebook.ads.internal.p040g.C1411f.f3887b;	 Catch:{ a -> 0x0021 }
                r0.m5265a(r1);	 Catch:{ a -> 0x0021 }
                goto L_0x002b;
            L_0x0021:
                r0 = move-exception;
                r1 = r6.f4268b;
                r0 = com.facebook.ads.internal.C1373b.m4794a(r0);
                r1.m5368a(r0);
            L_0x002b:
                r0 = r6.f4268b;
                r1 = r3;
                r1 = r1.m4918e();
                r1 = r1.m5267b();
                r0.m5372a(r1);
                return;
            L_0x003b:
                r0 = r6.f4268b;
                r1 = r3;
                r1 = r1.m4919f();
                r0.f4275d = r1;
                r0 = r6.f4268b;	 Catch:{ Exception -> 0x0095 }
                r0 = r0.f4275d;	 Catch:{ Exception -> 0x0095 }
                r1 = "M_BANNER_KEY";	 Catch:{ Exception -> 0x0095 }
                r2 = new java.lang.String;	 Catch:{ Exception -> 0x0095 }
                r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0095 }
                r3.<init>();	 Catch:{ Exception -> 0x0095 }
                r4 = r6.f4268b;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.f4272a;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.getPackageName();	 Catch:{ Exception -> 0x0095 }
                r3.append(r4);	 Catch:{ Exception -> 0x0095 }
                r4 = " ";	 Catch:{ Exception -> 0x0095 }
                r3.append(r4);	 Catch:{ Exception -> 0x0095 }
                r4 = r6.f4268b;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.f4272a;	 Catch:{ Exception -> 0x0095 }
                r4 = r4.getPackageManager();	 Catch:{ Exception -> 0x0095 }
                r5 = r6.f4268b;	 Catch:{ Exception -> 0x0095 }
                r5 = r5.f4272a;	 Catch:{ Exception -> 0x0095 }
                r5 = r5.getPackageName();	 Catch:{ Exception -> 0x0095 }
                r4 = r4.getInstallerPackageName(r5);	 Catch:{ Exception -> 0x0095 }
                r3.append(r4);	 Catch:{ Exception -> 0x0095 }
                r3 = r3.toString();	 Catch:{ Exception -> 0x0095 }
                r3 = r3.getBytes();	 Catch:{ Exception -> 0x0095 }
                r4 = 2;	 Catch:{ Exception -> 0x0095 }
                r3 = android.util.Base64.encode(r3, r4);	 Catch:{ Exception -> 0x0095 }
                r2.<init>(r3);	 Catch:{ Exception -> 0x0095 }
                r0.put(r1, r2);	 Catch:{ Exception -> 0x0095 }
            L_0x0095:
                r0 = r6.f4268b;	 Catch:{ Exception -> 0x00d2 }
                r1 = r6.f4268b;	 Catch:{ Exception -> 0x00d2 }
                r1 = r1.f4272a;	 Catch:{ Exception -> 0x00d2 }
                r2 = r3;	 Catch:{ Exception -> 0x00d2 }
                r2 = r2.f3895e;	 Catch:{ Exception -> 0x00d2 }
                r1 = com.facebook.ads.internal.p047k.p048a.C1475a.m5157b(r1, r2);	 Catch:{ Exception -> 0x00d2 }
                r0.f4278g = r1;	 Catch:{ Exception -> 0x00d2 }
                r0 = r6.f4268b;	 Catch:{ Exception -> 0x00d2 }
                r0 = r0.f4278g;	 Catch:{ Exception -> 0x00d2 }
                r1 = r6.f4268b;	 Catch:{ Exception -> 0x00d2 }
                r1 = r1.f4279h;	 Catch:{ Exception -> 0x00d2 }
                r2 = r6.f4268b;	 Catch:{ Exception -> 0x00d2 }
                r2 = r2.f4278g;	 Catch:{ Exception -> 0x00d2 }
                r2 = r2.m5026b();	 Catch:{ Exception -> 0x00d2 }
                r3 = r6.f4268b;	 Catch:{ Exception -> 0x00d2 }
                r3 = r3.f4275d;	 Catch:{ Exception -> 0x00d2 }
                r2 = r2.m5049a(r3);	 Catch:{ Exception -> 0x00d2 }
                r3 = r6.f4268b;	 Catch:{ Exception -> 0x00d2 }
                r3 = r3.m5373b();	 Catch:{ Exception -> 0x00d2 }
                r0.m5019a(r1, r2, r3);	 Catch:{ Exception -> 0x00d2 }
                return;
            L_0x00d2:
                r0 = move-exception;
                r1 = r6.f4268b;
                r2 = com.facebook.ads.internal.protocol.AdErrorType.AD_REQUEST_FAILED;
                r0 = r0.getMessage();
                r0 = com.facebook.ads.internal.C1373b.m4793a(r2, r0);
                r1.m5368a(r0);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.server.a.1.run():void");
            }
        });
    }

    /* renamed from: a */
    public void m5382a(C1526a c1526a) {
        this.f4276e = c1526a;
    }
}
