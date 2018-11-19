package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum AnnotationUseSiteTarget {
    ;
    
    public static final Companion Companion = null;
    @NotNull
    private final String renderName;

    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final AnnotationUseSiteTarget getAssociatedUseSiteTarget(@NotNull DeclarationDescriptor declarationDescriptor) {
            C2668g.b(declarationDescriptor, "descriptor");
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return AnnotationUseSiteTarget.PROPERTY;
            }
            if (declarationDescriptor instanceof ValueParameterDescriptor) {
                return AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
            }
            if (declarationDescriptor instanceof PropertyGetterDescriptor) {
                return AnnotationUseSiteTarget.PROPERTY_GETTER;
            }
            return (declarationDescriptor instanceof PropertySetterDescriptor) != null ? AnnotationUseSiteTarget.PROPERTY_SETTER : null;
        }
    }

    protected AnnotationUseSiteTarget(String str) {
        if (str == null) {
            r1 = name();
            if (r1 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = r1.toLowerCase();
            C2668g.a(str, "(this as java.lang.String).toLowerCase()");
        }
        this.renderName = str;
    }

    static {
        Companion = new Companion();
    }

    @NotNull
    public final String getRenderName() {
        return this.renderName;
    }
}
