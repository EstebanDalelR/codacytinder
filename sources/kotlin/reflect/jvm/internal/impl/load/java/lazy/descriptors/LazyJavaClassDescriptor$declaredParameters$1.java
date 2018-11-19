package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import org.jetbrains.annotations.NotNull;

final class LazyJavaClassDescriptor$declaredParameters$1 extends Lambda implements Function0<List<? extends TypeParameterDescriptor>> {
    final /* synthetic */ LazyJavaClassDescriptor this$0;

    LazyJavaClassDescriptor$declaredParameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.this$0 = lazyJavaClassDescriptor;
        super(0);
    }

    @NotNull
    public final List<TypeParameterDescriptor> invoke() {
        Iterable<JavaTypeParameter> typeParameters = this.this$0.jClass.getTypeParameters();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor resolveTypeParameter = this.this$0.f60039c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
            if (resolveTypeParameter != null) {
                arrayList.add(resolveTypeParameter);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Parameter ");
                stringBuilder.append(javaTypeParameter);
                stringBuilder.append(" surely belongs to class ");
                stringBuilder.append(this.this$0.jClass);
                stringBuilder.append(", so it must be resolved");
                throw new AssertionError(stringBuilder.toString());
            }
        }
        return (List) arrayList;
    }
}
