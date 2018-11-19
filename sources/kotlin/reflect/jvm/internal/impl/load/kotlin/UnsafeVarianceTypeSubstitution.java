package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C15807n;
import kotlin.collections.C15808y;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeHolder;
import kotlin.reflect.jvm.internal.impl.types.TypeHolderArgument;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.VarianceCheckerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class UnsafeVarianceTypeSubstitution extends TypeSubstitution {
    private final AnnotationsImpl unsafeVarianceAnnotations;

    private static final class IndexedTypeHolder implements TypeHolder<IndexedTypeHolder> {
        @NotNull
        private final List<Integer> argumentIndices;
        @NotNull
        private final KotlinType type;

        public IndexedTypeHolder(@NotNull KotlinType kotlinType, @NotNull List<Integer> list) {
            C2668g.b(kotlinType, "type");
            C2668g.b(list, "argumentIndices");
            this.type = kotlinType;
            this.argumentIndices = list;
        }

        @NotNull
        public KotlinType getType() {
            return this.type;
        }

        public /* synthetic */ IndexedTypeHolder(KotlinType kotlinType, List list, int i, C15823e c15823e) {
            if ((i & 2) != 0) {
                list = C17554o.m64195a();
            }
            this(kotlinType, list);
        }

        @NotNull
        public final List<Integer> getArgumentIndices() {
            return this.argumentIndices;
        }

        @Nullable
        public Pair<IndexedTypeHolder, IndexedTypeHolder> getFlexibleBounds() {
            return FlexibleTypesKt.isFlexible(getType()) ? new Pair(new IndexedTypeHolder(FlexibleTypesKt.lowerIfFlexible(getType()), C19299w.m68800a((Collection) this.argumentIndices, (Object) Integer.valueOf(0))), new IndexedTypeHolder(FlexibleTypesKt.upperIfFlexible(getType()), C19299w.m68800a((Collection) this.argumentIndices, (Object) Integer.valueOf(1)))) : null;
        }

        @NotNull
        public List<TypeHolderArgument<IndexedTypeHolder>> getArguments() {
            Iterable<C15808y> o = C19299w.m68843o(getType().getArguments());
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) o, 10));
            for (C15808y c15808y : o) {
                arrayList.add(new C17590x6cfaae88((TypeProjection) c15808y.m59831d(), c15808y.m59830c(), this));
            }
            return (List) arrayList;
        }
    }

    @Nullable
    public Void get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        return null;
    }

    public UnsafeVarianceTypeSubstitution(@NotNull KotlinBuiltIns kotlinBuiltIns) {
        C2668g.b(kotlinBuiltIns, "builtIns");
        FqName fqName = KotlinBuiltIns.FQ_NAMES.unsafeVariance;
        C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.unsafeVariance");
        this.unsafeVarianceAnnotations = new AnnotationsImpl(C15807n.m59826a(new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, ah.m66884a())));
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        C2668g.b(kotlinType, "topLevelType");
        C2668g.b(variance, "position");
        List arrayList = new ArrayList();
        VarianceCheckerKt.checkTypePosition(new IndexedTypeHolder(kotlinType, null, 2, null), variance, new UnsafeVarianceTypeSubstitution$prepareTopLevelType$1(arrayList), UnsafeVarianceTypeSubstitution$prepareTopLevelType$2.INSTANCE);
        return annotatePartsWithUnsafeVariance(kotlinType.unwrap(), (Collection) arrayList);
    }

    private final UnwrappedType annotatePartsWithUnsafeVariance(@NotNull UnwrappedType unwrappedType, Collection<? extends List<Integer>> collection) {
        if (collection.isEmpty()) {
            return unwrappedType;
        }
        if (unwrappedType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            unwrappedType = TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(annotatePartsWithUnsafeVariance(flexibleType.getLowerBound(), (Collection) subPathsWithIndex(collection, 0)), annotatePartsWithUnsafeVariance(flexibleType.getUpperBound(), (Collection) subPathsWithIndex(collection, 1))), unwrappedType);
        } else if (unwrappedType instanceof SimpleType) {
            unwrappedType = annotatePartsWithUnsafeVariance((SimpleType) unwrappedType, (Collection) collection);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return unwrappedType;
    }

    private final SimpleType annotatePartsWithUnsafeVariance(@NotNull SimpleType simpleType, Collection<? extends List<Integer>> collection) {
        if (collection.isEmpty()) {
            return simpleType;
        }
        if (collection.contains(C17554o.m64195a())) {
            return simpleType.replaceAnnotations(AnnotationsKt.composeAnnotations(simpleType.getAnnotations(), this.unsafeVarianceAnnotations));
        }
        Iterable<C15808y> o = C19299w.m68843o(simpleType.getArguments());
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) o, 10));
        for (C15808y c15808y : o) {
            int c = c15808y.m59830c();
            Object obj = (TypeProjection) c15808y.m59831d();
            if (!obj.isStarProjection()) {
                obj = new TypeProjectionImpl(obj.getProjectionKind(), annotatePartsWithUnsafeVariance(obj.getType().unwrap(), (Collection) subPathsWithIndex(collection, c)));
            }
            arrayList.add(obj);
        }
        return TypeSubstitutionKt.replace$default(simpleType, (List) arrayList, null, 2, null);
    }

    private final List<List<Integer>> subPathsWithIndex(Collection<? extends List<Integer>> collection, int i) {
        Collection arrayList = new ArrayList();
        collection = collection.iterator();
        while (true) {
            int i2 = 1;
            if (!collection.hasNext()) {
                break;
            }
            Object next = collection.next();
            if (((Number) ((List) next).get(0)).intValue() != i) {
                i2 = 0;
            }
            if (i2 != 0) {
                arrayList.add(next);
            }
        }
        Iterable<List> iterable = (List) arrayList;
        collection = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (List list : iterable) {
            collection.add(list.subList(1, list.size()));
        }
        return (List) collection;
    }
}
