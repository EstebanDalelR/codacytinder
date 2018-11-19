package com.tinder.toppicks.tooltip;

import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "p1", "Lcom/tinder/toppicks/tooltip/TopPicksNewUserTooltipTrigger$TriggerCondition;", "Lkotlin/ParameterName;", "name", "condition", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$checkForNewAccountStatusThenObserveSwipeThreshold$2 */
final class C19171x919f119d extends FunctionReference implements Function1<TriggerCondition, C3959e<Boolean>> {
    C19171x919f119d(TopPicksNewUserTooltipTrigger topPicksNewUserTooltipTrigger) {
        super(1, topPicksNewUserTooltipTrigger);
    }

    public final String getName() {
        return "handleTooltipTriggerCondition";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(TopPicksNewUserTooltipTrigger.class);
    }

    public final String getSignature() {
        return "handleTooltipTriggerCondition(Lcom/tinder/toppicks/tooltip/TopPicksNewUserTooltipTrigger$TriggerCondition;)Lio/reactivex/Observable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68156a((TriggerCondition) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Boolean> m68156a(@NotNull TriggerCondition triggerCondition) {
        C2668g.b(triggerCondition, "p1");
        return ((TopPicksNewUserTooltipTrigger) this.receiver).m66108a(triggerCondition);
    }
}
