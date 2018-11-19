package io.branch.referral;

import android.content.Context;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.x */
class C18328x extends C17315s {
    /* renamed from: h */
    Branch$BranchReferralInitListener f56795h;

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    /* renamed from: w */
    public String mo12780w() {
        return "install";
    }

    C18328x(Context context, Branch$BranchReferralInitListener branch$BranchReferralInitListener, aa aaVar, String str) {
        super(context, RequestPath.RegisterInstall.getPath(), aaVar);
        this.f56795h = branch$BranchReferralInitListener;
        context = new JSONObject();
        try {
            if (str.equals("bnc_no_value") == null) {
                context.put(Jsonkey.LinkClickID.getKey(), str);
            }
            mo12783a((JSONObject) context);
            if (this.b.m58400G() != null) {
                mo12778u();
            }
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
    }

    public C18328x(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: q */
    public void mo12786q() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        super.mo12786q();
        r0 = r8.b;
        r1 = "bnc_referrer_click_ts";
        r0 = r0.m58455u(r1);
        r2 = r8.b;
        r3 = "bnc_install_begin_ts";
        r2 = r2.m58455u(r3);
        r4 = 0;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0026;
    L_0x0019:
        r6 = r8.m58246h();	 Catch:{ JSONException -> 0x0037 }
        r7 = io.branch.referral.Defines.Jsonkey.ClickedReferrerTimeStamp;	 Catch:{ JSONException -> 0x0037 }
        r7 = r7.getKey();	 Catch:{ JSONException -> 0x0037 }
        r6.put(r7, r0);	 Catch:{ JSONException -> 0x0037 }
    L_0x0026:
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ JSONException -> 0x0037 }
        if (r0 <= 0) goto L_0x0037;	 Catch:{ JSONException -> 0x0037 }
    L_0x002a:
        r0 = r8.m58246h();	 Catch:{ JSONException -> 0x0037 }
        r1 = io.branch.referral.Defines.Jsonkey.InstallBeginTimeStamp;	 Catch:{ JSONException -> 0x0037 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0037 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0037 }
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.x.q():void");
    }

    /* renamed from: v */
    public boolean mo12779v() {
        return this.f56795h != null;
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        super.mo12770a(c15601z, branch);
        try {
            this.b.m58450r(c15601z.m58528b().getString(Jsonkey.Link.getKey()));
            if (c15601z.m58528b().has(Jsonkey.Data.getKey())) {
                JSONObject jSONObject = new JSONObject(c15601z.m58528b().getString(Jsonkey.Data.getKey()));
                if (jSONObject.has(Jsonkey.Clicked_Branch_Link.getKey()) && jSONObject.getBoolean(Jsonkey.Clicked_Branch_Link.getKey()) && this.b.m58457v().equals("bnc_no_value") && this.b.m58461x() == 1) {
                    this.b.m58446p(c15601z.m58528b().getString(Jsonkey.Data.getKey()));
                }
            }
            if (c15601z.m58528b().has(Jsonkey.LinkClickID.getKey())) {
                this.b.m58428g(c15601z.m58528b().getString(Jsonkey.LinkClickID.getKey()));
            } else {
                this.b.m58428g("bnc_no_value");
            }
            if (c15601z.m58528b().has(Jsonkey.Data.getKey())) {
                this.b.m58444o(c15601z.m58528b().getString(Jsonkey.Data.getKey()));
            } else {
                this.b.m58444o("bnc_no_value");
            }
            if (!(this.f56795h == null || branch.f12590f)) {
                this.f56795h.onInitFinished(branch.i(), null);
            }
            this.b.m58406a(this.g.m58298e());
        } catch (Exception e) {
            e.printStackTrace();
        }
        m63332b(c15601z, branch);
    }

    /* renamed from: a */
    public void m66344a(Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        if (branch$BranchReferralInitListener != null) {
            this.f56795h = branch$BranchReferralInitListener;
        }
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f56795h != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Branch$BranchReferralInitListener branch$BranchReferralInitListener = this.f56795h;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble initializing Branch. ");
            stringBuilder.append(str);
            branch$BranchReferralInitListener.onInitFinished(jSONObject, new C15583e(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) != null) {
            return null;
        }
        if (this.f56795h != null) {
            this.f56795h.onInitFinished(null, new C15583e("Trouble initializing Branch.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f56795h = null;
    }
}
