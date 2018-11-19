package com.tinder.recs.rule;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class AdSwipeTerminationRule$trackDfpClick$3<T> implements Consumer<Throwable> {
    public static final AdSwipeTerminationRule$trackDfpClick$3 INSTANCE = new AdSwipeTerminationRule$trackDfpClick$3();

    AdSwipeTerminationRule$trackDfpClick$3() {
    }

    public final void accept(Throwable th) {
        C0001a.c(th, "Error logging DFP performClick()", new Object[0]);
    }
}
