package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ModuleDescriptor extends DeclarationDescriptor {

    public static final class Capability<T> {
        @NotNull
        private final String name;

        public Capability(@NotNull String str) {
            C2668g.b(str, "name");
            this.name = str;
        }

        @NotNull
        public String toString() {
            return this.name;
        }
    }

    public static final class DefaultImpls {
        @Nullable
        public static DeclarationDescriptor getContainingDeclaration(ModuleDescriptor moduleDescriptor) {
            return null;
        }

        public static <R, D> R accept(ModuleDescriptor moduleDescriptor, @NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            C2668g.b(declarationDescriptorVisitor, "visitor");
            return declarationDescriptorVisitor.visitModuleDeclaration(moduleDescriptor, d);
        }
    }

    @NotNull
    KotlinBuiltIns getBuiltIns();

    @NotNull
    PackageViewDescriptor getPackage(@NotNull FqName fqName);

    @NotNull
    Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);

    boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor);
}
