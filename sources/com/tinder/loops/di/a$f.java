package com.tinder.loops.di;

import android.content.Context;
import com.tinder.loops.di.LoopsApplicationComponent.Parent;
import dagger.internal.C15521i;
import javax.inject.Provider;

class a$f implements Provider<Context> {
    /* renamed from: a */
    private final Parent f38837a;

    public /* synthetic */ Object get() {
        return m47939a();
    }

    a$f(Parent parent) {
        this.f38837a = parent;
    }

    /* renamed from: a */
    public Context m47939a() {
        return (Context) C15521i.a(this.f38837a.provideApplicationContext(), "Cannot return null from a non-@Nullable component method");
    }
}
