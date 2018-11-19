package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.tinder.api.ManagerWebServices;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C15808y;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

public final class JvmNameResolver implements NameResolver {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final List<String> PREDEFINED_STRINGS = C17554o.m64199b((Object[]) new String[]{"kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator"});
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;
    private final Set<Integer> localNameIndices;
    @NotNull
    private final List<Record> records;
    @NotNull
    private final String[] strings;
    @NotNull
    private final StringTableTypes types;

    public static final class Companion {
        private Companion() {
        }
    }

    public JvmNameResolver(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes r4, @org.jetbrains.annotations.NotNull java.lang.String[] r5) {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = "types";
        kotlin.jvm.internal.C2668g.b(r4, r0);
        r0 = "strings";
        kotlin.jvm.internal.C2668g.b(r5, r0);
        r3.<init>();
        r3.types = r4;
        r3.strings = r5;
        r4 = r3.types;
        r4 = r4.getLocalNameList();
        r5 = r4.isEmpty();
        if (r5 == 0) goto L_0x0022;
    L_0x001d:
        r4 = kotlin.collections.am.m64176a();
        goto L_0x0028;
    L_0x0022:
        r4 = (java.lang.Iterable) r4;
        r4 = kotlin.collections.C19299w.m68842n(r4);
    L_0x0028:
        r3.localNameIndices = r4;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = r3.types;
        r5 = r5.getRecordList();
        r0 = r5.size();
        r4.ensureCapacity(r0);
        r5 = r5.iterator();
    L_0x0040:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x005e;
    L_0x0046:
        r0 = r5.next();
        r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r0;
        r1 = "record";
        kotlin.jvm.internal.C2668g.a(r0, r1);
        r1 = r0.getRange();
        r2 = 0;
    L_0x0056:
        if (r2 >= r1) goto L_0x0040;
    L_0x0058:
        r4.add(r0);
        r2 = r2 + 1;
        goto L_0x0056;
    L_0x005e:
        r4.trimToSize();
        r4 = (java.util.List) r4;
        r3.records = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver.<init>(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes, java.lang.String[]):void");
    }

    @NotNull
    public String getString(int i) {
        int size;
        Integer num;
        Record record = (Record) this.records.get(i);
        if (record.hasString()) {
            i = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                size = PREDEFINED_STRINGS.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0) {
                    if (size > predefinedIndex) {
                        i = (String) PREDEFINED_STRINGS.get(record.getPredefinedIndex());
                    }
                }
            }
            i = this.strings[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List substringIndexList = record.getSubstringIndexList();
            Integer num2 = (Integer) substringIndexList.get(0);
            num = (Integer) substringIndexList.get(1);
            C2668g.a(num2, "begin");
            if (C2668g.a(0, num2.intValue()) <= 0) {
                int intValue = num2.intValue();
                C2668g.a(num, "end");
                if (C2668g.a(intValue, num.intValue()) <= 0 && C2668g.a(num.intValue(), i.length()) <= 0) {
                    C2668g.a(i, ManagerWebServices.PARAM_TEASER_STRING);
                    int intValue2 = num2.intValue();
                    size = num.intValue();
                    if (i == 0) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    i = i.substring(intValue2, size);
                    C2668g.a(i, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        String str = i;
        if (record.getReplaceCharCount() >= 2) {
            i = record.getReplaceCharList();
            num = (Integer) i.get(0);
            Integer num3 = (Integer) i.get(1);
            C2668g.a(str, ManagerWebServices.PARAM_TEASER_STRING);
            str = C19296q.m68670a(str, (char) num.intValue(), (char) num3.intValue(), false, 4, null);
        }
        String str2 = str;
        i = record.getOperation();
        if (i == 0) {
            i = Operation.NONE;
        }
        switch (i) {
            case NONE:
                break;
            case INTERNAL_TO_CLASS_ID:
                C2668g.a(str2, ManagerWebServices.PARAM_TEASER_STRING);
                str2 = C19296q.m68670a(str2, '$', '.', false, 4, null);
                break;
            case DESC_TO_CLASS_ID:
                if (str2.length() >= 2) {
                    C2668g.a(str2, ManagerWebServices.PARAM_TEASER_STRING);
                    i = str2.length() - 1;
                    if (str2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    str2 = str2.substring(1, i);
                    C2668g.a(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                String str3 = str2;
                C2668g.a(str3, ManagerWebServices.PARAM_TEASER_STRING);
                str2 = C19296q.m68670a(str3, '$', '.', false, 4, null);
                break;
            default:
                break;
        }
        C2668g.a(str2, ManagerWebServices.PARAM_TEASER_STRING);
        return str2;
    }

    @NotNull
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }

    static {
        Iterable<C15808y> o = C19299w.m68843o(PREDEFINED_STRINGS);
        Map linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(C18457p.m66906a((Iterable) o, 10)), 16));
        for (C15808y c15808y : o) {
            linkedHashMap.put((String) c15808y.m59829b(), Integer.valueOf(c15808y.m59828a()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }
}
