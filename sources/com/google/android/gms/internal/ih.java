package com.google.android.gms.internal;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class ih implements Runnable {
    /* renamed from: a */
    private final iw f16179a;

    ih(iw iwVar) {
        this.f16179a = iwVar;
    }

    public final void run() {
        this.f16179a.m27363a(new TimeoutException());
    }
}
