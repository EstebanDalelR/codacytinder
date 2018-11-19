package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {
    public static final Companion Companion = new Companion();
    private final ModuleDescriptor module;
    private final StorageManager storageManager;

    public static final class Companion {
        private Companion() {
        }

        private final KindWithArity parseClassName(String str, FqName fqName) {
            fqName = Kind.Companion.byClassNamePrefix(fqName, str);
            if (fqName == null) {
                return null;
            }
            Companion companion = this;
            int length = fqName.getClassNamePrefix().length();
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = str.substring(length);
            C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
            str = toInt(str);
            if (str != null) {
                return new KindWithArity(fqName, str.intValue());
            }
            return null;
        }

        @JvmStatic
        @Nullable
        public final Kind getFunctionalClassKind(@NotNull String str, @NotNull FqName fqName) {
            C2668g.b(str, "className");
            C2668g.b(fqName, "packageFqName");
            str = parseClassName(str, fqName);
            return str != null ? str.getKind() : null;
        }

        private final Integer toInt(String str) {
            int i = 0;
            if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
                return null;
            }
            int length = str.length();
            int i2 = 0;
            while (i < length) {
                int charAt = str.charAt(i) - 48;
                if (charAt >= 0) {
                    if (9 >= charAt) {
                        i2 = (i2 * 10) + charAt;
                        i++;
                    }
                }
                return null;
            }
            return Integer.valueOf(i2);
        }
    }

    private static final class KindWithArity {
        private final int arity;
        @NotNull
        private final Kind kind;

        @NotNull
        public final Kind component1() {
            return this.kind;
        }

        public final int component2() {
            return this.arity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof KindWithArity) {
                KindWithArity kindWithArity = (KindWithArity) obj;
                if (C2668g.a(this.kind, kindWithArity.kind)) {
                    if ((this.arity == kindWithArity.arity ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Kind kind = this.kind;
            return ((kind != null ? kind.hashCode() : 0) * 31) + this.arity;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("KindWithArity(kind=");
            stringBuilder.append(this.kind);
            stringBuilder.append(", arity=");
            stringBuilder.append(this.arity);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public KindWithArity(@NotNull Kind kind, int i) {
            C2668g.b(kind, "kind");
            this.kind = kind;
            this.arity = i;
        }

        @NotNull
        public final Kind getKind() {
            return this.kind;
        }
    }

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(moduleDescriptor, "module");
        this.storageManager = storageManager;
        this.module = moduleDescriptor;
    }

    public boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name) {
        C2668g.b(fqName, "packageFqName");
        C2668g.b(name, "name");
        name = name.asString();
        C2668g.a(name, ManagerWebServices.PARAM_TEASER_STRING);
        if ((C19296q.m68678b(name, "Function", false, 2, null) || C19296q.m68678b(name, "KFunction", false, 2, null)) && Companion.parseClassName(name, fqName) != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        C2668g.b(classId, "classId");
        if (!classId.isLocal()) {
            if (!classId.isNestedClass()) {
                String asString = classId.getRelativeClassName().asString();
                C2668g.a(asString, "className");
                if (!C19298r.m68786b((CharSequence) asString, (CharSequence) "Function", false, 2, null)) {
                    return null;
                }
                classId = classId.getPackageFqName();
                Companion companion = Companion;
                C2668g.a(classId, "packageFqName");
                KindWithArity access$parseClassName = companion.parseClassName(asString, classId);
                if (access$parseClassName == null) {
                    return null;
                }
                Kind component1 = access$parseClassName.component1();
                int component2 = access$parseClassName.component2();
                if (component1 == Kind.SuspendFunction) {
                    return null;
                }
                Collection arrayList = new ArrayList();
                for (Object next : this.module.getPackage(classId).getFragments()) {
                    if (next instanceof BuiltInsPackageFragment) {
                        arrayList.add(next);
                    }
                }
                return new FunctionClassDescriptor(this.storageManager, (BuiltInsPackageFragment) C19299w.m68829f((List) arrayList), component1, component2);
            }
        }
        return null;
    }

    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName) {
        C2668g.b(fqName, "packageFqName");
        return am.m64176a();
    }
}
