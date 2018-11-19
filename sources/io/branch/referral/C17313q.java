package io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.q */
class C17313q extends ServerRequest {
    /* renamed from: g */
    Branch$BranchReferralStateChangedListener f53013g;

    /* renamed from: a */
    public boolean mo12771a() {
        return true;
    }

    public C17313q(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: g */
    public String mo12782g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo12782g());
        stringBuilder.append(this.b.m58431i());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        branch = c15601z.m58528b().keys();
        boolean z = false;
        while (branch.hasNext()) {
            String str = (String) branch.next();
            try {
                int i = c15601z.m58528b().getInt(str);
                if (i != this.b.m58451s(str)) {
                    z = true;
                }
                this.b.m58407a(str, i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.f53013g != null) {
            this.f53013g.onStateChanged(z, null);
        }
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f53013g != null) {
            Branch$BranchReferralStateChangedListener branch$BranchReferralStateChangedListener = this.f53013g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble retrieving user credits. ");
            stringBuilder.append(str);
            branch$BranchReferralStateChangedListener.onStateChanged(false, new C15583e(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) != null) {
            return false;
        }
        if (this.f53013g != null) {
            this.f53013g.onStateChanged(false, new C15583e("Trouble retrieving user credits.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f53013g = null;
    }
}
