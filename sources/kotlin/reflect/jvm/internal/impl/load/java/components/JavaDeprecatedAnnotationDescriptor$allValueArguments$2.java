package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.C15811g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import org.jetbrains.annotations.NotNull;

final class JavaDeprecatedAnnotationDescriptor$allValueArguments$2 extends Lambda implements Function0<Map<Name, ? extends StringValue>> {
    public static final JavaDeprecatedAnnotationDescriptor$allValueArguments$2 INSTANCE = new JavaDeprecatedAnnotationDescriptor$allValueArguments$2();

    JavaDeprecatedAnnotationDescriptor$allValueArguments$2() {
        super(0);
    }

    @NotNull
    public final Map<Name, StringValue> invoke() {
        return ag.m64174a(C15811g.m59834a(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
    }
}
