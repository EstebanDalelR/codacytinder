package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C15811g;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BuiltinMethodsWithDifferentJvmName {
    public static final BuiltinMethodsWithDifferentJvmName INSTANCE = new BuiltinMethodsWithDifferentJvmName();
    private static final Map<Name, List<Name>> JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    private static final Map<NameAndSignature, Name> NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
    @NotNull
    private static final List<Name> ORIGINAL_SHORT_NAMES;
    private static final NameAndSignature REMOVE_AT_NAME_AND_SIGNATURE;
    private static final Map<String, Name> SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    static {
        String desc = JvmPrimitiveType.INT.getDesc();
        C2668g.a(desc, "JvmPrimitiveType.INT.desc");
        REMOVE_AT_NAME_AND_SIGNATURE = SpecialBuiltinMembers.method("java/util/List", "removeAt", desc, "Ljava/lang/Object;");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Pair[] pairArr = new Pair[8];
        String desc2 = JvmPrimitiveType.BYTE.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.BYTE.desc");
        pairArr[0] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaLang("Number"), "toByte", "", desc2), Name.identifier("byteValue"));
        desc2 = JvmPrimitiveType.SHORT.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.SHORT.desc");
        pairArr[1] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaLang("Number"), "toShort", "", desc2), Name.identifier("shortValue"));
        desc2 = JvmPrimitiveType.INT.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.INT.desc");
        pairArr[2] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaLang("Number"), "toInt", "", desc2), Name.identifier("intValue"));
        desc2 = JvmPrimitiveType.LONG.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.LONG.desc");
        pairArr[3] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaLang("Number"), "toLong", "", desc2), Name.identifier("longValue"));
        desc2 = JvmPrimitiveType.FLOAT.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.FLOAT.desc");
        pairArr[4] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaLang("Number"), "toFloat", "", desc2), Name.identifier("floatValue"));
        desc2 = JvmPrimitiveType.DOUBLE.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.DOUBLE.desc");
        pairArr[5] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaLang("Number"), "toDouble", "", desc2), Name.identifier("doubleValue"));
        pairArr[6] = C15811g.m59834a(REMOVE_AT_NAME_AND_SIGNATURE, Name.identifier("remove"));
        String desc3 = JvmPrimitiveType.INT.getDesc();
        C2668g.a(desc3, "JvmPrimitiveType.INT.desc");
        String desc4 = JvmPrimitiveType.CHAR.getDesc();
        C2668g.a(desc4, "JvmPrimitiveType.CHAR.desc");
        pairArr[7] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaLang("CharSequence"), "get", desc3, desc4), Name.identifier("charAt"));
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = ah.m66889a(pairArr);
        Map map = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
        Map linkedHashMap = new LinkedHashMap(ah.m66883a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap;
        Iterable<NameAndSignature> keySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) keySet, 10));
        for (NameAndSignature name : keySet) {
            arrayList.add(name.getName());
        }
        ORIGINAL_SHORT_NAMES = (List) arrayList;
        Iterable<Entry> entrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        arrayList = new ArrayList(C18457p.m66906a((Iterable) entrySet, 10));
        for (Entry entry2 : entrySet) {
            arrayList.add(new Pair(((NameAndSignature) entry2.getKey()).getName(), entry2.getValue()));
        }
        map = new LinkedHashMap();
        for (Pair pair : (List) arrayList) {
            Name name2 = (Name) pair.m59804b();
            ArrayList arrayList2 = map.get(name2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(name2, arrayList2);
            }
            arrayList2.add((Name) pair.m59803a());
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = map;
    }

    private BuiltinMethodsWithDifferentJvmName() {
    }

    @NotNull
    public final List<Name> getORIGINAL_SHORT_NAMES() {
        return ORIGINAL_SHORT_NAMES;
    }

    public final boolean getSameAsRenamedInJvmBuiltin(@NotNull Name name) {
        C2668g.b(name, "$receiver");
        return ORIGINAL_SHORT_NAMES.contains(name);
    }

    @Nullable
    public final Name getJvmName(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        C2668g.b(simpleFunctionDescriptor, "functionDescriptor");
        Map map = SIGNATURE_TO_JVM_REPRESENTATION_NAME;
        simpleFunctionDescriptor = MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor);
        return simpleFunctionDescriptor != null ? (Name) map.get(simpleFunctionDescriptor) : null;
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        C2668g.b(simpleFunctionDescriptor, "functionDescriptor");
        return KotlinBuiltIns.isBuiltIn((DeclarationDescriptor) simpleFunctionDescriptor) && DescriptorUtilsKt.firstOverridden$default(simpleFunctionDescriptor, false, new C19085x6ce919c0(simpleFunctionDescriptor), 1, null) != null;
    }

    @NotNull
    public final List<Name> getBuiltinFunctionNamesByJvmName(@NotNull Name name) {
        C2668g.b(name, "name");
        List list = (List) JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP.get(name);
        return list != null ? list : C17554o.m64195a();
    }

    public final boolean isRemoveAtByIndex(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        C2668g.b(simpleFunctionDescriptor, "$receiver");
        return (!C2668g.a(simpleFunctionDescriptor.getName().asString(), "removeAt") || C2668g.a(MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor), REMOVE_AT_NAME_AND_SIGNATURE.getSignature()) == null) ? null : true;
    }
}
