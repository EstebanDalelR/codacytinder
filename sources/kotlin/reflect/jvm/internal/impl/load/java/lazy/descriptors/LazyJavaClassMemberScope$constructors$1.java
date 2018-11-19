package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import org.jetbrains.annotations.NotNull;

final class LazyJavaClassMemberScope$constructors$1 extends Lambda implements Function0<List<? extends ClassConstructorDescriptor>> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.this$0 = lazyJavaClassMemberScope;
        this.$c = lazyJavaResolverContext;
        super(0);
    }

    @NotNull
    public final List<ClassConstructorDescriptor> invoke() {
        Collection<JavaConstructor> constructors = this.this$0.jClass.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (JavaConstructor access$resolveConstructor : constructors) {
            arrayList.add(this.this$0.resolveConstructor(access$resolveConstructor));
        }
        SignatureEnhancement signatureEnhancement = this.$c.getComponents().getSignatureEnhancement();
        LazyJavaResolverContext lazyJavaResolverContext = this.$c;
        Collection collection = arrayList;
        if (collection.isEmpty()) {
            collection = C17554o.m64197b((Object) this.this$0.createDefaultConstructor());
        }
        return C19299w.m68840l(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, collection));
    }
}
