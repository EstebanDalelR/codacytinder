package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ProtoBufUtilKt {
    @Nullable
    public static final <M extends ExtendableMessage<M>, T> T getExtensionOrNull(@NotNull ExtendableMessage<M> extendableMessage, @NotNull GeneratedExtension<M, T> generatedExtension) {
        C2668g.b(extendableMessage, "$receiver");
        C2668g.b(generatedExtension, "extension");
        return extendableMessage.hasExtension(generatedExtension) ? extendableMessage.getExtension(generatedExtension) : null;
    }
}
