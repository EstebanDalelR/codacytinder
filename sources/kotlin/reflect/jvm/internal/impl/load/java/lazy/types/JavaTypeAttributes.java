package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeAttributes {
    @NotNull
    private final JavaTypeFlexibility flexibility;
    @NotNull
    private final TypeUsage howThisTypeIsUsed;
    private final boolean isForAnnotationParameter;
    @Nullable
    private final TypeParameterDescriptor upperBoundOfTypeParameter;

    @NotNull
    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.howThisTypeIsUsed;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.flexibility;
        }
        if ((i & 4) != 0) {
            z = javaTypeAttributes.isForAnnotationParameter;
        }
        if ((i & 8) != 0) {
            typeParameterDescriptor = javaTypeAttributes.upperBoundOfTypeParameter;
        }
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility, z, typeParameterDescriptor);
    }

    @NotNull
    public final JavaTypeAttributes copy(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(typeUsage, "howThisTypeIsUsed");
        C2668g.b(javaTypeFlexibility, "flexibility");
        return new JavaTypeAttributes(typeUsage, javaTypeFlexibility, z, typeParameterDescriptor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JavaTypeAttributes) {
            JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
            if (C2668g.a(this.howThisTypeIsUsed, javaTypeAttributes.howThisTypeIsUsed) && C2668g.a(this.flexibility, javaTypeAttributes.flexibility)) {
                return (this.isForAnnotationParameter == javaTypeAttributes.isForAnnotationParameter ? 1 : null) != null && C2668g.a(this.upperBoundOfTypeParameter, javaTypeAttributes.upperBoundOfTypeParameter);
            }
        }
    }

    public int hashCode() {
        TypeUsage typeUsage = this.howThisTypeIsUsed;
        int i = 0;
        int hashCode = (typeUsage != null ? typeUsage.hashCode() : 0) * 31;
        JavaTypeFlexibility javaTypeFlexibility = this.flexibility;
        hashCode = (hashCode + (javaTypeFlexibility != null ? javaTypeFlexibility.hashCode() : 0)) * 31;
        int i2 = this.isForAnnotationParameter;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        TypeParameterDescriptor typeParameterDescriptor = this.upperBoundOfTypeParameter;
        if (typeParameterDescriptor != null) {
            i = typeParameterDescriptor.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JavaTypeAttributes(howThisTypeIsUsed=");
        stringBuilder.append(this.howThisTypeIsUsed);
        stringBuilder.append(", flexibility=");
        stringBuilder.append(this.flexibility);
        stringBuilder.append(", isForAnnotationParameter=");
        stringBuilder.append(this.isForAnnotationParameter);
        stringBuilder.append(", upperBoundOfTypeParameter=");
        stringBuilder.append(this.upperBoundOfTypeParameter);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public JavaTypeAttributes(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(typeUsage, "howThisTypeIsUsed");
        C2668g.b(javaTypeFlexibility, "flexibility");
        this.howThisTypeIsUsed = typeUsage;
        this.flexibility = javaTypeFlexibility;
        this.isForAnnotationParameter = z;
        this.upperBoundOfTypeParameter = typeParameterDescriptor;
    }

    @NotNull
    public final TypeUsage getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i, C15823e c15823e) {
        if ((i & 2) != null) {
            javaTypeFlexibility = JavaTypeFlexibility.INFLEXIBLE;
        }
        if ((i & 4) != null) {
            z = false;
        }
        if ((i & 8) != 0) {
            typeParameterDescriptor = null;
        }
        this(typeUsage, javaTypeFlexibility, z, typeParameterDescriptor);
    }

    @NotNull
    public final JavaTypeFlexibility getFlexibility() {
        return this.flexibility;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    @Nullable
    public final TypeParameterDescriptor getUpperBoundOfTypeParameter() {
        return this.upperBoundOfTypeParameter;
    }

    @NotNull
    public final JavaTypeAttributes withFlexibility(@NotNull JavaTypeFlexibility javaTypeFlexibility) {
        C2668g.b(javaTypeFlexibility, "flexibility");
        return copy$default(this, null, javaTypeFlexibility, false, null, 13, null);
    }
}
