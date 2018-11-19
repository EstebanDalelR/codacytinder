package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NotFoundClasses {
    private final MemoizedFunctionToNotNull<ClassRequest, ClassDescriptor> classes = this.storageManager.createMemoizedFunction((Function1) new NotFoundClasses$classes$1(this));
    private final ModuleDescriptor module;
    private final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> packageFragments = this.storageManager.createMemoizedFunction((Function1) new NotFoundClasses$packageFragments$1(this));
    private final StorageManager storageManager;

    private static final class ClassRequest {
        @NotNull
        private final ClassId classId;
        @NotNull
        private final List<Integer> typeParametersCount;

        @NotNull
        public final ClassId component1() {
            return this.classId;
        }

        @NotNull
        public final List<Integer> component2() {
            return this.typeParametersCount;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ClassRequest) {
                    ClassRequest classRequest = (ClassRequest) obj;
                    if (C2668g.a(this.classId, classRequest.classId) && C2668g.a(this.typeParametersCount, classRequest.typeParametersCount)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ClassId classId = this.classId;
            int i = 0;
            int hashCode = (classId != null ? classId.hashCode() : 0) * 31;
            List list = this.typeParametersCount;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ClassRequest(classId=");
            stringBuilder.append(this.classId);
            stringBuilder.append(", typeParametersCount=");
            stringBuilder.append(this.typeParametersCount);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public ClassRequest(@NotNull ClassId classId, @NotNull List<Integer> list) {
            C2668g.b(classId, "classId");
            C2668g.b(list, "typeParametersCount");
            this.classId = classId;
            this.typeParametersCount = list;
        }
    }

    public static final class MockClassDescriptor extends ClassDescriptorBase {
        private final boolean isInner;
        private final ClassTypeConstructorImpl typeConstructor;
        private final List<TypeParameterDescriptor> typeParameters;

        @Nullable
        public ClassDescriptor getCompanionObjectDescriptor() {
            return null;
        }

        @Nullable
        public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
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

        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, boolean z, int i) {
            C2668g.b(storageManager, "storageManager");
            C2668g.b(declarationDescriptor, "container");
            C2668g.b(name, "name");
            super(storageManager, declarationDescriptor, name, SourceElement.NO_SOURCE, false);
            this.isInner = z;
            Iterable b = C18464j.m66925b(null, i);
            Collection collection = (Collection) new ArrayList(C18457p.m66906a(b, 10));
            storageManager = b.iterator();
            while (storageManager.hasNext() != null) {
                int b2 = ((ab) storageManager).mo13805b();
                DeclarationDescriptor declarationDescriptor2 = this;
                Annotations empty = Annotations.Companion.getEMPTY();
                Variance variance = Variance.INVARIANT;
                name = new StringBuilder();
                name.append(true);
                name.append(b2);
                collection.add(TypeParameterDescriptorImpl.createWithDefaultBound(declarationDescriptor2, empty, false, variance, Name.identifier(name.toString()), b2));
            }
            this.typeParameters = (List) collection;
            this.typeConstructor = new ClassTypeConstructorImpl(this, this.typeParameters, al.m59817a(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()));
        }

        @NotNull
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @NotNull
        public Modality getModality() {
            return Modality.FINAL;
        }

        @NotNull
        public Visibility getVisibility() {
            return Visibilities.PUBLIC;
        }

        @NotNull
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }

        @NotNull
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.typeParameters;
        }

        public boolean isInner() {
            return this.isInner;
        }

        @NotNull
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @NotNull
        public Empty getUnsubstitutedMemberScope() {
            return Empty.INSTANCE;
        }

        @NotNull
        public Empty getStaticScope() {
            return Empty.INSTANCE;
        }

        @NotNull
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return am.m64176a();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("class ");
            stringBuilder.append(getName());
            stringBuilder.append(" (not found)");
            return stringBuilder.toString();
        }
    }

    public NotFoundClasses(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(moduleDescriptor, "module");
        this.storageManager = storageManager;
        this.module = moduleDescriptor;
    }

    @NotNull
    public final ClassDescriptor getClass(@NotNull ClassId classId, @NotNull List<Integer> list) {
        C2668g.b(classId, "classId");
        C2668g.b(list, "typeParametersCount");
        return (ClassDescriptor) this.classes.invoke(new ClassRequest(classId, list));
    }
}
