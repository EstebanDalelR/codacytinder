package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "T", "invoke"}, k = 3, mv = {1, 1, 10})
final class KClassImpl$Data$nestedClasses$2 extends Lambda implements Function0<List<? extends KClassImpl<? extends Object>>> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$nestedClasses$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    @NotNull
    public final List<KClassImpl<? extends Object>> invoke() {
        Collection arrayList = new ArrayList();
        for (Object next : DefaultImpls.getContributedDescriptors$default(this.this$0.getDescriptor().getUnsubstitutedInnerClassesScope(), null, null, 3, null)) {
            if (!DescriptorUtils.isEnumEntry((DeclarationDescriptor) next)) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : (List) arrayList) {
            if (declarationDescriptor == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            Class toJavaClass = UtilKt.toJavaClass((ClassDescriptor) declarationDescriptor);
            Object kClassImpl = toJavaClass != null ? new KClassImpl(toJavaClass) : null;
            if (kClassImpl != null) {
                arrayList2.add(kClassImpl);
            }
        }
        return (List) arrayList2;
    }
}
