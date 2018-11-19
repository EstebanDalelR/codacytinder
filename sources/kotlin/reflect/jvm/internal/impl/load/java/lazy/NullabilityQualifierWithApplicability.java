package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;

public final class NullabilityQualifierWithApplicability {
    @NotNull
    private final NullabilityQualifierWithMigrationStatus nullabilityQualifier;
    @NotNull
    private final Collection<QualifierApplicabilityType> qualifierApplicabilityTypes;

    @NotNull
    public final NullabilityQualifierWithMigrationStatus component1() {
        return this.nullabilityQualifier;
    }

    @NotNull
    public final Collection<QualifierApplicabilityType> component2() {
        return this.qualifierApplicabilityTypes;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NullabilityQualifierWithApplicability) {
                NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability = (NullabilityQualifierWithApplicability) obj;
                if (C2668g.a(this.nullabilityQualifier, nullabilityQualifierWithApplicability.nullabilityQualifier) && C2668g.a(this.qualifierApplicabilityTypes, nullabilityQualifierWithApplicability.qualifierApplicabilityTypes)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = this.nullabilityQualifier;
        int i = 0;
        int hashCode = (nullabilityQualifierWithMigrationStatus != null ? nullabilityQualifierWithMigrationStatus.hashCode() : 0) * 31;
        Collection collection = this.qualifierApplicabilityTypes;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        stringBuilder.append(this.nullabilityQualifier);
        stringBuilder.append(", qualifierApplicabilityTypes=");
        stringBuilder.append(this.qualifierApplicabilityTypes);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public NullabilityQualifierWithApplicability(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends QualifierApplicabilityType> collection) {
        C2668g.b(nullabilityQualifierWithMigrationStatus, "nullabilityQualifier");
        C2668g.b(collection, "qualifierApplicabilityTypes");
        this.nullabilityQualifier = nullabilityQualifierWithMigrationStatus;
        this.qualifierApplicabilityTypes = collection;
    }
}
