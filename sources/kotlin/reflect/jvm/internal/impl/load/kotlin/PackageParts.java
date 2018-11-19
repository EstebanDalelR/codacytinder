package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PackageParts {
    @NotNull
    private final Set<String> metadataParts = ((Set) new LinkedHashSet());
    @NotNull
    private final String packageFqName;
    private final LinkedHashMap<String, String> packageParts = new LinkedHashMap();

    public PackageParts(@NotNull String str) {
        C2668g.b(str, "packageFqName");
        this.packageFqName = str;
    }

    @NotNull
    public final Set<String> getParts() {
        Set<String> keySet = this.packageParts.keySet();
        C2668g.a(keySet, "packageParts.keys");
        return keySet;
    }

    public final void addPart(@NotNull String str, @Nullable String str2) {
        C2668g.b(str, "partInternalName");
        this.packageParts.put(str, str2);
    }

    public final void addMetadataPart(@NotNull String str) {
        C2668g.b(str, "shortName");
        Set set = this.metadataParts;
        if (set == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        }
        C15829m.m59882e(set).add(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof PackageParts) {
            PackageParts packageParts = (PackageParts) obj;
            if (C2668g.a(packageParts.packageFqName, this.packageFqName) && C2668g.a(packageParts.packageParts, this.packageParts) && C2668g.a(packageParts.metadataParts, this.metadataParts) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        return (((this.packageFqName.hashCode() * 31) + this.packageParts.hashCode()) * 31) + this.metadataParts.hashCode();
    }

    @NotNull
    public String toString() {
        return an.m66899a(getParts(), (Iterable) this.metadataParts).toString();
    }
}
