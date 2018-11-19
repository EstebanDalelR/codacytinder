package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C15811g;
import kotlin.Pair;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BuiltinMethodsWithSpecialGenericSignature {
    @NotNull
    private static final List<String> ERASED_COLLECTION_PARAMETER_NAMES;
    private static final List<NameAndSignature> ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
    private static final List<String> ERASED_COLLECTION_PARAMETER_SIGNATURES;
    private static final Set<Name> ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    @NotNull
    private static final Set<String> ERASED_VALUE_PARAMETERS_SIGNATURES;
    private static final Map<NameAndSignature, TypeSafeBarrierDescription> GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
    public static final BuiltinMethodsWithSpecialGenericSignature INSTANCE = new BuiltinMethodsWithSpecialGenericSignature();
    private static final Map<String, TypeSafeBarrierDescription> SIGNATURE_TO_DEFAULT_VALUES_MAP;

    public enum SpecialSignatureInfo {
        ;
        
        private final boolean isObjectReplacedWithTypeParameter;
        @Nullable
        private final String valueParametersSignature;

        protected SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    public enum TypeSafeBarrierDescription {
        ;
        
        @Nullable
        private final Object defaultValue;

        static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            MAP_GET_OR_DEFAULT(String str, int i) {
                super(str, i, null);
            }
        }

        protected TypeSafeBarrierDescription(Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        String desc;
        Iterable<String> a = am.m64178a((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) a, 10));
        for (String access$method : a) {
            desc = JvmPrimitiveType.BOOLEAN.getDesc();
            C2668g.a(desc, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(SpecialBuiltinMembers.method("java/util/Collection", access$method, "Ljava/util/Collection;", desc));
        }
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = (List) arrayList;
        Iterable<NameAndSignature> iterable = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (NameAndSignature signature : iterable) {
            arrayList.add(signature.getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = (List) arrayList;
        iterable = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (NameAndSignature signature2 : iterable) {
            arrayList.add(signature2.getName().asString());
        }
        ERASED_COLLECTION_PARAMETER_NAMES = (List) arrayList;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Pair[] pairArr = new Pair[10];
        String desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.BOOLEAN.desc");
        pairArr[0] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Collection"), "contains", "Ljava/lang/Object;", desc2), TypeSafeBarrierDescription.FALSE);
        desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.BOOLEAN.desc");
        pairArr[1] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Collection"), "remove", "Ljava/lang/Object;", desc2), TypeSafeBarrierDescription.FALSE);
        desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.BOOLEAN.desc");
        pairArr[2] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "containsKey", "Ljava/lang/Object;", desc2), TypeSafeBarrierDescription.FALSE);
        desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.BOOLEAN.desc");
        pairArr[3] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "containsValue", "Ljava/lang/Object;", desc2), TypeSafeBarrierDescription.FALSE);
        desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.BOOLEAN.desc");
        pairArr[4] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc2), TypeSafeBarrierDescription.FALSE);
        pairArr[5] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        pairArr[6] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.NULL);
        pairArr[7] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.NULL);
        desc2 = JvmPrimitiveType.INT.getDesc();
        C2668g.a(desc2, "JvmPrimitiveType.INT.desc");
        pairArr[8] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("List"), "indexOf", "Ljava/lang/Object;", desc2), TypeSafeBarrierDescription.INDEX);
        desc = JvmPrimitiveType.INT.getDesc();
        C2668g.a(desc, "JvmPrimitiveType.INT.desc");
        pairArr[9] = C15811g.m59834a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("List"), "lastIndexOf", "Ljava/lang/Object;", desc), TypeSafeBarrierDescription.INDEX);
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = ah.m66889a(pairArr);
        Map map = GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
        Map linkedHashMap = new LinkedHashMap(ah.m66883a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        iterable = an.m66899a(GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), (Iterable) ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (NameAndSignature name : iterable) {
            arrayList.add(name.getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = C19299w.m68842n((List) arrayList);
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (NameAndSignature signature3 : iterable) {
            arrayList.add(signature3.getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = C19299w.m68842n((List) arrayList);
    }

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    private final boolean getHasErasedValueParametersInJava(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        return C19299w.m68802a((Iterable) ERASED_VALUE_PARAMETERS_SIGNATURES, (Object) MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor));
    }

    @JvmStatic
    @Nullable
    public static final FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        Name name = functionDescriptor.getName();
        C2668g.a(name, "functionDescriptor.name");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, C19086x3e04c33b.INSTANCE, 1, null);
        }
        return null;
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(@NotNull Name name) {
        C2668g.b(name, "$receiver");
        return ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(name);
    }

    @JvmStatic
    @Nullable
    public static final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        if (!ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(callableMemberDescriptor.getName())) {
            return null;
        }
        callableMemberDescriptor = DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor, false, C19087xdb572182.INSTANCE, 1, null);
        if (callableMemberDescriptor != null) {
            callableMemberDescriptor = MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor);
            if (callableMemberDescriptor != null) {
                if (ERASED_COLLECTION_PARAMETER_SIGNATURES.contains(callableMemberDescriptor)) {
                    return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
                }
                callableMemberDescriptor = SIGNATURE_TO_DEFAULT_VALUES_MAP.get(callableMemberDescriptor);
                if (callableMemberDescriptor == null) {
                    C2668g.a();
                }
                if (((TypeSafeBarrierDescription) callableMemberDescriptor) == TypeSafeBarrierDescription.NULL) {
                    callableMemberDescriptor = SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
                } else {
                    callableMemberDescriptor = SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                }
                return callableMemberDescriptor;
            }
        }
        return null;
    }
}
