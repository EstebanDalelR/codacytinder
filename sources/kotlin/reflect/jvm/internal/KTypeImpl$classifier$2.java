package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClassifier;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, k = 3, mv = {1, 1, 10})
final class KTypeImpl$classifier$2 extends Lambda implements Function0<KClassifier> {
    final /* synthetic */ KTypeImpl this$0;

    KTypeImpl$classifier$2(KTypeImpl kTypeImpl) {
        this.this$0 = kTypeImpl;
        super(0);
    }

    @Nullable
    public final KClassifier invoke() {
        return this.this$0.convert(this.this$0.getType());
    }
}
