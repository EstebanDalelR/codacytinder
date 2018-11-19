package com.tinder.statemachine;

import com.tinder.statemachine.C15065a.C15063c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u0002H\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u00032\u0006\u0010\u0007\u001a\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "T", "", "R", "STATE", "EVENT", "it", "invoke", "(Ljava/lang/Object;)Z"}, k = 3, mv = {1, 1, 9})
final class StateMachine$Matcher$predicates$1 extends Lambda implements Function1<T, Boolean> {
    /* renamed from: a */
    final /* synthetic */ C15063c f58585a;

    StateMachine$Matcher$predicates$1(C15063c c15063c) {
        this.f58585a = c15063c;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m67422a(obj));
    }

    /* renamed from: a */
    public final boolean m67422a(@NotNull T t) {
        C2668g.b(t, "it");
        return this.f58585a.f46894c.isInstance(t);
    }
}
