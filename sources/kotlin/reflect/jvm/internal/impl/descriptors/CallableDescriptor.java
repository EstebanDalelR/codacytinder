package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {
    @Nullable
    ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Nullable
    ReceiverParameterDescriptor getExtensionReceiverParameter();

    @NotNull
    CallableDescriptor getOriginal();

    @NotNull
    Collection<? extends CallableDescriptor> getOverriddenDescriptors();

    @Nullable
    KotlinType getReturnType();

    @NotNull
    List<TypeParameterDescriptor> getTypeParameters();

    @NotNull
    List<ValueParameterDescriptor> getValueParameters();

    boolean hasSynthesizedParameterNames();
}
