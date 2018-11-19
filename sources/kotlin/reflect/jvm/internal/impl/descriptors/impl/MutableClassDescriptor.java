package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MutableClassDescriptor extends ClassDescriptorBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean isInner;
    private final ClassKind kind;
    private Modality modality;
    private final Collection<KotlinType> supertypes = new ArrayList();
    private TypeConstructor typeConstructor;
    private List<TypeParameterDescriptor> typeParameters;
    private Visibility visibility;

    @Nullable
    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    @Nullable
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public MutableClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind, boolean z, boolean z2, @NotNull Name name, @NotNull SourceElement sourceElement) {
        super(LockBasedStorageManager.NO_LOCKS, declarationDescriptor, name, sourceElement, z2);
        this.kind = classKind;
        this.isInner = z;
    }

    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public void setModality(@NotNull Modality modality) {
        this.modality = modality;
    }

    @NotNull
    public Modality getModality() {
        return this.modality;
    }

    @NotNull
    public ClassKind getKind() {
        return this.kind;
    }

    public void setVisibility(@NotNull Visibility visibility) {
        this.visibility = visibility;
    }

    @NotNull
    public Visibility getVisibility() {
        return this.visibility;
    }

    public boolean isInner() {
        return this.isInner;
    }

    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @NotNull
    public Set<ClassConstructorDescriptor> getConstructors() {
        return Collections.emptySet();
    }

    public void setTypeParameterDescriptors(@NotNull List<TypeParameterDescriptor> list) {
        if (this.typeParameters != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Type parameters are already set for ");
            stringBuilder.append(getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.typeParameters = new ArrayList(list);
    }

    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.typeParameters;
    }

    public void createTypeConstructor() {
        this.typeConstructor = new ClassTypeConstructorImpl(this, this.typeParameters, this.supertypes);
        for (ClassConstructorDescriptor classConstructorDescriptor : getConstructors()) {
            ((ClassConstructorDescriptorImpl) classConstructorDescriptor).setReturnType(getDefaultType());
        }
    }

    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        return Empty.INSTANCE;
    }

    @NotNull
    public MemberScope getStaticScope() {
        return Empty.INSTANCE;
    }

    public String toString() {
        return DeclarationDescriptorImpl.toString(this);
    }
}
