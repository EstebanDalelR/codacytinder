package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import org.jetbrains.annotations.NotNull;

final class SubstitutingScope$_allDescriptors$2 extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
    final /* synthetic */ SubstitutingScope this$0;

    SubstitutingScope$_allDescriptors$2(SubstitutingScope substitutingScope) {
        this.this$0 = substitutingScope;
        super(0);
    }

    @NotNull
    public final Collection<DeclarationDescriptor> invoke() {
        return this.this$0.substitute(DefaultImpls.getContributedDescriptors$default(this.this$0.workerScope, null, null, 3, null));
    }
}
