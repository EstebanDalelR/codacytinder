package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {
    private List<? extends TypeParameterDescriptor> declaredTypeParametersImpl;
    private final AbstractTypeAliasDescriptor$typeConstructor$1 typeConstructor = new AbstractTypeAliasDescriptor$typeConstructor$1(this);
    private final Visibility visibilityImpl;

    @NotNull
    protected abstract StorageManager getStorageManager();

    @NotNull
    protected abstract List<TypeParameterDescriptor> getTypeConstructorTypeParameters();

    public boolean isActual() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isExternal() {
        return false;
    }

    public AbstractTypeAliasDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull Visibility visibility) {
        C2668g.b(declarationDescriptor, "containingDeclaration");
        C2668g.b(annotations, "annotations");
        C2668g.b(name, "name");
        C2668g.b(sourceElement, "sourceElement");
        C2668g.b(visibility, "visibilityImpl");
        super(declarationDescriptor, annotations, name, sourceElement);
        this.visibilityImpl = visibility;
    }

    public final void initialize(@NotNull List<? extends TypeParameterDescriptor> list) {
        C2668g.b(list, "declaredTypeParameters");
        this.declaredTypeParametersImpl = list;
    }

    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        C2668g.b(declarationDescriptorVisitor, "visitor");
        return declarationDescriptorVisitor.visitTypeAliasDescriptor(this, d);
    }

    public boolean isInner() {
        return TypeUtils.contains(getUnderlyingType(), new AbstractTypeAliasDescriptor$isInner$1(this));
    }

    @NotNull
    public final Collection<TypeAliasConstructorDescriptor> getTypeAliasConstructors() {
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return C17554o.m64195a();
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        C2668g.a(constructors, "classDescriptor.constructors");
        Collection arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            Companion companion = TypeAliasConstructorDescriptorImpl.Companion;
            StorageManager storageManager = getStorageManager();
            TypeAliasDescriptor typeAliasDescriptor = this;
            C2668g.a(classConstructorDescriptor, "it");
            TypeAliasConstructorDescriptor createIfAvailable = companion.createIfAvailable(storageManager, typeAliasDescriptor, classConstructorDescriptor);
            if (createIfAvailable != null) {
                arrayList.add(createIfAvailable);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> list = this.declaredTypeParametersImpl;
        if (list == null) {
            C2668g.b("declaredTypeParametersImpl");
        }
        return list;
    }

    @NotNull
    public Modality getModality() {
        return Modality.FINAL;
    }

    @NotNull
    public Visibility getVisibility() {
        return this.visibilityImpl;
    }

    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("typealias ");
        stringBuilder.append(getName().asString());
        return stringBuilder.toString();
    }

    @NotNull
    public TypeAliasDescriptor getOriginal() {
        DeclarationDescriptorWithSource original = super.getOriginal();
        if (original != null) {
            return (TypeAliasDescriptor) original;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
    }

    @NotNull
    protected final SimpleType computeDefaultType() {
        MemberScope unsubstitutedMemberScope;
        SimpleType makeUnsubstitutedType;
        ClassifierDescriptor classifierDescriptor = this;
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor != null) {
            unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope();
            if (unsubstitutedMemberScope != null) {
                makeUnsubstitutedType = TypeUtils.makeUnsubstitutedType(classifierDescriptor, unsubstitutedMemberScope);
                C2668g.a(makeUnsubstitutedType, "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)");
                return makeUnsubstitutedType;
            }
        }
        unsubstitutedMemberScope = Empty.INSTANCE;
        makeUnsubstitutedType = TypeUtils.makeUnsubstitutedType(classifierDescriptor, unsubstitutedMemberScope);
        C2668g.a(makeUnsubstitutedType, "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)");
        return makeUnsubstitutedType;
    }
}
