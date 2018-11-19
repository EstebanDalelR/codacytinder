package com.tinder.api;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ManagerNetwork {
    private final RequestQueue mRequestQueue;

    @Inject
    public ManagerNetwork(RequestQueue requestQueue) {
        this.mRequestQueue = requestQueue;
    }

    public void addRequest(Request request) {
        this.mRequestQueue.a(request);
    }

    public void cancelRequestsWithTag(Object obj) {
        this.mRequestQueue.a(obj);
    }
}
