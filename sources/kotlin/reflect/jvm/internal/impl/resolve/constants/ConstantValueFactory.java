package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C19066k;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ConstantValueFactory {
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    @NotNull
    public final ArrayValue createArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull KotlinType kotlinType) {
        C2668g.b(list, "value");
        C2668g.b(kotlinType, "type");
        return new ArrayValue(list, new ConstantValueFactory$createArrayValue$1(kotlinType));
    }

    @Nullable
    public final ConstantValue<?> createConstantValue(@Nullable Object obj) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            return createArrayValue(C19066k.m67970a((byte[]) obj), PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return createArrayValue(C19066k.m67976a((short[]) obj), PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(C19066k.m68002e((int[]) obj), PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(C19066k.m67973a((long[]) obj), PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return createArrayValue(C19066k.m67986b((char[]) obj), PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return createArrayValue(C19066k.m67972a((float[]) obj), PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return createArrayValue(C19066k.m67971a((double[]) obj), PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return createArrayValue(C19066k.m67977a((boolean[]) obj), PrimitiveType.BOOLEAN);
        }
        return obj == null ? (ConstantValue) new NullValue() : null;
    }

    private final ArrayValue createArrayValue(List<?> list, PrimitiveType primitiveType) {
        Collection arrayList = new ArrayList();
        for (Object createConstantValue : C19299w.m68840l(list)) {
            ConstantValue createConstantValue2 = createConstantValue(createConstantValue);
            if (createConstantValue2 != null) {
                arrayList.add(createConstantValue2);
            }
        }
        return new ArrayValue((List) arrayList, (Function1) new ConstantValueFactory$createArrayValue$3(primitiveType));
    }
}
