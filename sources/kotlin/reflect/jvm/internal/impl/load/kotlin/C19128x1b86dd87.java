package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings$getAdditionalFunctions$fakeJavaClassDescriptor$1 */
final class C19128x1b86dd87 extends Lambda implements Function0<LazyJavaClassDescriptor> {
    final /* synthetic */ LazyJavaClassDescriptor $javaAnalogueDescriptor;
    final /* synthetic */ ClassDescriptor $kotlinMutableClassIfContainer;

    C19128x1b86dd87(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        this.$javaAnalogueDescriptor = lazyJavaClassDescriptor;
        this.$kotlinMutableClassIfContainer = classDescriptor;
        super(0);
    }

    @NotNull
    public final LazyJavaClassDescriptor invoke() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.$javaAnalogueDescriptor;
        JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
        C2668g.a(javaResolverCache, "JavaResolverCache.EMPTY");
        return lazyJavaClassDescriptor.copy$descriptors_jvm(javaResolverCache, this.$kotlinMutableClassIfContainer);
    }
}
