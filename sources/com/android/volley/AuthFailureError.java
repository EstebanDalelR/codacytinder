package com.android.volley;

import android.content.Intent;

public class AuthFailureError extends VolleyError {
    /* renamed from: b */
    private Intent f9326b;

    public AuthFailureError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public String getMessage() {
        if (this.f9326b != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
