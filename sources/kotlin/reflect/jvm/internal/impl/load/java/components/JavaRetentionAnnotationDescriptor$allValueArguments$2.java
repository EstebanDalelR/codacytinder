package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.C15811g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

final class JavaRetentionAnnotationDescriptor$allValueArguments$2 extends Lambda implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ JavaRetentionAnnotationDescriptor this$0;

    JavaRetentionAnnotationDescriptor$allValueArguments$2(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        this.this$0 = javaRetentionAnnotationDescriptor;
        super(0);
    }

    @NotNull
    public final Map<Name, ConstantValue<?>> invoke() {
        ConstantValue mapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(this.this$0.getFirstArgument());
        Map<Name, ConstantValue<?>> a = mapJavaRetentionArgument$descriptors_jvm != null ? ag.m64174a(C15811g.m59834a(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), mapJavaRetentionArgument$descriptors_jvm)) : null;
        return a != null ? a : ah.m66884a();
    }
}
