package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C15813i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public abstract class ErrorValue extends ConstantValue<C15813i> {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final ErrorValue create(@NotNull String str) {
            C2668g.b(str, "message");
            return new ErrorValueWithMessage(str);
        }
    }

    public static final class ErrorValueWithMessage extends ErrorValue {
        @NotNull
        private final String message;

        public ErrorValueWithMessage(@NotNull String str) {
            C2668g.b(str, "message");
            this.message = str;
        }

        @NotNull
        public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
            C2668g.b(moduleDescriptor, "module");
            return ErrorUtils.createErrorType(this.message);
        }

        @NotNull
        public String toString() {
            return this.message;
        }
    }

    public ErrorValue() {
        super(C15813i.f49016a);
    }

    @NotNull
    public C15813i getValue() {
        throw new UnsupportedOperationException();
    }
}
