package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeHolderArgument;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.UnsafeVarianceTypeSubstitution$IndexedTypeHolder$arguments$$inlined$map$lambda$1 */
public final class C17590x6cfaae88 implements TypeHolderArgument<IndexedTypeHolder> {
    final /* synthetic */ int $index;
    final /* synthetic */ TypeProjection $projection;
    final /* synthetic */ IndexedTypeHolder this$0;

    C17590x6cfaae88(TypeProjection typeProjection, int i, IndexedTypeHolder indexedTypeHolder) {
        this.$projection = typeProjection;
        this.$index = i;
        this.this$0 = indexedTypeHolder;
    }

    @NotNull
    public TypeProjection getProjection() {
        return this.$projection;
    }

    @Nullable
    public TypeParameterDescriptor getTypeParameter() {
        return (TypeParameterDescriptor) this.this$0.getType().getConstructor().getParameters().get(this.$index);
    }

    @NotNull
    public IndexedTypeHolder getHolder() {
        KotlinType type = this.$projection.getType();
        C2668g.a(type, "projection.type");
        return new IndexedTypeHolder(type, C19299w.m68800a((Collection) this.this$0.getArgumentIndices(), (Object) Integer.valueOf(this.$index)));
    }
}
