package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public class TransientReceiver extends AbstractReceiverValue {
    public TransientReceiver(@NotNull KotlinType kotlinType) {
        super(kotlinType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Transient} : ");
        stringBuilder.append(getType());
        return stringBuilder.toString();
    }
}
