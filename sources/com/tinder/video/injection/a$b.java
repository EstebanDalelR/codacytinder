package com.tinder.video.injection;

import android.content.Context;
import com.tinder.video.injection.VideoComponent.Parent;
import dagger.internal.C15521i;
import javax.inject.Provider;

class a$b implements Provider<Context> {
    /* renamed from: a */
    private final Parent f52864a;

    public /* synthetic */ Object get() {
        return m63161a();
    }

    a$b(Parent parent) {
        this.f52864a = parent;
    }

    /* renamed from: a */
    public Context m63161a() {
        return (Context) C15521i.m58001a(this.f52864a.provideApplicationContext(), "Cannot return null from a non-@Nullable component method");
    }
}
