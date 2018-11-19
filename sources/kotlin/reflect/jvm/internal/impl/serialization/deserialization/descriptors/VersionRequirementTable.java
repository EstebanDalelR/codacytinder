package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement;
import org.jetbrains.annotations.NotNull;

public final class VersionRequirementTable {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final VersionRequirementTable EMPTY = new VersionRequirementTable(C17554o.m64195a());
    private final List<VersionRequirement> infos;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final VersionRequirementTable getEMPTY() {
            return VersionRequirementTable.EMPTY;
        }

        @NotNull
        public final VersionRequirementTable create(@NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
            C2668g.b(versionRequirementTable, "table");
            if (versionRequirementTable.getRequirementCount() == 0) {
                return getEMPTY();
            }
            versionRequirementTable = versionRequirementTable.getRequirementList();
            C2668g.a(versionRequirementTable, "table.requirementList");
            return new VersionRequirementTable(versionRequirementTable);
        }
    }

    private VersionRequirementTable(List<VersionRequirement> list) {
        this.infos = list;
    }
}
