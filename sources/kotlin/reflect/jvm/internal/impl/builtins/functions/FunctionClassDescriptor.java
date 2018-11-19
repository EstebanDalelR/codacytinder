package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    private final int arity;
    private final PackageFragmentDescriptor containingDeclaration;
    @NotNull
    private final Kind functionKind;
    private final FunctionClassScope memberScope = new FunctionClassScope(this.storageManager, this);
    private final List<TypeParameterDescriptor> parameters;
    private final StorageManager storageManager;
    private final FunctionTypeConstructor typeConstructor = new FunctionTypeConstructor();

    public enum Kind {
        ;
        
        public static final Companion Companion = null;
        @NotNull
        private final String classNamePrefix;
        @NotNull
        private final FqName packageFqName;

        public static final class Companion {
            private Companion() {
            }

            @Nullable
            public final Kind byClassNamePrefix(@NotNull FqName fqName, @NotNull String str) {
                C2668g.b(fqName, "packageFqName");
                C2668g.b(str, "className");
                for (Kind kind : Kind.values()) {
                    Object obj = (C2668g.a(kind.getPackageFqName(), fqName) && C19296q.m68678b(str, kind.getClassNamePrefix(), false, 2, null)) ? 1 : null;
                    if (obj != null) {
                        return kind;
                    }
                }
                return null;
            }
        }

        protected Kind(FqName fqName, String str) {
            C2668g.b(fqName, "packageFqName");
            C2668g.b(str, "classNamePrefix");
            this.packageFqName = fqName;
            this.classNamePrefix = str;
        }

        @NotNull
        public final String getClassNamePrefix() {
            return this.classNamePrefix;
        }

        @NotNull
        public final FqName getPackageFqName() {
            return this.packageFqName;
        }

        static {
            Companion = new Companion();
        }

        @NotNull
        public final Name numberedClassName(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.classNamePrefix);
            stringBuilder.append("");
            stringBuilder.append(i);
            return Name.identifier(stringBuilder.toString());
        }
    }

    private final class FunctionTypeConstructor extends AbstractClassTypeConstructor {
        public boolean isDenotable() {
            return true;
        }

        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.storageManager);
        }

        @NotNull
        protected Collection<KotlinType> computeSupertypes() {
            ArrayList arrayList = new ArrayList(2);
            C19079x86380a31 c19079x86380a31 = new C19079x86380a31(this, arrayList);
            if (FunctionClassDescriptor.this.getFunctionKind() == Kind.SuspendFunction) {
                arrayList.add(DescriptorUtilsKt.getBuiltIns(FunctionClassDescriptor.this.containingDeclaration).getAnyType());
            } else {
                PackageFragmentDescriptor access$getContainingDeclaration$p = FunctionClassDescriptor.this.containingDeclaration;
                Name identifier = Name.identifier(FunctionClassDescriptor.this.getFunctionKind().getClassNamePrefix());
                C2668g.a(identifier, "Name.identifier(functionKind.classNamePrefix)");
                c19079x86380a31.invoke(access$getContainingDeclaration$p, identifier);
            }
            if (FunctionClassDescriptor.this.getFunctionKind() == Kind.KFunction) {
                ModuleDescriptor containingDeclaration = FunctionClassDescriptor.this.containingDeclaration.getContainingDeclaration();
                FqName fqName = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME;
                C2668g.a(fqName, "BUILT_INS_PACKAGE_FQ_NAME");
                Iterable fragments = containingDeclaration.getPackage(fqName).getFragments();
                Collection arrayList2 = new ArrayList();
                for (Object next : fragments) {
                    if (next instanceof BuiltInsPackageFragment) {
                        arrayList2.add(next);
                    }
                }
                access$getContainingDeclaration$p = (BuiltInsPackageFragment) C19299w.m68829f((List) arrayList2);
                identifier = Kind.Function.numberedClassName(FunctionClassDescriptor.this.getArity());
                C2668g.a(identifier, "Kind.Function.numberedClassName(arity)");
                c19079x86380a31.invoke(access$getContainingDeclaration$p, identifier);
            }
            return C19299w.m68840l(arrayList);
        }

        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.parameters;
        }

        @NotNull
        public FunctionClassDescriptor getDeclarationDescriptor() {
            return FunctionClassDescriptor.this;
        }

        @NotNull
        public String toString() {
            return getDeclarationDescriptor().toString();
        }

        @NotNull
        protected SupertypeLoopChecker getSupertypeLoopChecker() {
            return EMPTY.INSTANCE;
        }
    }

    @Nullable
    public Void getCompanionObjectDescriptor() {
        return null;
    }

    @Nullable
    public Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isInner() {
        return false;
    }

    @NotNull
    public final Kind getFunctionKind() {
        return this.functionKind;
    }

    public final int getArity() {
        return this.arity;
    }

    public FunctionClassDescriptor(@NotNull StorageManager storageManager, @NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull Kind kind, int i) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(packageFragmentDescriptor, "containingDeclaration");
        C2668g.b(kind, "functionKind");
        super(storageManager, kind.numberedClassName(i));
        this.storageManager = storageManager;
        this.containingDeclaration = packageFragmentDescriptor;
        this.functionKind = kind;
        this.arity = i;
        storageManager = new ArrayList();
        packageFragmentDescriptor = new Function2<Variance, String, C15813i>() {
            public final void invoke(@NotNull Variance variance, @NotNull String str) {
                C2668g.b(variance, "variance");
                C2668g.b(str, "name");
                storageManager.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, variance, Name.identifier(str), storageManager.size()));
            }
        };
        Iterable iterable = (Iterable) new C18461c(1, this.arity);
        Collection collection = (Collection) new ArrayList(C18457p.m66906a(iterable, 10));
        kind = iterable.iterator();
        while (kind.hasNext()) {
            int b = ((ab) kind).mo13805b();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('P');
            stringBuilder.append(b);
            packageFragmentDescriptor.invoke(variance, stringBuilder.toString());
            collection.add(C15813i.f49016a);
        }
        List list = (List) collection;
        packageFragmentDescriptor.invoke(Variance.OUT_VARIANCE, "R");
        this.parameters = C19299w.m68840l((Iterable) storageManager);
    }

    @NotNull
    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @NotNull
    public Empty getStaticScope() {
        return Empty.INSTANCE;
    }

    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @NotNull
    public FunctionClassScope getUnsubstitutedMemberScope() {
        return this.memberScope;
    }

    @NotNull
    public List<ClassConstructorDescriptor> getConstructors() {
        return C17554o.m64195a();
    }

    @NotNull
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @NotNull
    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    @NotNull
    public Visibility getVisibility() {
        return Visibilities.PUBLIC;
    }

    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
        return sourceElement;
    }

    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.parameters;
    }

    @NotNull
    public String toString() {
        return getName().asString();
    }
}
