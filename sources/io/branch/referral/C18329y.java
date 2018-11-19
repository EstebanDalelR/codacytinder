package io.branch.referral;

import android.content.Context;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.y */
class C18329y extends C17315s {
    /* renamed from: h */
    Branch$BranchReferralInitListener f56796h;

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    /* renamed from: w */
    public String mo12780w() {
        return "open";
    }

    C18329y(Context context, Branch$BranchReferralInitListener branch$BranchReferralInitListener, aa aaVar) {
        super(context, RequestPath.RegisterOpen.getPath(), aaVar);
        this.f56796h = branch$BranchReferralInitListener;
        context = new JSONObject();
        try {
            context.put(Jsonkey.DeviceFingerprintID.getKey(), this.b.m58427g());
            context.put(Jsonkey.IdentityID.getKey(), this.b.m58431i());
            mo12783a((JSONObject) context);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
    }

    C18329y(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        super.mo12770a(c15601z, branch);
        try {
            if (c15601z.m58528b().has(Jsonkey.LinkClickID.getKey())) {
                this.b.m58428g(c15601z.m58528b().getString(Jsonkey.LinkClickID.getKey()));
            } else {
                this.b.m58428g("bnc_no_value");
            }
            if (c15601z.m58528b().has(Jsonkey.Data.getKey())) {
                JSONObject jSONObject = new JSONObject(c15601z.m58528b().getString(Jsonkey.Data.getKey()));
                if (jSONObject.has(Jsonkey.Clicked_Branch_Link.getKey()) && jSONObject.getBoolean(Jsonkey.Clicked_Branch_Link.getKey()) && this.b.m58457v().equals("bnc_no_value") && this.b.m58461x() == 1) {
                    this.b.m58446p(c15601z.m58528b().getString(Jsonkey.Data.getKey()));
                }
            }
            if (c15601z.m58528b().has(Jsonkey.Data.getKey())) {
                this.b.m58444o(c15601z.m58528b().getString(Jsonkey.Data.getKey()));
            } else {
                this.b.m58444o("bnc_no_value");
            }
            if (!(this.f56796h == null || branch.f12590f)) {
                this.f56796h.onInitFinished(branch.i(), null);
            }
            this.b.m58406a(this.g.m58298e());
        } catch (Exception e) {
            e.printStackTrace();
        }
        m63332b(c15601z, branch);
    }

    /* renamed from: a */
    void m66353a(Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        if (branch$BranchReferralInitListener != null) {
            this.f56796h = branch$BranchReferralInitListener;
        }
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f56796h != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Branch$BranchReferralInitListener branch$BranchReferralInitListener = this.f56796h;
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
        if (this.f56796h != null) {
            this.f56796h.onInitFinished(null, new C15583e("Trouble initializing Branch.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f56796h = null;
    }

    /* renamed from: v */
    public boolean mo12779v() {
        return this.f56796h != null;
    }
}
