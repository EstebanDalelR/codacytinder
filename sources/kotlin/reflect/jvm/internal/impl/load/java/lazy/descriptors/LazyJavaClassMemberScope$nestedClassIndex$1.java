package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class LazyJavaClassMemberScope$nestedClassIndex$1 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$nestedClassIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.this$0 = lazyJavaClassMemberScope;
        super(0);
    }

    @NotNull
    public final Set<Name> invoke() {
        return C19299w.m68842n(this.this$0.jClass.getInnerClassNames());
    }
}
