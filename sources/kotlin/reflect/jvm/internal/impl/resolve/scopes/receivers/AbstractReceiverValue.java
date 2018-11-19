package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractReceiverValue implements ReceiverValue {
    protected final KotlinType receiverType;

    public AbstractReceiverValue(@NotNull KotlinType kotlinType) {
        this.receiverType = kotlinType;
    }

    @NotNull
    public KotlinType getType() {
        return this.receiverType;
    }
}
