package io.branch.referral;

import android.content.Context;
import android.util.Log;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONObject;

/* renamed from: io.branch.referral.n */
class C17309n extends ServerRequest {
    /* renamed from: g */
    private final BranchViewHandler$IBranchViewEvents f53005g;

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

    /* renamed from: c */
    public boolean mo12774c() {
        return true;
    }

    public C17309n(Context context, String str, JSONObject jSONObject, BranchViewHandler$IBranchViewEvents branchViewHandler$IBranchViewEvents) {
        super(context, RequestPath.CompletedAction.getPath());
        this.f53005g = branchViewHandler$IBranchViewEvents;
        branchViewHandler$IBranchViewEvents = new JSONObject();
        try {
            branchViewHandler$IBranchViewEvents.put(Jsonkey.IdentityID.getKey(), this.b.m58431i());
            branchViewHandler$IBranchViewEvents.put(Jsonkey.DeviceFingerprintID.getKey(), this.b.m58427g());
            branchViewHandler$IBranchViewEvents.put(Jsonkey.SessionID.getKey(), this.b.m58429h());
            if (!this.b.m58435k().equals("bnc_no_value")) {
                branchViewHandler$IBranchViewEvents.put(Jsonkey.LinkClickID.getKey(), this.b.m58435k());
            }
            branchViewHandler$IBranchViewEvents.put(Jsonkey.Event.getKey(), str);
            if (jSONObject != null) {
                branchViewHandler$IBranchViewEvents.put(Jsonkey.Metadata.getKey(), jSONObject);
            }
            m58232a(context, (JSONObject) branchViewHandler$IBranchViewEvents);
            mo12783a((JSONObject) branchViewHandler$IBranchViewEvents);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
        if (str != null && str.equalsIgnoreCase("purchase") != null) {
            Log.e("BranchSDK", "Warning: You are sending a purchase event with our non-dedicated purchase function. Please see function sendCommerceEvent");
        }
    }

    public C17309n(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.f53005g = null;
    }

    /* renamed from: a */
    public void mo12770a(io.branch.referral.C15601z r4, io.branch.referral.Branch r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r5 = r4.m58528b();
        if (r5 == 0) goto L_0x0082;
    L_0x0006:
        r5 = r4.m58528b();
        r0 = io.branch.referral.Defines.Jsonkey.BranchViewData;
        r0 = r0.getKey();
        r5 = r5.has(r0);
        if (r5 == 0) goto L_0x0082;
    L_0x0016:
        r5 = io.branch.referral.Branch.b();
        r5 = r5.f12589e;
        if (r5 == 0) goto L_0x0082;
    L_0x001e:
        r5 = io.branch.referral.Branch.b();
        r5 = r5.f12589e;
        r5 = r5.get();
        if (r5 == 0) goto L_0x0082;
    L_0x002a:
        r5 = "";
        r0 = r3.m58246h();	 Catch:{ JSONException -> 0x0075 }
        if (r0 == 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0075 }
    L_0x0032:
        r1 = io.branch.referral.Defines.Jsonkey.Event;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0075 }
        r1 = r0.has(r1);	 Catch:{ JSONException -> 0x0075 }
        if (r1 == 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0075 }
    L_0x003e:
        r1 = io.branch.referral.Defines.Jsonkey.Event;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.getString(r1);	 Catch:{ JSONException -> 0x0075 }
        r5 = r0;	 Catch:{ JSONException -> 0x0075 }
    L_0x0049:
        r0 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.f12589e;	 Catch:{ JSONException -> 0x0075 }
        if (r0 == 0) goto L_0x0082;	 Catch:{ JSONException -> 0x0075 }
    L_0x0051:
        r0 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.f12589e;	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.get();	 Catch:{ JSONException -> 0x0075 }
        r0 = (android.app.Activity) r0;	 Catch:{ JSONException -> 0x0075 }
        r4 = r4.m58528b();	 Catch:{ JSONException -> 0x0075 }
        r1 = io.branch.referral.Defines.Jsonkey.BranchViewData;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x0075 }
        r4 = r4.getJSONObject(r1);	 Catch:{ JSONException -> 0x0075 }
        r1 = io.branch.referral.BranchViewHandler.m58191a();	 Catch:{ JSONException -> 0x0075 }
        r2 = r3.f53005g;	 Catch:{ JSONException -> 0x0075 }
        r1.m58207a(r4, r5, r0, r2);	 Catch:{ JSONException -> 0x0075 }
        goto L_0x0082;
    L_0x0075:
        r4 = r3.f53005g;
        if (r4 == 0) goto L_0x0082;
    L_0x0079:
        r4 = r3.f53005g;
        r0 = -201; // 0xffffffffffffff37 float:NaN double:NaN;
        r1 = "Unable to show branch view. Branch view received is invalid ";
        r4.onBranchViewError(r0, r1, r5);
    L_0x0082:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.n.a(io.branch.referral.z, io.branch.referral.Branch):void");
    }

    /* renamed from: a */
    public boolean mo12772a(Context context) {
        if (super.m58240b(context) != null) {
            return null;
        }
        Log.i("BranchSDK", "Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        return true;
    }
}
