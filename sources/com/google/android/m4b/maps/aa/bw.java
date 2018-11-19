package com.google.android.m4b.maps.aa;

import java.util.Iterator;

public abstract class bw<E> implements Iterator<E> {
    protected bw() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
