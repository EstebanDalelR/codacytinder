package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");
    
    private static final Map<String, JvmPrimitiveType> TYPE_BY_NAME = null;
    private static final Map<PrimitiveType, JvmPrimitiveType> TYPE_BY_PRIMITIVE_TYPE = null;
    private static final Set<FqName> WRAPPERS_CLASS_NAMES = null;
    private final String desc;
    private final String name;
    private final PrimitiveType primitiveType;
    private final FqName wrapperFqName;

    static {
        WRAPPERS_CLASS_NAMES = new HashSet();
        TYPE_BY_NAME = new HashMap();
        TYPE_BY_PRIMITIVE_TYPE = new EnumMap(PrimitiveType.class);
        JvmPrimitiveType[] values = values();
        int length = values.length;
        int i;
        while (i < length) {
            JvmPrimitiveType jvmPrimitiveType = values[i];
            WRAPPERS_CLASS_NAMES.add(jvmPrimitiveType.getWrapperFqName());
            TYPE_BY_NAME.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            TYPE_BY_PRIMITIVE_TYPE.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            i++;
        }
    }

    @NotNull
    public static JvmPrimitiveType get(@NotNull String str) {
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) TYPE_BY_NAME.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Non-primitive type name passed: ");
        stringBuilder.append(str);
        throw new AssertionError(stringBuilder.toString());
    }

    @NotNull
    public static JvmPrimitiveType get(@NotNull PrimitiveType primitiveType) {
        return (JvmPrimitiveType) TYPE_BY_PRIMITIVE_TYPE.get(primitiveType);
    }

    private JvmPrimitiveType(PrimitiveType primitiveType, String str, @NotNull String str2, @NotNull String str3) {
        this.primitiveType = primitiveType;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new FqName(str3);
    }

    @NotNull
    public PrimitiveType getPrimitiveType() {
        return this.primitiveType;
    }

    @NotNull
    public String getJavaKeywordName() {
        return this.name;
    }

    @NotNull
    public String getDesc() {
        return this.desc;
    }

    @NotNull
    public FqName getWrapperFqName() {
        return this.wrapperFqName;
    }
}
