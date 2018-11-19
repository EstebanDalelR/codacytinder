package com.tinder.interactors;

import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.ResponseCodeRequest.Factory;
import com.tinder.listeners.C11896b;
import com.tinder.managers.C2652a;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.FacebookManager.ListenerFacebookEmailRequest;
import com.tinder.model.auth.LogoutFrom$BUTTON;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.interactors.f */
public class C9715f {
    /* renamed from: a */
    private final FacebookManager f32306a;
    /* renamed from: b */
    private final C2652a f32307b;
    /* renamed from: c */
    private final ManagerNetwork f32308c;
    /* renamed from: d */
    private final Factory f32309d;

    @Inject
    public C9715f(FacebookManager facebookManager, C2652a c2652a, ManagerNetwork managerNetwork, Factory factory) {
        this.f32306a = facebookManager;
        this.f32307b = c2652a;
        this.f32308c = managerNetwork;
        this.f32309d = factory;
    }

    /* renamed from: a */
    public void m40209a(ListenerFacebookEmailRequest listenerFacebookEmailRequest) {
        this.f32306a.m40473a(listenerFacebookEmailRequest);
    }

    /* renamed from: a */
    public void m40208a() {
        this.f32307b.a(LogoutFrom$BUTTON.INSTANCE);
    }

    /* renamed from: a */
    public void m40210a(String str, C11896b<Boolean> c11896b) {
        try {
            this.f32308c.addRequest(this.f32309d.createRequest(1, String.format(ManagerWebServices.URL_IS_TWEEN, new Object[]{str}), m40207a(str), 204, c11896b, c11896b));
        } catch (String str2) {
            C0001a.e("Failed to create the json payload to upload tween email address", new Object[]{str2});
            c11896b.onError(str2);
        }
    }

    /* renamed from: a */
    protected String m40207a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", str);
        return jSONObject.toString();
    }
}
