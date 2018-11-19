package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractTypeConstructor implements TypeConstructor {
    private final NotNullLazyValue<Supertypes> supertypes;

    private static final class Supertypes {
        @NotNull
        private final Collection<KotlinType> allSupertypes;
        @NotNull
        private List<? extends KotlinType> supertypesWithoutCycles = C15807n.m59826a(ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES);

        public Supertypes(@NotNull Collection<? extends KotlinType> collection) {
            C2668g.b(collection, "allSupertypes");
            this.allSupertypes = collection;
        }

        @NotNull
        public final Collection<KotlinType> getAllSupertypes() {
            return this.allSupertypes;
        }

        @NotNull
        public final List<KotlinType> getSupertypesWithoutCycles() {
            return this.supertypesWithoutCycles;
        }

        public final void setSupertypesWithoutCycles(@NotNull List<? extends KotlinType> list) {
            C2668g.b(list, "<set-?>");
            this.supertypesWithoutCycles = list;
        }
    }

    @NotNull
    protected abstract Collection<KotlinType> computeSupertypes();

    @Nullable
    protected KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    protected abstract SupertypeLoopChecker getSupertypeLoopChecker();

    protected void reportScopesLoopError(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
    }

    protected void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        C2668g.b(storageManager, "storageManager");
        this.supertypes = storageManager.createLazyValueWithPostCompute(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.INSTANCE, new AbstractTypeConstructor$supertypes$3(this));
    }

    @NotNull
    public List<KotlinType> getSupertypes() {
        return ((Supertypes) this.supertypes.invoke()).getSupertypesWithoutCycles();
    }

    private final Collection<KotlinType> computeNeighbours(@NotNull TypeConstructor typeConstructor, boolean z) {
        AbstractTypeConstructor abstractTypeConstructor = (AbstractTypeConstructor) (!(typeConstructor instanceof AbstractTypeConstructor) ? null : typeConstructor);
        if (abstractTypeConstructor != null) {
            z = C19299w.m68809b(((Supertypes) abstractTypeConstructor.supertypes.invoke()).getAllSupertypes(), (Iterable) abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z));
            if (z) {
                return (Collection) z;
            }
        }
        z = typeConstructor.getSupertypes();
        C2668g.a(z, "supertypes");
        return z;
    }

    @NotNull
    protected Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return C17554o.m64195a();
    }
}
