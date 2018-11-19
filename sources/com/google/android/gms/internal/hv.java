package com.google.android.gms.internal;

import java.util.Comparator;

final class hv implements Comparator<byte[]> {
    hv() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
