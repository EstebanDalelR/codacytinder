package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class AbstractTypeConstructor$supertypes$3 extends Lambda implements Function1<Supertypes, C15813i> {
    final /* synthetic */ AbstractTypeConstructor this$0;

    AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        this.this$0 = abstractTypeConstructor;
        super(1);
    }

    public final void invoke(@NotNull Supertypes supertypes) {
        C2668g.b(supertypes, "supertypes");
        Collection findLoopsInSupertypesAndDisconnect = this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, supertypes.getAllSupertypes(), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(this), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this));
        Collection collection = null;
        if (findLoopsInSupertypesAndDisconnect.isEmpty()) {
            KotlinType defaultSupertypeIfEmpty = this.this$0.defaultSupertypeIfEmpty();
            List a = defaultSupertypeIfEmpty != null ? C15807n.m59826a(defaultSupertypeIfEmpty) : null;
            if (a == null) {
                a = C17554o.m64195a();
            }
            findLoopsInSupertypesAndDisconnect = a;
        }
        this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, findLoopsInSupertypesAndDisconnect, new Function1<TypeConstructor, Collection<? extends KotlinType>>() {
            @NotNull
            public final Collection<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
                C2668g.b(typeConstructor, "it");
                return this.this$0.computeNeighbours(typeConstructor, true);
            }
        }, new Function1<KotlinType, C15813i>() {
            public final void invoke(@NotNull KotlinType kotlinType) {
                C2668g.b(kotlinType, "it");
                this.this$0.reportScopesLoopError(kotlinType);
            }
        });
        if (findLoopsInSupertypesAndDisconnect instanceof List) {
            collection = findLoopsInSupertypesAndDisconnect;
        }
        List list = (List) collection;
        if (list == null) {
            list = C19299w.m68840l(findLoopsInSupertypesAndDisconnect);
        }
        supertypes.setSupertypesWithoutCycles(list);
    }
}
