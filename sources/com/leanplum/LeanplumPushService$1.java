package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aw;
import com.leanplum.p069a.ay;
import com.leanplum.p069a.ba;
import com.leanplum.p069a.bo;
import com.leanplum.p069a.bq;
import com.tinder.api.ManagerWebServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

final class LeanplumPushService$1 extends VariablesChangedCallback {
    /* renamed from: a */
    final /* synthetic */ VariablesChangedCallback f25504a;
    /* renamed from: b */
    private /* synthetic */ String f25505b;

    /* renamed from: com.leanplum.LeanplumPushService$1$1 */
    final class C70291 implements ba {
        /* renamed from: a */
        private /* synthetic */ LeanplumPushService$1 f25502a;

        C70291(LeanplumPushService$1 leanplumPushService$1) {
            this.f25502a = leanplumPushService$1;
        }

        /* renamed from: a */
        public final void m30535a(JSONObject jSONObject) {
            if (jSONObject == null) {
                try {
                    ao.a(new Object[]{"No response received from the server. Please contact us to investigate."});
                } catch (JSONObject jSONObject2) {
                    bo.a(jSONObject2);
                    return;
                }
            }
            Map map;
            Map map2;
            Map a = ab.a(jSONObject2.optJSONObject("vars"));
            Map a2 = ab.a(jSONObject2.optJSONObject(ManagerWebServices.PARAM_MESSAGES));
            Map a3 = ab.a(jSONObject2.optJSONObject("regions"));
            List a4 = ab.a(jSONObject2.optJSONArray("variants"));
            if (C2590h.f8072q != null) {
                if (bq.a().equals(a) == null) {
                    map = a;
                    map2 = bq.b().equals(a2) == null ? null : a2;
                    if (!(map == null && map2 == null)) {
                        bq.a(map, map2, null, null, a3, a4);
                    }
                }
            }
            map = null;
            if (bq.b().equals(a2) == null) {
            }
            bq.a(map, map2, null, null, a3, a4);
            this.f25502a.f25504a.variablesChanged();
        }
    }

    /* renamed from: com.leanplum.LeanplumPushService$1$2 */
    final class C70302 implements ay {
        /* renamed from: a */
        private /* synthetic */ LeanplumPushService$1 f25503a;

        C70302(LeanplumPushService$1 leanplumPushService$1) {
            this.f25503a = leanplumPushService$1;
        }

        /* renamed from: a */
        public final void m30536a(Exception exception) {
            this.f25503a.f25504a.variablesChanged();
        }
    }

    LeanplumPushService$1(String str, VariablesChangedCallback variablesChangedCallback) {
        this.f25505b = str;
        this.f25504a = variablesChangedCallback;
    }

    public final void variablesChanged() {
        try {
            Map p = bq.p();
            if (this.f25505b != null) {
                if (p == null || !p.containsKey(this.f25505b)) {
                    p = new HashMap();
                    p.put("includeDefaults", Boolean.toString(false));
                    p.put("includeMessageId", this.f25505b);
                    aw b = aw.b("getVars", p);
                    b.a(new C70291(this));
                    b.a(new C70302(this));
                    b.j();
                    return;
                }
            }
            this.f25504a.variablesChanged();
        } catch (Throwable th) {
            bo.a(th);
        }
    }
}
