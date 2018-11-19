package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class NullabilityQualifierWithMigrationStatus {
    private final boolean isForWarningOnly;
    @NotNull
    private final NullabilityQualifier qualifier;

    @NotNull
    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.qualifier;
        }
        if ((i & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.isForWarningOnly;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z);
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus copy(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        C2668g.b(nullabilityQualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NullabilityQualifierWithMigrationStatus) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
            if (C2668g.a(this.qualifier, nullabilityQualifierWithMigrationStatus.qualifier)) {
                if ((this.isForWarningOnly == nullabilityQualifierWithMigrationStatus.isForWarningOnly ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.qualifier;
        int hashCode = (nullabilityQualifier != null ? nullabilityQualifier.hashCode() : 0) * 31;
        int i = this.isForWarningOnly;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NullabilityQualifierWithMigrationStatus(qualifier=");
        stringBuilder.append(this.qualifier);
        stringBuilder.append(", isForWarningOnly=");
        stringBuilder.append(this.isForWarningOnly);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public NullabilityQualifierWithMigrationStatus(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        C2668g.b(nullabilityQualifier, "qualifier");
        this.qualifier = nullabilityQualifier;
        this.isForWarningOnly = z;
    }

    @NotNull
    public final NullabilityQualifier getQualifier() {
        return this.qualifier;
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(nullabilityQualifier, z);
    }

    public final boolean isForWarningOnly() {
        return this.isForWarningOnly;
    }
}
