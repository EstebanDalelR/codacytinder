package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    @NotNull
    private static final ClassId CLONEABLE_CLASS_ID = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.cloneable.toSafe());
    private static final Name CLONEABLE_NAME = KotlinBuiltIns.FQ_NAMES.cloneable.shortName();
    public static final Companion Companion = new Companion();
    private static final FqName KOTLIN_FQ_NAME = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME;
    private final NotNullLazyValue cloneable$delegate;
    private final Function1<ModuleDescriptor, DeclarationDescriptor> computeContainingDeclaration;
    private final ModuleDescriptor moduleDescriptor;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.JvmBuiltInClassDescriptorFactory$1 */
    static final class C190771 extends Lambda implements Function1<ModuleDescriptor, BuiltInsPackageFragment> {
        public static final C190771 INSTANCE = new C190771();

        C190771() {
            super(1);
        }

        @NotNull
        public final BuiltInsPackageFragment invoke(@NotNull ModuleDescriptor moduleDescriptor) {
            C2668g.b(moduleDescriptor, "module");
            FqName access$getKOTLIN_FQ_NAME$cp = JvmBuiltInClassDescriptorFactory.KOTLIN_FQ_NAME;
            C2668g.a(access$getKOTLIN_FQ_NAME$cp, "KOTLIN_FQ_NAME");
            Iterable fragments = moduleDescriptor.getPackage(access$getKOTLIN_FQ_NAME$cp).getFragments();
            Collection arrayList = new ArrayList();
            for (Object next : fragments) {
                if (next instanceof BuiltInsPackageFragment) {
                    arrayList.add(next);
                }
            }
            return (BuiltInsPackageFragment) C19299w.m68829f((List) arrayList);
        }
    }

    private final ClassDescriptorImpl getCloneable() {
        return (ClassDescriptorImpl) StorageKt.getValue(this.cloneable$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public JvmBuiltInClassDescriptorFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> function1) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(moduleDescriptor, "moduleDescriptor");
        C2668g.b(function1, "computeContainingDeclaration");
        this.moduleDescriptor = moduleDescriptor;
        this.computeContainingDeclaration = function1;
        this.cloneable$delegate = storageManager.createLazyValue((Function0) new JvmBuiltInClassDescriptorFactory$cloneable$2(this, storageManager));
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            function1 = C190771.INSTANCE;
        }
        this(storageManager, moduleDescriptor, function1);
    }

    public boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name) {
        C2668g.b(fqName, "packageFqName");
        C2668g.b(name, "name");
        return (C2668g.a(name, CLONEABLE_NAME) == null || C2668g.a(fqName, KOTLIN_FQ_NAME) == null) ? null : true;
    }

    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        C2668g.b(classId, "classId");
        return C2668g.a(classId, CLONEABLE_CLASS_ID) != null ? getCloneable() : null;
    }

    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName) {
        C2668g.b(fqName, "packageFqName");
        if (C2668g.a(fqName, KOTLIN_FQ_NAME) != null) {
            return al.m59817a(getCloneable());
        }
        return am.m64176a();
    }
}
