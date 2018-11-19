package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import org.jetbrains.annotations.NotNull;

final class LazyPackageViewDescriptorImpl$memberScope$1 extends Lambda implements Function0<MemberScope> {
    final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.this$0 = lazyPackageViewDescriptorImpl;
        super(0);
    }

    @NotNull
    public final MemberScope invoke() {
        if (this.this$0.getFragments().isEmpty()) {
            return Empty.INSTANCE;
        }
        Iterable<PackageFragmentDescriptor> fragments = this.this$0.getFragments();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) fragments, 10));
        for (PackageFragmentDescriptor memberScope : fragments) {
            arrayList.add(memberScope.getMemberScope());
        }
        List a = C19299w.m68800a((Collection) (List) arrayList, (Object) new SubpackagesScope(this.this$0.getModule(), this.this$0.getFqName()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package view scope for ");
        stringBuilder.append(this.this$0.getFqName());
        stringBuilder.append(" in ");
        stringBuilder.append(this.this$0.getModule().getName());
        return new ChainedMemberScope(stringBuilder.toString(), a);
    }
}
