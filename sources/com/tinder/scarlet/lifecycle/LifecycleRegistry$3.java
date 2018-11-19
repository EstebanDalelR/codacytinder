package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle.C14785a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0015\u0010\u0004\u001a\u00110\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/scarlet/Lifecycle$State;", "p2", "Lkotlin/ParameterName;", "name", "other", "invoke"}, k = 3, mv = {1, 1, 9})
final class LifecycleRegistry$3 extends FunctionReference implements Function2<C14785a, C14785a, Boolean> {
    /* renamed from: a */
    public static final LifecycleRegistry$3 f59394a = new LifecycleRegistry$3();

    LifecycleRegistry$3() {
        super(2);
    }

    public final String getName() {
        return "isEquivalentTo";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59861a(C14819f.class, "scarlet");
    }

    public final String getSignature() {
        return "isEquivalentTo(Lcom/tinder/scarlet/Lifecycle$State;Lcom/tinder/scarlet/Lifecycle$State;)Z";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(m68109a((C14785a) obj, (C14785a) obj2));
    }

    /* renamed from: a */
    public final boolean m68109a(@NotNull C14785a c14785a, @NotNull C14785a c14785a2) {
        C2668g.b(c14785a, "p1");
        C2668g.b(c14785a2, "p2");
        return C14819f.m56164a(c14785a, c14785a2);
    }
}
