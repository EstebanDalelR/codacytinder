package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.C15819j;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IndexedParametersSubstitution extends TypeSubstitution {
    private final boolean approximateCapturedTypes;
    @NotNull
    private final TypeProjection[] arguments;
    @NotNull
    private final TypeParameterDescriptor[] parameters;

    @NotNull
    public final TypeParameterDescriptor[] getParameters() {
        return this.parameters;
    }

    @NotNull
    public final TypeProjection[] getArguments() {
        return this.arguments;
    }

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            z = false;
        }
        this(typeParameterDescriptorArr, typeProjectionArr, z);
    }

    public IndexedParametersSubstitution(@NotNull TypeParameterDescriptor[] typeParameterDescriptorArr, @NotNull TypeProjection[] typeProjectionArr, boolean z) {
        C2668g.b(typeParameterDescriptorArr, "parameters");
        C2668g.b(typeProjectionArr, "arguments");
        this.parameters = typeParameterDescriptorArr;
        this.arguments = typeProjectionArr;
        this.approximateCapturedTypes = z;
        typeParameterDescriptorArr = this.parameters.length <= this.arguments.length ? 1 : null;
        if (C15819j.f49018a != null && typeParameterDescriptorArr == null) {
            typeParameterDescriptorArr = new StringBuilder();
            typeParameterDescriptorArr.append("Number of arguments should not be less then number of parameters, but: parameters=");
            typeParameterDescriptorArr.append(this.parameters.length);
            typeParameterDescriptorArr.append(", args=");
            typeParameterDescriptorArr.append(this.arguments.length);
            throw ((Throwable) new AssertionError(typeParameterDescriptorArr.toString()));
        }
    }

    public IndexedParametersSubstitution(@NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<? extends TypeProjection> list2) {
        C2668g.b(list, "parameters");
        C2668g.b(list2, "argumentsList");
        list = list.toArray(new TypeParameterDescriptor[0]);
        if (list == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        TypeParameterDescriptor[] typeParameterDescriptorArr = (TypeParameterDescriptor[]) list;
        list = list2.toArray(new TypeProjection[0]);
        if (list == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this(typeParameterDescriptorArr, (TypeProjection[]) list, false, 4, null);
    }

    public boolean isEmpty() {
        return this.arguments.length == 0;
    }

    public boolean approximateContravariantCapturedTypes() {
        return this.approximateCapturedTypes;
    }

    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(kotlinType instanceof TypeParameterDescriptor)) {
            kotlinType = null;
        }
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) kotlinType;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        if (index >= this.parameters.length || C2668g.a(this.parameters[index].getTypeConstructor(), typeParameterDescriptor.getTypeConstructor()) == null) {
            return null;
        }
        return this.arguments[index];
    }
}
