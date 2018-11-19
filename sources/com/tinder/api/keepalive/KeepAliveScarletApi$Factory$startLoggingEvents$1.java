package com.tinder.api.keepalive;

import com.tinder.scarlet.C14788b;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/scarlet/Event;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class KeepAliveScarletApi$Factory$startLoggingEvents$1<T> implements Consumer<C14788b> {
    public static final KeepAliveScarletApi$Factory$startLoggingEvents$1 INSTANCE = new KeepAliveScarletApi$Factory$startLoggingEvents$1();

    KeepAliveScarletApi$Factory$startLoggingEvents$1() {
    }

    public final void accept(C14788b c14788b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scarlet ");
        stringBuilder.append(c14788b);
        C0001a.b(stringBuilder.toString(), new Object[0]);
    }
}
