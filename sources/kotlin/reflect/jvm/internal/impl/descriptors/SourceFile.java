package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.Nullable;

public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new C175691();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceFile$1 */
    static class C175691 implements SourceFile {
        @Nullable
        public String getName() {
            return null;
        }

        C175691() {
        }
    }

    @Nullable
    String getName();
}
