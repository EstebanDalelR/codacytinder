package com.leanplum.callbacks;

import com.leanplum.ActionContext;

public abstract class ActionCallback {
    public abstract boolean onResponse(ActionContext actionContext);
}
