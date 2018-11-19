package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.C2587d;
import com.leanplum.p069a.bo;

final class ActionContext$1 extends VariablesChangedCallback {
    /* renamed from: a */
    private /* synthetic */ ActionContext f25490a;
    /* renamed from: b */
    private /* synthetic */ ActionContext f25491b;

    ActionContext$1(ActionContext actionContext, ActionContext actionContext2) {
        this.f25490a = actionContext2;
    }

    public final void variablesChanged() {
        try {
            C2587d.a().b(this.f25490a.getMessageId());
        } catch (Throwable th) {
            bo.a(th);
        }
    }
}
