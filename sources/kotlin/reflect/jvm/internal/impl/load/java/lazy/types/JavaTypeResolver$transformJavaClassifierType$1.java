package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

final class JavaTypeResolver$transformJavaClassifierType$1 extends Lambda implements Function0<SimpleType> {
    final /* synthetic */ JavaClassifierType $javaType;

    JavaTypeResolver$transformJavaClassifierType$1(JavaClassifierType javaClassifierType) {
        this.$javaType = javaClassifierType;
        super(0);
    }

    @NotNull
    public final SimpleType invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unresolved java class ");
        stringBuilder.append(this.$javaType.getPresentableText());
        return ErrorUtils.createErrorType(stringBuilder.toString());
    }
}
