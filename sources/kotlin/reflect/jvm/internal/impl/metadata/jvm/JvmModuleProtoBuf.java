package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

public final class JvmModuleProtoBuf {

    public interface ModuleOrBuilder extends MessageLiteOrBuilder {
    }

    public interface PackagePartsOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Module extends GeneratedMessageLite implements ModuleOrBuilder {
        public static Parser<Module> PARSER = new C185121();
        private static final Module defaultInstance = new Module(true);
        private List<Annotation> annotation_;
        private int bitField0_;
        private LazyStringList jvmPackageName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<PackageParts> metadataParts_;
        private List<PackageParts> packageParts_;
        private QualifiedNameTable qualifiedNameTable_;
        private StringTable stringTable_;
        private final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$Module$1 */
        static class C185121 extends AbstractParser<Module> {
            C185121() {
            }

            public Module parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Module(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Module, Builder> implements ModuleOrBuilder {
            private List<Annotation> annotation_ = Collections.emptyList();
            private int bitField0_;
            private LazyStringList jvmPackageName_ = LazyStringArrayList.EMPTY;
            private List<PackageParts> metadataParts_ = Collections.emptyList();
            private List<PackageParts> packageParts_ = Collections.emptyList();
            private QualifiedNameTable qualifiedNameTable_ = QualifiedNameTable.getDefaultInstance();
            private StringTable stringTable_ = StringTable.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Module getDefaultInstanceForType() {
                return Module.getDefaultInstance();
            }

            public Module build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public Module buildPartial() {
                Module module = new Module((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((this.bitField0_ & 1) == 1) {
                    this.packageParts_ = Collections.unmodifiableList(this.packageParts_);
                    this.bitField0_ &= -2;
                }
                module.packageParts_ = this.packageParts_;
                if ((this.bitField0_ & 2) == 2) {
                    this.metadataParts_ = Collections.unmodifiableList(this.metadataParts_);
                    this.bitField0_ &= -3;
                }
                module.metadataParts_ = this.metadataParts_;
                if ((this.bitField0_ & 4) == 4) {
                    this.jvmPackageName_ = this.jvmPackageName_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                module.jvmPackageName_ = this.jvmPackageName_;
                if ((i & 8) != 8) {
                    i2 = 0;
                }
                module.stringTable_ = this.stringTable_;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                module.qualifiedNameTable_ = this.qualifiedNameTable_;
                if ((this.bitField0_ & 32) == 32) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -33;
                }
                module.annotation_ = this.annotation_;
                module.bitField0_ = i2;
                return module;
            }

            public Builder mergeFrom(Module module) {
                if (module == Module.getDefaultInstance()) {
                    return this;
                }
                if (!module.packageParts_.isEmpty()) {
                    if (this.packageParts_.isEmpty()) {
                        this.packageParts_ = module.packageParts_;
                        this.bitField0_ &= -2;
                    } else {
                        ensurePackagePartsIsMutable();
                        this.packageParts_.addAll(module.packageParts_);
                    }
                }
                if (!module.metadataParts_.isEmpty()) {
                    if (this.metadataParts_.isEmpty()) {
                        this.metadataParts_ = module.metadataParts_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMetadataPartsIsMutable();
                        this.metadataParts_.addAll(module.metadataParts_);
                    }
                }
                if (!module.jvmPackageName_.isEmpty()) {
                    if (this.jvmPackageName_.isEmpty()) {
                        this.jvmPackageName_ = module.jvmPackageName_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureJvmPackageNameIsMutable();
                        this.jvmPackageName_.addAll(module.jvmPackageName_);
                    }
                }
                if (module.hasStringTable()) {
                    mergeStringTable(module.getStringTable());
                }
                if (module.hasQualifiedNameTable()) {
                    mergeQualifiedNameTable(module.getQualifiedNameTable());
                }
                if (!module.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = module.annotation_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(module.annotation_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(module.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                int i;
                for (i = 0; i < getPackagePartsCount(); i++) {
                    if (!getPackageParts(i).isInitialized()) {
                        return false;
                    }
                }
                for (i = 0; i < getMetadataPartsCount(); i++) {
                    if (!getMetadataParts(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasQualifiedNameTable() && !getQualifiedNameTable().isInitialized()) {
                    return false;
                }
                for (i = 0; i < getAnnotationCount(); i++) {
                    if (!getAnnotation(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Module module;
                Module module2 = null;
                try {
                    Module module3 = (Module) Module.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (module3 != null) {
                        mergeFrom(module3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    module = (Module) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2;
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    module2 = module;
                }
                if (module2 != null) {
                    mergeFrom(module2);
                }
                throw codedInputStream2;
            }

            private void ensurePackagePartsIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.packageParts_ = new ArrayList(this.packageParts_);
                    this.bitField0_ |= 1;
                }
            }

            public int getPackagePartsCount() {
                return this.packageParts_.size();
            }

            public PackageParts getPackageParts(int i) {
                return (PackageParts) this.packageParts_.get(i);
            }

            private void ensureMetadataPartsIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.metadataParts_ = new ArrayList(this.metadataParts_);
                    this.bitField0_ |= 2;
                }
            }

            public int getMetadataPartsCount() {
                return this.metadataParts_.size();
            }

            public PackageParts getMetadataParts(int i) {
                return (PackageParts) this.metadataParts_.get(i);
            }

            private void ensureJvmPackageNameIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.jvmPackageName_ = new LazyStringArrayList(this.jvmPackageName_);
                    this.bitField0_ |= 4;
                }
            }

            public Builder mergeStringTable(StringTable stringTable) {
                if ((this.bitField0_ & 8) != 8 || this.stringTable_ == StringTable.getDefaultInstance()) {
                    this.stringTable_ = stringTable;
                } else {
                    this.stringTable_ = StringTable.newBuilder(this.stringTable_).mergeFrom(stringTable).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public boolean hasQualifiedNameTable() {
                return (this.bitField0_ & 16) == 16;
            }

            public QualifiedNameTable getQualifiedNameTable() {
                return this.qualifiedNameTable_;
            }

            public Builder mergeQualifiedNameTable(QualifiedNameTable qualifiedNameTable) {
                if ((this.bitField0_ & 16) != 16 || this.qualifiedNameTable_ == QualifiedNameTable.getDefaultInstance()) {
                    this.qualifiedNameTable_ = qualifiedNameTable;
                } else {
                    this.qualifiedNameTable_ = QualifiedNameTable.newBuilder(this.qualifiedNameTable_).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 32;
                }
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }
        }

        private Module(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Module(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Module getDefaultInstance() {
            return defaultInstance;
        }

        public Module getDefaultInstanceForType() {
            return defaultInstance;
        }

        private Module(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r12, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r11 = this;
            r11.<init>();
            r0 = -1;
            r11.memoizedIsInitialized = r0;
            r11.memoizedSerializedSize = r0;
            r11.initFields();
            r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            r1 = 1;
            r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
            r3 = 0;
            r4 = 0;
        L_0x0016:
            r5 = 4;
            r6 = 32;
            r7 = 2;
            if (r3 != 0) goto L_0x0159;
        L_0x001c:
            r8 = r12.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == 0) goto L_0x00f9;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0022:
            r9 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r9) goto L_0x00df;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0026:
            r9 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r9) goto L_0x00c5;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x002a:
            r9 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r9) goto L_0x00ad;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x002e:
            r9 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r10 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r9) goto L_0x0084;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0033:
            r9 = 42;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r9) goto L_0x005c;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0037:
            r9 = 50;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r9) goto L_0x0043;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x003b:
            r8 = r11.parseUnknownField(r12, r2, r13, r8);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0041:
            goto L_0x00f9;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0043:
            r8 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r6) goto L_0x0050;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0047:
            r8 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.annotation_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0050:
            r8 = r11.annotation_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9 = r12.readMessage(r9, r13);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8.add(r9);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x005c:
            r8 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r8 & r7;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 != r7) goto L_0x0067;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0061:
            r8 = r11.qualifiedNameTable_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r10 = r8.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0067:
            r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r12.readMessage(r8, r13);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.qualifiedNameTable_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r10 == 0) goto L_0x007e;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0073:
            r8 = r11.qualifiedNameTable_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r10.mergeFrom(r8);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r10.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.qualifiedNameTable_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x007e:
            r8 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r8 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.bitField0_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0084:
            r8 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r8 & r1;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 != r1) goto L_0x008f;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x0089:
            r8 = r11.stringTable_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r10 = r8.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x008f:
            r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r12.readMessage(r8, r13);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.stringTable_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r10 == 0) goto L_0x00a6;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x009b:
            r8 = r11.stringTable_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r10.mergeFrom(r8);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r10.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.stringTable_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00a6:
            r8 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8 = r8 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.bitField0_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00ad:
            r8 = r12.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9 = r4 & 4;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r9 == r5) goto L_0x00be;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00b5:
            r9 = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.jvmPackageName_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00be:
            r9 = r11.jvmPackageName_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00c5:
            r8 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r7) goto L_0x00d2;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00c9:
            r8 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.metadataParts_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00d2:
            r8 = r11.metadataParts_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9 = r12.readMessage(r9, r13);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8.add(r9);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00df:
            r8 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            if (r8 == r1) goto L_0x00ec;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00e3:
            r8 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r11.packageParts_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
        L_0x00ec:
            r8 = r11.packageParts_;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r9 = r12.readMessage(r9, r13);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            r8.add(r9);	 Catch:{ InvalidProtocolBufferException -> 0x010d, IOException -> 0x00fe }
            goto L_0x0016;
        L_0x00f9:
            r3 = 1;
            goto L_0x0016;
        L_0x00fc:
            r12 = move-exception;
            goto L_0x0113;
        L_0x00fe:
            r12 = move-exception;
            r13 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00fc }
            r12 = r12.getMessage();	 Catch:{ all -> 0x00fc }
            r13.<init>(r12);	 Catch:{ all -> 0x00fc }
            r12 = r13.setUnfinishedMessage(r11);	 Catch:{ all -> 0x00fc }
            throw r12;	 Catch:{ all -> 0x00fc }
        L_0x010d:
            r12 = move-exception;	 Catch:{ all -> 0x00fc }
            r12 = r12.setUnfinishedMessage(r11);	 Catch:{ all -> 0x00fc }
            throw r12;	 Catch:{ all -> 0x00fc }
        L_0x0113:
            r13 = r4 & 1;
            if (r13 != r1) goto L_0x011f;
        L_0x0117:
            r13 = r11.packageParts_;
            r13 = java.util.Collections.unmodifiableList(r13);
            r11.packageParts_ = r13;
        L_0x011f:
            r13 = r4 & 2;
            if (r13 != r7) goto L_0x012b;
        L_0x0123:
            r13 = r11.metadataParts_;
            r13 = java.util.Collections.unmodifiableList(r13);
            r11.metadataParts_ = r13;
        L_0x012b:
            r13 = r4 & 4;
            if (r13 != r5) goto L_0x0137;
        L_0x012f:
            r13 = r11.jvmPackageName_;
            r13 = r13.getUnmodifiableView();
            r11.jvmPackageName_ = r13;
        L_0x0137:
            r13 = r4 & 32;
            if (r13 != r6) goto L_0x0143;
        L_0x013b:
            r13 = r11.annotation_;
            r13 = java.util.Collections.unmodifiableList(r13);
            r11.annotation_ = r13;
        L_0x0143:
            r2.flush();	 Catch:{ IOException -> 0x0146, all -> 0x014d }
        L_0x0146:
            r13 = r0.toByteString();
            r11.unknownFields = r13;
            goto L_0x0155;
        L_0x014d:
            r12 = move-exception;
            r13 = r0.toByteString();
            r11.unknownFields = r13;
            throw r12;
        L_0x0155:
            r11.makeExtensionsImmutable();
            throw r12;
        L_0x0159:
            r12 = r4 & 1;
            if (r12 != r1) goto L_0x0165;
        L_0x015d:
            r12 = r11.packageParts_;
            r12 = java.util.Collections.unmodifiableList(r12);
            r11.packageParts_ = r12;
        L_0x0165:
            r12 = r4 & 2;
            if (r12 != r7) goto L_0x0171;
        L_0x0169:
            r12 = r11.metadataParts_;
            r12 = java.util.Collections.unmodifiableList(r12);
            r11.metadataParts_ = r12;
        L_0x0171:
            r12 = r4 & 4;
            if (r12 != r5) goto L_0x017d;
        L_0x0175:
            r12 = r11.jvmPackageName_;
            r12 = r12.getUnmodifiableView();
            r11.jvmPackageName_ = r12;
        L_0x017d:
            r12 = r4 & 32;
            if (r12 != r6) goto L_0x0189;
        L_0x0181:
            r12 = r11.annotation_;
            r12 = java.util.Collections.unmodifiableList(r12);
            r11.annotation_ = r12;
        L_0x0189:
            r2.flush();	 Catch:{ IOException -> 0x018c, all -> 0x0193 }
        L_0x018c:
            r12 = r0.toByteString();
            r11.unknownFields = r12;
            goto L_0x019b;
        L_0x0193:
            r12 = move-exception;
            r13 = r0.toByteString();
            r11.unknownFields = r13;
            throw r12;
        L_0x019b:
            r11.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.Module.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            defaultInstance.initFields();
        }

        public Parser<Module> getParserForType() {
            return PARSER;
        }

        public List<PackageParts> getPackagePartsList() {
            return this.packageParts_;
        }

        public int getPackagePartsCount() {
            return this.packageParts_.size();
        }

        public PackageParts getPackageParts(int i) {
            return (PackageParts) this.packageParts_.get(i);
        }

        public List<PackageParts> getMetadataPartsList() {
            return this.metadataParts_;
        }

        public int getMetadataPartsCount() {
            return this.metadataParts_.size();
        }

        public PackageParts getMetadataParts(int i) {
            return (PackageParts) this.metadataParts_.get(i);
        }

        public ProtocolStringList getJvmPackageNameList() {
            return this.jvmPackageName_;
        }

        public boolean hasStringTable() {
            return (this.bitField0_ & 1) == 1;
        }

        public StringTable getStringTable() {
            return this.stringTable_;
        }

        public boolean hasQualifiedNameTable() {
            return (this.bitField0_ & 2) == 2;
        }

        public QualifiedNameTable getQualifiedNameTable() {
            return this.qualifiedNameTable_;
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        private void initFields() {
            this.packageParts_ = Collections.emptyList();
            this.metadataParts_ = Collections.emptyList();
            this.jvmPackageName_ = LazyStringArrayList.EMPTY;
            this.stringTable_ = StringTable.getDefaultInstance();
            this.qualifiedNameTable_ = QualifiedNameTable.getDefaultInstance();
            this.annotation_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            int i = 0;
            while (i < getPackagePartsCount()) {
                if (getPackageParts(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            i = 0;
            while (i < getMetadataPartsCount()) {
                if (getMetadataParts(i).isInitialized()) {
                    i++;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasQualifiedNameTable() || getQualifiedNameTable().isInitialized()) {
                i = 0;
                while (i < getAnnotationCount()) {
                    if (getAnnotation(i).isInitialized()) {
                        i++;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i;
            getSerializedSize();
            int i2 = 0;
            for (i = 0; i < this.packageParts_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.packageParts_.get(i));
            }
            for (i = 0; i < this.metadataParts_.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.metadataParts_.get(i));
            }
            for (i = 0; i < this.jvmPackageName_.size(); i++) {
                codedOutputStream.writeBytes(3, this.jvmPackageName_.getByteString(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(4, this.stringTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(5, this.qualifiedNameTable_);
            }
            while (i2 < this.annotation_.size()) {
                codedOutputStream.writeMessage(6, (MessageLite) this.annotation_.get(i2));
                i2++;
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            i = 0;
            int i3 = 0;
            for (i2 = 0; i2 < this.packageParts_.size(); i2++) {
                i3 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.packageParts_.get(i2));
            }
            for (i2 = 0; i2 < this.metadataParts_.size(); i2++) {
                i3 += CodedOutputStream.computeMessageSize(2, (MessageLite) this.metadataParts_.get(i2));
            }
            int i4 = 0;
            for (i2 = 0; i2 < this.jvmPackageName_.size(); i2++) {
                i4 += CodedOutputStream.computeBytesSizeNoTag(this.jvmPackageName_.getByteString(i2));
            }
            i3 = (i3 + i4) + (getJvmPackageNameList().size() * 1);
            if ((this.bitField0_ & 1) == 1) {
                i3 += CodedOutputStream.computeMessageSize(4, this.stringTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i3 += CodedOutputStream.computeMessageSize(5, this.qualifiedNameTable_);
            }
            while (i < this.annotation_.size()) {
                i3 += CodedOutputStream.computeMessageSize(6, (MessageLite) this.annotation_.get(i));
                i++;
            }
            i3 += this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static Module parseFrom(InputStream inputStream) throws IOException {
            return (Module) PARSER.parseFrom(inputStream);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Module module) {
            return newBuilder().mergeFrom(module);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class PackageParts extends GeneratedMessageLite implements PackagePartsOrBuilder {
        public static Parser<PackageParts> PARSER = new C185131();
        private static final PackageParts defaultInstance = new PackageParts(true);
        private int bitField0_;
        private int classWithJvmPackageNamePackageIdMemoizedSerializedSize;
        private List<Integer> classWithJvmPackageNamePackageId_;
        private LazyStringList classWithJvmPackageNameShortName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int multifileFacadeShortNameIdMemoizedSerializedSize;
        private List<Integer> multifileFacadeShortNameId_;
        private LazyStringList multifileFacadeShortName_;
        private Object packageFqName_;
        private LazyStringList shortClassName_;
        private final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf$PackageParts$1 */
        static class C185131 extends AbstractParser<PackageParts> {
            C185131() {
            }

            public PackageParts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageParts(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<PackageParts, Builder> implements PackagePartsOrBuilder {
            private int bitField0_;
            private List<Integer> classWithJvmPackageNamePackageId_ = Collections.emptyList();
            private LazyStringList classWithJvmPackageNameShortName_ = LazyStringArrayList.EMPTY;
            private List<Integer> multifileFacadeShortNameId_ = Collections.emptyList();
            private LazyStringList multifileFacadeShortName_ = LazyStringArrayList.EMPTY;
            private Object packageFqName_ = "";
            private LazyStringList shortClassName_ = LazyStringArrayList.EMPTY;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public PackageParts getDefaultInstanceForType() {
                return PackageParts.getDefaultInstance();
            }

            public PackageParts build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public PackageParts buildPartial() {
                PackageParts packageParts = new PackageParts((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                packageParts.packageFqName_ = this.packageFqName_;
                if ((this.bitField0_ & 2) == 2) {
                    this.shortClassName_ = this.shortClassName_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                packageParts.shortClassName_ = this.shortClassName_;
                if ((this.bitField0_ & 4) == 4) {
                    this.multifileFacadeShortNameId_ = Collections.unmodifiableList(this.multifileFacadeShortNameId_);
                    this.bitField0_ &= -5;
                }
                packageParts.multifileFacadeShortNameId_ = this.multifileFacadeShortNameId_;
                if ((this.bitField0_ & 8) == 8) {
                    this.multifileFacadeShortName_ = this.multifileFacadeShortName_.getUnmodifiableView();
                    this.bitField0_ &= -9;
                }
                packageParts.multifileFacadeShortName_ = this.multifileFacadeShortName_;
                if ((this.bitField0_ & 16) == 16) {
                    this.classWithJvmPackageNameShortName_ = this.classWithJvmPackageNameShortName_.getUnmodifiableView();
                    this.bitField0_ &= -17;
                }
                packageParts.classWithJvmPackageNameShortName_ = this.classWithJvmPackageNameShortName_;
                if ((this.bitField0_ & 32) == 32) {
                    this.classWithJvmPackageNamePackageId_ = Collections.unmodifiableList(this.classWithJvmPackageNamePackageId_);
                    this.bitField0_ &= -33;
                }
                packageParts.classWithJvmPackageNamePackageId_ = this.classWithJvmPackageNamePackageId_;
                packageParts.bitField0_ = i;
                return packageParts;
            }

            public Builder mergeFrom(PackageParts packageParts) {
                if (packageParts == PackageParts.getDefaultInstance()) {
                    return this;
                }
                if (packageParts.hasPackageFqName()) {
                    this.bitField0_ |= 1;
                    this.packageFqName_ = packageParts.packageFqName_;
                }
                if (!packageParts.shortClassName_.isEmpty()) {
                    if (this.shortClassName_.isEmpty()) {
                        this.shortClassName_ = packageParts.shortClassName_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureShortClassNameIsMutable();
                        this.shortClassName_.addAll(packageParts.shortClassName_);
                    }
                }
                if (!packageParts.multifileFacadeShortNameId_.isEmpty()) {
                    if (this.multifileFacadeShortNameId_.isEmpty()) {
                        this.multifileFacadeShortNameId_ = packageParts.multifileFacadeShortNameId_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureMultifileFacadeShortNameIdIsMutable();
                        this.multifileFacadeShortNameId_.addAll(packageParts.multifileFacadeShortNameId_);
                    }
                }
                if (!packageParts.multifileFacadeShortName_.isEmpty()) {
                    if (this.multifileFacadeShortName_.isEmpty()) {
                        this.multifileFacadeShortName_ = packageParts.multifileFacadeShortName_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureMultifileFacadeShortNameIsMutable();
                        this.multifileFacadeShortName_.addAll(packageParts.multifileFacadeShortName_);
                    }
                }
                if (!packageParts.classWithJvmPackageNameShortName_.isEmpty()) {
                    if (this.classWithJvmPackageNameShortName_.isEmpty()) {
                        this.classWithJvmPackageNameShortName_ = packageParts.classWithJvmPackageNameShortName_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureClassWithJvmPackageNameShortNameIsMutable();
                        this.classWithJvmPackageNameShortName_.addAll(packageParts.classWithJvmPackageNameShortName_);
                    }
                }
                if (!packageParts.classWithJvmPackageNamePackageId_.isEmpty()) {
                    if (this.classWithJvmPackageNamePackageId_.isEmpty()) {
                        this.classWithJvmPackageNamePackageId_ = packageParts.classWithJvmPackageNamePackageId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureClassWithJvmPackageNamePackageIdIsMutable();
                        this.classWithJvmPackageNamePackageId_.addAll(packageParts.classWithJvmPackageNamePackageId_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(packageParts.unknownFields));
                return this;
            }

            public final boolean isInitialized() {
                return hasPackageFqName();
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                PackageParts packageParts;
                PackageParts packageParts2 = null;
                try {
                    PackageParts packageParts3 = (PackageParts) PackageParts.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (packageParts3 != null) {
                        mergeFrom(packageParts3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    packageParts = (PackageParts) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2;
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    packageParts2 = packageParts;
                }
                if (packageParts2 != null) {
                    mergeFrom(packageParts2);
                }
                throw codedInputStream2;
            }

            public boolean hasPackageFqName() {
                return (this.bitField0_ & 1) == 1;
            }

            private void ensureShortClassNameIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.shortClassName_ = new LazyStringArrayList(this.shortClassName_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureMultifileFacadeShortNameIdIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.multifileFacadeShortNameId_ = new ArrayList(this.multifileFacadeShortNameId_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureMultifileFacadeShortNameIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.multifileFacadeShortName_ = new LazyStringArrayList(this.multifileFacadeShortName_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureClassWithJvmPackageNameShortNameIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.classWithJvmPackageNameShortName_ = new LazyStringArrayList(this.classWithJvmPackageNameShortName_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureClassWithJvmPackageNamePackageIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.classWithJvmPackageNamePackageId_ = new ArrayList(this.classWithJvmPackageNamePackageId_);
                    this.bitField0_ |= 32;
                }
            }
        }

        private PackageParts(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.multifileFacadeShortNameIdMemoizedSerializedSize = -1;
            this.classWithJvmPackageNamePackageIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private PackageParts(boolean z) {
            this.multifileFacadeShortNameIdMemoizedSerializedSize = -1;
            this.classWithJvmPackageNamePackageIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static PackageParts getDefaultInstance() {
            return defaultInstance;
        }

        public PackageParts getDefaultInstanceForType() {
            return defaultInstance;
        }

        private PackageParts(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r14, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r15) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r13 = this;
            r13.<init>();
            r0 = -1;
            r13.multifileFacadeShortNameIdMemoizedSerializedSize = r0;
            r13.classWithJvmPackageNamePackageIdMemoizedSerializedSize = r0;
            r13.memoizedIsInitialized = r0;
            r13.memoizedSerializedSize = r0;
            r13.initFields();
            r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            r1 = 1;
            r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
            r3 = 0;
            r4 = 0;
        L_0x001a:
            r5 = 2;
            r6 = 8;
            r7 = 16;
            r8 = 4;
            r9 = 32;
            if (r3 != 0) goto L_0x01b2;
        L_0x0024:
            r10 = r14.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == 0) goto L_0x0146;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x002a:
            r11 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x0139;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x002e:
            r11 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x0121;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0032:
            r11 = 24;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x0105;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0036:
            r11 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x00d1;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x003a:
            r11 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x00b9;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x003e:
            r11 = 42;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x00a1;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0042:
            r11 = 48;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x0085;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0046:
            r11 = 50;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r11) goto L_0x0052;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x004a:
            r10 = r13.parseUnknownField(r14, r2, r15, r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 != 0) goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0050:
            goto L_0x0146;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0052:
            r10 = r14.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r10 = r14.pushLimit(r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 == r9) goto L_0x006d;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x005e:
            r11 = r14.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 <= 0) goto L_0x006d;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0064:
            r11 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.classWithJvmPackageNamePackageId_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x006d:
            r11 = r14.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 <= 0) goto L_0x0081;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0073:
            r11 = r13.classWithJvmPackageNamePackageId_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r12 = r14.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r12 = java.lang.Integer.valueOf(r12);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.add(r12);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x006d;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0081:
            r14.popLimit(r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0085:
            r10 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r9) goto L_0x0092;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0089:
            r10 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r10.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.classWithJvmPackageNamePackageId_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0092:
            r10 = r13.classWithJvmPackageNamePackageId_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r14.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r10.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00a1:
            r10 = r14.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r4 & 16;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 == r7) goto L_0x00b2;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00a9:
            r11 = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.classWithJvmPackageNameShortName_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r4 = r4 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00b2:
            r11 = r13.classWithJvmPackageNameShortName_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00b9:
            r10 = r14.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r4 & 8;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 == r6) goto L_0x00ca;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00c1:
            r11 = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.multifileFacadeShortName_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r4 = r4 | 8;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00ca:
            r11 = r13.multifileFacadeShortName_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00d1:
            r10 = r14.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r10 = r14.pushLimit(r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r4 & 4;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 == r8) goto L_0x00ec;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00dd:
            r11 = r14.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 <= 0) goto L_0x00ec;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00e3:
            r11 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.multifileFacadeShortNameId_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00ec:
            r11 = r14.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 <= 0) goto L_0x0100;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x00f2:
            r11 = r13.multifileFacadeShortNameId_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r12 = r14.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r12 = java.lang.Integer.valueOf(r12);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.add(r12);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x00ec;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0100:
            r14.popLimit(r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0105:
            r10 = r4 & 4;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r10 == r8) goto L_0x0112;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0109:
            r10 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r10.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.multifileFacadeShortNameId_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0112:
            r10 = r13.multifileFacadeShortNameId_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r14.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r10.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0121:
            r10 = r14.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            if (r11 == r5) goto L_0x0132;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0129:
            r11 = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.shortClassName_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0132:
            r11 = r13.shortClassName_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
        L_0x0139:
            r10 = r14.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r13.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r11 = r11 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.bitField0_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            r13.packageFqName_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x015a, IOException -> 0x014b }
            goto L_0x001a;
        L_0x0146:
            r3 = 1;
            goto L_0x001a;
        L_0x0149:
            r14 = move-exception;
            goto L_0x0160;
        L_0x014b:
            r14 = move-exception;
            r15 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0149 }
            r14 = r14.getMessage();	 Catch:{ all -> 0x0149 }
            r15.<init>(r14);	 Catch:{ all -> 0x0149 }
            r14 = r15.setUnfinishedMessage(r13);	 Catch:{ all -> 0x0149 }
            throw r14;	 Catch:{ all -> 0x0149 }
        L_0x015a:
            r14 = move-exception;	 Catch:{ all -> 0x0149 }
            r14 = r14.setUnfinishedMessage(r13);	 Catch:{ all -> 0x0149 }
            throw r14;	 Catch:{ all -> 0x0149 }
        L_0x0160:
            r15 = r4 & 2;
            if (r15 != r5) goto L_0x016c;
        L_0x0164:
            r15 = r13.shortClassName_;
            r15 = r15.getUnmodifiableView();
            r13.shortClassName_ = r15;
        L_0x016c:
            r15 = r4 & 4;
            if (r15 != r8) goto L_0x0178;
        L_0x0170:
            r15 = r13.multifileFacadeShortNameId_;
            r15 = java.util.Collections.unmodifiableList(r15);
            r13.multifileFacadeShortNameId_ = r15;
        L_0x0178:
            r15 = r4 & 8;
            if (r15 != r6) goto L_0x0184;
        L_0x017c:
            r15 = r13.multifileFacadeShortName_;
            r15 = r15.getUnmodifiableView();
            r13.multifileFacadeShortName_ = r15;
        L_0x0184:
            r15 = r4 & 16;
            if (r15 != r7) goto L_0x0190;
        L_0x0188:
            r15 = r13.classWithJvmPackageNameShortName_;
            r15 = r15.getUnmodifiableView();
            r13.classWithJvmPackageNameShortName_ = r15;
        L_0x0190:
            r15 = r4 & 32;
            if (r15 != r9) goto L_0x019c;
        L_0x0194:
            r15 = r13.classWithJvmPackageNamePackageId_;
            r15 = java.util.Collections.unmodifiableList(r15);
            r13.classWithJvmPackageNamePackageId_ = r15;
        L_0x019c:
            r2.flush();	 Catch:{ IOException -> 0x019f, all -> 0x01a6 }
        L_0x019f:
            r15 = r0.toByteString();
            r13.unknownFields = r15;
            goto L_0x01ae;
        L_0x01a6:
            r14 = move-exception;
            r15 = r0.toByteString();
            r13.unknownFields = r15;
            throw r14;
        L_0x01ae:
            r13.makeExtensionsImmutable();
            throw r14;
        L_0x01b2:
            r14 = r4 & 2;
            if (r14 != r5) goto L_0x01be;
        L_0x01b6:
            r14 = r13.shortClassName_;
            r14 = r14.getUnmodifiableView();
            r13.shortClassName_ = r14;
        L_0x01be:
            r14 = r4 & 4;
            if (r14 != r8) goto L_0x01ca;
        L_0x01c2:
            r14 = r13.multifileFacadeShortNameId_;
            r14 = java.util.Collections.unmodifiableList(r14);
            r13.multifileFacadeShortNameId_ = r14;
        L_0x01ca:
            r14 = r4 & 8;
            if (r14 != r6) goto L_0x01d6;
        L_0x01ce:
            r14 = r13.multifileFacadeShortName_;
            r14 = r14.getUnmodifiableView();
            r13.multifileFacadeShortName_ = r14;
        L_0x01d6:
            r14 = r4 & 16;
            if (r14 != r7) goto L_0x01e2;
        L_0x01da:
            r14 = r13.classWithJvmPackageNameShortName_;
            r14 = r14.getUnmodifiableView();
            r13.classWithJvmPackageNameShortName_ = r14;
        L_0x01e2:
            r14 = r4 & 32;
            if (r14 != r9) goto L_0x01ee;
        L_0x01e6:
            r14 = r13.classWithJvmPackageNamePackageId_;
            r14 = java.util.Collections.unmodifiableList(r14);
            r13.classWithJvmPackageNamePackageId_ = r14;
        L_0x01ee:
            r2.flush();	 Catch:{ IOException -> 0x01f1, all -> 0x01f8 }
        L_0x01f1:
            r14 = r0.toByteString();
            r13.unknownFields = r14;
            goto L_0x0200;
        L_0x01f8:
            r14 = move-exception;
            r15 = r0.toByteString();
            r13.unknownFields = r15;
            throw r14;
        L_0x0200:
            r13.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf.PackageParts.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            defaultInstance.initFields();
        }

        public Parser<PackageParts> getParserForType() {
            return PARSER;
        }

        public boolean hasPackageFqName() {
            return (this.bitField0_ & 1) == 1;
        }

        public String getPackageFqName() {
            Object obj = this.packageFqName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String toStringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.packageFqName_ = toStringUtf8;
            }
            return toStringUtf8;
        }

        public ByteString getPackageFqNameBytes() {
            Object obj = this.packageFqName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageFqName_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getShortClassNameList() {
            return this.shortClassName_;
        }

        public List<Integer> getMultifileFacadeShortNameIdList() {
            return this.multifileFacadeShortNameId_;
        }

        public ProtocolStringList getMultifileFacadeShortNameList() {
            return this.multifileFacadeShortName_;
        }

        public ProtocolStringList getClassWithJvmPackageNameShortNameList() {
            return this.classWithJvmPackageNameShortName_;
        }

        public List<Integer> getClassWithJvmPackageNamePackageIdList() {
            return this.classWithJvmPackageNamePackageId_;
        }

        private void initFields() {
            this.packageFqName_ = "";
            this.shortClassName_ = LazyStringArrayList.EMPTY;
            this.multifileFacadeShortNameId_ = Collections.emptyList();
            this.multifileFacadeShortName_ = LazyStringArrayList.EMPTY;
            this.classWithJvmPackageNameShortName_ = LazyStringArrayList.EMPTY;
            this.classWithJvmPackageNamePackageId_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            if (hasPackageFqName()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i;
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, getPackageFqNameBytes());
            }
            int i2 = 0;
            for (i = 0; i < this.shortClassName_.size(); i++) {
                codedOutputStream.writeBytes(2, this.shortClassName_.getByteString(i));
            }
            if (getMultifileFacadeShortNameIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(26);
                codedOutputStream.writeRawVarint32(this.multifileFacadeShortNameIdMemoizedSerializedSize);
            }
            for (i = 0; i < this.multifileFacadeShortNameId_.size(); i++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.multifileFacadeShortNameId_.get(i)).intValue());
            }
            for (i = 0; i < this.multifileFacadeShortName_.size(); i++) {
                codedOutputStream.writeBytes(4, this.multifileFacadeShortName_.getByteString(i));
            }
            for (i = 0; i < this.classWithJvmPackageNameShortName_.size(); i++) {
                codedOutputStream.writeBytes(5, this.classWithJvmPackageNameShortName_.getByteString(i));
            }
            if (getClassWithJvmPackageNamePackageIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.classWithJvmPackageNamePackageIdMemoizedSerializedSize);
            }
            while (i2 < this.classWithJvmPackageNamePackageId_.size()) {
                codedOutputStream.writeInt32NoTag(((Integer) this.classWithJvmPackageNamePackageId_.get(i2)).intValue());
                i2++;
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            int i3 = 0;
            i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, getPackageFqNameBytes()) + 0 : 0;
            int i4 = 0;
            for (i2 = 0; i2 < this.shortClassName_.size(); i2++) {
                i4 += CodedOutputStream.computeBytesSizeNoTag(this.shortClassName_.getByteString(i2));
            }
            i = (i + i4) + (getShortClassNameList().size() * 1);
            i4 = 0;
            for (i2 = 0; i2 < this.multifileFacadeShortNameId_.size(); i2++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.multifileFacadeShortNameId_.get(i2)).intValue());
            }
            i += i4;
            if (!getMultifileFacadeShortNameIdList().isEmpty()) {
                i = (i + 1) + CodedOutputStream.computeInt32SizeNoTag(i4);
            }
            this.multifileFacadeShortNameIdMemoizedSerializedSize = i4;
            i4 = 0;
            for (i2 = 0; i2 < this.multifileFacadeShortName_.size(); i2++) {
                i4 += CodedOutputStream.computeBytesSizeNoTag(this.multifileFacadeShortName_.getByteString(i2));
            }
            i = (i + i4) + (getMultifileFacadeShortNameList().size() * 1);
            i4 = 0;
            for (i2 = 0; i2 < this.classWithJvmPackageNameShortName_.size(); i2++) {
                i4 += CodedOutputStream.computeBytesSizeNoTag(this.classWithJvmPackageNameShortName_.getByteString(i2));
            }
            i = (i + i4) + (getClassWithJvmPackageNameShortNameList().size() * 1);
            int i5 = 0;
            while (i3 < this.classWithJvmPackageNamePackageId_.size()) {
                i5 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.classWithJvmPackageNamePackageId_.get(i3)).intValue());
                i3++;
            }
            i += i5;
            if (!getClassWithJvmPackageNamePackageIdList().isEmpty()) {
                i = (i + 1) + CodedOutputStream.computeInt32SizeNoTag(i5);
            }
            this.classWithJvmPackageNamePackageIdMemoizedSerializedSize = i5;
            i += this.unknownFields.size();
            this.memoizedSerializedSize = i;
            return i;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(PackageParts packageParts) {
            return newBuilder().mergeFrom(packageParts);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }
}
