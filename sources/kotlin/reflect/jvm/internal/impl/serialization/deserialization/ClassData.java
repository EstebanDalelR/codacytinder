package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;

public final class ClassData {
    @NotNull
    private final Class classProto;
    @NotNull
    private final NameResolver nameResolver;
    @NotNull
    private final SourceElement sourceElement;

    @NotNull
    public final NameResolver component1() {
        return this.nameResolver;
    }

    @NotNull
    public final Class component2() {
        return this.classProto;
    }

    @NotNull
    public final SourceElement component3() {
        return this.sourceElement;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClassData) {
                ClassData classData = (ClassData) obj;
                if (C2668g.a(this.nameResolver, classData.nameResolver) && C2668g.a(this.classProto, classData.classProto) && C2668g.a(this.sourceElement, classData.sourceElement)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        NameResolver nameResolver = this.nameResolver;
        int i = 0;
        int hashCode = (nameResolver != null ? nameResolver.hashCode() : 0) * 31;
        Class classR = this.classProto;
        hashCode = (hashCode + (classR != null ? classR.hashCode() : 0)) * 31;
        SourceElement sourceElement = this.sourceElement;
        if (sourceElement != null) {
            i = sourceElement.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClassData(nameResolver=");
        stringBuilder.append(this.nameResolver);
        stringBuilder.append(", classProto=");
        stringBuilder.append(this.classProto);
        stringBuilder.append(", sourceElement=");
        stringBuilder.append(this.sourceElement);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ClassData(@NotNull NameResolver nameResolver, @NotNull Class classR, @NotNull SourceElement sourceElement) {
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(classR, "classProto");
        C2668g.b(sourceElement, "sourceElement");
        this.nameResolver = nameResolver;
        this.classProto = classR;
        this.sourceElement = sourceElement;
    }
}
