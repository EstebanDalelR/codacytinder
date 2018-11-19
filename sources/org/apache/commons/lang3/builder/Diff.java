package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.tuple.Pair;

public abstract class Diff<T> extends Pair<T, T> {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private final String f55123a;

    /* renamed from: a */
    public final String m64477a() {
        return this.f55123a;
    }

    public final String toString() {
        return String.format("[%s: %s, %s]", new Object[]{this.f55123a, m60770b(), m60771c()});
    }

    public final T setValue(T t) {
        throw new UnsupportedOperationException("Cannot alter Diff object.");
    }
}
