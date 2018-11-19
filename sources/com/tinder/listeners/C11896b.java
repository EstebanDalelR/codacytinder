package com.tinder.listeners;

import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;

/* renamed from: com.tinder.listeners.b */
public abstract class C11896b<T> implements ErrorListener, Listener<T>, Callback<T> {
    public void onErrorResponse(VolleyError volleyError) {
        onError(volleyError);
    }

    public void onResponse(T t) {
        onResult(t);
    }
}
