package com.tinder.chat.analytics;

import com.tinder.chat.analytics.am.C8422b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatTypingIndicatorVisibilityAnalyticsWorker$start$2 extends Lambda implements Function1<C8422b, C15813i> {
    /* renamed from: a */
    final /* synthetic */ am f43520a;

    ChatTypingIndicatorVisibilityAnalyticsWorker$start$2(am amVar) {
        this.f43520a = amVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53216a((C8422b) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53216a(C8422b c8422b) {
        am amVar = this.f43520a;
        C2668g.a(c8422b, "it");
        amVar.m42590b(c8422b);
        this.f43520a.f34235b = c8422b;
    }
}
