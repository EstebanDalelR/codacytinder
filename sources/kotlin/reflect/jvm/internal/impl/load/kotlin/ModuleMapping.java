package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Map;
import kotlin.collections.C17554o;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ModuleMapping {
    @NotNull
    @JvmField
    public static final ModuleMapping CORRUPTED = new ModuleMapping(ah.m66884a(), new BinaryModuleData(C17554o.m64195a()), "CORRUPTED");
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final ModuleMapping EMPTY = new ModuleMapping(ah.m66884a(), new BinaryModuleData(C17554o.m64195a()), "EMPTY");
    @NotNull
    @JvmField
    public static final String MAPPING_FILE_EXT = "kotlin_module";
    private final String debugName;
    @NotNull
    private final BinaryModuleData moduleData;
    @NotNull
    private final Map<String, PackageParts> packageFqName2Parts;

    public static final class Companion {
        private Companion() {
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping create(@org.jetbrains.annotations.Nullable byte[] r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r19) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r16 = this;
            r0 = r17;
            r1 = r18;
            r2 = "debugName";
            kotlin.jvm.internal.C2668g.b(r1, r2);
            r2 = "configuration";
            r3 = r19;
            kotlin.jvm.internal.C2668g.b(r3, r2);
            if (r0 != 0) goto L_0x0015;
        L_0x0012:
            r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.EMPTY;
            return r0;
        L_0x0015:
            r2 = new java.io.DataInputStream;
            r4 = new java.io.ByteArrayInputStream;
            r4.<init>(r0);
            r4 = (java.io.InputStream) r4;
            r2.<init>(r4);
            r0 = r2.readInt();	 Catch:{ IOException -> 0x022a }
            r0 = new int[r0];	 Catch:{ IOException -> 0x022a }
            r4 = r0.length;	 Catch:{ IOException -> 0x022a }
            r5 = 0;	 Catch:{ IOException -> 0x022a }
            r6 = 0;	 Catch:{ IOException -> 0x022a }
        L_0x002a:
            if (r6 >= r4) goto L_0x0035;	 Catch:{ IOException -> 0x022a }
        L_0x002c:
            r7 = r2.readInt();	 Catch:{ IOException -> 0x022a }
            r0[r6] = r7;	 Catch:{ IOException -> 0x022a }
            r6 = r6 + 1;
            goto L_0x002a;
        L_0x0035:
            r4 = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmMetadataVersion;
            r6 = r0.length;
            r0 = java.util.Arrays.copyOf(r0, r6);
            r4.<init>(r0);
            r0 = r19.getSkipMetadataVersionCheck();
            if (r0 != 0) goto L_0x004f;
        L_0x0045:
            r0 = r4.isCompatible();
            if (r0 == 0) goto L_0x004c;
        L_0x004b:
            goto L_0x004f;
        L_0x004c:
            r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.EMPTY;
            return r0;
        L_0x004f:
            r2 = (java.io.InputStream) r2;
            r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module.parseFrom(r2);
            if (r0 == 0) goto L_0x0227;
        L_0x0057:
            r2 = new java.util.LinkedHashMap;
            r2.<init>();
            r4 = r0.getPackagePartsList();
            r4 = r4.iterator();
        L_0x0064:
            r6 = r4.hasNext();
            r7 = 0;
            if (r6 == 0) goto L_0x0168;
        L_0x006b:
            r6 = r4.next();
            r6 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts) r6;
            r8 = "proto";
            kotlin.jvm.internal.C2668g.a(r6, r8);
            r8 = r6.getPackageFqName();
            r9 = r2;
            r9 = (java.util.Map) r9;
            r10 = "packageFqName";
            kotlin.jvm.internal.C2668g.a(r8, r10);
            r10 = r9.get(r8);
            if (r10 != 0) goto L_0x0090;
        L_0x0088:
            r10 = new kotlin.reflect.jvm.internal.impl.load.kotlin.PackageParts;
            r10.<init>(r8);
            r9.put(r8, r10);
        L_0x0090:
            r10 = (kotlin.reflect.jvm.internal.impl.load.kotlin.PackageParts) r10;
            r9 = r6.getShortClassNameList();
            r11 = "proto.shortClassNameList";
            kotlin.jvm.internal.C2668g.a(r9, r11);
            r9 = (java.lang.Iterable) r9;
            r9 = r9.iterator();
            r11 = 0;
        L_0x00a2:
            r12 = r9.hasNext();
            if (r12 == 0) goto L_0x00fd;
        L_0x00a8:
            r12 = r9.next();
            r12 = (java.lang.String) r12;
            r13 = r6.getMultifileFacadeShortNameIdList();
            r14 = "proto.multifileFacadeShortNameIdList";
            kotlin.jvm.internal.C2668g.a(r13, r14);
            r13 = kotlin.collections.C19299w.m68813c(r13, r11);
            r13 = (java.lang.Integer) r13;
            if (r13 == 0) goto L_0x00ca;
        L_0x00bf:
            r13 = r13.intValue();
            r13 = r13 + -1;
            r13 = java.lang.Integer.valueOf(r13);
            goto L_0x00cb;
        L_0x00ca:
            r13 = r7;
        L_0x00cb:
            if (r13 == 0) goto L_0x00e5;
        L_0x00cd:
            r14 = r6.getMultifileFacadeShortNameList();
            r15 = "proto.multifileFacadeShortNameList";
            kotlin.jvm.internal.C2668g.a(r14, r15);
            r13 = (java.lang.Number) r13;
            r13 = r13.intValue();
            r14 = (java.util.List) r14;
            r13 = kotlin.collections.C19299w.m68813c(r14, r13);
            r13 = (java.lang.String) r13;
            goto L_0x00e6;
        L_0x00e5:
            r13 = r7;
        L_0x00e6:
            if (r13 == 0) goto L_0x00ed;
        L_0x00e8:
            r13 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMappingKt.internalNameOf(r8, r13);
            goto L_0x00ee;
        L_0x00ed:
            r13 = r7;
        L_0x00ee:
            r14 = "partShortName";
            kotlin.jvm.internal.C2668g.a(r12, r14);
            r12 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMappingKt.internalNameOf(r8, r12);
            r10.addPart(r12, r13);
            r11 = r11 + 1;
            goto L_0x00a2;
        L_0x00fd:
            r8 = r19.isJvmPackageNameSupported();
            if (r8 == 0) goto L_0x0064;
        L_0x0103:
            r8 = r6.getClassWithJvmPackageNameShortNameList();
            r9 = "proto.classWithJvmPackageNameShortNameList";
            kotlin.jvm.internal.C2668g.a(r8, r9);
            r8 = (java.lang.Iterable) r8;
            r8 = r8.iterator();
            r9 = 0;
        L_0x0113:
            r11 = r8.hasNext();
            if (r11 == 0) goto L_0x0064;
        L_0x0119:
            r11 = r8.next();
            r11 = (java.lang.String) r11;
            r12 = r6.getClassWithJvmPackageNamePackageIdList();
            r13 = "proto.classWithJvmPackageNamePackageIdList";
            kotlin.jvm.internal.C2668g.a(r12, r13);
            r12 = kotlin.collections.C19299w.m68813c(r12, r9);
            r12 = (java.lang.Integer) r12;
            if (r12 == 0) goto L_0x0131;
        L_0x0130:
            goto L_0x0140;
        L_0x0131:
            r12 = r6.getClassWithJvmPackageNamePackageIdList();
            r13 = "proto.classWithJvmPackageNamePackageIdList";
            kotlin.jvm.internal.C2668g.a(r12, r13);
            r12 = kotlin.collections.C19299w.m68834i(r12);
            r12 = (java.lang.Integer) r12;
        L_0x0140:
            if (r12 == 0) goto L_0x0165;
        L_0x0142:
            r12 = r12.intValue();
            r13 = r0.getJvmPackageNameList();
            r14 = "moduleProto.jvmPackageNameList";
            kotlin.jvm.internal.C2668g.a(r13, r14);
            r13 = (java.util.List) r13;
            r12 = kotlin.collections.C19299w.m68813c(r13, r12);
            r12 = (java.lang.String) r12;
            if (r12 == 0) goto L_0x0165;
        L_0x0159:
            r13 = "partShortName";
            kotlin.jvm.internal.C2668g.a(r11, r13);
            r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMappingKt.internalNameOf(r12, r11);
            r10.addPart(r11, r7);
        L_0x0165:
            r9 = r9 + 1;
            goto L_0x0113;
        L_0x0168:
            r3 = r0.getMetadataPartsList();
            r3 = r3.iterator();
        L_0x0170:
            r4 = r3.hasNext();
            if (r4 == 0) goto L_0x01c5;
        L_0x0176:
            r4 = r3.next();
            r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts) r4;
            r5 = r2;
            r5 = (java.util.Map) r5;
            r6 = "proto";
            kotlin.jvm.internal.C2668g.a(r4, r6);
            r6 = r4.getPackageFqName();
            r8 = "proto.packageFqName";
            kotlin.jvm.internal.C2668g.a(r6, r8);
            r8 = r5.get(r6);
            if (r8 != 0) goto L_0x01a4;
        L_0x0193:
            r8 = new kotlin.reflect.jvm.internal.impl.load.kotlin.PackageParts;
            r9 = r4.getPackageFqName();
            r10 = "proto.packageFqName";
            kotlin.jvm.internal.C2668g.a(r9, r10);
            r8.<init>(r9);
            r5.put(r6, r8);
        L_0x01a4:
            r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.PackageParts) r8;
            r4 = r4.getShortClassNameList();
            r5 = "proto.shortClassNameList";
            kotlin.jvm.internal.C2668g.a(r4, r5);
            r4 = (java.lang.Iterable) r4;
            r4 = r4.iterator();
        L_0x01b5:
            r5 = r4.hasNext();
            if (r5 == 0) goto L_0x0170;
        L_0x01bb:
            r5 = r4.next();
            r5 = (java.lang.String) r5;
            r8.addMetadataPart(r5);
            goto L_0x01b5;
        L_0x01c5:
            r3 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
            r4 = r0.getStringTable();
            r5 = "moduleProto.stringTable";
            kotlin.jvm.internal.C2668g.a(r4, r5);
            r5 = r0.getQualifiedNameTable();
            r6 = "moduleProto.qualifiedNameTable";
            kotlin.jvm.internal.C2668g.a(r5, r6);
            r3.<init>(r4, r5);
            r0 = r0.getAnnotationList();
            r4 = "moduleProto.annotationList";
            kotlin.jvm.internal.C2668g.a(r0, r4);
            r0 = (java.lang.Iterable) r0;
            r4 = new java.util.ArrayList;
            r5 = 10;
            r5 = kotlin.collections.C18457p.m66906a(r0, r5);
            r4.<init>(r5);
            r4 = (java.util.Collection) r4;
            r0 = r0.iterator();
        L_0x01f8:
            r5 = r0.hasNext();
            if (r5 == 0) goto L_0x0218;
        L_0x01fe:
            r5 = r0.next();
            r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r5;
            r6 = r3;
            r6 = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver) r6;
            r8 = "proto";
            kotlin.jvm.internal.C2668g.a(r5, r8);
            r5 = r5.getId();
            r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(r6, r5);
            r4.add(r5);
            goto L_0x01f8;
        L_0x0218:
            r4 = (java.util.List) r4;
            r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping;
            r2 = (java.util.Map) r2;
            r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryModuleData;
            r3.<init>(r4);
            r0.<init>(r2, r3, r1);
            return r0;
        L_0x0227:
            r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.EMPTY;
            return r0;
        L_0x022a:
            r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.CORRUPTED;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping.Companion.create(byte[], java.lang.String, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration):kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMapping");
        }
    }

    private ModuleMapping(Map<String, PackageParts> map, BinaryModuleData binaryModuleData, String str) {
        this.packageFqName2Parts = map;
        this.moduleData = binaryModuleData;
        this.debugName = str;
    }

    @Nullable
    public final PackageParts findPackageParts(@NotNull String str) {
        C2668g.b(str, "packageFqName");
        return (PackageParts) this.packageFqName2Parts.get(str);
    }

    @NotNull
    public String toString() {
        return this.debugName;
    }
}
