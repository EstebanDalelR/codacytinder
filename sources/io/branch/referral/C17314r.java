package io.branch.referral;

import android.content.Context;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.r */
class C17314r extends ServerRequest {
    /* renamed from: g */
    Branch$BranchReferralInitListener f53014g;
    /* renamed from: h */
    String f53015h = null;

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    /* renamed from: c */
    public boolean mo12774c() {
        return true;
    }

    public C17314r(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        try {
            if (m58246h() != null && m58246h().has(Jsonkey.Identity.getKey())) {
                this.b.m58426f(m58246h().getString(Jsonkey.Identity.getKey()));
            }
            this.b.m58423e(c15601z.m58528b().getString(Jsonkey.IdentityID.getKey()));
            this.b.m58450r(c15601z.m58528b().getString(Jsonkey.Link.getKey()));
            if (c15601z.m58528b().has(Jsonkey.ReferringData.getKey())) {
                this.b.m58446p(c15601z.m58528b().getString(Jsonkey.ReferringData.getKey()));
            }
            if (this.f53014g != null) {
                this.f53014g.onInitFinished(branch.h(), null);
            }
        } catch (C15601z c15601z2) {
            c15601z2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f53014g != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Branch$BranchReferralInitListener branch$BranchReferralInitListener = this.f53014g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble setting the user alias. ");
            stringBuilder.append(str);
            branch$BranchReferralInitListener.onInitFinished(jSONObject, new C15583e(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo12772a(android.content.Context r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r6 = super.m58240b(r6);
        r0 = 1;
        if (r6 != 0) goto L_0x001b;
    L_0x0007:
        r6 = r5.f53014g;
        if (r6 == 0) goto L_0x001a;
    L_0x000b:
        r6 = r5.f53014g;
        r1 = 0;
        r2 = new io.branch.referral.e;
        r3 = "Trouble setting the user alias.";
        r4 = -102; // 0xffffffffffffff9a float:NaN double:NaN;
        r2.<init>(r3, r4);
        r6.onInitFinished(r1, r2);
    L_0x001a:
        return r0;
    L_0x001b:
        r6 = r5.m58246h();	 Catch:{ JSONException -> 0x0041 }
        r1 = io.branch.referral.Defines.Jsonkey.Identity;	 Catch:{ JSONException -> 0x0041 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0041 }
        r6 = r6.getString(r1);	 Catch:{ JSONException -> 0x0041 }
        if (r6 == 0) goto L_0x0040;	 Catch:{ JSONException -> 0x0041 }
    L_0x002b:
        r1 = r6.length();	 Catch:{ JSONException -> 0x0041 }
        if (r1 == 0) goto L_0x0040;	 Catch:{ JSONException -> 0x0041 }
    L_0x0031:
        r1 = r5.b;	 Catch:{ JSONException -> 0x0041 }
        r1 = r1.m58433j();	 Catch:{ JSONException -> 0x0041 }
        r6 = r6.equals(r1);	 Catch:{ JSONException -> 0x0041 }
        if (r6 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r6 = 0;
        return r6;
    L_0x0040:
        return r0;
    L_0x0041:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.r.a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f53014g = null;
    }
}
