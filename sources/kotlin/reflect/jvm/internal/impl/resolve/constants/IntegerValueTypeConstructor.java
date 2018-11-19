package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IntegerValueTypeConstructor implements TypeConstructor {
    private final KotlinBuiltIns builtIns;
    private final ArrayList<KotlinType> supertypes;
    private final long value;

    @Nullable
    public Void getDeclarationDescriptor() {
        return null;
    }

    public boolean isDenotable() {
        return false;
    }

    @NotNull
    public Collection<KotlinType> getSupertypes() {
        return this.supertypes;
    }

    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return C17554o.m64195a();
    }

    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntegerValueType(");
        stringBuilder.append(this.value);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
