package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

public interface SourceElement {
    public static final SourceElement NO_SOURCE = new C175681();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement$1 */
    static class C175681 implements SourceElement {
        public String toString() {
            return "NO_SOURCE";
        }

        C175681() {
        }

        @NotNull
        public SourceFile getContainingFile() {
            return SourceFile.NO_SOURCE_FILE;
        }
    }

    @NotNull
    SourceFile getContainingFile();
}
