package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    private ReceiverParameterDescriptor dispatchReceiverParameter;
    private ReceiverParameterDescriptor extensionReceiverParameter;
    private PropertyGetterDescriptorImpl getter;
    private final boolean isActual;
    private final boolean isConst;
    private final boolean isDelegated;
    private final boolean isExpect;
    private final boolean isExternal;
    private final Kind kind;
    private final boolean lateInit;
    private final Modality modality;
    private final PropertyDescriptor original;
    private Collection<? extends PropertyDescriptor> overriddenProperties = null;
    private PropertySetterDescriptor setter;
    private boolean setterProjectedOut;
    private List<TypeParameterDescriptor> typeParameters;
    private Visibility visibility;

    public class CopyConfiguration {
        private boolean copyOverrides = true;
        private ReceiverParameterDescriptor dispatchReceiverParameter = PropertyDescriptorImpl.this.dispatchReceiverParameter;
        private Kind kind = PropertyDescriptorImpl.this.getKind();
        private Modality modality = PropertyDescriptorImpl.this.getModality();
        private Name name = PropertyDescriptorImpl.this.getName();
        private List<TypeParameterDescriptor> newTypeParameters = null;
        private PropertyDescriptor original = null;
        private DeclarationDescriptor owner = PropertyDescriptorImpl.this.getContainingDeclaration();
        private TypeSubstitution substitution = TypeSubstitution.EMPTY;
        private Visibility visibility = PropertyDescriptorImpl.this.getVisibility();

        @NotNull
        public CopyConfiguration setOwner(@NotNull DeclarationDescriptor declarationDescriptor) {
            this.owner = declarationDescriptor;
            return this;
        }

        @NotNull
        public CopyConfiguration setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor) {
            this.original = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        @NotNull
        public CopyConfiguration setModality(@NotNull Modality modality) {
            this.modality = modality;
            return this;
        }

        @NotNull
        public CopyConfiguration setVisibility(@NotNull Visibility visibility) {
            this.visibility = visibility;
            return this;
        }

        @NotNull
        public CopyConfiguration setKind(@NotNull Kind kind) {
            this.kind = kind;
            return this;
        }

        @NotNull
        public CopyConfiguration setSubstitution(@NotNull TypeSubstitution typeSubstitution) {
            this.substitution = typeSubstitution;
            return this;
        }

        @NotNull
        public CopyConfiguration setCopyOverrides(boolean z) {
            this.copyOverrides = z;
            return this;
        }

        @Nullable
        public PropertyDescriptor build() {
            return PropertyDescriptorImpl.this.doSubstitute(this);
        }
    }

    protected PropertyDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, @NotNull Name name, @NotNull Kind kind, @NotNull SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(declarationDescriptor, annotations, name, null, z, sourceElement);
        this.modality = modality;
        this.visibility = visibility;
        r7.original = propertyDescriptor == null ? r7 : propertyDescriptor;
        r7.kind = kind;
        r7.lateInit = z2;
        r7.isConst = z3;
        r7.isExpect = z4;
        r7.isActual = z5;
        r7.isExternal = z6;
        r7.isDelegated = z7;
    }

    @NotNull
    public static PropertyDescriptorImpl create(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, @NotNull Name name, @NotNull Kind kind, @NotNull SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, visibility, z, name, kind, sourceElement, z2, z3, z4, z5, z6, z7);
    }

    public void setType(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeParameterDescriptor> list, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable KotlinType kotlinType2) {
        setType(kotlinType, (List) list, receiverParameterDescriptor, DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType2));
    }

    public void setType(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeParameterDescriptor> list, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2) {
        setOutType(kotlinType);
        this.typeParameters = new ArrayList(list);
        this.extensionReceiverParameter = receiverParameterDescriptor2;
        this.dispatchReceiverParameter = receiverParameterDescriptor;
    }

    public void initialize(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor) {
        this.getter = propertyGetterDescriptorImpl;
        this.setter = propertySetterDescriptor;
    }

    public void setSetterProjectedOut(boolean z) {
        this.setterProjectedOut = z;
    }

    public void setVisibility(@NotNull Visibility visibility) {
        this.visibility = visibility;
    }

    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        return this.typeParameters;
    }

    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    @NotNull
    public KotlinType getReturnType() {
        return getType();
    }

    @NotNull
    public Modality getModality() {
        return this.modality;
    }

    @NotNull
    public Visibility getVisibility() {
        return this.visibility;
    }

    @Nullable
    public PropertyGetterDescriptorImpl getGetter() {
        return this.getter;
    }

    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.setter;
    }

    public boolean isSetterProjectedOut() {
        return this.setterProjectedOut;
    }

    public boolean isLateInit() {
        return this.lateInit;
    }

    public boolean isConst() {
        return this.isConst;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    public boolean isDelegated() {
        return this.isDelegated;
    }

    @NotNull
    public List<PropertyAccessorDescriptor> getAccessors() {
        List<PropertyAccessorDescriptor> arrayList = new ArrayList(2);
        if (this.getter != null) {
            arrayList.add(this.getter);
        }
        if (this.setter != null) {
            arrayList.add(this.setter);
        }
        return arrayList;
    }

    public PropertyDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return newCopyBuilder().setSubstitution(typeSubstitutor.getSubstitution()).setOriginal(getOriginal()).build();
    }

    @NotNull
    public CopyConfiguration newCopyBuilder() {
        return new CopyConfiguration();
    }

    @Nullable
    protected PropertyDescriptor doSubstitute(@NotNull CopyConfiguration copyConfiguration) {
        PropertyDescriptor createSubstitutedCopy = createSubstitutedCopy(copyConfiguration.owner, copyConfiguration.modality, copyConfiguration.visibility, copyConfiguration.original, copyConfiguration.kind, copyConfiguration.name);
        List typeParameters = copyConfiguration.newTypeParameters == null ? getTypeParameters() : copyConfiguration.newTypeParameters;
        List arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor substituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration.substitution, createSubstitutedCopy, arrayList);
        KotlinType substitute = substituteTypeParameters.substitute(getType(), Variance.OUT_VARIANCE);
        PropertyDescriptor propertyDescriptor = null;
        if (substitute == null) {
            return null;
        }
        KotlinType substitute2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptor propertySetterDescriptor;
        ReceiverParameterDescriptor access$900 = copyConfiguration.dispatchReceiverParameter;
        if (access$900 != null) {
            access$900 = access$900.substitute(substituteTypeParameters);
            if (access$900 == null) {
                return null;
            }
        }
        access$900 = null;
        if (r7.extensionReceiverParameter != null) {
            substitute2 = substituteTypeParameters.substitute(r7.extensionReceiverParameter.getType(), Variance.IN_VARIANCE);
            if (substitute2 == null) {
                return null;
            }
        }
        substitute2 = null;
        createSubstitutedCopy.setType(substitute, arrayList, access$900, substitute2);
        if (r7.getter == null) {
            propertyGetterDescriptorImpl = null;
        } else {
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = new PropertyGetterDescriptorImpl(createSubstitutedCopy, r7.getter.getAnnotations(), copyConfiguration.modality, normalizeVisibility(r7.getter.getVisibility(), copyConfiguration.kind), r7.getter.isDefault(), r7.getter.isExternal(), r7.getter.isInline(), copyConfiguration.kind, copyConfiguration.original == null ? null : copyConfiguration.original.getGetter(), SourceElement.NO_SOURCE);
        }
        if (propertyGetterDescriptorImpl != null) {
            substitute = r7.getter.getReturnType();
            propertyGetterDescriptorImpl.setInitialSignatureDescriptor(getSubstitutedInitialSignatureDescriptor(substituteTypeParameters, r7.getter));
            propertyGetterDescriptorImpl.initialize(substitute != null ? substituteTypeParameters.substitute(substitute, Variance.OUT_VARIANCE) : null);
        }
        if (r7.setter == null) {
            propertySetterDescriptor = null;
        } else {
            Annotations annotations = r7.setter.getAnnotations();
            Modality access$200 = copyConfiguration.modality;
            Visibility normalizeVisibility = normalizeVisibility(r7.setter.getVisibility(), copyConfiguration.kind);
            boolean isDefault = r7.setter.isDefault();
            boolean isExternal = r7.setter.isExternal();
            boolean isInline = r7.setter.isInline();
            Kind access$500 = copyConfiguration.kind;
            if (copyConfiguration.original != null) {
                propertyDescriptor = copyConfiguration.original.getSetter();
            }
            PropertySetterDescriptor propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(createSubstitutedCopy, annotations, access$200, normalizeVisibility, isDefault, isExternal, isInline, access$500, propertyDescriptor, SourceElement.NO_SOURCE);
        }
        if (propertySetterDescriptor != null) {
            List substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptor, r7.setter.getValueParameters(), substituteTypeParameters, false, false, null);
            if (substitutedValueParameters == null) {
                createSubstitutedCopy.setSetterProjectedOut(true);
                substitutedValueParameters = Collections.singletonList(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptor, DescriptorUtilsKt.getBuiltIns(copyConfiguration.owner).getNothingType()));
            }
            if (substitutedValueParameters.size() != 1) {
                throw new IllegalStateException();
            }
            propertySetterDescriptor.setInitialSignatureDescriptor(getSubstitutedInitialSignatureDescriptor(substituteTypeParameters, r7.setter));
            propertySetterDescriptor.initialize((ValueParameterDescriptor) substitutedValueParameters.get(0));
        }
        createSubstitutedCopy.initialize(propertyGetterDescriptorImpl, propertySetterDescriptor);
        if (copyConfiguration.copyOverrides) {
            Collection create = SmartSet.create();
            for (PropertyDescriptor propertyDescriptor2 : getOverriddenDescriptors()) {
                create.add(propertyDescriptor2.substitute(substituteTypeParameters));
            }
            createSubstitutedCopy.setOverriddenDescriptors(create);
        }
        if (isConst() && r7.compileTimeInitializer != null) {
            createSubstitutedCopy.setCompileTimeInitializer(r7.compileTimeInitializer);
        }
        return createSubstitutedCopy;
    }

    private static Visibility normalizeVisibility(Visibility visibility, Kind kind) {
        return (kind != Kind.FAKE_OVERRIDE || Visibilities.isPrivate(visibility.normalize()) == null) ? visibility : Visibilities.INVISIBLE_FAKE;
    }

    private static FunctionDescriptor getSubstitutedInitialSignatureDescriptor(@NotNull TypeSubstitutor typeSubstitutor, @NotNull PropertyAccessorDescriptor propertyAccessorDescriptor) {
        return propertyAccessorDescriptor.getInitialSignatureDescriptor() != null ? propertyAccessorDescriptor.getInitialSignatureDescriptor().substitute(typeSubstitutor) : null;
    }

    @NotNull
    protected PropertyDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull Visibility visibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Kind kind, @NotNull Name name) {
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, visibility, isVar(), name, kind, SourceElement.NO_SOURCE, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertyDescriptor(this, d);
    }

    @NotNull
    public PropertyDescriptor getOriginal() {
        return this.original == this ? this : this.original.getOriginal();
    }

    @NotNull
    public Kind getKind() {
        return this.kind;
    }

    public boolean isExpect() {
        return this.isExpect;
    }

    public boolean isActual() {
        return this.isActual;
    }

    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        this.overriddenProperties = collection;
    }

    @NotNull
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        return this.overriddenProperties != null ? this.overriddenProperties : Collections.emptyList();
    }

    @NotNull
    public PropertyDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind, boolean z) {
        return newCopyBuilder().setOwner(declarationDescriptor).setOriginal(null).setModality(modality).setVisibility(visibility).setKind(kind).setCopyOverrides(z).build();
    }
}
