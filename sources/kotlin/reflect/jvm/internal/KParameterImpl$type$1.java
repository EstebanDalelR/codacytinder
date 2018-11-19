package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 1, 10})
final class KParameterImpl$type$1 extends Lambda implements Function0<Type> {
    final /* synthetic */ KParameterImpl this$0;

    KParameterImpl$type$1(KParameterImpl kParameterImpl) {
        this.this$0 = kParameterImpl;
        super(0);
    }

    @NotNull
    public final Type invoke() {
        return (Type) this.this$0.getCallable().getCaller().getParameterTypes().get(this.this$0.getIndex());
    }
}
