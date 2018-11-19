package com.android.volley;

public class RedirectError extends VolleyError {
    public RedirectError(NetworkResponse networkResponse) {
        super(networkResponse);
    }
}
