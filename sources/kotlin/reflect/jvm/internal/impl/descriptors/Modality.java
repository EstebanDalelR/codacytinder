package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

public enum Modality {
    ;
    
    public static final Companion Companion = null;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Modality convertFromFlags(boolean z, boolean z2) {
            if (z) {
                return Modality.ABSTRACT;
            }
            if (z2) {
                return Modality.OPEN;
            }
            return Modality.FINAL;
        }
    }

    static {
        Companion = new Companion();
    }
}
