package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PropertySetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertySetterDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    @NotNull
    private final PropertySetterDescriptor original;
    private ValueParameterDescriptor parameter;

    public PropertySetterDescriptorImpl(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, boolean z2, boolean z3, @NotNull Kind kind, @Nullable PropertySetterDescriptor propertySetterDescriptor, @NotNull SourceElement sourceElement) {
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        PropertySetterDescriptor propertySetterDescriptor2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<set-");
        stringBuilder.append(propertyDescriptor.getName());
        stringBuilder.append(">");
        super(modality, visibility, propertyDescriptor, annotations, Name.special(stringBuilder.toString()), z, z2, z3, kind, sourceElement);
        if (propertySetterDescriptor != null) {
            propertySetterDescriptorImpl = this;
            propertySetterDescriptor2 = propertySetterDescriptor;
        } else {
            propertySetterDescriptor2 = this;
        }
        propertySetterDescriptorImpl.original = propertySetterDescriptor2;
    }

    public void initialize(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        this.parameter = valueParameterDescriptor;
    }

    public void initializeDefault() {
        this.parameter = createSetterParameter(this, getCorrespondingProperty().getReturnType());
    }

    public static ValueParameterDescriptorImpl createSetterParameter(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull KotlinType kotlinType) {
        return new ValueParameterDescriptorImpl(propertySetterDescriptor, null, 0, Annotations.Companion.getEMPTY(), Name.special("<set-?>"), kotlinType, false, false, false, null, SourceElement.NO_SOURCE);
    }

    @NotNull
    public Collection<? extends PropertySetterDescriptor> getOverriddenDescriptors() {
        return super.getOverriddenDescriptors(false);
    }

    @NotNull
    public List<ValueParameterDescriptor> getValueParameters() {
        if (this.parameter != null) {
            return Collections.singletonList(this.parameter);
        }
        throw new IllegalStateException();
    }

    @NotNull
    public KotlinType getReturnType() {
        return DescriptorUtilsKt.getBuiltIns(this).getUnitType();
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertySetterDescriptor(this, d);
    }

    @NotNull
    public PropertySetterDescriptor getOriginal() {
        return this.original;
    }
}
