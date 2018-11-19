package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1<N> implements Neighbors<N> {
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1 INSTANCE = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 */
    static final class C190921 extends Lambda implements Function1<KotlinType, ClassDescriptor> {
        public static final C190921 INSTANCE = new C190921();

        C190921() {
            super(1);
        }

        @Nullable
        public final ClassDescriptor invoke(KotlinType kotlinType) {
            kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
            if (!(kotlinType instanceof ClassDescriptor)) {
                kotlinType = null;
            }
            return (ClassDescriptor) kotlinType;
        }
    }

    LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1() {
    }

    @NotNull
    public final Iterable<ClassDescriptor> getNeighbors(ClassDescriptor classDescriptor) {
        C2668g.a(classDescriptor, "it");
        classDescriptor = classDescriptor.getTypeConstructor();
        C2668g.a(classDescriptor, "it.typeConstructor");
        classDescriptor = classDescriptor.getSupertypes();
        C2668g.a(classDescriptor, "it.typeConstructor.supertypes");
        return C19155k.m68039j(C19155k.m68034f(C19299w.m68846r((Iterable) classDescriptor), C190921.INSTANCE));
    }
}
