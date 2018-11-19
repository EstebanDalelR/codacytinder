package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

public interface SupertypeLoopChecker {

    public static final class EMPTY implements SupertypeLoopChecker {
        public static final EMPTY INSTANCE = new EMPTY();

        @NotNull
        public Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, C15813i> function12) {
            C2668g.b(typeConstructor, "currentTypeConstructor");
            C2668g.b(collection, "superTypes");
            C2668g.b(function1, "neighbors");
            C2668g.b(function12, "reportLoop");
            return collection;
        }

        private EMPTY() {
        }
    }

    @NotNull
    Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, C15813i> function12);
}
