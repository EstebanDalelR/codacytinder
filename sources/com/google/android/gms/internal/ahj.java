package com.google.android.gms.internal;

import java.util.Comparator;

public final class ahj implements Comparator<agx> {
    public ahj(ahi ahi) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        agx agx = (agx) obj;
        agx agx2 = (agx) obj2;
        if (agx.m19156b() < agx2.m19156b()) {
            return -1;
        }
        if (agx.m19156b() > agx2.m19156b()) {
            return 1;
        }
        if (agx.m19155a() < agx2.m19155a()) {
            return -1;
        }
        if (agx.m19155a() > agx2.m19155a()) {
            return 1;
        }
        float d = (agx.m19158d() - agx.m19156b()) * (agx.m19157c() - agx.m19155a());
        float d2 = (agx2.m19158d() - agx2.m19156b()) * (agx2.m19157c() - agx2.m19155a());
        return d > d2 ? -1 : d < d2 ? 1 : 0;
    }
}
