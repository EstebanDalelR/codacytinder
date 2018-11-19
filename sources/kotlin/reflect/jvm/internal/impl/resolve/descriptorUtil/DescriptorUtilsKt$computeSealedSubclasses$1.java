package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import java.util.LinkedHashSet;
import kotlin.C15813i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import org.jetbrains.annotations.NotNull;

final class DescriptorUtilsKt$computeSealedSubclasses$1 extends Lambda implements Function2<MemberScope, Boolean, C15813i> {
    final /* synthetic */ LinkedHashSet $result;
    final /* synthetic */ ClassDescriptor $sealedClass;

    DescriptorUtilsKt$computeSealedSubclasses$1(ClassDescriptor classDescriptor, LinkedHashSet linkedHashSet) {
        this.$sealedClass = classDescriptor;
        this.$result = linkedHashSet;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((MemberScope) obj, ((Boolean) obj2).booleanValue());
        return C15813i.f49016a;
    }

    public final void invoke(@NotNull MemberScope memberScope, boolean z) {
        C2668g.b(memberScope, QueryParams.SCOPE);
        for (DeclarationDescriptor declarationDescriptor : DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
                if (DescriptorUtils.isDirectSubclass(classDescriptor, this.$sealedClass)) {
                    this.$result.add(declarationDescriptor);
                }
                if (z) {
                    DescriptorUtilsKt$computeSealedSubclasses$1 descriptorUtilsKt$computeSealedSubclasses$1 = this;
                    MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
                    C2668g.a(unsubstitutedInnerClassesScope, "descriptor.unsubstitutedInnerClassesScope");
                    invoke(unsubstitutedInnerClassesScope, z);
                }
            }
        }
    }
}
