package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aq;
import com.leanplum.p069a.ba;
import com.leanplum.p069a.bo;
import org.json.JSONObject;

/* renamed from: com.leanplum.b */
final class C7043b implements ba {
    /* renamed from: a */
    private /* synthetic */ VariablesChangedCallback f25640a;

    C7043b(VariablesChangedCallback variablesChangedCallback) {
        this.f25640a = variablesChangedCallback;
    }

    /* renamed from: a */
    public final void m30611a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                ao.a(new Object[]{"No response received from the server. Please contact us to investigate."});
            } catch (JSONObject jSONObject2) {
                bo.a(jSONObject2);
                return;
            }
        }
        Leanplum.a(jSONObject2, false);
        if (jSONObject2.optBoolean("syncNewsfeed", false)) {
            LeanplumInbox.a().d();
        } else {
            LeanplumInbox.a().a(true);
        }
        if (jSONObject2.optBoolean("loggingEnabled", false) != null) {
            C2590h.f8068m = true;
        }
        if (this.f25640a != null) {
            aq.a().a(this.f25640a);
        }
    }
}
