package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "kotlin/reflect/jvm/internal/KTypeParameterImpl$upperBounds$2$1$1"}, k = 3, mv = {1, 1, 10})
final class KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1 extends Lambda implements Function0 {
    final /* synthetic */ KTypeParameterImpl$upperBounds$2 this$0;

    KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1(KTypeParameterImpl$upperBounds$2 kTypeParameterImpl$upperBounds$2) {
        this.this$0 = kTypeParameterImpl$upperBounds$2;
        super(0);
    }

    @NotNull
    public final Void invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java type is not yet supported for type parameters: ");
        stringBuilder.append(this.this$0.this$0.getDescriptor());
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("An operation is not implemented: ");
        stringBuilder3.append(stringBuilder2);
        throw new NotImplementedError(stringBuilder3.toString());
    }
}
