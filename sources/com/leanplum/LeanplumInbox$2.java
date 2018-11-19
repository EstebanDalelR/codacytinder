package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.ba;
import com.leanplum.p069a.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

final class LeanplumInbox$2 implements ba {
    /* renamed from: a */
    final /* synthetic */ LeanplumInbox f25500a;

    LeanplumInbox$2(LeanplumInbox leanplumInbox) {
        this.f25500a = leanplumInbox;
    }

    /* renamed from: a */
    public final void m30533a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                ao.a(new Object[]{"No inbox response received from the server."});
                return;
            } catch (JSONObject jSONObject2) {
                this.f25500a.a(false);
                bo.a(jSONObject2);
                return;
            }
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("newsfeedMessages");
        if (optJSONObject == null) {
            ao.a(new Object[]{"No inbox messages found in the response from the server.", jSONObject2});
            return;
        }
        jSONObject2 = new HashMap();
        Boolean valueOf = Boolean.valueOf(false);
        Iterator keys = optJSONObject.keys();
        int i = 0;
        while (keys.hasNext()) {
            String str = (String) keys.next();
            JSONObject jSONObject3 = optJSONObject.getJSONObject(str);
            Map a = ab.a(jSONObject3.getJSONObject("messageData").getJSONObject("vars"));
            Long valueOf2 = Long.valueOf(jSONObject3.getLong("deliveryTimestamp"));
            Long l = null;
            if (jSONObject3.opt("expirationTimestamp") != null) {
                l = Long.valueOf(jSONObject3.getLong("expirationTimestamp"));
            }
            boolean z = jSONObject3.getBoolean("isRead");
            LeanplumInboxMessage a2 = LeanplumInboxMessage.m25014a(str, valueOf2, l, z, a);
            if (a2 != null) {
                valueOf = Boolean.valueOf(valueOf.booleanValue() | a2.m25020a());
                if (!z) {
                    i++;
                }
                jSONObject2.put(str, a2);
            }
        }
        if (valueOf.booleanValue()) {
            Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback(this) {
                /* renamed from: c */
                private /* synthetic */ LeanplumInbox$2 f25499c;

                public final void variablesChanged() {
                    this.f25499c.f25500a.a(jSONObject2, i, true);
                    this.f25499c.f25500a.a(true);
                }
            });
            return;
        }
        this.f25500a.a(jSONObject2, i, true);
        this.f25500a.a(true);
    }
}
