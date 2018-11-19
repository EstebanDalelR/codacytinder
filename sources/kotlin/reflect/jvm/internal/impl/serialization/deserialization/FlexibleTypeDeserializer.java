package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public interface FlexibleTypeDeserializer {

    public static final class ThrowException implements FlexibleTypeDeserializer {
        public static final ThrowException INSTANCE = new ThrowException();

        private ThrowException() {
        }

        @NotNull
        public KotlinType create(@NotNull Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
            C2668g.b(type, "proto");
            C2668g.b(str, "flexibleId");
            C2668g.b(simpleType, "lowerBound");
            C2668g.b(simpleType2, "upperBound");
            throw ((Throwable) new IllegalArgumentException("This method should not be used."));
        }
    }

    @NotNull
    KotlinType create(@NotNull Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2);
}
