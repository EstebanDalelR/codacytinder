package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DescriptorFactory {

    private static class DefaultClassConstructorDescriptor extends ClassConstructorDescriptorImpl {
        public DefaultClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement) {
            super(classDescriptor, null, Annotations.Companion.getEMPTY(), true, Kind.DECLARATION, sourceElement);
            initialize(Collections.emptyList(), DescriptorUtils.getDefaultConstructorVisibility(classDescriptor));
        }
    }

    @NotNull
    public static PropertySetterDescriptorImpl createDefaultSetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations) {
        return createSetter(propertyDescriptor, annotations, true, false, false, propertyDescriptor.getSource());
    }

    @NotNull
    public static PropertySetterDescriptorImpl createSetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z, boolean z2, boolean z3, @NotNull SourceElement sourceElement) {
        return createSetter(propertyDescriptor, annotations, z, z2, z3, propertyDescriptor.getVisibility(), sourceElement);
    }

    @NotNull
    public static PropertySetterDescriptorImpl createSetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z, boolean z2, boolean z3, @NotNull Visibility visibility, @NotNull SourceElement sourceElement) {
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), visibility, z, z2, z3, Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.initializeDefault();
        return propertySetterDescriptorImpl;
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createDefaultGetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations) {
        return createGetter(propertyDescriptor, annotations, true, false, false);
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createGetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z, boolean z2, boolean z3) {
        return createGetter(propertyDescriptor, annotations, z, z2, z3, propertyDescriptor.getSource());
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createGetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z, boolean z2, boolean z3, @NotNull SourceElement sourceElement) {
        return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), propertyDescriptor.getVisibility(), z, z2, z3, Kind.DECLARATION, null, sourceElement);
    }

    @NotNull
    public static ClassConstructorDescriptorImpl createPrimaryConstructorForObject(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement) {
        return new DefaultClassConstructorDescriptor(classDescriptor, sourceElement);
    }

    @NotNull
    public static SimpleFunctionDescriptor createEnumValuesMethod(@NotNull ClassDescriptor classDescriptor) {
        return SimpleFunctionDescriptorImpl.create(classDescriptor, Annotations.Companion.getEMPTY(), DescriptorUtils.ENUM_VALUES, Kind.SYNTHESIZED, classDescriptor.getSource()).initialize(null, null, Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.getBuiltIns(classDescriptor).getArrayType(Variance.INVARIANT, classDescriptor.getDefaultType()), Modality.FINAL, Visibilities.PUBLIC);
    }

    @NotNull
    public static SimpleFunctionDescriptor createEnumValueOfMethod(@NotNull ClassDescriptor classDescriptor) {
        SimpleFunctionDescriptorImpl create = SimpleFunctionDescriptorImpl.create(classDescriptor, Annotations.Companion.getEMPTY(), DescriptorUtils.ENUM_VALUE_OF, Kind.SYNTHESIZED, classDescriptor.getSource());
        return create.initialize(null, null, Collections.emptyList(), Collections.singletonList(new ValueParameterDescriptorImpl(create, null, 0, Annotations.Companion.getEMPTY(), Name.identifier("value"), DescriptorUtilsKt.getBuiltIns(classDescriptor).getStringType(), false, false, false, null, classDescriptor.getSource())), classDescriptor.getDefaultType(), Modality.FINAL, Visibilities.PUBLIC);
    }

    @Nullable
    public static ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(@NotNull CallableDescriptor callableDescriptor, @Nullable KotlinType kotlinType) {
        return kotlinType == null ? null : new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType));
    }
}
