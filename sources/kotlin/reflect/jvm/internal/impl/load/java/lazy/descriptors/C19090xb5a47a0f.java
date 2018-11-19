package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.collections.C15807n;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1 */
final class C19090xb5a47a0f extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ SimpleFunctionDescriptor $function$inlined;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    C19090xb5a47a0f(LazyJavaClassMemberScope lazyJavaClassMemberScope, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        this.this$0 = lazyJavaClassMemberScope;
        this.$function$inlined = simpleFunctionDescriptor;
        super(1);
    }

    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
        C2668g.b(name, "accessorName");
        if (C2668g.a(this.$function$inlined.getName(), name)) {
            return C15807n.m59826a(this.$function$inlined);
        }
        return C19299w.m68809b(this.this$0.searchMethodsByNameWithoutBuiltinMagic(name), (Iterable) this.this$0.searchMethodsInSupertypesWithoutBuiltinMagic(name));
    }
}
