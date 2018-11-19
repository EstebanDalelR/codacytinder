package com.tinder.chat.analytics;

import com.tinder.chat.analytics.am.C8422b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;", "Lkotlin/ParameterName;", "name", "indicatorUpdate1", "p2", "indicatorUpdate2", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.ChatTypingIndicatorVisibilityAnalyticsWorker$observeTypingIndicatorUpdates$3 */
final class C14236xdc57894b extends FunctionReference implements Function2<C8422b, C8422b, Boolean> {
    C14236xdc57894b(am amVar) {
        super(2, amVar);
    }

    public final String getName() {
        return "indicatorAndTypeAreEqual";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(am.class);
    }

    public final String getSignature() {
        return "indicatorAndTypeAreEqual(Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;)Z";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(m54044a((C8422b) obj, (C8422b) obj2));
    }

    /* renamed from: a */
    public final boolean m54044a(@NotNull C8422b c8422b, @NotNull C8422b c8422b2) {
        C2668g.b(c8422b, "p1");
        C2668g.b(c8422b2, "p2");
        return ((am) this.receiver).m42586a(c8422b, c8422b2);
    }
}
