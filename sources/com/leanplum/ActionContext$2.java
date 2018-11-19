package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.bq;

final class ActionContext$2 extends VariablesChangedCallback {
    /* renamed from: a */
    private /* synthetic */ String f25492a;
    /* renamed from: b */
    private /* synthetic */ String f25493b;
    /* renamed from: c */
    private /* synthetic */ ActionContext f25494c;

    ActionContext$2(ActionContext actionContext, String str, String str2) {
        this.f25494c = actionContext;
        this.f25492a = str;
        this.f25493b = str2;
    }

    public final void variablesChanged() {
        ActionContext.a(this.f25494c, this.f25492a, bq.p(), this.f25493b);
    }
}
