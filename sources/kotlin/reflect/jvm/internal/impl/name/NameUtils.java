package kotlin.reflect.jvm.internal.impl.name;

import io.fabric.sdk.android.services.events.C15645a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

public final class NameUtils {
    public static final NameUtils INSTANCE = new NameUtils();
    private static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");

    private NameUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String str) {
        C2668g.b(str, "name");
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.m59919a((CharSequence) str, C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
    }
}
