package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorKindFilter {
    @NotNull
    @JvmField
    public static final DescriptorKindFilter ALL = new DescriptorKindFilter(ALL_KINDS_MASK, null, 2, null);
    private static final int ALL_KINDS_MASK = (Companion.nextMask() - 1);
    @NotNull
    @JvmField
    public static final DescriptorKindFilter CALLABLES = new DescriptorKindFilter(CALLABLES_MASK, null, 2, null);
    private static final int CALLABLES_MASK = (FUNCTIONS_MASK | VARIABLES_MASK);
    @NotNull
    @JvmField
    public static final DescriptorKindFilter CLASSIFIERS = new DescriptorKindFilter(CLASSIFIERS_MASK, null, 2, null);
    private static final int CLASSIFIERS_MASK = ((NON_SINGLETON_CLASSIFIERS_MASK | SINGLETON_CLASSIFIERS_MASK) | TYPE_ALIASES_MASK);
    public static final Companion Companion = new Companion();
    private static final List<MaskToName> DEBUG_MASK_BIT_NAMES;
    private static final List<MaskToName> DEBUG_PREDEFINED_FILTERS_MASK_NAMES;
    @NotNull
    @JvmField
    public static final DescriptorKindFilter FUNCTIONS = new DescriptorKindFilter(FUNCTIONS_MASK, null, 2, null);
    private static final int FUNCTIONS_MASK = Companion.nextMask();
    @NotNull
    @JvmField
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(NON_SINGLETON_CLASSIFIERS_MASK, null, 2, null);
    private static final int NON_SINGLETON_CLASSIFIERS_MASK = Companion.nextMask();
    @NotNull
    @JvmField
    public static final DescriptorKindFilter PACKAGES = new DescriptorKindFilter(PACKAGES_MASK, null, 2, null);
    private static final int PACKAGES_MASK = Companion.nextMask();
    @NotNull
    @JvmField
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS = new DescriptorKindFilter(SINGLETON_CLASSIFIERS_MASK, null, 2, null);
    private static final int SINGLETON_CLASSIFIERS_MASK = Companion.nextMask();
    @NotNull
    @JvmField
    public static final DescriptorKindFilter TYPE_ALIASES = new DescriptorKindFilter(TYPE_ALIASES_MASK, null, 2, null);
    private static final int TYPE_ALIASES_MASK = Companion.nextMask();
    @NotNull
    @JvmField
    public static final DescriptorKindFilter VALUES = new DescriptorKindFilter(VALUES_MASK, null, 2, null);
    private static final int VALUES_MASK = ((SINGLETON_CLASSIFIERS_MASK | FUNCTIONS_MASK) | VARIABLES_MASK);
    @NotNull
    @JvmField
    public static final DescriptorKindFilter VARIABLES = new DescriptorKindFilter(VARIABLES_MASK, null, 2, null);
    private static final int VARIABLES_MASK = Companion.nextMask();
    private static int nextMaskValue = 1;
    @NotNull
    private final List<DescriptorKindExclude> excludes;
    private final int kindMask;

    public static final class Companion {

        private static final class MaskToName {
            private final int mask;
            @NotNull
            private final String name;

            public MaskToName(int i, @NotNull String str) {
                C2668g.b(str, "name");
                this.mask = i;
                this.name = str;
            }

            public final int getMask() {
                return this.mask;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }
        }

        private Companion() {
        }

        private final int nextMask() {
            int access$getNextMaskValue$cp = DescriptorKindFilter.nextMaskValue;
            DescriptorKindFilter.nextMaskValue = DescriptorKindFilter.nextMaskValue << 1;
            return access$getNextMaskValue$cp;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.NON_SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.TYPE_ALIASES_MASK;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.PACKAGES_MASK;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.FUNCTIONS_MASK;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.VARIABLES_MASK;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.ALL_KINDS_MASK;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.CLASSIFIERS_MASK;
        }
    }

    public DescriptorKindFilter(int i, @NotNull List<? extends DescriptorKindExclude> list) {
        C2668g.b(list, "excludes");
        this.excludes = list;
        for (DescriptorKindExclude fullyExcludedDescriptorKinds : this.excludes) {
            i &= fullyExcludedDescriptorKinds.getFullyExcludedDescriptorKinds() ^ -1;
        }
        this.kindMask = i;
    }

    public /* synthetic */ DescriptorKindFilter(int i, List list, int i2, C15823e c15823e) {
        if ((i2 & 2) != 0) {
            list = C17554o.m64195a();
        }
        this(i, list);
    }

    @NotNull
    public final List<DescriptorKindExclude> getExcludes() {
        return this.excludes;
    }

    public final int getKindMask() {
        return this.kindMask;
    }

    public final boolean acceptsKinds(int i) {
        return (i & this.kindMask) != 0;
    }

    @Nullable
    public final DescriptorKindFilter restrictedToKindsOrNull(int i) {
        i &= this.kindMask;
        if (i == 0) {
            return 0;
        }
        return new DescriptorKindFilter(i, this.excludes);
    }

    @NotNull
    public String toString() {
        Object obj;
        for (Object next : DEBUG_PREDEFINED_FILTERS_MASK_NAMES) {
            if (((MaskToName) next).getMask() == this.kindMask) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        MaskToName maskToName = (MaskToName) next2;
        String name = maskToName != null ? maskToName.getName() : null;
        if (name == null) {
            Collection arrayList = new ArrayList();
            for (MaskToName maskToName2 : DEBUG_MASK_BIT_NAMES) {
                obj = acceptsKinds(maskToName2.getMask()) ? maskToName2.getName() : null;
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            name = C19299w.m68797a((List) arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DescriptorKindFilter(");
        stringBuilder.append(name);
        stringBuilder.append(", ");
        stringBuilder.append(this.excludes);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    static {
        int i;
        Object maskToName;
        Companion companion = Companion;
        Object fields = DescriptorKindFilter.class.getFields();
        C2668g.a(fields, "T::class.java.fields");
        Collection arrayList = new ArrayList();
        for (Field field : fields) {
            C2668g.a(field, "it");
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (Field field2 : (List) arrayList) {
            Object obj = field2.get(null);
            if (!(obj instanceof DescriptorKindFilter)) {
                obj = null;
            }
            DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
            if (descriptorKindFilter != null) {
                i = descriptorKindFilter.kindMask;
                C2668g.a(field2, "field");
                String name = field2.getName();
                C2668g.a(name, "field.name");
                maskToName = new MaskToName(i, name);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList2.add(maskToName);
            }
        }
        DEBUG_PREDEFINED_FILTERS_MASK_NAMES = C19299w.m68840l((List) arrayList2);
        companion = Companion;
        fields = DescriptorKindFilter.class.getFields();
        C2668g.a(fields, "T::class.java.fields");
        arrayList = new ArrayList();
        for (Field field3 : fields) {
            C2668g.a(field3, "it");
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList.add(field3);
            }
        }
        arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            Field field4 = (Field) next;
            C2668g.a(field4, "it");
            if (C2668g.a(field4.getType(), Integer.TYPE)) {
                arrayList2.add(next);
            }
        }
        arrayList = new ArrayList();
        for (Field field22 : (List) arrayList2) {
            obj = field22.get(null);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            i = ((Integer) obj).intValue();
            if ((i == ((-i) & i) ? 1 : null) != null) {
                C2668g.a(field22, "field");
                name = field22.getName();
                C2668g.a(name, "field.name");
                maskToName = new MaskToName(i, name);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList.add(maskToName);
            }
        }
        DEBUG_MASK_BIT_NAMES = C19299w.m68840l((List) arrayList);
    }
}
