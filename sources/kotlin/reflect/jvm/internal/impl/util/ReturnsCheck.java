package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ReturnsCheck implements Check {
    @NotNull
    private final String description;
    @NotNull
    private final String name;
    @NotNull
    private final Function1<KotlinBuiltIns, KotlinType> type;

    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$1 */
        static final class C191521 extends Lambda implements Function1<KotlinBuiltIns, SimpleType> {
            public static final C191521 INSTANCE = new C191521();

            C191521() {
                super(1);
            }

            @NotNull
            public final SimpleType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                C2668g.b(kotlinBuiltIns, "$receiver");
                kotlinBuiltIns = kotlinBuiltIns.getBooleanType();
                C2668g.a(kotlinBuiltIns, "booleanType");
                return kotlinBuiltIns;
            }
        }

        private ReturnsBoolean() {
            super("Boolean", C191521.INSTANCE);
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$1 */
        static final class C191531 extends Lambda implements Function1<KotlinBuiltIns, SimpleType> {
            public static final C191531 INSTANCE = new C191531();

            C191531() {
                super(1);
            }

            @NotNull
            public final SimpleType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                C2668g.b(kotlinBuiltIns, "$receiver");
                kotlinBuiltIns = kotlinBuiltIns.getIntType();
                C2668g.a(kotlinBuiltIns, "intType");
                return kotlinBuiltIns;
            }
        }

        private ReturnsInt() {
            super("Int", C191531.INSTANCE);
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$1 */
        static final class C191541 extends Lambda implements Function1<KotlinBuiltIns, SimpleType> {
            public static final C191541 INSTANCE = new C191541();

            C191541() {
                super(1);
            }

            @NotNull
            public final SimpleType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                C2668g.b(kotlinBuiltIns, "$receiver");
                kotlinBuiltIns = kotlinBuiltIns.getUnitType();
                C2668g.a(kotlinBuiltIns, "unitType");
                return kotlinBuiltIns;
            }
        }

        private ReturnsUnit() {
            super("Unit", C191541.INSTANCE);
        }
    }

    private ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.name = str;
        this.type = function1;
        str = new StringBuilder();
        str.append("must return ");
        str.append(this.name);
        this.description = str.toString();
    }

    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        return DefaultImpls.invoke(this, functionDescriptor);
    }

    @NotNull
    public String getDescription() {
        return this.description;
    }

    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        return C2668g.a(functionDescriptor.getReturnType(), (KotlinType) this.type.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }
}
