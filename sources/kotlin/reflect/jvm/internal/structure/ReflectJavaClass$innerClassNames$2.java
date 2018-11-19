package kotlin.reflect.jvm.internal.structure;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class ReflectJavaClass$innerClassNames$2 extends Lambda implements Function1<Class<?>, Name> {
    public static final ReflectJavaClass$innerClassNames$2 INSTANCE = new ReflectJavaClass$innerClassNames$2();

    ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    @Nullable
    public final Name invoke(Class<?> cls) {
        C2668g.a(cls, "it");
        cls = cls.getSimpleName();
        if (!Name.isValidIdentifier(cls)) {
            cls = null;
        }
        return cls != null ? Name.identifier(cls) : null;
    }
}
