package com.tinder.domain.recs.engine.dispatcher;

import kotlin.Metadata;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.dispatcher.NonBlockingSwipeDispatcher$subscribeToConnectivity$connectivitySubscription$2 */
final class C13910x5d5cab8f<T> implements Action1<Throwable> {
    public static final C13910x5d5cab8f INSTANCE = new C13910x5d5cab8f();

    C13910x5d5cab8f() {
    }

    public final void call(Throwable th) {
        C0001a.c(th, "Cannot observe connectivity status", new Object[0]);
    }
}
