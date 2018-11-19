package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

final class LazyJavaAnnotationDescriptor$type$2 extends Lambda implements Function0<SimpleType> {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    LazyJavaAnnotationDescriptor$type$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.this$0 = lazyJavaAnnotationDescriptor;
        super(0);
    }

    @NotNull
    public final SimpleType invoke() {
        FqName fqName = this.this$0.getFqName();
        if (fqName != null) {
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            C2668g.a(fqName, "fqName");
            ClassDescriptor mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(fqName, this.this$0.f54773c.getModule().getBuiltIns());
            if (mapJavaToKotlin == null) {
                JavaClass resolve = this.this$0.javaAnnotation.resolve();
                mapJavaToKotlin = resolve != null ? this.this$0.f54773c.getComponents().getModuleClassResolver().resolveClass(resolve) : null;
            }
            if (mapJavaToKotlin == null) {
                mapJavaToKotlin = this.this$0.createTypeForMissingDependencies(fqName);
            }
            return mapJavaToKotlin.getDefaultType();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No fqName: ");
        stringBuilder.append(this.this$0.javaAnnotation);
        return ErrorUtils.createErrorType(stringBuilder.toString());
    }
}
