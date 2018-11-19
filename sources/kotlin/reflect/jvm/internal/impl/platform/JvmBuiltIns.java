package kotlin.reflect.jvm.internal.impl.platform;

import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class JvmBuiltIns extends KotlinBuiltIns {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JvmBuiltIns.class), "settings", "getSettings()Lorg/jetbrains/kotlin/load/kotlin/JvmBuiltInsSettings;"))};
    private boolean isAdditionalBuiltInsFeatureSupported;
    private ModuleDescriptor ownerModuleDescriptor;
    @NotNull
    private final NotNullLazyValue settings$delegate;

    @NotNull
    public final JvmBuiltInsSettings getSettings() {
        return (JvmBuiltInsSettings) StorageKt.getValue(this.settings$delegate, (Object) this, $$delegatedProperties[0]);
    }

    @JvmOverloads
    public /* synthetic */ JvmBuiltIns(StorageManager storageManager, boolean z, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            z = true;
        }
        this(storageManager, z);
    }

    @JvmOverloads
    public JvmBuiltIns(@NotNull StorageManager storageManager, boolean z) {
        C2668g.b(storageManager, "storageManager");
        super(storageManager);
        this.isAdditionalBuiltInsFeatureSupported = true;
        this.settings$delegate = storageManager.createLazyValue(new JvmBuiltIns$settings$2(this, storageManager));
        if (z) {
            createBuiltInsModule();
        }
    }

    public final void initialize(@NotNull ModuleDescriptor moduleDescriptor, boolean z) {
        C2668g.b(moduleDescriptor, "moduleDescriptor");
        Object obj = this.ownerModuleDescriptor == null ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            throw ((Throwable) new AssertionError("JvmBuiltins repeated initialization"));
        }
        this.ownerModuleDescriptor = moduleDescriptor;
        this.isAdditionalBuiltInsFeatureSupported = z;
    }

    @NotNull
    protected PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getSettings();
    }

    @NotNull
    protected AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getSettings();
    }

    @NotNull
    protected List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable classDescriptorFactories = super.getClassDescriptorFactories();
        C2668g.a(classDescriptorFactories, "super.getClassDescriptorFactories()");
        StorageManager storageManager = getStorageManager();
        C2668g.a(storageManager, "storageManager");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        C2668g.a(builtInsModule, "builtInsModule");
        return C19299w.m68821d(classDescriptorFactories, (Object) new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }
}
