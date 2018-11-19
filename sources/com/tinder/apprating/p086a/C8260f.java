package com.tinder.apprating.p086a;

import android.text.TextUtils;
import com.android.volley.C3001b;
import com.tinder.api.JsonObjectRequestHeader;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.interactors.C2647c;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.C15367r;
import com.tinder.utils.ad;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.tinder.apprating.a.f */
public class C8260f {
    /* renamed from: a */
    private final ManagerWebServices f29490a;
    /* renamed from: b */
    private final ManagerNetwork f29491b;
    /* renamed from: c */
    private final C2647c f29492c;

    public C8260f(ManagerWebServices managerWebServices, ManagerNetwork managerNetwork, C2647c c2647c) {
        this.f29490a = managerWebServices;
        this.f29491b = managerNetwork;
        this.f29492c = c2647c;
    }

    /* renamed from: a */
    public void m35263a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str.trim())) {
                str = str.trim();
                String c = C15367r.c();
                String a = this.f29492c.a();
                String b = C15367r.b();
                String d = C15367r.d();
                String c2 = ManagerApp.c();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ManagerWebServices.PARAM_BADGE_DESC, str);
                    jSONObject.put("model", c);
                    jSONObject.put("dataProvider", a);
                    jSONObject.put("manufacturer", b);
                    jSONObject.put("osVersion", d);
                    jSONObject.put("tiVersion", c2);
                    if (i > 0) {
                        jSONObject.put("stars", i);
                    }
                    ad.a("Sending feedback request");
                    i = this.f29490a;
                    String jsonObjectRequestHeader = new JsonObjectRequestHeader(1, ManagerWebServices.URL_FEEDBACK, jSONObject, C10312g.f33701a, null, C2652a.a());
                    jsonObjectRequestHeader.setRetryPolicy(new C3001b(10000, 3, 3.0f));
                    this.f29491b.addRequest(jsonObjectRequestHeader);
                    return;
                } catch (String str2) {
                    ad.c(str2.toString());
                    return;
                }
            }
        }
        ad.c("Feedback body is empty after trim. NO OP");
    }

    /* renamed from: a */
    static final /* synthetic */ void m35262a(JSONObject jSONObject) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Feedback success ");
        stringBuilder.append(jSONObject.toString());
        ad.a(stringBuilder.toString());
    }
}
