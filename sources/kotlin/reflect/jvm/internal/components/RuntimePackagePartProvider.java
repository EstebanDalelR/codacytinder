package kotlin.reflect.jvm.internal.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackageParts;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PackagePartProvider;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "module2Mapping", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/ModuleMapping;", "findMetadataPackageParts", "", "packageFqName", "findPackageParts", "getAnnotationsOnBinaryModule", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "moduleName", "registerModule", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public final class RuntimePackagePartProvider implements PackagePartProvider {
    private final ClassLoader classLoader;
    private final ConcurrentHashMap<String, ModuleMapping> module2Mapping = new ConcurrentHashMap();

    public RuntimePackagePartProvider(@NotNull ClassLoader classLoader) {
        C2668g.b(classLoader, "classLoader");
        this.classLoader = classLoader;
    }

    public final void registerModule(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = "moduleName";
        kotlin.jvm.internal.C2668g.b(r9, r0);
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x004f }
        r1.<init>();	 Catch:{ Exception -> 0x004f }
        r2 = "META-INF/";	 Catch:{ Exception -> 0x004f }
        r1.append(r2);	 Catch:{ Exception -> 0x004f }
        r1.append(r9);	 Catch:{ Exception -> 0x004f }
        r2 = 46;	 Catch:{ Exception -> 0x004f }
        r1.append(r2);	 Catch:{ Exception -> 0x004f }
        r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.MAPPING_FILE_EXT;	 Catch:{ Exception -> 0x004f }
        r1.append(r2);	 Catch:{ Exception -> 0x004f }
        r1 = r1.toString();	 Catch:{ Exception -> 0x004f }
        r2 = r8.classLoader;	 Catch:{ Exception -> 0x004f }
        r2 = r2.getResourceAsStream(r1);	 Catch:{ Exception -> 0x004f }
        if (r2 == 0) goto L_0x004f;	 Catch:{ Exception -> 0x004f }
    L_0x0029:
        r2 = (java.io.Closeable) r2;	 Catch:{ Exception -> 0x004f }
        r3 = r0;	 Catch:{ Exception -> 0x004f }
        r3 = (java.lang.Throwable) r3;	 Catch:{ Exception -> 0x004f }
        r4 = r2;	 Catch:{ Throwable -> 0x0048 }
        r4 = (java.io.InputStream) r4;	 Catch:{ Throwable -> 0x0048 }
        r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.Companion;	 Catch:{ Throwable -> 0x0048 }
        r6 = 0;	 Catch:{ Throwable -> 0x0048 }
        r7 = 1;	 Catch:{ Throwable -> 0x0048 }
        r4 = kotlin.io.C15817a.m59847a(r4, r6, r7, r0);	 Catch:{ Throwable -> 0x0048 }
        r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default.INSTANCE;	 Catch:{ Throwable -> 0x0048 }
        r6 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration) r6;	 Catch:{ Throwable -> 0x0048 }
        r1 = r5.create(r4, r1, r6);	 Catch:{ Throwable -> 0x0048 }
        kotlin.io.C15818b.m59848a(r2, r3);	 Catch:{ Exception -> 0x004f }
        r0 = r1;
        goto L_0x004f;
    L_0x0046:
        r1 = move-exception;
        goto L_0x004b;
    L_0x0048:
        r1 = move-exception;
        r3 = r1;
        throw r3;	 Catch:{ all -> 0x0046 }
    L_0x004b:
        kotlin.io.C15818b.m59848a(r2, r3);	 Catch:{ Exception -> 0x004f }
        throw r1;	 Catch:{ Exception -> 0x004f }
    L_0x004f:
        r1 = r8.module2Mapping;
        if (r0 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0056;
    L_0x0054:
        r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.EMPTY;
    L_0x0056:
        r1.putIfAbsent(r9, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.components.RuntimePackagePartProvider.registerModule(java.lang.String):void");
    }

    @NotNull
    public List<String> findPackageParts(@NotNull String str) {
        C2668g.b(str, "packageFqName");
        Collection<ModuleMapping> values = this.module2Mapping.values();
        C2668g.a(values, "module2Mapping.values");
        Collection arrayList = new ArrayList();
        for (ModuleMapping findPackageParts : values) {
            PackageParts findPackageParts2 = findPackageParts.findPackageParts(str);
            if (findPackageParts2 != null) {
                arrayList.add(findPackageParts2);
            }
        }
        Collection collection = (Collection) new ArrayList();
        for (PackageParts parts : (List) arrayList) {
            C19291t.m68635a(collection, (Iterable) parts.getParts());
        }
        return C19299w.m68844p((List) collection);
    }
}
