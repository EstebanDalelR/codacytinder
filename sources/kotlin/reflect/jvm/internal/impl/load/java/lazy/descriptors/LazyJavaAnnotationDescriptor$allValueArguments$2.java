package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends Lambda implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.this$0 = lazyJavaAnnotationDescriptor;
        super(0);
    }

    @NotNull
    public final Map<Name, ConstantValue<?>> invoke() {
        Collection arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : this.this$0.javaAnnotation.getArguments()) {
            Object name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            ConstantValue access$resolveAnnotationArgument = this.this$0.resolveAnnotationArgument(javaAnnotationArgument);
            Object a = access$resolveAnnotationArgument != null ? C15811g.m59834a(name, access$resolveAnnotationArgument) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return ah.m66885a((Iterable) (List) arrayList);
    }
}
