package com.tinder.api;

import com.android.volley.Request.Priority;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.C4079e;
import org.json.JSONObject;

public class PriorityJsonObjectRequest extends C4079e {
    private Priority mPriority;

    public PriorityJsonObjectRequest(String str, JSONObject jSONObject, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(str, jSONObject, listener, errorListener);
    }

    public Priority getPriority() {
        if (this.mPriority == null) {
            return super.getPriority();
        }
        return this.mPriority;
    }

    public void setPriority(Priority priority) {
        this.mPriority = priority;
    }
}
