package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 */
final class C19125x4a76798a extends Lambda implements Function2<T, T, T> {
    public static final C19125x4a76798a INSTANCE = new C19125x4a76798a();

    C19125x4a76798a() {
        super(2);
    }

    @Nullable
    public final <T> T invoke(@Nullable T t, @Nullable T t2) {
        if (!(t == null || t2 == null)) {
            if (!C2668g.a(t, t2)) {
                return null;
            }
        }
        return t != null ? t : t2;
    }
}
