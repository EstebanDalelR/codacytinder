package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class ModuleDependenciesImpl implements ModuleDependencies {
    @NotNull
    private final List<ModuleDescriptorImpl> allDependencies;
    @NotNull
    private final List<ModuleDescriptorImpl> expectedByDependencies;
    @NotNull
    private final Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible;

    public ModuleDependenciesImpl(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set, @NotNull List<ModuleDescriptorImpl> list2) {
        C2668g.b(list, "allDependencies");
        C2668g.b(set, "modulesWhoseInternalsAreVisible");
        C2668g.b(list2, "expectedByDependencies");
        this.allDependencies = list;
        this.modulesWhoseInternalsAreVisible = set;
        this.expectedByDependencies = list2;
    }

    @NotNull
    public List<ModuleDescriptorImpl> getAllDependencies() {
        return this.allDependencies;
    }

    @NotNull
    public Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.modulesWhoseInternalsAreVisible;
    }

    @NotNull
    public List<ModuleDescriptorImpl> getExpectedByDependencies() {
        return this.expectedByDependencies;
    }
}
