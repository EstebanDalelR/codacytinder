package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TypeAndDefaultQualifiers {
    @Nullable
    private final JavaTypeQualifiers defaultQualifiers;
    @NotNull
    private final KotlinType type;

    @NotNull
    public final KotlinType component1() {
        return this.type;
    }

    @Nullable
    public final JavaTypeQualifiers component2() {
        return this.defaultQualifiers;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TypeAndDefaultQualifiers) {
                TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) obj;
                if (C2668g.a(this.type, typeAndDefaultQualifiers.type) && C2668g.a(this.defaultQualifiers, typeAndDefaultQualifiers.defaultQualifiers)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        KotlinType kotlinType = this.type;
        int i = 0;
        int hashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
        JavaTypeQualifiers javaTypeQualifiers = this.defaultQualifiers;
        if (javaTypeQualifiers != null) {
            i = javaTypeQualifiers.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TypeAndDefaultQualifiers(type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", defaultQualifiers=");
        stringBuilder.append(this.defaultQualifiers);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TypeAndDefaultQualifiers(@NotNull KotlinType kotlinType, @Nullable JavaTypeQualifiers javaTypeQualifiers) {
        C2668g.b(kotlinType, "type");
        this.type = kotlinType;
        this.defaultQualifiers = javaTypeQualifiers;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }
}
