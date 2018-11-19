package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

final class JavaTypeResolverKt$getErasedUpperBound$1 extends Lambda implements Function0<SimpleType> {
    final /* synthetic */ TypeParameterDescriptor receiver$0;

    JavaTypeResolverKt$getErasedUpperBound$1(TypeParameterDescriptor typeParameterDescriptor) {
        this.receiver$0 = typeParameterDescriptor;
        super(0);
    }

    @NotNull
    public final SimpleType invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't compute erased upper bound of type parameter `");
        stringBuilder.append(this.receiver$0);
        stringBuilder.append('`');
        SimpleType createErrorType = ErrorUtils.createErrorType(stringBuilder.toString());
        C2668g.a(createErrorType, "ErrorUtils.createErrorTy… type parameter `$this`\")");
        return createErrorType;
    }
}
