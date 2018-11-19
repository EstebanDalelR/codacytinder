package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import org.jetbrains.annotations.Nullable;

final class JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 extends Lambda implements Function1<JavaType, Boolean> {
    public static final JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 INSTANCE = new JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1();

    JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((JavaType) obj));
    }

    public final boolean invoke(@Nullable JavaType javaType) {
        if (!(javaType instanceof JavaWildcardType)) {
            javaType = null;
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        return (javaWildcardType == null || javaWildcardType.getBound() == null || javaWildcardType.isExtends() != null) ? false : true;
    }
}
