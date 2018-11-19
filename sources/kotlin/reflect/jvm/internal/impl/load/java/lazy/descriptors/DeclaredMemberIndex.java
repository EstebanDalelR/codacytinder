package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DeclaredMemberIndex {

    public static final class Empty implements DeclaredMemberIndex {
        public static final Empty INSTANCE = new Empty();

        @Nullable
        public JavaField findFieldByName(@NotNull Name name) {
            C2668g.b(name, "name");
            return null;
        }

        private Empty() {
        }

        @NotNull
        public List<JavaMethod> findMethodsByName(@NotNull Name name) {
            C2668g.b(name, "name");
            return C17554o.m64195a();
        }

        @NotNull
        public Set<Name> getMethodNames() {
            return am.m64176a();
        }

        @NotNull
        public Set<Name> getFieldNames() {
            return am.m64176a();
        }
    }

    @Nullable
    JavaField findFieldByName(@NotNull Name name);

    @NotNull
    Collection<JavaMethod> findMethodsByName(@NotNull Name name);

    @NotNull
    Set<Name> getFieldNames();

    @NotNull
    Set<Name> getMethodNames();
}
