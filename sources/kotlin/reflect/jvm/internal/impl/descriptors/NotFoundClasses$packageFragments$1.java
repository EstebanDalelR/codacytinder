package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

final class NotFoundClasses$packageFragments$1 extends Lambda implements Function1<FqName, EmptyPackageFragmentDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    NotFoundClasses$packageFragments$1(NotFoundClasses notFoundClasses) {
        this.this$0 = notFoundClasses;
        super(1);
    }

    @NotNull
    public final EmptyPackageFragmentDescriptor invoke(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return new EmptyPackageFragmentDescriptor(this.this$0.module, fqName);
    }
}
