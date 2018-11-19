package com.google.android.m4b.maps.aa;

import java.util.Comparator;

interface bs<T> extends Iterable<T> {
    Comparator<? super T> comparator();
}
