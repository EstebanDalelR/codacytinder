package com.tinder.statemachine;

import com.tinder.statemachine.C15065a.C15060a.C15059a.C15058a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u0002H\u0002\"\n\b\u0001\u0010\u0003 \u0001*\u0002H\u0004\"\n\b\u0002\u0010\u0005 \u0001*\u0002H\u0002\"\b\b\u0003\u0010\u0002*\u00020\u0006\"\b\b\u0004\u0010\u0004*\u00020\u0006\"\b\b\u0005\u0010\u0002*\u00020\u0006\"\b\b\u0006\u0010\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0006\u0010\b\u001a\u0002H\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "T", "STATE", "E", "EVENT", "S", "", "state", "event", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.statemachine.StateMachine$Builder$StateDefinitionBuilder$OnEvent$transitionTo$$inlined$with$lambda$1 */
final class C18928xc12cb50a extends Lambda implements Function2<STATE, EVENT, T> {
    /* renamed from: a */
    final /* synthetic */ C15058a f58582a;
    /* renamed from: b */
    final /* synthetic */ Function2 f58583b;

    C18928xc12cb50a(C15058a c15058a, Function2 function2) {
        this.f58582a = c15058a;
        this.f58583b = function2;
        super(2);
    }

    @NotNull
    public final T invoke(@NotNull STATE state, @NotNull EVENT event) {
        C2668g.b(state, "state");
        C2668g.b(event, "event");
        return this.f58583b.invoke(state, event);
    }
}
