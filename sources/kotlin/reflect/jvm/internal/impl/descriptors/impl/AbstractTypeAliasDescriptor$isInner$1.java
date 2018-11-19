package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

final class AbstractTypeAliasDescriptor$isInner$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.this$0 = abstractTypeAliasDescriptor;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((UnwrappedType) obj));
    }

    public final boolean invoke(UnwrappedType unwrappedType) {
        C2668g.a(unwrappedType, "type");
        if (KotlinTypeKt.isError(unwrappedType)) {
            return false;
        }
        AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this.this$0;
        unwrappedType = unwrappedType.getConstructor().getDeclarationDescriptor();
        unwrappedType = (!(unwrappedType instanceof TypeParameterDescriptor) || (C2668g.a(((TypeParameterDescriptor) unwrappedType).getContainingDeclaration(), this.this$0) ^ 1) == null) ? null : true;
        if (unwrappedType != null) {
            return true;
        }
        return false;
    }
}
