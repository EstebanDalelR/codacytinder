package com.tinder.base.p172b;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "", "()V", "verifyMainThread", "", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.b.a */
public final class C8301a {
    /* renamed from: a */
    public final void m35392a() {
        if ((C2668g.a(Looper.myLooper(), Looper.getMainLooper()) ^ 1) != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected to be called on the main thread but was ");
            Thread currentThread = Thread.currentThread();
            C2668g.a(currentThread, "Thread.currentThread()");
            stringBuilder.append(currentThread.getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
