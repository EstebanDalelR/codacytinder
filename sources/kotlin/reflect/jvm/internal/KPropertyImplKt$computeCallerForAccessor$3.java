package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl.Accessor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"isNotNullProperty", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class KPropertyImplKt$computeCallerForAccessor$3 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Accessor receiver$0;

    KPropertyImplKt$computeCallerForAccessor$3(Accessor accessor) {
        this.receiver$0 = accessor;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Boolean.valueOf(invoke());
    }

    /* renamed from: invoke */
    public final boolean m71763invoke() {
        return TypeUtils.isNullableType(this.receiver$0.getProperty().getDescriptor().getType()) ^ 1;
    }
}
