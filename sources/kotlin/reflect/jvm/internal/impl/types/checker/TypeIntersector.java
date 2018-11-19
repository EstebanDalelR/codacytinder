package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C15819j;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

public final class TypeIntersector {
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    private enum ResultNullability {
        ;

        static final class ACCEPT_NULL extends ResultNullability {
            ACCEPT_NULL(String str, int i) {
                super(str, i);
            }

            @NotNull
            public ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                C2668g.b(unwrappedType, "nextType");
                return getResultNullability(unwrappedType);
            }
        }

        static final class NOT_NULL extends ResultNullability {
            @NotNull
            public NOT_NULL combine(@NotNull UnwrappedType unwrappedType) {
                C2668g.b(unwrappedType, "nextType");
                return this;
            }

            NOT_NULL(String str, int i) {
                super(str, i);
            }
        }

        static final class START extends ResultNullability {
            START(String str, int i) {
                super(str, i);
            }

            @NotNull
            public ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                C2668g.b(unwrappedType, "nextType");
                return getResultNullability(unwrappedType);
            }
        }

        static final class UNKNOWN extends ResultNullability {
            UNKNOWN(String str, int i) {
                super(str, i);
            }

            @NotNull
            public ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                C2668g.b(unwrappedType, "nextType");
                unwrappedType = getResultNullability(unwrappedType);
                return unwrappedType == ResultNullability.ACCEPT_NULL ? this : unwrappedType;
            }
        }

        @NotNull
        public abstract ResultNullability combine(@NotNull UnwrappedType unwrappedType);

        @NotNull
        protected final ResultNullability getResultNullability(@NotNull UnwrappedType unwrappedType) {
            C2668g.b(unwrappedType, "$receiver");
            if (unwrappedType.isMarkedNullable()) {
                return ACCEPT_NULL;
            }
            if (NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType) != null) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }

    private TypeIntersector() {
    }

    @NotNull
    public final SimpleType intersectTypes$descriptors(@NotNull List<? extends SimpleType> list) {
        C2668g.b(list, "types");
        Object obj = list.size() > 1 ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Size should be at least 2, but it is ");
            stringBuilder.append(list.size());
            throw new AssertionError(stringBuilder.toString());
        }
        ArrayList arrayList = new ArrayList();
        for (SimpleType simpleType : list) {
            if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection supertypes = simpleType.getConstructor().getSupertypes();
                C2668g.a(supertypes, "type.constructor.supertypes");
                Iterable<KotlinType> iterable = supertypes;
                Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (KotlinType kotlinType : iterable) {
                    C2668g.a(kotlinType, "it");
                    Object upperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                    if (simpleType.isMarkedNullable()) {
                        upperIfFlexible = upperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(upperIfFlexible);
                }
                arrayList.addAll((List) arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        Iterable<UnwrappedType> iterable2 = arrayList;
        list = ResultNullability.START;
        for (UnwrappedType combine : iterable2) {
            list = list.combine(combine);
        }
        Collection linkedHashSet = new LinkedHashSet();
        for (Object obj2 : iterable2) {
            Object obj22;
            if (list == ResultNullability.NOT_NULL) {
                obj22 = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(obj22);
            }
            linkedHashSet.add(obj22);
        }
        return intersectTypesWithoutIntersectionType((LinkedHashSet) linkedHashSet);
    }

    private final SimpleType intersectTypesWithoutIntersectionType(Set<? extends SimpleType> set) {
        if (set.size() == 1) {
            return (SimpleType) C19299w.m68828f((Iterable) set);
        }
        Collection collection = set;
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            SimpleType simpleType = (SimpleType) it.next();
            Iterable<SimpleType> iterable = arrayList;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (SimpleType simpleType2 : iterable) {
                    Object obj;
                    if (simpleType2 != simpleType) {
                        TypeIntersector typeIntersector = INSTANCE;
                        C2668g.a(simpleType2, "lower");
                        KotlinType kotlinType = simpleType2;
                        C2668g.a(simpleType, "upper");
                        KotlinType kotlinType2 = simpleType;
                        if (typeIntersector.isStrictSupertype(kotlinType, kotlinType2) || NewKotlinTypeChecker.INSTANCE.equalTypes(kotlinType, kotlinType2)) {
                            obj = 1;
                            continue;
                            if (obj != null) {
                                z = true;
                                break;
                            }
                        }
                    }
                    obj = null;
                    continue;
                    if (obj != null) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                it.remove();
            }
        }
        int isEmpty = 1 ^ arrayList.isEmpty();
        if (C15819j.f49018a && isEmpty == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("This collections cannot be empty! input types: ");
            stringBuilder.append(C19299w.m68797a(set, null, null, null, 0, null, null, 63, null));
            throw new AssertionError(stringBuilder.toString());
        } else if (arrayList.size() < 2) {
            set = C19299w.m68836j((List) arrayList);
            C2668g.a(set, "filteredSuperAndEqualTypes.single()");
            return (SimpleType) set;
        } else {
            set = new IntersectionTypeConstructor(collection);
            Annotations empty = Annotations.Companion.getEMPTY();
            TypeConstructor typeConstructor = (TypeConstructor) set;
            List a = C17554o.m64195a();
            set = set.createScopeForKotlinType();
            C2668g.a(set, "constructor.createScopeForKotlinType()");
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(empty, typeConstructor, a, false, set);
        }
    }

    private final boolean isStrictSupertype(KotlinType kotlinType, KotlinType kotlinType2) {
        NewKotlinTypeChecker newKotlinTypeChecker = NewKotlinTypeChecker.INSTANCE;
        return (newKotlinTypeChecker.isSubtypeOf(kotlinType, kotlinType2) && newKotlinTypeChecker.isSubtypeOf(kotlinType2, kotlinType) == null) ? true : null;
    }
}
