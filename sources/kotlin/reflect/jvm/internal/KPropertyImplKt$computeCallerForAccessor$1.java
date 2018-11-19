package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl.Accessor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"isInsideClassCompanionObject", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class KPropertyImplKt$computeCallerForAccessor$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Accessor receiver$0;

    KPropertyImplKt$computeCallerForAccessor$1(Accessor accessor) {
        this.receiver$0 = accessor;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Boolean.valueOf(invoke());
    }

    /* renamed from: invoke */
    public final boolean m71765invoke() {
        DeclarationDescriptor containingDeclaration = this.receiver$0.getProperty().getDescriptor().getContainingDeclaration();
        if (DescriptorUtils.isCompanionObject(containingDeclaration)) {
            C2668g.a(containingDeclaration, "possibleCompanionObject");
            if (!DescriptorUtils.isInterface(containingDeclaration.getContainingDeclaration())) {
                return true;
            }
        }
        return false;
    }
}
