package com.jakewharton.rxbinding2.internal;

import android.os.Looper;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import io.reactivex.Observer;
import io.reactivex.disposables.C15676b;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: com.jakewharton.rxbinding2.internal.a */
public final class C5720a {
    /* renamed from: a */
    public static void m25011a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: a */
    public static boolean m25012a(Observer<?> observer) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        observer.onSubscribe(C15676b.a());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected to be called on the main thread but was ");
        stringBuilder.append(Thread.currentThread().getName());
        observer.onError(new IllegalStateException(stringBuilder.toString()));
        return null;
    }
}
