package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aq;
import com.leanplum.p069a.ba;
import com.leanplum.p069a.bo;
import org.json.JSONObject;

/* renamed from: com.leanplum.a */
class C3861a implements ba {
    /* renamed from: a */
    private static int f12108a = 1;
    /* renamed from: b */
    private static int f12109b = 2;
    /* renamed from: c */
    private static int f12110c = 4;
    /* renamed from: d */
    private /* synthetic */ VariablesChangedCallback f12111d;

    C3861a() {
    }

    /* renamed from: a */
    static boolean m14570a(Number number, Number number2) {
        if ((number.intValue() == 4 || number.intValue() == 1) && number2.intValue() == 2) {
            return true;
        }
        return null;
    }

    /* renamed from: b */
    static boolean m14571b(Number number, Number number2) {
        return (number.intValue() == 2 && number2.intValue() == 4) ? true : null;
    }

    C3861a(VariablesChangedCallback variablesChangedCallback) {
        this.f12111d = variablesChangedCallback;
    }

    /* renamed from: a */
    public void mo2627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                ao.m9516a("No response received from the server. Please contact us to investigate.");
            } catch (Throwable th) {
                bo.m9608a(th);
                return;
            }
        }
        Leanplum.m9354a(jSONObject, false);
        if (jSONObject.optBoolean("syncNewsfeed", false)) {
            LeanplumInbox.m9394a().m9405d();
        } else {
            LeanplumInbox.m9394a().m9403a(true);
        }
        if (jSONObject.optBoolean("loggingEnabled", false) != null) {
            C2590h.f8068m = true;
        }
        if (this.f12111d != null) {
            aq.m9522a().m9523a(this.f12111d);
        }
    }
}
