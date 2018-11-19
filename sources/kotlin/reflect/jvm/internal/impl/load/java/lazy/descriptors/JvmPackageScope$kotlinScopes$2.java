package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

final class JvmPackageScope$kotlinScopes$2 extends Lambda implements Function0<List<? extends MemberScope>> {
    final /* synthetic */ JvmPackageScope this$0;

    JvmPackageScope$kotlinScopes$2(JvmPackageScope jvmPackageScope) {
        this.this$0 = jvmPackageScope;
        super(0);
    }

    @NotNull
    public final List<MemberScope> invoke() {
        Collection arrayList = new ArrayList();
        for (KotlinJvmBinaryClass createKotlinPackagePartScope : this.this$0.packageFragment.getBinaryClasses$descriptors_jvm().values()) {
            MemberScope createKotlinPackagePartScope2 = this.this$0.f57767c.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(this.this$0.packageFragment, createKotlinPackagePartScope);
            if (createKotlinPackagePartScope2 != null) {
                arrayList.add(createKotlinPackagePartScope2);
            }
        }
        return C19299w.m68840l((List) arrayList);
    }
}
