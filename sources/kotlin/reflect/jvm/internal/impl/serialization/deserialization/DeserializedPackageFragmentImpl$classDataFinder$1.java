package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements Function1<ClassId, SourceElement> {
    final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.this$0 = deserializedPackageFragmentImpl;
        super(1);
    }

    @NotNull
    public final SourceElement invoke(@NotNull ClassId classId) {
        C2668g.b(classId, "it");
        classId = this.this$0.containerSource;
        if (classId != null) {
            return (SourceElement) classId;
        }
        classId = SourceElement.NO_SOURCE;
        C2668g.a(classId, "SourceElement.NO_SOURCE");
        return classId;
    }
}
