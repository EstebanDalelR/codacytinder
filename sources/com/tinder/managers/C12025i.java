package com.tinder.managers;

import com.facebook.GraphRequest.GraphJSONObjectCallback;
import com.facebook.GraphResponse;
import com.tinder.managers.FacebookManager.ListenerFacebookEmailRequest;
import org.json.JSONObject;

/* renamed from: com.tinder.managers.i */
final /* synthetic */ class C12025i implements GraphJSONObjectCallback {
    /* renamed from: a */
    private final ListenerFacebookEmailRequest f39086a;

    C12025i(ListenerFacebookEmailRequest listenerFacebookEmailRequest) {
        this.f39086a = listenerFacebookEmailRequest;
    }

    public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
        FacebookManager.m40467a(this.f39086a, jSONObject, graphResponse);
    }
}
