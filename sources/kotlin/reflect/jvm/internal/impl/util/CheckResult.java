package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public abstract class CheckResult {
    private final boolean isSuccess;

    public static final class IllegalFunctionName extends CheckResult {
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        private IllegalFunctionName() {
            super(false);
        }
    }

    public static final class IllegalSignature extends CheckResult {
        @NotNull
        private final String error;

        public IllegalSignature(@NotNull String str) {
            C2668g.b(str, "error");
            super(false);
            this.error = str;
        }
    }

    public static final class SuccessCheck extends CheckResult {
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        private SuccessCheck() {
            super(true);
        }
    }

    private CheckResult(boolean z) {
        this.isSuccess = z;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
