package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.foursquare.pilgrim.bg.C3547a;
import com.foursquare.pilgrim.bg.C3548b;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4504d;

final class bj {
    @WorkerThread
    @NonNull
    /* renamed from: a */
    static <T> bg<T, Throwable> m7138a(@NonNull C4500a<T> c4500a) {
        try {
            return new C3548b(C4504d.a(c4500a));
        } catch (C4500a<T> c4500a2) {
            return new C3547a(c4500a2);
        }
    }
}
