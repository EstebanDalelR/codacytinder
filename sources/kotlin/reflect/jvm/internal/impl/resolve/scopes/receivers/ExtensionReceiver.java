package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public class ExtensionReceiver extends AbstractReceiverValue implements ImplicitReceiver {
    private final CallableDescriptor descriptor;

    public ExtensionReceiver(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType) {
        super(kotlinType);
        this.descriptor = callableDescriptor;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getType());
        stringBuilder.append(": Ext {");
        stringBuilder.append(this.descriptor);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
