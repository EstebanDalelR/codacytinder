package com.google.android.gms.internal;

import android.os.Handler;
import java.util.LinkedList;
import java.util.List;

@zzzv
final class apl {
    /* renamed from: a */
    private final List<aqk> f15575a = new LinkedList();

    apl() {
    }

    /* renamed from: a */
    final void m19406a(aql aql) {
        Handler handler = fk.f16060a;
        for (aqk aqj : this.f15575a) {
            handler.post(new aqj(this, aqj, aql));
        }
        this.f15575a.clear();
    }
}
