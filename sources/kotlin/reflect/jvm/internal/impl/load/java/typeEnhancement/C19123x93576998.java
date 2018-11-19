package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 */
final class C19123x93576998 extends Lambda implements Function1<Integer, JavaTypeQualifiers> {
    final /* synthetic */ TypeEnhancementInfo $predefined$inlined;
    final /* synthetic */ Function1 $qualifiers$inlined;

    C19123x93576998(TypeEnhancementInfo typeEnhancementInfo, Function1 function1) {
        this.$predefined$inlined = typeEnhancementInfo;
        this.$qualifiers$inlined = function1;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final JavaTypeQualifiers invoke(int i) {
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) this.$predefined$inlined.getMap().get(Integer.valueOf(i));
        return javaTypeQualifiers != null ? javaTypeQualifiers : (JavaTypeQualifiers) this.$qualifiers$inlined.invoke(Integer.valueOf(i));
    }
}
