package com.tinder.common.statemachine;

import com.tinder.common.statemachine.C8561a.C8557c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u0002H\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u00032\u0006\u0010\b\u001a\u0002H\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "T", "", "R", "STATE", "EVENT", "SIDE_EFFECT", "it", "invoke", "(Ljava/lang/Object;)Z"}, k = 3, mv = {1, 1, 10})
final class StateMachine$Matcher$predicates$1 extends Lambda implements Function1<T, Boolean> {
    /* renamed from: a */
    final /* synthetic */ C8557c f43763a;

    StateMachine$Matcher$predicates$1(C8557c c8557c) {
        this.f43763a = c8557c;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53344a(obj));
    }

    /* renamed from: a */
    public final boolean m53344a(@NotNull T t) {
        C2668g.b(t, "it");
        return this.f43763a.f30301c.isInstance(t);
    }
}
