package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PropertyGetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertyGetterDescriptor {
    @NotNull
    private final PropertyGetterDescriptor original;
    private KotlinType returnType;

    public PropertyGetterDescriptorImpl(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, boolean z2, boolean z3, @NotNull Kind kind, @Nullable PropertyGetterDescriptor propertyGetterDescriptor, @NotNull SourceElement sourceElement) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertyGetterDescriptor propertyGetterDescriptor2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<get-");
        stringBuilder.append(propertyDescriptor.getName());
        stringBuilder.append(">");
        super(modality, visibility, propertyDescriptor, annotations, Name.special(stringBuilder.toString()), z, z2, z3, kind, sourceElement);
        if (propertyGetterDescriptor != null) {
            propertyGetterDescriptorImpl = this;
            propertyGetterDescriptor2 = propertyGetterDescriptor;
        } else {
            propertyGetterDescriptor2 = this;
        }
        propertyGetterDescriptorImpl.original = propertyGetterDescriptor2;
    }

    public void initialize(KotlinType kotlinType) {
        if (kotlinType == null) {
            kotlinType = getCorrespondingProperty().getType();
        }
        this.returnType = kotlinType;
    }

    @NotNull
    public Collection<? extends PropertyGetterDescriptor> getOverriddenDescriptors() {
        return super.getOverriddenDescriptors(true);
    }

    @NotNull
    public List<ValueParameterDescriptor> getValueParameters() {
        return Collections.emptyList();
    }

    public KotlinType getReturnType() {
        return this.returnType;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertyGetterDescriptor(this, d);
    }

    @NotNull
    public PropertyGetterDescriptor getOriginal() {
        return this.original;
    }
}
