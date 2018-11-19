package com.tinder.chat.analytics;

import com.tinder.chat.analytics.am.C8422b;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u00052\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;", "p1", "Lkotlin/ParameterName;", "name", "previousIndicatorUpdate", "p2", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "currentIndicator", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.ChatTypingIndicatorVisibilityAnalyticsWorker$observeTypingIndicatorUpdates$2 */
final class C14235xdc57894a extends FunctionReference implements Function2<C8422b, TypingIndicator, C8422b> {
    C14235xdc57894a(am amVar) {
        super(2, amVar);
    }

    public final String getName() {
        return "accumulateResult";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(am.class);
    }

    public final String getSignature() {
        return "accumulateResult(Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;)Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54043a((C8422b) obj, (TypingIndicator) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final C8422b m54043a(@NotNull C8422b c8422b, @NotNull TypingIndicator typingIndicator) {
        C2668g.b(c8422b, "p1");
        C2668g.b(typingIndicator, "p2");
        return ((am) this.receiver).m42579a(c8422b, typingIndicator);
    }
}
