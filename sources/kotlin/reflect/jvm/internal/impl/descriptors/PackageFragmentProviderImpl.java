package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.C19155k;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

public final class PackageFragmentProviderImpl implements PackageFragmentProvider {
    private final Collection<PackageFragmentDescriptor> packageFragments;

    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> collection) {
        C2668g.b(collection, "packageFragments");
        this.packageFragments = collection;
    }

    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        Collection arrayList = new ArrayList();
        for (Object next : this.packageFragments) {
            if (C2668g.a(((PackageFragmentDescriptor) next).getFqName(), fqName)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(fqName, "fqName");
        C2668g.b(function1, "nameFilter");
        return C19155k.m68033f(C19155k.m68024a((Sequence) C19155k.m68032e(C19299w.m68846r((Iterable) this.packageFragments), PackageFragmentProviderImpl$getSubPackagesOf$1.INSTANCE), (Function1) new PackageFragmentProviderImpl$getSubPackagesOf$2(fqName)));
    }
}
