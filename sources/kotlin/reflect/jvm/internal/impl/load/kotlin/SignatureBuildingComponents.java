package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

public final class SignatureBuildingComponents {
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    @NotNull
    public final String javaLang(@NotNull String str) {
        C2668g.b(str, "name");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java/lang/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @NotNull
    public final String javaUtil(@NotNull String str) {
        C2668g.b(str, "name");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java/util/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @NotNull
    public final String javaFunction(@NotNull String str) {
        C2668g.b(str, "name");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java/util/function/");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @NotNull
    public final LinkedHashSet<String> inJavaLang(@NotNull String str, @NotNull String... strArr) {
        C2668g.b(str, "name");
        C2668g.b(strArr, "signatures");
        return inClass(javaLang(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final LinkedHashSet<String> inJavaUtil(@NotNull String str, @NotNull String... strArr) {
        C2668g.b(str, "name");
        C2668g.b(strArr, "signatures");
        return inClass(javaUtil(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final LinkedHashSet<String> inClass(@NotNull String str, @NotNull String... strArr) {
        C2668g.b(str, "internalName");
        C2668g.b(strArr, "signatures");
        Collection linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".");
            stringBuilder.append(str2);
            linkedHashSet.add(stringBuilder.toString());
        }
        return (LinkedHashSet) linkedHashSet;
    }

    @NotNull
    public final String signature(@NotNull ClassDescriptor classDescriptor, @NotNull String str) {
        C2668g.b(classDescriptor, "classDescriptor");
        C2668g.b(str, "jvmDescriptor");
        return signature(MethodSignatureMappingKt.getInternalName(classDescriptor), str);
    }

    @NotNull
    public final String signature(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "internalName");
        C2668g.b(str2, "jvmDescriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    @NotNull
    public final String jvmDescriptor(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        C2668g.b(str, "name");
        C2668g.b(list, "parameters");
        C2668g.b(str2, "ret");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str);
        stringBuilder.append('(');
        stringBuilder.append(C19299w.m68797a(list, "", null, null, 0, null, (Function1) SignatureBuildingComponents$jvmDescriptor$1.INSTANCE, 30, null));
        stringBuilder.append(')');
        stringBuilder.append(escapeClassName(str2));
        return stringBuilder.toString();
    }

    private final String escapeClassName(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('L');
        stringBuilder.append(str);
        stringBuilder.append(';');
        return stringBuilder.toString();
    }

    @NotNull
    public final String[] constructors(@NotNull String... strArr) {
        C2668g.b(strArr, "signatures");
        Collection arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<init>(");
            stringBuilder.append(str);
            stringBuilder.append(")V");
            arrayList.add(stringBuilder.toString());
        }
        strArr = ((List) arrayList).toArray(new String[0]);
        if (strArr != null) {
            return strArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
