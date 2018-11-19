package io.branch.referral;

import android.content.Context;
import android.content.pm.PackageManager;
import io.branch.referral.Defines.RequestPath;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public abstract class ServerRequest {
    /* renamed from: a */
    protected String f48138a;
    /* renamed from: b */
    protected final C15593m f48139b;
    /* renamed from: c */
    long f48140c = 0;
    /* renamed from: d */
    final Set<PROCESS_WAIT_LOCK> f48141d;
    /* renamed from: e */
    public boolean f48142e = false;
    /* renamed from: f */
    boolean f48143f = false;
    /* renamed from: g */
    private JSONObject f48144g;
    /* renamed from: h */
    private final aa f48145h;
    /* renamed from: i */
    private boolean f48146i;
    /* renamed from: j */
    private int f48147j = 0;
    /* renamed from: k */
    private final Context f48148k;

    public enum BRANCH_API_VERSION {
        V1,
        V2
    }

    enum PROCESS_WAIT_LOCK {
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK
    }

    /* renamed from: a */
    public abstract void mo12769a(int i, String str);

    /* renamed from: a */
    public abstract void mo12770a(C15601z c15601z, Branch branch);

    /* renamed from: a */
    public abstract boolean mo12771a();

    /* renamed from: a */
    public abstract boolean mo12772a(Context context);

    /* renamed from: b */
    public abstract void mo12773b();

    /* renamed from: c */
    public boolean mo12774c() {
        return false;
    }

    /* renamed from: d */
    boolean mo12777d() {
        return true;
    }

    /* renamed from: e */
    protected boolean mo12784e() {
        return false;
    }

    /* renamed from: i */
    public boolean mo12785i() {
        return false;
    }

    /* renamed from: q */
    public void mo12786q() {
    }

    /* renamed from: t */
    protected boolean mo12787t() {
        return false;
    }

    public ServerRequest(Context context, String str) {
        this.f48148k = context;
        this.f48138a = str;
        this.f48139b = C15593m.m58388a(context);
        this.f48145h = new aa(context);
        this.f48144g = new JSONObject();
        this.f48146i = Branch.c();
        this.f48141d = new HashSet();
    }

    protected ServerRequest(String str, JSONObject jSONObject, Context context) {
        this.f48148k = context;
        this.f48138a = str;
        this.f48144g = jSONObject;
        this.f48139b = C15593m.m58388a(context);
        this.f48145h = new aa(context);
        this.f48146i = Branch.c();
        this.f48141d = new HashSet();
    }

    /* renamed from: f */
    public final String m58244f() {
        return this.f48138a;
    }

    /* renamed from: g */
    public String mo12782g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f48139b.m58402a());
        stringBuilder.append(this.f48138a);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected void mo12783a(org.json.JSONObject r4) throws org.json.JSONException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.f48144g = r4;
        r4 = r3.mo12788r();
        r0 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;
        if (r4 != r0) goto L_0x0030;
    L_0x000a:
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0043 }
        r4.<init>();	 Catch:{ JSONException -> 0x0043 }
        r0 = r3.f48144g;	 Catch:{ JSONException -> 0x0043 }
        r1 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x0043 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0043 }
        r0.put(r1, r4);	 Catch:{ JSONException -> 0x0043 }
        r0 = r3.f48139b;	 Catch:{ JSONException -> 0x0043 }
        r0 = r0.m58400G();	 Catch:{ JSONException -> 0x0043 }
        r1 = r3.f48145h;	 Catch:{ JSONException -> 0x0043 }
        r2 = r3.f48146i;	 Catch:{ JSONException -> 0x0043 }
        r0 = io.branch.referral.C15591k.m58373a(r0, r1, r2);	 Catch:{ JSONException -> 0x0043 }
        r1 = r3.f48148k;	 Catch:{ JSONException -> 0x0043 }
        r2 = r3.f48139b;	 Catch:{ JSONException -> 0x0043 }
        r0.m58375a(r1, r2, r4);	 Catch:{ JSONException -> 0x0043 }
        goto L_0x0043;
    L_0x0030:
        r4 = r3.f48139b;
        r4 = r4.m58400G();
        r0 = r3.f48145h;
        r1 = r3.f48146i;
        r4 = io.branch.referral.C15591k.m58373a(r4, r0, r1);
        r0 = r3.f48144g;
        r4.m58376a(r0);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(org.json.JSONObject):void");
    }

    /* renamed from: h */
    public JSONObject m58246h() {
        return this.f48144g;
    }

    /* renamed from: a */
    public org.json.JSONObject m58230a(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r5.f48144g;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r1 == 0) goto L_0x002c;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0009:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r5.f48144g;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r1.keys();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0018:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r3 == 0) goto L_0x002c;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x001e:
        r3 = r2.next();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r4 = r1.get(r3);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r0.put(r3, r4);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        goto L_0x0018;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x002c:
        r1 = r6.size();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r1 <= 0) goto L_0x0062;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0032:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r1.<init>();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r6.keySet();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r2.iterator();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x003f:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r3 == 0) goto L_0x0056;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0045:
        r3 = r2.next();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r4 = r6.get(r3);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r1.put(r3, r4);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r6.remove(r3);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        goto L_0x003f;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0056:
        r6 = io.branch.referral.Defines.Jsonkey.Branch_Instrumentation;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r6 = r6.getKey();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r0.put(r6, r1);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        goto L_0x0062;
    L_0x0060:
        r0 = r5.f48144g;
    L_0x0062:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(java.util.concurrent.ConcurrentHashMap):org.json.JSONObject");
    }

    /* renamed from: j */
    public JSONObject m58248j() {
        return this.f48144g;
    }

    /* renamed from: k */
    public org.json.JSONObject m58249k() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "REQ_POST";	 Catch:{ JSONException -> 0x0014 }
        r2 = r3.f48144g;	 Catch:{ JSONException -> 0x0014 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0014 }
        r1 = "REQ_POST_PATH";	 Catch:{ JSONException -> 0x0014 }
        r2 = r3.f48138a;	 Catch:{ JSONException -> 0x0014 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0014 }
        return r0;
    L_0x0014:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.k():org.json.JSONObject");
    }

    /* renamed from: a */
    public static io.branch.referral.ServerRequest m58224a(org.json.JSONObject r4, android.content.Context r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "";
        r1 = 0;
        r2 = "REQ_POST";	 Catch:{ JSONException -> 0x0012 }
        r2 = r4.has(r2);	 Catch:{ JSONException -> 0x0012 }
        if (r2 == 0) goto L_0x0012;	 Catch:{ JSONException -> 0x0012 }
    L_0x000b:
        r2 = "REQ_POST";	 Catch:{ JSONException -> 0x0012 }
        r2 = r4.getJSONObject(r2);	 Catch:{ JSONException -> 0x0012 }
        goto L_0x0013;
    L_0x0012:
        r2 = r1;
    L_0x0013:
        r3 = "REQ_POST_PATH";	 Catch:{ JSONException -> 0x0022 }
        r3 = r4.has(r3);	 Catch:{ JSONException -> 0x0022 }
        if (r3 == 0) goto L_0x0022;	 Catch:{ JSONException -> 0x0022 }
    L_0x001b:
        r3 = "REQ_POST_PATH";	 Catch:{ JSONException -> 0x0022 }
        r4 = r4.getString(r3);	 Catch:{ JSONException -> 0x0022 }
        r0 = r4;
    L_0x0022:
        if (r0 == 0) goto L_0x002f;
    L_0x0024:
        r4 = r0.length();
        if (r4 <= 0) goto L_0x002f;
    L_0x002a:
        r4 = m58223a(r0, r2, r5);
        return r4;
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(org.json.JSONObject, android.content.Context):io.branch.referral.ServerRequest");
    }

    /* renamed from: a */
    private static ServerRequest m58223a(String str, JSONObject jSONObject, Context context) {
        if (str.equalsIgnoreCase(RequestPath.CompletedAction.getPath())) {
            return new C17309n(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.GetURL.getPath())) {
            return new C17311o(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.GetCreditHistory.getPath())) {
            return new C17312p(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.GetCredits.getPath())) {
            return new C17313q(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.IdentifyUser.getPath())) {
            return new C17314r(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.Logout.getPath())) {
            return new C17316t(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.RedeemRewards.getPath())) {
            return new C17318v(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.RegisterClose.getPath())) {
            return new C17319w(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.RegisterInstall.getPath())) {
            return new C18328x(str, jSONObject, context);
        }
        return str.equalsIgnoreCase(RequestPath.RegisterOpen.getPath()) ? new C18329y(str, jSONObject, context) : null;
    }

    /* renamed from: u */
    private void mo12778u() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.mo12788r();
        r1 = r3.f48145h;
        r1 = io.branch.referral.aa.f48182a;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0068;
    L_0x000e:
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;	 Catch:{ JSONException -> 0x0063 }
        if (r0 != r1) goto L_0x0044;	 Catch:{ JSONException -> 0x0063 }
    L_0x0012:
        r0 = r3.f48144g;	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0063 }
        r0 = r0.optJSONObject(r1);	 Catch:{ JSONException -> 0x0063 }
        if (r0 == 0) goto L_0x0094;	 Catch:{ JSONException -> 0x0063 }
    L_0x0020:
        r1 = io.branch.referral.Defines.Jsonkey.AAID;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f48145h;	 Catch:{ JSONException -> 0x0063 }
        r2 = io.branch.referral.aa.f48182a;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.LimitedAdTracking;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f48145h;	 Catch:{ JSONException -> 0x0063 }
        r2 = r2.f48183b;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.UnidentifiedDevice;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0063 }
        r0.remove(r1);	 Catch:{ JSONException -> 0x0063 }
        goto L_0x0094;	 Catch:{ JSONException -> 0x0063 }
    L_0x0044:
        r0 = r3.f48144g;	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.GoogleAdvertisingID;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f48145h;	 Catch:{ JSONException -> 0x0063 }
        r2 = io.branch.referral.aa.f48182a;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        r0 = r3.f48144g;	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.LATVal;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f48145h;	 Catch:{ JSONException -> 0x0063 }
        r2 = r2.f48183b;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        goto L_0x0094;
    L_0x0063:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0094;
    L_0x0068:
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;
        if (r0 != r1) goto L_0x0094;
    L_0x006c:
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;	 Catch:{ JSONException -> 0x0094 }
        if (r0 != r1) goto L_0x0094;	 Catch:{ JSONException -> 0x0094 }
    L_0x0070:
        r0 = r3.f48144g;	 Catch:{ JSONException -> 0x0094 }
        r1 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x0094 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0094 }
        r0 = r0.optJSONObject(r1);	 Catch:{ JSONException -> 0x0094 }
        if (r0 == 0) goto L_0x0094;	 Catch:{ JSONException -> 0x0094 }
    L_0x007e:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidID;	 Catch:{ JSONException -> 0x0094 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0094 }
        r1 = r0.has(r1);	 Catch:{ JSONException -> 0x0094 }
        if (r1 != 0) goto L_0x0094;	 Catch:{ JSONException -> 0x0094 }
    L_0x008a:
        r1 = io.branch.referral.Defines.Jsonkey.UnidentifiedDevice;	 Catch:{ JSONException -> 0x0094 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0094 }
        r2 = 1;	 Catch:{ JSONException -> 0x0094 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0094 }
    L_0x0094:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.u():void");
    }

    /* renamed from: v */
    private void mo12779v() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.mo12788r();
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;
        if (r0 != r1) goto L_0x0034;
    L_0x0008:
        r0 = r3.f48144g;
        r1 = io.branch.referral.Defines.Jsonkey.UserData;
        r1 = r1.getKey();
        r0 = r0.optJSONObject(r1);
        if (r0 == 0) goto L_0x0034;
    L_0x0016:
        r1 = io.branch.referral.Defines.Jsonkey.DeveloperIdentity;	 Catch:{ JSONException -> 0x0034 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0034 }
        r2 = r3.f48139b;	 Catch:{ JSONException -> 0x0034 }
        r2 = r2.m58433j();	 Catch:{ JSONException -> 0x0034 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0034 }
        r1 = io.branch.referral.Defines.Jsonkey.DeviceFingerprintID;	 Catch:{ JSONException -> 0x0034 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0034 }
        r2 = r3.f48139b;	 Catch:{ JSONException -> 0x0034 }
        r2 = r2.m58427g();	 Catch:{ JSONException -> 0x0034 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0034 }
    L_0x0034:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.v():void");
    }

    /* renamed from: w */
    private void mo12780w() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x005b }
        r0.<init>();	 Catch:{ JSONException -> 0x005b }
        r1 = r5.f48139b;	 Catch:{ JSONException -> 0x005b }
        r1 = r1.m58401H();	 Catch:{ JSONException -> 0x005b }
        r1 = r1.keys();	 Catch:{ JSONException -> 0x005b }
    L_0x000f:
        r2 = r1.hasNext();	 Catch:{ JSONException -> 0x005b }
        if (r2 == 0) goto L_0x0029;	 Catch:{ JSONException -> 0x005b }
    L_0x0015:
        r2 = r1.next();	 Catch:{ JSONException -> 0x005b }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x005b }
        r3 = r5.f48139b;	 Catch:{ JSONException -> 0x005b }
        r3 = r3.m58401H();	 Catch:{ JSONException -> 0x005b }
        r3 = r3.get(r2);	 Catch:{ JSONException -> 0x005b }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x005b }
        goto L_0x000f;	 Catch:{ JSONException -> 0x005b }
    L_0x0029:
        r1 = r5.f48144g;	 Catch:{ JSONException -> 0x005b }
        r2 = io.branch.referral.Defines.Jsonkey.Metadata;	 Catch:{ JSONException -> 0x005b }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x005b }
        r1 = r1.optJSONObject(r2);	 Catch:{ JSONException -> 0x005b }
        if (r1 == 0) goto L_0x004f;	 Catch:{ JSONException -> 0x005b }
    L_0x0037:
        r2 = r1.keys();	 Catch:{ JSONException -> 0x005b }
    L_0x003b:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x005b }
        if (r3 == 0) goto L_0x004f;	 Catch:{ JSONException -> 0x005b }
    L_0x0041:
        r3 = r2.next();	 Catch:{ JSONException -> 0x005b }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x005b }
        r4 = r1.get(r3);	 Catch:{ JSONException -> 0x005b }
        r0.put(r3, r4);	 Catch:{ JSONException -> 0x005b }
        goto L_0x003b;	 Catch:{ JSONException -> 0x005b }
    L_0x004f:
        r1 = r5.f48144g;	 Catch:{ JSONException -> 0x005b }
        r2 = io.branch.referral.Defines.Jsonkey.Metadata;	 Catch:{ JSONException -> 0x005b }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x005b }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x005b }
        goto L_0x0062;
    L_0x005b:
        r0 = "BranchSDK";
        r1 = "Could not merge metadata, ignoring user metadata.";
        android.util.Log.e(r0, r1);
    L_0x0062:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.w():void");
    }

    /* renamed from: x */
    private void mo12781x() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.mo12788r();
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V1;
        if (r0 != r1) goto L_0x000b;
    L_0x0008:
        r0 = r3.f48144g;
        goto L_0x0017;
    L_0x000b:
        r0 = r3.f48144g;
        r1 = io.branch.referral.Defines.Jsonkey.UserData;
        r1 = r1.getKey();
        r0 = r0.optJSONObject(r1);
    L_0x0017:
        if (r0 == 0) goto L_0x002e;
    L_0x0019:
        r1 = r3.f48139b;
        r1 = r1.m58394A();
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r2 = io.branch.referral.Defines.Jsonkey.limitFacebookTracking;	 Catch:{ JSONException -> 0x002e }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x002e }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ JSONException -> 0x002e }
        r0.putOpt(r2, r1);	 Catch:{ JSONException -> 0x002e }
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.x():void");
    }

    /* renamed from: l */
    void m58250l() {
        mo12780w();
        if (mo12784e()) {
            mo12781x();
        }
    }

    /* renamed from: m */
    void m58251m() {
        if (this instanceof C17315s) {
            ((C17315s) this).mo12781x();
        }
        mo12779v();
        if (mo12785i() && !C2666j.a(this.f48148k)) {
            mo12778u();
        }
    }

    /* renamed from: b */
    protected boolean m58240b(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.INTERNET") == null ? true : null;
    }

    /* renamed from: n */
    public void m58252n() {
        this.f48140c = System.currentTimeMillis();
    }

    /* renamed from: o */
    public long m58253o() {
        if (this.f48140c > 0) {
            return System.currentTimeMillis() - this.f48140c;
        }
        return 0;
    }

    /* renamed from: a */
    public void m58233a(PROCESS_WAIT_LOCK process_wait_lock) {
        if (process_wait_lock != null) {
            this.f48141d.add(process_wait_lock);
        }
    }

    /* renamed from: b */
    public void m58239b(PROCESS_WAIT_LOCK process_wait_lock) {
        this.f48141d.remove(process_wait_lock);
    }

    /* renamed from: p */
    public boolean m58254p() {
        return this.f48141d.size() > 0;
    }

    /* renamed from: a */
    protected void m58232a(android.content.Context r3, org.json.JSONObject r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = m58225c(r3);	 Catch:{ Exception -> 0x0037 }
        if (r3 == 0) goto L_0x000d;	 Catch:{ Exception -> 0x0037 }
    L_0x0006:
        r3 = io.branch.referral.Defines.Jsonkey.NativeApp;	 Catch:{ Exception -> 0x0037 }
    L_0x0008:
        r3 = r3.getKey();	 Catch:{ Exception -> 0x0037 }
        goto L_0x0010;	 Catch:{ Exception -> 0x0037 }
    L_0x000d:
        r3 = io.branch.referral.Defines.Jsonkey.InstantApp;	 Catch:{ Exception -> 0x0037 }
        goto L_0x0008;	 Catch:{ Exception -> 0x0037 }
    L_0x0010:
        r0 = r2.mo12788r();	 Catch:{ Exception -> 0x0037 }
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;	 Catch:{ Exception -> 0x0037 }
        if (r0 != r1) goto L_0x002e;	 Catch:{ Exception -> 0x0037 }
    L_0x0018:
        r0 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ Exception -> 0x0037 }
        r0 = r0.getKey();	 Catch:{ Exception -> 0x0037 }
        r4 = r4.optJSONObject(r0);	 Catch:{ Exception -> 0x0037 }
        if (r4 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0037 }
    L_0x0024:
        r0 = io.branch.referral.Defines.Jsonkey.Environment;	 Catch:{ Exception -> 0x0037 }
        r0 = r0.getKey();	 Catch:{ Exception -> 0x0037 }
        r4.put(r0, r3);	 Catch:{ Exception -> 0x0037 }
        goto L_0x0037;	 Catch:{ Exception -> 0x0037 }
    L_0x002e:
        r0 = io.branch.referral.Defines.Jsonkey.Environment;	 Catch:{ Exception -> 0x0037 }
        r0 = r0.getKey();	 Catch:{ Exception -> 0x0037 }
        r4.put(r0, r3);	 Catch:{ Exception -> 0x0037 }
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(android.content.Context, org.json.JSONObject):void");
    }

    /* renamed from: c */
    private static boolean m58225c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        context = packageManager.getLaunchIntentForPackage(context.getPackageName());
        boolean z = false;
        if (context == null) {
            return false;
        }
        context = packageManager.queryIntentActivities(context, 65536);
        if (context != null && context.size() > null) {
            z = true;
        }
        return z;
    }

    /* renamed from: r */
    public BRANCH_API_VERSION mo12788r() {
        return BRANCH_API_VERSION.V1;
    }

    /* renamed from: s */
    public void m58257s() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Requested operation cannot be completed since tracking is disabled [");
        stringBuilder.append(this.f48138a);
        stringBuilder.append("]");
        C15593m.m58390b("BranchSDK", stringBuilder.toString());
        mo12769a(-117, "");
    }
}
