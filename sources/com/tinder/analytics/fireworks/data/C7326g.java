package com.tinder.analytics.fireworks.data;

import android.database.Cursor;
import rx.functions.Cancellable;

/* renamed from: com.tinder.analytics.fireworks.data.g */
final /* synthetic */ class C7326g implements Cancellable {
    /* renamed from: a */
    private final Cursor f26478a;

    C7326g(Cursor cursor) {
        this.f26478a = cursor;
    }

    public void cancel() {
        C7324b.m31268a(this.f26478a);
    }
}
