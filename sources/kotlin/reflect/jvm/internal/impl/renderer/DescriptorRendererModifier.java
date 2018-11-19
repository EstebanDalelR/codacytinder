package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19066k;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public enum DescriptorRendererModifier {
    ;
    
    @NotNull
    @JvmField
    public static final Set<DescriptorRendererModifier> ALL = null;
    public static final Companion Companion = null;
    @NotNull
    @JvmField
    public static final Set<DescriptorRendererModifier> DEFAULTS = null;
    private final boolean includeByDefault;

    public static final class Companion {
        private Companion() {
        }
    }

    protected DescriptorRendererModifier(boolean z) {
        this.includeByDefault = z;
    }

    static {
        Companion = new Companion();
        DescriptorRendererModifier[] values = values();
        Collection arrayList = new ArrayList();
        int length = values.length;
        int i;
        while (i < length) {
            DescriptorRendererModifier descriptorRendererModifier = values[i];
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
            i++;
        }
        DEFAULTS = C19299w.m68842n((List) arrayList);
        ALL = C19066k.m68009k(values());
    }
}
