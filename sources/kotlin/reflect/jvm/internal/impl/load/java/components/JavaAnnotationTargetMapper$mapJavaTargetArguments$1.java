package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements Function1<ModuleDescriptor, KotlinType> {
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 INSTANCE = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1();

    JavaAnnotationTargetMapper$mapJavaTargetArguments$1() {
        super(1);
    }

    @NotNull
    public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        moduleDescriptor = DescriptorResolverUtils.getAnnotationParameterByName(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), moduleDescriptor.getBuiltIns().getBuiltInClassByFqName(KotlinBuiltIns.FQ_NAMES.target));
        if (moduleDescriptor != null) {
            moduleDescriptor = moduleDescriptor.getType();
            if (moduleDescriptor != null) {
                return moduleDescriptor;
            }
        }
        moduleDescriptor = ErrorUtils.createErrorType("Error: AnnotationTarget[]");
        C2668g.a(moduleDescriptor, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
        return (KotlinType) moduleDescriptor;
    }
}
