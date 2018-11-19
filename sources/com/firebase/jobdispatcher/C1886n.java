package com.firebase.jobdispatcher;

import android.support.annotation.NonNull;
import com.firebase.jobdispatcher.C1885m.C3493a;
import com.firebase.jobdispatcher.C1885m.C3494b;
import com.firebase.jobdispatcher.C1885m.C3495c;
import java.util.List;

/* renamed from: com.firebase.jobdispatcher.n */
public final class C1886n {
    /* renamed from: a */
    public static final C3495c f5129a = new C3495c();

    /* renamed from: a */
    public static C3494b m6643a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Window start can't be less than 0");
        } else if (i2 >= i) {
            return new C3494b(i, i2);
        } else {
            throw new IllegalArgumentException("Window end can't be less than window start");
        }
    }

    /* renamed from: a */
    public static C3493a m6642a(@NonNull List<ObservedUri> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                return new C3493a(list);
            }
        }
        throw new IllegalArgumentException("Uris must not be null or empty.");
    }
}
