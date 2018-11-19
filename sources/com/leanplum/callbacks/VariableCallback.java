package com.leanplum.callbacks;

import com.leanplum.Var;

public abstract class VariableCallback<T> implements Runnable {
    /* renamed from: a */
    private Var<T> f8127a;

    public abstract void handle(Var<T> var);

    public void setVariable(Var<T> var) {
        this.f8127a = var;
    }

    public void run() {
        handle(this.f8127a);
    }
}
