package io.branch.referral;

import android.content.Context;
import io.branch.indexing.C15562c;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.s */
abstract class C17315s extends ServerRequest {
    /* renamed from: g */
    final aa f53016g;
    /* renamed from: h */
    private final Context f53017h;
    /* renamed from: i */
    private final C15562c f53018i = C15562c.m58127a(this.f53017h);

    /* renamed from: e */
    protected boolean mo12784e() {
        return true;
    }

    /* renamed from: i */
    public boolean mo12785i() {
        return true;
    }

    /* renamed from: v */
    public abstract boolean mo12779v();

    /* renamed from: w */
    public abstract String mo12780w();

    C17315s(Context context, String str, aa aaVar) {
        super(context, str);
        this.f53017h = context;
        this.f53016g = aaVar;
    }

    C17315s(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.f53017h = context;
        this.f53016g = new aa(context);
    }

    /* renamed from: a */
    protected void mo12783a(JSONObject jSONObject) throws JSONException {
        super.mo12783a(jSONObject);
        if (!this.f53016g.m58298e().equals("bnc_no_value")) {
            jSONObject.put(Jsonkey.AppVersion.getKey(), this.f53016g.m58298e());
        }
        jSONObject.put(Jsonkey.FaceBookAppLinkChecked.getKey(), this.b.m58438l());
        jSONObject.put(Jsonkey.IsReferrable.getKey(), this.b.m58461x());
        jSONObject.put(Jsonkey.Debug.getKey(), this.b.m58400G());
        m63328b(jSONObject);
        m58232a(this.f53017h, jSONObject);
    }

    /* renamed from: u */
    void mo12778u() throws JSONException {
        if (m58246h() != null) {
            String c = this.f53016g.m58296c();
            if (!c.equals("bnc_no_value")) {
                m58246h().put(Jsonkey.URIScheme.getKey(), c);
            }
        }
    }

    /* renamed from: a */
    static boolean m63327a(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase("install") != null;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    boolean m63331a(io.branch.referral.C15601z r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        if (r5 == 0) goto L_0x0078;
    L_0x0002:
        r0 = r5.m58528b();
        if (r0 == 0) goto L_0x0078;
    L_0x0008:
        r0 = r5.m58528b();
        r1 = io.branch.referral.Defines.Jsonkey.BranchViewData;
        r1 = r1.getKey();
        r0 = r0.has(r1);
        if (r0 == 0) goto L_0x0078;
    L_0x0018:
        r5 = r5.m58528b();	 Catch:{ JSONException -> 0x0078 }
        r0 = io.branch.referral.Defines.Jsonkey.BranchViewData;	 Catch:{ JSONException -> 0x0078 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0078 }
        r5 = r5.getJSONObject(r0);	 Catch:{ JSONException -> 0x0078 }
        r0 = r4.mo12780w();	 Catch:{ JSONException -> 0x0078 }
        r1 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.f12589e;	 Catch:{ JSONException -> 0x0078 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ JSONException -> 0x0078 }
    L_0x0032:
        r1 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.f12589e;	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.get();	 Catch:{ JSONException -> 0x0078 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ JSONException -> 0x0078 }
    L_0x003e:
        r1 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.f12589e;	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.get();	 Catch:{ JSONException -> 0x0078 }
        r1 = (android.app.Activity) r1;	 Catch:{ JSONException -> 0x0078 }
        r2 = r1 instanceof io.branch.referral.Branch$IBranchViewControl;	 Catch:{ JSONException -> 0x0078 }
        r3 = 1;	 Catch:{ JSONException -> 0x0078 }
        if (r2 == 0) goto L_0x0057;	 Catch:{ JSONException -> 0x0078 }
    L_0x004f:
        r2 = r1;	 Catch:{ JSONException -> 0x0078 }
        r2 = (io.branch.referral.Branch$IBranchViewControl) r2;	 Catch:{ JSONException -> 0x0078 }
        r2 = r2.skipBranchViewsOnThisActivity();	 Catch:{ JSONException -> 0x0078 }
        r3 = r3 ^ r2;	 Catch:{ JSONException -> 0x0078 }
    L_0x0057:
        if (r3 == 0) goto L_0x0066;	 Catch:{ JSONException -> 0x0078 }
    L_0x0059:
        r2 = io.branch.referral.BranchViewHandler.m58191a();	 Catch:{ JSONException -> 0x0078 }
        r3 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0078 }
        r5 = r2.m58207a(r5, r0, r1, r3);	 Catch:{ JSONException -> 0x0078 }
        goto L_0x0079;	 Catch:{ JSONException -> 0x0078 }
    L_0x0066:
        r1 = io.branch.referral.BranchViewHandler.m58191a();	 Catch:{ JSONException -> 0x0078 }
        r5 = r1.m58206a(r5, r0);	 Catch:{ JSONException -> 0x0078 }
        goto L_0x0079;	 Catch:{ JSONException -> 0x0078 }
    L_0x006f:
        r1 = io.branch.referral.BranchViewHandler.m58191a();	 Catch:{ JSONException -> 0x0078 }
        r5 = r1.m58206a(r5, r0);	 Catch:{ JSONException -> 0x0078 }
        goto L_0x0079;
    L_0x0078:
        r5 = 0;
    L_0x0079:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.a(io.branch.referral.z):boolean");
    }

    /* renamed from: a */
    public void mo12770a(io.branch.referral.C15601z r4, io.branch.referral.Branch r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58434j(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58436k(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58437l(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58430h(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58432i(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58440m(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58442n(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = 0;	 Catch:{ JSONException -> 0x0093 }
        r1 = java.lang.Boolean.valueOf(r0);	 Catch:{ JSONException -> 0x0093 }
        r5.m58405a(r1);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m58448q(r1);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r5.m58414b(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r4.m58528b();	 Catch:{ JSONException -> 0x0093 }
        if (r5 == 0) goto L_0x0093;	 Catch:{ JSONException -> 0x0093 }
    L_0x004d:
        r5 = r4.m58528b();	 Catch:{ JSONException -> 0x0093 }
        r0 = io.branch.referral.Defines.Jsonkey.Data;	 Catch:{ JSONException -> 0x0093 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0093 }
        r5 = r5.has(r0);	 Catch:{ JSONException -> 0x0093 }
        if (r5 == 0) goto L_0x0093;	 Catch:{ JSONException -> 0x0093 }
    L_0x005d:
        r5 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0093 }
        r4 = r4.m58528b();	 Catch:{ JSONException -> 0x0093 }
        r0 = io.branch.referral.Defines.Jsonkey.Data;	 Catch:{ JSONException -> 0x0093 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0093 }
        r4 = r4.getString(r0);	 Catch:{ JSONException -> 0x0093 }
        r5.<init>(r4);	 Catch:{ JSONException -> 0x0093 }
        r4 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ JSONException -> 0x0093 }
        r4 = r4.getKey();	 Catch:{ JSONException -> 0x0093 }
        r4 = r5.optBoolean(r4);	 Catch:{ JSONException -> 0x0093 }
        if (r4 == 0) goto L_0x0093;	 Catch:{ JSONException -> 0x0093 }
    L_0x007c:
        r4 = r3 instanceof io.branch.referral.C18328x;	 Catch:{ JSONException -> 0x0093 }
        if (r4 == 0) goto L_0x0083;	 Catch:{ JSONException -> 0x0093 }
    L_0x0080:
        r4 = "Branch Install";	 Catch:{ JSONException -> 0x0093 }
        goto L_0x0085;	 Catch:{ JSONException -> 0x0093 }
    L_0x0083:
        r4 = "Branch Open";	 Catch:{ JSONException -> 0x0093 }
    L_0x0085:
        r0 = new io.branch.referral.l;	 Catch:{ JSONException -> 0x0093 }
        r0.<init>();	 Catch:{ JSONException -> 0x0093 }
        r1 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r1 = r1.m58431i();	 Catch:{ JSONException -> 0x0093 }
        r0.m58384a(r4, r5, r1);	 Catch:{ JSONException -> 0x0093 }
    L_0x0093:
        r4 = r3.b;
        r5 = "bnc_previous_update_time";
        r4 = r4.m58455u(r5);
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x00b0;
    L_0x00a1:
        r4 = r3.b;
        r5 = "bnc_previous_update_time";
        r0 = r3.b;
        r1 = "bnc_last_known_update_time";
        r0 = r0.m58455u(r1);
        r4.m58408a(r5, r0);
    L_0x00b0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.a(io.branch.referral.z, io.branch.referral.Branch):void");
    }

    /* renamed from: b */
    void m63332b(io.branch.referral.C15601z r3, io.branch.referral.Branch r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f53018i;
        if (r0 == 0) goto L_0x0022;
    L_0x0004:
        r0 = r2.f53018i;
        r3 = r3.m58528b();
        r0.m58131a(r3);
        r3 = r4.f12589e;
        if (r3 == 0) goto L_0x0022;
    L_0x0011:
        r3 = io.branch.indexing.C15560b.m58095a();	 Catch:{ Exception -> 0x0022 }
        r0 = r4.f12589e;	 Catch:{ Exception -> 0x0022 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0022 }
        r0 = (android.app.Activity) r0;	 Catch:{ Exception -> 0x0022 }
        r1 = r4.f12591g;	 Catch:{ Exception -> 0x0022 }
        r3.m58121b(r0, r1);	 Catch:{ Exception -> 0x0022 }
    L_0x0022:
        r4.g();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.b(io.branch.referral.z, io.branch.referral.Branch):void");
    }

    /* renamed from: x */
    void mo12781x() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.b;
        r0 = r0.m58443o();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x001b;
    L_0x000e:
        r1 = r3.m58246h();	 Catch:{ JSONException -> 0x001b }
        r2 = io.branch.referral.Defines.Jsonkey.LinkIdentifier;	 Catch:{ JSONException -> 0x001b }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x001b }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x001b }
    L_0x001b:
        r0 = r3.b;
        r0 = r0.m58445p();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x0036;
    L_0x0029:
        r1 = r3.m58246h();	 Catch:{ JSONException -> 0x0036 }
        r2 = io.branch.referral.Defines.Jsonkey.GoogleSearchInstallReferrer;	 Catch:{ JSONException -> 0x0036 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0036 }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x0036 }
    L_0x0036:
        r0 = r3.b;
        r0 = r0.m58447q();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x0051;
    L_0x0044:
        r1 = r3.m58246h();	 Catch:{ JSONException -> 0x0051 }
        r2 = io.branch.referral.Defines.Jsonkey.GooglePlayInstallReferrer;	 Catch:{ JSONException -> 0x0051 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x0051 }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x0051 }
    L_0x0051:
        r0 = r3.b;
        r0 = r0.m58452s();
        if (r0 == 0) goto L_0x007a;
    L_0x0059:
        r0 = r3.m58246h();	 Catch:{ JSONException -> 0x007a }
        r1 = io.branch.referral.Defines.Jsonkey.AndroidAppLinkURL;	 Catch:{ JSONException -> 0x007a }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x007a }
        r2 = r3.b;	 Catch:{ JSONException -> 0x007a }
        r2 = r2.m58449r();	 Catch:{ JSONException -> 0x007a }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x007a }
        r0 = r3.m58246h();	 Catch:{ JSONException -> 0x007a }
        r1 = io.branch.referral.Defines.Jsonkey.IsFullAppConv;	 Catch:{ JSONException -> 0x007a }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x007a }
        r2 = 1;	 Catch:{ JSONException -> 0x007a }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x007a }
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.x():void");
    }

    /* renamed from: q */
    public void mo12786q() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.m58246h();
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m58449r();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x0021;	 Catch:{ JSONException -> 0x009c }
    L_0x0012:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidAppLinkURL;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m58449r();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x0021:
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m58454t();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x003e;	 Catch:{ JSONException -> 0x009c }
    L_0x002f:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidPushIdentifier;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m58454t();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x003e:
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m58439m();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x005b;	 Catch:{ JSONException -> 0x009c }
    L_0x004c:
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_URI;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m58439m();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x005b:
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m58441n();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x0078;	 Catch:{ JSONException -> 0x009c }
    L_0x0069:
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_Extra;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m58441n();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x0078:
        r1 = r4.f53018i;	 Catch:{ JSONException -> 0x009c }
        if (r1 == 0) goto L_0x009c;	 Catch:{ JSONException -> 0x009c }
    L_0x007c:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x009c }
        r1.<init>();	 Catch:{ JSONException -> 0x009c }
        r2 = "mv";	 Catch:{ JSONException -> 0x009c }
        r3 = r4.f53018i;	 Catch:{ JSONException -> 0x009c }
        r3 = r3.m58136e();	 Catch:{ JSONException -> 0x009c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x009c }
        r2 = "pn";	 Catch:{ JSONException -> 0x009c }
        r3 = r4.f53017h;	 Catch:{ JSONException -> 0x009c }
        r3 = r3.getPackageName();	 Catch:{ JSONException -> 0x009c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x009c }
        r2 = "cd";	 Catch:{ JSONException -> 0x009c }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x009c }
    L_0x009c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.q():void");
    }

    /* renamed from: b */
    private void m63328b(org.json.JSONObject r12) throws org.json.JSONException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r0 = r11.f53016g;
        r0 = r0.m58298e();
        r1 = 0;
        r2 = r11.f53017h;	 Catch:{ NameNotFoundException -> 0x0018 }
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0018 }
        r3 = r11.f53017h;	 Catch:{ NameNotFoundException -> 0x0018 }
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0018 }
        r2 = r2.getPackageInfo(r3, r1);	 Catch:{ NameNotFoundException -> 0x0018 }
        goto L_0x0019;
    L_0x0018:
        r2 = 0;
    L_0x0019:
        r3 = "bnc_no_value";
        r4 = r11.b;
        r4 = r4.m58422e();
        r3 = r3.equals(r4);
        r4 = 2;
        if (r3 == 0) goto L_0x0038;
    L_0x0028:
        if (r2 == 0) goto L_0x0047;
    L_0x002a:
        r5 = r2.lastUpdateTime;
        r7 = r2.firstInstallTime;
        r9 = r5 - r7;
        r5 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r0 < 0) goto L_0x0047;
    L_0x0037:
        goto L_0x0044;
    L_0x0038:
        r1 = r11.b;
        r1 = r1.m58422e();
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0046;
    L_0x0044:
        r1 = 2;
        goto L_0x0047;
    L_0x0046:
        r1 = 1;
    L_0x0047:
        r0 = io.branch.referral.Defines.Jsonkey.Update;
        r0 = r0.getKey();
        r12.put(r0, r1);
        if (r2 == 0) goto L_0x00b9;
    L_0x0052:
        r0 = io.branch.referral.Defines.Jsonkey.FirstInstallTime;
        r0 = r0.getKey();
        r3 = r2.firstInstallTime;
        r12.put(r0, r3);
        r0 = io.branch.referral.Defines.Jsonkey.LastUpdateTime;
        r0 = r0.getKey();
        r3 = r2.lastUpdateTime;
        r12.put(r0, r3);
        r0 = r11.b;
        r1 = "bnc_original_install_time";
        r0 = r0.m58455u(r1);
        r3 = 0;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x0081;
    L_0x0076:
        r0 = r2.firstInstallTime;
        r3 = r11.b;
        r4 = "bnc_original_install_time";
        r5 = r2.firstInstallTime;
        r3.m58408a(r4, r5);
    L_0x0081:
        r3 = io.branch.referral.Defines.Jsonkey.OriginalInstallTime;
        r3 = r3.getKey();
        r12.put(r3, r0);
        r0 = r11.b;
        r1 = "bnc_last_known_update_time";
        r0 = r0.m58455u(r1);
        r3 = r2.lastUpdateTime;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 >= 0) goto L_0x00a8;
    L_0x0098:
        r3 = r11.b;
        r4 = "bnc_previous_update_time";
        r3.m58408a(r4, r0);
        r0 = r11.b;
        r1 = "bnc_last_known_update_time";
        r2 = r2.lastUpdateTime;
        r0.m58408a(r1, r2);
    L_0x00a8:
        r0 = io.branch.referral.Defines.Jsonkey.PreviousUpdateTime;
        r0 = r0.getKey();
        r1 = r11.b;
        r2 = "bnc_previous_update_time";
        r1 = r1.m58455u(r2);
        r12.put(r0, r1);
    L_0x00b9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.b(org.json.JSONObject):void");
    }

    /* renamed from: t */
    protected boolean mo12787t() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.m58246h();
        r1 = io.branch.referral.Defines.Jsonkey.AndroidAppLinkURL;
        r1 = r1.getKey();
        r1 = r0.has(r1);
        if (r1 != 0) goto L_0x002e;
    L_0x0010:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidPushIdentifier;
        r1 = r1.getKey();
        r1 = r0.has(r1);
        if (r1 != 0) goto L_0x002e;
    L_0x001c:
        r1 = io.branch.referral.Defines.Jsonkey.LinkIdentifier;
        r1 = r1.getKey();
        r1 = r0.has(r1);
        if (r1 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x002e;
    L_0x0029:
        r0 = super.mo12787t();
        return r0;
    L_0x002e:
        r1 = io.branch.referral.Defines.Jsonkey.DeviceFingerprintID;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.IdentityID;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.FaceBookAppLinkChecked;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_Extra;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_URI;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.FirstInstallTime;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.LastUpdateTime;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.OriginalInstallTime;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.PreviousUpdateTime;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.InstallBeginTimeStamp;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.ClickedReferrerTimeStamp;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.HardwareID;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.IsHardwareIDReal;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.LocalIP;
        r1 = r1.getKey();
        r0.remove(r1);
        r1 = 1;
        r2 = io.branch.referral.Defines.Jsonkey.TrackingDisabled;	 Catch:{ JSONException -> 0x00b6 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x00b6 }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00b6 }
    L_0x00b6:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.t():boolean");
    }
}
