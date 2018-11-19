package io.branch.referral;

import android.content.Context;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import java.util.Collection;
import org.json.JSONObject;

/* renamed from: io.branch.referral.o */
class C17311o extends ServerRequest {
    /* renamed from: g */
    private C15584f f53007g;
    /* renamed from: h */
    private boolean f53008h = true;
    /* renamed from: i */
    private Branch$BranchLinkCreateListener f53009i;
    /* renamed from: j */
    private boolean f53010j;
    /* renamed from: k */
    private boolean f53011k = true;

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    /* renamed from: d */
    boolean mo12777d() {
        return false;
    }

    public C17311o(Context context, String str, int i, int i2, Collection<String> collection, String str2, String str3, String str4, String str5, String str6, Branch$BranchLinkCreateListener branch$BranchLinkCreateListener, boolean z, boolean z2) {
        super(context, RequestPath.GetURL.getPath());
        this.f53009i = branch$BranchLinkCreateListener;
        this.f53008h = z;
        this.f53011k = z2;
        this.f53007g = new C15584f();
        try {
            this.f53007g.put(Jsonkey.IdentityID.getKey(), this.b.m58431i());
            this.f53007g.put(Jsonkey.DeviceFingerprintID.getKey(), this.b.m58427g());
            this.f53007g.put(Jsonkey.SessionID.getKey(), this.b.m58429h());
            if (this.b.m58435k().equals("bnc_no_value") == null) {
                this.f53007g.put(Jsonkey.LinkClickID.getKey(), this.b.m58435k());
            }
            this.f53007g.m58333a(i);
            this.f53007g.m58337b(i2);
            this.f53007g.m58335a((Collection) collection);
            this.f53007g.m58334a(str);
            this.f53007g.m58338b(str2);
            this.f53007g.m58340c(str3);
            this.f53007g.m58342d(str4);
            this.f53007g.m58344e(str5);
            this.f53007g.m58346f(str6);
            mo12783a((JSONObject) this.f53007g);
        } catch (String str7) {
            str7.printStackTrace();
            this.e = true;
        }
    }

    public C17311o(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: u */
    public C15584f mo12778u() {
        return this.f53007g;
    }

    /* renamed from: v */
    boolean mo12779v() {
        return this.f53011k;
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) != null) {
            return null;
        }
        if (this.f53009i != null) {
            this.f53009i.onLinkCreate(null, new C15583e("Trouble creating a URL.", -102));
        }
        return true;
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        try {
            c15601z = c15601z.m58528b().getString("url");
            if (this.f53009i != null) {
                this.f53009i.onLinkCreate(c15601z, null);
            }
            m63295c(c15601z);
        } catch (C15601z c15601z2) {
            c15601z2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m63298a(String str) {
        if (this.f53009i != null) {
            this.f53009i.onLinkCreate(str, null);
        }
        m63295c(str);
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f53009i != null) {
            String str2 = null;
            if (this.f53011k) {
                str2 = mo12780w();
            }
            Branch$BranchLinkCreateListener branch$BranchLinkCreateListener = this.f53009i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble creating a URL. ");
            stringBuilder.append(str);
            branch$BranchLinkCreateListener.onLinkCreate(str2, new C15583e(stringBuilder.toString(), i));
        }
    }

    /* renamed from: w */
    public String mo12780w() {
        if (!this.b.m58459w().equals("bnc_no_value")) {
            return m63294b(this.b.m58459w());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://bnc.lt/a/");
        stringBuilder.append(this.b.m58425f());
        return m63294b(stringBuilder.toString());
    }

    /* renamed from: x */
    public void mo12781x() {
        if (this.f53009i != null) {
            this.f53009i.onLinkCreate(null, new C15583e("Trouble creating a URL.", -105));
        }
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f53009i = null;
    }

    /* renamed from: y */
    public boolean m63308y() {
        return this.f53008h;
    }

    /* renamed from: b */
    private java.lang.String m63294b(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = io.branch.referral.Branch.b();	 Catch:{ Exception -> 0x0218 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x0218 }
    L_0x000a:
        r0 = "https://bnc.lt/a/";	 Catch:{ Exception -> 0x0218 }
        r0 = r6.contains(r0);	 Catch:{ Exception -> 0x0218 }
        if (r0 != 0) goto L_0x0022;	 Catch:{ Exception -> 0x0218 }
    L_0x0012:
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x0218 }
        r0.<init>(r6);	 Catch:{ Exception -> 0x0218 }
        r0 = r0.getQuery();	 Catch:{ Exception -> 0x0218 }
        r1 = "";	 Catch:{ Exception -> 0x0218 }
        r0 = r6.replace(r0, r1);	 Catch:{ Exception -> 0x0218 }
        r6 = r0;	 Catch:{ Exception -> 0x0218 }
    L_0x0022:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r0.<init>();	 Catch:{ Exception -> 0x0218 }
        r0.append(r6);	 Catch:{ Exception -> 0x0218 }
        r1 = "?";	 Catch:{ Exception -> 0x0218 }
        r1 = r6.contains(r1);	 Catch:{ Exception -> 0x0218 }
        if (r1 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x0218 }
    L_0x0032:
        r1 = "";	 Catch:{ Exception -> 0x0218 }
        goto L_0x0037;	 Catch:{ Exception -> 0x0218 }
    L_0x0035:
        r1 = "?";	 Catch:{ Exception -> 0x0218 }
    L_0x0037:
        r0.append(r1);	 Catch:{ Exception -> 0x0218 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0217 }
        r6.<init>();	 Catch:{ Exception -> 0x0217 }
        r6.append(r0);	 Catch:{ Exception -> 0x0217 }
        r1 = "?";	 Catch:{ Exception -> 0x0217 }
        r1 = r0.endsWith(r1);	 Catch:{ Exception -> 0x0217 }
        if (r1 == 0) goto L_0x0051;	 Catch:{ Exception -> 0x0217 }
    L_0x004e:
        r1 = "";	 Catch:{ Exception -> 0x0217 }
        goto L_0x0053;	 Catch:{ Exception -> 0x0217 }
    L_0x0051:
        r1 = "&";	 Catch:{ Exception -> 0x0217 }
    L_0x0053:
        r6.append(r1);	 Catch:{ Exception -> 0x0217 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0217 }
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58332a();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x0218 }
    L_0x0062:
        r0 = r0.iterator();	 Catch:{ Exception -> 0x0218 }
    L_0x0066:
        r1 = r0.hasNext();	 Catch:{ Exception -> 0x0218 }
        if (r1 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x0218 }
    L_0x006c:
        r1 = r0.next();	 Catch:{ Exception -> 0x0218 }
        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x0218 }
        if (r1 == 0) goto L_0x0066;	 Catch:{ Exception -> 0x0218 }
    L_0x0074:
        r2 = r1.length();	 Catch:{ Exception -> 0x0218 }
        if (r2 <= 0) goto L_0x0066;	 Catch:{ Exception -> 0x0218 }
    L_0x007a:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r2.<init>();	 Catch:{ Exception -> 0x0218 }
        r2.append(r6);	 Catch:{ Exception -> 0x0218 }
        r3 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ Exception -> 0x0218 }
        r2.append(r3);	 Catch:{ Exception -> 0x0218 }
        r3 = "=";	 Catch:{ Exception -> 0x0218 }
        r2.append(r3);	 Catch:{ Exception -> 0x0218 }
        r3 = "UTF8";	 Catch:{ Exception -> 0x0218 }
        r1 = java.net.URLEncoder.encode(r1, r3);	 Catch:{ Exception -> 0x0218 }
        r2.append(r1);	 Catch:{ Exception -> 0x0218 }
        r1 = "&";	 Catch:{ Exception -> 0x0218 }
        r2.append(r1);	 Catch:{ Exception -> 0x0218 }
        r1 = r2.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r1;	 Catch:{ Exception -> 0x0218 }
        goto L_0x0066;	 Catch:{ Exception -> 0x0218 }
    L_0x00a0:
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58336b();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x00d3;	 Catch:{ Exception -> 0x0218 }
    L_0x00a8:
        r1 = r0.length();	 Catch:{ Exception -> 0x0218 }
        if (r1 <= 0) goto L_0x00d3;	 Catch:{ Exception -> 0x0218 }
    L_0x00ae:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r1.<init>();	 Catch:{ Exception -> 0x0218 }
        r1.append(r6);	 Catch:{ Exception -> 0x0218 }
        r2 = io.branch.referral.Defines.LinkParam.Alias;	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "=";	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "UTF8";	 Catch:{ Exception -> 0x0218 }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = "&";	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r0;	 Catch:{ Exception -> 0x0218 }
    L_0x00d3:
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58343e();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x0106;	 Catch:{ Exception -> 0x0218 }
    L_0x00db:
        r1 = r0.length();	 Catch:{ Exception -> 0x0218 }
        if (r1 <= 0) goto L_0x0106;	 Catch:{ Exception -> 0x0218 }
    L_0x00e1:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r1.<init>();	 Catch:{ Exception -> 0x0218 }
        r1.append(r6);	 Catch:{ Exception -> 0x0218 }
        r2 = io.branch.referral.Defines.LinkParam.Channel;	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "=";	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "UTF8";	 Catch:{ Exception -> 0x0218 }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = "&";	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r0;	 Catch:{ Exception -> 0x0218 }
    L_0x0106:
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58345f();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x0139;	 Catch:{ Exception -> 0x0218 }
    L_0x010e:
        r1 = r0.length();	 Catch:{ Exception -> 0x0218 }
        if (r1 <= 0) goto L_0x0139;	 Catch:{ Exception -> 0x0218 }
    L_0x0114:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r1.<init>();	 Catch:{ Exception -> 0x0218 }
        r1.append(r6);	 Catch:{ Exception -> 0x0218 }
        r2 = io.branch.referral.Defines.LinkParam.Feature;	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "=";	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "UTF8";	 Catch:{ Exception -> 0x0218 }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = "&";	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r0;	 Catch:{ Exception -> 0x0218 }
    L_0x0139:
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58347g();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x016c;	 Catch:{ Exception -> 0x0218 }
    L_0x0141:
        r1 = r0.length();	 Catch:{ Exception -> 0x0218 }
        if (r1 <= 0) goto L_0x016c;	 Catch:{ Exception -> 0x0218 }
    L_0x0147:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r1.<init>();	 Catch:{ Exception -> 0x0218 }
        r1.append(r6);	 Catch:{ Exception -> 0x0218 }
        r2 = io.branch.referral.Defines.LinkParam.Stage;	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "=";	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "UTF8";	 Catch:{ Exception -> 0x0218 }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = "&";	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r0;	 Catch:{ Exception -> 0x0218 }
    L_0x016c:
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58348h();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x019f;	 Catch:{ Exception -> 0x0218 }
    L_0x0174:
        r1 = r0.length();	 Catch:{ Exception -> 0x0218 }
        if (r1 <= 0) goto L_0x019f;	 Catch:{ Exception -> 0x0218 }
    L_0x017a:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r1.<init>();	 Catch:{ Exception -> 0x0218 }
        r1.append(r6);	 Catch:{ Exception -> 0x0218 }
        r2 = io.branch.referral.Defines.LinkParam.Campaign;	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "=";	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r2 = "UTF8";	 Catch:{ Exception -> 0x0218 }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = "&";	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r0;	 Catch:{ Exception -> 0x0218 }
    L_0x019f:
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58339c();	 Catch:{ Exception -> 0x0218 }
        r0 = (long) r0;	 Catch:{ Exception -> 0x0218 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r2.<init>();	 Catch:{ Exception -> 0x0218 }
        r2.append(r6);	 Catch:{ Exception -> 0x0218 }
        r3 = io.branch.referral.Defines.LinkParam.Type;	 Catch:{ Exception -> 0x0218 }
        r2.append(r3);	 Catch:{ Exception -> 0x0218 }
        r3 = "=";	 Catch:{ Exception -> 0x0218 }
        r2.append(r3);	 Catch:{ Exception -> 0x0218 }
        r2.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = "&";	 Catch:{ Exception -> 0x0218 }
        r2.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r5.f53007g;	 Catch:{ Exception -> 0x0217 }
        r6 = r6.m58341d();	 Catch:{ Exception -> 0x0217 }
        r1 = (long) r6;	 Catch:{ Exception -> 0x0217 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0217 }
        r6.<init>();	 Catch:{ Exception -> 0x0217 }
        r6.append(r0);	 Catch:{ Exception -> 0x0217 }
        r3 = io.branch.referral.Defines.LinkParam.Duration;	 Catch:{ Exception -> 0x0217 }
        r6.append(r3);	 Catch:{ Exception -> 0x0217 }
        r3 = "=";	 Catch:{ Exception -> 0x0217 }
        r6.append(r3);	 Catch:{ Exception -> 0x0217 }
        r6.append(r1);	 Catch:{ Exception -> 0x0217 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0217 }
        r0 = r5.f53007g;	 Catch:{ Exception -> 0x0218 }
        r0 = r0.m58349i();	 Catch:{ Exception -> 0x0218 }
        if (r0 == 0) goto L_0x0227;	 Catch:{ Exception -> 0x0218 }
    L_0x01ec:
        r1 = r0.length();	 Catch:{ Exception -> 0x0218 }
        if (r1 <= 0) goto L_0x0227;	 Catch:{ Exception -> 0x0218 }
    L_0x01f2:
        r0 = r0.getBytes();	 Catch:{ Exception -> 0x0218 }
        r1 = 2;	 Catch:{ Exception -> 0x0218 }
        r0 = io.branch.referral.C15581c.m58325b(r0, r1);	 Catch:{ Exception -> 0x0218 }
        r1 = "UTF8";	 Catch:{ Exception -> 0x0218 }
        r0 = java.net.URLEncoder.encode(r0, r1);	 Catch:{ Exception -> 0x0218 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0218 }
        r1.<init>();	 Catch:{ Exception -> 0x0218 }
        r1.append(r6);	 Catch:{ Exception -> 0x0218 }
        r2 = "&source=android&data=";	 Catch:{ Exception -> 0x0218 }
        r1.append(r2);	 Catch:{ Exception -> 0x0218 }
        r1.append(r0);	 Catch:{ Exception -> 0x0218 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x0218 }
        r6 = r0;
        goto L_0x0227;
    L_0x0217:
        r6 = r0;
    L_0x0218:
        r0 = r5.f53009i;
        r1 = 0;
        r2 = new io.branch.referral.e;
        r3 = "Trouble creating a URL.";
        r4 = -116; // 0xffffffffffffff8c float:NaN double:NaN;
        r2.<init>(r3, r4);
        r0.onLinkCreate(r1, r2);
    L_0x0227:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.o.b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    void m63299a(boolean z) {
        this.f53010j = z;
    }

    /* renamed from: z */
    boolean m63309z() {
        return this.f53010j;
    }

    /* renamed from: c */
    private void m63295c(String str) {
        JSONObject j = this.f53007g.m58350j();
        if (m63309z() && j != null) {
            new C15592l().m58384a("Branch Share", j, this.b.m58431i());
        }
    }
}
