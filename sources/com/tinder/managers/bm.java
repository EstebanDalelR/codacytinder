package com.tinder.managers;

import com.android.volley.C3001b;
import com.android.volley.VolleyError;
import com.tinder.api.JsonObjectRequestHeader;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.listeners.ListenerSimple;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
public class bm {
    /* renamed from: a */
    private final ManagerWebServices f32599a;
    /* renamed from: b */
    private final ManagerNetwork f32600b;

    @Inject
    public bm(ManagerWebServices managerWebServices, ManagerNetwork managerNetwork) {
        this.f32599a = managerWebServices;
        this.f32600b = managerNetwork;
    }

    /* renamed from: a */
    public void m40511a(String str, ListenerSimple listenerSimple) {
        List arrayList = new ArrayList(1);
        arrayList.add(str);
        m40510a(arrayList, listenerSimple);
    }

    /* renamed from: a */
    private void m40510a(List<String> list, ListenerSimple listenerSimple) {
        ad.a("Attempting tutorial server confirmation");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (String put : list) {
                jSONArray.put(put);
            }
            jSONObject.put(ManagerWebServices.PARAM_TUTORIALS, jSONArray);
        } catch (List<String> list2) {
            ad.a("Failed to create JSON for viewed tutorial", list2);
        }
        ManagerWebServices managerWebServices = this.f32599a;
        List<String> jsonObjectRequestHeader = new JsonObjectRequestHeader(1, ManagerWebServices.URL_USER_TUTORIAL, jSONObject, new bn(listenerSimple), new bo(listenerSimple), C2652a.a());
        jsonObjectRequestHeader.setRetryPolicy(new C3001b(5000, 0, 1.0f));
        this.f32600b.addRequest(jsonObjectRequestHeader);
    }

    /* renamed from: a */
    static final /* synthetic */ void m40509a(ListenerSimple listenerSimple, JSONObject jSONObject) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tutorial: ");
        stringBuilder.append(jSONObject);
        ad.a(stringBuilder.toString());
        listenerSimple.onSuccess();
    }

    /* renamed from: a */
    static final /* synthetic */ void m40508a(ListenerSimple listenerSimple, VolleyError volleyError) {
        listenerSimple.onFailure();
        listenerSimple = new StringBuilder();
        listenerSimple.append("tutorial: ");
        listenerSimple.append(volleyError.getMessage());
        ad.a(listenerSimple.toString());
    }
}
