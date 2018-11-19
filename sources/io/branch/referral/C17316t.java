package io.branch.referral;

import android.content.Context;
import android.util.Log;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONObject;

/* renamed from: io.branch.referral.t */
class C17316t extends ServerRequest {
    /* renamed from: g */
    private Branch$LogoutStatusListener f53019g;

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    /* renamed from: d */
    boolean mo12777d() {
        return false;
    }

    public C17316t(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        try {
            this.b.m58421d(c15601z.m58528b().getString(Jsonkey.SessionID.getKey()));
            this.b.m58423e(c15601z.m58528b().getString(Jsonkey.IdentityID.getKey()));
            this.b.m58450r(c15601z.m58528b().getString(Jsonkey.Link.getKey()));
            this.b.m58446p("bnc_no_value");
            this.b.m58444o("bnc_no_value");
            this.b.m58426f("bnc_no_value");
            this.b.m58395B();
            if (this.f53019g == null) {
            }
        } catch (C15601z c15601z2) {
            c15601z2.printStackTrace();
        } finally {
            if (this.f53019g != null) {
                this.f53019g.onLogoutFinished(true, null);
            }
        }
    }

    /* renamed from: a */
    public void mo12769a(int i, String str) {
        if (this.f53019g != null) {
            Branch$LogoutStatusListener branch$LogoutStatusListener = this.f53019g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Logout error. ");
            stringBuilder.append(str);
            branch$LogoutStatusListener.onLogoutFinished(false, new C15583e(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) != null) {
            return false;
        }
        Log.i("BranchSDK", "Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        if (this.f53019g != null) {
            this.f53019g.onLogoutFinished(false, new C15583e("Logout failed", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo12773b() {
        this.f53019g = null;
    }
}
