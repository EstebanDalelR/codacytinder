package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.ArrayList;

public final class aw {
    /* renamed from: a */
    private final ArrayList<as> f17690a = new ArrayList();

    /* renamed from: a */
    public static aw m21578a(DataInput dataInput, int i) {
        aw awVar = new aw();
        int a = bl.m21698a(dataInput);
        for (int i2 = 0; i2 < a; i2++) {
            awVar.f17690a.add(as.m21554a(i2, dataInput, i));
        }
        return awVar;
    }

    /* renamed from: a */
    public final as m21579a(int i) {
        if (i < this.f17690a.size()) {
            if (i >= 0) {
                return (as) this.f17690a.get(i);
            }
        }
        return as.m21553a();
    }
}
