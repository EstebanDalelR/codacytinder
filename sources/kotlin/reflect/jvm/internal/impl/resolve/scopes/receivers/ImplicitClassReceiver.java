package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {
    @NotNull
    private final ClassDescriptor classDescriptor;
    @NotNull
    private final ClassDescriptor declarationDescriptor = this.classDescriptor;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        this.classDescriptor = classDescriptor;
    }

    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    @NotNull
    public SimpleType getType() {
        return this.classDescriptor.getDefaultType();
    }

    public boolean equals(@Nullable Object obj) {
        ClassDescriptor classDescriptor = this.classDescriptor;
        Object obj2 = null;
        if (!(obj instanceof ImplicitClassReceiver)) {
            obj = null;
        }
        ImplicitClassReceiver implicitClassReceiver = (ImplicitClassReceiver) obj;
        if (implicitClassReceiver != null) {
            obj2 = implicitClassReceiver.classDescriptor;
        }
        return C2668g.a(classDescriptor, obj2);
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class{");
        stringBuilder.append(getType());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
