package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends Lambda implements Function1<FqName, Boolean> {
    final /* synthetic */ FqName $fqName;

    PackageFragmentProviderImpl$getSubPackagesOf$2(FqName fqName) {
        this.$fqName = fqName;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((FqName) obj));
    }

    public final boolean invoke(@NotNull FqName fqName) {
        C2668g.b(fqName, "it");
        return (fqName.isRoot() || C2668g.a(fqName.parent(), this.$fqName) == null) ? null : true;
    }
}
