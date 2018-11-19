package com.tinder.statemachine;

import com.tinder.api.ManagerWebServices;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002 \u0001*\u0002H\u0003\"\b\b\u0001\u0010\u0003*\u00020\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0004\"\b\b\u0003\u0010\u0003*\u00020\u0004\"\b\b\u0004\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "S", "STATE", "", "EVENT", "state", "cause", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.statemachine.StateMachine$Builder$StateDefinitionBuilder$onEnter$$inlined$with$lambda$1 */
final class C18929xa28975d6 extends Lambda implements Function2<STATE, EVENT, C15813i> {
    /* renamed from: a */
    final /* synthetic */ Function2 f58584a;

    C18929xa28975d6(Function2 function2) {
        this.f58584a = function2;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        m67421a(obj, obj2);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67421a(@NotNull STATE state, @NotNull EVENT event) {
        C2668g.b(state, "state");
        C2668g.b(event, ManagerWebServices.PARAM_CAUSE);
        this.f58584a.invoke(state, event);
    }
}
