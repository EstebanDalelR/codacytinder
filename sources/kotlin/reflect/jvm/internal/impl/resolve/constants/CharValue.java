package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c) {
        super(Character.valueOf(c));
    }

    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        return moduleDescriptor.getBuiltIns().getCharType();
    }

    @NotNull
    public String toString() {
        Object[] objArr = new Object[]{Integer.valueOf(((Character) getValue()).charValue()), getPrintablePart(((Character) getValue()).charValue())};
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, objArr.length));
        C2668g.a(format, "java.lang.String.format(this, *args)");
        return format;
    }

    private final String getPrintablePart(char c) {
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
            default:
                c = isPrintableUnicode(c) ? Character.toString(c) : "?";
                C2668g.a(c, "if (isPrintableUnicode(c…cter.toString(c) else \"?\"");
                return c;
        }
    }

    private final boolean isPrintableUnicode(char c) {
        c = (byte) Character.getType(c);
        return (c == '\u0000' || c == '\r' || c == '\u000e' || c == '\u000f' || c == '\u0010' || c == '\u0012' || c == '\u0013') ? false : true;
    }
}
