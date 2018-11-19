package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;

public final class JvmProtoBuf {
    public static final GeneratedExtension<Class, Integer> anonymousObjectOriginName = GeneratedMessageLite.newSingularGeneratedExtension(Class.getDefaultInstance(), Integer.valueOf(0), null, null, 103, FieldType.INT32, Integer.class);
    public static final GeneratedExtension<Class, List<Property>> classLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(Class.getDefaultInstance(), Property.getDefaultInstance(), null, 102, FieldType.MESSAGE, false, Property.class);
    public static final GeneratedExtension<Class, Integer> classModuleName = GeneratedMessageLite.newSingularGeneratedExtension(Class.getDefaultInstance(), Integer.valueOf(0), null, null, 101, FieldType.INT32, Integer.class);
    public static final GeneratedExtension<Constructor, JvmMethodSignature> constructorSignature = GeneratedMessageLite.newSingularGeneratedExtension(Constructor.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
    public static final GeneratedExtension<Type, Boolean> isRaw = GeneratedMessageLite.newSingularGeneratedExtension(Type.getDefaultInstance(), Boolean.valueOf(false), null, null, 101, FieldType.BOOL, Boolean.class);
    public static final GeneratedExtension<Function, Integer> lambdaClassOriginName = GeneratedMessageLite.newSingularGeneratedExtension(Function.getDefaultInstance(), Integer.valueOf(0), null, null, 101, FieldType.INT32, Integer.class);
    public static final GeneratedExtension<Function, JvmMethodSignature> methodSignature = GeneratedMessageLite.newSingularGeneratedExtension(Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
    public static final GeneratedExtension<Package, List<Property>> packageLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(Package.getDefaultInstance(), Property.getDefaultInstance(), null, 102, FieldType.MESSAGE, false, Property.class);
    public static final GeneratedExtension<Package, Integer> packageModuleName = GeneratedMessageLite.newSingularGeneratedExtension(Package.getDefaultInstance(), Integer.valueOf(0), null, null, 101, FieldType.INT32, Integer.class);
    public static final GeneratedExtension<Property, JvmPropertySignature> propertySignature = GeneratedMessageLite.newSingularGeneratedExtension(Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmPropertySignature.class);
    public static final GeneratedExtension<Type, List<Annotation>> typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Type.getDefaultInstance(), Annotation.getDefaultInstance(), null, 100, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<TypeParameter, List<Annotation>> typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(TypeParameter.getDefaultInstance(), Annotation.getDefaultInstance(), null, 100, FieldType.MESSAGE, false, Annotation.class);

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new C185141();
        private static final JvmFieldSignature defaultInstance = new JvmFieldSignature(true);
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$1 */
        static class C185141 extends AbstractParser<JvmFieldSignature> {
            C185141() {
            }

            public JvmFieldSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {
            private int bitField0_;
            private int desc_;
            private int name_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
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

            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
            }

            public JvmFieldSignature build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public JvmFieldSignature buildPartial() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmFieldSignature.name_ = this.name_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.desc_ = this.desc_;
                jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            public Builder mergeFrom(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    setName(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    setDesc(jvmFieldSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmFieldSignature.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                JvmFieldSignature jvmFieldSignature;
                JvmFieldSignature jvmFieldSignature2 = null;
                try {
                    JvmFieldSignature jvmFieldSignature3 = (JvmFieldSignature) JvmFieldSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (jvmFieldSignature3 != null) {
                        mergeFrom(jvmFieldSignature3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    jvmFieldSignature = (JvmFieldSignature) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2;
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    jvmFieldSignature2 = jvmFieldSignature;
                }
                if (jvmFieldSignature2 != null) {
                    mergeFrom(jvmFieldSignature2);
                }
                throw codedInputStream2;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            public Builder setDesc(int i) {
                this.bitField0_ |= 2;
                this.desc_ = i;
                return this;
            }
        }

        private JvmFieldSignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private JvmFieldSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static JvmFieldSignature getDefaultInstance() {
            return defaultInstance;
        }

        public JvmFieldSignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        private JvmFieldSignature(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r8) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r6.<init>();
            r0 = -1;
            r6.memoizedIsInitialized = r0;
            r6.memoizedSerializedSize = r0;
            r6.initFields();
            r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            r1 = 1;
            r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
            r3 = 0;
        L_0x0015:
            if (r3 != 0) goto L_0x0074;
        L_0x0017:
            r4 = r7.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 == 0) goto L_0x0045;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x001d:
            r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 == r5) goto L_0x0039;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x0021:
            r5 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 == r5) goto L_0x002c;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x0025:
            r4 = r6.parseUnknownField(r7, r2, r8, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x002b:
            goto L_0x0045;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x002c:
            r4 = r6.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r7.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.desc_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x0039:
            r4 = r6.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r7.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.name_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            goto L_0x0015;
        L_0x0045:
            r3 = 1;
            goto L_0x0015;
        L_0x0047:
            r7 = move-exception;
            goto L_0x005e;
        L_0x0049:
            r7 = move-exception;
            r8 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0047 }
            r7 = r7.getMessage();	 Catch:{ all -> 0x0047 }
            r8.<init>(r7);	 Catch:{ all -> 0x0047 }
            r7 = r8.setUnfinishedMessage(r6);	 Catch:{ all -> 0x0047 }
            throw r7;	 Catch:{ all -> 0x0047 }
        L_0x0058:
            r7 = move-exception;	 Catch:{ all -> 0x0047 }
            r7 = r7.setUnfinishedMessage(r6);	 Catch:{ all -> 0x0047 }
            throw r7;	 Catch:{ all -> 0x0047 }
        L_0x005e:
            r2.flush();	 Catch:{ IOException -> 0x0061, all -> 0x0068 }
        L_0x0061:
            r8 = r0.toByteString();
            r6.unknownFields = r8;
            goto L_0x0070;
        L_0x0068:
            r7 = move-exception;
            r8 = r0.toByteString();
            r6.unknownFields = r8;
            throw r7;
        L_0x0070:
            r6.makeExtensionsImmutable();
            throw r7;
        L_0x0074:
            r2.flush();	 Catch:{ IOException -> 0x0077, all -> 0x007e }
        L_0x0077:
            r7 = r0.toByteString();
            r6.unknownFields = r7;
            goto L_0x0086;
        L_0x007e:
            r7 = move-exception;
            r8 = r0.toByteString();
            r6.unknownFields = r8;
            throw r7;
        L_0x0086:
            r6.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            defaultInstance.initFields();
        }

        public Parser<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getName() {
            return this.name_;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getDesc() {
            return this.desc_;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.desc_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.computeInt32Size(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeInt32Size(2, this.desc_);
            }
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

        public static Builder newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mergeFrom(jvmFieldSignature);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new C185151();
        private static final JvmMethodSignature defaultInstance = new JvmMethodSignature(true);
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$1 */
        static class C185151 extends AbstractParser<JvmMethodSignature> {
            C185151() {
            }

            public JvmMethodSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {
            private int bitField0_;
            private int desc_;
            private int name_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
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

            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
            }

            public JvmMethodSignature build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public JvmMethodSignature buildPartial() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmMethodSignature.name_ = this.name_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.desc_ = this.desc_;
                jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            public Builder mergeFrom(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    setName(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    setDesc(jvmMethodSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmMethodSignature.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2 = null;
                try {
                    JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) JvmMethodSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (jvmMethodSignature3 != null) {
                        mergeFrom(jvmMethodSignature3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    jvmMethodSignature = (JvmMethodSignature) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2;
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    jvmMethodSignature2 = jvmMethodSignature;
                }
                if (jvmMethodSignature2 != null) {
                    mergeFrom(jvmMethodSignature2);
                }
                throw codedInputStream2;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            public Builder setDesc(int i) {
                this.bitField0_ |= 2;
                this.desc_ = i;
                return this;
            }
        }

        private JvmMethodSignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private JvmMethodSignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static JvmMethodSignature getDefaultInstance() {
            return defaultInstance;
        }

        public JvmMethodSignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        private JvmMethodSignature(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r8) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r6.<init>();
            r0 = -1;
            r6.memoizedIsInitialized = r0;
            r6.memoizedSerializedSize = r0;
            r6.initFields();
            r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            r1 = 1;
            r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
            r3 = 0;
        L_0x0015:
            if (r3 != 0) goto L_0x0074;
        L_0x0017:
            r4 = r7.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 == 0) goto L_0x0045;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x001d:
            r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 == r5) goto L_0x0039;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x0021:
            r5 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 == r5) goto L_0x002c;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x0025:
            r4 = r6.parseUnknownField(r7, r2, r8, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x002b:
            goto L_0x0045;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x002c:
            r4 = r6.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r7.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.desc_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
        L_0x0039:
            r4 = r6.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r4 = r7.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            r6.name_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0058, IOException -> 0x0049 }
            goto L_0x0015;
        L_0x0045:
            r3 = 1;
            goto L_0x0015;
        L_0x0047:
            r7 = move-exception;
            goto L_0x005e;
        L_0x0049:
            r7 = move-exception;
            r8 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0047 }
            r7 = r7.getMessage();	 Catch:{ all -> 0x0047 }
            r8.<init>(r7);	 Catch:{ all -> 0x0047 }
            r7 = r8.setUnfinishedMessage(r6);	 Catch:{ all -> 0x0047 }
            throw r7;	 Catch:{ all -> 0x0047 }
        L_0x0058:
            r7 = move-exception;	 Catch:{ all -> 0x0047 }
            r7 = r7.setUnfinishedMessage(r6);	 Catch:{ all -> 0x0047 }
            throw r7;	 Catch:{ all -> 0x0047 }
        L_0x005e:
            r2.flush();	 Catch:{ IOException -> 0x0061, all -> 0x0068 }
        L_0x0061:
            r8 = r0.toByteString();
            r6.unknownFields = r8;
            goto L_0x0070;
        L_0x0068:
            r7 = move-exception;
            r8 = r0.toByteString();
            r6.unknownFields = r8;
            throw r7;
        L_0x0070:
            r6.makeExtensionsImmutable();
            throw r7;
        L_0x0074:
            r2.flush();	 Catch:{ IOException -> 0x0077, all -> 0x007e }
        L_0x0077:
            r7 = r0.toByteString();
            r6.unknownFields = r7;
            goto L_0x0086;
        L_0x007e:
            r7 = move-exception;
            r8 = r0.toByteString();
            r6.unknownFields = r8;
            throw r7;
        L_0x0086:
            r6.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            defaultInstance.initFields();
        }

        public Parser<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public int getName() {
            return this.name_;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public int getDesc() {
            return this.desc_;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.desc_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.computeInt32Size(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeInt32Size(2, this.desc_);
            }
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

        public static Builder newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mergeFrom(jvmMethodSignature);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new C185161();
        private static final JvmPropertySignature defaultInstance = new JvmPropertySignature(true);
        private int bitField0_;
        private JvmFieldSignature field_;
        private JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private JvmMethodSignature setter_;
        private JvmMethodSignature syntheticMethod_;
        private final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$1 */
        static class C185161 extends AbstractParser<JvmPropertySignature> {
            C185161() {
            }

            public JvmPropertySignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {
            private int bitField0_;
            private JvmFieldSignature field_ = JvmFieldSignature.getDefaultInstance();
            private JvmMethodSignature getter_ = JvmMethodSignature.getDefaultInstance();
            private JvmMethodSignature setter_ = JvmMethodSignature.getDefaultInstance();
            private JvmMethodSignature syntheticMethod_ = JvmMethodSignature.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
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

            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
            }

            public JvmPropertySignature build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public JvmPropertySignature buildPartial() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmPropertySignature.field_ = this.field_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.syntheticMethod_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.getter_ = this.getter_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.setter_ = this.setter_;
                jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            public Builder mergeFrom(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    mergeField(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    mergeSyntheticMethod(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    mergeGetter(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    mergeSetter(jvmPropertySignature.getSetter());
                }
                setUnknownFields(getUnknownFields().concat(jvmPropertySignature.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                JvmPropertySignature jvmPropertySignature;
                JvmPropertySignature jvmPropertySignature2 = null;
                try {
                    JvmPropertySignature jvmPropertySignature3 = (JvmPropertySignature) JvmPropertySignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (jvmPropertySignature3 != null) {
                        mergeFrom(jvmPropertySignature3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    jvmPropertySignature = (JvmPropertySignature) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2;
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    jvmPropertySignature2 = jvmPropertySignature;
                }
                if (jvmPropertySignature2 != null) {
                    mergeFrom(jvmPropertySignature2);
                }
                throw codedInputStream2;
            }

            public Builder mergeField(JvmFieldSignature jvmFieldSignature) {
                if ((this.bitField0_ & 1) != 1 || this.field_ == JvmFieldSignature.getDefaultInstance()) {
                    this.field_ = jvmFieldSignature;
                } else {
                    this.field_ = JvmFieldSignature.newBuilder(this.field_).mergeFrom(jvmFieldSignature).buildPartial();
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeSyntheticMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 2) != 2 || this.syntheticMethod_ == JvmMethodSignature.getDefaultInstance()) {
                    this.syntheticMethod_ = jvmMethodSignature;
                } else {
                    this.syntheticMethod_ = JvmMethodSignature.newBuilder(this.syntheticMethod_).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeGetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 4) != 4 || this.getter_ == JvmMethodSignature.getDefaultInstance()) {
                    this.getter_ = jvmMethodSignature;
                } else {
                    this.getter_ = JvmMethodSignature.newBuilder(this.getter_).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeSetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 8) != 8 || this.setter_ == JvmMethodSignature.getDefaultInstance()) {
                    this.setter_ = jvmMethodSignature;
                } else {
                    this.setter_ = JvmMethodSignature.newBuilder(this.setter_).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }
        }

        private JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private JvmPropertySignature(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static JvmPropertySignature getDefaultInstance() {
            return defaultInstance;
        }

        public JvmPropertySignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        private JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r7.<init>();
            r0 = -1;
            r7.memoizedIsInitialized = r0;
            r7.memoizedSerializedSize = r0;
            r7.initFields();
            r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            r1 = 1;
            r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
            r3 = 0;
        L_0x0015:
            if (r3 != 0) goto L_0x010c;
        L_0x0017:
            r4 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 == 0) goto L_0x00dc;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x001d:
            r5 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 == r5) goto L_0x00b3;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0022:
            r5 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 == r5) goto L_0x0089;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0026:
            r5 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 == r5) goto L_0x0060;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x002a:
            r5 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 == r5) goto L_0x0036;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x002e:
            r4 = r7.parseUnknownField(r8, r2, r9, r4);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0034:
            goto L_0x00dc;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0036:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 & r5;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 != r5) goto L_0x0043;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x003d:
            r4 = r7.setter_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0043:
            r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r8.readMessage(r4, r9);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.setter_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r6 == 0) goto L_0x005a;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x004f:
            r4 = r7.setter_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6.mergeFrom(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.setter_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x005a:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0060:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r5 = 4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 & r5;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 != r5) goto L_0x006c;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0066:
            r4 = r7.getter_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x006c:
            r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r8.readMessage(r4, r9);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.getter_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r6 == 0) goto L_0x0083;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0078:
            r4 = r7.getter_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6.mergeFrom(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.getter_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0083:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0089:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r5 = 2;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 & r5;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 != r5) goto L_0x0095;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x008f:
            r4 = r7.syntheticMethod_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x0095:
            r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r8.readMessage(r4, r9);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.syntheticMethod_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r6 == 0) goto L_0x00ac;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x00a1:
            r4 = r7.syntheticMethod_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6.mergeFrom(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.syntheticMethod_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x00ac:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x00b3:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 & r1;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r4 != r1) goto L_0x00be;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x00b8:
            r4 = r7.field_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x00be:
            r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r8.readMessage(r4, r9);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.field_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            if (r6 == 0) goto L_0x00d5;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x00ca:
            r4 = r7.field_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r6.mergeFrom(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.field_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
        L_0x00d5:
            r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            goto L_0x0015;
        L_0x00dc:
            r3 = 1;
            goto L_0x0015;
        L_0x00df:
            r8 = move-exception;
            goto L_0x00f6;
        L_0x00e1:
            r8 = move-exception;
            r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00df }
            r8 = r8.getMessage();	 Catch:{ all -> 0x00df }
            r9.<init>(r8);	 Catch:{ all -> 0x00df }
            r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x00df }
            throw r8;	 Catch:{ all -> 0x00df }
        L_0x00f0:
            r8 = move-exception;	 Catch:{ all -> 0x00df }
            r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x00df }
            throw r8;	 Catch:{ all -> 0x00df }
        L_0x00f6:
            r2.flush();	 Catch:{ IOException -> 0x00f9, all -> 0x0100 }
        L_0x00f9:
            r9 = r0.toByteString();
            r7.unknownFields = r9;
            goto L_0x0108;
        L_0x0100:
            r8 = move-exception;
            r9 = r0.toByteString();
            r7.unknownFields = r9;
            throw r8;
        L_0x0108:
            r7.makeExtensionsImmutable();
            throw r8;
        L_0x010c:
            r2.flush();	 Catch:{ IOException -> 0x010f, all -> 0x0116 }
        L_0x010f:
            r8 = r0.toByteString();
            r7.unknownFields = r8;
            goto L_0x011e;
        L_0x0116:
            r8 = move-exception;
            r9 = r0.toByteString();
            r7.unknownFields = r9;
            throw r8;
        L_0x011e:
            r7.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            defaultInstance.initFields();
        }

        public Parser<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        public boolean hasField() {
            return (this.bitField0_ & 1) == 1;
        }

        public JvmFieldSignature getField() {
            return this.field_;
        }

        public boolean hasSyntheticMethod() {
            return (this.bitField0_ & 2) == 2;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.syntheticMethod_;
        }

        public boolean hasGetter() {
            return (this.bitField0_ & 4) == 4;
        }

        public JvmMethodSignature getGetter() {
            return this.getter_;
        }

        public boolean hasSetter() {
            return (this.bitField0_ & 8) == 8;
        }

        public JvmMethodSignature getSetter() {
            return this.setter_;
        }

        private void initFields() {
            this.field_ = JvmFieldSignature.getDefaultInstance();
            this.syntheticMethod_ = JvmMethodSignature.getDefaultInstance();
            this.getter_ = JvmMethodSignature.getDefaultInstance();
            this.setter_ = JvmMethodSignature.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, this.setter_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.bitField0_ & 1) == 1) {
                i = 0 + CodedOutputStream.computeMessageSize(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeMessageSize(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeMessageSize(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeMessageSize(4, this.setter_);
            }
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

        public static Builder newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mergeFrom(jvmPropertySignature);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new C185171();
        private static final StringTableTypes defaultInstance = new StringTableTypes(true);
        private int localNameMemoizedSerializedSize;
        private List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Record> record_;
        private final ByteString unknownFields;

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$1 */
        static class C185171 extends AbstractParser<StringTableTypes> {
            C185171() {
            }

            public StringTableTypes parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {
            private int bitField0_;
            private List<Integer> localName_ = Collections.emptyList();
            private List<Record> record_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
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

            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
            }

            public StringTableTypes build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public StringTableTypes buildPartial() {
                StringTableTypes stringTableTypes = new StringTableTypes((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                if ((this.bitField0_ & 1) == 1) {
                    this.record_ = Collections.unmodifiableList(this.record_);
                    this.bitField0_ &= -2;
                }
                stringTableTypes.record_ = this.record_;
                if ((this.bitField0_ & 2) == 2) {
                    this.localName_ = Collections.unmodifiableList(this.localName_);
                    this.bitField0_ &= -3;
                }
                stringTableTypes.localName_ = this.localName_;
                return stringTableTypes;
            }

            public Builder mergeFrom(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.record_.isEmpty()) {
                        this.record_ = stringTableTypes.record_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordIsMutable();
                        this.record_.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.localName_.isEmpty()) {
                        this.localName_ = stringTableTypes.localName_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureLocalNameIsMutable();
                        this.localName_.addAll(stringTableTypes.localName_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTableTypes.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                StringTableTypes stringTableTypes;
                StringTableTypes stringTableTypes2 = null;
                try {
                    StringTableTypes stringTableTypes3 = (StringTableTypes) StringTableTypes.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (stringTableTypes3 != null) {
                        mergeFrom(stringTableTypes3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    stringTableTypes = (StringTableTypes) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2;
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    stringTableTypes2 = stringTableTypes;
                }
                if (stringTableTypes2 != null) {
                    mergeFrom(stringTableTypes2);
                }
                throw codedInputStream2;
            }

            private void ensureRecordIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.record_ = new ArrayList(this.record_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureLocalNameIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.localName_ = new ArrayList(this.localName_);
                    this.bitField0_ |= 2;
                }
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static Parser<Record> PARSER = new C185181();
            private static final Record defaultInstance = new Record(true);
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Operation operation_;
            private int predefinedIndex_;
            private int range_;
            private int replaceCharMemoizedSerializedSize;
            private List<Integer> replaceChar_;
            private Object string_;
            private int substringIndexMemoizedSerializedSize;
            private List<Integer> substringIndex_;
            private final ByteString unknownFields;

            public enum Operation implements EnumLite {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static EnumLiteMap<Operation> internalValueMap;
                private final int value;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$1 */
                static class C176041 implements EnumLiteMap<Operation> {
                    C176041() {
                    }

                    public Operation findValueByNumber(int i) {
                        return Operation.valueOf(i);
                    }
                }

                static {
                    internalValueMap = new C176041();
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    switch (i) {
                        case 0:
                            return NONE;
                        case 1:
                            return INTERNAL_TO_CLASS_ID;
                        case 2:
                            return DESC_TO_CLASS_ID;
                        default:
                            return 0;
                    }
                }

                private Operation(int i, int i2) {
                    this.value = i2;
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1 */
            static class C185181 extends AbstractParser<Record> {
                C185181() {
                }

                public Record parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Record(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {
                private int bitField0_;
                private Operation operation_ = Operation.NONE;
                private int predefinedIndex_;
                private int range_ = 1;
                private List<Integer> replaceChar_ = Collections.emptyList();
                private Object string_ = "";
                private List<Integer> substringIndex_ = Collections.emptyList();

                private void maybeForceBuilderInitialization() {
                }

                public final boolean isInitialized() {
                    return true;
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

                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
                }

                public Record build() {
                    Object buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                }

                public Record buildPartial() {
                    Record record = new Record((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    record.range_ = this.range_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.predefinedIndex_ = this.predefinedIndex_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.string_ = this.string_;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.operation_ = this.operation_;
                    if ((this.bitField0_ & 16) == 16) {
                        this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        this.bitField0_ &= -17;
                    }
                    record.substringIndex_ = this.substringIndex_;
                    if ((this.bitField0_ & 32) == 32) {
                        this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                        this.bitField0_ &= -33;
                    }
                    record.replaceChar_ = this.replaceChar_;
                    record.bitField0_ = i2;
                    return record;
                }

                public Builder mergeFrom(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        setRange(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        setPredefinedIndex(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.bitField0_ |= 4;
                        this.string_ = record.string_;
                    }
                    if (record.hasOperation()) {
                        setOperation(record.getOperation());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.substringIndex_.isEmpty()) {
                            this.substringIndex_ = record.substringIndex_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureSubstringIndexIsMutable();
                            this.substringIndex_.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.replaceChar_.isEmpty()) {
                            this.replaceChar_ = record.replaceChar_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureReplaceCharIsMutable();
                            this.replaceChar_.addAll(record.replaceChar_);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(record.unknownFields));
                    return this;
                }

                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Record record;
                    Record record2 = null;
                    try {
                        Record record3 = (Record) Record.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (record3 != null) {
                            mergeFrom(record3);
                        }
                        return this;
                    } catch (CodedInputStream codedInputStream2) {
                        record = (Record) codedInputStream2.getUnfinishedMessage();
                        throw codedInputStream2;
                    } catch (Throwable th) {
                        codedInputStream2 = th;
                        record2 = record;
                    }
                    if (record2 != null) {
                        mergeFrom(record2);
                    }
                    throw codedInputStream2;
                }

                public Builder setRange(int i) {
                    this.bitField0_ |= 1;
                    this.range_ = i;
                    return this;
                }

                public Builder setPredefinedIndex(int i) {
                    this.bitField0_ |= 2;
                    this.predefinedIndex_ = i;
                    return this;
                }

                public Builder setOperation(Operation operation) {
                    if (operation == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 8;
                    this.operation_ = operation;
                    return this;
                }

                private void ensureSubstringIndexIsMutable() {
                    if ((this.bitField0_ & 16) != 16) {
                        this.substringIndex_ = new ArrayList(this.substringIndex_);
                        this.bitField0_ |= 16;
                    }
                }

                private void ensureReplaceCharIsMutable() {
                    if ((this.bitField0_ & 32) != 32) {
                        this.replaceChar_ = new ArrayList(this.replaceChar_);
                        this.bitField0_ |= 32;
                    }
                }
            }

            private Record(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private Record(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            public static Record getDefaultInstance() {
                return defaultInstance;
            }

            public Record getDefaultInstanceForType() {
                return defaultInstance;
            }

            private Record(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r12, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r11 = this;
                r11.<init>();
                r0 = -1;
                r11.substringIndexMemoizedSerializedSize = r0;
                r11.replaceCharMemoizedSerializedSize = r0;
                r11.memoizedIsInitialized = r0;
                r11.memoizedSerializedSize = r0;
                r11.initFields();
                r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                r1 = 1;
                r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                r3 = 0;
                r4 = 0;
            L_0x001a:
                r5 = 32;
                r6 = 16;
                if (r3 != 0) goto L_0x0174;
            L_0x0020:
                r7 = r12.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == 0) goto L_0x012c;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0026:
                r8 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r8) goto L_0x011f;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x002a:
                if (r7 == r6) goto L_0x0111;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x002c:
                r9 = 24;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r9) goto L_0x00f6;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0030:
                if (r7 == r5) goto L_0x00da;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0032:
                r8 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r8) goto L_0x00a6;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0036:
                r8 = 40;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r8) goto L_0x008a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x003a:
                r8 = 42;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r8) goto L_0x0057;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x003e:
                r8 = 50;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r8) goto L_0x004a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0042:
                r7 = r11.parseUnknownField(r12, r2, r13, r7);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 != 0) goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0048:
                goto L_0x012c;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x004a:
                r7 = r12.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = r8 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.bitField0_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.string_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0057:
                r7 = r12.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7 = r12.pushLimit(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r8 == r5) goto L_0x0072;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0063:
                r8 = r12.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r8 <= 0) goto L_0x0072;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0069:
                r8 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.replaceChar_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0072:
                r8 = r12.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r8 <= 0) goto L_0x0086;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0078:
                r8 = r11.replaceChar_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r9 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r9 = java.lang.Integer.valueOf(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8.add(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x0072;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0086:
                r12.popLimit(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x008a:
                r7 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r5) goto L_0x0097;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x008e:
                r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.replaceChar_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0097:
                r7 = r11.replaceChar_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = java.lang.Integer.valueOf(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00a6:
                r7 = r12.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7 = r12.pushLimit(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = r4 & 16;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r8 == r6) goto L_0x00c1;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00b2:
                r8 = r12.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r8 <= 0) goto L_0x00c1;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00b8:
                r8 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.substringIndex_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r4 = r4 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00c1:
                r8 = r12.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r8 <= 0) goto L_0x00d5;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00c7:
                r8 = r11.substringIndex_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r9 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r9 = java.lang.Integer.valueOf(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8.add(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x00c1;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00d5:
                r12.popLimit(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00da:
                r7 = r4 & 16;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r7 == r6) goto L_0x00e7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00de:
                r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.substringIndex_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r4 = r4 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00e7:
                r7 = r11.substringIndex_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r8 = java.lang.Integer.valueOf(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x00f6:
                r9 = r12.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r10 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.valueOf(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                if (r10 != 0) goto L_0x0108;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0100:
                r2.writeRawVarint32(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r2.writeRawVarint32(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0108:
                r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7 = r7 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.operation_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x0111:
                r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7 = r7 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.predefinedIndex_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
            L_0x011f:
                r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7 = r7 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r7 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                r11.range_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0140, IOException -> 0x0131 }
                goto L_0x001a;
            L_0x012c:
                r3 = 1;
                goto L_0x001a;
            L_0x012f:
                r12 = move-exception;
                goto L_0x0146;
            L_0x0131:
                r12 = move-exception;
                r13 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x012f }
                r12 = r12.getMessage();	 Catch:{ all -> 0x012f }
                r13.<init>(r12);	 Catch:{ all -> 0x012f }
                r12 = r13.setUnfinishedMessage(r11);	 Catch:{ all -> 0x012f }
                throw r12;	 Catch:{ all -> 0x012f }
            L_0x0140:
                r12 = move-exception;	 Catch:{ all -> 0x012f }
                r12 = r12.setUnfinishedMessage(r11);	 Catch:{ all -> 0x012f }
                throw r12;	 Catch:{ all -> 0x012f }
            L_0x0146:
                r13 = r4 & 16;
                if (r13 != r6) goto L_0x0152;
            L_0x014a:
                r13 = r11.substringIndex_;
                r13 = java.util.Collections.unmodifiableList(r13);
                r11.substringIndex_ = r13;
            L_0x0152:
                r13 = r4 & 32;
                if (r13 != r5) goto L_0x015e;
            L_0x0156:
                r13 = r11.replaceChar_;
                r13 = java.util.Collections.unmodifiableList(r13);
                r11.replaceChar_ = r13;
            L_0x015e:
                r2.flush();	 Catch:{ IOException -> 0x0161, all -> 0x0168 }
            L_0x0161:
                r13 = r0.toByteString();
                r11.unknownFields = r13;
                goto L_0x0170;
            L_0x0168:
                r12 = move-exception;
                r13 = r0.toByteString();
                r11.unknownFields = r13;
                throw r12;
            L_0x0170:
                r11.makeExtensionsImmutable();
                throw r12;
            L_0x0174:
                r12 = r4 & 16;
                if (r12 != r6) goto L_0x0180;
            L_0x0178:
                r12 = r11.substringIndex_;
                r12 = java.util.Collections.unmodifiableList(r12);
                r11.substringIndex_ = r12;
            L_0x0180:
                r12 = r4 & 32;
                if (r12 != r5) goto L_0x018c;
            L_0x0184:
                r12 = r11.replaceChar_;
                r12 = java.util.Collections.unmodifiableList(r12);
                r11.replaceChar_ = r12;
            L_0x018c:
                r2.flush();	 Catch:{ IOException -> 0x018f, all -> 0x0196 }
            L_0x018f:
                r12 = r0.toByteString();
                r11.unknownFields = r12;
                goto L_0x019e;
            L_0x0196:
                r12 = move-exception;
                r13 = r0.toByteString();
                r11.unknownFields = r13;
                throw r12;
            L_0x019e:
                r11.makeExtensionsImmutable();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }

            static {
                defaultInstance.initFields();
            }

            public Parser<Record> getParserForType() {
                return PARSER;
            }

            public boolean hasRange() {
                return (this.bitField0_ & 1) == 1;
            }

            public int getRange() {
                return this.range_;
            }

            public boolean hasPredefinedIndex() {
                return (this.bitField0_ & 2) == 2;
            }

            public int getPredefinedIndex() {
                return this.predefinedIndex_;
            }

            public boolean hasString() {
                return (this.bitField0_ & 4) == 4;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String toStringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.string_ = toStringUtf8;
                }
                return toStringUtf8;
            }

            public ByteString getStringBytes() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.string_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasOperation() {
                return (this.bitField0_ & 8) == 8;
            }

            public Operation getOperation() {
                return this.operation_;
            }

            public List<Integer> getSubstringIndexList() {
                return this.substringIndex_;
            }

            public int getSubstringIndexCount() {
                return this.substringIndex_.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.replaceChar_;
            }

            public int getReplaceCharCount() {
                return this.replaceChar_.size();
            }

            private void initFields() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                this.substringIndex_ = Collections.emptyList();
                this.replaceChar_ = Collections.emptyList();
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == (byte) 1) {
                    return true;
                }
                if (b == (byte) 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.writeEnum(3, this.operation_.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.writeRawVarint32(34);
                    codedOutputStream.writeRawVarint32(this.substringIndexMemoizedSerializedSize);
                }
                int i = 0;
                for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.substringIndex_.get(i2)).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.writeRawVarint32(42);
                    codedOutputStream.writeRawVarint32(this.replaceCharMemoizedSerializedSize);
                }
                while (i < this.replaceChar_.size()) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.replaceChar_.get(i)).intValue());
                    i++;
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeBytes(6, getStringBytes());
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
                i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.range_) + 0 : 0;
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.computeInt32Size(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    i += CodedOutputStream.computeEnumSize(3, this.operation_.getNumber());
                }
                int i4 = 0;
                for (i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                    i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.substringIndex_.get(i2)).intValue());
                }
                i += i4;
                if (!getSubstringIndexList().isEmpty()) {
                    i = (i + 1) + CodedOutputStream.computeInt32SizeNoTag(i4);
                }
                this.substringIndexMemoizedSerializedSize = i4;
                i2 = 0;
                while (i3 < this.replaceChar_.size()) {
                    i2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.replaceChar_.get(i3)).intValue());
                    i3++;
                }
                i += i2;
                if (!getReplaceCharList().isEmpty()) {
                    i = (i + 1) + CodedOutputStream.computeInt32SizeNoTag(i2);
                }
                this.replaceCharMemoizedSerializedSize = i2;
                if ((this.bitField0_ & 4) == 4) {
                    i += CodedOutputStream.computeBytesSize(6, getStringBytes());
                }
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

            public static Builder newBuilder(Record record) {
                return newBuilder().mergeFrom(record);
            }

            public Builder toBuilder() {
                return newBuilder(this);
            }
        }

        private StringTableTypes(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private StringTableTypes(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static StringTableTypes getDefaultInstance() {
            return defaultInstance;
        }

        public StringTableTypes getDefaultInstanceForType() {
            return defaultInstance;
        }

        private StringTableTypes(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r9 = this;
            r9.<init>();
            r0 = -1;
            r9.localNameMemoizedSerializedSize = r0;
            r9.memoizedIsInitialized = r0;
            r9.memoizedSerializedSize = r0;
            r9.initFields();
            r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
            r1 = 1;
            r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
            r3 = 0;
            r4 = 0;
        L_0x0018:
            r5 = 2;
            if (r3 != 0) goto L_0x00e4;
        L_0x001b:
            r6 = r10.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r6 == 0) goto L_0x009c;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0021:
            r7 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r6 == r7) goto L_0x0082;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0025:
            r7 = 40;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r6 == r7) goto L_0x0067;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0029:
            r7 = 42;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r6 == r7) goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x002d:
            r6 = r9.parseUnknownField(r10, r2, r11, r6);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r6 != 0) goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0033:
            goto L_0x009c;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0034:
            r6 = r10.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r6 = r10.pushLimit(r6);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r7 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r7 == r5) goto L_0x004f;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0040:
            r7 = r10.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r7 <= 0) goto L_0x004f;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0046:
            r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r9.localName_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x004f:
            r7 = r10.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r7 <= 0) goto L_0x0063;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0055:
            r7 = r9.localName_;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r8 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r8 = java.lang.Integer.valueOf(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            goto L_0x004f;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0063:
            r10.popLimit(r6);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0067:
            r6 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r6 == r5) goto L_0x0074;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x006b:
            r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r9.localName_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0074:
            r6 = r9.localName_;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r7 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r7 = java.lang.Integer.valueOf(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0082:
            r6 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            if (r6 == r1) goto L_0x008f;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x0086:
            r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r9.record_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
        L_0x008f:
            r6 = r9.record_;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r7 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r7 = r10.readMessage(r7, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00b0, IOException -> 0x00a1 }
            goto L_0x0018;
        L_0x009c:
            r3 = 1;
            goto L_0x0018;
        L_0x009f:
            r10 = move-exception;
            goto L_0x00b6;
        L_0x00a1:
            r10 = move-exception;
            r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x009f }
            r10 = r10.getMessage();	 Catch:{ all -> 0x009f }
            r11.<init>(r10);	 Catch:{ all -> 0x009f }
            r10 = r11.setUnfinishedMessage(r9);	 Catch:{ all -> 0x009f }
            throw r10;	 Catch:{ all -> 0x009f }
        L_0x00b0:
            r10 = move-exception;	 Catch:{ all -> 0x009f }
            r10 = r10.setUnfinishedMessage(r9);	 Catch:{ all -> 0x009f }
            throw r10;	 Catch:{ all -> 0x009f }
        L_0x00b6:
            r11 = r4 & 1;
            if (r11 != r1) goto L_0x00c2;
        L_0x00ba:
            r11 = r9.record_;
            r11 = java.util.Collections.unmodifiableList(r11);
            r9.record_ = r11;
        L_0x00c2:
            r11 = r4 & 2;
            if (r11 != r5) goto L_0x00ce;
        L_0x00c6:
            r11 = r9.localName_;
            r11 = java.util.Collections.unmodifiableList(r11);
            r9.localName_ = r11;
        L_0x00ce:
            r2.flush();	 Catch:{ IOException -> 0x00d1, all -> 0x00d8 }
        L_0x00d1:
            r11 = r0.toByteString();
            r9.unknownFields = r11;
            goto L_0x00e0;
        L_0x00d8:
            r10 = move-exception;
            r11 = r0.toByteString();
            r9.unknownFields = r11;
            throw r10;
        L_0x00e0:
            r9.makeExtensionsImmutable();
            throw r10;
        L_0x00e4:
            r10 = r4 & 1;
            if (r10 != r1) goto L_0x00f0;
        L_0x00e8:
            r10 = r9.record_;
            r10 = java.util.Collections.unmodifiableList(r10);
            r9.record_ = r10;
        L_0x00f0:
            r10 = r4 & 2;
            if (r10 != r5) goto L_0x00fc;
        L_0x00f4:
            r10 = r9.localName_;
            r10 = java.util.Collections.unmodifiableList(r10);
            r9.localName_ = r10;
        L_0x00fc:
            r2.flush();	 Catch:{ IOException -> 0x00ff, all -> 0x0106 }
        L_0x00ff:
            r10 = r0.toByteString();
            r9.unknownFields = r10;
            goto L_0x010e;
        L_0x0106:
            r10 = move-exception;
            r11 = r0.toByteString();
            r9.unknownFields = r11;
            throw r10;
        L_0x010e:
            r9.makeExtensionsImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }

        static {
            defaultInstance.initFields();
        }

        public Parser<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.record_;
        }

        public List<Integer> getLocalNameList() {
            return this.localName_;
        }

        private void initFields() {
            this.record_ = Collections.emptyList();
            this.localName_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == (byte) 1) {
                return true;
            }
            if (b == (byte) 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            int i = 0;
            for (int i2 = 0; i2 < this.record_.size(); i2++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.record_.get(i2));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(42);
                codedOutputStream.writeRawVarint32(this.localNameMemoizedSerializedSize);
            }
            while (i < this.localName_.size()) {
                codedOutputStream.writeInt32NoTag(((Integer) this.localName_.get(i)).intValue());
                i++;
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
            for (i2 = 0; i2 < this.record_.size(); i2++) {
                i3 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.record_.get(i2));
            }
            i2 = 0;
            for (i = 0; i < this.localName_.size(); i++) {
                i2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.localName_.get(i)).intValue());
            }
            i3 += i2;
            if (!getLocalNameList().isEmpty()) {
                i3 = (i3 + 1) + CodedOutputStream.computeInt32SizeNoTag(i2);
            }
            this.localNameMemoizedSerializedSize = i2;
            i3 += this.unknownFields.size();
            this.memoizedSerializedSize = i3;
            return i3;
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringTableTypes) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mergeFrom(stringTableTypes);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(constructorSignature);
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(lambdaClassOriginName);
        extensionRegistryLite.add(propertySignature);
        extensionRegistryLite.add(typeAnnotation);
        extensionRegistryLite.add(isRaw);
        extensionRegistryLite.add(typeParameterAnnotation);
        extensionRegistryLite.add(classModuleName);
        extensionRegistryLite.add(classLocalVariable);
        extensionRegistryLite.add(anonymousObjectOriginName);
        extensionRegistryLite.add(packageModuleName);
        extensionRegistryLite.add(packageLocalVariable);
    }
}
