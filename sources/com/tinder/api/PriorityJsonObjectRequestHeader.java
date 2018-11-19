package com.tinder.api;

import com.android.volley.Request.Priority;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import org.json.JSONObject;

public class PriorityJsonObjectRequestHeader extends JsonObjectRequestHeader {
    private Priority mPriority;

    public PriorityJsonObjectRequestHeader(Priority priority, int i, String str, JSONObject jSONObject, Listener<JSONObject> listener, ErrorListener errorListener, String str2) {
        super(i, str, jSONObject, listener, errorListener, str2);
        this.mPriority = priority;
    }

    public Priority getPriority() {
        if (this.mPriority == null) {
            return super.getPriority();
        }
        return this.mPriority;
    }
}
