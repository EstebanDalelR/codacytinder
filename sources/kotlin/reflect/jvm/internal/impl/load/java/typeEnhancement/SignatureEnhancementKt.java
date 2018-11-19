package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class SignatureEnhancementKt {
    private static final JavaTypeQualifiers createJavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        if (z2) {
            if (nullabilityQualifier == NullabilityQualifier.NOT_NULL) {
                return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, true, z);
            }
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, false, z);
    }

    private static final <T> T select(@NotNull Set<? extends T> set, T t, T t2, T t3, boolean z) {
        if (z) {
            set = set.contains(t) ? t : set.contains(t2) != null ? t2 : null;
            if (C2668g.a(set, t) != null && C2668g.a(t3, t2) != null) {
                set = null;
            } else if (t3 != null) {
                set = t3;
            }
            return set;
        }
        if (t3 != null) {
            t = C19299w.m68842n(an.m66900a((Set) set, (Object) t3));
            if (t != null) {
                set = t;
            }
        }
        return C19299w.m68830g((Iterable) set);
    }

    private static final NullabilityQualifier select(@NotNull Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        if (nullabilityQualifier == NullabilityQualifier.FORCE_FLEXIBILITY) {
            return NullabilityQualifier.FORCE_FLEXIBILITY;
        }
        return (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }
}
