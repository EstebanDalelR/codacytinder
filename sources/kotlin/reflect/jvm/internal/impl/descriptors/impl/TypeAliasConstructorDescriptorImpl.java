package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.C15819j;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final Companion Companion = new Companion();
    @NotNull
    private final StorageManager storageManager;
    @NotNull
    private final TypeAliasDescriptor typeAliasDescriptor;
    @NotNull
    private ClassConstructorDescriptor underlyingConstructorDescriptor;
    @Nullable
    private final NullableLazyValue withDispatchReceiver$delegate;

    public static final class Companion {
        private Companion() {
        }

        private final TypeSubstitutor getTypeSubstitutorForUnderlyingClass(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
            if (typeAliasDescriptor.getClassDescriptor() == null) {
                return null;
            }
            return TypeSubstitutor.create((KotlinType) typeAliasDescriptor.getExpandedType());
        }

        @Nullable
        public final TypeAliasConstructorDescriptor createIfAvailable(@NotNull StorageManager storageManager, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull ClassConstructorDescriptor classConstructorDescriptor) {
            TypeAliasDescriptor typeAliasDescriptor2 = typeAliasDescriptor;
            StorageManager storageManager2 = storageManager;
            C2668g.b(storageManager2, "storageManager");
            C2668g.b(typeAliasDescriptor2, "typeAliasDescriptor");
            ClassConstructorDescriptor classConstructorDescriptor2 = classConstructorDescriptor;
            C2668g.b(classConstructorDescriptor2, "constructor");
            TypeSubstitutor typeSubstitutorForUnderlyingClass = getTypeSubstitutorForUnderlyingClass(typeAliasDescriptor2);
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptor = null;
            if (typeSubstitutorForUnderlyingClass == null) {
                return null;
            }
            Annotations annotations = classConstructorDescriptor.getAnnotations();
            Kind kind = classConstructorDescriptor.getKind();
            C2668g.a(kind, "constructor.kind");
            SourceElement source = typeAliasDescriptor.getSource();
            C2668g.a(source, "typeAliasDescriptor.source");
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager2, typeAliasDescriptor2, classConstructorDescriptor2, null, annotations, kind, source);
            List substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(typeAliasConstructorDescriptorImpl, classConstructorDescriptor.getValueParameters(), typeSubstitutorForUnderlyingClass, false, false, null);
            if (substitutedValueParameters == null) {
                return null;
            }
            KotlinType substitute = typeSubstitutorForUnderlyingClass.substitute(classConstructorDescriptor.getReturnType(), Variance.INVARIANT);
            if (substitute == null) {
                return null;
            }
            SimpleType lowerIfFlexible = FlexibleTypesKt.lowerIfFlexible(substitute.unwrap());
            SimpleType defaultType = typeAliasDescriptor.getDefaultType();
            C2668g.a(defaultType, "typeAliasDescriptor.defaultType");
            lowerIfFlexible = SpecialTypesKt.withAbbreviation(lowerIfFlexible, defaultType);
            ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
            if (dispatchReceiverParameter != null) {
                C2668g.a(dispatchReceiverParameter, "it");
                typeAliasConstructorDescriptor = typeSubstitutorForUnderlyingClass.safeSubstitute(dispatchReceiverParameter.getType(), Variance.INVARIANT);
            }
            typeAliasConstructorDescriptorImpl.initialize(typeAliasConstructorDescriptor, null, typeAliasDescriptor.getDeclaredTypeParameters(), substitutedValueParameters, lowerIfFlexible, Modality.FINAL, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @NotNull
    public TypeAliasDescriptor getTypeAliasDescriptor() {
        return this.typeAliasDescriptor;
    }

    private TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, annotations, Name.special("<init>"), kind, sourceElement);
        this.storageManager = storageManager;
        this.typeAliasDescriptor = typeAliasDescriptor;
        setActual(getTypeAliasDescriptor().isActual());
        this.withDispatchReceiver$delegate = this.storageManager.createNullableLazyValue((Function0) new TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(this, classConstructorDescriptor));
        this.underlyingConstructorDescriptor = classConstructorDescriptor;
    }

    private void setUnderlyingConstructorDescriptor(ClassConstructorDescriptor classConstructorDescriptor) {
        this.underlyingConstructorDescriptor = classConstructorDescriptor;
    }

    @NotNull
    public ClassConstructorDescriptor getUnderlyingConstructorDescriptor() {
        return this.underlyingConstructorDescriptor;
    }

    public boolean isPrimary() {
        return getUnderlyingConstructorDescriptor().isPrimary();
    }

    @NotNull
    public TypeAliasDescriptor getContainingDeclaration() {
        return getTypeAliasDescriptor();
    }

    @NotNull
    public KotlinType getReturnType() {
        KotlinType returnType = super.getReturnType();
        if (returnType == null) {
            C2668g.a();
        }
        return returnType;
    }

    @NotNull
    public TypeAliasConstructorDescriptor getOriginal() {
        FunctionDescriptor original = super.getOriginal();
        if (original != null) {
            return (TypeAliasConstructorDescriptor) original;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    @Nullable
    public TypeAliasConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        C2668g.b(typeSubstitutor, "substitutor");
        typeSubstitutor = super.substitute(typeSubstitutor);
        if (typeSubstitutor == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        }
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) typeSubstitutor;
        TypeSubstitutor create = TypeSubstitutor.create(typeAliasConstructorDescriptorImpl.getReturnType());
        ClassConstructorDescriptor original = getUnderlyingConstructorDescriptor().getOriginal();
        C2668g.a(create, "underlyingConstructorSubstitutor");
        ClassConstructorDescriptor substitute = original.substitute(create);
        if (substitute == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.setUnderlyingConstructorDescriptor(substitute);
        return typeAliasConstructorDescriptorImpl;
    }

    @NotNull
    public TypeAliasConstructorDescriptor copy(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull Visibility visibility, @NotNull Kind kind, boolean z) {
        C2668g.b(declarationDescriptor, "newOwner");
        C2668g.b(modality, "modality");
        C2668g.b(visibility, "visibility");
        C2668g.b(kind, "kind");
        declarationDescriptor = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(visibility).setKind(kind).setCopyOverrides(z).build();
        if (declarationDescriptor != null) {
            return (TypeAliasConstructorDescriptor) declarationDescriptor;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    @NotNull
    protected TypeAliasConstructorDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        C2668g.b(declarationDescriptor, "newOwner");
        C2668g.b(kind, "kind");
        C2668g.b(annotations, "annotations");
        C2668g.b(sourceElement, "source");
        Object obj = 1;
        if (kind != Kind.DECLARATION) {
            if (kind != Kind.SYNTHESIZED) {
                functionDescriptor = null;
                if (C15819j.f49018a || r10 != null) {
                    if (name == null) {
                        obj = null;
                    }
                    if (C15819j.f49018a == null && r0 == null) {
                        declarationDescriptor = new StringBuilder();
                        declarationDescriptor.append("Renaming type alias constructor: ");
                        declarationDescriptor.append(this);
                        throw ((Throwable) new AssertionError(declarationDescriptor.toString()));
                    }
                    return new TypeAliasConstructorDescriptorImpl(this.storageManager, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, annotations, Kind.DECLARATION, sourceElement);
                }
                functionDescriptor = new StringBuilder();
                functionDescriptor.append("Creating a type alias constructor that is not a declaration: \ncopy from: ");
                functionDescriptor.append(this);
                functionDescriptor.append("\nnewOwner: ");
                functionDescriptor.append(declarationDescriptor);
                functionDescriptor.append("\nkind: ");
                functionDescriptor.append(kind);
                throw ((Throwable) new AssertionError(functionDescriptor.toString()));
            }
        }
        functionDescriptor = true;
        if (C15819j.f49018a) {
        }
        if (name == null) {
            obj = null;
        }
        if (C15819j.f49018a == null) {
        }
        return new TypeAliasConstructorDescriptorImpl(this.storageManager, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, annotations, Kind.DECLARATION, sourceElement);
    }
}
