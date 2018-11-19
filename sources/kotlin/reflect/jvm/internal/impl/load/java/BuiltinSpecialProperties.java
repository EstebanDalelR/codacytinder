package kotlin.reflect.jvm.internal.impl.load.java;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C15811g;
import kotlin.C15819j;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BuiltinSpecialProperties {
    private static final Map<Name, List<Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();
    @NotNull
    private static final Map<FqName, Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    private static final Set<FqName> SPECIAL_FQ_NAMES = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
    @NotNull
    private static final Set<Name> SPECIAL_SHORT_NAMES;

    static {
        Pair[] pairArr = new Pair[8];
        FqNameUnsafe fqNameUnsafe = KotlinBuiltIns.FQ_NAMES._enum;
        C2668g.a(fqNameUnsafe, "BUILTIN_NAMES._enum");
        pairArr[0] = C15811g.m59834a(SpecialBuiltinMembers.childSafe(fqNameUnsafe, "name"), Name.identifier("name"));
        fqNameUnsafe = KotlinBuiltIns.FQ_NAMES._enum;
        C2668g.a(fqNameUnsafe, "BUILTIN_NAMES._enum");
        pairArr[1] = C15811g.m59834a(SpecialBuiltinMembers.childSafe(fqNameUnsafe, "ordinal"), Name.identifier("ordinal"));
        FqName fqName = KotlinBuiltIns.FQ_NAMES.collection;
        C2668g.a(fqName, "BUILTIN_NAMES.collection");
        pairArr[2] = C15811g.m59834a(SpecialBuiltinMembers.child(fqName, ManagerWebServices.PARAM_SIZE), Name.identifier(ManagerWebServices.PARAM_SIZE));
        fqName = KotlinBuiltIns.FQ_NAMES.map;
        C2668g.a(fqName, "BUILTIN_NAMES.map");
        pairArr[3] = C15811g.m59834a(SpecialBuiltinMembers.child(fqName, ManagerWebServices.PARAM_SIZE), Name.identifier(ManagerWebServices.PARAM_SIZE));
        fqNameUnsafe = KotlinBuiltIns.FQ_NAMES.charSequence;
        C2668g.a(fqNameUnsafe, "BUILTIN_NAMES.charSequence");
        pairArr[4] = C15811g.m59834a(SpecialBuiltinMembers.childSafe(fqNameUnsafe, "length"), Name.identifier("length"));
        fqName = KotlinBuiltIns.FQ_NAMES.map;
        C2668g.a(fqName, "BUILTIN_NAMES.map");
        pairArr[5] = C15811g.m59834a(SpecialBuiltinMembers.child(fqName, "keys"), Name.identifier("keySet"));
        fqName = KotlinBuiltIns.FQ_NAMES.map;
        C2668g.a(fqName, "BUILTIN_NAMES.map");
        pairArr[6] = C15811g.m59834a(SpecialBuiltinMembers.child(fqName, "values"), Name.identifier("values"));
        fqName = KotlinBuiltIns.FQ_NAMES.map;
        C2668g.a(fqName, "BUILTIN_NAMES.map");
        pairArr[7] = C15811g.m59834a(SpecialBuiltinMembers.child(fqName, "entries"), Name.identifier("entrySet"));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = ah.m66889a(pairArr);
        Iterable<Entry> entrySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.entrySet();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) entrySet, 10));
        for (Entry entry : entrySet) {
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Pair pair : (List) arrayList) {
            Name name = (Name) pair.m59804b();
            ArrayList arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            arrayList2.add((Name) pair.m59803a());
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap;
        Iterable<FqName> iterable = SPECIAL_FQ_NAMES;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (FqName shortName : iterable) {
            arrayList.add(shortName.shortName());
        }
        SPECIAL_SHORT_NAMES = C19299w.m68842n((List) arrayList);
    }

    private BuiltinSpecialProperties() {
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES$descriptors_jvm() {
        return SPECIAL_SHORT_NAMES;
    }

    public final boolean hasBuiltinSpecialPropertyFqName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "callableMemberDescriptor");
        if (SPECIAL_SHORT_NAMES.contains(callableMemberDescriptor.getName())) {
            return hasBuiltinSpecialPropertyFqNameImpl(callableMemberDescriptor);
        }
        return null;
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (C19299w.m68802a((Iterable) SPECIAL_FQ_NAMES, (Object) DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor)) && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        boolean z = false;
        if (!KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
            return false;
        }
        callableMemberDescriptor = callableMemberDescriptor.getOverriddenDescriptors();
        C2668g.a(callableMemberDescriptor, "overriddenDescriptors");
        Iterable<CallableMemberDescriptor> iterable = (Iterable) callableMemberDescriptor;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (CallableMemberDescriptor callableMemberDescriptor2 : iterable) {
                BuiltinSpecialProperties builtinSpecialProperties = INSTANCE;
                C2668g.a(callableMemberDescriptor2, "it");
                if (builtinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor2)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name) {
        C2668g.b(name, "name1");
        List list = (List) GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name);
        return list != null ? list : C17554o.m64195a();
    }

    @Nullable
    public final String getBuiltinSpecialPropertyGetterName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        boolean isBuiltIn = KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        if (!C15819j.f49018a || isBuiltIn) {
            String str = null;
            callableMemberDescriptor = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, C19088xbe16cae4.INSTANCE, 1, null);
            if (callableMemberDescriptor == null) {
                return null;
            }
            Name name = (Name) PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.get(DescriptorUtilsKt.getFqNameSafe(callableMemberDescriptor));
            if (name != null) {
                str = name.asString();
            }
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This method is defined only for builtin members, but ");
        stringBuilder.append(callableMemberDescriptor);
        stringBuilder.append(" found");
        throw new AssertionError(stringBuilder.toString());
    }
}
