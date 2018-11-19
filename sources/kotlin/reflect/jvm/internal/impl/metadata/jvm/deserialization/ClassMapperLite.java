package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

public final class ClassMapperLite {
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();
    private static final Map<String, String> map;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
        r0.<init>();
        INSTANCE = r0;
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        r0 = (java.util.Map) r0;
        r1 = "Boolean";
        r2 = "Z";
        r3 = "Char";
        r4 = "C";
        r5 = "Byte";
        r6 = "B";
        r7 = "Short";
        r8 = "S";
        r9 = "Int";
        r10 = "I";
        r11 = "Float";
        r12 = "F";
        r13 = "Long";
        r14 = "J";
        r15 = "Double";
        r16 = "D";
        r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16};
        r1 = kotlin.collections.C17554o.m64199b(r1);
        r2 = r1;
        r2 = (java.util.Collection) r2;
        r2 = kotlin.collections.C17554o.m64196a(r2);
        r2 = (kotlin.ranges.C17565a) r2;
        r3 = 2;
        r2 = kotlin.ranges.C18464j.m66923a(r2, r3);
        r3 = r2.m64208a();
        r4 = r2.m64209b();
        r2 = r2.m64210c();
        if (r2 <= 0) goto L_0x0055;
    L_0x0052:
        if (r3 > r4) goto L_0x00b1;
    L_0x0054:
        goto L_0x0057;
    L_0x0055:
        if (r3 < r4) goto L_0x00b1;
    L_0x0057:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "kotlin/";
        r5.append(r6);
        r6 = r1.get(r3);
        r6 = (java.lang.String) r6;
        r5.append(r6);
        r5 = r5.toString();
        r6 = r3 + 1;
        r7 = r1.get(r6);
        r0.put(r5, r7);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = "kotlin/";
        r5.append(r7);
        r7 = r1.get(r3);
        r7 = (java.lang.String) r7;
        r5.append(r7);
        r7 = "Array";
        r5.append(r7);
        r5 = r5.toString();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = 91;
        r7.append(r8);
        r6 = r1.get(r6);
        r6 = (java.lang.String) r6;
        r7.append(r6);
        r6 = r7.toString();
        r0.put(r5, r6);
        if (r3 == r4) goto L_0x00b1;
    L_0x00af:
        r3 = r3 + r2;
        goto L_0x0057;
    L_0x00b1:
        r1 = "kotlin/Unit";
        r2 = "V";
        r0.put(r1, r2);
        r1 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite$map$1$1;
        r1.<init>(r0);
        r2 = "Any";
        r3 = "java/lang/Object";
        r1.invoke(r2, r3);
        r2 = "Nothing";
        r3 = "java/lang/Void";
        r1.invoke(r2, r3);
        r2 = "Annotation";
        r3 = "java/lang/annotation/Annotation";
        r1.invoke(r2, r3);
        r4 = "String";
        r5 = "CharSequence";
        r6 = "Throwable";
        r7 = "Cloneable";
        r8 = "Number";
        r9 = "Comparable";
        r10 = "Enum";
        r2 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10};
        r2 = kotlin.collections.C17554o.m64199b(r2);
        r2 = r2.iterator();
    L_0x00ec:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x010d;
    L_0x00f2:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "java/lang/";
        r4.append(r5);
        r4.append(r3);
        r4 = r4.toString();
        r1.invoke(r3, r4);
        goto L_0x00ec;
    L_0x010d:
        r5 = "Iterator";
        r6 = "Collection";
        r7 = "List";
        r8 = "Set";
        r9 = "Map";
        r10 = "ListIterator";
        r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10};
        r2 = kotlin.collections.C17554o.m64199b(r2);
        r2 = r2.iterator();
    L_0x0125:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x017c;
    L_0x012b:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "collections/";
        r4.append(r5);
        r4.append(r3);
        r4 = r4.toString();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "java/util/";
        r5.append(r6);
        r5.append(r3);
        r5 = r5.toString();
        r1.invoke(r4, r5);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "collections/Mutable";
        r4.append(r5);
        r4.append(r3);
        r4 = r4.toString();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "java/util/";
        r5.append(r6);
        r5.append(r3);
        r3 = r5.toString();
        r1.invoke(r4, r3);
        goto L_0x0125;
    L_0x017c:
        r2 = "collections/Iterable";
        r3 = "java/lang/Iterable";
        r1.invoke(r2, r3);
        r2 = "collections/MutableIterable";
        r3 = "java/lang/Iterable";
        r1.invoke(r2, r3);
        r2 = "collections/Map.Entry";
        r3 = "java/util/Map$Entry";
        r1.invoke(r2, r3);
        r2 = "collections/MutableMap.MutableEntry";
        r3 = "java/util/Map$Entry";
        r1.invoke(r2, r3);
        r2 = 0;
        r3 = 22;
    L_0x019b:
        if (r2 > r3) goto L_0x01db;
    L_0x019d:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Function";
        r4.append(r5);
        r4.append(r2);
        r4 = r4.toString();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "kotlin/jvm/functions/Function";
        r5.append(r6);
        r5.append(r2);
        r5 = r5.toString();
        r1.invoke(r4, r5);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "reflect/KFunction";
        r4.append(r5);
        r4.append(r2);
        r4 = r4.toString();
        r5 = "kotlin/reflect/KFunction";
        r1.invoke(r4, r5);
        r2 = r2 + 1;
        goto L_0x019b;
    L_0x01db:
        r4 = "Char";
        r5 = "Byte";
        r6 = "Short";
        r7 = "Int";
        r8 = "Float";
        r9 = "Long";
        r10 = "Double";
        r11 = "String";
        r12 = "Enum";
        r2 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12};
        r2 = kotlin.collections.C17554o.m64199b(r2);
        r2 = r2.iterator();
    L_0x01f9:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0235;
    L_0x01ff:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "";
        r4.append(r5);
        r4.append(r3);
        r5 = ".Companion";
        r4.append(r5);
        r4 = r4.toString();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "kotlin/jvm/internal/";
        r5.append(r6);
        r5.append(r3);
        r3 = "CompanionObject";
        r5.append(r3);
        r3 = r5.toString();
        r1.invoke(r4, r3);
        goto L_0x01f9;
    L_0x0235:
        map = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.<clinit>():void");
    }

    private ClassMapperLite() {
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String str) {
        C2668g.b(str, "classId");
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('L');
        stringBuilder.append(C19296q.m68670a(str, '.', '$', false, 4, null));
        stringBuilder.append(';');
        return stringBuilder.toString();
    }
}
