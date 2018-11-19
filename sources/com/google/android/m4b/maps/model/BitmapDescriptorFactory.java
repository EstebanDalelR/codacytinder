package com.google.android.m4b.maps.model;

import com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate;
import com.google.android.m4b.maps.p110j.C5462v;

public final class BitmapDescriptorFactory {
    /* renamed from: a */
    private static IBitmapDescriptorFactoryDelegate f20477a;

    private BitmapDescriptorFactory() {
    }

    /* renamed from: a */
    private static IBitmapDescriptorFactoryDelegate m23845a() {
        return (IBitmapDescriptorFactoryDelegate) C5462v.m23768a(f20477a, (Object) "IBitmapDescriptorFactory is not initialized");
    }

    /* renamed from: a */
    public static void m23846a(IBitmapDescriptorFactoryDelegate iBitmapDescriptorFactoryDelegate) {
        if (f20477a == null) {
            f20477a = (IBitmapDescriptorFactoryDelegate) C5462v.m23767a((Object) iBitmapDescriptorFactoryDelegate);
        }
    }

    /* renamed from: a */
    public static BitmapDescriptor m23844a(int i) {
        try {
            return new BitmapDescriptor(m23845a().fromResource(i));
        } catch (int i2) {
            throw new RuntimeRemoteException(i2);
        }
    }
}
