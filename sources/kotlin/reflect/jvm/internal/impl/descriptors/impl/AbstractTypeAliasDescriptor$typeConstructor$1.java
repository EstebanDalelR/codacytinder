package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

public final class AbstractTypeAliasDescriptor$typeConstructor$1 implements TypeConstructor {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    public boolean isDenotable() {
        return true;
    }

    AbstractTypeAliasDescriptor$typeConstructor$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.this$0 = abstractTypeAliasDescriptor;
    }

    @NotNull
    public TypeAliasDescriptor getDeclarationDescriptor() {
        return this.this$0;
    }

    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return this.this$0.getTypeConstructorTypeParameters();
    }

    @NotNull
    public Collection<KotlinType> getSupertypes() {
        Collection<KotlinType> supertypes = getDeclarationDescriptor().getUnderlyingType().getConstructor().getSupertypes();
        C2668g.a(supertypes, "declarationDescriptor.un…pe.constructor.supertypes");
        return supertypes;
    }

    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return DescriptorUtilsKt.getBuiltIns(getDeclarationDescriptor());
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[typealias ");
        stringBuilder.append(getDeclarationDescriptor().getName().asString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
