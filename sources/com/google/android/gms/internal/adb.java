package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class adb extends ada<FieldDescriptorType, Object> {
    adb(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo4207a() {
        if (!m18907b()) {
            Entry b;
            for (int i = 0; i < m18908c(); i++) {
                b = m18906b(i);
                if (((zzffs) b.getKey()).zzcxj()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry b2 : m18909d()) {
                if (((zzffs) b2.getKey()).zzcxj()) {
                    b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                }
            }
        }
        super.mo4207a();
    }
}
