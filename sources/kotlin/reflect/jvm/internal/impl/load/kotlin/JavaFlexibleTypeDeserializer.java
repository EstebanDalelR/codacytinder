package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {
    public static final JavaFlexibleTypeDeserializer INSTANCE = new JavaFlexibleTypeDeserializer();

    private JavaFlexibleTypeDeserializer() {
    }

    @NotNull
    public KotlinType create(@NotNull Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(type, "proto");
        C2668g.b(str, "flexibleId");
        C2668g.b(simpleType, "lowerBound");
        C2668g.b(simpleType2, "upperBound");
        if ((C2668g.a(str, "kotlin.jvm.PlatformType") ^ 1) != 0) {
            type = new StringBuilder();
            type.append("Error java flexible type with id: ");
            type.append(str);
            type.append(". (");
            type.append(simpleType);
            type.append("..");
            type.append(simpleType2);
            type.append(')');
            type = ErrorUtils.createErrorType(type.toString());
            C2668g.a(type, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return (KotlinType) type;
        } else if (type.hasExtension(JvmProtoBuf.isRaw) != null) {
            return (KotlinType) new RawTypeImpl(simpleType, simpleType2);
        } else {
            return KotlinTypeFactory.flexibleType(simpleType, simpleType2);
        }
    }
}
