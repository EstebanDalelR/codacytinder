package com.tinder.statemachine;

import com.tinder.statemachine.C15065a.C15060a.C15059a.C15058a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002 \u0001*\u0002H\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u0002H\u0005\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\u0003*\u00020\u0006\"\b\b\u0004\u0010\u0005*\u00020\u0006\"\b\b\u0005\u0010\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u0002H\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "E", "EVENT", "S", "STATE", "", "state", "event", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.statemachine.StateMachine$Builder$StateDefinitionBuilder$OnEvent$run$$inlined$with$lambda$1 */
final class C18927x53fe1aad extends Lambda implements Function2<STATE, EVENT, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C15058a f58580a;
    /* renamed from: b */
    final /* synthetic */ Function2 f58581b;

    C18927x53fe1aad(C15058a c15058a, Function2 function2) {
        this.f58580a = c15058a;
        this.f58581b = function2;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        m67420a(obj, obj2);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67420a(@NotNull STATE state, @NotNull EVENT event) {
        C2668g.b(state, "state");
        C2668g.b(event, "event");
        this.f58581b.invoke(state, event);
    }
}
