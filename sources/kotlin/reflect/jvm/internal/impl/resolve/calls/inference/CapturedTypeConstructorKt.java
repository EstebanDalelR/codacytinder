package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19066k;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

public final class CapturedTypeConstructorKt {
    @NotNull
    public static final KotlinType createCapturedType(@NotNull TypeProjection typeProjection) {
        C2668g.b(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    @NotNull
    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z);
    }

    @NotNull
    public static final TypeSubstitution wrapWithCapturingSubstitution(@NotNull TypeSubstitution typeSubstitution, boolean z) {
        C2668g.b(typeSubstitution, "$receiver");
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2(typeSubstitution, z, typeSubstitution);
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        Iterable<Pair> a = C19066k.m67975a((Object[]) indexedParametersSubstitution.getArguments(), (Object[]) indexedParametersSubstitution.getParameters());
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) a, 10));
        for (Pair pair : a) {
            arrayList.add(createCapturedIfNeeded((TypeProjection) pair.m59803a(), (TypeParameterDescriptor) pair.m59804b()));
        }
        typeSubstitution = ((List) arrayList).toArray(new TypeProjection[null]);
        if (typeSubstitution != null) {
            return new IndexedParametersSubstitution(parameters, (TypeProjection[]) typeSubstitution, z);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private static final TypeProjection createCapturedIfNeeded(@NotNull TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor != null) {
            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
                    return (TypeProjection) new TypeProjectionImpl(createCapturedType(typeProjection));
                }
                if (typeProjection.isStarProjection() != null) {
                    StorageManager storageManager = LockBasedStorageManager.NO_LOCKS;
                    C2668g.a(storageManager, "LockBasedStorageManager.NO_LOCKS");
                    typeParameterDescriptor = (TypeProjection) new TypeProjectionImpl(new LazyWrappedType(storageManager, new CapturedTypeConstructorKt$createCapturedIfNeeded$1(typeProjection)));
                } else {
                    typeParameterDescriptor = (TypeProjection) new TypeProjectionImpl(typeProjection.getType());
                }
                return typeParameterDescriptor;
            }
        }
        return typeProjection;
    }
}
