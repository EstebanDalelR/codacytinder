package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements Function1<MemberScope, Set<? extends Name>> {
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 INSTANCE = new LazyJavaStaticClassScope$computePropertyNames$1$1();

    LazyJavaStaticClassScope$computePropertyNames$1$1() {
        super(1);
    }

    @NotNull
    public final Set<Name> invoke(@NotNull MemberScope memberScope) {
        C2668g.b(memberScope, "it");
        return memberScope.getVariableNames();
    }
}
