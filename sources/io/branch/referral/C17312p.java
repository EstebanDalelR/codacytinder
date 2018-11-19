package io.branch.referral;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: io.branch.referral.p */
class C17312p extends ServerRequest {
    /* renamed from: g */
    Branch$BranchListResponseListener f53012g;

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    public C17312p(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        if (this.f53012g != null) {
            this.f53012g.onReceivingResponse(c15601z.m58529c(), null);
        }
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f53012g != null) {
            Branch$BranchListResponseListener branch$BranchListResponseListener = this.f53012g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble retrieving user credit history. ");
            stringBuilder.append(str);
            branch$BranchListResponseListener.onReceivingResponse(null, new C15583e(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) != null) {
            return null;
        }
        if (this.f53012g != null) {
            this.f53012g.onReceivingResponse(null, new C15583e("Trouble retrieving user credit history.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f53012g = null;
    }
}
