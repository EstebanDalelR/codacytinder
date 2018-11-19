package kotlin.reflect.jvm.internal.impl.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BuiltInsResourceLoader {
    @Nullable
    public final InputStream loadResource(@NotNull String str) {
        C2668g.b(str, "path");
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
        }
        return ClassLoader.getSystemResourceAsStream(str);
    }
}
