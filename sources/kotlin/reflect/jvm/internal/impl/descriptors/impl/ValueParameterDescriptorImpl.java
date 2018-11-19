package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {
    public static final Companion Companion = new Companion();
    private final boolean declaresDefaultValue;
    private final int index;
    private final boolean isCrossinline;
    private final boolean isNoinline;
    private final ValueParameterDescriptor original;
    @Nullable
    private final KotlinType varargElementType;

    public static final class Companion {
        private Companion() {
        }
    }

    @Nullable
    public Void getCompileTimeInitializer() {
        return null;
    }

    public boolean isVar() {
        return false;
    }

    public boolean isLateInit() {
        return DefaultImpls.isLateInit(this);
    }

    public int getIndex() {
        return this.index;
    }

    public boolean isCrossinline() {
        return this.isCrossinline;
    }

    public boolean isNoinline() {
        return this.isNoinline;
    }

    @Nullable
    public KotlinType getVarargElementType() {
        return this.varargElementType;
    }

    public ValueParameterDescriptorImpl(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement) {
        CallableDescriptor callableDescriptor2 = callableDescriptor;
        C2668g.b(callableDescriptor2, "containingDeclaration");
        Annotations annotations2 = annotations;
        C2668g.b(annotations2, "annotations");
        Name name2 = name;
        C2668g.b(name2, "name");
        KotlinType kotlinType3 = kotlinType;
        C2668g.b(kotlinType3, "outType");
        SourceElement sourceElement2 = sourceElement;
        C2668g.b(sourceElement2, "source");
        super(callableDescriptor2, annotations2, name2, kotlinType3, sourceElement2);
        this.index = i;
        this.declaresDefaultValue = z;
        this.isCrossinline = z2;
        this.isNoinline = z3;
        this.varargElementType = kotlinType2;
        r6.original = valueParameterDescriptor != null ? valueParameterDescriptor : (ValueParameterDescriptor) r6;
    }

    @NotNull
    public CallableDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        if (containingDeclaration != null) {
            return (CallableDescriptor) containingDeclaration;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    public boolean declaresDefaultValue() {
        if (this.declaresDefaultValue) {
            CallableDescriptor containingDeclaration = getContainingDeclaration();
            if (containingDeclaration == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            }
            Kind kind = ((CallableMemberDescriptor) containingDeclaration).getKind();
            C2668g.a(kind, "(containingDeclaration a…bleMemberDescriptor).kind");
            if (kind.isReal()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public ValueParameterDescriptor getOriginal() {
        return this.original == ((ValueParameterDescriptorImpl) this) ? this : this.original.getOriginal();
    }

    @NotNull
    public ValueParameterDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        C2668g.b(typeSubstitutor, "substitutor");
        if (typeSubstitutor.isEmpty() != null) {
            return this;
        }
        throw ((Throwable) new UnsupportedOperationException());
    }

    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        C2668g.b(declarationDescriptorVisitor, "visitor");
        return declarationDescriptorVisitor.visitValueParameterDescriptor(this, d);
    }

    @NotNull
    public ValueParameterDescriptor copy(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i) {
        CallableDescriptor callableDescriptor2 = callableDescriptor;
        C2668g.b(callableDescriptor2, "newOwner");
        Name name2 = name;
        C2668g.b(name2, "newName");
        Annotations annotations = getAnnotations();
        C2668g.a(annotations, "annotations");
        KotlinType type = getType();
        C2668g.a(type, "type");
        boolean declaresDefaultValue = declaresDefaultValue();
        boolean isCrossinline = isCrossinline();
        boolean isNoinline = isNoinline();
        KotlinType varargElementType = getVarargElementType();
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
        return new ValueParameterDescriptorImpl(callableDescriptor2, null, i, annotations, name2, type, declaresDefaultValue, isCrossinline, isNoinline, varargElementType, sourceElement);
    }

    @NotNull
    public Visibility getVisibility() {
        return Visibilities.LOCAL;
    }

    @NotNull
    public Collection<ValueParameterDescriptor> getOverriddenDescriptors() {
        Collection overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        C2668g.a(overriddenDescriptors, "containingDeclaration.overriddenDescriptors");
        Iterable<CallableDescriptor> iterable = overriddenDescriptors;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (CallableDescriptor callableDescriptor : iterable) {
            C2668g.a(callableDescriptor, "it");
            arrayList.add((ValueParameterDescriptor) callableDescriptor.getValueParameters().get(getIndex()));
        }
        return (List) arrayList;
    }
}
