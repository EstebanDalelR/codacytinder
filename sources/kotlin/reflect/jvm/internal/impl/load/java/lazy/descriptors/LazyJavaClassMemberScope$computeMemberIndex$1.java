package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import org.jetbrains.annotations.NotNull;

final class LazyJavaClassMemberScope$computeMemberIndex$1 extends Lambda implements Function1<JavaMember, Boolean> {
    public static final LazyJavaClassMemberScope$computeMemberIndex$1 INSTANCE = new LazyJavaClassMemberScope$computeMemberIndex$1();

    LazyJavaClassMemberScope$computeMemberIndex$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((JavaMember) obj));
    }

    public final boolean invoke(@NotNull JavaMember javaMember) {
        C2668g.b(javaMember, "it");
        return javaMember.isStatic() ^ 1;
    }
}
