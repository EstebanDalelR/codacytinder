package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.util.d */
public final class C15737d {
    /* renamed from: a */
    public static boolean m58975a(Disposable disposable, Disposable disposable2, Class<?> cls) {
        C15684a.m58895a((Object) disposable2, "next is null");
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        if (disposable != DisposableHelper.DISPOSED) {
            C15737d.m58974a((Class) cls);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m58976a(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        C15684a.m58895a((Object) disposable, "next is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != DisposableHelper.DISPOSED) {
            C15737d.m58974a((Class) cls);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m58977a(AtomicReference<Subscription> atomicReference, Subscription subscription, Class<?> cls) {
        C15684a.m58895a((Object) subscription, "next is null");
        if (atomicReference.compareAndSet(null, subscription)) {
            return true;
        }
        subscription.cancel();
        if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
            C15737d.m58974a((Class) cls);
        }
        return null;
    }

    /* renamed from: a */
    public static String m58973a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("It is not allowed to subscribe with a(n) ");
        stringBuilder.append(str);
        stringBuilder.append(" multiple times. Please create a fresh instance of ");
        stringBuilder.append(str);
        stringBuilder.append(" and subscribe that to the target source instead.");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static void m58974a(Class<?> cls) {
        C2667a.a(new ProtocolViolationException(C15737d.m58973a(cls.getName())));
    }
}
