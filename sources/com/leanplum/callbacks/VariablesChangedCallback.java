package com.leanplum.callbacks;

public abstract class VariablesChangedCallback implements Runnable {
    public abstract void variablesChanged();

    public void run() {
        variablesChanged();
    }
}
