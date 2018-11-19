package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.C15811g;
import kotlin.collections.C15807n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends Lambda implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ JavaTargetAnnotationDescriptor this$0;

    JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        this.this$0 = javaTargetAnnotationDescriptor;
        super(0);
    }

    @NotNull
    public final Map<Name, ConstantValue<?>> invoke() {
        JavaAnnotationArgument firstArgument = this.this$0.getFirstArgument();
        Map<Name, ConstantValue<?>> map = null;
        Object mapJavaTargetArguments$descriptors_jvm = firstArgument instanceof JavaArrayAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) this.this$0.getFirstArgument()).getElements()) : firstArgument instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(C15807n.m59826a(this.this$0.getFirstArgument())) : null;
        if (mapJavaTargetArguments$descriptors_jvm != null) {
            map = ag.m64174a(C15811g.m59834a(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), mapJavaTargetArguments$descriptors_jvm));
        }
        return map != null ? map : ah.m66884a();
    }
}
