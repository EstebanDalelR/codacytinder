package com.tinder.common.statemachine;

import com.tinder.common.statemachine.C8561a.C8559d.C8558a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0004*\u0002H\u0005\"\b\b\u0001\u0010\u0006*\u0002H\u0002\"\b\b\u0002\u0010\u0002*\u00020\u0007\"\b\b\u0003\u0010\u0005*\u00020\u0007\"\b\b\u0004\u0010\u0003*\u00020\u0007\"\b\b\u0005\u0010\u0002*\u00020\u0007\"\b\b\u0006\u0010\u0005*\u00020\u0007\"\b\b\u0007\u0010\u0003*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u00022\u0006\u0010\t\u001a\u0002H\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;", "STATE", "SIDE_EFFECT", "E", "EVENT", "S", "", "state", "event", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;"}, k = 3, mv = {1, 1, 10})
final class StateMachine$Builder$StateDefinitionBuilder$on$1 extends Lambda implements Function2<STATE, EVENT, C8558a<? extends STATE, ? extends SIDE_EFFECT>> {
    /* renamed from: a */
    final /* synthetic */ Function2 f43762a;

    StateMachine$Builder$StateDefinitionBuilder$on$1(Function2 function2) {
        this.f43762a = function2;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m53343a(obj, obj2);
    }

    @NotNull
    /* renamed from: a */
    public final C8558a<STATE, SIDE_EFFECT> m53343a(@NotNull STATE state, @NotNull EVENT event) {
        C2668g.b(state, "state");
        C2668g.b(event, "event");
        return (C8558a) this.f43762a.invoke(state, event);
    }
}
