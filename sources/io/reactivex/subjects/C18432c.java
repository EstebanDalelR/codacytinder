package io.reactivex.subjects;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;

/* renamed from: io.reactivex.subjects.c */
public abstract class C18432c<T> extends C3959e<T> implements Observer<T> {
    @NonNull
    /* renamed from: d */
    public final C18432c<T> m66611d() {
        if (this instanceof C19041b) {
            return this;
        }
        return new C19041b(this);
    }
}
