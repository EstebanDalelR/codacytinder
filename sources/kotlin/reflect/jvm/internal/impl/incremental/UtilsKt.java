package kotlin.reflect.jvm.internal.impl.incremental;

import com.tinder.api.ManagerWebServices;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

public final class UtilsKt {
    public static final void record(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull ClassDescriptor classDescriptor, @NotNull Name name) {
        C2668g.b(lookupTracker, "$receiver");
        C2668g.b(lookupLocation, ManagerWebServices.PARAM_FROM);
        C2668g.b(classDescriptor, "scopeOwner");
        C2668g.b(name, "name");
        if (lookupTracker != DO_NOTHING.INSTANCE) {
            lookupLocation = lookupLocation.getLocation();
            if (lookupLocation != null) {
                Position position = lookupTracker.getRequiresPosition() ? lookupLocation.getPosition() : Position.Companion.getNO_POSITION();
                String filePath = lookupLocation.getFilePath();
                String asString = DescriptorUtils.getFqName(classDescriptor).asString();
                C2668g.a(asString, "DescriptorUtils.getFqName(scopeOwner).asString()");
                ScopeKind scopeKind = ScopeKind.CLASSIFIER;
                String asString2 = name.asString();
                C2668g.a(asString2, "name.asString()");
                lookupTracker.record(filePath, position, asString, scopeKind, asString2);
            }
        }
    }

    public static final void record(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull Name name) {
        C2668g.b(lookupTracker, "$receiver");
        C2668g.b(lookupLocation, ManagerWebServices.PARAM_FROM);
        C2668g.b(packageFragmentDescriptor, "scopeOwner");
        C2668g.b(name, "name");
        packageFragmentDescriptor = packageFragmentDescriptor.getFqName().asString();
        C2668g.a(packageFragmentDescriptor, "scopeOwner.fqName.asString()");
        name = name.asString();
        C2668g.a(name, "name.asString()");
        recordPackageLookup(lookupTracker, lookupLocation, packageFragmentDescriptor, name);
    }

    public static final void recordPackageLookup(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation lookupLocation, @NotNull String str, @NotNull String str2) {
        C2668g.b(lookupTracker, "$receiver");
        C2668g.b(lookupLocation, ManagerWebServices.PARAM_FROM);
        C2668g.b(str, "packageFqName");
        C2668g.b(str2, "name");
        if (lookupTracker != DO_NOTHING.INSTANCE) {
            lookupLocation = lookupLocation.getLocation();
            if (lookupLocation != null) {
                lookupTracker.record(lookupLocation.getFilePath(), lookupTracker.getRequiresPosition() ? lookupLocation.getPosition() : Position.Companion.getNO_POSITION(), str, ScopeKind.PACKAGE, str2);
            }
        }
    }
}
