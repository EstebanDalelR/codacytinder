package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class SignatureBuildingComponents$jvmDescriptor$1 extends Lambda implements Function1<String, String> {
    public static final SignatureBuildingComponents$jvmDescriptor$1 INSTANCE = new SignatureBuildingComponents$jvmDescriptor$1();

    SignatureBuildingComponents$jvmDescriptor$1() {
        super(1);
    }

    @NotNull
    public final String invoke(@NotNull String str) {
        C2668g.b(str, "it");
        return SignatureBuildingComponents.INSTANCE.escapeClassName(str);
    }
}
