package com.tinder.recs.analytics;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, k = 3, mv = {1, 1, 10})
final class AddRecsRewindEvent$execute$4<T> implements Consumer<Throwable> {
    public static final AddRecsRewindEvent$execute$4 INSTANCE = new AddRecsRewindEvent$execute$4();

    AddRecsRewindEvent$execute$4() {
    }

    public final void accept(@NotNull Throwable th) {
        C2668g.b(th, "throwable");
        C0001a.c(th, "AddRecsRewindEvent failed to execute.", new Object[0]);
    }
}
