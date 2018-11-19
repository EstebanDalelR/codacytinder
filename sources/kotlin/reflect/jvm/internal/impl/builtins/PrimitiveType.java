package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Set<PrimitiveType> NUMBER_TYPES = null;
    private FqName arrayTypeFqName;
    private final Name arrayTypeName;
    private FqName typeFqName;
    private final Name typeName;

    static {
        NUMBER_TYPES = Collections.unmodifiableSet(EnumSet.of(CHAR, new PrimitiveType[]{BYTE, SHORT, INT, FLOAT, LONG, DOUBLE}));
    }

    private PrimitiveType(String str) {
        this.typeFqName = null;
        this.arrayTypeFqName = null;
        this.typeName = Name.identifier(str);
        r1 = new StringBuilder();
        r1.append(str);
        r1.append("Array");
        this.arrayTypeName = Name.identifier(r1.toString());
    }

    @NotNull
    public Name getTypeName() {
        return this.typeName;
    }

    @NotNull
    public Name getArrayTypeName() {
        return this.arrayTypeName;
    }
}
