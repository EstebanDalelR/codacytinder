package io.branch.referral;

import android.content.Context;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONObject;

/* renamed from: io.branch.referral.v */
class C17318v extends ServerRequest {
    /* renamed from: g */
    Branch$BranchReferralStateChangedListener f53021g;
    /* renamed from: h */
    int f53022h = null;

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    public C17318v(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) == null) {
            if (this.f53021g != null) {
                this.f53021g.onStateChanged(false, new C15583e("Trouble redeeming rewards.", -102));
            }
            return true;
        } else if (this.f53022h > null) {
            return false;
        } else {
            if (this.f53021g != null) {
                this.f53021g.onStateChanged(false, new C15583e("Trouble redeeming rewards.", -107));
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        c15601z = m58246h();
        branch = null;
        if (c15601z != null && c15601z.has(Jsonkey.Bucket.getKey()) && c15601z.has(Jsonkey.Amount.getKey())) {
            try {
                int i = c15601z.getInt(Jsonkey.Amount.getKey());
                String string = c15601z.getString(Jsonkey.Bucket.getKey());
                if (i > 0) {
                    branch = true;
                }
                this.b.m58407a(string, this.b.m58451s(string) - i);
            } catch (C15601z c15601z2) {
                c15601z2.printStackTrace();
            }
        }
        if (this.f53021g != null) {
            if (branch != null) {
                c15601z2 = null;
            } else {
                c15601z2 = new C15583e("Trouble redeeming rewards.", -107);
            }
            this.f53021g.onStateChanged(branch, c15601z2);
        }
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f53021g != null) {
            Branch$BranchReferralStateChangedListener branch$BranchReferralStateChangedListener = this.f53021g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble redeeming rewards. ");
            stringBuilder.append(str);
            branch$BranchReferralStateChangedListener.onStateChanged(false, new C15583e(stringBuilder.toString(), i));
        }
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f53021g = null;
    }
}
