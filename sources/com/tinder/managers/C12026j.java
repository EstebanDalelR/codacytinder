package com.tinder.managers;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tinder.managers.FacebookManager.FacebookUserFetchListener;

/* renamed from: com.tinder.managers.j */
final /* synthetic */ class C12026j implements Callback {
    /* renamed from: a */
    private final FacebookUserFetchListener f39087a;

    C12026j(FacebookUserFetchListener facebookUserFetchListener) {
        this.f39087a = facebookUserFetchListener;
    }

    public void onCompleted(GraphResponse graphResponse) {
        FacebookManager.m40466a(this.f39087a, graphResponse);
    }
}
