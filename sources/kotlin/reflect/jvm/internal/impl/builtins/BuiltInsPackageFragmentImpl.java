package kotlin.reflect.jvm.internal.impl.builtins;

import java.io.Closeable;
import java.io.InputStream;
import kotlin.io.C15818b;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {
    public BuiltInsPackageFragmentImpl(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull InputStream inputStream) {
        C2668g.b(fqName, "fqName");
        C2668g.b(storageManager, "storageManager");
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(inputStream, "inputStream");
        Closeable closeable = inputStream;
        Throwable th = (Throwable) null;
        try {
            InputStream inputStream2 = (InputStream) closeable;
            BuiltInsBinaryVersion readFrom = BuiltInsBinaryVersion.Companion.readFrom(inputStream2);
            if (readFrom.isCompatible()) {
                PackageFragment parseFrom = PackageFragment.parseFrom(inputStream2, BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry());
                C15818b.m59848a(closeable, th);
                C2668g.a(parseFrom, "inputStream.use { stream…ocol.extensionRegistry)\n}");
                super(fqName, storageManager, moduleDescriptor, parseFrom, null);
                return;
            }
            storageManager = new StringBuilder();
            storageManager.append("Kotlin built-in definition format version is not supported: ");
            storageManager.append("expected ");
            storageManager.append(BuiltInsBinaryVersion.INSTANCE);
            storageManager.append(", actual ");
            storageManager.append(readFrom);
            storageManager.append(". ");
            storageManager.append("Please update Kotlin");
            throw ((Throwable) new UnsupportedOperationException(storageManager.toString()));
        } catch (Throwable th2) {
            C15818b.m59848a(closeable, fqName);
        }
    }
}
