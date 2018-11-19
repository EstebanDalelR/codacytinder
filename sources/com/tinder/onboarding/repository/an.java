package com.tinder.onboarding.repository;

import java.io.File;
import java.util.concurrent.Callable;

final /* synthetic */ class an implements Callable {
    /* renamed from: a */
    private final C12187s f32837a;
    /* renamed from: b */
    private final File f32838b;

    an(C12187s c12187s, File file) {
        this.f32837a = c12187s;
        this.f32838b = file;
    }

    public Object call() {
        return this.f32837a.m48338a(this.f32838b);
    }
}
