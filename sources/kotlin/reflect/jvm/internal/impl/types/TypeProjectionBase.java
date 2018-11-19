package kotlin.reflect.jvm.internal.impl.types;

public abstract class TypeProjectionBase implements TypeProjection {
    public String toString() {
        if (isStarProjection()) {
            return "*";
        }
        if (getProjectionKind() == Variance.INVARIANT) {
            return getType().toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getProjectionKind());
        stringBuilder.append(" ");
        stringBuilder.append(getType());
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        return isStarProjection() == typeProjection.isStarProjection() && getProjectionKind() == typeProjection.getProjectionKind() && getType().equals(typeProjection.getType()) != null;
    }

    public int hashCode() {
        return (getProjectionKind().hashCode() * 31) + (isStarProjection() ? 17 : getType().hashCode());
    }
}
