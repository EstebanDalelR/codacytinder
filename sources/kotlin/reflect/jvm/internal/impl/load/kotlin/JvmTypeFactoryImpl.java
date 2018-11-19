package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.C15819j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {
    public static final JvmTypeFactoryImpl INSTANCE = new JvmTypeFactoryImpl();

    private JvmTypeFactoryImpl() {
    }

    @NotNull
    public JvmType boxType(@NotNull JvmType jvmType) {
        C2668g.b(jvmType, "possiblyPrimitiveType");
        if (!(jvmType instanceof Primitive)) {
            return jvmType;
        }
        Primitive primitive = (Primitive) jvmType;
        if (primitive.getJvmPrimitiveType() == null) {
            return jvmType;
        }
        jvmType = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName());
        C2668g.a(jvmType, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String internalName = jvmType.getInternalName();
        C2668g.a(internalName, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return createObjectType(internalName);
    }

    @NotNull
    public JvmType createFromString(@NotNull String str) {
        C2668g.b(str, "representation");
        boolean z = false;
        Object obj = str.length() > 0 ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            throw new AssertionError("empty string as JvmType");
        }
        char charAt = str.charAt(0);
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            if ((jvmPrimitiveType.getDesc().charAt(0) == charAt ? 1 : null) != null) {
                break;
            }
        }
        JvmPrimitiveType jvmPrimitiveType2 = null;
        if (jvmPrimitiveType2 != null) {
            return (JvmType) new Primitive(jvmPrimitiveType2);
        }
        JvmType jvmType;
        if (charAt == 'V') {
            jvmType = (JvmType) new Primitive(null);
        } else if (charAt != '[') {
            if (charAt == 'L' && C19298r.m68766a((CharSequence) str, ';', false, 2, null)) {
                z = true;
            }
            if (!C15819j.f49018a || r1) {
                str = str.substring(1, str.length() - 1);
                C2668g.a(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                jvmType = new Object(str);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Type that is not primitive nor array should be Object, but '");
                stringBuilder.append(str);
                stringBuilder.append("' was found");
                throw new AssertionError(stringBuilder.toString());
            }
        } else {
            str = str.substring(1);
            C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
            jvmType = new Array(createFromString(str));
        }
        return jvmType;
    }

    @NotNull
    public Object createObjectType(@NotNull String str) {
        C2668g.b(str, "internalName");
        return new Object(str);
    }

    @NotNull
    public String toString(@NotNull JvmType jvmType) {
        C2668g.b(jvmType, "type");
        StringBuilder stringBuilder;
        if (jvmType instanceof Array) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(toString(((Array) jvmType).getElementType()));
            return stringBuilder.toString();
        } else if (jvmType instanceof Primitive) {
            jvmType = ((Primitive) jvmType).getJvmPrimitiveType();
            if (jvmType != null) {
                jvmType = jvmType.getDesc();
                if (jvmType != null) {
                    return jvmType;
                }
            }
            return "V";
        } else if (jvmType instanceof Object) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("L");
            stringBuilder.append(((Object) jvmType).getInternalName());
            stringBuilder.append(";");
            return stringBuilder.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public JvmType getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }
}
