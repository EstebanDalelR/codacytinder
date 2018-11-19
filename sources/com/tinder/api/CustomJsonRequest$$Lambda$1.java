package com.tinder.api;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.StatusCodeListener;

final /* synthetic */ class CustomJsonRequest$$Lambda$1 implements ErrorListener {
    private final StatusCodeListener arg$1;

    CustomJsonRequest$$Lambda$1(StatusCodeListener statusCodeListener) {
        this.arg$1 = statusCodeListener;
    }

    public void onErrorResponse(VolleyError volleyError) {
        CustomJsonRequest.lambda$new$1$CustomJsonRequest(this.arg$1, volleyError);
    }
}
