package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

final class GivenFunctionsMemberScope$allDescriptors$2 extends Lambda implements Function0<List<? extends DeclarationDescriptor>> {
    final /* synthetic */ GivenFunctionsMemberScope this$0;

    GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.this$0 = givenFunctionsMemberScope;
        super(0);
    }

    @NotNull
    public final List<DeclarationDescriptor> invoke() {
        List computeDeclaredFunctions = this.this$0.computeDeclaredFunctions();
        return C19299w.m68809b((Collection) computeDeclaredFunctions, (Iterable) this.this$0.createFakeOverrides(computeDeclaredFunctions));
    }
}
