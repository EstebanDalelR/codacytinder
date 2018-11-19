package com.tinder.chat.analytics;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatTypingIndicatorVisibilityAnalyticsWorker$start$4 extends Lambda implements Function1<Throwable, C15813i> {
    /* renamed from: a */
    final /* synthetic */ am f43522a;

    ChatTypingIndicatorVisibilityAnalyticsWorker$start$4(am amVar) {
        this.f43522a = amVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53218a((Throwable) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53218a(@NotNull Throwable th) {
        C2668g.b(th, "it");
        this.f43522a.f34242i.error(th, "Error logging analytics for Typing Indicator show and hide.");
    }
}
