package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1 */
final class C19124x4a767989 extends Lambda implements Function2<List<? extends FqName>, T, T> {
    final /* synthetic */ Annotations $composedAnnotation;

    C19124x4a767989(Annotations annotations) {
        this.$composedAnnotation = annotations;
        super(2);
    }

    @Nullable
    public final <T> T invoke(@NotNull List<FqName> list, @NotNull T t) {
        C2668g.b(list, "$receiver");
        C2668g.b(t, "qualifier");
        Iterable<FqName> iterable = list;
        Object obj = null;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (FqName findAnnotation : iterable) {
                Object obj2;
                if (this.$composedAnnotation.findAnnotation(findAnnotation) != null) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 != null) {
                    obj = 1;
                    break;
                }
            }
        }
        return obj != null ? t : null;
    }
}
