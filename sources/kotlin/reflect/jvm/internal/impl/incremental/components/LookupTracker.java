package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public interface LookupTracker {

    public static final class DO_NOTHING implements LookupTracker {
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        public boolean getRequiresPosition() {
            return false;
        }

        public void record(@NotNull String str, @NotNull Position position, @NotNull String str2, @NotNull ScopeKind scopeKind, @NotNull String str3) {
            C2668g.b(str, "filePath");
            C2668g.b(position, "position");
            C2668g.b(str2, "scopeFqName");
            C2668g.b(scopeKind, "scopeKind");
            C2668g.b(str3, "name");
        }

        private DO_NOTHING() {
        }
    }

    boolean getRequiresPosition();

    void record(@NotNull String str, @NotNull Position position, @NotNull String str2, @NotNull ScopeKind scopeKind, @NotNull String str3);
}
