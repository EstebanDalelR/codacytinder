package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.C15819j;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeCheckerContext {
    private final boolean allowedTypeVariable;
    private int argumentsDepth;
    private final boolean errorTypeEqualsToAnything;
    private ArrayDeque<SimpleType> supertypesDeque;
    private boolean supertypesLocked;
    private Set<SimpleType> supertypesSet;

    public enum LowerCapturedTypePolicy {
    }

    public enum SeveralSupertypesWithSameConstructorPolicy {
    }

    public static abstract class SupertypesPolicy {

        public static final class LowerIfFlexible extends SupertypesPolicy {
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible();

            private LowerIfFlexible() {
                super();
            }

            @NotNull
            public SimpleType transformType(@NotNull KotlinType kotlinType) {
                C2668g.b(kotlinType, "type");
                return FlexibleTypesKt.lowerIfFlexible(kotlinType);
            }
        }

        public static final class LowerIfFlexibleWithCustomSubstitutor extends SupertypesPolicy {
            @NotNull
            private final TypeSubstitutor substitutor;

            public LowerIfFlexibleWithCustomSubstitutor(@NotNull TypeSubstitutor typeSubstitutor) {
                C2668g.b(typeSubstitutor, "substitutor");
                super();
                this.substitutor = typeSubstitutor;
            }

            @NotNull
            public SimpleType transformType(@NotNull KotlinType kotlinType) {
                C2668g.b(kotlinType, "type");
                kotlinType = this.substitutor.safeSubstitute(FlexibleTypesKt.lowerIfFlexible(kotlinType), Variance.INVARIANT);
                C2668g.a(kotlinType, "substitutor.safeSubstitu…le(), Variance.INVARIANT)");
                return TypeSubstitutionKt.asSimpleType(kotlinType);
            }
        }

        public static final class None extends SupertypesPolicy {
            public static final None INSTANCE = new None();

            private None() {
                super();
            }

            @NotNull
            public Void transformType(@NotNull KotlinType kotlinType) {
                C2668g.b(kotlinType, "type");
                throw ((Throwable) new UnsupportedOperationException("Should not be called"));
            }
        }

        public static final class UpperIfFlexible extends SupertypesPolicy {
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible();

            private UpperIfFlexible() {
                super();
            }

            @NotNull
            public SimpleType transformType(@NotNull KotlinType kotlinType) {
                C2668g.b(kotlinType, "type");
                return FlexibleTypesKt.upperIfFlexible(kotlinType);
            }
        }

        @NotNull
        public abstract SimpleType transformType(@NotNull KotlinType kotlinType);

        private SupertypesPolicy() {
        }
    }

    @Nullable
    public Boolean addSubtypeConstraint(@NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        C2668g.b(unwrappedType, "subType");
        C2668g.b(unwrappedType2, "superType");
        return null;
    }

    public TypeCheckerContext(boolean z, boolean z2) {
        this.errorTypeEqualsToAnything = z;
        this.allowedTypeVariable = z2;
    }

    public /* synthetic */ TypeCheckerContext(boolean z, boolean z2, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        this(z, z2);
    }

    public final boolean getErrorTypeEqualsToAnything() {
        return this.errorTypeEqualsToAnything;
    }

    public boolean areEqualTypeConstructors(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
        C2668g.b(typeConstructor, "a");
        C2668g.b(typeConstructor2, "b");
        return C2668g.a(typeConstructor, typeConstructor2);
    }

    @NotNull
    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(@NotNull SimpleType simpleType, @NotNull NewCapturedType newCapturedType) {
        C2668g.b(simpleType, "subType");
        C2668g.b(newCapturedType, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @NotNull
    public SeveralSupertypesWithSameConstructorPolicy getSameConstructorPolicy() {
        return SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN;
    }

    private final void initialize() {
        int i = this.supertypesLocked ^ 1;
        if (C15819j.f49018a && i == 0) {
            throw new AssertionError("Assertion failed");
        }
        this.supertypesLocked = true;
        if (this.supertypesDeque == null) {
            this.supertypesDeque = new ArrayDeque(4);
        }
        if (this.supertypesSet == null) {
            this.supertypesSet = SmartSet.Companion.create();
        }
    }

    private final void clear() {
        ArrayDeque arrayDeque = this.supertypesDeque;
        if (arrayDeque == null) {
            C2668g.a();
        }
        arrayDeque.clear();
        Set set = this.supertypesSet;
        if (set == null) {
            C2668g.a();
        }
        set.clear();
        this.supertypesLocked = false;
    }

    public final boolean isAllowedTypeVariable(@NotNull UnwrappedType unwrappedType) {
        C2668g.b(unwrappedType, "$receiver");
        return (!this.allowedTypeVariable || (unwrappedType.getConstructor() instanceof NewTypeVariableConstructor) == null) ? null : true;
    }
}
