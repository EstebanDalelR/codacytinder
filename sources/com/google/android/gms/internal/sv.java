package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class sv extends ss {
    private sv(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    public static sv m34046a(String str, Context context, boolean z) {
        ss.m31655a(context, z);
        return new sv(context, str, z);
    }

    /* renamed from: a */
    protected final List<Callable<Void>> mo7495a(ub ubVar, nx nxVar, na naVar) {
        if (ubVar.m20210c() != null) {
            if (this.q) {
                int n = ubVar.m20221n();
                List<Callable<Void>> arrayList = new ArrayList();
                arrayList.addAll(super.mo7495a(ubVar, nxVar, naVar));
                arrayList.add(new aad(ubVar, "VywbbfxE2QuRqZ5xcIwapO7AdSzfVaSWnmJxmUg+0adJ3QBAH5P7EgXr1uzyY+u6", "JgKAyQW0PWqOrZHk4ZNT0IJH02FdSWTXOOjBnF9RRok=", nxVar, n, 24));
                return arrayList;
            }
        }
        return super.mo7495a(ubVar, nxVar, naVar);
    }
}
