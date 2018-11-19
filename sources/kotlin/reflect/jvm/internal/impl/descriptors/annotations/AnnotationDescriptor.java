package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface AnnotationDescriptor {

    public static final class DefaultImpls {
        @Nullable
        public static FqName getFqName(AnnotationDescriptor annotationDescriptor) {
            annotationDescriptor = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
            if (annotationDescriptor == null) {
                return null;
            }
            if (ErrorUtils.isError((DeclarationDescriptor) annotationDescriptor)) {
                annotationDescriptor = null;
            }
            if (annotationDescriptor == null) {
                return null;
            }
            annotationDescriptor = DescriptorUtilsKt.getFqNameUnsafe((DeclarationDescriptor) annotationDescriptor);
            if (annotationDescriptor == null) {
                return null;
            }
            if (!annotationDescriptor.isSafe()) {
                annotationDescriptor = null;
            }
            return annotationDescriptor != null ? annotationDescriptor.toSafe() : null;
        }
    }

    @NotNull
    Map<Name, ConstantValue<?>> getAllValueArguments();

    @Nullable
    FqName getFqName();

    @NotNull
    SourceElement getSource();

    @NotNull
    KotlinType getType();
}
