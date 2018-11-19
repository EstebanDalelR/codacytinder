package io.branch.referral;

import android.content.Context;
import android.util.Log;
import io.branch.indexing.C15560b;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONObject;

/* renamed from: io.branch.referral.w */
class C17319w extends ServerRequest {
    /* renamed from: a */
    public void mo12769a(int i, String str) {
    }

    /* renamed from: a */
    public boolean mo12771a() {
        return false;
    }

    /* renamed from: b */
    public void mo12773b() {
    }

    /* renamed from: d */
    boolean mo12777d() {
        return false;
    }

    public C17319w(Context context) {
        super(context, RequestPath.RegisterClose.getPath());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Jsonkey.DeviceFingerprintID.getKey(), this.b.m58427g());
            jSONObject.put(Jsonkey.IdentityID.getKey(), this.b.m58431i());
            jSONObject.put(Jsonkey.SessionID.getKey(), this.b.m58429h());
            if (!this.b.m58435k().equals("bnc_no_value")) {
                jSONObject.put(Jsonkey.LinkClickID.getKey(), this.b.m58435k());
            }
            context = C15560b.m58095a().m58118a(context);
            if (context != null) {
                jSONObject.put(Jsonkey.ContentDiscovery.getKey(), context);
            }
            if (C15591k.m58372a() != null) {
                jSONObject.put(Jsonkey.AppVersion.getKey(), C15591k.m58372a().m58377b());
            }
            mo12783a(jSONObject);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
    }

    public C17319w(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) != null) {
            return null;
        }
        Log.i("BranchSDK", "Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        return true;
    }

    /* renamed from: a */
    public void mo12770a(C15601z c15601z, Branch branch) {
        this.b.m58444o("bnc_no_value");
    }
}
