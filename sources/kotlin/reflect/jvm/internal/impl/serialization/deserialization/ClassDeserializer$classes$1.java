package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ClassDeserializer$classes$1 extends Lambda implements Function1<ClassKey, ClassDescriptor> {
    final /* synthetic */ ClassDeserializer this$0;

    ClassDeserializer$classes$1(ClassDeserializer classDeserializer) {
        this.this$0 = classDeserializer;
        super(1);
    }

    @Nullable
    public final ClassDescriptor invoke(@NotNull ClassKey classKey) {
        C2668g.b(classKey, "key");
        return this.this$0.createClass(classKey);
    }
}
