package com.tinder.statemachine;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u0002H\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u00032\u0006\u0010\u0007\u001a\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "T", "", "R", "STATE", "EVENT", "it", "invoke", "(Ljava/lang/Object;)Z"}, k = 3, mv = {1, 1, 9})
final class StateMachine$Matcher$where$$inlined$apply$lambda$1 extends Lambda implements Function1<T, Boolean> {
    /* renamed from: a */
    final /* synthetic */ Function1 f58586a;

    StateMachine$Matcher$where$$inlined$apply$lambda$1(Function1 function1) {
        this.f58586a = function1;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m67423a(obj));
    }

    /* renamed from: a */
    public final boolean m67423a(@NotNull T t) {
        C2668g.b(t, "it");
        return ((Boolean) this.f58586a.invoke(t)).booleanValue();
    }
}
