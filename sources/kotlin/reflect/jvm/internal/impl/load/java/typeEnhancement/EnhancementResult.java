package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.Nullable;

final class EnhancementResult<T> {
    @Nullable
    private final Annotations enhancementAnnotations;
    private final T result;

    public final T component1() {
        return this.result;
    }

    @Nullable
    public final Annotations component2() {
        return this.enhancementAnnotations;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnhancementResult) {
                EnhancementResult enhancementResult = (EnhancementResult) obj;
                if (C2668g.a(this.result, enhancementResult.result) && C2668g.a(this.enhancementAnnotations, enhancementResult.enhancementAnnotations)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.result;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Annotations annotations = this.enhancementAnnotations;
        if (annotations != null) {
            i = annotations.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EnhancementResult(result=");
        stringBuilder.append(this.result);
        stringBuilder.append(", enhancementAnnotations=");
        stringBuilder.append(this.enhancementAnnotations);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public EnhancementResult(T t, @Nullable Annotations annotations) {
        this.result = t;
        this.enhancementAnnotations = annotations;
    }
}
