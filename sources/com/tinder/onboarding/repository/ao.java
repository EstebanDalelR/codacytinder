package com.tinder.onboarding.repository;

import android.graphics.Bitmap;
import java.io.File;
import rx.functions.Func1;

final /* synthetic */ class ao implements Func1 {
    /* renamed from: a */
    private final C12187s f43214a;
    /* renamed from: b */
    private final File f43215b;

    ao(C12187s c12187s, File file) {
        this.f43214a = c12187s;
        this.f43215b = file;
    }

    public Object call(Object obj) {
        return this.f43214a.m48341a(this.f43215b, (Bitmap) obj);
    }
}
