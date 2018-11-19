package kotlin.reflect.jvm.internal.impl.metadata;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.facebook.ads.AdError;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

public final class ProtoBuf {

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public enum MemberKind implements EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);
        
        private static EnumLiteMap<MemberKind> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$1 */
        static class C175961 implements EnumLiteMap<MemberKind> {
            C175961() {
            }

            public MemberKind findValueByNumber(int i) {
                return MemberKind.valueOf(i);
            }
        }

        static {
            internalValueMap = new C175961();
        }

        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i) {
            switch (i) {
                case 0:
                    return DECLARATION;
                case 1:
                    return FAKE_OVERRIDE;
                case 2:
                    return DELEGATION;
                case 3:
                    return SYNTHESIZED;
                default:
                    return 0;
            }
        }

        private MemberKind(int i, int i2) {
            this.value = i2;
        }
    }

    public enum Modality implements EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);
        
        private static EnumLiteMap<Modality> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$1 */
        static class C175971 implements EnumLiteMap<Modality> {
            C175971() {
            }

            public Modality findValueByNumber(int i) {
                return Modality.valueOf(i);
            }
        }

        static {
            internalValueMap = new C175971();
        }

        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i) {
            switch (i) {
                case 0:
                    return FINAL;
                case 1:
                    return OPEN;
                case 2:
                    return ABSTRACT;
                case 3:
                    return SEALED;
                default:
                    return 0;
            }
        }

        private Modality(int i, int i2) {
            this.value = i2;
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);
        
        private static EnumLiteMap<Visibility> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$1 */
        static class C176031 implements EnumLiteMap<Visibility> {
            C176031() {
            }

            public Visibility findValueByNumber(int i) {
                return Visibility.valueOf(i);
            }
        }

        static {
            internalValueMap = new C176031();
        }

        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i) {
            switch (i) {
                case 0:
                    return INTERNAL;
                case 1:
                    return PRIVATE;
                case 2:
                    return PROTECTED;
                case 3:
                    return PUBLIC;
                case 4:
                    return PRIVATE_TO_THIS;
                case 5:
                    return LOCAL;
                default:
                    return 0;
            }
        }

        private Visibility(int i, int i2) {
            this.value = i2;
        }
    }

    public interface ClassOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface ConstructorOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface EnumEntryOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface FunctionOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface PackageFragmentOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface TypeAliasOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends ExtendableMessageOrBuilder {
    }

    public interface ValueParameterOrBuilder extends ExtendableMessageOrBuilder {
    }

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new C184881();
        private static final Annotation defaultInstance = new Annotation(true);
        private List<Argument> argument_;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1 */
        static class C184881 extends AbstractParser<Annotation> {
            C184881() {
            }

            public Annotation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(r3, r4, null);
            }
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new C184891();
            private static final Argument defaultInstance = new Argument(true);
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int nameId_;
            private final ByteString unknownFields;
            private Value value_;

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1 */
            static class C184891 extends AbstractParser<Argument> {
                C184891() {
                }

                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(r3, r4, null);
                }
            }

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int bitField0_;
                private int nameId_;
                private Value value_ = Value.getDefaultInstance();

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

                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                public Argument build() {
                    Object buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                }

                public Argument buildPartial() {
                    Argument argument = new Argument((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, null);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    argument.nameId_ = this.nameId_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.value_ = this.value_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                public Builder mergeFrom(Argument argument) {
                    if (r2 == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (r2.hasNameId()) {
                        setNameId(r2.getNameId());
                    }
                    if (r2.hasValue()) {
                        mergeValue(r2.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(r2.unknownFields));
                    return this;
                }

                public final boolean isInitialized() {
                    if (hasNameId() && hasValue() && getValue().isInitialized()) {
                        return true;
                    }
                    return false;
                }

                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Argument argument;
                    Argument argument2 = null;
                    try {
                        Argument argument3 = (Argument) Argument.PARSER.parsePartialFrom(r3, r4);
                        if (argument3 != null) {
                            mergeFrom(argument3);
                        }
                        return this;
                    } catch (
/*
Method generation error in method: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder, dex: classes4.dex
java.lang.NullPointerException
	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:126)
	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:312)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:290)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)

*/

                    public boolean hasNameId() {
                        return (this.bitField0_ & 1) == 1;
                    }

                    public Builder setNameId(int i) {
                        this.bitField0_ |= 1;
                        this.nameId_ = r2;
                        return this;
                    }

                    public boolean hasValue() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public Value getValue() {
                        return this.value_;
                    }

                    public Builder mergeValue(Value value) {
                        if ((this.bitField0_ & 2) != 2 || this.value_ == Value.getDefaultInstance()) {
                            this.value_ = r4;
                        } else {
                            this.value_ = Value.newBuilder(this.value_).mergeFrom(r4).buildPartial();
                        }
                        this.bitField0_ |= 2;
                        return this;
                    }
                }

                public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                    public static Parser<Value> PARSER = new C184901();
                    private static final Value defaultInstance = new Value(true);
                    private Annotation annotation_;
                    private List<Value> arrayElement_;
                    private int bitField0_;
                    private int classId_;
                    private double doubleValue_;
                    private int enumValueId_;
                    private float floatValue_;
                    private long intValue_;
                    private byte memoizedIsInitialized;
                    private int memoizedSerializedSize;
                    private int stringValue_;
                    private Type type_;
                    private final ByteString unknownFields;

                    public enum Type implements EnumLite {
                        BYTE(0, 0),
                        CHAR(1, 1),
                        SHORT(2, 2),
                        INT(3, 3),
                        LONG(4, 4),
                        FLOAT(5, 5),
                        DOUBLE(6, 6),
                        BOOLEAN(7, 7),
                        STRING(8, 8),
                        CLASS(9, 9),
                        ENUM(10, 10),
                        ANNOTATION(11, 11),
                        ARRAY(12, 12);
                        
                        private static EnumLiteMap<Type> internalValueMap;
                        private final int value;

                        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$1 */
                        static class C175911 implements EnumLiteMap<Type> {
                            C175911() {
                            }

                            public Type findValueByNumber(int i) {
                                return Type.valueOf(r1);
                            }
                        }

                        static {
                            internalValueMap = new C175911();
                        }

                        public final int getNumber() {
                            return this.value;
                        }

                        public static Type valueOf(int i) {
                            switch (r0) {
                                case 0:
                                    return BYTE;
                                case 1:
                                    return CHAR;
                                case 2:
                                    return SHORT;
                                case 3:
                                    return INT;
                                case 4:
                                    return LONG;
                                case 5:
                                    return FLOAT;
                                case 6:
                                    return DOUBLE;
                                case 7:
                                    return BOOLEAN;
                                case 8:
                                    return STRING;
                                case 9:
                                    return CLASS;
                                case 10:
                                    return ENUM;
                                case 11:
                                    return ANNOTATION;
                                case 12:
                                    return ARRAY;
                                default:
                                    return 0;
                            }
                        }

                        private Type(int i, int i2) {
                            this.value = r4;
                        }
                    }

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1 */
                    static class C184901 extends AbstractParser<Value> {
                        C184901() {
                        }

                        public Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new Value(r3, r4, null);
                        }
                    }

                    public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                        private Annotation annotation_ = Annotation.getDefaultInstance();
                        private List<Value> arrayElement_ = Collections.emptyList();
                        private int bitField0_;
                        private int classId_;
                        private double doubleValue_;
                        private int enumValueId_;
                        private float floatValue_;
                        private long intValue_;
                        private int stringValue_;
                        private Type type_ = Type.BYTE;

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

                        public Value getDefaultInstanceForType() {
                            return Value.getDefaultInstance();
                        }

                        public Value build() {
                            Object buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                        }

                        public Value buildPartial() {
                            Value value = new Value((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this, null);
                            int i = this.bitField0_;
                            int i2 = 1;
                            if ((i & 1) != 1) {
                                i2 = 0;
                            }
                            value.type_ = this.type_;
                            if ((i & 2) == 2) {
                                i2 |= 2;
                            }
                            value.intValue_ = this.intValue_;
                            if ((i & 4) == 4) {
                                i2 |= 4;
                            }
                            value.floatValue_ = this.floatValue_;
                            if ((i & 8) == 8) {
                                i2 |= 8;
                            }
                            value.doubleValue_ = this.doubleValue_;
                            if ((i & 16) == 16) {
                                i2 |= 16;
                            }
                            value.stringValue_ = this.stringValue_;
                            if ((i & 32) == 32) {
                                i2 |= 32;
                            }
                            value.classId_ = this.classId_;
                            if ((i & 64) == 64) {
                                i2 |= 64;
                            }
                            value.enumValueId_ = this.enumValueId_;
                            if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                                i2 |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                            }
                            value.annotation_ = this.annotation_;
                            if ((this.bitField0_ & 256) == 256) {
                                this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                                this.bitField0_ &= -257;
                            }
                            value.arrayElement_ = this.arrayElement_;
                            value.bitField0_ = i2;
                            return value;
                        }

                        public Builder mergeFrom(Value value) {
                            if (r3 == Value.getDefaultInstance()) {
                                return this;
                            }
                            if (r3.hasType()) {
                                setType(r3.getType());
                            }
                            if (r3.hasIntValue()) {
                                setIntValue(r3.getIntValue());
                            }
                            if (r3.hasFloatValue()) {
                                setFloatValue(r3.getFloatValue());
                            }
                            if (r3.hasDoubleValue()) {
                                setDoubleValue(r3.getDoubleValue());
                            }
                            if (r3.hasStringValue()) {
                                setStringValue(r3.getStringValue());
                            }
                            if (r3.hasClassId()) {
                                setClassId(r3.getClassId());
                            }
                            if (r3.hasEnumValueId()) {
                                setEnumValueId(r3.getEnumValueId());
                            }
                            if (r3.hasAnnotation()) {
                                mergeAnnotation(r3.getAnnotation());
                            }
                            if (!r3.arrayElement_.isEmpty()) {
                                if (this.arrayElement_.isEmpty()) {
                                    this.arrayElement_ = r3.arrayElement_;
                                    this.bitField0_ &= -257;
                                } else {
                                    ensureArrayElementIsMutable();
                                    this.arrayElement_.addAll(r3.arrayElement_);
                                }
                            }
                            setUnknownFields(getUnknownFields().concat(r3.unknownFields));
                            return this;
                        }

                        public final boolean isInitialized() {
                            if (hasAnnotation() && !getAnnotation().isInitialized()) {
                                return false;
                            }
                            for (int i = 0; i < getArrayElementCount(); i++) {
                                if (!getArrayElement(i).isInitialized()) {
                                    return false;
                                }
                            }
                            return true;
                        }

                        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            Value value;
                            Value value2 = null;
                            try {
                                Value value3 = (Value) Value.PARSER.parsePartialFrom(r3, r4);
                                if (value3 != null) {
                                    mergeFrom(value3);
                                }
                                return this;
                            } catch (
/*
Method generation error in method: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder, dex: classes4.dex
java.lang.NullPointerException
	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:126)
	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:312)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:290)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:233)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:219)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)

*/

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                if (r2 != 0) goto L_0x0008;
                            L_0x0002:
                                r2 = new java.lang.NullPointerException;
                                r2.<init>();
                                throw r2;
                            L_0x0008:
                                r0 = r1.bitField0_;
                                r0 = r0 | 1;
                                r1.bitField0_ = r0;
                                r1.type_ = r2;
                                return r1;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setIntValue(long r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.bitField0_;
                                r0 = r0 | 2;
                                r1.bitField0_ = r0;
                                r1.intValue_ = r2;
                                return r1;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.setIntValue(long):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setFloatValue(float r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.bitField0_;
                                r0 = r0 | 4;
                                r1.bitField0_ = r0;
                                r1.floatValue_ = r2;
                                return r1;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.setFloatValue(float):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setDoubleValue(double r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.bitField0_;
                                r0 = r0 | 8;
                                r1.bitField0_ = r0;
                                r1.doubleValue_ = r2;
                                return r1;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.setDoubleValue(double):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setStringValue(int r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.bitField0_;
                                r0 = r0 | 16;
                                r1.bitField0_ = r0;
                                r1.stringValue_ = r2;
                                return r1;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.setStringValue(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setClassId(int r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.bitField0_;
                                r0 = r0 | 32;
                                r1.bitField0_ = r0;
                                r1.classId_ = r2;
                                return r1;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.setClassId(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setEnumValueId(int r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.bitField0_;
                                r0 = r0 | 64;
                                r1.bitField0_ = r0;
                                r1.enumValueId_ = r2;
                                return r1;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.setEnumValueId(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            public boolean hasAnnotation() {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r2 = this;
                                r0 = r2.bitField0_;
                                r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                                r0 = r0 & r1;
                                if (r0 != r1) goto L_0x0009;
                            L_0x0007:
                                r0 = 1;
                                goto L_0x000a;
                            L_0x0009:
                                r0 = 0;
                            L_0x000a:
                                return r0;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.hasAnnotation():boolean");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation() {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.annotation_;
                                return r0;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.getAnnotation():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r4) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r3 = this;
                                r0 = r3.bitField0_;
                                r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                                r0 = r0 & r1;
                                if (r0 != r1) goto L_0x0020;
                            L_0x0007:
                                r0 = r3.annotation_;
                                r2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                                if (r0 == r2) goto L_0x0020;
                            L_0x000f:
                                r0 = r3.annotation_;
                                r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilder(r0);
                                r4 = r0.mergeFrom(r4);
                                r4 = r4.buildPartial();
                                r3.annotation_ = r4;
                                goto L_0x0022;
                            L_0x0020:
                                r3.annotation_ = r4;
                            L_0x0022:
                                r4 = r3.bitField0_;
                                r4 = r4 | r1;
                                r3.bitField0_ = r4;
                                return r3;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.mergeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                            }

                            private void ensureArrayElementIsMutable() {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r3 = this;
                                r0 = r3.bitField0_;
                                r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
                                r0 = r0 & r1;
                                if (r0 == r1) goto L_0x0015;
                            L_0x0007:
                                r0 = new java.util.ArrayList;
                                r2 = r3.arrayElement_;
                                r0.<init>(r2);
                                r3.arrayElement_ = r0;
                                r0 = r3.bitField0_;
                                r0 = r0 | r1;
                                r3.bitField0_ = r0;
                            L_0x0015:
                                return;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.ensureArrayElementIsMutable():void");
                            }

                            public int getArrayElementCount() {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.arrayElement_;
                                r0 = r0.size();
                                return r0;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.getArrayElementCount():int");
                            }

                            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getArrayElement(int r2) {
                                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                                /*
                                r1 = this;
                                r0 = r1.arrayElement_;
                                r2 = r0.get(r2);
                                r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r2;
                                return r2;
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.getArrayElement(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value");
                            }
                        }

                        private Value(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder r2) {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r1.<init>(r2);
                            r0 = -1;
                            r1.memoizedIsInitialized = r0;
                            r1.memoizedSerializedSize = r0;
                            r2 = r2.getUnknownFields();
                            r1.unknownFields = r2;
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.<init>(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder):void");
                        }

                        private Value(boolean r1) {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r0 = this;
                            r0.<init>();
                            r1 = -1;
                            r0.memoizedIsInitialized = r1;
                            r0.memoizedSerializedSize = r1;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
                            r0.unknownFields = r1;
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.<init>(boolean):void");
                        }

                        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstance() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r0 = defaultInstance;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value");
                        }

                        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getDefaultInstanceForType() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = defaultInstance;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstanceForType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value");
                        }

                        private Value(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r11, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                            /*
                            r10 = this;
                            r10.<init>();
                            r0 = -1;
                            r10.memoizedIsInitialized = r0;
                            r10.memoizedSerializedSize = r0;
                            r10.initFields();
                            r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                            r1 = 1;
                            r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                            r3 = 0;
                            r4 = 0;
                        L_0x0016:
                            r5 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
                            if (r3 != 0) goto L_0x0139;
                        L_0x001a:
                            r6 = r11.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == 0) goto L_0x00fd;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0020:
                            r7 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r7) goto L_0x00e2;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0024:
                            r8 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r8) goto L_0x00d4;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0028:
                            r9 = 29;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r9) goto L_0x00c6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x002c:
                            r9 = 33;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r9) goto L_0x00b9;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0030:
                            r7 = 40;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r7) goto L_0x00ac;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0034:
                            r7 = 48;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r7) goto L_0x009e;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0038:
                            r7 = 56;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r7) goto L_0x0090;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x003c:
                            r7 = 66;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r7) goto L_0x0065;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0040:
                            r7 = 74;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r7) goto L_0x004c;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0044:
                            r6 = r10.parseUnknownField(r11, r2, r12, r6);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x004a:
                            goto L_0x00fd;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x004c:
                            r6 = r4 & 256;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == r5) goto L_0x0059;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0050:
                            r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.arrayElement_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r4 = r4 | 256;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0059:
                            r6 = r10.arrayElement_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r7 = PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0065:
                            r6 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r7 = r7 & r8;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r7 != r8) goto L_0x0073;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x006d:
                            r6 = r10.annotation_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0073:
                            r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r7;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.annotation_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r6 == 0) goto L_0x008a;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x007f:
                            r7 = r10.annotation_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.annotation_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x008a:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x0090:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.enumValueId_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x009e:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.classId_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x00ac:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.stringValue_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x00b9:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r11.readDouble();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.doubleValue_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x00c6:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r11.readFloat();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.floatValue_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x00d4:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r11.readSInt64();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.intValue_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x00e2:
                            r7 = r11.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.valueOf(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            if (r8 != 0) goto L_0x00f4;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x00ec:
                            r2.writeRawVarint32(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r2.writeRawVarint32(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                        L_0x00f4:
                            r6 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r6 = r6 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            r10.type_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x0102 }
                            goto L_0x0016;
                        L_0x00fd:
                            r3 = 1;
                            goto L_0x0016;
                        L_0x0100:
                            r11 = move-exception;
                            goto L_0x0117;
                        L_0x0102:
                            r11 = move-exception;
                            r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0100 }
                            r11 = r11.getMessage();	 Catch:{ all -> 0x0100 }
                            r12.<init>(r11);	 Catch:{ all -> 0x0100 }
                            r11 = r12.setUnfinishedMessage(r10);	 Catch:{ all -> 0x0100 }
                            throw r11;	 Catch:{ all -> 0x0100 }
                        L_0x0111:
                            r11 = move-exception;	 Catch:{ all -> 0x0100 }
                            r11 = r11.setUnfinishedMessage(r10);	 Catch:{ all -> 0x0100 }
                            throw r11;	 Catch:{ all -> 0x0100 }
                        L_0x0117:
                            r12 = r4 & 256;
                            if (r12 != r5) goto L_0x0123;
                        L_0x011b:
                            r12 = r10.arrayElement_;
                            r12 = java.util.Collections.unmodifiableList(r12);
                            r10.arrayElement_ = r12;
                        L_0x0123:
                            r2.flush();	 Catch:{ IOException -> 0x0126, all -> 0x012d }
                        L_0x0126:
                            r12 = r0.toByteString();
                            r10.unknownFields = r12;
                            goto L_0x0135;
                        L_0x012d:
                            r11 = move-exception;
                            r12 = r0.toByteString();
                            r10.unknownFields = r12;
                            throw r11;
                        L_0x0135:
                            r10.makeExtensionsImmutable();
                            throw r11;
                        L_0x0139:
                            r11 = r4 & 256;
                            if (r11 != r5) goto L_0x0145;
                        L_0x013d:
                            r11 = r10.arrayElement_;
                            r11 = java.util.Collections.unmodifiableList(r11);
                            r10.arrayElement_ = r11;
                        L_0x0145:
                            r2.flush();	 Catch:{ IOException -> 0x0148, all -> 0x014f }
                        L_0x0148:
                            r11 = r0.toByteString();
                            r10.unknownFields = r11;
                            goto L_0x0157;
                        L_0x014f:
                            r11 = move-exception;
                            r12 = r0.toByteString();
                            r10.unknownFields = r12;
                            throw r11;
                        L_0x0157:
                            r10.makeExtensionsImmutable();
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                        }

                        static {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1;
                            r0.<init>();
                            PARSER = r0;
                            r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value;
                            r1 = 1;
                            r0.<init>(r1);
                            defaultInstance = r0;
                            r0 = defaultInstance;
                            r0.initFields();
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.<clinit>():void");
                        }

                        public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getParserForType() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = PARSER;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getParserForType():kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value>");
                        }

                        public boolean hasType() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 1;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0007;
                        L_0x0006:
                            goto L_0x0008;
                        L_0x0007:
                            r1 = 0;
                        L_0x0008:
                            return r1;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasType():boolean");
                        }

                        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type getType() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.type_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type");
                        }

                        public boolean hasIntValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 2;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0008;
                        L_0x0006:
                            r0 = 1;
                            goto L_0x0009;
                        L_0x0008:
                            r0 = 0;
                        L_0x0009:
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasIntValue():boolean");
                        }

                        public long getIntValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.intValue_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getIntValue():long");
                        }

                        public boolean hasFloatValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 4;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0008;
                        L_0x0006:
                            r0 = 1;
                            goto L_0x0009;
                        L_0x0008:
                            r0 = 0;
                        L_0x0009:
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasFloatValue():boolean");
                        }

                        public float getFloatValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.floatValue_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getFloatValue():float");
                        }

                        public boolean hasDoubleValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 8;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0009;
                        L_0x0007:
                            r0 = 1;
                            goto L_0x000a;
                        L_0x0009:
                            r0 = 0;
                        L_0x000a:
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasDoubleValue():boolean");
                        }

                        public double getDoubleValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.doubleValue_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDoubleValue():double");
                        }

                        public boolean hasStringValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 16;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0009;
                        L_0x0007:
                            r0 = 1;
                            goto L_0x000a;
                        L_0x0009:
                            r0 = 0;
                        L_0x000a:
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasStringValue():boolean");
                        }

                        public int getStringValue() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.stringValue_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getStringValue():int");
                        }

                        public boolean hasClassId() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 32;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0009;
                        L_0x0007:
                            r0 = 1;
                            goto L_0x000a;
                        L_0x0009:
                            r0 = 0;
                        L_0x000a:
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasClassId():boolean");
                        }

                        public int getClassId() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.classId_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getClassId():int");
                        }

                        public boolean hasEnumValueId() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 64;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0009;
                        L_0x0007:
                            r0 = 1;
                            goto L_0x000a;
                        L_0x0009:
                            r0 = 0;
                        L_0x000a:
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasEnumValueId():boolean");
                        }

                        public int getEnumValueId() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.enumValueId_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getEnumValueId():int");
                        }

                        public boolean hasAnnotation() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.bitField0_;
                            r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0009;
                        L_0x0007:
                            r0 = 1;
                            goto L_0x000a;
                        L_0x0009:
                            r0 = 0;
                        L_0x000a:
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.hasAnnotation():boolean");
                        }

                        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getAnnotation() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.annotation_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getAnnotation():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation");
                        }

                        public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> getArrayElementList() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.arrayElement_;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getArrayElementList():java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value>");
                        }

                        public int getArrayElementCount() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.arrayElement_;
                            r0 = r0.size();
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getArrayElementCount():int");
                        }

                        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getArrayElement(int r2) {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = r1.arrayElement_;
                            r2 = r0.get(r2);
                            r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r2;
                            return r2;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getArrayElement(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value");
                        }

                        private void initFields() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                            r2.type_ = r0;
                            r0 = 0;
                            r2.intValue_ = r0;
                            r0 = 0;
                            r2.floatValue_ = r0;
                            r0 = 0;
                            r2.doubleValue_ = r0;
                            r0 = 0;
                            r2.stringValue_ = r0;
                            r2.classId_ = r0;
                            r2.enumValueId_ = r0;
                            r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                            r2.annotation_ = r0;
                            r0 = java.util.Collections.emptyList();
                            r2.arrayElement_ = r0;
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.initFields():void");
                        }

                        public final boolean isInitialized() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r4 = this;
                            r0 = r4.memoizedIsInitialized;
                            r1 = 1;
                            if (r0 != r1) goto L_0x0006;
                        L_0x0005:
                            return r1;
                        L_0x0006:
                            r2 = 0;
                            if (r0 != 0) goto L_0x000a;
                        L_0x0009:
                            return r2;
                        L_0x000a:
                            r0 = r4.hasAnnotation();
                            if (r0 == 0) goto L_0x001d;
                        L_0x0010:
                            r0 = r4.getAnnotation();
                            r0 = r0.isInitialized();
                            if (r0 != 0) goto L_0x001d;
                        L_0x001a:
                            r4.memoizedIsInitialized = r2;
                            return r2;
                        L_0x001d:
                            r0 = 0;
                        L_0x001e:
                            r3 = r4.getArrayElementCount();
                            if (r0 >= r3) goto L_0x0034;
                        L_0x0024:
                            r3 = r4.getArrayElement(r0);
                            r3 = r3.isInitialized();
                            if (r3 != 0) goto L_0x0031;
                        L_0x002e:
                            r4.memoizedIsInitialized = r2;
                            return r2;
                        L_0x0031:
                            r0 = r0 + 1;
                            goto L_0x001e;
                        L_0x0034:
                            r4.memoizedIsInitialized = r1;
                            return r1;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.isInitialized():boolean");
                        }

                        public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r6) throws java.io.IOException {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r5 = this;
                            r5.getSerializedSize();
                            r0 = r5.bitField0_;
                            r1 = 1;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0012;
                        L_0x0009:
                            r0 = r5.type_;
                            r0 = r0.getNumber();
                            r6.writeEnum(r1, r0);
                        L_0x0012:
                            r0 = r5.bitField0_;
                            r1 = 2;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x001d;
                        L_0x0018:
                            r2 = r5.intValue_;
                            r6.writeSInt64(r1, r2);
                        L_0x001d:
                            r0 = r5.bitField0_;
                            r1 = 4;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0029;
                        L_0x0023:
                            r0 = 3;
                            r2 = r5.floatValue_;
                            r6.writeFloat(r0, r2);
                        L_0x0029:
                            r0 = r5.bitField0_;
                            r2 = 8;
                            r0 = r0 & r2;
                            if (r0 != r2) goto L_0x0035;
                        L_0x0030:
                            r3 = r5.doubleValue_;
                            r6.writeDouble(r1, r3);
                        L_0x0035:
                            r0 = r5.bitField0_;
                            r1 = 16;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0042;
                        L_0x003c:
                            r0 = 5;
                            r1 = r5.stringValue_;
                            r6.writeInt32(r0, r1);
                        L_0x0042:
                            r0 = r5.bitField0_;
                            r1 = 32;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x004f;
                        L_0x0049:
                            r0 = 6;
                            r1 = r5.classId_;
                            r6.writeInt32(r0, r1);
                        L_0x004f:
                            r0 = r5.bitField0_;
                            r1 = 64;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x005c;
                        L_0x0056:
                            r0 = 7;
                            r1 = r5.enumValueId_;
                            r6.writeInt32(r0, r1);
                        L_0x005c:
                            r0 = r5.bitField0_;
                            r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                            r0 = r0 & r1;
                            if (r0 != r1) goto L_0x0068;
                        L_0x0063:
                            r0 = r5.annotation_;
                            r6.writeMessage(r2, r0);
                        L_0x0068:
                            r0 = 0;
                        L_0x0069:
                            r1 = r5.arrayElement_;
                            r1 = r1.size();
                            if (r0 >= r1) goto L_0x0081;
                        L_0x0071:
                            r1 = 9;
                            r2 = r5.arrayElement_;
                            r2 = r2.get(r0);
                            r2 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) r2;
                            r6.writeMessage(r1, r2);
                            r0 = r0 + 1;
                            goto L_0x0069;
                        L_0x0081:
                            r0 = r5.unknownFields;
                            r6.writeRawBytes(r0);
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream):void");
                        }

                        public int getSerializedSize() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r7 = this;
                            r0 = r7.memoizedSerializedSize;
                            r1 = -1;
                            if (r0 == r1) goto L_0x0006;
                        L_0x0005:
                            return r0;
                        L_0x0006:
                            r0 = r7.bitField0_;
                            r1 = 1;
                            r0 = r0 & r1;
                            r2 = 0;
                            if (r0 != r1) goto L_0x0019;
                        L_0x000d:
                            r0 = r7.type_;
                            r0 = r0.getNumber();
                            r0 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSize(r1, r0);
                            r0 = r0 + r2;
                            goto L_0x001a;
                        L_0x0019:
                            r0 = 0;
                        L_0x001a:
                            r1 = r7.bitField0_;
                            r3 = 2;
                            r1 = r1 & r3;
                            if (r1 != r3) goto L_0x0027;
                        L_0x0020:
                            r4 = r7.intValue_;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSInt64Size(r3, r4);
                            r0 = r0 + r1;
                        L_0x0027:
                            r1 = r7.bitField0_;
                            r3 = 4;
                            r1 = r1 & r3;
                            if (r1 != r3) goto L_0x0035;
                        L_0x002d:
                            r1 = 3;
                            r4 = r7.floatValue_;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFloatSize(r1, r4);
                            r0 = r0 + r1;
                        L_0x0035:
                            r1 = r7.bitField0_;
                            r4 = 8;
                            r1 = r1 & r4;
                            if (r1 != r4) goto L_0x0043;
                        L_0x003c:
                            r5 = r7.doubleValue_;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeDoubleSize(r3, r5);
                            r0 = r0 + r1;
                        L_0x0043:
                            r1 = r7.bitField0_;
                            r3 = 16;
                            r1 = r1 & r3;
                            if (r1 != r3) goto L_0x0052;
                        L_0x004a:
                            r1 = 5;
                            r3 = r7.stringValue_;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(r1, r3);
                            r0 = r0 + r1;
                        L_0x0052:
                            r1 = r7.bitField0_;
                            r3 = 32;
                            r1 = r1 & r3;
                            if (r1 != r3) goto L_0x0061;
                        L_0x0059:
                            r1 = 6;
                            r3 = r7.classId_;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(r1, r3);
                            r0 = r0 + r1;
                        L_0x0061:
                            r1 = r7.bitField0_;
                            r3 = 64;
                            r1 = r1 & r3;
                            if (r1 != r3) goto L_0x0070;
                        L_0x0068:
                            r1 = 7;
                            r3 = r7.enumValueId_;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(r1, r3);
                            r0 = r0 + r1;
                        L_0x0070:
                            r1 = r7.bitField0_;
                            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                            r1 = r1 & r3;
                            if (r1 != r3) goto L_0x007e;
                        L_0x0077:
                            r1 = r7.annotation_;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(r4, r1);
                            r0 = r0 + r1;
                        L_0x007e:
                            r1 = r7.arrayElement_;
                            r1 = r1.size();
                            if (r2 >= r1) goto L_0x0098;
                        L_0x0086:
                            r1 = 9;
                            r3 = r7.arrayElement_;
                            r3 = r3.get(r2);
                            r3 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) r3;
                            r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(r1, r3);
                            r0 = r0 + r1;
                            r2 = r2 + 1;
                            goto L_0x007e;
                        L_0x0098:
                            r1 = r7.unknownFields;
                            r1 = r1.size();
                            r0 = r0 + r1;
                            r7.memoizedSerializedSize = r0;
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getSerializedSize():int");
                        }

                        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.create();
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilder():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                        }

                        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilderForType() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = newBuilder();
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilderForType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                        }

                        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r1) {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r0 = newBuilder();
                            r1 = r0.mergeFrom(r1);
                            return r1;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                        }

                        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder toBuilder() {
                            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                            /*
                            r1 = this;
                            r0 = newBuilder(r1);
                            return r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.toBuilder():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                        }
                    }

                    private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder r2) {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r1.<init>(r2);
                        r0 = -1;
                        r1.memoizedIsInitialized = r0;
                        r1.memoizedSerializedSize = r0;
                        r2 = r2.getUnknownFields();
                        r1.unknownFields = r2;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.<init>(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder):void");
                    }

                    private Argument(boolean r1) {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r0 = this;
                        r0.<init>();
                        r1 = -1;
                        r0.memoizedIsInitialized = r1;
                        r0.memoizedSerializedSize = r1;
                        r1 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
                        r0.unknownFields = r1;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.<init>(boolean):void");
                    }

                    public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstance() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r0 = defaultInstance;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getDefaultInstance():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getDefaultInstanceForType() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = defaultInstance;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getDefaultInstanceForType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument");
                    }

                    private Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                        if (r3 != 0) goto L_0x0091;
                    L_0x0017:
                        r4 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        if (r4 == 0) goto L_0x0062;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x001d:
                        r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        if (r4 == r5) goto L_0x0056;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x0021:
                        r5 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        if (r4 == r5) goto L_0x002c;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x0025:
                        r4 = r7.parseUnknownField(r8, r2, r9, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x002b:
                        goto L_0x0062;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x002c:
                        r4 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r5 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r6 = 2;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r5 = r5 & r6;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        if (r5 != r6) goto L_0x0039;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x0033:
                        r4 = r7.value_;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r4 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x0039:
                        r5 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r5 = r8.readMessage(r5, r9);	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r5;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r7.value_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        if (r4 == 0) goto L_0x0050;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x0045:
                        r5 = r7.value_;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r4.mergeFrom(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r4 = r4.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r7.value_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x0050:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r4 = r4 | r6;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                    L_0x0056:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r4 = r8.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        r7.nameId_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0075, IOException -> 0x0066 }
                        goto L_0x0015;
                    L_0x0062:
                        r3 = 1;
                        goto L_0x0015;
                    L_0x0064:
                        r8 = move-exception;
                        goto L_0x007b;
                    L_0x0066:
                        r8 = move-exception;
                        r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0064 }
                        r8 = r8.getMessage();	 Catch:{ all -> 0x0064 }
                        r9.<init>(r8);	 Catch:{ all -> 0x0064 }
                        r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0064 }
                        throw r8;	 Catch:{ all -> 0x0064 }
                    L_0x0075:
                        r8 = move-exception;	 Catch:{ all -> 0x0064 }
                        r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0064 }
                        throw r8;	 Catch:{ all -> 0x0064 }
                    L_0x007b:
                        r2.flush();	 Catch:{ IOException -> 0x007e, all -> 0x0085 }
                    L_0x007e:
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        goto L_0x008d;
                    L_0x0085:
                        r8 = move-exception;
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        throw r8;
                    L_0x008d:
                        r7.makeExtensionsImmutable();
                        throw r8;
                    L_0x0091:
                        r2.flush();	 Catch:{ IOException -> 0x0094, all -> 0x009b }
                    L_0x0094:
                        r8 = r0.toByteString();
                        r7.unknownFields = r8;
                        goto L_0x00a3;
                    L_0x009b:
                        r8 = move-exception;
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        throw r8;
                    L_0x00a3:
                        r7.makeExtensionsImmutable();
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                    }

                    static {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1;
                        r0.<init>();
                        PARSER = r0;
                        r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument;
                        r1 = 1;
                        r0.<init>(r1);
                        defaultInstance = r0;
                        r0 = defaultInstance;
                        r0.initFields();
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.<clinit>():void");
                    }

                    public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> getParserForType() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = PARSER;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getParserForType():kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument>");
                    }

                    public boolean hasNameId() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r0 = r2.bitField0_;
                        r1 = 1;
                        r0 = r0 & r1;
                        if (r0 != r1) goto L_0x0007;
                    L_0x0006:
                        goto L_0x0008;
                    L_0x0007:
                        r1 = 0;
                    L_0x0008:
                        return r1;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.hasNameId():boolean");
                    }

                    public int getNameId() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = r1.nameId_;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getNameId():int");
                    }

                    public boolean hasValue() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r0 = r2.bitField0_;
                        r1 = 2;
                        r0 = r0 & r1;
                        if (r0 != r1) goto L_0x0008;
                    L_0x0006:
                        r0 = 1;
                        goto L_0x0009;
                    L_0x0008:
                        r0 = 0;
                    L_0x0009:
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.hasValue():boolean");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value getValue() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = r1.value_;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getValue():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value");
                    }

                    private void initFields() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = 0;
                        r1.nameId_ = r0;
                        r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.getDefaultInstance();
                        r1.value_ = r0;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.initFields():void");
                    }

                    public final boolean isInitialized() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r3 = this;
                        r0 = r3.memoizedIsInitialized;
                        r1 = 1;
                        if (r0 != r1) goto L_0x0006;
                    L_0x0005:
                        return r1;
                    L_0x0006:
                        r2 = 0;
                        if (r0 != 0) goto L_0x000a;
                    L_0x0009:
                        return r2;
                    L_0x000a:
                        r0 = r3.hasNameId();
                        if (r0 != 0) goto L_0x0013;
                    L_0x0010:
                        r3.memoizedIsInitialized = r2;
                        return r2;
                    L_0x0013:
                        r0 = r3.hasValue();
                        if (r0 != 0) goto L_0x001c;
                    L_0x0019:
                        r3.memoizedIsInitialized = r2;
                        return r2;
                    L_0x001c:
                        r0 = r3.getValue();
                        r0 = r0.isInitialized();
                        if (r0 != 0) goto L_0x0029;
                    L_0x0026:
                        r3.memoizedIsInitialized = r2;
                        return r2;
                    L_0x0029:
                        r3.memoizedIsInitialized = r1;
                        return r1;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.isInitialized():boolean");
                    }

                    public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r3) throws java.io.IOException {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r2.getSerializedSize();
                        r0 = r2.bitField0_;
                        r1 = 1;
                        r0 = r0 & r1;
                        if (r0 != r1) goto L_0x000e;
                    L_0x0009:
                        r0 = r2.nameId_;
                        r3.writeInt32(r1, r0);
                    L_0x000e:
                        r0 = r2.bitField0_;
                        r1 = 2;
                        r0 = r0 & r1;
                        if (r0 != r1) goto L_0x0019;
                    L_0x0014:
                        r0 = r2.value_;
                        r3.writeMessage(r1, r0);
                    L_0x0019:
                        r0 = r2.unknownFields;
                        r3.writeRawBytes(r0);
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream):void");
                    }

                    public int getSerializedSize() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r3 = this;
                        r0 = r3.memoizedSerializedSize;
                        r1 = -1;
                        if (r0 == r1) goto L_0x0006;
                    L_0x0005:
                        return r0;
                    L_0x0006:
                        r0 = 0;
                        r1 = r3.bitField0_;
                        r2 = 1;
                        r1 = r1 & r2;
                        if (r1 != r2) goto L_0x0014;
                    L_0x000d:
                        r1 = r3.nameId_;
                        r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(r2, r1);
                        r0 = r0 + r1;
                    L_0x0014:
                        r1 = r3.bitField0_;
                        r2 = 2;
                        r1 = r1 & r2;
                        if (r1 != r2) goto L_0x0021;
                    L_0x001a:
                        r1 = r3.value_;
                        r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(r2, r1);
                        r0 = r0 + r1;
                    L_0x0021:
                        r1 = r3.unknownFields;
                        r1 = r1.size();
                        r0 = r0 + r1;
                        r3.memoizedSerializedSize = r0;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.getSerializedSize():int");
                    }

                    public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilder() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.create();
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.newBuilder():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilderForType() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = newBuilder();
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.newBuilderForType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder");
                    }

                    public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument r1) {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r0 = newBuilder();
                        r1 = r0.mergeFrom(r1);
                        return r1;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder toBuilder() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = newBuilder(r1);
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.toBuilder():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder");
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
                    private List<Argument> argument_ = Collections.emptyList();
                    private int bitField0_;
                    private int id_;

                    private void maybeForceBuilderInitialization() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r0 = this;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.maybeForceBuilderInitialization():void");
                    }

                    private Builder() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r1.<init>();
                        r0 = java.util.Collections.emptyList();
                        r1.argument_ = r0;
                        r1.maybeForceBuilderInitialization();
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.<init>():void");
                    }

                    private static Builder create() {
                        return new Builder();
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder clone() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r0 = create();
                        r1 = r2.buildPartial();
                        r0 = r0.mergeFrom(r1);
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.clone():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstanceForType() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.getDefaultInstanceForType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation build() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r0 = r2.buildPartial();
                        r1 = r0.isInitialized();
                        if (r1 != 0) goto L_0x000f;
                    L_0x000a:
                        r0 = kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(r0);
                        throw r0;
                    L_0x000f:
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.build():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation buildPartial() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r4 = this;
                        r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
                        r1 = 0;
                        r0.<init>(r4, r1);
                        r1 = r4.bitField0_;
                        r2 = 1;
                        r1 = r1 & r2;
                        if (r1 != r2) goto L_0x000d;
                    L_0x000c:
                        goto L_0x000e;
                    L_0x000d:
                        r2 = 0;
                    L_0x000e:
                        r1 = r4.id_;
                        r0.id_ = r1;
                        r1 = r4.bitField0_;
                        r3 = 2;
                        r1 = r1 & r3;
                        if (r1 != r3) goto L_0x0027;
                    L_0x0019:
                        r1 = r4.argument_;
                        r1 = java.util.Collections.unmodifiableList(r1);
                        r4.argument_ = r1;
                        r1 = r4.bitField0_;
                        r1 = r1 & -3;
                        r4.bitField0_ = r1;
                    L_0x0027:
                        r1 = r4.argument_;
                        r0.argument_ = r1;
                        r0.bitField0_ = r2;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.buildPartial():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r3) {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance();
                        if (r3 != r0) goto L_0x0007;
                    L_0x0006:
                        return r2;
                    L_0x0007:
                        r0 = r3.hasId();
                        if (r0 == 0) goto L_0x0014;
                    L_0x000d:
                        r0 = r3.getId();
                        r2.setId(r0);
                    L_0x0014:
                        r0 = r3.argument_;
                        r0 = r0.isEmpty();
                        if (r0 != 0) goto L_0x003f;
                    L_0x001e:
                        r0 = r2.argument_;
                        r0 = r0.isEmpty();
                        if (r0 == 0) goto L_0x0033;
                    L_0x0026:
                        r0 = r3.argument_;
                        r2.argument_ = r0;
                        r0 = r2.bitField0_;
                        r0 = r0 & -3;
                        r2.bitField0_ = r0;
                        goto L_0x003f;
                    L_0x0033:
                        r2.ensureArgumentIsMutable();
                        r0 = r2.argument_;
                        r1 = r3.argument_;
                        r0.addAll(r1);
                    L_0x003f:
                        r0 = r2.getUnknownFields();
                        r3 = r3.unknownFields;
                        r3 = r0.concat(r3);
                        r2.setUnknownFields(r3);
                        return r2;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                    }

                    public final boolean isInitialized() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r3 = this;
                        r0 = r3.hasId();
                        r1 = 0;
                        if (r0 != 0) goto L_0x0008;
                    L_0x0007:
                        return r1;
                    L_0x0008:
                        r0 = 0;
                    L_0x0009:
                        r2 = r3.getArgumentCount();
                        if (r0 >= r2) goto L_0x001d;
                    L_0x000f:
                        r2 = r3.getArgument(r0);
                        r2 = r2.isInitialized();
                        if (r2 != 0) goto L_0x001a;
                    L_0x0019:
                        return r1;
                    L_0x001a:
                        r0 = r0 + 1;
                        goto L_0x0009;
                    L_0x001d:
                        r0 = 1;
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.isInitialized():boolean");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r0 = 0;
                        r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0011, InvalidProtocolBufferException -> 0x0011, all -> 0x000f, all -> 0x0019, all -> 0x000f, all -> 0x0019 }
                        r3 = r1.parsePartialFrom(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0011, InvalidProtocolBufferException -> 0x0011, all -> 0x000f, all -> 0x0019, all -> 0x000f, all -> 0x0019 }
                        r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3;	 Catch:{ InvalidProtocolBufferException -> 0x0011, InvalidProtocolBufferException -> 0x0011, all -> 0x000f, all -> 0x0019, all -> 0x000f, all -> 0x0019 }
                        if (r3 == 0) goto L_0x000e;
                    L_0x000b:
                        r2.mergeFrom(r3);
                    L_0x000e:
                        return r2;
                    L_0x000f:
                        r3 = move-exception;
                        goto L_0x001b;
                    L_0x0011:
                        r3 = move-exception;
                        r4 = r3.getUnfinishedMessage();	 Catch:{ InvalidProtocolBufferException -> 0x0011, InvalidProtocolBufferException -> 0x0011, all -> 0x000f, all -> 0x0019, all -> 0x000f, all -> 0x0019 }
                        r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4;	 Catch:{ InvalidProtocolBufferException -> 0x0011, InvalidProtocolBufferException -> 0x0011, all -> 0x000f, all -> 0x0019, all -> 0x000f, all -> 0x0019 }
                        throw r3;	 Catch:{ InvalidProtocolBufferException -> 0x0011, InvalidProtocolBufferException -> 0x0011, all -> 0x000f, all -> 0x0019, all -> 0x000f, all -> 0x0019 }
                    L_0x0019:
                        r3 = move-exception;
                        r0 = r4;
                    L_0x001b:
                        if (r0 == 0) goto L_0x0020;
                    L_0x001d:
                        r2.mergeFrom(r0);
                    L_0x0020:
                        throw r3;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                    }

                    public boolean hasId() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r2 = this;
                        r0 = r2.bitField0_;
                        r1 = 1;
                        r0 = r0 & r1;
                        if (r0 != r1) goto L_0x0007;
                    L_0x0006:
                        goto L_0x0008;
                    L_0x0007:
                        r1 = 0;
                    L_0x0008:
                        return r1;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.hasId():boolean");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder setId(int r2) {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = r1.bitField0_;
                        r0 = r0 | 1;
                        r1.bitField0_ = r0;
                        r1.id_ = r2;
                        return r1;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.setId(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                    }

                    private void ensureArgumentIsMutable() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r3 = this;
                        r0 = r3.bitField0_;
                        r1 = 2;
                        r0 = r0 & r1;
                        if (r0 == r1) goto L_0x0014;
                    L_0x0006:
                        r0 = new java.util.ArrayList;
                        r2 = r3.argument_;
                        r0.<init>(r2);
                        r3.argument_ = r0;
                        r0 = r3.bitField0_;
                        r0 = r0 | r1;
                        r3.bitField0_ = r0;
                    L_0x0014:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.ensureArgumentIsMutable():void");
                    }

                    public int getArgumentCount() {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = r1.argument_;
                        r0 = r0.size();
                        return r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.getArgumentCount():int");
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getArgument(int r2) {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r1 = this;
                        r0 = r1.argument_;
                        r2 = r0.get(r2);
                        r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r2;
                        return r2;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.getArgument(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument");
                    }
                }

                private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r1.<init>(r2);
                    r0 = -1;
                    r1.memoizedIsInitialized = r0;
                    r1.memoizedSerializedSize = r0;
                    r2 = r2.getUnknownFields();
                    r1.unknownFields = r2;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.<init>(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder):void");
                }

                private Annotation(boolean r1) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r0 = this;
                    r0.<init>();
                    r1 = -1;
                    r0.memoizedIsInitialized = r1;
                    r0.memoizedSerializedSize = r1;
                    r1 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
                    r0.unknownFields = r1;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.<init>(boolean):void");
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstance() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r0 = defaultInstance;
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstance():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation");
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation getDefaultInstanceForType() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = defaultInstance;
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getDefaultInstanceForType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation");
                }

                private Annotation(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r9, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r10) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r8 = this;
                    r8.<init>();
                    r0 = -1;
                    r8.memoizedIsInitialized = r0;
                    r8.memoizedSerializedSize = r0;
                    r8.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 2;
                    if (r3 != 0) goto L_0x008e;
                L_0x0019:
                    r6 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    if (r6 == 0) goto L_0x0053;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x001f:
                    r7 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    if (r6 == r7) goto L_0x0047;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x0023:
                    r7 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    if (r6 == r7) goto L_0x002e;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x0027:
                    r6 = r8.parseUnknownField(r9, r2, r10, r6);	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    if (r6 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x002d:
                    goto L_0x0053;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x002e:
                    r6 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    if (r6 == r5) goto L_0x003b;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x0032:
                    r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r8.argument_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x003b:
                    r6 = r8.argument_;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r7 = r9.readMessage(r7, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                L_0x0047:
                    r6 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r6 = r6 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r8.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r6 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    r8.id_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0066, IOException -> 0x0057 }
                    goto L_0x0016;
                L_0x0053:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0055:
                    r9 = move-exception;
                    goto L_0x006c;
                L_0x0057:
                    r9 = move-exception;
                    r10 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0055 }
                    r9 = r9.getMessage();	 Catch:{ all -> 0x0055 }
                    r10.<init>(r9);	 Catch:{ all -> 0x0055 }
                    r9 = r10.setUnfinishedMessage(r8);	 Catch:{ all -> 0x0055 }
                    throw r9;	 Catch:{ all -> 0x0055 }
                L_0x0066:
                    r9 = move-exception;	 Catch:{ all -> 0x0055 }
                    r9 = r9.setUnfinishedMessage(r8);	 Catch:{ all -> 0x0055 }
                    throw r9;	 Catch:{ all -> 0x0055 }
                L_0x006c:
                    r10 = r4 & 2;
                    if (r10 != r5) goto L_0x0078;
                L_0x0070:
                    r10 = r8.argument_;
                    r10 = java.util.Collections.unmodifiableList(r10);
                    r8.argument_ = r10;
                L_0x0078:
                    r2.flush();	 Catch:{ IOException -> 0x007b, all -> 0x0082 }
                L_0x007b:
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    goto L_0x008a;
                L_0x0082:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x008a:
                    r8.makeExtensionsImmutable();
                    throw r9;
                L_0x008e:
                    r9 = r4 & 2;
                    if (r9 != r5) goto L_0x009a;
                L_0x0092:
                    r9 = r8.argument_;
                    r9 = java.util.Collections.unmodifiableList(r9);
                    r8.argument_ = r9;
                L_0x009a:
                    r2.flush();	 Catch:{ IOException -> 0x009d, all -> 0x00a4 }
                L_0x009d:
                    r9 = r0.toByteString();
                    r8.unknownFields = r9;
                    goto L_0x00ac;
                L_0x00a4:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x00ac:
                    r8.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1;
                    r0.<init>();
                    PARSER = r0;
                    r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
                    r1 = 1;
                    r0.<init>(r1);
                    defaultInstance = r0;
                    r0 = defaultInstance;
                    r0.initFields();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.<clinit>():void");
                }

                public kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getParserForType() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = PARSER;
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getParserForType():kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>");
                }

                public boolean hasId() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r2 = this;
                    r0 = r2.bitField0_;
                    r1 = 1;
                    r0 = r0 & r1;
                    if (r0 != r1) goto L_0x0007;
                L_0x0006:
                    goto L_0x0008;
                L_0x0007:
                    r1 = 0;
                L_0x0008:
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.hasId():boolean");
                }

                public int getId() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.id_;
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getId():int");
                }

                public java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> getArgumentList() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.argument_;
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getArgumentList():java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument>");
                }

                public int getArgumentCount() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.argument_;
                    r0 = r0.size();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getArgumentCount():int");
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument getArgument(int r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.argument_;
                    r2 = r0.get(r2);
                    r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r2;
                    return r2;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getArgument(int):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument");
                }

                private void initFields() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = 0;
                    r1.id_ = r0;
                    r0 = java.util.Collections.emptyList();
                    r1.argument_ = r0;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.initFields():void");
                }

                public final boolean isInitialized() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r4 = this;
                    r0 = r4.memoizedIsInitialized;
                    r1 = 1;
                    if (r0 != r1) goto L_0x0006;
                L_0x0005:
                    return r1;
                L_0x0006:
                    r2 = 0;
                    if (r0 != 0) goto L_0x000a;
                L_0x0009:
                    return r2;
                L_0x000a:
                    r0 = r4.hasId();
                    if (r0 != 0) goto L_0x0013;
                L_0x0010:
                    r4.memoizedIsInitialized = r2;
                    return r2;
                L_0x0013:
                    r0 = 0;
                L_0x0014:
                    r3 = r4.getArgumentCount();
                    if (r0 >= r3) goto L_0x002a;
                L_0x001a:
                    r3 = r4.getArgument(r0);
                    r3 = r3.isInitialized();
                    if (r3 != 0) goto L_0x0027;
                L_0x0024:
                    r4.memoizedIsInitialized = r2;
                    return r2;
                L_0x0027:
                    r0 = r0 + 1;
                    goto L_0x0014;
                L_0x002a:
                    r4.memoizedIsInitialized = r1;
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.isInitialized():boolean");
                }

                public void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r4) throws java.io.IOException {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r3 = this;
                    r3.getSerializedSize();
                    r0 = r3.bitField0_;
                    r1 = 1;
                    r0 = r0 & r1;
                    if (r0 != r1) goto L_0x000e;
                L_0x0009:
                    r0 = r3.id_;
                    r4.writeInt32(r1, r0);
                L_0x000e:
                    r0 = 0;
                L_0x000f:
                    r1 = r3.argument_;
                    r1 = r1.size();
                    if (r0 >= r1) goto L_0x0026;
                L_0x0017:
                    r1 = 2;
                    r2 = r3.argument_;
                    r2 = r2.get(r0);
                    r2 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) r2;
                    r4.writeMessage(r1, r2);
                    r0 = r0 + 1;
                    goto L_0x000f;
                L_0x0026:
                    r0 = r3.unknownFields;
                    r4.writeRawBytes(r0);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream):void");
                }

                public int getSerializedSize() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r4 = this;
                    r0 = r4.memoizedSerializedSize;
                    r1 = -1;
                    if (r0 == r1) goto L_0x0006;
                L_0x0005:
                    return r0;
                L_0x0006:
                    r0 = r4.bitField0_;
                    r1 = 1;
                    r0 = r0 & r1;
                    r2 = 0;
                    if (r0 != r1) goto L_0x0015;
                L_0x000d:
                    r0 = r4.id_;
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32Size(r1, r0);
                    r0 = r0 + r2;
                    goto L_0x0016;
                L_0x0015:
                    r0 = 0;
                L_0x0016:
                    r1 = r4.argument_;
                    r1 = r1.size();
                    if (r2 >= r1) goto L_0x002f;
                L_0x001e:
                    r1 = 2;
                    r3 = r4.argument_;
                    r3 = r3.get(r2);
                    r3 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) r3;
                    r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSize(r1, r3);
                    r0 = r0 + r1;
                    r2 = r2 + 1;
                    goto L_0x0016;
                L_0x002f:
                    r1 = r4.unknownFields;
                    r1 = r1.size();
                    r0 = r0 + r1;
                    r4.memoizedSerializedSize = r0;
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.getSerializedSize():int");
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.create();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilder():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilderForType() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = newBuilder();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilderForType():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r1) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r0 = newBuilder();
                    r1 = r0.mergeFrom(r1);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder toBuilder() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = newBuilder(r1);
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.toBuilder():kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
                }
            }

            public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
                public static Parser<Contract> PARSER = new C184931();
                private static final Contract defaultInstance = new Contract(true);
                private List<Effect> effect_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private final ByteString unknownFields;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1 */
                static class C184931 extends AbstractParser<Contract> {
                    C184931() {
                    }

                    public Contract parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Contract(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {
                    private int bitField0_;
                    private List<Effect> effect_ = Collections.emptyList();

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

                    public Contract getDefaultInstanceForType() {
                        return Contract.getDefaultInstance();
                    }

                    public Contract build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Contract buildPartial() {
                        Contract contract = new Contract((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        if ((this.bitField0_ & 1) == 1) {
                            this.effect_ = Collections.unmodifiableList(this.effect_);
                            this.bitField0_ &= -2;
                        }
                        contract.effect_ = this.effect_;
                        return contract;
                    }

                    public Builder mergeFrom(Contract contract) {
                        if (contract == Contract.getDefaultInstance()) {
                            return this;
                        }
                        if (!contract.effect_.isEmpty()) {
                            if (this.effect_.isEmpty()) {
                                this.effect_ = contract.effect_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureEffectIsMutable();
                                this.effect_.addAll(contract.effect_);
                            }
                        }
                        setUnknownFields(getUnknownFields().concat(contract.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        for (int i = 0; i < getEffectCount(); i++) {
                            if (!getEffect(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Contract contract;
                        Contract contract2 = null;
                        try {
                            Contract contract3 = (Contract) Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (contract3 != null) {
                                mergeFrom(contract3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            contract = (Contract) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            contract2 = contract;
                        }
                        if (contract2 != null) {
                            mergeFrom(contract2);
                        }
                        throw codedInputStream2;
                    }

                    private void ensureEffectIsMutable() {
                        if ((this.bitField0_ & 1) != 1) {
                            this.effect_ = new ArrayList(this.effect_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public int getEffectCount() {
                        return this.effect_.size();
                    }

                    public Effect getEffect(int i) {
                        return (Effect) this.effect_.get(i);
                    }
                }

                private Contract(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private Contract(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Contract getDefaultInstance() {
                    return defaultInstance;
                }

                public Contract getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Contract(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                    r4 = 0;
                L_0x0016:
                    if (r3 != 0) goto L_0x007d;
                L_0x0018:
                    r5 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == 0) goto L_0x0042;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x001e:
                    r6 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == r6) goto L_0x0029;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0022:
                    r5 = r7.parseUnknownField(r8, r2, r9, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0028:
                    goto L_0x0042;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0029:
                    r5 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == r1) goto L_0x0036;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x002d:
                    r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r7.effect_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0036:
                    r5 = r7.effect_;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r6 = r8.readMessage(r6, r9);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r5.add(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    goto L_0x0016;
                L_0x0042:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0044:
                    r8 = move-exception;
                    goto L_0x005b;
                L_0x0046:
                    r8 = move-exception;
                    r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0044 }
                    r8 = r8.getMessage();	 Catch:{ all -> 0x0044 }
                    r9.<init>(r8);	 Catch:{ all -> 0x0044 }
                    r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0044 }
                    throw r8;	 Catch:{ all -> 0x0044 }
                L_0x0055:
                    r8 = move-exception;	 Catch:{ all -> 0x0044 }
                    r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0044 }
                    throw r8;	 Catch:{ all -> 0x0044 }
                L_0x005b:
                    r9 = r4 & 1;
                    if (r9 != r1) goto L_0x0067;
                L_0x005f:
                    r9 = r7.effect_;
                    r9 = java.util.Collections.unmodifiableList(r9);
                    r7.effect_ = r9;
                L_0x0067:
                    r2.flush();	 Catch:{ IOException -> 0x006a, all -> 0x0071 }
                L_0x006a:
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    goto L_0x0079;
                L_0x0071:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x0079:
                    r7.makeExtensionsImmutable();
                    throw r8;
                L_0x007d:
                    r8 = r4 & 1;
                    if (r8 != r1) goto L_0x0089;
                L_0x0081:
                    r8 = r7.effect_;
                    r8 = java.util.Collections.unmodifiableList(r8);
                    r7.effect_ = r8;
                L_0x0089:
                    r2.flush();	 Catch:{ IOException -> 0x008c, all -> 0x0093 }
                L_0x008c:
                    r8 = r0.toByteString();
                    r7.unknownFields = r8;
                    goto L_0x009b;
                L_0x0093:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x009b:
                    r7.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Contract> getParserForType() {
                    return PARSER;
                }

                public int getEffectCount() {
                    return this.effect_.size();
                }

                public Effect getEffect(int i) {
                    return (Effect) this.effect_.get(i);
                }

                private void initFields() {
                    this.effect_ = Collections.emptyList();
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
                    while (i < getEffectCount()) {
                        if (getEffect(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    for (int i = 0; i < this.effect_.size(); i++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.effect_.get(i));
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    for (i = 0; i < this.effect_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.effect_.get(i));
                    }
                    i2 += this.unknownFields.size();
                    this.memoizedSerializedSize = i2;
                    return i2;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Contract contract) {
                    return newBuilder().mergeFrom(contract);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
                public static Parser<Effect> PARSER = new C184941();
                private static final Effect defaultInstance = new Effect(true);
                private int bitField0_;
                private Expression conclusionOfConditionalEffect_;
                private List<Expression> effectConstructorArgument_;
                private EffectType effectType_;
                private InvocationKind kind_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private final ByteString unknownFields;

                public enum EffectType implements EnumLite {
                    RETURNS_CONSTANT(0, 0),
                    CALLS(1, 1),
                    RETURNS_NOT_NULL(2, 2);
                    
                    private static EnumLiteMap<EffectType> internalValueMap;
                    private final int value;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$1 */
                    static class C175931 implements EnumLiteMap<EffectType> {
                        C175931() {
                        }

                        public EffectType findValueByNumber(int i) {
                            return EffectType.valueOf(i);
                        }
                    }

                    static {
                        internalValueMap = new C175931();
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static EffectType valueOf(int i) {
                        switch (i) {
                            case 0:
                                return RETURNS_CONSTANT;
                            case 1:
                                return CALLS;
                            case 2:
                                return RETURNS_NOT_NULL;
                            default:
                                return 0;
                        }
                    }

                    private EffectType(int i, int i2) {
                        this.value = i2;
                    }
                }

                public enum InvocationKind implements EnumLite {
                    AT_MOST_ONCE(0, 0),
                    EXACTLY_ONCE(1, 1),
                    AT_LEAST_ONCE(2, 2);
                    
                    private static EnumLiteMap<InvocationKind> internalValueMap;
                    private final int value;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$1 */
                    static class C175941 implements EnumLiteMap<InvocationKind> {
                        C175941() {
                        }

                        public InvocationKind findValueByNumber(int i) {
                            return InvocationKind.valueOf(i);
                        }
                    }

                    static {
                        internalValueMap = new C175941();
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static InvocationKind valueOf(int i) {
                        switch (i) {
                            case 0:
                                return AT_MOST_ONCE;
                            case 1:
                                return EXACTLY_ONCE;
                            case 2:
                                return AT_LEAST_ONCE;
                            default:
                                return 0;
                        }
                    }

                    private InvocationKind(int i, int i2) {
                        this.value = i2;
                    }
                }

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1 */
                static class C184941 extends AbstractParser<Effect> {
                    C184941() {
                    }

                    public Effect parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Effect(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {
                    private int bitField0_;
                    private Expression conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
                    private List<Expression> effectConstructorArgument_ = Collections.emptyList();
                    private EffectType effectType_ = EffectType.RETURNS_CONSTANT;
                    private InvocationKind kind_ = InvocationKind.AT_MOST_ONCE;

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

                    public Effect getDefaultInstanceForType() {
                        return Effect.getDefaultInstance();
                    }

                    public Effect build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Effect buildPartial() {
                        Effect effect = new Effect((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        effect.effectType_ = this.effectType_;
                        if ((this.bitField0_ & 2) == 2) {
                            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                            this.bitField0_ &= -3;
                        }
                        effect.effectConstructorArgument_ = this.effectConstructorArgument_;
                        if ((i & 4) == 4) {
                            i2 |= 2;
                        }
                        effect.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
                        if ((i & 8) == 8) {
                            i2 |= 4;
                        }
                        effect.kind_ = this.kind_;
                        effect.bitField0_ = i2;
                        return effect;
                    }

                    public Builder mergeFrom(Effect effect) {
                        if (effect == Effect.getDefaultInstance()) {
                            return this;
                        }
                        if (effect.hasEffectType()) {
                            setEffectType(effect.getEffectType());
                        }
                        if (!effect.effectConstructorArgument_.isEmpty()) {
                            if (this.effectConstructorArgument_.isEmpty()) {
                                this.effectConstructorArgument_ = effect.effectConstructorArgument_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureEffectConstructorArgumentIsMutable();
                                this.effectConstructorArgument_.addAll(effect.effectConstructorArgument_);
                            }
                        }
                        if (effect.hasConclusionOfConditionalEffect()) {
                            mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                        }
                        if (effect.hasKind()) {
                            setKind(effect.getKind());
                        }
                        setUnknownFields(getUnknownFields().concat(effect.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                            if (!getEffectConstructorArgument(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Effect effect;
                        Effect effect2 = null;
                        try {
                            Effect effect3 = (Effect) Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (effect3 != null) {
                                mergeFrom(effect3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            effect = (Effect) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            effect2 = effect;
                        }
                        if (effect2 != null) {
                            mergeFrom(effect2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setEffectType(EffectType effectType) {
                        if (effectType == null) {
                            throw new NullPointerException();
                        }
                        this.bitField0_ |= 1;
                        this.effectType_ = effectType;
                        return this;
                    }

                    private void ensureEffectConstructorArgumentIsMutable() {
                        if ((this.bitField0_ & 2) != 2) {
                            this.effectConstructorArgument_ = new ArrayList(this.effectConstructorArgument_);
                            this.bitField0_ |= 2;
                        }
                    }

                    public int getEffectConstructorArgumentCount() {
                        return this.effectConstructorArgument_.size();
                    }

                    public Expression getEffectConstructorArgument(int i) {
                        return (Expression) this.effectConstructorArgument_.get(i);
                    }

                    public boolean hasConclusionOfConditionalEffect() {
                        return (this.bitField0_ & 4) == 4;
                    }

                    public Expression getConclusionOfConditionalEffect() {
                        return this.conclusionOfConditionalEffect_;
                    }

                    public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                        if ((this.bitField0_ & 4) != 4 || this.conclusionOfConditionalEffect_ == Expression.getDefaultInstance()) {
                            this.conclusionOfConditionalEffect_ = expression;
                        } else {
                            this.conclusionOfConditionalEffect_ = Expression.newBuilder(this.conclusionOfConditionalEffect_).mergeFrom(expression).buildPartial();
                        }
                        this.bitField0_ |= 4;
                        return this;
                    }

                    public Builder setKind(InvocationKind invocationKind) {
                        if (invocationKind == null) {
                            throw new NullPointerException();
                        }
                        this.bitField0_ |= 8;
                        this.kind_ = invocationKind;
                        return this;
                    }
                }

                private Effect(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private Effect(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Effect getDefaultInstance() {
                    return defaultInstance;
                }

                public Effect getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Effect(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r9 = this;
                    r9.<init>();
                    r0 = -1;
                    r9.memoizedIsInitialized = r0;
                    r9.memoizedSerializedSize = r0;
                    r9.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 2;
                    if (r3 != 0) goto L_0x00ea;
                L_0x0019:
                    r6 = r10.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 == 0) goto L_0x00ae;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x001f:
                    r7 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 == r7) goto L_0x0093;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0023:
                    r7 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 == r7) goto L_0x007a;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0027:
                    r7 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 == r7) goto L_0x0051;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x002b:
                    r7 = 32;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 == r7) goto L_0x0037;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x002f:
                    r6 = r9.parseUnknownField(r10, r2, r11, r6);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0035:
                    goto L_0x00ae;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0037:
                    r7 = r10.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.valueOf(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r8 != 0) goto L_0x0048;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0041:
                    r2.writeRawVarint32(r6);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r2.writeRawVarint32(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0048:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6 = r6 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.kind_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0051:
                    r6 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r7 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r7 = r7 & r5;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r7 != r5) goto L_0x005d;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0057:
                    r6 = r9.conclusionOfConditionalEffect_;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x005d:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r7 = r10.readMessage(r7, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r7;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.conclusionOfConditionalEffect_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 == 0) goto L_0x0074;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0069:
                    r7 = r9.conclusionOfConditionalEffect_;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.conclusionOfConditionalEffect_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0074:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6 = r6 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x007a:
                    r6 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r6 == r5) goto L_0x0087;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x007e:
                    r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.effectConstructorArgument_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0087:
                    r6 = r9.effectConstructorArgument_;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r7 = r10.readMessage(r7, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x0093:
                    r7 = r10.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.valueOf(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    if (r8 != 0) goto L_0x00a5;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x009d:
                    r2.writeRawVarint32(r6);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r2.writeRawVarint32(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                L_0x00a5:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r6 = r6 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    r9.effectType_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x00c2, IOException -> 0x00b3 }
                    goto L_0x0016;
                L_0x00ae:
                    r3 = 1;
                    goto L_0x0016;
                L_0x00b1:
                    r10 = move-exception;
                    goto L_0x00c8;
                L_0x00b3:
                    r10 = move-exception;
                    r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00b1 }
                    r10 = r10.getMessage();	 Catch:{ all -> 0x00b1 }
                    r11.<init>(r10);	 Catch:{ all -> 0x00b1 }
                    r10 = r11.setUnfinishedMessage(r9);	 Catch:{ all -> 0x00b1 }
                    throw r10;	 Catch:{ all -> 0x00b1 }
                L_0x00c2:
                    r10 = move-exception;	 Catch:{ all -> 0x00b1 }
                    r10 = r10.setUnfinishedMessage(r9);	 Catch:{ all -> 0x00b1 }
                    throw r10;	 Catch:{ all -> 0x00b1 }
                L_0x00c8:
                    r11 = r4 & 2;
                    if (r11 != r5) goto L_0x00d4;
                L_0x00cc:
                    r11 = r9.effectConstructorArgument_;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r9.effectConstructorArgument_ = r11;
                L_0x00d4:
                    r2.flush();	 Catch:{ IOException -> 0x00d7, all -> 0x00de }
                L_0x00d7:
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    goto L_0x00e6;
                L_0x00de:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x00e6:
                    r9.makeExtensionsImmutable();
                    throw r10;
                L_0x00ea:
                    r10 = r4 & 2;
                    if (r10 != r5) goto L_0x00f6;
                L_0x00ee:
                    r10 = r9.effectConstructorArgument_;
                    r10 = java.util.Collections.unmodifiableList(r10);
                    r9.effectConstructorArgument_ = r10;
                L_0x00f6:
                    r2.flush();	 Catch:{ IOException -> 0x00f9, all -> 0x0100 }
                L_0x00f9:
                    r10 = r0.toByteString();
                    r9.unknownFields = r10;
                    goto L_0x0108;
                L_0x0100:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x0108:
                    r9.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Effect> getParserForType() {
                    return PARSER;
                }

                public boolean hasEffectType() {
                    return (this.bitField0_ & 1) == 1;
                }

                public EffectType getEffectType() {
                    return this.effectType_;
                }

                public int getEffectConstructorArgumentCount() {
                    return this.effectConstructorArgument_.size();
                }

                public Expression getEffectConstructorArgument(int i) {
                    return (Expression) this.effectConstructorArgument_.get(i);
                }

                public boolean hasConclusionOfConditionalEffect() {
                    return (this.bitField0_ & 2) == 2;
                }

                public Expression getConclusionOfConditionalEffect() {
                    return this.conclusionOfConditionalEffect_;
                }

                public boolean hasKind() {
                    return (this.bitField0_ & 4) == 4;
                }

                public InvocationKind getKind() {
                    return this.kind_;
                }

                private void initFields() {
                    this.effectType_ = EffectType.RETURNS_CONSTANT;
                    this.effectConstructorArgument_ = Collections.emptyList();
                    this.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
                    this.kind_ = InvocationKind.AT_MOST_ONCE;
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
                    while (i < getEffectConstructorArgumentCount()) {
                        if (getEffectConstructorArgument(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    }
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.effectType_.getNumber());
                    }
                    for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                        codedOutputStream.writeMessage(2, (MessageLite) this.effectConstructorArgument_.get(i));
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeMessage(3, this.conclusionOfConditionalEffect_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeEnum(4, this.kind_.getNumber());
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.effectType_.getNumber()) + 0 : 0;
                    while (i2 < this.effectConstructorArgument_.size()) {
                        i += CodedOutputStream.computeMessageSize(2, (MessageLite) this.effectConstructorArgument_.get(i2));
                        i2++;
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeMessageSize(3, this.conclusionOfConditionalEffect_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeEnumSize(4, this.kind_.getNumber());
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

                public static Builder newBuilder(Effect effect) {
                    return newBuilder().mergeFrom(effect);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
                public static Parser<Expression> PARSER = new C184961();
                private static final Expression defaultInstance = new Expression(true);
                private List<Expression> andArgument_;
                private int bitField0_;
                private ConstantValue constantValue_;
                private int flags_;
                private int isInstanceTypeId_;
                private Type isInstanceType_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private List<Expression> orArgument_;
                private final ByteString unknownFields;
                private int valueParameterReference_;

                public enum ConstantValue implements EnumLite {
                    TRUE(0, 0),
                    FALSE(1, 1),
                    NULL(2, 2);
                    
                    private static EnumLiteMap<ConstantValue> internalValueMap;
                    private final int value;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$1 */
                    static class C175951 implements EnumLiteMap<ConstantValue> {
                        C175951() {
                        }

                        public ConstantValue findValueByNumber(int i) {
                            return ConstantValue.valueOf(i);
                        }
                    }

                    static {
                        internalValueMap = new C175951();
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static ConstantValue valueOf(int i) {
                        switch (i) {
                            case 0:
                                return TRUE;
                            case 1:
                                return FALSE;
                            case 2:
                                return NULL;
                            default:
                                return 0;
                        }
                    }

                    private ConstantValue(int i, int i2) {
                        this.value = i2;
                    }
                }

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1 */
                static class C184961 extends AbstractParser<Expression> {
                    C184961() {
                    }

                    public Expression parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Expression(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
                    private List<Expression> andArgument_ = Collections.emptyList();
                    private int bitField0_;
                    private ConstantValue constantValue_ = ConstantValue.TRUE;
                    private int flags_;
                    private int isInstanceTypeId_;
                    private Type isInstanceType_ = Type.getDefaultInstance();
                    private List<Expression> orArgument_ = Collections.emptyList();
                    private int valueParameterReference_;

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

                    public Expression getDefaultInstanceForType() {
                        return Expression.getDefaultInstance();
                    }

                    public Expression build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Expression buildPartial() {
                        Expression expression = new Expression((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        expression.flags_ = this.flags_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        expression.valueParameterReference_ = this.valueParameterReference_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        expression.constantValue_ = this.constantValue_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        expression.isInstanceType_ = this.isInstanceType_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        expression.isInstanceTypeId_ = this.isInstanceTypeId_;
                        if ((this.bitField0_ & 32) == 32) {
                            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                            this.bitField0_ &= -33;
                        }
                        expression.andArgument_ = this.andArgument_;
                        if ((this.bitField0_ & 64) == 64) {
                            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                            this.bitField0_ &= -65;
                        }
                        expression.orArgument_ = this.orArgument_;
                        expression.bitField0_ = i2;
                        return expression;
                    }

                    public Builder mergeFrom(Expression expression) {
                        if (expression == Expression.getDefaultInstance()) {
                            return this;
                        }
                        if (expression.hasFlags()) {
                            setFlags(expression.getFlags());
                        }
                        if (expression.hasValueParameterReference()) {
                            setValueParameterReference(expression.getValueParameterReference());
                        }
                        if (expression.hasConstantValue()) {
                            setConstantValue(expression.getConstantValue());
                        }
                        if (expression.hasIsInstanceType()) {
                            mergeIsInstanceType(expression.getIsInstanceType());
                        }
                        if (expression.hasIsInstanceTypeId()) {
                            setIsInstanceTypeId(expression.getIsInstanceTypeId());
                        }
                        if (!expression.andArgument_.isEmpty()) {
                            if (this.andArgument_.isEmpty()) {
                                this.andArgument_ = expression.andArgument_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureAndArgumentIsMutable();
                                this.andArgument_.addAll(expression.andArgument_);
                            }
                        }
                        if (!expression.orArgument_.isEmpty()) {
                            if (this.orArgument_.isEmpty()) {
                                this.orArgument_ = expression.orArgument_;
                                this.bitField0_ &= -65;
                            } else {
                                ensureOrArgumentIsMutable();
                                this.orArgument_.addAll(expression.orArgument_);
                            }
                        }
                        setUnknownFields(getUnknownFields().concat(expression.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                            return false;
                        }
                        int i;
                        for (i = 0; i < getAndArgumentCount(); i++) {
                            if (!getAndArgument(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getOrArgumentCount(); i++) {
                            if (!getOrArgument(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Expression expression;
                        Expression expression2 = null;
                        try {
                            Expression expression3 = (Expression) Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (expression3 != null) {
                                mergeFrom(expression3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            expression = (Expression) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            expression2 = expression;
                        }
                        if (expression2 != null) {
                            mergeFrom(expression2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1;
                        this.flags_ = i;
                        return this;
                    }

                    public Builder setValueParameterReference(int i) {
                        this.bitField0_ |= 2;
                        this.valueParameterReference_ = i;
                        return this;
                    }

                    public Builder setConstantValue(ConstantValue constantValue) {
                        if (constantValue == null) {
                            throw new NullPointerException();
                        }
                        this.bitField0_ |= 4;
                        this.constantValue_ = constantValue;
                        return this;
                    }

                    public boolean hasIsInstanceType() {
                        return (this.bitField0_ & 8) == 8;
                    }

                    public Type getIsInstanceType() {
                        return this.isInstanceType_;
                    }

                    public Builder mergeIsInstanceType(Type type) {
                        if ((this.bitField0_ & 8) != 8 || this.isInstanceType_ == Type.getDefaultInstance()) {
                            this.isInstanceType_ = type;
                        } else {
                            this.isInstanceType_ = Type.newBuilder(this.isInstanceType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 8;
                        return this;
                    }

                    public Builder setIsInstanceTypeId(int i) {
                        this.bitField0_ |= 16;
                        this.isInstanceTypeId_ = i;
                        return this;
                    }

                    private void ensureAndArgumentIsMutable() {
                        if ((this.bitField0_ & 32) != 32) {
                            this.andArgument_ = new ArrayList(this.andArgument_);
                            this.bitField0_ |= 32;
                        }
                    }

                    public int getAndArgumentCount() {
                        return this.andArgument_.size();
                    }

                    public Expression getAndArgument(int i) {
                        return (Expression) this.andArgument_.get(i);
                    }

                    private void ensureOrArgumentIsMutable() {
                        if ((this.bitField0_ & 64) != 64) {
                            this.orArgument_ = new ArrayList(this.orArgument_);
                            this.bitField0_ |= 64;
                        }
                    }

                    public int getOrArgumentCount() {
                        return this.orArgument_.size();
                    }

                    public Expression getOrArgument(int i) {
                        return (Expression) this.orArgument_.get(i);
                    }
                }

                private Expression(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private Expression(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Expression getDefaultInstance() {
                    return defaultInstance;
                }

                public Expression getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Expression(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r12, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                    r5 = 32;
                    r6 = 64;
                    if (r3 != 0) goto L_0x012d;
                L_0x001c:
                    r7 = r12.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == 0) goto L_0x00e5;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0022:
                    r8 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r8) goto L_0x00d8;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0026:
                    r9 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r9) goto L_0x00ca;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x002a:
                    r10 = 24;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r10) goto L_0x00ae;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x002e:
                    r10 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r10) goto L_0x0084;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0032:
                    r8 = 40;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r8) goto L_0x0078;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0036:
                    r8 = 50;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r8) goto L_0x005f;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x003a:
                    r8 = 58;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r8) goto L_0x0046;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x003e:
                    r7 = r11.parseUnknownField(r12, r2, r13, r7);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0044:
                    goto L_0x00e5;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0046:
                    r7 = r4 & 64;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r6) goto L_0x0053;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x004a:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.orArgument_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r4 = r4 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0053:
                    r7 = r11.orArgument_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r8 = PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r8 = r12.readMessage(r8, r13);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x005f:
                    r7 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == r5) goto L_0x006c;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0063:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.andArgument_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x006c:
                    r7 = r11.andArgument_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r8 = PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r8 = r12.readMessage(r8, r13);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0078:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r7 | r9;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.isInstanceTypeId_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0084:
                    r7 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r9 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r9 = r9 & r8;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r9 != r8) goto L_0x0090;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x008a:
                    r7 = r11.isInstanceType_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x0090:
                    r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r9 = r12.readMessage(r9, r13);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r9;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.isInstanceType_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r7 == 0) goto L_0x00a7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x009c:
                    r9 = r11.isInstanceType_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7.mergeFrom(r9);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r7.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.isInstanceType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x00a7:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r7 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x00ae:
                    r8 = r12.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.valueOf(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    if (r9 != 0) goto L_0x00c0;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x00b8:
                    r2.writeRawVarint32(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r2.writeRawVarint32(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x00c0:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r7 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.constantValue_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x00ca:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r7 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.valueParameterReference_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                L_0x00d8:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r7 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r7 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    r11.flags_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00f9, IOException -> 0x00ea }
                    goto L_0x0016;
                L_0x00e5:
                    r3 = 1;
                    goto L_0x0016;
                L_0x00e8:
                    r12 = move-exception;
                    goto L_0x00ff;
                L_0x00ea:
                    r12 = move-exception;
                    r13 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00e8 }
                    r12 = r12.getMessage();	 Catch:{ all -> 0x00e8 }
                    r13.<init>(r12);	 Catch:{ all -> 0x00e8 }
                    r12 = r13.setUnfinishedMessage(r11);	 Catch:{ all -> 0x00e8 }
                    throw r12;	 Catch:{ all -> 0x00e8 }
                L_0x00f9:
                    r12 = move-exception;	 Catch:{ all -> 0x00e8 }
                    r12 = r12.setUnfinishedMessage(r11);	 Catch:{ all -> 0x00e8 }
                    throw r12;	 Catch:{ all -> 0x00e8 }
                L_0x00ff:
                    r13 = r4 & 32;
                    if (r13 != r5) goto L_0x010b;
                L_0x0103:
                    r13 = r11.andArgument_;
                    r13 = java.util.Collections.unmodifiableList(r13);
                    r11.andArgument_ = r13;
                L_0x010b:
                    r13 = r4 & 64;
                    if (r13 != r6) goto L_0x0117;
                L_0x010f:
                    r13 = r11.orArgument_;
                    r13 = java.util.Collections.unmodifiableList(r13);
                    r11.orArgument_ = r13;
                L_0x0117:
                    r2.flush();	 Catch:{ IOException -> 0x011a, all -> 0x0121 }
                L_0x011a:
                    r13 = r0.toByteString();
                    r11.unknownFields = r13;
                    goto L_0x0129;
                L_0x0121:
                    r12 = move-exception;
                    r13 = r0.toByteString();
                    r11.unknownFields = r13;
                    throw r12;
                L_0x0129:
                    r11.makeExtensionsImmutable();
                    throw r12;
                L_0x012d:
                    r12 = r4 & 32;
                    if (r12 != r5) goto L_0x0139;
                L_0x0131:
                    r12 = r11.andArgument_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r11.andArgument_ = r12;
                L_0x0139:
                    r12 = r4 & 64;
                    if (r12 != r6) goto L_0x0145;
                L_0x013d:
                    r12 = r11.orArgument_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r11.orArgument_ = r12;
                L_0x0145:
                    r2.flush();	 Catch:{ IOException -> 0x0148, all -> 0x014f }
                L_0x0148:
                    r12 = r0.toByteString();
                    r11.unknownFields = r12;
                    goto L_0x0157;
                L_0x014f:
                    r12 = move-exception;
                    r13 = r0.toByteString();
                    r11.unknownFields = r13;
                    throw r12;
                L_0x0157:
                    r11.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Expression> getParserForType() {
                    return PARSER;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public boolean hasValueParameterReference() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getValueParameterReference() {
                    return this.valueParameterReference_;
                }

                public boolean hasConstantValue() {
                    return (this.bitField0_ & 4) == 4;
                }

                public ConstantValue getConstantValue() {
                    return this.constantValue_;
                }

                public boolean hasIsInstanceType() {
                    return (this.bitField0_ & 8) == 8;
                }

                public Type getIsInstanceType() {
                    return this.isInstanceType_;
                }

                public boolean hasIsInstanceTypeId() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int getIsInstanceTypeId() {
                    return this.isInstanceTypeId_;
                }

                public int getAndArgumentCount() {
                    return this.andArgument_.size();
                }

                public Expression getAndArgument(int i) {
                    return (Expression) this.andArgument_.get(i);
                }

                public int getOrArgumentCount() {
                    return this.orArgument_.size();
                }

                public Expression getOrArgument(int i) {
                    return (Expression) this.orArgument_.get(i);
                }

                private void initFields() {
                    this.flags_ = 0;
                    this.valueParameterReference_ = 0;
                    this.constantValue_ = ConstantValue.TRUE;
                    this.isInstanceType_ = Type.getDefaultInstance();
                    this.isInstanceTypeId_ = 0;
                    this.andArgument_ = Collections.emptyList();
                    this.orArgument_ = Collections.emptyList();
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (!hasIsInstanceType() || getIsInstanceType().isInitialized()) {
                        int i = 0;
                        while (i < getAndArgumentCount()) {
                            if (getAndArgument(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        i = 0;
                        while (i < getOrArgumentCount()) {
                            if (getOrArgument(i).isInitialized()) {
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
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(1, this.flags_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(2, this.valueParameterReference_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeEnum(3, this.constantValue_.getNumber());
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeMessage(4, this.isInstanceType_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.isInstanceTypeId_);
                    }
                    for (int i = 0; i < this.andArgument_.size(); i++) {
                        codedOutputStream.writeMessage(6, (MessageLite) this.andArgument_.get(i));
                    }
                    for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                        codedOutputStream.writeMessage(7, (MessageLite) this.orArgument_.get(i2));
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(2, this.valueParameterReference_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeEnumSize(3, this.constantValue_.getNumber());
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeMessageSize(4, this.isInstanceType_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i += CodedOutputStream.computeInt32Size(5, this.isInstanceTypeId_);
                    }
                    int i3 = i;
                    for (i = 0; i < this.andArgument_.size(); i++) {
                        i3 += CodedOutputStream.computeMessageSize(6, (MessageLite) this.andArgument_.get(i));
                    }
                    while (i2 < this.orArgument_.size()) {
                        i3 += CodedOutputStream.computeMessageSize(7, (MessageLite) this.orArgument_.get(i2));
                        i2++;
                    }
                    i3 += this.unknownFields.size();
                    this.memoizedSerializedSize = i3;
                    return i3;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Expression expression) {
                    return newBuilder().mergeFrom(expression);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
                public static Parser<QualifiedNameTable> PARSER = new C185011();
                private static final QualifiedNameTable defaultInstance = new QualifiedNameTable(true);
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private List<QualifiedName> qualifiedName_;
                private final ByteString unknownFields;

                public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
                }

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1 */
                static class C185011 extends AbstractParser<QualifiedNameTable> {
                    C185011() {
                    }

                    public QualifiedNameTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {
                    private int bitField0_;
                    private List<QualifiedName> qualifiedName_ = Collections.emptyList();

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

                    public QualifiedNameTable getDefaultInstanceForType() {
                        return QualifiedNameTable.getDefaultInstance();
                    }

                    public QualifiedNameTable build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public QualifiedNameTable buildPartial() {
                        QualifiedNameTable qualifiedNameTable = new QualifiedNameTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        if ((this.bitField0_ & 1) == 1) {
                            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                            this.bitField0_ &= -2;
                        }
                        qualifiedNameTable.qualifiedName_ = this.qualifiedName_;
                        return qualifiedNameTable;
                    }

                    public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                        if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                            return this;
                        }
                        if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                            if (this.qualifiedName_.isEmpty()) {
                                this.qualifiedName_ = qualifiedNameTable.qualifiedName_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureQualifiedNameIsMutable();
                                this.qualifiedName_.addAll(qualifiedNameTable.qualifiedName_);
                            }
                        }
                        setUnknownFields(getUnknownFields().concat(qualifiedNameTable.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        for (int i = 0; i < getQualifiedNameCount(); i++) {
                            if (!getQualifiedName(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        QualifiedNameTable qualifiedNameTable;
                        QualifiedNameTable qualifiedNameTable2 = null;
                        try {
                            QualifiedNameTable qualifiedNameTable3 = (QualifiedNameTable) QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (qualifiedNameTable3 != null) {
                                mergeFrom(qualifiedNameTable3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            qualifiedNameTable = (QualifiedNameTable) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            qualifiedNameTable2 = qualifiedNameTable;
                        }
                        if (qualifiedNameTable2 != null) {
                            mergeFrom(qualifiedNameTable2);
                        }
                        throw codedInputStream2;
                    }

                    private void ensureQualifiedNameIsMutable() {
                        if ((this.bitField0_ & 1) != 1) {
                            this.qualifiedName_ = new ArrayList(this.qualifiedName_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public int getQualifiedNameCount() {
                        return this.qualifiedName_.size();
                    }

                    public QualifiedName getQualifiedName(int i) {
                        return (QualifiedName) this.qualifiedName_.get(i);
                    }
                }

                public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
                    public static Parser<QualifiedName> PARSER = new C185021();
                    private static final QualifiedName defaultInstance = new QualifiedName(true);
                    private int bitField0_;
                    private Kind kind_;
                    private byte memoizedIsInitialized;
                    private int memoizedSerializedSize;
                    private int parentQualifiedName_;
                    private int shortName_;
                    private final ByteString unknownFields;

                    public enum Kind implements EnumLite {
                        CLASS(0, 0),
                        PACKAGE(1, 1),
                        LOCAL(2, 2);
                        
                        private static EnumLiteMap<Kind> internalValueMap;
                        private final int value;

                        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$1 */
                        static class C175981 implements EnumLiteMap<Kind> {
                            C175981() {
                            }

                            public Kind findValueByNumber(int i) {
                                return Kind.valueOf(i);
                            }
                        }

                        static {
                            internalValueMap = new C175981();
                        }

                        public final int getNumber() {
                            return this.value;
                        }

                        public static Kind valueOf(int i) {
                            switch (i) {
                                case 0:
                                    return CLASS;
                                case 1:
                                    return PACKAGE;
                                case 2:
                                    return LOCAL;
                                default:
                                    return 0;
                            }
                        }

                        private Kind(int i, int i2) {
                            this.value = i2;
                        }
                    }

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1 */
                    static class C185021 extends AbstractParser<QualifiedName> {
                        C185021() {
                        }

                        public QualifiedName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new QualifiedName(codedInputStream, extensionRegistryLite);
                        }
                    }

                    public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {
                        private int bitField0_;
                        private Kind kind_ = Kind.PACKAGE;
                        private int parentQualifiedName_ = -1;
                        private int shortName_;

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

                        public QualifiedName getDefaultInstanceForType() {
                            return QualifiedName.getDefaultInstance();
                        }

                        public QualifiedName build() {
                            Object buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                        }

                        public QualifiedName buildPartial() {
                            QualifiedName qualifiedName = new QualifiedName((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                            int i = this.bitField0_;
                            int i2 = 1;
                            if ((i & 1) != 1) {
                                i2 = 0;
                            }
                            qualifiedName.parentQualifiedName_ = this.parentQualifiedName_;
                            if ((i & 2) == 2) {
                                i2 |= 2;
                            }
                            qualifiedName.shortName_ = this.shortName_;
                            if ((i & 4) == 4) {
                                i2 |= 4;
                            }
                            qualifiedName.kind_ = this.kind_;
                            qualifiedName.bitField0_ = i2;
                            return qualifiedName;
                        }

                        public Builder mergeFrom(QualifiedName qualifiedName) {
                            if (qualifiedName == QualifiedName.getDefaultInstance()) {
                                return this;
                            }
                            if (qualifiedName.hasParentQualifiedName()) {
                                setParentQualifiedName(qualifiedName.getParentQualifiedName());
                            }
                            if (qualifiedName.hasShortName()) {
                                setShortName(qualifiedName.getShortName());
                            }
                            if (qualifiedName.hasKind()) {
                                setKind(qualifiedName.getKind());
                            }
                            setUnknownFields(getUnknownFields().concat(qualifiedName.unknownFields));
                            return this;
                        }

                        public final boolean isInitialized() {
                            return hasShortName();
                        }

                        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            QualifiedName qualifiedName;
                            QualifiedName qualifiedName2 = null;
                            try {
                                QualifiedName qualifiedName3 = (QualifiedName) QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (qualifiedName3 != null) {
                                    mergeFrom(qualifiedName3);
                                }
                                return this;
                            } catch (CodedInputStream codedInputStream2) {
                                qualifiedName = (QualifiedName) codedInputStream2.getUnfinishedMessage();
                                throw codedInputStream2;
                            } catch (Throwable th) {
                                codedInputStream2 = th;
                                qualifiedName2 = qualifiedName;
                            }
                            if (qualifiedName2 != null) {
                                mergeFrom(qualifiedName2);
                            }
                            throw codedInputStream2;
                        }

                        public Builder setParentQualifiedName(int i) {
                            this.bitField0_ |= 1;
                            this.parentQualifiedName_ = i;
                            return this;
                        }

                        public boolean hasShortName() {
                            return (this.bitField0_ & 2) == 2;
                        }

                        public Builder setShortName(int i) {
                            this.bitField0_ |= 2;
                            this.shortName_ = i;
                            return this;
                        }

                        public Builder setKind(Kind kind) {
                            if (kind == null) {
                                throw new NullPointerException();
                            }
                            this.bitField0_ |= 4;
                            this.kind_ = kind;
                            return this;
                        }
                    }

                    private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                        super(builder);
                        this.memoizedIsInitialized = (byte) -1;
                        this.memoizedSerializedSize = -1;
                        this.unknownFields = builder.getUnknownFields();
                    }

                    private QualifiedName(boolean z) {
                        this.memoizedIsInitialized = (byte) -1;
                        this.memoizedSerializedSize = -1;
                        this.unknownFields = ByteString.EMPTY;
                    }

                    public static QualifiedName getDefaultInstance() {
                        return defaultInstance;
                    }

                    public QualifiedName getDefaultInstanceForType() {
                        return defaultInstance;
                    }

                    private QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                        if (r3 != 0) goto L_0x0092;
                    L_0x0017:
                        r4 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        if (r4 == 0) goto L_0x0063;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x001d:
                        r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        if (r4 == r5) goto L_0x0057;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x0021:
                        r5 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        if (r4 == r5) goto L_0x004a;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x0025:
                        r5 = 24;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        if (r4 == r5) goto L_0x0030;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x0029:
                        r4 = r7.parseUnknownField(r8, r2, r9, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x002f:
                        goto L_0x0063;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x0030:
                        r5 = r8.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.valueOf(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        if (r6 != 0) goto L_0x0041;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x003a:
                        r2.writeRawVarint32(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r2.writeRawVarint32(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x0041:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r7.kind_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x004a:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r4 = r8.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r7.shortName_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    L_0x0057:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r4 = r8.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        r7.parentQualifiedName_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                        goto L_0x0015;
                    L_0x0063:
                        r3 = 1;
                        goto L_0x0015;
                    L_0x0065:
                        r8 = move-exception;
                        goto L_0x007c;
                    L_0x0067:
                        r8 = move-exception;
                        r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0065 }
                        r8 = r8.getMessage();	 Catch:{ all -> 0x0065 }
                        r9.<init>(r8);	 Catch:{ all -> 0x0065 }
                        r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0065 }
                        throw r8;	 Catch:{ all -> 0x0065 }
                    L_0x0076:
                        r8 = move-exception;	 Catch:{ all -> 0x0065 }
                        r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0065 }
                        throw r8;	 Catch:{ all -> 0x0065 }
                    L_0x007c:
                        r2.flush();	 Catch:{ IOException -> 0x007f, all -> 0x0086 }
                    L_0x007f:
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        goto L_0x008e;
                    L_0x0086:
                        r8 = move-exception;
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        throw r8;
                    L_0x008e:
                        r7.makeExtensionsImmutable();
                        throw r8;
                    L_0x0092:
                        r2.flush();	 Catch:{ IOException -> 0x0095, all -> 0x009c }
                    L_0x0095:
                        r8 = r0.toByteString();
                        r7.unknownFields = r8;
                        goto L_0x00a4;
                    L_0x009c:
                        r8 = move-exception;
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        throw r8;
                    L_0x00a4:
                        r7.makeExtensionsImmutable();
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                    }

                    static {
                        defaultInstance.initFields();
                    }

                    public Parser<QualifiedName> getParserForType() {
                        return PARSER;
                    }

                    public boolean hasParentQualifiedName() {
                        return (this.bitField0_ & 1) == 1;
                    }

                    public int getParentQualifiedName() {
                        return this.parentQualifiedName_;
                    }

                    public boolean hasShortName() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public int getShortName() {
                        return this.shortName_;
                    }

                    public boolean hasKind() {
                        return (this.bitField0_ & 4) == 4;
                    }

                    public Kind getKind() {
                        return this.kind_;
                    }

                    private void initFields() {
                        this.parentQualifiedName_ = -1;
                        this.shortName_ = 0;
                        this.kind_ = Kind.PACKAGE;
                    }

                    public final boolean isInitialized() {
                        byte b = this.memoizedIsInitialized;
                        if (b == (byte) 1) {
                            return true;
                        }
                        if (b == (byte) 0) {
                            return false;
                        }
                        if (hasShortName()) {
                            this.memoizedIsInitialized = (byte) 1;
                            return true;
                        }
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }

                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        getSerializedSize();
                        if ((this.bitField0_ & 1) == 1) {
                            codedOutputStream.writeInt32(1, this.parentQualifiedName_);
                        }
                        if ((this.bitField0_ & 2) == 2) {
                            codedOutputStream.writeInt32(2, this.shortName_);
                        }
                        if ((this.bitField0_ & 4) == 4) {
                            codedOutputStream.writeEnum(3, this.kind_.getNumber());
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
                            i = 0 + CodedOutputStream.computeInt32Size(1, this.parentQualifiedName_);
                        }
                        if ((this.bitField0_ & 2) == 2) {
                            i += CodedOutputStream.computeInt32Size(2, this.shortName_);
                        }
                        if ((this.bitField0_ & 4) == 4) {
                            i += CodedOutputStream.computeEnumSize(3, this.kind_.getNumber());
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

                    public static Builder newBuilder(QualifiedName qualifiedName) {
                        return newBuilder().mergeFrom(qualifiedName);
                    }

                    public Builder toBuilder() {
                        return newBuilder(this);
                    }
                }

                private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private QualifiedNameTable(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static QualifiedNameTable getDefaultInstance() {
                    return defaultInstance;
                }

                public QualifiedNameTable getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                    r4 = 0;
                L_0x0016:
                    if (r3 != 0) goto L_0x007d;
                L_0x0018:
                    r5 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == 0) goto L_0x0042;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x001e:
                    r6 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == r6) goto L_0x0029;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0022:
                    r5 = r7.parseUnknownField(r8, r2, r9, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0028:
                    goto L_0x0042;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0029:
                    r5 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == r1) goto L_0x0036;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x002d:
                    r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r7.qualifiedName_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0036:
                    r5 = r7.qualifiedName_;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r6 = r8.readMessage(r6, r9);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r5.add(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    goto L_0x0016;
                L_0x0042:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0044:
                    r8 = move-exception;
                    goto L_0x005b;
                L_0x0046:
                    r8 = move-exception;
                    r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0044 }
                    r8 = r8.getMessage();	 Catch:{ all -> 0x0044 }
                    r9.<init>(r8);	 Catch:{ all -> 0x0044 }
                    r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0044 }
                    throw r8;	 Catch:{ all -> 0x0044 }
                L_0x0055:
                    r8 = move-exception;	 Catch:{ all -> 0x0044 }
                    r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0044 }
                    throw r8;	 Catch:{ all -> 0x0044 }
                L_0x005b:
                    r9 = r4 & 1;
                    if (r9 != r1) goto L_0x0067;
                L_0x005f:
                    r9 = r7.qualifiedName_;
                    r9 = java.util.Collections.unmodifiableList(r9);
                    r7.qualifiedName_ = r9;
                L_0x0067:
                    r2.flush();	 Catch:{ IOException -> 0x006a, all -> 0x0071 }
                L_0x006a:
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    goto L_0x0079;
                L_0x0071:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x0079:
                    r7.makeExtensionsImmutable();
                    throw r8;
                L_0x007d:
                    r8 = r4 & 1;
                    if (r8 != r1) goto L_0x0089;
                L_0x0081:
                    r8 = r7.qualifiedName_;
                    r8 = java.util.Collections.unmodifiableList(r8);
                    r7.qualifiedName_ = r8;
                L_0x0089:
                    r2.flush();	 Catch:{ IOException -> 0x008c, all -> 0x0093 }
                L_0x008c:
                    r8 = r0.toByteString();
                    r7.unknownFields = r8;
                    goto L_0x009b;
                L_0x0093:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x009b:
                    r7.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<QualifiedNameTable> getParserForType() {
                    return PARSER;
                }

                public int getQualifiedNameCount() {
                    return this.qualifiedName_.size();
                }

                public QualifiedName getQualifiedName(int i) {
                    return (QualifiedName) this.qualifiedName_.get(i);
                }

                private void initFields() {
                    this.qualifiedName_ = Collections.emptyList();
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
                    while (i < getQualifiedNameCount()) {
                        if (getQualifiedName(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    for (int i = 0; i < this.qualifiedName_.size(); i++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.qualifiedName_.get(i));
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    for (i = 0; i < this.qualifiedName_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.qualifiedName_.get(i));
                    }
                    i2 += this.unknownFields.size();
                    this.memoizedSerializedSize = i2;
                    return i2;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
                    return newBuilder().mergeFrom(qualifiedNameTable);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
                public static Parser<StringTable> PARSER = new C185031();
                private static final StringTable defaultInstance = new StringTable(true);
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private LazyStringList string_;
                private final ByteString unknownFields;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1 */
                static class C185031 extends AbstractParser<StringTable> {
                    C185031() {
                    }

                    public StringTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new StringTable(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {
                    private int bitField0_;
                    private LazyStringList string_ = LazyStringArrayList.EMPTY;

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

                    public StringTable getDefaultInstanceForType() {
                        return StringTable.getDefaultInstance();
                    }

                    public StringTable build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public StringTable buildPartial() {
                        StringTable stringTable = new StringTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        if ((this.bitField0_ & 1) == 1) {
                            this.string_ = this.string_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        stringTable.string_ = this.string_;
                        return stringTable;
                    }

                    public Builder mergeFrom(StringTable stringTable) {
                        if (stringTable == StringTable.getDefaultInstance()) {
                            return this;
                        }
                        if (!stringTable.string_.isEmpty()) {
                            if (this.string_.isEmpty()) {
                                this.string_ = stringTable.string_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureStringIsMutable();
                                this.string_.addAll(stringTable.string_);
                            }
                        }
                        setUnknownFields(getUnknownFields().concat(stringTable.unknownFields));
                        return this;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        StringTable stringTable;
                        StringTable stringTable2 = null;
                        try {
                            StringTable stringTable3 = (StringTable) StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (stringTable3 != null) {
                                mergeFrom(stringTable3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            stringTable = (StringTable) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            stringTable2 = stringTable;
                        }
                        if (stringTable2 != null) {
                            mergeFrom(stringTable2);
                        }
                        throw codedInputStream2;
                    }

                    private void ensureStringIsMutable() {
                        if ((this.bitField0_ & 1) != 1) {
                            this.string_ = new LazyStringArrayList(this.string_);
                            this.bitField0_ |= 1;
                        }
                    }
                }

                private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private StringTable(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static StringTable getDefaultInstance() {
                    return defaultInstance;
                }

                public StringTable getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private StringTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                    r4 = 0;
                L_0x0016:
                    if (r3 != 0) goto L_0x007b;
                L_0x0018:
                    r5 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    if (r5 == 0) goto L_0x0040;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                L_0x001e:
                    r6 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    if (r5 == r6) goto L_0x0029;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                L_0x0022:
                    r5 = r7.parseUnknownField(r8, r2, r9, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    if (r5 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                L_0x0028:
                    goto L_0x0040;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                L_0x0029:
                    r5 = r8.readBytes();	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    r6 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    if (r6 == r1) goto L_0x003a;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                L_0x0031:
                    r6 = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    r7.string_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                L_0x003a:
                    r6 = r7.string_;	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    r6.add(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0053, IOException -> 0x0044 }
                    goto L_0x0016;
                L_0x0040:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0042:
                    r8 = move-exception;
                    goto L_0x0059;
                L_0x0044:
                    r8 = move-exception;
                    r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0042 }
                    r8 = r8.getMessage();	 Catch:{ all -> 0x0042 }
                    r9.<init>(r8);	 Catch:{ all -> 0x0042 }
                    r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0042 }
                    throw r8;	 Catch:{ all -> 0x0042 }
                L_0x0053:
                    r8 = move-exception;	 Catch:{ all -> 0x0042 }
                    r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0042 }
                    throw r8;	 Catch:{ all -> 0x0042 }
                L_0x0059:
                    r9 = r4 & 1;
                    if (r9 != r1) goto L_0x0065;
                L_0x005d:
                    r9 = r7.string_;
                    r9 = r9.getUnmodifiableView();
                    r7.string_ = r9;
                L_0x0065:
                    r2.flush();	 Catch:{ IOException -> 0x0068, all -> 0x006f }
                L_0x0068:
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    goto L_0x0077;
                L_0x006f:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x0077:
                    r7.makeExtensionsImmutable();
                    throw r8;
                L_0x007b:
                    r8 = r4 & 1;
                    if (r8 != r1) goto L_0x0087;
                L_0x007f:
                    r8 = r7.string_;
                    r8 = r8.getUnmodifiableView();
                    r7.string_ = r8;
                L_0x0087:
                    r2.flush();	 Catch:{ IOException -> 0x008a, all -> 0x0091 }
                L_0x008a:
                    r8 = r0.toByteString();
                    r7.unknownFields = r8;
                    goto L_0x0099;
                L_0x0091:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x0099:
                    r7.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<StringTable> getParserForType() {
                    return PARSER;
                }

                public ProtocolStringList getStringList() {
                    return this.string_;
                }

                public String getString(int i) {
                    return (String) this.string_.get(i);
                }

                private void initFields() {
                    this.string_ = LazyStringArrayList.EMPTY;
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
                    for (int i = 0; i < this.string_.size(); i++) {
                        codedOutputStream.writeBytes(1, this.string_.getByteString(i));
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.string_.size(); i3++) {
                        i2 += CodedOutputStream.computeBytesSizeNoTag(this.string_.getByteString(i3));
                    }
                    i2 = ((i2 + 0) + (getStringList().size() * 1)) + this.unknownFields.size();
                    this.memoizedSerializedSize = i2;
                    return i2;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(StringTable stringTable) {
                    return newBuilder().mergeFrom(stringTable);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
                public static Parser<TypeTable> PARSER = new C185081();
                private static final TypeTable defaultInstance = new TypeTable(true);
                private int bitField0_;
                private int firstNullable_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private List<Type> type_;
                private final ByteString unknownFields;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1 */
                static class C185081 extends AbstractParser<TypeTable> {
                    C185081() {
                    }

                    public TypeTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new TypeTable(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {
                    private int bitField0_;
                    private int firstNullable_ = -1;
                    private List<Type> type_ = Collections.emptyList();

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

                    public TypeTable getDefaultInstanceForType() {
                        return TypeTable.getDefaultInstance();
                    }

                    public TypeTable build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public TypeTable buildPartial() {
                        TypeTable typeTable = new TypeTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((this.bitField0_ & 1) == 1) {
                            this.type_ = Collections.unmodifiableList(this.type_);
                            this.bitField0_ &= -2;
                        }
                        typeTable.type_ = this.type_;
                        if ((i & 2) != 2) {
                            i2 = 0;
                        }
                        typeTable.firstNullable_ = this.firstNullable_;
                        typeTable.bitField0_ = i2;
                        return typeTable;
                    }

                    public Builder mergeFrom(TypeTable typeTable) {
                        if (typeTable == TypeTable.getDefaultInstance()) {
                            return this;
                        }
                        if (!typeTable.type_.isEmpty()) {
                            if (this.type_.isEmpty()) {
                                this.type_ = typeTable.type_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureTypeIsMutable();
                                this.type_.addAll(typeTable.type_);
                            }
                        }
                        if (typeTable.hasFirstNullable()) {
                            setFirstNullable(typeTable.getFirstNullable());
                        }
                        setUnknownFields(getUnknownFields().concat(typeTable.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        for (int i = 0; i < getTypeCount(); i++) {
                            if (!getType(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        TypeTable typeTable;
                        TypeTable typeTable2 = null;
                        try {
                            TypeTable typeTable3 = (TypeTable) TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (typeTable3 != null) {
                                mergeFrom(typeTable3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            typeTable = (TypeTable) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            typeTable2 = typeTable;
                        }
                        if (typeTable2 != null) {
                            mergeFrom(typeTable2);
                        }
                        throw codedInputStream2;
                    }

                    private void ensureTypeIsMutable() {
                        if ((this.bitField0_ & 1) != 1) {
                            this.type_ = new ArrayList(this.type_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public int getTypeCount() {
                        return this.type_.size();
                    }

                    public Type getType(int i) {
                        return (Type) this.type_.get(i);
                    }

                    public Builder setFirstNullable(int i) {
                        this.bitField0_ |= 2;
                        this.firstNullable_ = i;
                        return this;
                    }
                }

                private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private TypeTable(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static TypeTable getDefaultInstance() {
                    return defaultInstance;
                }

                public TypeTable getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private TypeTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                    r4 = 0;
                L_0x0016:
                    if (r3 != 0) goto L_0x008d;
                L_0x0018:
                    r5 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    if (r5 == 0) goto L_0x0052;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x001e:
                    r6 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    if (r5 == r6) goto L_0x0039;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x0022:
                    r6 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    if (r5 == r6) goto L_0x002d;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x0026:
                    r5 = r7.parseUnknownField(r8, r2, r9, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    if (r5 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x002c:
                    goto L_0x0052;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x002d:
                    r5 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r5 = r5 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r7.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r5 = r8.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r7.firstNullable_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x0039:
                    r5 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    if (r5 == r1) goto L_0x0046;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x003d:
                    r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r7.type_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                L_0x0046:
                    r5 = r7.type_;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r6 = r8.readMessage(r6, r9);	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    r5.add(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0065, IOException -> 0x0056 }
                    goto L_0x0016;
                L_0x0052:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0054:
                    r8 = move-exception;
                    goto L_0x006b;
                L_0x0056:
                    r8 = move-exception;
                    r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0054 }
                    r8 = r8.getMessage();	 Catch:{ all -> 0x0054 }
                    r9.<init>(r8);	 Catch:{ all -> 0x0054 }
                    r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0054 }
                    throw r8;	 Catch:{ all -> 0x0054 }
                L_0x0065:
                    r8 = move-exception;	 Catch:{ all -> 0x0054 }
                    r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0054 }
                    throw r8;	 Catch:{ all -> 0x0054 }
                L_0x006b:
                    r9 = r4 & 1;
                    if (r9 != r1) goto L_0x0077;
                L_0x006f:
                    r9 = r7.type_;
                    r9 = java.util.Collections.unmodifiableList(r9);
                    r7.type_ = r9;
                L_0x0077:
                    r2.flush();	 Catch:{ IOException -> 0x007a, all -> 0x0081 }
                L_0x007a:
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    goto L_0x0089;
                L_0x0081:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x0089:
                    r7.makeExtensionsImmutable();
                    throw r8;
                L_0x008d:
                    r8 = r4 & 1;
                    if (r8 != r1) goto L_0x0099;
                L_0x0091:
                    r8 = r7.type_;
                    r8 = java.util.Collections.unmodifiableList(r8);
                    r7.type_ = r8;
                L_0x0099:
                    r2.flush();	 Catch:{ IOException -> 0x009c, all -> 0x00a3 }
                L_0x009c:
                    r8 = r0.toByteString();
                    r7.unknownFields = r8;
                    goto L_0x00ab;
                L_0x00a3:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x00ab:
                    r7.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<TypeTable> getParserForType() {
                    return PARSER;
                }

                public List<Type> getTypeList() {
                    return this.type_;
                }

                public int getTypeCount() {
                    return this.type_.size();
                }

                public Type getType(int i) {
                    return (Type) this.type_.get(i);
                }

                public boolean hasFirstNullable() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFirstNullable() {
                    return this.firstNullable_;
                }

                private void initFields() {
                    this.type_ = Collections.emptyList();
                    this.firstNullable_ = -1;
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
                    while (i < getTypeCount()) {
                        if (getType(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    for (int i = 0; i < this.type_.size(); i++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.type_.get(i));
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(2, this.firstNullable_);
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    for (i = 0; i < this.type_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.type_.get(i));
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        i2 += CodedOutputStream.computeInt32Size(2, this.firstNullable_);
                    }
                    i2 += this.unknownFields.size();
                    this.memoizedSerializedSize = i2;
                    return i2;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(TypeTable typeTable) {
                    return newBuilder().mergeFrom(typeTable);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
                public static Parser<VersionRequirement> PARSER = new C185101();
                private static final VersionRequirement defaultInstance = new VersionRequirement(true);
                private int bitField0_;
                private int errorCode_;
                private Level level_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int message_;
                private final ByteString unknownFields;
                private int versionFull_;
                private VersionKind versionKind_;
                private int version_;

                public enum Level implements EnumLite {
                    WARNING(0, 0),
                    ERROR(1, 1),
                    HIDDEN(2, 2);
                    
                    private static EnumLiteMap<Level> internalValueMap;
                    private final int value;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$1 */
                    static class C176011 implements EnumLiteMap<Level> {
                        C176011() {
                        }

                        public Level findValueByNumber(int i) {
                            return Level.valueOf(i);
                        }
                    }

                    static {
                        internalValueMap = new C176011();
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static Level valueOf(int i) {
                        switch (i) {
                            case 0:
                                return WARNING;
                            case 1:
                                return ERROR;
                            case 2:
                                return HIDDEN;
                            default:
                                return 0;
                        }
                    }

                    private Level(int i, int i2) {
                        this.value = i2;
                    }
                }

                public enum VersionKind implements EnumLite {
                    LANGUAGE_VERSION(0, 0),
                    COMPILER_VERSION(1, 1),
                    API_VERSION(2, 2);
                    
                    private static EnumLiteMap<VersionKind> internalValueMap;
                    private final int value;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$1 */
                    static class C176021 implements EnumLiteMap<VersionKind> {
                        C176021() {
                        }

                        public VersionKind findValueByNumber(int i) {
                            return VersionKind.valueOf(i);
                        }
                    }

                    static {
                        internalValueMap = new C176021();
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static VersionKind valueOf(int i) {
                        switch (i) {
                            case 0:
                                return LANGUAGE_VERSION;
                            case 1:
                                return COMPILER_VERSION;
                            case 2:
                                return API_VERSION;
                            default:
                                return 0;
                        }
                    }

                    private VersionKind(int i, int i2) {
                        this.value = i2;
                    }
                }

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1 */
                static class C185101 extends AbstractParser<VersionRequirement> {
                    C185101() {
                    }

                    public VersionRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new VersionRequirement(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {
                    private int bitField0_;
                    private int errorCode_;
                    private Level level_ = Level.ERROR;
                    private int message_;
                    private int versionFull_;
                    private VersionKind versionKind_ = VersionKind.LANGUAGE_VERSION;
                    private int version_;

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

                    public VersionRequirement getDefaultInstanceForType() {
                        return VersionRequirement.getDefaultInstance();
                    }

                    public VersionRequirement build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public VersionRequirement buildPartial() {
                        VersionRequirement versionRequirement = new VersionRequirement((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        versionRequirement.version_ = this.version_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        versionRequirement.versionFull_ = this.versionFull_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        versionRequirement.level_ = this.level_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        versionRequirement.errorCode_ = this.errorCode_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        versionRequirement.message_ = this.message_;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        versionRequirement.versionKind_ = this.versionKind_;
                        versionRequirement.bitField0_ = i2;
                        return versionRequirement;
                    }

                    public Builder mergeFrom(VersionRequirement versionRequirement) {
                        if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                            return this;
                        }
                        if (versionRequirement.hasVersion()) {
                            setVersion(versionRequirement.getVersion());
                        }
                        if (versionRequirement.hasVersionFull()) {
                            setVersionFull(versionRequirement.getVersionFull());
                        }
                        if (versionRequirement.hasLevel()) {
                            setLevel(versionRequirement.getLevel());
                        }
                        if (versionRequirement.hasErrorCode()) {
                            setErrorCode(versionRequirement.getErrorCode());
                        }
                        if (versionRequirement.hasMessage()) {
                            setMessage(versionRequirement.getMessage());
                        }
                        if (versionRequirement.hasVersionKind()) {
                            setVersionKind(versionRequirement.getVersionKind());
                        }
                        setUnknownFields(getUnknownFields().concat(versionRequirement.unknownFields));
                        return this;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        VersionRequirement versionRequirement;
                        VersionRequirement versionRequirement2 = null;
                        try {
                            VersionRequirement versionRequirement3 = (VersionRequirement) VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (versionRequirement3 != null) {
                                mergeFrom(versionRequirement3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            versionRequirement = (VersionRequirement) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            versionRequirement2 = versionRequirement;
                        }
                        if (versionRequirement2 != null) {
                            mergeFrom(versionRequirement2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setVersion(int i) {
                        this.bitField0_ |= 1;
                        this.version_ = i;
                        return this;
                    }

                    public Builder setVersionFull(int i) {
                        this.bitField0_ |= 2;
                        this.versionFull_ = i;
                        return this;
                    }

                    public Builder setLevel(Level level) {
                        if (level == null) {
                            throw new NullPointerException();
                        }
                        this.bitField0_ |= 4;
                        this.level_ = level;
                        return this;
                    }

                    public Builder setErrorCode(int i) {
                        this.bitField0_ |= 8;
                        this.errorCode_ = i;
                        return this;
                    }

                    public Builder setMessage(int i) {
                        this.bitField0_ |= 16;
                        this.message_ = i;
                        return this;
                    }

                    public Builder setVersionKind(VersionKind versionKind) {
                        if (versionKind == null) {
                            throw new NullPointerException();
                        }
                        this.bitField0_ |= 32;
                        this.versionKind_ = versionKind;
                        return this;
                    }
                }

                private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private VersionRequirement(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static VersionRequirement getDefaultInstance() {
                    return defaultInstance;
                }

                public VersionRequirement getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r9, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r10) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r8 = this;
                    r8.<init>();
                    r0 = -1;
                    r8.memoizedIsInitialized = r0;
                    r8.memoizedSerializedSize = r0;
                    r8.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                L_0x0015:
                    if (r3 != 0) goto L_0x00d1;
                L_0x0017:
                    r4 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 == 0) goto L_0x00a1;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x001d:
                    r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 == r5) goto L_0x0094;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0021:
                    r6 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 == r6) goto L_0x0087;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0025:
                    r7 = 24;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 == r7) goto L_0x006d;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0029:
                    r7 = 32;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 == r7) goto L_0x0061;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x002d:
                    r5 = 40;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 == r5) goto L_0x0055;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0031:
                    r5 = 48;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 == r5) goto L_0x003c;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0035:
                    r4 = r8.parseUnknownField(r9, r2, r10, r4);	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x003b:
                    goto L_0x00a1;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x003c:
                    r5 = r9.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.valueOf(r5);	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r6 != 0) goto L_0x004d;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0046:
                    r2.writeRawVarint32(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r2.writeRawVarint32(r5);	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x004d:
                    r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r4 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.versionKind_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0055:
                    r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r4 | r6;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.message_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0061:
                    r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r4 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.errorCode_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x006d:
                    r5 = r9.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.valueOf(r5);	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    if (r6 != 0) goto L_0x007e;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0077:
                    r2.writeRawVarint32(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r2.writeRawVarint32(r5);	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x007e:
                    r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.level_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0087:
                    r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.versionFull_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                L_0x0094:
                    r4 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r4 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    r8.version_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00b5, IOException -> 0x00a6 }
                    goto L_0x0015;
                L_0x00a1:
                    r3 = 1;
                    goto L_0x0015;
                L_0x00a4:
                    r9 = move-exception;
                    goto L_0x00bb;
                L_0x00a6:
                    r9 = move-exception;
                    r10 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00a4 }
                    r9 = r9.getMessage();	 Catch:{ all -> 0x00a4 }
                    r10.<init>(r9);	 Catch:{ all -> 0x00a4 }
                    r9 = r10.setUnfinishedMessage(r8);	 Catch:{ all -> 0x00a4 }
                    throw r9;	 Catch:{ all -> 0x00a4 }
                L_0x00b5:
                    r9 = move-exception;	 Catch:{ all -> 0x00a4 }
                    r9 = r9.setUnfinishedMessage(r8);	 Catch:{ all -> 0x00a4 }
                    throw r9;	 Catch:{ all -> 0x00a4 }
                L_0x00bb:
                    r2.flush();	 Catch:{ IOException -> 0x00be, all -> 0x00c5 }
                L_0x00be:
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    goto L_0x00cd;
                L_0x00c5:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x00cd:
                    r8.makeExtensionsImmutable();
                    throw r9;
                L_0x00d1:
                    r2.flush();	 Catch:{ IOException -> 0x00d4, all -> 0x00db }
                L_0x00d4:
                    r9 = r0.toByteString();
                    r8.unknownFields = r9;
                    goto L_0x00e3;
                L_0x00db:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x00e3:
                    r8.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<VersionRequirement> getParserForType() {
                    return PARSER;
                }

                public boolean hasVersion() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getVersion() {
                    return this.version_;
                }

                public boolean hasVersionFull() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getVersionFull() {
                    return this.versionFull_;
                }

                public boolean hasLevel() {
                    return (this.bitField0_ & 4) == 4;
                }

                public Level getLevel() {
                    return this.level_;
                }

                public boolean hasErrorCode() {
                    return (this.bitField0_ & 8) == 8;
                }

                public int getErrorCode() {
                    return this.errorCode_;
                }

                public boolean hasMessage() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int getMessage() {
                    return this.message_;
                }

                public boolean hasVersionKind() {
                    return (this.bitField0_ & 32) == 32;
                }

                public VersionKind getVersionKind() {
                    return this.versionKind_;
                }

                private void initFields() {
                    this.version_ = 0;
                    this.versionFull_ = 0;
                    this.level_ = Level.ERROR;
                    this.errorCode_ = 0;
                    this.message_ = 0;
                    this.versionKind_ = VersionKind.LANGUAGE_VERSION;
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
                        codedOutputStream.writeInt32(1, this.version_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(2, this.versionFull_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeEnum(3, this.level_.getNumber());
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeInt32(4, this.errorCode_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.message_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeEnum(6, this.versionKind_.getNumber());
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
                        i = 0 + CodedOutputStream.computeInt32Size(1, this.version_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(2, this.versionFull_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeEnumSize(3, this.level_.getNumber());
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeInt32Size(4, this.errorCode_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i += CodedOutputStream.computeInt32Size(5, this.message_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i += CodedOutputStream.computeEnumSize(6, this.versionKind_.getNumber());
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

                public static Builder newBuilder(VersionRequirement versionRequirement) {
                    return newBuilder().mergeFrom(versionRequirement);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
                public static Parser<VersionRequirementTable> PARSER = new C185111();
                private static final VersionRequirementTable defaultInstance = new VersionRequirementTable(true);
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private List<VersionRequirement> requirement_;
                private final ByteString unknownFields;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1 */
                static class C185111 extends AbstractParser<VersionRequirementTable> {
                    C185111() {
                    }

                    public VersionRequirementTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {
                    private int bitField0_;
                    private List<VersionRequirement> requirement_ = Collections.emptyList();

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

                    public VersionRequirementTable getDefaultInstanceForType() {
                        return VersionRequirementTable.getDefaultInstance();
                    }

                    public VersionRequirementTable build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public VersionRequirementTable buildPartial() {
                        VersionRequirementTable versionRequirementTable = new VersionRequirementTable((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                        int i = this.bitField0_;
                        if ((this.bitField0_ & 1) == 1) {
                            this.requirement_ = Collections.unmodifiableList(this.requirement_);
                            this.bitField0_ &= -2;
                        }
                        versionRequirementTable.requirement_ = this.requirement_;
                        return versionRequirementTable;
                    }

                    public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                        if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                            return this;
                        }
                        if (!versionRequirementTable.requirement_.isEmpty()) {
                            if (this.requirement_.isEmpty()) {
                                this.requirement_ = versionRequirementTable.requirement_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureRequirementIsMutable();
                                this.requirement_.addAll(versionRequirementTable.requirement_);
                            }
                        }
                        setUnknownFields(getUnknownFields().concat(versionRequirementTable.unknownFields));
                        return this;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        VersionRequirementTable versionRequirementTable;
                        VersionRequirementTable versionRequirementTable2 = null;
                        try {
                            VersionRequirementTable versionRequirementTable3 = (VersionRequirementTable) VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (versionRequirementTable3 != null) {
                                mergeFrom(versionRequirementTable3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            versionRequirementTable = (VersionRequirementTable) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            versionRequirementTable2 = versionRequirementTable;
                        }
                        if (versionRequirementTable2 != null) {
                            mergeFrom(versionRequirementTable2);
                        }
                        throw codedInputStream2;
                    }

                    private void ensureRequirementIsMutable() {
                        if ((this.bitField0_ & 1) != 1) {
                            this.requirement_ = new ArrayList(this.requirement_);
                            this.bitField0_ |= 1;
                        }
                    }
                }

                private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                private VersionRequirementTable(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static VersionRequirementTable getDefaultInstance() {
                    return defaultInstance;
                }

                public VersionRequirementTable getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private VersionRequirementTable(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                    r4 = 0;
                L_0x0016:
                    if (r3 != 0) goto L_0x007d;
                L_0x0018:
                    r5 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == 0) goto L_0x0042;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x001e:
                    r6 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == r6) goto L_0x0029;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0022:
                    r5 = r7.parseUnknownField(r8, r2, r9, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0028:
                    goto L_0x0042;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0029:
                    r5 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    if (r5 == r1) goto L_0x0036;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x002d:
                    r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r7.requirement_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                L_0x0036:
                    r5 = r7.requirement_;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r6 = r8.readMessage(r6, r9);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    r5.add(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0055, IOException -> 0x0046 }
                    goto L_0x0016;
                L_0x0042:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0044:
                    r8 = move-exception;
                    goto L_0x005b;
                L_0x0046:
                    r8 = move-exception;
                    r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0044 }
                    r8 = r8.getMessage();	 Catch:{ all -> 0x0044 }
                    r9.<init>(r8);	 Catch:{ all -> 0x0044 }
                    r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0044 }
                    throw r8;	 Catch:{ all -> 0x0044 }
                L_0x0055:
                    r8 = move-exception;	 Catch:{ all -> 0x0044 }
                    r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0044 }
                    throw r8;	 Catch:{ all -> 0x0044 }
                L_0x005b:
                    r9 = r4 & 1;
                    if (r9 != r1) goto L_0x0067;
                L_0x005f:
                    r9 = r7.requirement_;
                    r9 = java.util.Collections.unmodifiableList(r9);
                    r7.requirement_ = r9;
                L_0x0067:
                    r2.flush();	 Catch:{ IOException -> 0x006a, all -> 0x0071 }
                L_0x006a:
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    goto L_0x0079;
                L_0x0071:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x0079:
                    r7.makeExtensionsImmutable();
                    throw r8;
                L_0x007d:
                    r8 = r4 & 1;
                    if (r8 != r1) goto L_0x0089;
                L_0x0081:
                    r8 = r7.requirement_;
                    r8 = java.util.Collections.unmodifiableList(r8);
                    r7.requirement_ = r8;
                L_0x0089:
                    r2.flush();	 Catch:{ IOException -> 0x008c, all -> 0x0093 }
                L_0x008c:
                    r8 = r0.toByteString();
                    r7.unknownFields = r8;
                    goto L_0x009b;
                L_0x0093:
                    r8 = move-exception;
                    r9 = r0.toByteString();
                    r7.unknownFields = r9;
                    throw r8;
                L_0x009b:
                    r7.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<VersionRequirementTable> getParserForType() {
                    return PARSER;
                }

                public List<VersionRequirement> getRequirementList() {
                    return this.requirement_;
                }

                public int getRequirementCount() {
                    return this.requirement_.size();
                }

                private void initFields() {
                    this.requirement_ = Collections.emptyList();
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
                    for (int i = 0; i < this.requirement_.size(); i++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.requirement_.get(i));
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    for (i = 0; i < this.requirement_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.requirement_.get(i));
                    }
                    i2 += this.unknownFields.size();
                    this.memoizedSerializedSize = i2;
                    return i2;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
                    return newBuilder().mergeFrom(versionRequirementTable);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Class extends ExtendableMessage<Class> implements ClassOrBuilder {
                public static Parser<Class> PARSER = new C184911();
                private static final Class defaultInstance = new Class(true);
                private int bitField0_;
                private int companionObjectName_;
                private List<Constructor> constructor_;
                private List<EnumEntry> enumEntry_;
                private int flags_;
                private int fqName_;
                private List<Function> function_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int nestedClassNameMemoizedSerializedSize;
                private List<Integer> nestedClassName_;
                private List<Property> property_;
                private int sealedSubclassFqNameMemoizedSerializedSize;
                private List<Integer> sealedSubclassFqName_;
                private int supertypeIdMemoizedSerializedSize;
                private List<Integer> supertypeId_;
                private List<Type> supertype_;
                private List<TypeAlias> typeAlias_;
                private List<TypeParameter> typeParameter_;
                private TypeTable typeTable_;
                private final ByteString unknownFields;
                private VersionRequirementTable versionRequirementTable_;
                private int versionRequirement_;

                public enum Kind implements EnumLite {
                    CLASS(0, 0),
                    INTERFACE(1, 1),
                    ENUM_CLASS(2, 2),
                    ENUM_ENTRY(3, 3),
                    ANNOTATION_CLASS(4, 4),
                    OBJECT(5, 5),
                    COMPANION_OBJECT(6, 6);
                    
                    private static EnumLiteMap<Kind> internalValueMap;
                    private final int value;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$1 */
                    static class C175921 implements EnumLiteMap<Kind> {
                        C175921() {
                        }

                        public Kind findValueByNumber(int i) {
                            return Kind.valueOf(i);
                        }
                    }

                    static {
                        internalValueMap = new C175921();
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static Kind valueOf(int i) {
                        switch (i) {
                            case 0:
                                return CLASS;
                            case 1:
                                return INTERFACE;
                            case 2:
                                return ENUM_CLASS;
                            case 3:
                                return ENUM_ENTRY;
                            case 4:
                                return ANNOTATION_CLASS;
                            case 5:
                                return OBJECT;
                            case 6:
                                return COMPANION_OBJECT;
                            default:
                                return 0;
                        }
                    }

                    private Kind(int i, int i2) {
                        this.value = i2;
                    }
                }

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$1 */
                static class C184911 extends AbstractParser<Class> {
                    C184911() {
                    }

                    public Class parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Class(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
                    private int bitField0_;
                    private int companionObjectName_;
                    private List<Constructor> constructor_ = Collections.emptyList();
                    private List<EnumEntry> enumEntry_ = Collections.emptyList();
                    private int flags_ = 6;
                    private int fqName_;
                    private List<Function> function_ = Collections.emptyList();
                    private List<Integer> nestedClassName_ = Collections.emptyList();
                    private List<Property> property_ = Collections.emptyList();
                    private List<Integer> sealedSubclassFqName_ = Collections.emptyList();
                    private List<Integer> supertypeId_ = Collections.emptyList();
                    private List<Type> supertype_ = Collections.emptyList();
                    private List<TypeAlias> typeAlias_ = Collections.emptyList();
                    private List<TypeParameter> typeParameter_ = Collections.emptyList();
                    private TypeTable typeTable_ = TypeTable.getDefaultInstance();
                    private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
                    private int versionRequirement_;

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

                    public Class getDefaultInstanceForType() {
                        return Class.getDefaultInstance();
                    }

                    public Class build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Class buildPartial() {
                        Class classR = new Class((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        classR.flags_ = this.flags_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        classR.fqName_ = this.fqName_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        classR.companionObjectName_ = this.companionObjectName_;
                        if ((this.bitField0_ & 8) == 8) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                            this.bitField0_ &= -9;
                        }
                        classR.typeParameter_ = this.typeParameter_;
                        if ((this.bitField0_ & 16) == 16) {
                            this.supertype_ = Collections.unmodifiableList(this.supertype_);
                            this.bitField0_ &= -17;
                        }
                        classR.supertype_ = this.supertype_;
                        if ((this.bitField0_ & 32) == 32) {
                            this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                            this.bitField0_ &= -33;
                        }
                        classR.supertypeId_ = this.supertypeId_;
                        if ((this.bitField0_ & 64) == 64) {
                            this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                            this.bitField0_ &= -65;
                        }
                        classR.nestedClassName_ = this.nestedClassName_;
                        if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            this.constructor_ = Collections.unmodifiableList(this.constructor_);
                            this.bitField0_ &= -129;
                        }
                        classR.constructor_ = this.constructor_;
                        if ((this.bitField0_ & 256) == 256) {
                            this.function_ = Collections.unmodifiableList(this.function_);
                            this.bitField0_ &= -257;
                        }
                        classR.function_ = this.function_;
                        if ((this.bitField0_ & 512) == 512) {
                            this.property_ = Collections.unmodifiableList(this.property_);
                            this.bitField0_ &= -513;
                        }
                        classR.property_ = this.property_;
                        if ((this.bitField0_ & 1024) == 1024) {
                            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                            this.bitField0_ &= -1025;
                        }
                        classR.typeAlias_ = this.typeAlias_;
                        if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                            this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                            this.bitField0_ &= -2049;
                        }
                        classR.enumEntry_ = this.enumEntry_;
                        if ((this.bitField0_ & 4096) == 4096) {
                            this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                            this.bitField0_ &= -4097;
                        }
                        classR.sealedSubclassFqName_ = this.sealedSubclassFqName_;
                        if ((i & 8192) == 8192) {
                            i2 |= 8;
                        }
                        classR.typeTable_ = this.typeTable_;
                        if ((i & 16384) == 16384) {
                            i2 |= 16;
                        }
                        classR.versionRequirement_ = this.versionRequirement_;
                        if ((i & 32768) == 32768) {
                            i2 |= 32;
                        }
                        classR.versionRequirementTable_ = this.versionRequirementTable_;
                        classR.bitField0_ = i2;
                        return classR;
                    }

                    public Builder mergeFrom(Class classR) {
                        if (classR == Class.getDefaultInstance()) {
                            return this;
                        }
                        if (classR.hasFlags()) {
                            setFlags(classR.getFlags());
                        }
                        if (classR.hasFqName()) {
                            setFqName(classR.getFqName());
                        }
                        if (classR.hasCompanionObjectName()) {
                            setCompanionObjectName(classR.getCompanionObjectName());
                        }
                        if (!classR.typeParameter_.isEmpty()) {
                            if (this.typeParameter_.isEmpty()) {
                                this.typeParameter_ = classR.typeParameter_;
                                this.bitField0_ &= -9;
                            } else {
                                ensureTypeParameterIsMutable();
                                this.typeParameter_.addAll(classR.typeParameter_);
                            }
                        }
                        if (!classR.supertype_.isEmpty()) {
                            if (this.supertype_.isEmpty()) {
                                this.supertype_ = classR.supertype_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureSupertypeIsMutable();
                                this.supertype_.addAll(classR.supertype_);
                            }
                        }
                        if (!classR.supertypeId_.isEmpty()) {
                            if (this.supertypeId_.isEmpty()) {
                                this.supertypeId_ = classR.supertypeId_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureSupertypeIdIsMutable();
                                this.supertypeId_.addAll(classR.supertypeId_);
                            }
                        }
                        if (!classR.nestedClassName_.isEmpty()) {
                            if (this.nestedClassName_.isEmpty()) {
                                this.nestedClassName_ = classR.nestedClassName_;
                                this.bitField0_ &= -65;
                            } else {
                                ensureNestedClassNameIsMutable();
                                this.nestedClassName_.addAll(classR.nestedClassName_);
                            }
                        }
                        if (!classR.constructor_.isEmpty()) {
                            if (this.constructor_.isEmpty()) {
                                this.constructor_ = classR.constructor_;
                                this.bitField0_ &= -129;
                            } else {
                                ensureConstructorIsMutable();
                                this.constructor_.addAll(classR.constructor_);
                            }
                        }
                        if (!classR.function_.isEmpty()) {
                            if (this.function_.isEmpty()) {
                                this.function_ = classR.function_;
                                this.bitField0_ &= -257;
                            } else {
                                ensureFunctionIsMutable();
                                this.function_.addAll(classR.function_);
                            }
                        }
                        if (!classR.property_.isEmpty()) {
                            if (this.property_.isEmpty()) {
                                this.property_ = classR.property_;
                                this.bitField0_ &= -513;
                            } else {
                                ensurePropertyIsMutable();
                                this.property_.addAll(classR.property_);
                            }
                        }
                        if (!classR.typeAlias_.isEmpty()) {
                            if (this.typeAlias_.isEmpty()) {
                                this.typeAlias_ = classR.typeAlias_;
                                this.bitField0_ &= -1025;
                            } else {
                                ensureTypeAliasIsMutable();
                                this.typeAlias_.addAll(classR.typeAlias_);
                            }
                        }
                        if (!classR.enumEntry_.isEmpty()) {
                            if (this.enumEntry_.isEmpty()) {
                                this.enumEntry_ = classR.enumEntry_;
                                this.bitField0_ &= -2049;
                            } else {
                                ensureEnumEntryIsMutable();
                                this.enumEntry_.addAll(classR.enumEntry_);
                            }
                        }
                        if (!classR.sealedSubclassFqName_.isEmpty()) {
                            if (this.sealedSubclassFqName_.isEmpty()) {
                                this.sealedSubclassFqName_ = classR.sealedSubclassFqName_;
                                this.bitField0_ &= -4097;
                            } else {
                                ensureSealedSubclassFqNameIsMutable();
                                this.sealedSubclassFqName_.addAll(classR.sealedSubclassFqName_);
                            }
                        }
                        if (classR.hasTypeTable()) {
                            mergeTypeTable(classR.getTypeTable());
                        }
                        if (classR.hasVersionRequirement()) {
                            setVersionRequirement(classR.getVersionRequirement());
                        }
                        if (classR.hasVersionRequirementTable()) {
                            mergeVersionRequirementTable(classR.getVersionRequirementTable());
                        }
                        mergeExtensionFields(classR);
                        setUnknownFields(getUnknownFields().concat(classR.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (!hasFqName()) {
                            return false;
                        }
                        int i;
                        for (i = 0; i < getTypeParameterCount(); i++) {
                            if (!getTypeParameter(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getSupertypeCount(); i++) {
                            if (!getSupertype(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getConstructorCount(); i++) {
                            if (!getConstructor(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getFunctionCount(); i++) {
                            if (!getFunction(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getPropertyCount(); i++) {
                            if (!getProperty(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getTypeAliasCount(); i++) {
                            if (!getTypeAlias(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getEnumEntryCount(); i++) {
                            if (!getEnumEntry(i).isInitialized()) {
                                return false;
                            }
                        }
                        if ((!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Class classR;
                        Class classR2 = null;
                        try {
                            Class classR3 = (Class) Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (classR3 != null) {
                                mergeFrom(classR3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            classR = (Class) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            classR2 = classR;
                        }
                        if (classR2 != null) {
                            mergeFrom(classR2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1;
                        this.flags_ = i;
                        return this;
                    }

                    public boolean hasFqName() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public Builder setFqName(int i) {
                        this.bitField0_ |= 2;
                        this.fqName_ = i;
                        return this;
                    }

                    public Builder setCompanionObjectName(int i) {
                        this.bitField0_ |= 4;
                        this.companionObjectName_ = i;
                        return this;
                    }

                    private void ensureTypeParameterIsMutable() {
                        if ((this.bitField0_ & 8) != 8) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 8;
                        }
                    }

                    public int getTypeParameterCount() {
                        return this.typeParameter_.size();
                    }

                    public TypeParameter getTypeParameter(int i) {
                        return (TypeParameter) this.typeParameter_.get(i);
                    }

                    private void ensureSupertypeIsMutable() {
                        if ((this.bitField0_ & 16) != 16) {
                            this.supertype_ = new ArrayList(this.supertype_);
                            this.bitField0_ |= 16;
                        }
                    }

                    public int getSupertypeCount() {
                        return this.supertype_.size();
                    }

                    public Type getSupertype(int i) {
                        return (Type) this.supertype_.get(i);
                    }

                    private void ensureSupertypeIdIsMutable() {
                        if ((this.bitField0_ & 32) != 32) {
                            this.supertypeId_ = new ArrayList(this.supertypeId_);
                            this.bitField0_ |= 32;
                        }
                    }

                    private void ensureNestedClassNameIsMutable() {
                        if ((this.bitField0_ & 64) != 64) {
                            this.nestedClassName_ = new ArrayList(this.nestedClassName_);
                            this.bitField0_ |= 64;
                        }
                    }

                    private void ensureConstructorIsMutable() {
                        if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            this.constructor_ = new ArrayList(this.constructor_);
                            this.bitField0_ |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        }
                    }

                    public int getConstructorCount() {
                        return this.constructor_.size();
                    }

                    public Constructor getConstructor(int i) {
                        return (Constructor) this.constructor_.get(i);
                    }

                    private void ensureFunctionIsMutable() {
                        if ((this.bitField0_ & 256) != 256) {
                            this.function_ = new ArrayList(this.function_);
                            this.bitField0_ |= 256;
                        }
                    }

                    public int getFunctionCount() {
                        return this.function_.size();
                    }

                    public Function getFunction(int i) {
                        return (Function) this.function_.get(i);
                    }

                    private void ensurePropertyIsMutable() {
                        if ((this.bitField0_ & 512) != 512) {
                            this.property_ = new ArrayList(this.property_);
                            this.bitField0_ |= 512;
                        }
                    }

                    public int getPropertyCount() {
                        return this.property_.size();
                    }

                    public Property getProperty(int i) {
                        return (Property) this.property_.get(i);
                    }

                    private void ensureTypeAliasIsMutable() {
                        if ((this.bitField0_ & 1024) != 1024) {
                            this.typeAlias_ = new ArrayList(this.typeAlias_);
                            this.bitField0_ |= 1024;
                        }
                    }

                    public int getTypeAliasCount() {
                        return this.typeAlias_.size();
                    }

                    public TypeAlias getTypeAlias(int i) {
                        return (TypeAlias) this.typeAlias_.get(i);
                    }

                    private void ensureEnumEntryIsMutable() {
                        if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) != ItemAnimator.FLAG_MOVED) {
                            this.enumEntry_ = new ArrayList(this.enumEntry_);
                            this.bitField0_ |= ItemAnimator.FLAG_MOVED;
                        }
                    }

                    public int getEnumEntryCount() {
                        return this.enumEntry_.size();
                    }

                    public EnumEntry getEnumEntry(int i) {
                        return (EnumEntry) this.enumEntry_.get(i);
                    }

                    private void ensureSealedSubclassFqNameIsMutable() {
                        if ((this.bitField0_ & 4096) != 4096) {
                            this.sealedSubclassFqName_ = new ArrayList(this.sealedSubclassFqName_);
                            this.bitField0_ |= 4096;
                        }
                    }

                    public boolean hasTypeTable() {
                        return (this.bitField0_ & 8192) == 8192;
                    }

                    public TypeTable getTypeTable() {
                        return this.typeTable_;
                    }

                    public Builder mergeTypeTable(TypeTable typeTable) {
                        if ((this.bitField0_ & 8192) != 8192 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                            this.typeTable_ = typeTable;
                        } else {
                            this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                        }
                        this.bitField0_ |= 8192;
                        return this;
                    }

                    public Builder setVersionRequirement(int i) {
                        this.bitField0_ |= 16384;
                        this.versionRequirement_ = i;
                        return this;
                    }

                    public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                        if ((this.bitField0_ & 32768) != 32768 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                            this.versionRequirementTable_ = versionRequirementTable;
                        } else {
                            this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                        }
                        this.bitField0_ |= 32768;
                        return this;
                    }
                }

                private Class(ExtendableBuilder<Class, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.supertypeIdMemoizedSerializedSize = -1;
                    this.nestedClassNameMemoizedSerializedSize = -1;
                    this.sealedSubclassFqNameMemoizedSerializedSize = -1;
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private Class(boolean z) {
                    this.supertypeIdMemoizedSerializedSize = -1;
                    this.nestedClassNameMemoizedSerializedSize = -1;
                    this.sealedSubclassFqNameMemoizedSerializedSize = -1;
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Class getDefaultInstance() {
                    return defaultInstance;
                }

                public Class getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r19, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r20) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r18 = this;
                    r1 = r18;
                    r2 = r19;
                    r3 = r20;
                    r18.<init>();
                    r4 = -1;
                    r1.supertypeIdMemoizedSerializedSize = r4;
                    r1.nestedClassNameMemoizedSerializedSize = r4;
                    r1.sealedSubclassFqNameMemoizedSerializedSize = r4;
                    r1.memoizedIsInitialized = r4;
                    r1.memoizedSerializedSize = r4;
                    r18.initFields();
                    r4 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r5 = 1;
                    r6 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r4, r5);
                    r7 = 0;
                    r8 = 0;
                L_0x0022:
                    r12 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
                    r13 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
                    r14 = 16;
                    r5 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
                    r15 = 8;
                    r9 = 32;
                    if (r7 != 0) goto L_0x0339;
                L_0x0030:
                    r10 = r19.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r16 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    switch(r10) {
                        case 0: goto L_0x027e;
                        case 8: goto L_0x0271;
                        case 16: goto L_0x0253;
                        case 18: goto L_0x021e;
                        case 24: goto L_0x0211;
                        case 32: goto L_0x0204;
                        case 42: goto L_0x01eb;
                        case 50: goto L_0x01d1;
                        case 56: goto L_0x01b3;
                        case 58: goto L_0x017d;
                        case 66: goto L_0x0161;
                        case 74: goto L_0x0145;
                        case 82: goto L_0x0129;
                        case 90: goto L_0x010f;
                        case 106: goto L_0x00f5;
                        case 128: goto L_0x00d9;
                        case 130: goto L_0x00a3;
                        case 242: goto L_0x0078;
                        case 248: goto L_0x006b;
                        case 258: goto L_0x0040;
                        default: goto L_0x0039;
                    };	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0039:
                    r11 = 1;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r1.parseUnknownField(r2, r6, r3, r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x0281;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0040:
                    r10 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r10 & r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 != r9) goto L_0x004b;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0045:
                    r10 = r1.versionRequirementTable_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r16 = r10.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x004b:
                    r10 = r16;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = r2.readMessage(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r11;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.versionRequirementTable_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 == 0) goto L_0x0064;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0059:
                    r11 = r1.versionRequirementTable_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10.mergeFrom(r11);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r10.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.versionRequirementTable_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0064:
                    r10 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r10 | r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.bitField0_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x006b:
                    r10 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r10 | r14;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.bitField0_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.versionRequirement_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0078:
                    r10 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r10 & r15;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 != r15) goto L_0x0083;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x007d:
                    r10 = r1.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r16 = r10.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0083:
                    r10 = r16;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = r2.readMessage(r11, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r11;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.typeTable_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 == 0) goto L_0x009c;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0091:
                    r11 = r1.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10.mergeFrom(r11);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r10.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.typeTable_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x009c:
                    r10 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r10 | r15;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.bitField0_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00a3:
                    r10 = r19.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.pushLimit(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = r8 & 4096;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r11 == r5) goto L_0x00be;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00af:
                    r11 = r19.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r11 <= 0) goto L_0x00be;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00b5:
                    r11 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.sealedSubclassFqName_ = r11;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 4096;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00be:
                    r11 = r19.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r11 <= 0) goto L_0x00d4;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00c4:
                    r11 = r1.sealedSubclassFqName_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = java.lang.Integer.valueOf(r9);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11.add(r9);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = 32;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x00be;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00d4:
                    r2.popLimit(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00d9:
                    r9 = r8 & 4096;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r5) goto L_0x00e6;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00dd:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.sealedSubclassFqName_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 4096;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00e6:
                    r9 = r1.sealedSubclassFqName_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = java.lang.Integer.valueOf(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00f5:
                    r9 = r8 & 2048;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r13) goto L_0x0102;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x00f9:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.enumEntry_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 2048;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0102:
                    r9 = r1.enumEntry_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.readMessage(r10, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x010f:
                    r9 = r8 & 1024;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r12) goto L_0x011c;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0113:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.typeAlias_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 1024;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x011c:
                    r9 = r1.typeAlias_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.readMessage(r10, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0129:
                    r9 = r8 & 512;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = 512; // 0x200 float:7.175E-43 double:2.53E-321;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r10) goto L_0x0138;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x012f:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.property_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 512;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0138:
                    r9 = r1.property_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.readMessage(r10, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0145:
                    r9 = r8 & 256;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r10) goto L_0x0154;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x014b:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.function_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 256;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0154:
                    r9 = r1.function_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.readMessage(r10, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0161:
                    r9 = r8 & 128;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r10) goto L_0x0170;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0167:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.constructor_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 128;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0170:
                    r9 = r1.constructor_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.readMessage(r10, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x017d:
                    r9 = r19.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r2.pushLimit(r9);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r8 & 64;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = 64;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 == r11) goto L_0x019a;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x018b:
                    r10 = r19.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 <= 0) goto L_0x019a;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0191:
                    r10 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.nestedClassName_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x019a:
                    r10 = r19.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 <= 0) goto L_0x01ae;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01a0:
                    r10 = r1.nestedClassName_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x019a;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01ae:
                    r2.popLimit(r9);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01b3:
                    r9 = r8 & 64;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = 64;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r10) goto L_0x01c2;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01b9:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.nestedClassName_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01c2:
                    r9 = r1.nestedClassName_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = java.lang.Integer.valueOf(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01d1:
                    r9 = r8 & 16;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r14) goto L_0x01de;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01d5:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.supertype_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01de:
                    r9 = r1.supertype_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.readMessage(r10, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01eb:
                    r9 = r8 & 8;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r15) goto L_0x01f8;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01ef:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.typeParameter_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 8;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x01f8:
                    r9 = r1.typeParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r2.readMessage(r10, r3);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0204:
                    r9 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r9 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.bitField0_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.companionObjectName_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0211:
                    r9 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r9 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.bitField0_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.fqName_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x021e:
                    r9 = r19.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r2.pushLimit(r9);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r8 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = 32;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 == r11) goto L_0x023b;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x022c:
                    r10 = r19.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 <= 0) goto L_0x023b;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0232:
                    r10 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.supertypeId_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x023b:
                    r10 = r19.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r10 <= 0) goto L_0x024f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0241:
                    r10 = r1.supertypeId_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = java.lang.Integer.valueOf(r11);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10.add(r11);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x023b;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x024f:
                    r2.popLimit(r9);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x026f;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0253:
                    r9 = r8 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = 32;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    if (r9 == r10) goto L_0x0262;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0259:
                    r9 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.supertypeId_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r8 = r8 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0262:
                    r9 = r1.supertypeId_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r10 = java.lang.Integer.valueOf(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9.add(r10);	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x026f:
                    r11 = 1;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x0284;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                L_0x0271:
                    r9 = r1.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r11 = 1;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r9 | r11;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.bitField0_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r9 = r19.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    r1.flags_ = r9;	 Catch:{ InvalidProtocolBufferException -> 0x029a, IOException -> 0x028a }
                    goto L_0x0284;
                L_0x027e:
                    r11 = 1;
                L_0x027f:
                    r7 = 1;
                    goto L_0x0284;
                L_0x0281:
                    if (r9 != 0) goto L_0x0284;
                L_0x0283:
                    goto L_0x027f;
                L_0x0284:
                    r5 = 1;
                    goto L_0x0022;
                L_0x0287:
                    r0 = move-exception;
                    r2 = r0;
                    goto L_0x02a1;
                L_0x028a:
                    r0 = move-exception;
                    r2 = r0;
                    r3 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0287 }
                    r2 = r2.getMessage();	 Catch:{ all -> 0x0287 }
                    r3.<init>(r2);	 Catch:{ all -> 0x0287 }
                    r2 = r3.setUnfinishedMessage(r1);	 Catch:{ all -> 0x0287 }
                    throw r2;	 Catch:{ all -> 0x0287 }
                L_0x029a:
                    r0 = move-exception;	 Catch:{ all -> 0x0287 }
                    r2 = r0;	 Catch:{ all -> 0x0287 }
                    r2 = r2.setUnfinishedMessage(r1);	 Catch:{ all -> 0x0287 }
                    throw r2;	 Catch:{ all -> 0x0287 }
                L_0x02a1:
                    r3 = r8 & 32;
                    r7 = 32;
                    if (r3 != r7) goto L_0x02af;
                L_0x02a7:
                    r3 = r1.supertypeId_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.supertypeId_ = r3;
                L_0x02af:
                    r3 = r8 & 8;
                    if (r3 != r15) goto L_0x02bb;
                L_0x02b3:
                    r3 = r1.typeParameter_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.typeParameter_ = r3;
                L_0x02bb:
                    r3 = r8 & 16;
                    if (r3 != r14) goto L_0x02c7;
                L_0x02bf:
                    r3 = r1.supertype_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.supertype_ = r3;
                L_0x02c7:
                    r3 = r8 & 64;
                    r7 = 64;
                    if (r3 != r7) goto L_0x02d5;
                L_0x02cd:
                    r3 = r1.nestedClassName_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.nestedClassName_ = r3;
                L_0x02d5:
                    r3 = r8 & 128;
                    r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                    if (r3 != r7) goto L_0x02e3;
                L_0x02db:
                    r3 = r1.constructor_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.constructor_ = r3;
                L_0x02e3:
                    r3 = r8 & 256;
                    r7 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
                    if (r3 != r7) goto L_0x02f1;
                L_0x02e9:
                    r3 = r1.function_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.function_ = r3;
                L_0x02f1:
                    r3 = r8 & 512;
                    r7 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
                    if (r3 != r7) goto L_0x02ff;
                L_0x02f7:
                    r3 = r1.property_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.property_ = r3;
                L_0x02ff:
                    r3 = r8 & 1024;
                    if (r3 != r12) goto L_0x030b;
                L_0x0303:
                    r3 = r1.typeAlias_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.typeAlias_ = r3;
                L_0x030b:
                    r3 = r8 & 2048;
                    if (r3 != r13) goto L_0x0317;
                L_0x030f:
                    r3 = r1.enumEntry_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.enumEntry_ = r3;
                L_0x0317:
                    r3 = r8 & 4096;
                    if (r3 != r5) goto L_0x0323;
                L_0x031b:
                    r3 = r1.sealedSubclassFqName_;
                    r3 = java.util.Collections.unmodifiableList(r3);
                    r1.sealedSubclassFqName_ = r3;
                L_0x0323:
                    r6.flush();	 Catch:{ IOException -> 0x0326, all -> 0x032d }
                L_0x0326:
                    r3 = r4.toByteString();
                    r1.unknownFields = r3;
                    goto L_0x0335;
                L_0x032d:
                    r0 = move-exception;
                    r2 = r4.toByteString();
                    r1.unknownFields = r2;
                    throw r0;
                L_0x0335:
                    r18.makeExtensionsImmutable();
                    throw r2;
                L_0x0339:
                    r2 = r8 & 32;
                    r3 = 32;
                    if (r2 != r3) goto L_0x0347;
                L_0x033f:
                    r2 = r1.supertypeId_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.supertypeId_ = r2;
                L_0x0347:
                    r2 = r8 & 8;
                    if (r2 != r15) goto L_0x0353;
                L_0x034b:
                    r2 = r1.typeParameter_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.typeParameter_ = r2;
                L_0x0353:
                    r2 = r8 & 16;
                    if (r2 != r14) goto L_0x035f;
                L_0x0357:
                    r2 = r1.supertype_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.supertype_ = r2;
                L_0x035f:
                    r2 = r8 & 64;
                    r3 = 64;
                    if (r2 != r3) goto L_0x036d;
                L_0x0365:
                    r2 = r1.nestedClassName_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.nestedClassName_ = r2;
                L_0x036d:
                    r2 = r8 & 128;
                    r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                    if (r2 != r3) goto L_0x037b;
                L_0x0373:
                    r2 = r1.constructor_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.constructor_ = r2;
                L_0x037b:
                    r2 = r8 & 256;
                    r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
                    if (r2 != r3) goto L_0x0389;
                L_0x0381:
                    r2 = r1.function_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.function_ = r2;
                L_0x0389:
                    r2 = r8 & 512;
                    r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
                    if (r2 != r3) goto L_0x0397;
                L_0x038f:
                    r2 = r1.property_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.property_ = r2;
                L_0x0397:
                    r2 = r8 & 1024;
                    if (r2 != r12) goto L_0x03a3;
                L_0x039b:
                    r2 = r1.typeAlias_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.typeAlias_ = r2;
                L_0x03a3:
                    r2 = r8 & 2048;
                    if (r2 != r13) goto L_0x03af;
                L_0x03a7:
                    r2 = r1.enumEntry_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.enumEntry_ = r2;
                L_0x03af:
                    r2 = r8 & 4096;
                    if (r2 != r5) goto L_0x03bb;
                L_0x03b3:
                    r2 = r1.sealedSubclassFqName_;
                    r2 = java.util.Collections.unmodifiableList(r2);
                    r1.sealedSubclassFqName_ = r2;
                L_0x03bb:
                    r6.flush();	 Catch:{ IOException -> 0x03be, all -> 0x03c5 }
                L_0x03be:
                    r2 = r4.toByteString();
                    r1.unknownFields = r2;
                    goto L_0x03cd;
                L_0x03c5:
                    r0 = move-exception;
                    r2 = r4.toByteString();
                    r1.unknownFields = r2;
                    throw r0;
                L_0x03cd:
                    r18.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Class> getParserForType() {
                    return PARSER;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public boolean hasFqName() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getFqName() {
                    return this.fqName_;
                }

                public boolean hasCompanionObjectName() {
                    return (this.bitField0_ & 4) == 4;
                }

                public int getCompanionObjectName() {
                    return this.companionObjectName_;
                }

                public List<TypeParameter> getTypeParameterList() {
                    return this.typeParameter_;
                }

                public int getTypeParameterCount() {
                    return this.typeParameter_.size();
                }

                public TypeParameter getTypeParameter(int i) {
                    return (TypeParameter) this.typeParameter_.get(i);
                }

                public List<Type> getSupertypeList() {
                    return this.supertype_;
                }

                public int getSupertypeCount() {
                    return this.supertype_.size();
                }

                public Type getSupertype(int i) {
                    return (Type) this.supertype_.get(i);
                }

                public List<Integer> getSupertypeIdList() {
                    return this.supertypeId_;
                }

                public List<Integer> getNestedClassNameList() {
                    return this.nestedClassName_;
                }

                public List<Constructor> getConstructorList() {
                    return this.constructor_;
                }

                public int getConstructorCount() {
                    return this.constructor_.size();
                }

                public Constructor getConstructor(int i) {
                    return (Constructor) this.constructor_.get(i);
                }

                public List<Function> getFunctionList() {
                    return this.function_;
                }

                public int getFunctionCount() {
                    return this.function_.size();
                }

                public Function getFunction(int i) {
                    return (Function) this.function_.get(i);
                }

                public List<Property> getPropertyList() {
                    return this.property_;
                }

                public int getPropertyCount() {
                    return this.property_.size();
                }

                public Property getProperty(int i) {
                    return (Property) this.property_.get(i);
                }

                public List<TypeAlias> getTypeAliasList() {
                    return this.typeAlias_;
                }

                public int getTypeAliasCount() {
                    return this.typeAlias_.size();
                }

                public TypeAlias getTypeAlias(int i) {
                    return (TypeAlias) this.typeAlias_.get(i);
                }

                public List<EnumEntry> getEnumEntryList() {
                    return this.enumEntry_;
                }

                public int getEnumEntryCount() {
                    return this.enumEntry_.size();
                }

                public EnumEntry getEnumEntry(int i) {
                    return (EnumEntry) this.enumEntry_.get(i);
                }

                public List<Integer> getSealedSubclassFqNameList() {
                    return this.sealedSubclassFqName_;
                }

                public boolean hasTypeTable() {
                    return (this.bitField0_ & 8) == 8;
                }

                public TypeTable getTypeTable() {
                    return this.typeTable_;
                }

                public boolean hasVersionRequirement() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int getVersionRequirement() {
                    return this.versionRequirement_;
                }

                public boolean hasVersionRequirementTable() {
                    return (this.bitField0_ & 32) == 32;
                }

                public VersionRequirementTable getVersionRequirementTable() {
                    return this.versionRequirementTable_;
                }

                private void initFields() {
                    this.flags_ = 6;
                    this.fqName_ = 0;
                    this.companionObjectName_ = 0;
                    this.typeParameter_ = Collections.emptyList();
                    this.supertype_ = Collections.emptyList();
                    this.supertypeId_ = Collections.emptyList();
                    this.nestedClassName_ = Collections.emptyList();
                    this.constructor_ = Collections.emptyList();
                    this.function_ = Collections.emptyList();
                    this.property_ = Collections.emptyList();
                    this.typeAlias_ = Collections.emptyList();
                    this.enumEntry_ = Collections.emptyList();
                    this.sealedSubclassFqName_ = Collections.emptyList();
                    this.typeTable_ = TypeTable.getDefaultInstance();
                    this.versionRequirement_ = 0;
                    this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (hasFqName()) {
                        int i = 0;
                        while (i < getTypeParameterCount()) {
                            if (getTypeParameter(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        i = 0;
                        while (i < getSupertypeCount()) {
                            if (getSupertype(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        i = 0;
                        while (i < getConstructorCount()) {
                            if (getConstructor(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        i = 0;
                        while (i < getFunctionCount()) {
                            if (getFunction(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        i = 0;
                        while (i < getPropertyCount()) {
                            if (getProperty(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        i = 0;
                        while (i < getTypeAliasCount()) {
                            if (getTypeAlias(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        i = 0;
                        while (i < getEnumEntryCount()) {
                            if (getEnumEntry(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        if (hasTypeTable() && !getTypeTable().isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        } else if (extensionsAreInitialized()) {
                            this.memoizedIsInitialized = (byte) 1;
                            return true;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i;
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(1, this.flags_);
                    }
                    if (getSupertypeIdList().size() > 0) {
                        codedOutputStream.writeRawVarint32(18);
                        codedOutputStream.writeRawVarint32(this.supertypeIdMemoizedSerializedSize);
                    }
                    int i2 = 0;
                    for (i = 0; i < this.supertypeId_.size(); i++) {
                        codedOutputStream.writeInt32NoTag(((Integer) this.supertypeId_.get(i)).intValue());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(3, this.fqName_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeInt32(4, this.companionObjectName_);
                    }
                    for (i = 0; i < this.typeParameter_.size(); i++) {
                        codedOutputStream.writeMessage(5, (MessageLite) this.typeParameter_.get(i));
                    }
                    for (i = 0; i < this.supertype_.size(); i++) {
                        codedOutputStream.writeMessage(6, (MessageLite) this.supertype_.get(i));
                    }
                    if (getNestedClassNameList().size() > 0) {
                        codedOutputStream.writeRawVarint32(58);
                        codedOutputStream.writeRawVarint32(this.nestedClassNameMemoizedSerializedSize);
                    }
                    for (i = 0; i < this.nestedClassName_.size(); i++) {
                        codedOutputStream.writeInt32NoTag(((Integer) this.nestedClassName_.get(i)).intValue());
                    }
                    for (i = 0; i < this.constructor_.size(); i++) {
                        codedOutputStream.writeMessage(8, (MessageLite) this.constructor_.get(i));
                    }
                    for (i = 0; i < this.function_.size(); i++) {
                        codedOutputStream.writeMessage(9, (MessageLite) this.function_.get(i));
                    }
                    for (i = 0; i < this.property_.size(); i++) {
                        codedOutputStream.writeMessage(10, (MessageLite) this.property_.get(i));
                    }
                    for (i = 0; i < this.typeAlias_.size(); i++) {
                        codedOutputStream.writeMessage(11, (MessageLite) this.typeAlias_.get(i));
                    }
                    for (i = 0; i < this.enumEntry_.size(); i++) {
                        codedOutputStream.writeMessage(13, (MessageLite) this.enumEntry_.get(i));
                    }
                    if (getSealedSubclassFqNameList().size() > 0) {
                        codedOutputStream.writeRawVarint32(130);
                        codedOutputStream.writeRawVarint32(this.sealedSubclassFqNameMemoizedSerializedSize);
                    }
                    while (i2 < this.sealedSubclassFqName_.size()) {
                        codedOutputStream.writeInt32NoTag(((Integer) this.sealedSubclassFqName_.get(i2)).intValue());
                        i2++;
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeMessage(30, this.typeTable_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(31, this.versionRequirement_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeMessage(32, this.versionRequirementTable_);
                    }
                    newExtensionWriter.writeUntil(19000, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2;
                    int i3 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
                    int i4 = 0;
                    for (i2 = 0; i2 < this.supertypeId_.size(); i2++) {
                        i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.supertypeId_.get(i2)).intValue());
                    }
                    i += i4;
                    if (!getSupertypeIdList().isEmpty()) {
                        i = (i + 1) + CodedOutputStream.computeInt32SizeNoTag(i4);
                    }
                    this.supertypeIdMemoizedSerializedSize = i4;
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(3, this.fqName_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeInt32Size(4, this.companionObjectName_);
                    }
                    i2 = i;
                    for (i = 0; i < this.typeParameter_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.typeParameter_.get(i));
                    }
                    for (i = 0; i < this.supertype_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(6, (MessageLite) this.supertype_.get(i));
                    }
                    i4 = 0;
                    for (i = 0; i < this.nestedClassName_.size(); i++) {
                        i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.nestedClassName_.get(i)).intValue());
                    }
                    i2 += i4;
                    if (!getNestedClassNameList().isEmpty()) {
                        i2 = (i2 + 1) + CodedOutputStream.computeInt32SizeNoTag(i4);
                    }
                    this.nestedClassNameMemoizedSerializedSize = i4;
                    for (i = 0; i < this.constructor_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(8, (MessageLite) this.constructor_.get(i));
                    }
                    for (i = 0; i < this.function_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(9, (MessageLite) this.function_.get(i));
                    }
                    for (i = 0; i < this.property_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(10, (MessageLite) this.property_.get(i));
                    }
                    for (i = 0; i < this.typeAlias_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(11, (MessageLite) this.typeAlias_.get(i));
                    }
                    for (i = 0; i < this.enumEntry_.size(); i++) {
                        i2 += CodedOutputStream.computeMessageSize(13, (MessageLite) this.enumEntry_.get(i));
                    }
                    i = 0;
                    while (i3 < this.sealedSubclassFqName_.size()) {
                        i += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.sealedSubclassFqName_.get(i3)).intValue());
                        i3++;
                    }
                    i2 += i;
                    if (!getSealedSubclassFqNameList().isEmpty()) {
                        i2 = (i2 + 2) + CodedOutputStream.computeInt32SizeNoTag(i);
                    }
                    this.sealedSubclassFqNameMemoizedSerializedSize = i;
                    if ((this.bitField0_ & 8) == 8) {
                        i2 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i2 += CodedOutputStream.computeInt32Size(31, this.versionRequirement_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i2 += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
                    }
                    i2 = (i2 + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i2;
                    return i2;
                }

                public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Class) PARSER.parseFrom(inputStream, extensionRegistryLite);
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Class classR) {
                    return newBuilder().mergeFrom(classR);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Constructor extends ExtendableMessage<Constructor> implements ConstructorOrBuilder {
                public static Parser<Constructor> PARSER = new C184921();
                private static final Constructor defaultInstance = new Constructor(true);
                private int bitField0_;
                private int flags_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private final ByteString unknownFields;
                private List<ValueParameter> valueParameter_;
                private int versionRequirement_;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1 */
                static class C184921 extends AbstractParser<Constructor> {
                    C184921() {
                    }

                    public Constructor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Constructor(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
                    private int bitField0_;
                    private int flags_ = 6;
                    private List<ValueParameter> valueParameter_ = Collections.emptyList();
                    private int versionRequirement_;

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

                    public Constructor getDefaultInstanceForType() {
                        return Constructor.getDefaultInstance();
                    }

                    public Constructor build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Constructor buildPartial() {
                        Constructor constructor = new Constructor((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        constructor.flags_ = this.flags_;
                        if ((this.bitField0_ & 2) == 2) {
                            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                            this.bitField0_ &= -3;
                        }
                        constructor.valueParameter_ = this.valueParameter_;
                        if ((i & 4) == 4) {
                            i2 |= 2;
                        }
                        constructor.versionRequirement_ = this.versionRequirement_;
                        constructor.bitField0_ = i2;
                        return constructor;
                    }

                    public Builder mergeFrom(Constructor constructor) {
                        if (constructor == Constructor.getDefaultInstance()) {
                            return this;
                        }
                        if (constructor.hasFlags()) {
                            setFlags(constructor.getFlags());
                        }
                        if (!constructor.valueParameter_.isEmpty()) {
                            if (this.valueParameter_.isEmpty()) {
                                this.valueParameter_ = constructor.valueParameter_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureValueParameterIsMutable();
                                this.valueParameter_.addAll(constructor.valueParameter_);
                            }
                        }
                        if (constructor.hasVersionRequirement()) {
                            setVersionRequirement(constructor.getVersionRequirement());
                        }
                        mergeExtensionFields(constructor);
                        setUnknownFields(getUnknownFields().concat(constructor.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        for (int i = 0; i < getValueParameterCount(); i++) {
                            if (!getValueParameter(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Constructor constructor;
                        Constructor constructor2 = null;
                        try {
                            Constructor constructor3 = (Constructor) Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (constructor3 != null) {
                                mergeFrom(constructor3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            constructor = (Constructor) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            constructor2 = constructor;
                        }
                        if (constructor2 != null) {
                            mergeFrom(constructor2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1;
                        this.flags_ = i;
                        return this;
                    }

                    private void ensureValueParameterIsMutable() {
                        if ((this.bitField0_ & 2) != 2) {
                            this.valueParameter_ = new ArrayList(this.valueParameter_);
                            this.bitField0_ |= 2;
                        }
                    }

                    public int getValueParameterCount() {
                        return this.valueParameter_.size();
                    }

                    public ValueParameter getValueParameter(int i) {
                        return (ValueParameter) this.valueParameter_.get(i);
                    }

                    public Builder setVersionRequirement(int i) {
                        this.bitField0_ |= 4;
                        this.versionRequirement_ = i;
                        return this;
                    }
                }

                private Constructor(ExtendableBuilder<Constructor, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private Constructor(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Constructor getDefaultInstance() {
                    return defaultInstance;
                }

                public Constructor getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Constructor(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r9, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r10) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r8 = this;
                    r8.<init>();
                    r0 = -1;
                    r8.memoizedIsInitialized = r0;
                    r8.memoizedSerializedSize = r0;
                    r8.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 2;
                    if (r3 != 0) goto L_0x009e;
                L_0x0019:
                    r6 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    if (r6 == 0) goto L_0x0063;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x001f:
                    r7 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    if (r6 == r7) goto L_0x0057;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x0023:
                    r7 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    if (r6 == r7) goto L_0x003e;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x0027:
                    r7 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    if (r6 == r7) goto L_0x0032;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x002b:
                    r6 = r8.parseUnknownField(r9, r2, r10, r6);	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    if (r6 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x0031:
                    goto L_0x0063;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x0032:
                    r6 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r6 = r6 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r8.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r6 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r8.versionRequirement_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x003e:
                    r6 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    if (r6 == r5) goto L_0x004b;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x0042:
                    r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r8.valueParameter_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x004b:
                    r6 = r8.valueParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r7 = r9.readMessage(r7, r10);	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                L_0x0057:
                    r6 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r6 = r6 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r8.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r6 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    r8.flags_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0076, IOException -> 0x0067 }
                    goto L_0x0016;
                L_0x0063:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0065:
                    r9 = move-exception;
                    goto L_0x007c;
                L_0x0067:
                    r9 = move-exception;
                    r10 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0065 }
                    r9 = r9.getMessage();	 Catch:{ all -> 0x0065 }
                    r10.<init>(r9);	 Catch:{ all -> 0x0065 }
                    r9 = r10.setUnfinishedMessage(r8);	 Catch:{ all -> 0x0065 }
                    throw r9;	 Catch:{ all -> 0x0065 }
                L_0x0076:
                    r9 = move-exception;	 Catch:{ all -> 0x0065 }
                    r9 = r9.setUnfinishedMessage(r8);	 Catch:{ all -> 0x0065 }
                    throw r9;	 Catch:{ all -> 0x0065 }
                L_0x007c:
                    r10 = r4 & 2;
                    if (r10 != r5) goto L_0x0088;
                L_0x0080:
                    r10 = r8.valueParameter_;
                    r10 = java.util.Collections.unmodifiableList(r10);
                    r8.valueParameter_ = r10;
                L_0x0088:
                    r2.flush();	 Catch:{ IOException -> 0x008b, all -> 0x0092 }
                L_0x008b:
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    goto L_0x009a;
                L_0x0092:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x009a:
                    r8.makeExtensionsImmutable();
                    throw r9;
                L_0x009e:
                    r9 = r4 & 2;
                    if (r9 != r5) goto L_0x00aa;
                L_0x00a2:
                    r9 = r8.valueParameter_;
                    r9 = java.util.Collections.unmodifiableList(r9);
                    r8.valueParameter_ = r9;
                L_0x00aa:
                    r2.flush();	 Catch:{ IOException -> 0x00ad, all -> 0x00b4 }
                L_0x00ad:
                    r9 = r0.toByteString();
                    r8.unknownFields = r9;
                    goto L_0x00bc;
                L_0x00b4:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x00bc:
                    r8.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Constructor> getParserForType() {
                    return PARSER;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public List<ValueParameter> getValueParameterList() {
                    return this.valueParameter_;
                }

                public int getValueParameterCount() {
                    return this.valueParameter_.size();
                }

                public ValueParameter getValueParameter(int i) {
                    return (ValueParameter) this.valueParameter_.get(i);
                }

                public boolean hasVersionRequirement() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getVersionRequirement() {
                    return this.versionRequirement_;
                }

                private void initFields() {
                    this.flags_ = 6;
                    this.valueParameter_ = Collections.emptyList();
                    this.versionRequirement_ = 0;
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
                    while (i < getValueParameterCount()) {
                        if (getValueParameter(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    if (extensionsAreInitialized()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    }
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(1, this.flags_);
                    }
                    for (int i = 0; i < this.valueParameter_.size(); i++) {
                        codedOutputStream.writeMessage(2, (MessageLite) this.valueParameter_.get(i));
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(31, this.versionRequirement_);
                    }
                    newExtensionWriter.writeUntil(19000, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
                    while (i2 < this.valueParameter_.size()) {
                        i += CodedOutputStream.computeMessageSize(2, (MessageLite) this.valueParameter_.get(i2));
                        i2++;
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(31, this.versionRequirement_);
                    }
                    i = (i + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i;
                    return i;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Constructor constructor) {
                    return newBuilder().mergeFrom(constructor);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class EnumEntry extends ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
                public static Parser<EnumEntry> PARSER = new C184951();
                private static final EnumEntry defaultInstance = new EnumEntry(true);
                private int bitField0_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int name_;
                private final ByteString unknownFields;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1 */
                static class C184951 extends AbstractParser<EnumEntry> {
                    C184951() {
                    }

                    public EnumEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new EnumEntry(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
                    private int bitField0_;
                    private int name_;

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

                    public EnumEntry getDefaultInstanceForType() {
                        return EnumEntry.getDefaultInstance();
                    }

                    public EnumEntry build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public EnumEntry buildPartial() {
                        EnumEntry enumEntry = new EnumEntry((ExtendableBuilder) this);
                        int i = 1;
                        if ((this.bitField0_ & 1) != 1) {
                            i = 0;
                        }
                        enumEntry.name_ = this.name_;
                        enumEntry.bitField0_ = i;
                        return enumEntry;
                    }

                    public Builder mergeFrom(EnumEntry enumEntry) {
                        if (enumEntry == EnumEntry.getDefaultInstance()) {
                            return this;
                        }
                        if (enumEntry.hasName()) {
                            setName(enumEntry.getName());
                        }
                        mergeExtensionFields(enumEntry);
                        setUnknownFields(getUnknownFields().concat(enumEntry.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        return extensionsAreInitialized();
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        EnumEntry enumEntry;
                        EnumEntry enumEntry2 = null;
                        try {
                            EnumEntry enumEntry3 = (EnumEntry) EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (enumEntry3 != null) {
                                mergeFrom(enumEntry3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            enumEntry = (EnumEntry) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            enumEntry2 = enumEntry;
                        }
                        if (enumEntry2 != null) {
                            mergeFrom(enumEntry2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setName(int i) {
                        this.bitField0_ |= 1;
                        this.name_ = i;
                        return this;
                    }
                }

                private EnumEntry(ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private EnumEntry(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static EnumEntry getDefaultInstance() {
                    return defaultInstance;
                }

                public EnumEntry getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private EnumEntry(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r8) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                    if (r3 != 0) goto L_0x0063;
                L_0x0017:
                    r4 = r7.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    if (r4 == 0) goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                L_0x001d:
                    r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    if (r4 == r5) goto L_0x0028;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                L_0x0021:
                    r4 = r6.parseUnknownField(r7, r2, r8, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                L_0x0027:
                    goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                L_0x0028:
                    r4 = r6.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    r6.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    r4 = r7.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    r6.name_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0047, IOException -> 0x0038 }
                    goto L_0x0015;
                L_0x0034:
                    r3 = 1;
                    goto L_0x0015;
                L_0x0036:
                    r7 = move-exception;
                    goto L_0x004d;
                L_0x0038:
                    r7 = move-exception;
                    r8 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0036 }
                    r7 = r7.getMessage();	 Catch:{ all -> 0x0036 }
                    r8.<init>(r7);	 Catch:{ all -> 0x0036 }
                    r7 = r8.setUnfinishedMessage(r6);	 Catch:{ all -> 0x0036 }
                    throw r7;	 Catch:{ all -> 0x0036 }
                L_0x0047:
                    r7 = move-exception;	 Catch:{ all -> 0x0036 }
                    r7 = r7.setUnfinishedMessage(r6);	 Catch:{ all -> 0x0036 }
                    throw r7;	 Catch:{ all -> 0x0036 }
                L_0x004d:
                    r2.flush();	 Catch:{ IOException -> 0x0050, all -> 0x0057 }
                L_0x0050:
                    r8 = r0.toByteString();
                    r6.unknownFields = r8;
                    goto L_0x005f;
                L_0x0057:
                    r7 = move-exception;
                    r8 = r0.toByteString();
                    r6.unknownFields = r8;
                    throw r7;
                L_0x005f:
                    r6.makeExtensionsImmutable();
                    throw r7;
                L_0x0063:
                    r2.flush();	 Catch:{ IOException -> 0x0066, all -> 0x006d }
                L_0x0066:
                    r7 = r0.toByteString();
                    r6.unknownFields = r7;
                    goto L_0x0075;
                L_0x006d:
                    r7 = move-exception;
                    r8 = r0.toByteString();
                    r6.unknownFields = r8;
                    throw r7;
                L_0x0075:
                    r6.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<EnumEntry> getParserForType() {
                    return PARSER;
                }

                public boolean hasName() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getName() {
                    return this.name_;
                }

                private void initFields() {
                    this.name_ = 0;
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (extensionsAreInitialized()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    }
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(1, this.name_);
                    }
                    newExtensionWriter.writeUntil(Callback.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
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
                    i = (i + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i;
                    return i;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(EnumEntry enumEntry) {
                    return newBuilder().mergeFrom(enumEntry);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Function extends ExtendableMessage<Function> implements FunctionOrBuilder {
                public static Parser<Function> PARSER = new C184971();
                private static final Function defaultInstance = new Function(true);
                private int bitField0_;
                private Contract contract_;
                private int flags_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int name_;
                private int oldFlags_;
                private int receiverTypeId_;
                private Type receiverType_;
                private int returnTypeId_;
                private Type returnType_;
                private List<TypeParameter> typeParameter_;
                private TypeTable typeTable_;
                private final ByteString unknownFields;
                private List<ValueParameter> valueParameter_;
                private int versionRequirement_;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1 */
                static class C184971 extends AbstractParser<Function> {
                    C184971() {
                    }

                    public Function parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Function(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
                    private int bitField0_;
                    private Contract contract_ = Contract.getDefaultInstance();
                    private int flags_ = 6;
                    private int name_;
                    private int oldFlags_ = 6;
                    private int receiverTypeId_;
                    private Type receiverType_ = Type.getDefaultInstance();
                    private int returnTypeId_;
                    private Type returnType_ = Type.getDefaultInstance();
                    private List<TypeParameter> typeParameter_ = Collections.emptyList();
                    private TypeTable typeTable_ = TypeTable.getDefaultInstance();
                    private List<ValueParameter> valueParameter_ = Collections.emptyList();
                    private int versionRequirement_;

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

                    public Function getDefaultInstanceForType() {
                        return Function.getDefaultInstance();
                    }

                    public Function build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Function buildPartial() {
                        Function function = new Function((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        function.flags_ = this.flags_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        function.oldFlags_ = this.oldFlags_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        function.name_ = this.name_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        function.returnType_ = this.returnType_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        function.returnTypeId_ = this.returnTypeId_;
                        if ((this.bitField0_ & 32) == 32) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                            this.bitField0_ &= -33;
                        }
                        function.typeParameter_ = this.typeParameter_;
                        if ((i & 64) == 64) {
                            i2 |= 32;
                        }
                        function.receiverType_ = this.receiverType_;
                        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            i2 |= 64;
                        }
                        function.receiverTypeId_ = this.receiverTypeId_;
                        if ((this.bitField0_ & 256) == 256) {
                            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                            this.bitField0_ &= -257;
                        }
                        function.valueParameter_ = this.valueParameter_;
                        if ((i & 512) == 512) {
                            i2 |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        }
                        function.typeTable_ = this.typeTable_;
                        if ((i & 1024) == 1024) {
                            i2 |= 256;
                        }
                        function.versionRequirement_ = this.versionRequirement_;
                        if ((i & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                            i2 |= 512;
                        }
                        function.contract_ = this.contract_;
                        function.bitField0_ = i2;
                        return function;
                    }

                    public Builder mergeFrom(Function function) {
                        if (function == Function.getDefaultInstance()) {
                            return this;
                        }
                        if (function.hasFlags()) {
                            setFlags(function.getFlags());
                        }
                        if (function.hasOldFlags()) {
                            setOldFlags(function.getOldFlags());
                        }
                        if (function.hasName()) {
                            setName(function.getName());
                        }
                        if (function.hasReturnType()) {
                            mergeReturnType(function.getReturnType());
                        }
                        if (function.hasReturnTypeId()) {
                            setReturnTypeId(function.getReturnTypeId());
                        }
                        if (!function.typeParameter_.isEmpty()) {
                            if (this.typeParameter_.isEmpty()) {
                                this.typeParameter_ = function.typeParameter_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureTypeParameterIsMutable();
                                this.typeParameter_.addAll(function.typeParameter_);
                            }
                        }
                        if (function.hasReceiverType()) {
                            mergeReceiverType(function.getReceiverType());
                        }
                        if (function.hasReceiverTypeId()) {
                            setReceiverTypeId(function.getReceiverTypeId());
                        }
                        if (!function.valueParameter_.isEmpty()) {
                            if (this.valueParameter_.isEmpty()) {
                                this.valueParameter_ = function.valueParameter_;
                                this.bitField0_ &= -257;
                            } else {
                                ensureValueParameterIsMutable();
                                this.valueParameter_.addAll(function.valueParameter_);
                            }
                        }
                        if (function.hasTypeTable()) {
                            mergeTypeTable(function.getTypeTable());
                        }
                        if (function.hasVersionRequirement()) {
                            setVersionRequirement(function.getVersionRequirement());
                        }
                        if (function.hasContract()) {
                            mergeContract(function.getContract());
                        }
                        mergeExtensionFields(function);
                        setUnknownFields(getUnknownFields().concat(function.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (!hasName()) {
                            return false;
                        }
                        if (hasReturnType() && !getReturnType().isInitialized()) {
                            return false;
                        }
                        int i;
                        for (i = 0; i < getTypeParameterCount(); i++) {
                            if (!getTypeParameter(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (hasReceiverType() && !getReceiverType().isInitialized()) {
                            return false;
                        }
                        for (i = 0; i < getValueParameterCount(); i++) {
                            if (!getValueParameter(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (hasTypeTable() && !getTypeTable().isInitialized()) {
                            return false;
                        }
                        if ((!hasContract() || getContract().isInitialized()) && extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Function function;
                        Function function2 = null;
                        try {
                            Function function3 = (Function) Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (function3 != null) {
                                mergeFrom(function3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            function = (Function) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            function2 = function;
                        }
                        if (function2 != null) {
                            mergeFrom(function2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1;
                        this.flags_ = i;
                        return this;
                    }

                    public Builder setOldFlags(int i) {
                        this.bitField0_ |= 2;
                        this.oldFlags_ = i;
                        return this;
                    }

                    public boolean hasName() {
                        return (this.bitField0_ & 4) == 4;
                    }

                    public Builder setName(int i) {
                        this.bitField0_ |= 4;
                        this.name_ = i;
                        return this;
                    }

                    public boolean hasReturnType() {
                        return (this.bitField0_ & 8) == 8;
                    }

                    public Type getReturnType() {
                        return this.returnType_;
                    }

                    public Builder mergeReturnType(Type type) {
                        if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                            this.returnType_ = type;
                        } else {
                            this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 8;
                        return this;
                    }

                    public Builder setReturnTypeId(int i) {
                        this.bitField0_ |= 16;
                        this.returnTypeId_ = i;
                        return this;
                    }

                    private void ensureTypeParameterIsMutable() {
                        if ((this.bitField0_ & 32) != 32) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 32;
                        }
                    }

                    public int getTypeParameterCount() {
                        return this.typeParameter_.size();
                    }

                    public TypeParameter getTypeParameter(int i) {
                        return (TypeParameter) this.typeParameter_.get(i);
                    }

                    public boolean hasReceiverType() {
                        return (this.bitField0_ & 64) == 64;
                    }

                    public Type getReceiverType() {
                        return this.receiverType_;
                    }

                    public Builder mergeReceiverType(Type type) {
                        if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                            this.receiverType_ = type;
                        } else {
                            this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 64;
                        return this;
                    }

                    public Builder setReceiverTypeId(int i) {
                        this.bitField0_ |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        this.receiverTypeId_ = i;
                        return this;
                    }

                    private void ensureValueParameterIsMutable() {
                        if ((this.bitField0_ & 256) != 256) {
                            this.valueParameter_ = new ArrayList(this.valueParameter_);
                            this.bitField0_ |= 256;
                        }
                    }

                    public int getValueParameterCount() {
                        return this.valueParameter_.size();
                    }

                    public ValueParameter getValueParameter(int i) {
                        return (ValueParameter) this.valueParameter_.get(i);
                    }

                    public boolean hasTypeTable() {
                        return (this.bitField0_ & 512) == 512;
                    }

                    public TypeTable getTypeTable() {
                        return this.typeTable_;
                    }

                    public Builder mergeTypeTable(TypeTable typeTable) {
                        if ((this.bitField0_ & 512) != 512 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                            this.typeTable_ = typeTable;
                        } else {
                            this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                        }
                        this.bitField0_ |= 512;
                        return this;
                    }

                    public Builder setVersionRequirement(int i) {
                        this.bitField0_ |= 1024;
                        this.versionRequirement_ = i;
                        return this;
                    }

                    public boolean hasContract() {
                        return (this.bitField0_ & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED;
                    }

                    public Contract getContract() {
                        return this.contract_;
                    }

                    public Builder mergeContract(Contract contract) {
                        if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) != ItemAnimator.FLAG_MOVED || this.contract_ == Contract.getDefaultInstance()) {
                            this.contract_ = contract;
                        } else {
                            this.contract_ = Contract.newBuilder(this.contract_).mergeFrom(contract).buildPartial();
                        }
                        this.bitField0_ |= 2048;
                        return this;
                    }
                }

                private Function(ExtendableBuilder<Function, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private Function(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Function getDefaultInstance() {
                    return defaultInstance;
                }

                public Function getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Function(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r11, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r10 = this;
                    r10.<init>();
                    r0 = -1;
                    r10.memoizedIsInitialized = r0;
                    r10.memoizedSerializedSize = r0;
                    r10.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
                    r6 = 32;
                    if (r3 != 0) goto L_0x01a1;
                L_0x001c:
                    r7 = r11.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    switch(r7) {
                        case 0: goto L_0x0156;
                        case 8: goto L_0x0148;
                        case 16: goto L_0x013a;
                        case 26: goto L_0x010f;
                        case 34: goto L_0x00f5;
                        case 42: goto L_0x00cc;
                        case 50: goto L_0x00b2;
                        case 56: goto L_0x00a4;
                        case 64: goto L_0x0096;
                        case 72: goto L_0x008a;
                        case 242: goto L_0x0060;
                        case 248: goto L_0x0054;
                        case 258: goto L_0x002a;
                        default: goto L_0x0024;
                    };	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0024:
                    r7 = r10.parseUnknownField(r11, r2, r12, r7);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0159;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x002a:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r9 = 512; // 0x200 float:7.175E-43 double:2.53E-321;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 & r9;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r7 != r9) goto L_0x0037;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0031:
                    r7 = r10.contract_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0037:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.contract_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r8 == 0) goto L_0x004e;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0043:
                    r7 = r10.contract_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.contract_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x004e:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | r9;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0054:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.versionRequirement_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0060:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r9 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 & r9;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r7 != r9) goto L_0x006d;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0067:
                    r7 = r10.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x006d:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.typeTable_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r8 == 0) goto L_0x0084;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0079:
                    r7 = r10.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.typeTable_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0084:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | r9;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x008a:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.flags_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0096:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.receiverTypeId_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00a4:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.returnTypeId_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00b2:
                    r7 = r4 & 256;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r7 == r5) goto L_0x00bf;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00b6:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.valueParameter_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r4 = r4 | 256;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00bf:
                    r7 = r10.valueParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = r11.readMessage(r8, r12);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00cc:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 & r6;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r7 != r6) goto L_0x00d7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00d1:
                    r7 = r10.receiverType_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00d7:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.receiverType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r8 == 0) goto L_0x00ee;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00e3:
                    r7 = r10.receiverType_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.receiverType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00ee:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | r6;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00f5:
                    r7 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r7 == r6) goto L_0x0102;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x00f9:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.typeParameter_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0102:
                    r7 = r10.typeParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = r11.readMessage(r8, r12);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x010f:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r9 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 & r9;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r7 != r9) goto L_0x011c;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0116:
                    r7 = r10.returnType_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x011c:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.returnType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    if (r8 == 0) goto L_0x0133;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0128:
                    r7 = r10.returnType_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r8.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.returnType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0133:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | r9;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x013a:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.name_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                L_0x0148:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r7 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r7 = r11.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    r10.oldFlags_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x016d, IOException -> 0x015e }
                    goto L_0x0016;
                L_0x0156:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0159:
                    if (r7 != 0) goto L_0x0016;
                L_0x015b:
                    goto L_0x0156;
                L_0x015c:
                    r11 = move-exception;
                    goto L_0x0173;
                L_0x015e:
                    r11 = move-exception;
                    r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x015c }
                    r11 = r11.getMessage();	 Catch:{ all -> 0x015c }
                    r12.<init>(r11);	 Catch:{ all -> 0x015c }
                    r11 = r12.setUnfinishedMessage(r10);	 Catch:{ all -> 0x015c }
                    throw r11;	 Catch:{ all -> 0x015c }
                L_0x016d:
                    r11 = move-exception;	 Catch:{ all -> 0x015c }
                    r11 = r11.setUnfinishedMessage(r10);	 Catch:{ all -> 0x015c }
                    throw r11;	 Catch:{ all -> 0x015c }
                L_0x0173:
                    r12 = r4 & 32;
                    if (r12 != r6) goto L_0x017f;
                L_0x0177:
                    r12 = r10.typeParameter_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r10.typeParameter_ = r12;
                L_0x017f:
                    r12 = r4 & 256;
                    if (r12 != r5) goto L_0x018b;
                L_0x0183:
                    r12 = r10.valueParameter_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r10.valueParameter_ = r12;
                L_0x018b:
                    r2.flush();	 Catch:{ IOException -> 0x018e, all -> 0x0195 }
                L_0x018e:
                    r12 = r0.toByteString();
                    r10.unknownFields = r12;
                    goto L_0x019d;
                L_0x0195:
                    r11 = move-exception;
                    r12 = r0.toByteString();
                    r10.unknownFields = r12;
                    throw r11;
                L_0x019d:
                    r10.makeExtensionsImmutable();
                    throw r11;
                L_0x01a1:
                    r11 = r4 & 32;
                    if (r11 != r6) goto L_0x01ad;
                L_0x01a5:
                    r11 = r10.typeParameter_;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r10.typeParameter_ = r11;
                L_0x01ad:
                    r11 = r4 & 256;
                    if (r11 != r5) goto L_0x01b9;
                L_0x01b1:
                    r11 = r10.valueParameter_;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r10.valueParameter_ = r11;
                L_0x01b9:
                    r2.flush();	 Catch:{ IOException -> 0x01bc, all -> 0x01c3 }
                L_0x01bc:
                    r11 = r0.toByteString();
                    r10.unknownFields = r11;
                    goto L_0x01cb;
                L_0x01c3:
                    r11 = move-exception;
                    r12 = r0.toByteString();
                    r10.unknownFields = r12;
                    throw r11;
                L_0x01cb:
                    r10.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Function> getParserForType() {
                    return PARSER;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public boolean hasOldFlags() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getOldFlags() {
                    return this.oldFlags_;
                }

                public boolean hasName() {
                    return (this.bitField0_ & 4) == 4;
                }

                public int getName() {
                    return this.name_;
                }

                public boolean hasReturnType() {
                    return (this.bitField0_ & 8) == 8;
                }

                public Type getReturnType() {
                    return this.returnType_;
                }

                public boolean hasReturnTypeId() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int getReturnTypeId() {
                    return this.returnTypeId_;
                }

                public List<TypeParameter> getTypeParameterList() {
                    return this.typeParameter_;
                }

                public int getTypeParameterCount() {
                    return this.typeParameter_.size();
                }

                public TypeParameter getTypeParameter(int i) {
                    return (TypeParameter) this.typeParameter_.get(i);
                }

                public boolean hasReceiverType() {
                    return (this.bitField0_ & 32) == 32;
                }

                public Type getReceiverType() {
                    return this.receiverType_;
                }

                public boolean hasReceiverTypeId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public int getReceiverTypeId() {
                    return this.receiverTypeId_;
                }

                public List<ValueParameter> getValueParameterList() {
                    return this.valueParameter_;
                }

                public int getValueParameterCount() {
                    return this.valueParameter_.size();
                }

                public ValueParameter getValueParameter(int i) {
                    return (ValueParameter) this.valueParameter_.get(i);
                }

                public boolean hasTypeTable() {
                    return (this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                }

                public TypeTable getTypeTable() {
                    return this.typeTable_;
                }

                public boolean hasVersionRequirement() {
                    return (this.bitField0_ & 256) == 256;
                }

                public int getVersionRequirement() {
                    return this.versionRequirement_;
                }

                public boolean hasContract() {
                    return (this.bitField0_ & 512) == 512;
                }

                public Contract getContract() {
                    return this.contract_;
                }

                private void initFields() {
                    this.flags_ = 6;
                    this.oldFlags_ = 6;
                    this.name_ = 0;
                    this.returnType_ = Type.getDefaultInstance();
                    this.returnTypeId_ = 0;
                    this.typeParameter_ = Collections.emptyList();
                    this.receiverType_ = Type.getDefaultInstance();
                    this.receiverTypeId_ = 0;
                    this.valueParameter_ = Collections.emptyList();
                    this.typeTable_ = TypeTable.getDefaultInstance();
                    this.versionRequirement_ = 0;
                    this.contract_ = Contract.getDefaultInstance();
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (!hasName()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (!hasReturnType() || getReturnType().isInitialized()) {
                        int i = 0;
                        while (i < getTypeParameterCount()) {
                            if (getTypeParameter(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        if (!hasReceiverType() || getReceiverType().isInitialized()) {
                            i = 0;
                            while (i < getValueParameterCount()) {
                                if (getValueParameter(i).isInitialized()) {
                                    i++;
                                } else {
                                    this.memoizedIsInitialized = (byte) 0;
                                    return false;
                                }
                            }
                            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            } else if (hasContract() && !getContract().isInitialized()) {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            } else if (extensionsAreInitialized()) {
                                this.memoizedIsInitialized = (byte) 1;
                                return true;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(1, this.oldFlags_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeInt32(2, this.name_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeMessage(3, this.returnType_);
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                        codedOutputStream.writeMessage(4, (MessageLite) this.typeParameter_.get(i2));
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeMessage(5, this.receiverType_);
                    }
                    while (i < this.valueParameter_.size()) {
                        codedOutputStream.writeMessage(6, (MessageLite) this.valueParameter_.get(i));
                        i++;
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(7, this.returnTypeId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(8, this.receiverTypeId_);
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(9, this.flags_);
                    }
                    if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        codedOutputStream.writeMessage(30, this.typeTable_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.writeInt32(31, this.versionRequirement_);
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.writeMessage(32, this.contract_);
                    }
                    newExtensionWriter.writeUntil(19000, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0 : 0;
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeInt32Size(2, this.name_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeMessageSize(3, this.returnType_);
                    }
                    int i3 = i;
                    for (i = 0; i < this.typeParameter_.size(); i++) {
                        i3 += CodedOutputStream.computeMessageSize(4, (MessageLite) this.typeParameter_.get(i));
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i3 += CodedOutputStream.computeMessageSize(5, this.receiverType_);
                    }
                    while (i2 < this.valueParameter_.size()) {
                        i3 += CodedOutputStream.computeMessageSize(6, (MessageLite) this.valueParameter_.get(i2));
                        i2++;
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i3 += CodedOutputStream.computeInt32Size(7, this.returnTypeId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        i3 += CodedOutputStream.computeInt32Size(8, this.receiverTypeId_);
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        i3 += CodedOutputStream.computeInt32Size(9, this.flags_);
                    }
                    if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        i3 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        i3 += CodedOutputStream.computeInt32Size(31, this.versionRequirement_);
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        i3 += CodedOutputStream.computeMessageSize(32, this.contract_);
                    }
                    i3 = (i3 + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i3;
                    return i3;
                }

                public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Function) PARSER.parseFrom(inputStream, extensionRegistryLite);
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Function function) {
                    return newBuilder().mergeFrom(function);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Package extends ExtendableMessage<Package> implements PackageOrBuilder {
                public static Parser<Package> PARSER = new C184981();
                private static final Package defaultInstance = new Package(true);
                private int bitField0_;
                private List<Function> function_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private List<Property> property_;
                private List<TypeAlias> typeAlias_;
                private TypeTable typeTable_;
                private final ByteString unknownFields;
                private VersionRequirementTable versionRequirementTable_;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1 */
                static class C184981 extends AbstractParser<Package> {
                    C184981() {
                    }

                    public Package parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Package(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
                    private int bitField0_;
                    private List<Function> function_ = Collections.emptyList();
                    private List<Property> property_ = Collections.emptyList();
                    private List<TypeAlias> typeAlias_ = Collections.emptyList();
                    private TypeTable typeTable_ = TypeTable.getDefaultInstance();
                    private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();

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

                    public Package getDefaultInstanceForType() {
                        return Package.getDefaultInstance();
                    }

                    public Package build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Package buildPartial() {
                        Package packageR = new Package((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((this.bitField0_ & 1) == 1) {
                            this.function_ = Collections.unmodifiableList(this.function_);
                            this.bitField0_ &= -2;
                        }
                        packageR.function_ = this.function_;
                        if ((this.bitField0_ & 2) == 2) {
                            this.property_ = Collections.unmodifiableList(this.property_);
                            this.bitField0_ &= -3;
                        }
                        packageR.property_ = this.property_;
                        if ((this.bitField0_ & 4) == 4) {
                            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                            this.bitField0_ &= -5;
                        }
                        packageR.typeAlias_ = this.typeAlias_;
                        if ((i & 8) != 8) {
                            i2 = 0;
                        }
                        packageR.typeTable_ = this.typeTable_;
                        if ((i & 16) == 16) {
                            i2 |= 2;
                        }
                        packageR.versionRequirementTable_ = this.versionRequirementTable_;
                        packageR.bitField0_ = i2;
                        return packageR;
                    }

                    public Builder mergeFrom(Package packageR) {
                        if (packageR == Package.getDefaultInstance()) {
                            return this;
                        }
                        if (!packageR.function_.isEmpty()) {
                            if (this.function_.isEmpty()) {
                                this.function_ = packageR.function_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureFunctionIsMutable();
                                this.function_.addAll(packageR.function_);
                            }
                        }
                        if (!packageR.property_.isEmpty()) {
                            if (this.property_.isEmpty()) {
                                this.property_ = packageR.property_;
                                this.bitField0_ &= -3;
                            } else {
                                ensurePropertyIsMutable();
                                this.property_.addAll(packageR.property_);
                            }
                        }
                        if (!packageR.typeAlias_.isEmpty()) {
                            if (this.typeAlias_.isEmpty()) {
                                this.typeAlias_ = packageR.typeAlias_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureTypeAliasIsMutable();
                                this.typeAlias_.addAll(packageR.typeAlias_);
                            }
                        }
                        if (packageR.hasTypeTable()) {
                            mergeTypeTable(packageR.getTypeTable());
                        }
                        if (packageR.hasVersionRequirementTable()) {
                            mergeVersionRequirementTable(packageR.getVersionRequirementTable());
                        }
                        mergeExtensionFields(packageR);
                        setUnknownFields(getUnknownFields().concat(packageR.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        int i;
                        for (i = 0; i < getFunctionCount(); i++) {
                            if (!getFunction(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getPropertyCount(); i++) {
                            if (!getProperty(i).isInitialized()) {
                                return false;
                            }
                        }
                        for (i = 0; i < getTypeAliasCount(); i++) {
                            if (!getTypeAlias(i).isInitialized()) {
                                return false;
                            }
                        }
                        if ((!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Package packageR;
                        Package packageR2 = null;
                        try {
                            Package packageR3 = (Package) Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (packageR3 != null) {
                                mergeFrom(packageR3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            packageR = (Package) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            packageR2 = packageR;
                        }
                        if (packageR2 != null) {
                            mergeFrom(packageR2);
                        }
                        throw codedInputStream2;
                    }

                    private void ensureFunctionIsMutable() {
                        if ((this.bitField0_ & 1) != 1) {
                            this.function_ = new ArrayList(this.function_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public int getFunctionCount() {
                        return this.function_.size();
                    }

                    public Function getFunction(int i) {
                        return (Function) this.function_.get(i);
                    }

                    private void ensurePropertyIsMutable() {
                        if ((this.bitField0_ & 2) != 2) {
                            this.property_ = new ArrayList(this.property_);
                            this.bitField0_ |= 2;
                        }
                    }

                    public int getPropertyCount() {
                        return this.property_.size();
                    }

                    public Property getProperty(int i) {
                        return (Property) this.property_.get(i);
                    }

                    private void ensureTypeAliasIsMutable() {
                        if ((this.bitField0_ & 4) != 4) {
                            this.typeAlias_ = new ArrayList(this.typeAlias_);
                            this.bitField0_ |= 4;
                        }
                    }

                    public int getTypeAliasCount() {
                        return this.typeAlias_.size();
                    }

                    public TypeAlias getTypeAlias(int i) {
                        return (TypeAlias) this.typeAlias_.get(i);
                    }

                    public boolean hasTypeTable() {
                        return (this.bitField0_ & 8) == 8;
                    }

                    public TypeTable getTypeTable() {
                        return this.typeTable_;
                    }

                    public Builder mergeTypeTable(TypeTable typeTable) {
                        if ((this.bitField0_ & 8) != 8 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                            this.typeTable_ = typeTable;
                        } else {
                            this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                        }
                        this.bitField0_ |= 8;
                        return this;
                    }

                    public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                        if ((this.bitField0_ & 16) != 16 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                            this.versionRequirementTable_ = versionRequirementTable;
                        } else {
                            this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                        }
                        this.bitField0_ |= 16;
                        return this;
                    }
                }

                private Package(ExtendableBuilder<Package, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private Package(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Package getDefaultInstance() {
                    return defaultInstance;
                }

                public Package getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Package(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r11, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r10 = this;
                    r10.<init>();
                    r0 = -1;
                    r10.memoizedIsInitialized = r0;
                    r10.memoizedSerializedSize = r0;
                    r10.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 4;
                    r6 = 2;
                    if (r3 != 0) goto L_0x012f;
                L_0x001a:
                    r7 = r11.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == 0) goto L_0x00db;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0020:
                    r8 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r8) goto L_0x00c1;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0024:
                    r8 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r8) goto L_0x00a7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0028:
                    r8 = 42;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r8) goto L_0x008d;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x002c:
                    r8 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r9 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r8) goto L_0x0065;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0031:
                    r8 = 258; // 0x102 float:3.62E-43 double:1.275E-321;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r8) goto L_0x003d;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0035:
                    r7 = r10.parseUnknownField(r11, r2, r12, r7);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x003b:
                    goto L_0x00db;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x003d:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r7 & r6;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 != r6) goto L_0x0048;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0042:
                    r7 = r10.versionRequirementTable_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r9 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0048:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.versionRequirementTable_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r9 == 0) goto L_0x005f;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0054:
                    r7 = r10.versionRequirementTable_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r9.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r9.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.versionRequirementTable_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x005f:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r7 | r6;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0065:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r7 & r1;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 != r1) goto L_0x0070;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x006a:
                    r7 = r10.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r9 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0070:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r11.readMessage(r7, r12);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.typeTable_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r9 == 0) goto L_0x0087;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x007c:
                    r7 = r10.typeTable_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r9.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r9.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.typeTable_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0087:
                    r7 = r10.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7 = r7 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x008d:
                    r7 = r4 & 4;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r5) goto L_0x009a;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x0091:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.typeAlias_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x009a:
                    r7 = r10.typeAlias_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r8 = r11.readMessage(r8, r12);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x00a7:
                    r7 = r4 & 2;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r6) goto L_0x00b4;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x00ab:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.property_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x00b4:
                    r7 = r10.property_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r8 = r11.readMessage(r8, r12);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x00c1:
                    r7 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    if (r7 == r1) goto L_0x00ce;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x00c5:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r10.function_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                L_0x00ce:
                    r7 = r10.function_;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r8 = r11.readMessage(r8, r12);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e0 }
                    goto L_0x0016;
                L_0x00db:
                    r3 = 1;
                    goto L_0x0016;
                L_0x00de:
                    r11 = move-exception;
                    goto L_0x00f5;
                L_0x00e0:
                    r11 = move-exception;
                    r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00de }
                    r11 = r11.getMessage();	 Catch:{ all -> 0x00de }
                    r12.<init>(r11);	 Catch:{ all -> 0x00de }
                    r11 = r12.setUnfinishedMessage(r10);	 Catch:{ all -> 0x00de }
                    throw r11;	 Catch:{ all -> 0x00de }
                L_0x00ef:
                    r11 = move-exception;	 Catch:{ all -> 0x00de }
                    r11 = r11.setUnfinishedMessage(r10);	 Catch:{ all -> 0x00de }
                    throw r11;	 Catch:{ all -> 0x00de }
                L_0x00f5:
                    r12 = r4 & 1;
                    if (r12 != r1) goto L_0x0101;
                L_0x00f9:
                    r12 = r10.function_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r10.function_ = r12;
                L_0x0101:
                    r12 = r4 & 2;
                    if (r12 != r6) goto L_0x010d;
                L_0x0105:
                    r12 = r10.property_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r10.property_ = r12;
                L_0x010d:
                    r12 = r4 & 4;
                    if (r12 != r5) goto L_0x0119;
                L_0x0111:
                    r12 = r10.typeAlias_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r10.typeAlias_ = r12;
                L_0x0119:
                    r2.flush();	 Catch:{ IOException -> 0x011c, all -> 0x0123 }
                L_0x011c:
                    r12 = r0.toByteString();
                    r10.unknownFields = r12;
                    goto L_0x012b;
                L_0x0123:
                    r11 = move-exception;
                    r12 = r0.toByteString();
                    r10.unknownFields = r12;
                    throw r11;
                L_0x012b:
                    r10.makeExtensionsImmutable();
                    throw r11;
                L_0x012f:
                    r11 = r4 & 1;
                    if (r11 != r1) goto L_0x013b;
                L_0x0133:
                    r11 = r10.function_;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r10.function_ = r11;
                L_0x013b:
                    r11 = r4 & 2;
                    if (r11 != r6) goto L_0x0147;
                L_0x013f:
                    r11 = r10.property_;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r10.property_ = r11;
                L_0x0147:
                    r11 = r4 & 4;
                    if (r11 != r5) goto L_0x0153;
                L_0x014b:
                    r11 = r10.typeAlias_;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r10.typeAlias_ = r11;
                L_0x0153:
                    r2.flush();	 Catch:{ IOException -> 0x0156, all -> 0x015d }
                L_0x0156:
                    r11 = r0.toByteString();
                    r10.unknownFields = r11;
                    goto L_0x0165;
                L_0x015d:
                    r11 = move-exception;
                    r12 = r0.toByteString();
                    r10.unknownFields = r12;
                    throw r11;
                L_0x0165:
                    r10.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Package> getParserForType() {
                    return PARSER;
                }

                public List<Function> getFunctionList() {
                    return this.function_;
                }

                public int getFunctionCount() {
                    return this.function_.size();
                }

                public Function getFunction(int i) {
                    return (Function) this.function_.get(i);
                }

                public List<Property> getPropertyList() {
                    return this.property_;
                }

                public int getPropertyCount() {
                    return this.property_.size();
                }

                public Property getProperty(int i) {
                    return (Property) this.property_.get(i);
                }

                public List<TypeAlias> getTypeAliasList() {
                    return this.typeAlias_;
                }

                public int getTypeAliasCount() {
                    return this.typeAlias_.size();
                }

                public TypeAlias getTypeAlias(int i) {
                    return (TypeAlias) this.typeAlias_.get(i);
                }

                public boolean hasTypeTable() {
                    return (this.bitField0_ & 1) == 1;
                }

                public TypeTable getTypeTable() {
                    return this.typeTable_;
                }

                public boolean hasVersionRequirementTable() {
                    return (this.bitField0_ & 2) == 2;
                }

                public VersionRequirementTable getVersionRequirementTable() {
                    return this.versionRequirementTable_;
                }

                private void initFields() {
                    this.function_ = Collections.emptyList();
                    this.property_ = Collections.emptyList();
                    this.typeAlias_ = Collections.emptyList();
                    this.typeTable_ = TypeTable.getDefaultInstance();
                    this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
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
                    while (i < getFunctionCount()) {
                        if (getFunction(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    i = 0;
                    while (i < getPropertyCount()) {
                        if (getProperty(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    i = 0;
                    while (i < getTypeAliasCount()) {
                        if (getTypeAlias(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    if (hasTypeTable() && !getTypeTable().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (extensionsAreInitialized()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i;
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    for (i = 0; i < this.function_.size(); i++) {
                        codedOutputStream.writeMessage(3, (MessageLite) this.function_.get(i));
                    }
                    for (i = 0; i < this.property_.size(); i++) {
                        codedOutputStream.writeMessage(4, (MessageLite) this.property_.get(i));
                    }
                    for (int i2 = 0; i2 < this.typeAlias_.size(); i2++) {
                        codedOutputStream.writeMessage(5, (MessageLite) this.typeAlias_.get(i2));
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeMessage(30, this.typeTable_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeMessage(32, this.versionRequirementTable_);
                    }
                    newExtensionWriter.writeUntil(Callback.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2;
                    int i3 = 0;
                    for (i2 = 0; i2 < this.function_.size(); i2++) {
                        i3 += CodedOutputStream.computeMessageSize(3, (MessageLite) this.function_.get(i2));
                    }
                    for (i2 = 0; i2 < this.property_.size(); i2++) {
                        i3 += CodedOutputStream.computeMessageSize(4, (MessageLite) this.property_.get(i2));
                    }
                    for (i = 0; i < this.typeAlias_.size(); i++) {
                        i3 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.typeAlias_.get(i));
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        i3 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        i3 += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
                    }
                    i3 = (i3 + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i3;
                    return i3;
                }

                public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Package) PARSER.parseFrom(inputStream, extensionRegistryLite);
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Package packageR) {
                    return newBuilder().mergeFrom(packageR);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class PackageFragment extends ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
                public static Parser<PackageFragment> PARSER = new C184991();
                private static final PackageFragment defaultInstance = new PackageFragment(true);
                private int bitField0_;
                private List<Class> class__;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private Package package_;
                private QualifiedNameTable qualifiedNames_;
                private StringTable strings_;
                private final ByteString unknownFields;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1 */
                static class C184991 extends AbstractParser<PackageFragment> {
                    C184991() {
                    }

                    public PackageFragment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new PackageFragment(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
                    private int bitField0_;
                    private List<Class> class__ = Collections.emptyList();
                    private Package package_ = Package.getDefaultInstance();
                    private QualifiedNameTable qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
                    private StringTable strings_ = StringTable.getDefaultInstance();

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

                    public PackageFragment getDefaultInstanceForType() {
                        return PackageFragment.getDefaultInstance();
                    }

                    public PackageFragment build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public PackageFragment buildPartial() {
                        PackageFragment packageFragment = new PackageFragment((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        packageFragment.strings_ = this.strings_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        packageFragment.qualifiedNames_ = this.qualifiedNames_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        packageFragment.package_ = this.package_;
                        if ((this.bitField0_ & 8) == 8) {
                            this.class__ = Collections.unmodifiableList(this.class__);
                            this.bitField0_ &= -9;
                        }
                        packageFragment.class__ = this.class__;
                        packageFragment.bitField0_ = i2;
                        return packageFragment;
                    }

                    public Builder mergeFrom(PackageFragment packageFragment) {
                        if (packageFragment == PackageFragment.getDefaultInstance()) {
                            return this;
                        }
                        if (packageFragment.hasStrings()) {
                            mergeStrings(packageFragment.getStrings());
                        }
                        if (packageFragment.hasQualifiedNames()) {
                            mergeQualifiedNames(packageFragment.getQualifiedNames());
                        }
                        if (packageFragment.hasPackage()) {
                            mergePackage(packageFragment.getPackage());
                        }
                        if (!packageFragment.class__.isEmpty()) {
                            if (this.class__.isEmpty()) {
                                this.class__ = packageFragment.class__;
                                this.bitField0_ &= -9;
                            } else {
                                ensureClass_IsMutable();
                                this.class__.addAll(packageFragment.class__);
                            }
                        }
                        mergeExtensionFields(packageFragment);
                        setUnknownFields(getUnknownFields().concat(packageFragment.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                            return false;
                        }
                        if (hasPackage() && !getPackage().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getClass_Count(); i++) {
                            if (!getClass_(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        PackageFragment packageFragment;
                        PackageFragment packageFragment2 = null;
                        try {
                            PackageFragment packageFragment3 = (PackageFragment) PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (packageFragment3 != null) {
                                mergeFrom(packageFragment3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            packageFragment = (PackageFragment) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            packageFragment2 = packageFragment;
                        }
                        if (packageFragment2 != null) {
                            mergeFrom(packageFragment2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder mergeStrings(StringTable stringTable) {
                        if ((this.bitField0_ & 1) != 1 || this.strings_ == StringTable.getDefaultInstance()) {
                            this.strings_ = stringTable;
                        } else {
                            this.strings_ = StringTable.newBuilder(this.strings_).mergeFrom(stringTable).buildPartial();
                        }
                        this.bitField0_ |= 1;
                        return this;
                    }

                    public boolean hasQualifiedNames() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public QualifiedNameTable getQualifiedNames() {
                        return this.qualifiedNames_;
                    }

                    public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                        if ((this.bitField0_ & 2) != 2 || this.qualifiedNames_ == QualifiedNameTable.getDefaultInstance()) {
                            this.qualifiedNames_ = qualifiedNameTable;
                        } else {
                            this.qualifiedNames_ = QualifiedNameTable.newBuilder(this.qualifiedNames_).mergeFrom(qualifiedNameTable).buildPartial();
                        }
                        this.bitField0_ |= 2;
                        return this;
                    }

                    public boolean hasPackage() {
                        return (this.bitField0_ & 4) == 4;
                    }

                    public Package getPackage() {
                        return this.package_;
                    }

                    public Builder mergePackage(Package packageR) {
                        if ((this.bitField0_ & 4) != 4 || this.package_ == Package.getDefaultInstance()) {
                            this.package_ = packageR;
                        } else {
                            this.package_ = Package.newBuilder(this.package_).mergeFrom(packageR).buildPartial();
                        }
                        this.bitField0_ |= 4;
                        return this;
                    }

                    private void ensureClass_IsMutable() {
                        if ((this.bitField0_ & 8) != 8) {
                            this.class__ = new ArrayList(this.class__);
                            this.bitField0_ |= 8;
                        }
                    }

                    public int getClass_Count() {
                        return this.class__.size();
                    }

                    public Class getClass_(int i) {
                        return (Class) this.class__.get(i);
                    }
                }

                private PackageFragment(ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private PackageFragment(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static PackageFragment getDefaultInstance() {
                    return defaultInstance;
                }

                public PackageFragment getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r9 = this;
                    r9.<init>();
                    r0 = -1;
                    r9.memoizedIsInitialized = r0;
                    r9.memoizedSerializedSize = r0;
                    r9.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 8;
                    if (r3 != 0) goto L_0x010a;
                L_0x001a:
                    r6 = r10.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 == 0) goto L_0x00ce;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0020:
                    r7 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r8 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 == r7) goto L_0x00a5;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0025:
                    r7 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 == r7) goto L_0x007b;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0029:
                    r7 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 == r7) goto L_0x0052;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x002d:
                    r7 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 == r7) goto L_0x0039;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0031:
                    r6 = r9.parseUnknownField(r10, r2, r11, r6);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0037:
                    goto L_0x00ce;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0039:
                    r6 = r4 & 8;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 == r5) goto L_0x0046;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x003d:
                    r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.class__ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r4 = r4 | 8;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0046:
                    r6 = r9.class__;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r7 = r10.readMessage(r7, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0052:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r7 = 4;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r6 & r7;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 != r7) goto L_0x005e;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0058:
                    r6 = r9.package_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r8 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x005e:
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r10.readMessage(r6, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.package_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r8 == 0) goto L_0x0075;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x006a:
                    r6 = r9.package_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r8.mergeFrom(r6);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.package_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0075:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r6 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x007b:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r7 = 2;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r6 & r7;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 != r7) goto L_0x0087;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0081:
                    r6 = r9.qualifiedNames_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r8 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0087:
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r10.readMessage(r6, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.qualifiedNames_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r8 == 0) goto L_0x009e;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x0093:
                    r6 = r9.qualifiedNames_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r8.mergeFrom(r6);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.qualifiedNames_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x009e:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r6 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x00a5:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r6 & r1;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r6 != r1) goto L_0x00b0;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x00aa:
                    r6 = r9.strings_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r8 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x00b0:
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r10.readMessage(r6, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.strings_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    if (r8 == 0) goto L_0x00c7;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x00bc:
                    r6 = r9.strings_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r8.mergeFrom(r6);	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.strings_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                L_0x00c7:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r6 = r6 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x00e2, IOException -> 0x00d3 }
                    goto L_0x0016;
                L_0x00ce:
                    r3 = 1;
                    goto L_0x0016;
                L_0x00d1:
                    r10 = move-exception;
                    goto L_0x00e8;
                L_0x00d3:
                    r10 = move-exception;
                    r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00d1 }
                    r10 = r10.getMessage();	 Catch:{ all -> 0x00d1 }
                    r11.<init>(r10);	 Catch:{ all -> 0x00d1 }
                    r10 = r11.setUnfinishedMessage(r9);	 Catch:{ all -> 0x00d1 }
                    throw r10;	 Catch:{ all -> 0x00d1 }
                L_0x00e2:
                    r10 = move-exception;	 Catch:{ all -> 0x00d1 }
                    r10 = r10.setUnfinishedMessage(r9);	 Catch:{ all -> 0x00d1 }
                    throw r10;	 Catch:{ all -> 0x00d1 }
                L_0x00e8:
                    r11 = r4 & 8;
                    if (r11 != r5) goto L_0x00f4;
                L_0x00ec:
                    r11 = r9.class__;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r9.class__ = r11;
                L_0x00f4:
                    r2.flush();	 Catch:{ IOException -> 0x00f7, all -> 0x00fe }
                L_0x00f7:
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    goto L_0x0106;
                L_0x00fe:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x0106:
                    r9.makeExtensionsImmutable();
                    throw r10;
                L_0x010a:
                    r10 = r4 & 8;
                    if (r10 != r5) goto L_0x0116;
                L_0x010e:
                    r10 = r9.class__;
                    r10 = java.util.Collections.unmodifiableList(r10);
                    r9.class__ = r10;
                L_0x0116:
                    r2.flush();	 Catch:{ IOException -> 0x0119, all -> 0x0120 }
                L_0x0119:
                    r10 = r0.toByteString();
                    r9.unknownFields = r10;
                    goto L_0x0128;
                L_0x0120:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x0128:
                    r9.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<PackageFragment> getParserForType() {
                    return PARSER;
                }

                public boolean hasStrings() {
                    return (this.bitField0_ & 1) == 1;
                }

                public StringTable getStrings() {
                    return this.strings_;
                }

                public boolean hasQualifiedNames() {
                    return (this.bitField0_ & 2) == 2;
                }

                public QualifiedNameTable getQualifiedNames() {
                    return this.qualifiedNames_;
                }

                public boolean hasPackage() {
                    return (this.bitField0_ & 4) == 4;
                }

                public Package getPackage() {
                    return this.package_;
                }

                public List<Class> getClass_List() {
                    return this.class__;
                }

                public int getClass_Count() {
                    return this.class__.size();
                }

                public Class getClass_(int i) {
                    return (Class) this.class__.get(i);
                }

                private void initFields() {
                    this.strings_ = StringTable.getDefaultInstance();
                    this.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
                    this.package_ = Package.getDefaultInstance();
                    this.class__ = Collections.emptyList();
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (!hasPackage() || getPackage().isInitialized()) {
                        int i = 0;
                        while (i < getClass_Count()) {
                            if (getClass_(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        if (extensionsAreInitialized()) {
                            this.memoizedIsInitialized = (byte) 1;
                            return true;
                        }
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeMessage(1, this.strings_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeMessage(2, this.qualifiedNames_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeMessage(3, this.package_);
                    }
                    for (int i = 0; i < this.class__.size(); i++) {
                        codedOutputStream.writeMessage(4, (MessageLite) this.class__.get(i));
                    }
                    newExtensionWriter.writeUntil(Callback.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.strings_) + 0 : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeMessageSize(2, this.qualifiedNames_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeMessageSize(3, this.package_);
                    }
                    while (i2 < this.class__.size()) {
                        i += CodedOutputStream.computeMessageSize(4, (MessageLite) this.class__.get(i2));
                        i2++;
                    }
                    i = (i + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i;
                    return i;
                }

                public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (PackageFragment) PARSER.parseFrom(inputStream, extensionRegistryLite);
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(PackageFragment packageFragment) {
                    return newBuilder().mergeFrom(packageFragment);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Property extends ExtendableMessage<Property> implements PropertyOrBuilder {
                public static Parser<Property> PARSER = new C185001();
                private static final Property defaultInstance = new Property(true);
                private int bitField0_;
                private int flags_;
                private int getterFlags_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int name_;
                private int oldFlags_;
                private int receiverTypeId_;
                private Type receiverType_;
                private int returnTypeId_;
                private Type returnType_;
                private int setterFlags_;
                private ValueParameter setterValueParameter_;
                private List<TypeParameter> typeParameter_;
                private final ByteString unknownFields;
                private int versionRequirement_;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1 */
                static class C185001 extends AbstractParser<Property> {
                    C185001() {
                    }

                    public Property parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Property(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
                    private int bitField0_;
                    private int flags_ = 518;
                    private int getterFlags_;
                    private int name_;
                    private int oldFlags_ = 2054;
                    private int receiverTypeId_;
                    private Type receiverType_ = Type.getDefaultInstance();
                    private int returnTypeId_;
                    private Type returnType_ = Type.getDefaultInstance();
                    private int setterFlags_;
                    private ValueParameter setterValueParameter_ = ValueParameter.getDefaultInstance();
                    private List<TypeParameter> typeParameter_ = Collections.emptyList();
                    private int versionRequirement_;

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

                    public Property getDefaultInstanceForType() {
                        return Property.getDefaultInstance();
                    }

                    public Property build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Property buildPartial() {
                        Property property = new Property((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        property.flags_ = this.flags_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        property.oldFlags_ = this.oldFlags_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        property.name_ = this.name_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        property.returnType_ = this.returnType_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        property.returnTypeId_ = this.returnTypeId_;
                        if ((this.bitField0_ & 32) == 32) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                            this.bitField0_ &= -33;
                        }
                        property.typeParameter_ = this.typeParameter_;
                        if ((i & 64) == 64) {
                            i2 |= 32;
                        }
                        property.receiverType_ = this.receiverType_;
                        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            i2 |= 64;
                        }
                        property.receiverTypeId_ = this.receiverTypeId_;
                        if ((i & 256) == 256) {
                            i2 |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        }
                        property.setterValueParameter_ = this.setterValueParameter_;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        property.getterFlags_ = this.getterFlags_;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        property.setterFlags_ = this.setterFlags_;
                        if ((i & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                            i2 |= 1024;
                        }
                        property.versionRequirement_ = this.versionRequirement_;
                        property.bitField0_ = i2;
                        return property;
                    }

                    public Builder mergeFrom(Property property) {
                        if (property == Property.getDefaultInstance()) {
                            return this;
                        }
                        if (property.hasFlags()) {
                            setFlags(property.getFlags());
                        }
                        if (property.hasOldFlags()) {
                            setOldFlags(property.getOldFlags());
                        }
                        if (property.hasName()) {
                            setName(property.getName());
                        }
                        if (property.hasReturnType()) {
                            mergeReturnType(property.getReturnType());
                        }
                        if (property.hasReturnTypeId()) {
                            setReturnTypeId(property.getReturnTypeId());
                        }
                        if (!property.typeParameter_.isEmpty()) {
                            if (this.typeParameter_.isEmpty()) {
                                this.typeParameter_ = property.typeParameter_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureTypeParameterIsMutable();
                                this.typeParameter_.addAll(property.typeParameter_);
                            }
                        }
                        if (property.hasReceiverType()) {
                            mergeReceiverType(property.getReceiverType());
                        }
                        if (property.hasReceiverTypeId()) {
                            setReceiverTypeId(property.getReceiverTypeId());
                        }
                        if (property.hasSetterValueParameter()) {
                            mergeSetterValueParameter(property.getSetterValueParameter());
                        }
                        if (property.hasGetterFlags()) {
                            setGetterFlags(property.getGetterFlags());
                        }
                        if (property.hasSetterFlags()) {
                            setSetterFlags(property.getSetterFlags());
                        }
                        if (property.hasVersionRequirement()) {
                            setVersionRequirement(property.getVersionRequirement());
                        }
                        mergeExtensionFields(property);
                        setUnknownFields(getUnknownFields().concat(property.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (!hasName()) {
                            return false;
                        }
                        if (hasReturnType() && !getReturnType().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getTypeParameterCount(); i++) {
                            if (!getTypeParameter(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (hasReceiverType() && !getReceiverType().isInitialized()) {
                            return false;
                        }
                        if ((!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Property property;
                        Property property2 = null;
                        try {
                            Property property3 = (Property) Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (property3 != null) {
                                mergeFrom(property3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            property = (Property) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            property2 = property;
                        }
                        if (property2 != null) {
                            mergeFrom(property2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1;
                        this.flags_ = i;
                        return this;
                    }

                    public Builder setOldFlags(int i) {
                        this.bitField0_ |= 2;
                        this.oldFlags_ = i;
                        return this;
                    }

                    public boolean hasName() {
                        return (this.bitField0_ & 4) == 4;
                    }

                    public Builder setName(int i) {
                        this.bitField0_ |= 4;
                        this.name_ = i;
                        return this;
                    }

                    public boolean hasReturnType() {
                        return (this.bitField0_ & 8) == 8;
                    }

                    public Type getReturnType() {
                        return this.returnType_;
                    }

                    public Builder mergeReturnType(Type type) {
                        if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                            this.returnType_ = type;
                        } else {
                            this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 8;
                        return this;
                    }

                    public Builder setReturnTypeId(int i) {
                        this.bitField0_ |= 16;
                        this.returnTypeId_ = i;
                        return this;
                    }

                    private void ensureTypeParameterIsMutable() {
                        if ((this.bitField0_ & 32) != 32) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 32;
                        }
                    }

                    public int getTypeParameterCount() {
                        return this.typeParameter_.size();
                    }

                    public TypeParameter getTypeParameter(int i) {
                        return (TypeParameter) this.typeParameter_.get(i);
                    }

                    public boolean hasReceiverType() {
                        return (this.bitField0_ & 64) == 64;
                    }

                    public Type getReceiverType() {
                        return this.receiverType_;
                    }

                    public Builder mergeReceiverType(Type type) {
                        if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                            this.receiverType_ = type;
                        } else {
                            this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 64;
                        return this;
                    }

                    public Builder setReceiverTypeId(int i) {
                        this.bitField0_ |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        this.receiverTypeId_ = i;
                        return this;
                    }

                    public boolean hasSetterValueParameter() {
                        return (this.bitField0_ & 256) == 256;
                    }

                    public ValueParameter getSetterValueParameter() {
                        return this.setterValueParameter_;
                    }

                    public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                        if ((this.bitField0_ & 256) != 256 || this.setterValueParameter_ == ValueParameter.getDefaultInstance()) {
                            this.setterValueParameter_ = valueParameter;
                        } else {
                            this.setterValueParameter_ = ValueParameter.newBuilder(this.setterValueParameter_).mergeFrom(valueParameter).buildPartial();
                        }
                        this.bitField0_ |= 256;
                        return this;
                    }

                    public Builder setGetterFlags(int i) {
                        this.bitField0_ |= 512;
                        this.getterFlags_ = i;
                        return this;
                    }

                    public Builder setSetterFlags(int i) {
                        this.bitField0_ |= 1024;
                        this.setterFlags_ = i;
                        return this;
                    }

                    public Builder setVersionRequirement(int i) {
                        this.bitField0_ |= ItemAnimator.FLAG_MOVED;
                        this.versionRequirement_ = i;
                        return this;
                    }
                }

                private Property(ExtendableBuilder<Property, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private Property(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Property getDefaultInstance() {
                    return defaultInstance;
                }

                public Property getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Property(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r9 = this;
                    r9.<init>();
                    r0 = -1;
                    r9.memoizedIsInitialized = r0;
                    r9.memoizedSerializedSize = r0;
                    r9.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 32;
                    if (r3 != 0) goto L_0x0169;
                L_0x001a:
                    r6 = r10.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    switch(r6) {
                        case 0: goto L_0x012a;
                        case 8: goto L_0x011c;
                        case 16: goto L_0x010e;
                        case 26: goto L_0x00e3;
                        case 34: goto L_0x00c9;
                        case 42: goto L_0x00a0;
                        case 50: goto L_0x0075;
                        case 56: goto L_0x0068;
                        case 64: goto L_0x005b;
                        case 72: goto L_0x004e;
                        case 80: goto L_0x0041;
                        case 88: goto L_0x0035;
                        case 248: goto L_0x0028;
                        default: goto L_0x0022;
                    };	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0022:
                    r6 = r9.parseUnknownField(r10, r2, r11, r6);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x012d;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0028:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | 1024;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.versionRequirement_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0035:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.flags_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0041:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.receiverTypeId_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x004e:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.returnTypeId_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x005b:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | 512;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.setterFlags_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0068:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | 256;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.getterFlags_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0075:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 & r8;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    if (r6 != r8) goto L_0x0082;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x007c:
                    r6 = r9.setterValueParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0082:
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readMessage(r6, r11);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.setterValueParameter_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    if (r7 == 0) goto L_0x0099;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x008e:
                    r6 = r9.setterValueParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7.mergeFrom(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r7.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.setterValueParameter_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0099:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00a0:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 & r5;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    if (r6 != r5) goto L_0x00ab;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00a5:
                    r6 = r9.receiverType_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00ab:
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readMessage(r6, r11);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.receiverType_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    if (r7 == 0) goto L_0x00c2;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00b7:
                    r6 = r9.receiverType_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7.mergeFrom(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r7.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.receiverType_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00c2:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00c9:
                    r6 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    if (r6 == r5) goto L_0x00d6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00cd:
                    r6 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.typeParameter_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00d6:
                    r6 = r9.typeParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7 = r10.readMessage(r7, r11);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6.add(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00e3:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r8 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 & r8;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    if (r6 != r8) goto L_0x00f0;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00ea:
                    r6 = r9.returnType_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7 = r6.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00f0:
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readMessage(r6, r11);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.returnType_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    if (r7 == 0) goto L_0x0107;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x00fc:
                    r6 = r9.returnType_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r7.mergeFrom(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r7.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.returnType_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x0107:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x010e:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.name_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                L_0x011c:
                    r6 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r6 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.bitField0_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r6 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    r9.oldFlags_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0141, IOException -> 0x0132 }
                    goto L_0x0016;
                L_0x012a:
                    r3 = 1;
                    goto L_0x0016;
                L_0x012d:
                    if (r6 != 0) goto L_0x0016;
                L_0x012f:
                    goto L_0x012a;
                L_0x0130:
                    r10 = move-exception;
                    goto L_0x0147;
                L_0x0132:
                    r10 = move-exception;
                    r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0130 }
                    r10 = r10.getMessage();	 Catch:{ all -> 0x0130 }
                    r11.<init>(r10);	 Catch:{ all -> 0x0130 }
                    r10 = r11.setUnfinishedMessage(r9);	 Catch:{ all -> 0x0130 }
                    throw r10;	 Catch:{ all -> 0x0130 }
                L_0x0141:
                    r10 = move-exception;	 Catch:{ all -> 0x0130 }
                    r10 = r10.setUnfinishedMessage(r9);	 Catch:{ all -> 0x0130 }
                    throw r10;	 Catch:{ all -> 0x0130 }
                L_0x0147:
                    r11 = r4 & 32;
                    if (r11 != r5) goto L_0x0153;
                L_0x014b:
                    r11 = r9.typeParameter_;
                    r11 = java.util.Collections.unmodifiableList(r11);
                    r9.typeParameter_ = r11;
                L_0x0153:
                    r2.flush();	 Catch:{ IOException -> 0x0156, all -> 0x015d }
                L_0x0156:
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    goto L_0x0165;
                L_0x015d:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x0165:
                    r9.makeExtensionsImmutable();
                    throw r10;
                L_0x0169:
                    r10 = r4 & 32;
                    if (r10 != r5) goto L_0x0175;
                L_0x016d:
                    r10 = r9.typeParameter_;
                    r10 = java.util.Collections.unmodifiableList(r10);
                    r9.typeParameter_ = r10;
                L_0x0175:
                    r2.flush();	 Catch:{ IOException -> 0x0178, all -> 0x017f }
                L_0x0178:
                    r10 = r0.toByteString();
                    r9.unknownFields = r10;
                    goto L_0x0187;
                L_0x017f:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x0187:
                    r9.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Property> getParserForType() {
                    return PARSER;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public boolean hasOldFlags() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getOldFlags() {
                    return this.oldFlags_;
                }

                public boolean hasName() {
                    return (this.bitField0_ & 4) == 4;
                }

                public int getName() {
                    return this.name_;
                }

                public boolean hasReturnType() {
                    return (this.bitField0_ & 8) == 8;
                }

                public Type getReturnType() {
                    return this.returnType_;
                }

                public boolean hasReturnTypeId() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int getReturnTypeId() {
                    return this.returnTypeId_;
                }

                public List<TypeParameter> getTypeParameterList() {
                    return this.typeParameter_;
                }

                public int getTypeParameterCount() {
                    return this.typeParameter_.size();
                }

                public TypeParameter getTypeParameter(int i) {
                    return (TypeParameter) this.typeParameter_.get(i);
                }

                public boolean hasReceiverType() {
                    return (this.bitField0_ & 32) == 32;
                }

                public Type getReceiverType() {
                    return this.receiverType_;
                }

                public boolean hasReceiverTypeId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public int getReceiverTypeId() {
                    return this.receiverTypeId_;
                }

                public boolean hasSetterValueParameter() {
                    return (this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                }

                public ValueParameter getSetterValueParameter() {
                    return this.setterValueParameter_;
                }

                public boolean hasGetterFlags() {
                    return (this.bitField0_ & 256) == 256;
                }

                public int getGetterFlags() {
                    return this.getterFlags_;
                }

                public boolean hasSetterFlags() {
                    return (this.bitField0_ & 512) == 512;
                }

                public int getSetterFlags() {
                    return this.setterFlags_;
                }

                public boolean hasVersionRequirement() {
                    return (this.bitField0_ & 1024) == 1024;
                }

                public int getVersionRequirement() {
                    return this.versionRequirement_;
                }

                private void initFields() {
                    this.flags_ = 518;
                    this.oldFlags_ = 2054;
                    this.name_ = 0;
                    this.returnType_ = Type.getDefaultInstance();
                    this.returnTypeId_ = 0;
                    this.typeParameter_ = Collections.emptyList();
                    this.receiverType_ = Type.getDefaultInstance();
                    this.receiverTypeId_ = 0;
                    this.setterValueParameter_ = ValueParameter.getDefaultInstance();
                    this.getterFlags_ = 0;
                    this.setterFlags_ = 0;
                    this.versionRequirement_ = 0;
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (!hasName()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (!hasReturnType() || getReturnType().isInitialized()) {
                        int i = 0;
                        while (i < getTypeParameterCount()) {
                            if (getTypeParameter(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        if (hasReceiverType() && !getReceiverType().isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        } else if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        } else if (extensionsAreInitialized()) {
                            this.memoizedIsInitialized = (byte) 1;
                            return true;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(1, this.oldFlags_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeInt32(2, this.name_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeMessage(3, this.returnType_);
                    }
                    for (int i = 0; i < this.typeParameter_.size(); i++) {
                        codedOutputStream.writeMessage(4, (MessageLite) this.typeParameter_.get(i));
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeMessage(5, this.receiverType_);
                    }
                    if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        codedOutputStream.writeMessage(6, this.setterValueParameter_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.writeInt32(7, this.getterFlags_);
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.writeInt32(8, this.setterFlags_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(9, this.returnTypeId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(10, this.receiverTypeId_);
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(11, this.flags_);
                    }
                    if ((this.bitField0_ & 1024) == 1024) {
                        codedOutputStream.writeInt32(31, this.versionRequirement_);
                    }
                    newExtensionWriter.writeUntil(19000, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0 : 0;
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeInt32Size(2, this.name_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeMessageSize(3, this.returnType_);
                    }
                    while (i2 < this.typeParameter_.size()) {
                        i += CodedOutputStream.computeMessageSize(4, (MessageLite) this.typeParameter_.get(i2));
                        i2++;
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i += CodedOutputStream.computeMessageSize(5, this.receiverType_);
                    }
                    if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        i += CodedOutputStream.computeMessageSize(6, this.setterValueParameter_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        i += CodedOutputStream.computeInt32Size(7, this.getterFlags_);
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        i += CodedOutputStream.computeInt32Size(8, this.setterFlags_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i += CodedOutputStream.computeInt32Size(9, this.returnTypeId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        i += CodedOutputStream.computeInt32Size(10, this.receiverTypeId_);
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        i += CodedOutputStream.computeInt32Size(11, this.flags_);
                    }
                    if ((this.bitField0_ & 1024) == 1024) {
                        i += CodedOutputStream.computeInt32Size(31, this.versionRequirement_);
                    }
                    i = (i + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i;
                    return i;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Property property) {
                    return newBuilder().mergeFrom(property);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class Type extends ExtendableMessage<Type> implements TypeOrBuilder {
                public static Parser<Type> PARSER = new C185041();
                private static final Type defaultInstance = new Type(true);
                private int abbreviatedTypeId_;
                private Type abbreviatedType_;
                private List<Argument> argument_;
                private int bitField0_;
                private int className_;
                private int flags_;
                private int flexibleTypeCapabilitiesId_;
                private int flexibleUpperBoundId_;
                private Type flexibleUpperBound_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private boolean nullable_;
                private int outerTypeId_;
                private Type outerType_;
                private int typeAliasName_;
                private int typeParameterName_;
                private int typeParameter_;
                private final ByteString unknownFields;

                public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
                }

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1 */
                static class C185041 extends AbstractParser<Type> {
                    C185041() {
                    }

                    public Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Type(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
                    public static Parser<Argument> PARSER = new C185051();
                    private static final Argument defaultInstance = new Argument(true);
                    private int bitField0_;
                    private byte memoizedIsInitialized;
                    private int memoizedSerializedSize;
                    private Projection projection_;
                    private int typeId_;
                    private Type type_;
                    private final ByteString unknownFields;

                    public enum Projection implements EnumLite {
                        IN(0, 0),
                        OUT(1, 1),
                        INV(2, 2),
                        STAR(3, 3);
                        
                        private static EnumLiteMap<Projection> internalValueMap;
                        private final int value;

                        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$1 */
                        static class C175991 implements EnumLiteMap<Projection> {
                            C175991() {
                            }

                            public Projection findValueByNumber(int i) {
                                return Projection.valueOf(i);
                            }
                        }

                        static {
                            internalValueMap = new C175991();
                        }

                        public final int getNumber() {
                            return this.value;
                        }

                        public static Projection valueOf(int i) {
                            switch (i) {
                                case 0:
                                    return IN;
                                case 1:
                                    return OUT;
                                case 2:
                                    return INV;
                                case 3:
                                    return STAR;
                                default:
                                    return 0;
                            }
                        }

                        private Projection(int i, int i2) {
                            this.value = i2;
                        }
                    }

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1 */
                    static class C185051 extends AbstractParser<Argument> {
                        C185051() {
                        }

                        public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new Argument(codedInputStream, extensionRegistryLite);
                        }
                    }

                    public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                        private int bitField0_;
                        private Projection projection_ = Projection.INV;
                        private int typeId_;
                        private Type type_ = Type.getDefaultInstance();

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

                        public Argument getDefaultInstanceForType() {
                            return Argument.getDefaultInstance();
                        }

                        public Argument build() {
                            Object buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                        }

                        public Argument buildPartial() {
                            Argument argument = new Argument((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                            int i = this.bitField0_;
                            int i2 = 1;
                            if ((i & 1) != 1) {
                                i2 = 0;
                            }
                            argument.projection_ = this.projection_;
                            if ((i & 2) == 2) {
                                i2 |= 2;
                            }
                            argument.type_ = this.type_;
                            if ((i & 4) == 4) {
                                i2 |= 4;
                            }
                            argument.typeId_ = this.typeId_;
                            argument.bitField0_ = i2;
                            return argument;
                        }

                        public Builder mergeFrom(Argument argument) {
                            if (argument == Argument.getDefaultInstance()) {
                                return this;
                            }
                            if (argument.hasProjection()) {
                                setProjection(argument.getProjection());
                            }
                            if (argument.hasType()) {
                                mergeType(argument.getType());
                            }
                            if (argument.hasTypeId()) {
                                setTypeId(argument.getTypeId());
                            }
                            setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                            return this;
                        }

                        public final boolean isInitialized() {
                            return !hasType() || getType().isInitialized();
                        }

                        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            Argument argument;
                            Argument argument2 = null;
                            try {
                                Argument argument3 = (Argument) Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (argument3 != null) {
                                    mergeFrom(argument3);
                                }
                                return this;
                            } catch (CodedInputStream codedInputStream2) {
                                argument = (Argument) codedInputStream2.getUnfinishedMessage();
                                throw codedInputStream2;
                            } catch (Throwable th) {
                                codedInputStream2 = th;
                                argument2 = argument;
                            }
                            if (argument2 != null) {
                                mergeFrom(argument2);
                            }
                            throw codedInputStream2;
                        }

                        public Builder setProjection(Projection projection) {
                            if (projection == null) {
                                throw new NullPointerException();
                            }
                            this.bitField0_ |= 1;
                            this.projection_ = projection;
                            return this;
                        }

                        public boolean hasType() {
                            return (this.bitField0_ & 2) == 2;
                        }

                        public Type getType() {
                            return this.type_;
                        }

                        public Builder mergeType(Type type) {
                            if ((this.bitField0_ & 2) != 2 || this.type_ == Type.getDefaultInstance()) {
                                this.type_ = type;
                            } else {
                                this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                            }
                            this.bitField0_ |= 2;
                            return this;
                        }

                        public Builder setTypeId(int i) {
                            this.bitField0_ |= 4;
                            this.typeId_ = i;
                            return this;
                        }
                    }

                    private Argument(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                        super(builder);
                        this.memoizedIsInitialized = (byte) -1;
                        this.memoizedSerializedSize = -1;
                        this.unknownFields = builder.getUnknownFields();
                    }

                    private Argument(boolean z) {
                        this.memoizedIsInitialized = (byte) -1;
                        this.memoizedSerializedSize = -1;
                        this.unknownFields = ByteString.EMPTY;
                    }

                    public static Argument getDefaultInstance() {
                        return defaultInstance;
                    }

                    public Argument getDefaultInstanceForType() {
                        return defaultInstance;
                    }

                    private Argument(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
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
                        if (r3 != 0) goto L_0x00af;
                    L_0x0017:
                        r4 = r8.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r4 == 0) goto L_0x0080;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x001d:
                        r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r4 == r5) goto L_0x0067;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0021:
                        r5 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r4 == r5) goto L_0x003d;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0025:
                        r5 = 24;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r4 == r5) goto L_0x0030;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0029:
                        r4 = r7.parseUnknownField(r8, r2, r9, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x002f:
                        goto L_0x0080;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0030:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r4 = r8.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r7.typeId_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x003d:
                        r4 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r5 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r6 = 2;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r5 = r5 & r6;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r5 != r6) goto L_0x004a;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0044:
                        r4 = r7.type_;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r4 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x004a:
                        r5 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r5 = r8.readMessage(r5, r9);	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r5;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r7.type_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r4 == 0) goto L_0x0061;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0056:
                        r5 = r7.type_;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r4.mergeFrom(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r4 = r4.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r7.type_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0061:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r4 = r4 | r6;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0067:
                        r5 = r8.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.valueOf(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        if (r6 != 0) goto L_0x0078;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0071:
                        r2.writeRawVarint32(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r2.writeRawVarint32(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                    L_0x0078:
                        r4 = r7.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r7.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        r7.projection_ = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0093, IOException -> 0x0084 }
                        goto L_0x0015;
                    L_0x0080:
                        r3 = 1;
                        goto L_0x0015;
                    L_0x0082:
                        r8 = move-exception;
                        goto L_0x0099;
                    L_0x0084:
                        r8 = move-exception;
                        r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0082 }
                        r8 = r8.getMessage();	 Catch:{ all -> 0x0082 }
                        r9.<init>(r8);	 Catch:{ all -> 0x0082 }
                        r8 = r9.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0082 }
                        throw r8;	 Catch:{ all -> 0x0082 }
                    L_0x0093:
                        r8 = move-exception;	 Catch:{ all -> 0x0082 }
                        r8 = r8.setUnfinishedMessage(r7);	 Catch:{ all -> 0x0082 }
                        throw r8;	 Catch:{ all -> 0x0082 }
                    L_0x0099:
                        r2.flush();	 Catch:{ IOException -> 0x009c, all -> 0x00a3 }
                    L_0x009c:
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        goto L_0x00ab;
                    L_0x00a3:
                        r8 = move-exception;
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        throw r8;
                    L_0x00ab:
                        r7.makeExtensionsImmutable();
                        throw r8;
                    L_0x00af:
                        r2.flush();	 Catch:{ IOException -> 0x00b2, all -> 0x00b9 }
                    L_0x00b2:
                        r8 = r0.toByteString();
                        r7.unknownFields = r8;
                        goto L_0x00c1;
                    L_0x00b9:
                        r8 = move-exception;
                        r9 = r0.toByteString();
                        r7.unknownFields = r9;
                        throw r8;
                    L_0x00c1:
                        r7.makeExtensionsImmutable();
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                    }

                    static {
                        defaultInstance.initFields();
                    }

                    public Parser<Argument> getParserForType() {
                        return PARSER;
                    }

                    public boolean hasProjection() {
                        return (this.bitField0_ & 1) == 1;
                    }

                    public Projection getProjection() {
                        return this.projection_;
                    }

                    public boolean hasType() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public Type getType() {
                        return this.type_;
                    }

                    public boolean hasTypeId() {
                        return (this.bitField0_ & 4) == 4;
                    }

                    public int getTypeId() {
                        return this.typeId_;
                    }

                    private void initFields() {
                        this.projection_ = Projection.INV;
                        this.type_ = Type.getDefaultInstance();
                        this.typeId_ = 0;
                    }

                    public final boolean isInitialized() {
                        byte b = this.memoizedIsInitialized;
                        if (b == (byte) 1) {
                            return true;
                        }
                        if (b == (byte) 0) {
                            return false;
                        }
                        if (!hasType() || getType().isInitialized()) {
                            this.memoizedIsInitialized = (byte) 1;
                            return true;
                        }
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }

                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        getSerializedSize();
                        if ((this.bitField0_ & 1) == 1) {
                            codedOutputStream.writeEnum(1, this.projection_.getNumber());
                        }
                        if ((this.bitField0_ & 2) == 2) {
                            codedOutputStream.writeMessage(2, this.type_);
                        }
                        if ((this.bitField0_ & 4) == 4) {
                            codedOutputStream.writeInt32(3, this.typeId_);
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
                            i = 0 + CodedOutputStream.computeEnumSize(1, this.projection_.getNumber());
                        }
                        if ((this.bitField0_ & 2) == 2) {
                            i += CodedOutputStream.computeMessageSize(2, this.type_);
                        }
                        if ((this.bitField0_ & 4) == 4) {
                            i += CodedOutputStream.computeInt32Size(3, this.typeId_);
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

                    public static Builder newBuilder(Argument argument) {
                        return newBuilder().mergeFrom(argument);
                    }

                    public Builder toBuilder() {
                        return newBuilder(this);
                    }
                }

                public static final class Builder extends ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
                    private int abbreviatedTypeId_;
                    private Type abbreviatedType_ = Type.getDefaultInstance();
                    private List<Argument> argument_ = Collections.emptyList();
                    private int bitField0_;
                    private int className_;
                    private int flags_;
                    private int flexibleTypeCapabilitiesId_;
                    private int flexibleUpperBoundId_;
                    private Type flexibleUpperBound_ = Type.getDefaultInstance();
                    private boolean nullable_;
                    private int outerTypeId_;
                    private Type outerType_ = Type.getDefaultInstance();
                    private int typeAliasName_;
                    private int typeParameterName_;
                    private int typeParameter_;

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

                    public Type getDefaultInstanceForType() {
                        return Type.getDefaultInstance();
                    }

                    public Type build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public Type buildPartial() {
                        Type type = new Type((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((this.bitField0_ & 1) == 1) {
                            this.argument_ = Collections.unmodifiableList(this.argument_);
                            this.bitField0_ &= -2;
                        }
                        type.argument_ = this.argument_;
                        if ((i & 2) != 2) {
                            i2 = 0;
                        }
                        type.nullable_ = this.nullable_;
                        if ((i & 4) == 4) {
                            i2 |= 2;
                        }
                        type.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
                        if ((i & 8) == 8) {
                            i2 |= 4;
                        }
                        type.flexibleUpperBound_ = this.flexibleUpperBound_;
                        if ((i & 16) == 16) {
                            i2 |= 8;
                        }
                        type.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
                        if ((i & 32) == 32) {
                            i2 |= 16;
                        }
                        type.className_ = this.className_;
                        if ((i & 64) == 64) {
                            i2 |= 32;
                        }
                        type.typeParameter_ = this.typeParameter_;
                        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            i2 |= 64;
                        }
                        type.typeParameterName_ = this.typeParameterName_;
                        if ((i & 256) == 256) {
                            i2 |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        }
                        type.typeAliasName_ = this.typeAliasName_;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        type.outerType_ = this.outerType_;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        type.outerTypeId_ = this.outerTypeId_;
                        if ((i & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                            i2 |= 1024;
                        }
                        type.abbreviatedType_ = this.abbreviatedType_;
                        if ((i & 4096) == 4096) {
                            i2 |= ItemAnimator.FLAG_MOVED;
                        }
                        type.abbreviatedTypeId_ = this.abbreviatedTypeId_;
                        if ((i & 8192) == 8192) {
                            i2 |= 4096;
                        }
                        type.flags_ = this.flags_;
                        type.bitField0_ = i2;
                        return type;
                    }

                    public Builder mergeFrom(Type type) {
                        if (type == Type.getDefaultInstance()) {
                            return this;
                        }
                        if (!type.argument_.isEmpty()) {
                            if (this.argument_.isEmpty()) {
                                this.argument_ = type.argument_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureArgumentIsMutable();
                                this.argument_.addAll(type.argument_);
                            }
                        }
                        if (type.hasNullable()) {
                            setNullable(type.getNullable());
                        }
                        if (type.hasFlexibleTypeCapabilitiesId()) {
                            setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                        }
                        if (type.hasFlexibleUpperBound()) {
                            mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                        }
                        if (type.hasFlexibleUpperBoundId()) {
                            setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                        }
                        if (type.hasClassName()) {
                            setClassName(type.getClassName());
                        }
                        if (type.hasTypeParameter()) {
                            setTypeParameter(type.getTypeParameter());
                        }
                        if (type.hasTypeParameterName()) {
                            setTypeParameterName(type.getTypeParameterName());
                        }
                        if (type.hasTypeAliasName()) {
                            setTypeAliasName(type.getTypeAliasName());
                        }
                        if (type.hasOuterType()) {
                            mergeOuterType(type.getOuterType());
                        }
                        if (type.hasOuterTypeId()) {
                            setOuterTypeId(type.getOuterTypeId());
                        }
                        if (type.hasAbbreviatedType()) {
                            mergeAbbreviatedType(type.getAbbreviatedType());
                        }
                        if (type.hasAbbreviatedTypeId()) {
                            setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                        }
                        if (type.hasFlags()) {
                            setFlags(type.getFlags());
                        }
                        mergeExtensionFields(type);
                        setUnknownFields(getUnknownFields().concat(type.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        for (int i = 0; i < getArgumentCount(); i++) {
                            if (!getArgument(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                            return false;
                        }
                        if (hasOuterType() && !getOuterType().isInitialized()) {
                            return false;
                        }
                        if ((!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Type type;
                        Type type2 = null;
                        try {
                            Type type3 = (Type) Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (type3 != null) {
                                mergeFrom(type3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            type = (Type) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            type2 = type;
                        }
                        if (type2 != null) {
                            mergeFrom(type2);
                        }
                        throw codedInputStream2;
                    }

                    private void ensureArgumentIsMutable() {
                        if ((this.bitField0_ & 1) != 1) {
                            this.argument_ = new ArrayList(this.argument_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public int getArgumentCount() {
                        return this.argument_.size();
                    }

                    public Argument getArgument(int i) {
                        return (Argument) this.argument_.get(i);
                    }

                    public Builder setNullable(boolean z) {
                        this.bitField0_ |= 2;
                        this.nullable_ = z;
                        return this;
                    }

                    public Builder setFlexibleTypeCapabilitiesId(int i) {
                        this.bitField0_ |= 4;
                        this.flexibleTypeCapabilitiesId_ = i;
                        return this;
                    }

                    public boolean hasFlexibleUpperBound() {
                        return (this.bitField0_ & 8) == 8;
                    }

                    public Type getFlexibleUpperBound() {
                        return this.flexibleUpperBound_;
                    }

                    public Builder mergeFlexibleUpperBound(Type type) {
                        if ((this.bitField0_ & 8) != 8 || this.flexibleUpperBound_ == Type.getDefaultInstance()) {
                            this.flexibleUpperBound_ = type;
                        } else {
                            this.flexibleUpperBound_ = Type.newBuilder(this.flexibleUpperBound_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 8;
                        return this;
                    }

                    public Builder setFlexibleUpperBoundId(int i) {
                        this.bitField0_ |= 16;
                        this.flexibleUpperBoundId_ = i;
                        return this;
                    }

                    public Builder setClassName(int i) {
                        this.bitField0_ |= 32;
                        this.className_ = i;
                        return this;
                    }

                    public Builder setTypeParameter(int i) {
                        this.bitField0_ |= 64;
                        this.typeParameter_ = i;
                        return this;
                    }

                    public Builder setTypeParameterName(int i) {
                        this.bitField0_ |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        this.typeParameterName_ = i;
                        return this;
                    }

                    public Builder setTypeAliasName(int i) {
                        this.bitField0_ |= 256;
                        this.typeAliasName_ = i;
                        return this;
                    }

                    public boolean hasOuterType() {
                        return (this.bitField0_ & 512) == 512;
                    }

                    public Type getOuterType() {
                        return this.outerType_;
                    }

                    public Builder mergeOuterType(Type type) {
                        if ((this.bitField0_ & 512) != 512 || this.outerType_ == Type.getDefaultInstance()) {
                            this.outerType_ = type;
                        } else {
                            this.outerType_ = Type.newBuilder(this.outerType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 512;
                        return this;
                    }

                    public Builder setOuterTypeId(int i) {
                        this.bitField0_ |= 1024;
                        this.outerTypeId_ = i;
                        return this;
                    }

                    public boolean hasAbbreviatedType() {
                        return (this.bitField0_ & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED;
                    }

                    public Type getAbbreviatedType() {
                        return this.abbreviatedType_;
                    }

                    public Builder mergeAbbreviatedType(Type type) {
                        if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) != ItemAnimator.FLAG_MOVED || this.abbreviatedType_ == Type.getDefaultInstance()) {
                            this.abbreviatedType_ = type;
                        } else {
                            this.abbreviatedType_ = Type.newBuilder(this.abbreviatedType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 2048;
                        return this;
                    }

                    public Builder setAbbreviatedTypeId(int i) {
                        this.bitField0_ |= 4096;
                        this.abbreviatedTypeId_ = i;
                        return this;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 8192;
                        this.flags_ = i;
                        return this;
                    }
                }

                private Type(ExtendableBuilder<Type, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private Type(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static Type getDefaultInstance() {
                    return defaultInstance;
                }

                public Type getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private Type(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r9, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r10) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r8 = this;
                    r8.<init>();
                    r0 = -1;
                    r8.memoizedIsInitialized = r0;
                    r8.memoizedSerializedSize = r0;
                    r8.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    if (r3 != 0) goto L_0x0186;
                L_0x0018:
                    r5 = r9.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    switch(r5) {
                        case 0: goto L_0x0147;
                        case 8: goto L_0x0139;
                        case 18: goto L_0x011f;
                        case 24: goto L_0x0112;
                        case 32: goto L_0x0104;
                        case 42: goto L_0x00da;
                        case 48: goto L_0x00cc;
                        case 56: goto L_0x00be;
                        case 64: goto L_0x00b0;
                        case 72: goto L_0x00a2;
                        case 82: goto L_0x0077;
                        case 88: goto L_0x006a;
                        case 96: goto L_0x005d;
                        case 106: goto L_0x0033;
                        case 112: goto L_0x0026;
                        default: goto L_0x0020;
                    };	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0020:
                    r5 = r8.parseUnknownField(r9, r2, r10, r5);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x014a;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0026:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 2048;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.abbreviatedTypeId_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0033:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r7 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 & r7;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    if (r5 != r7) goto L_0x0040;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x003a:
                    r5 = r8.abbreviatedType_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6 = r5.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0040:
                    r5 = PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.abbreviatedType_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    if (r6 == 0) goto L_0x0057;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x004c:
                    r5 = r8.abbreviatedType_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6.mergeFrom(r5);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.abbreviatedType_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0057:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x005d:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 128;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.typeAliasName_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x006a:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 512;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.outerTypeId_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0077:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r7 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 & r7;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    if (r5 != r7) goto L_0x0084;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x007e:
                    r5 = r8.outerType_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6 = r5.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0084:
                    r5 = PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.outerType_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    if (r6 == 0) goto L_0x009b;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0090:
                    r5 = r8.outerType_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6.mergeFrom(r5);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.outerType_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x009b:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00a2:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.typeParameterName_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00b0:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 8;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.flexibleUpperBoundId_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00be:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.typeParameter_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00cc:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.className_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00da:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r7 = 4;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 & r7;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    if (r5 != r7) goto L_0x00e6;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00e0:
                    r5 = r8.flexibleUpperBound_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6 = r5.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00e6:
                    r5 = PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readMessage(r5, r10);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.flexibleUpperBound_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    if (r6 == 0) goto L_0x00fd;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00f2:
                    r5 = r8.flexibleUpperBound_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6.mergeFrom(r5);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r6.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.flexibleUpperBound_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x00fd:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | r7;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0104:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.flexibleTypeCapabilitiesId_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0112:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.nullable_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x011f:
                    r5 = r4 & 1;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    if (r5 == r1) goto L_0x012c;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0123:
                    r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.argument_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r4 = r4 | 1;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x012c:
                    r5 = r8.argument_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r6 = r9.readMessage(r6, r10);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5.add(r6);	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                L_0x0139:
                    r5 = r8.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r5 | 4096;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.bitField0_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r5 = r9.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    r8.flags_ = r5;	 Catch:{ InvalidProtocolBufferException -> 0x015e, IOException -> 0x014f }
                    goto L_0x0016;
                L_0x0147:
                    r3 = 1;
                    goto L_0x0016;
                L_0x014a:
                    if (r5 != 0) goto L_0x0016;
                L_0x014c:
                    goto L_0x0147;
                L_0x014d:
                    r9 = move-exception;
                    goto L_0x0164;
                L_0x014f:
                    r9 = move-exception;
                    r10 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x014d }
                    r9 = r9.getMessage();	 Catch:{ all -> 0x014d }
                    r10.<init>(r9);	 Catch:{ all -> 0x014d }
                    r9 = r10.setUnfinishedMessage(r8);	 Catch:{ all -> 0x014d }
                    throw r9;	 Catch:{ all -> 0x014d }
                L_0x015e:
                    r9 = move-exception;	 Catch:{ all -> 0x014d }
                    r9 = r9.setUnfinishedMessage(r8);	 Catch:{ all -> 0x014d }
                    throw r9;	 Catch:{ all -> 0x014d }
                L_0x0164:
                    r10 = r4 & 1;
                    if (r10 != r1) goto L_0x0170;
                L_0x0168:
                    r10 = r8.argument_;
                    r10 = java.util.Collections.unmodifiableList(r10);
                    r8.argument_ = r10;
                L_0x0170:
                    r2.flush();	 Catch:{ IOException -> 0x0173, all -> 0x017a }
                L_0x0173:
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    goto L_0x0182;
                L_0x017a:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x0182:
                    r8.makeExtensionsImmutable();
                    throw r9;
                L_0x0186:
                    r9 = r4 & 1;
                    if (r9 != r1) goto L_0x0192;
                L_0x018a:
                    r9 = r8.argument_;
                    r9 = java.util.Collections.unmodifiableList(r9);
                    r8.argument_ = r9;
                L_0x0192:
                    r2.flush();	 Catch:{ IOException -> 0x0195, all -> 0x019c }
                L_0x0195:
                    r9 = r0.toByteString();
                    r8.unknownFields = r9;
                    goto L_0x01a4;
                L_0x019c:
                    r9 = move-exception;
                    r10 = r0.toByteString();
                    r8.unknownFields = r10;
                    throw r9;
                L_0x01a4:
                    r8.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<Type> getParserForType() {
                    return PARSER;
                }

                public List<Argument> getArgumentList() {
                    return this.argument_;
                }

                public int getArgumentCount() {
                    return this.argument_.size();
                }

                public Argument getArgument(int i) {
                    return (Argument) this.argument_.get(i);
                }

                public boolean hasNullable() {
                    return (this.bitField0_ & 1) == 1;
                }

                public boolean getNullable() {
                    return this.nullable_;
                }

                public boolean hasFlexibleTypeCapabilitiesId() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getFlexibleTypeCapabilitiesId() {
                    return this.flexibleTypeCapabilitiesId_;
                }

                public boolean hasFlexibleUpperBound() {
                    return (this.bitField0_ & 4) == 4;
                }

                public Type getFlexibleUpperBound() {
                    return this.flexibleUpperBound_;
                }

                public boolean hasFlexibleUpperBoundId() {
                    return (this.bitField0_ & 8) == 8;
                }

                public int getFlexibleUpperBoundId() {
                    return this.flexibleUpperBoundId_;
                }

                public boolean hasClassName() {
                    return (this.bitField0_ & 16) == 16;
                }

                public int getClassName() {
                    return this.className_;
                }

                public boolean hasTypeParameter() {
                    return (this.bitField0_ & 32) == 32;
                }

                public int getTypeParameter() {
                    return this.typeParameter_;
                }

                public boolean hasTypeParameterName() {
                    return (this.bitField0_ & 64) == 64;
                }

                public int getTypeParameterName() {
                    return this.typeParameterName_;
                }

                public boolean hasTypeAliasName() {
                    return (this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                }

                public int getTypeAliasName() {
                    return this.typeAliasName_;
                }

                public boolean hasOuterType() {
                    return (this.bitField0_ & 256) == 256;
                }

                public Type getOuterType() {
                    return this.outerType_;
                }

                public boolean hasOuterTypeId() {
                    return (this.bitField0_ & 512) == 512;
                }

                public int getOuterTypeId() {
                    return this.outerTypeId_;
                }

                public boolean hasAbbreviatedType() {
                    return (this.bitField0_ & 1024) == 1024;
                }

                public Type getAbbreviatedType() {
                    return this.abbreviatedType_;
                }

                public boolean hasAbbreviatedTypeId() {
                    return (this.bitField0_ & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED;
                }

                public int getAbbreviatedTypeId() {
                    return this.abbreviatedTypeId_;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 4096) == 4096;
                }

                public int getFlags() {
                    return this.flags_;
                }

                private void initFields() {
                    this.argument_ = Collections.emptyList();
                    this.nullable_ = false;
                    this.flexibleTypeCapabilitiesId_ = 0;
                    this.flexibleUpperBound_ = getDefaultInstance();
                    this.flexibleUpperBoundId_ = 0;
                    this.className_ = 0;
                    this.typeParameter_ = 0;
                    this.typeParameterName_ = 0;
                    this.typeAliasName_ = 0;
                    this.outerType_ = getDefaultInstance();
                    this.outerTypeId_ = 0;
                    this.abbreviatedType_ = getDefaultInstance();
                    this.abbreviatedTypeId_ = 0;
                    this.flags_ = 0;
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
                    while (i < getArgumentCount()) {
                        if (getArgument(i).isInitialized()) {
                            i++;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (hasOuterType() && !getOuterType().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (extensionsAreInitialized()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 4096) == 4096) {
                        codedOutputStream.writeInt32(1, this.flags_);
                    }
                    for (int i = 0; i < this.argument_.size(); i++) {
                        codedOutputStream.writeMessage(2, (MessageLite) this.argument_.get(i));
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeBool(3, this.nullable_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(4, this.flexibleTypeCapabilitiesId_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeMessage(5, this.flexibleUpperBound_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(6, this.className_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(7, this.typeParameter_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeInt32(8, this.flexibleUpperBoundId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(9, this.typeParameterName_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.writeMessage(10, this.outerType_);
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.writeInt32(11, this.outerTypeId_);
                    }
                    if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        codedOutputStream.writeInt32(12, this.typeAliasName_);
                    }
                    if ((this.bitField0_ & 1024) == 1024) {
                        codedOutputStream.writeMessage(13, this.abbreviatedType_);
                    }
                    if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                        codedOutputStream.writeInt32(14, this.abbreviatedTypeId_);
                    }
                    newExtensionWriter.writeUntil(Callback.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
                    while (i2 < this.argument_.size()) {
                        i += CodedOutputStream.computeMessageSize(2, (MessageLite) this.argument_.get(i2));
                        i2++;
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        i += CodedOutputStream.computeBoolSize(3, this.nullable_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(4, this.flexibleTypeCapabilitiesId_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeMessageSize(5, this.flexibleUpperBound_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i += CodedOutputStream.computeInt32Size(6, this.className_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i += CodedOutputStream.computeInt32Size(7, this.typeParameter_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeInt32Size(8, this.flexibleUpperBoundId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        i += CodedOutputStream.computeInt32Size(9, this.typeParameterName_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        i += CodedOutputStream.computeMessageSize(10, this.outerType_);
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        i += CodedOutputStream.computeInt32Size(11, this.outerTypeId_);
                    }
                    if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        i += CodedOutputStream.computeInt32Size(12, this.typeAliasName_);
                    }
                    if ((this.bitField0_ & 1024) == 1024) {
                        i += CodedOutputStream.computeMessageSize(13, this.abbreviatedType_);
                    }
                    if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                        i += CodedOutputStream.computeInt32Size(14, this.abbreviatedTypeId_);
                    }
                    i = (i + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i;
                    return i;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(Type type) {
                    return newBuilder().mergeFrom(type);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class TypeAlias extends ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
                public static Parser<TypeAlias> PARSER = new C185061();
                private static final TypeAlias defaultInstance = new TypeAlias(true);
                private List<Annotation> annotation_;
                private int bitField0_;
                private int expandedTypeId_;
                private Type expandedType_;
                private int flags_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int name_;
                private List<TypeParameter> typeParameter_;
                private int underlyingTypeId_;
                private Type underlyingType_;
                private final ByteString unknownFields;
                private int versionRequirement_;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1 */
                static class C185061 extends AbstractParser<TypeAlias> {
                    C185061() {
                    }

                    public TypeAlias parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new TypeAlias(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
                    private List<Annotation> annotation_ = Collections.emptyList();
                    private int bitField0_;
                    private int expandedTypeId_;
                    private Type expandedType_ = Type.getDefaultInstance();
                    private int flags_ = 6;
                    private int name_;
                    private List<TypeParameter> typeParameter_ = Collections.emptyList();
                    private int underlyingTypeId_;
                    private Type underlyingType_ = Type.getDefaultInstance();
                    private int versionRequirement_;

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

                    public TypeAlias getDefaultInstanceForType() {
                        return TypeAlias.getDefaultInstance();
                    }

                    public TypeAlias build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public TypeAlias buildPartial() {
                        TypeAlias typeAlias = new TypeAlias((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        typeAlias.flags_ = this.flags_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        typeAlias.name_ = this.name_;
                        if ((this.bitField0_ & 4) == 4) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                            this.bitField0_ &= -5;
                        }
                        typeAlias.typeParameter_ = this.typeParameter_;
                        if ((i & 8) == 8) {
                            i2 |= 4;
                        }
                        typeAlias.underlyingType_ = this.underlyingType_;
                        if ((i & 16) == 16) {
                            i2 |= 8;
                        }
                        typeAlias.underlyingTypeId_ = this.underlyingTypeId_;
                        if ((i & 32) == 32) {
                            i2 |= 16;
                        }
                        typeAlias.expandedType_ = this.expandedType_;
                        if ((i & 64) == 64) {
                            i2 |= 32;
                        }
                        typeAlias.expandedTypeId_ = this.expandedTypeId_;
                        if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                            this.bitField0_ &= -129;
                        }
                        typeAlias.annotation_ = this.annotation_;
                        if ((i & 256) == 256) {
                            i2 |= 64;
                        }
                        typeAlias.versionRequirement_ = this.versionRequirement_;
                        typeAlias.bitField0_ = i2;
                        return typeAlias;
                    }

                    public Builder mergeFrom(TypeAlias typeAlias) {
                        if (typeAlias == TypeAlias.getDefaultInstance()) {
                            return this;
                        }
                        if (typeAlias.hasFlags()) {
                            setFlags(typeAlias.getFlags());
                        }
                        if (typeAlias.hasName()) {
                            setName(typeAlias.getName());
                        }
                        if (!typeAlias.typeParameter_.isEmpty()) {
                            if (this.typeParameter_.isEmpty()) {
                                this.typeParameter_ = typeAlias.typeParameter_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureTypeParameterIsMutable();
                                this.typeParameter_.addAll(typeAlias.typeParameter_);
                            }
                        }
                        if (typeAlias.hasUnderlyingType()) {
                            mergeUnderlyingType(typeAlias.getUnderlyingType());
                        }
                        if (typeAlias.hasUnderlyingTypeId()) {
                            setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                        }
                        if (typeAlias.hasExpandedType()) {
                            mergeExpandedType(typeAlias.getExpandedType());
                        }
                        if (typeAlias.hasExpandedTypeId()) {
                            setExpandedTypeId(typeAlias.getExpandedTypeId());
                        }
                        if (!typeAlias.annotation_.isEmpty()) {
                            if (this.annotation_.isEmpty()) {
                                this.annotation_ = typeAlias.annotation_;
                                this.bitField0_ &= -129;
                            } else {
                                ensureAnnotationIsMutable();
                                this.annotation_.addAll(typeAlias.annotation_);
                            }
                        }
                        if (typeAlias.hasVersionRequirement()) {
                            setVersionRequirement(typeAlias.getVersionRequirement());
                        }
                        mergeExtensionFields(typeAlias);
                        setUnknownFields(getUnknownFields().concat(typeAlias.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (!hasName()) {
                            return false;
                        }
                        int i;
                        for (i = 0; i < getTypeParameterCount(); i++) {
                            if (!getTypeParameter(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                            return false;
                        }
                        if (hasExpandedType() && !getExpandedType().isInitialized()) {
                            return false;
                        }
                        for (i = 0; i < getAnnotationCount(); i++) {
                            if (!getAnnotation(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        TypeAlias typeAlias;
                        TypeAlias typeAlias2 = null;
                        try {
                            TypeAlias typeAlias3 = (TypeAlias) TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (typeAlias3 != null) {
                                mergeFrom(typeAlias3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            typeAlias = (TypeAlias) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            typeAlias2 = typeAlias;
                        }
                        if (typeAlias2 != null) {
                            mergeFrom(typeAlias2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1;
                        this.flags_ = i;
                        return this;
                    }

                    public boolean hasName() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public Builder setName(int i) {
                        this.bitField0_ |= 2;
                        this.name_ = i;
                        return this;
                    }

                    private void ensureTypeParameterIsMutable() {
                        if ((this.bitField0_ & 4) != 4) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 4;
                        }
                    }

                    public int getTypeParameterCount() {
                        return this.typeParameter_.size();
                    }

                    public TypeParameter getTypeParameter(int i) {
                        return (TypeParameter) this.typeParameter_.get(i);
                    }

                    public boolean hasUnderlyingType() {
                        return (this.bitField0_ & 8) == 8;
                    }

                    public Type getUnderlyingType() {
                        return this.underlyingType_;
                    }

                    public Builder mergeUnderlyingType(Type type) {
                        if ((this.bitField0_ & 8) != 8 || this.underlyingType_ == Type.getDefaultInstance()) {
                            this.underlyingType_ = type;
                        } else {
                            this.underlyingType_ = Type.newBuilder(this.underlyingType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 8;
                        return this;
                    }

                    public Builder setUnderlyingTypeId(int i) {
                        this.bitField0_ |= 16;
                        this.underlyingTypeId_ = i;
                        return this;
                    }

                    public boolean hasExpandedType() {
                        return (this.bitField0_ & 32) == 32;
                    }

                    public Type getExpandedType() {
                        return this.expandedType_;
                    }

                    public Builder mergeExpandedType(Type type) {
                        if ((this.bitField0_ & 32) != 32 || this.expandedType_ == Type.getDefaultInstance()) {
                            this.expandedType_ = type;
                        } else {
                            this.expandedType_ = Type.newBuilder(this.expandedType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 32;
                        return this;
                    }

                    public Builder setExpandedTypeId(int i) {
                        this.bitField0_ |= 64;
                        this.expandedTypeId_ = i;
                        return this;
                    }

                    private void ensureAnnotationIsMutable() {
                        if ((this.bitField0_ & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                        }
                    }

                    public int getAnnotationCount() {
                        return this.annotation_.size();
                    }

                    public Annotation getAnnotation(int i) {
                        return (Annotation) this.annotation_.get(i);
                    }

                    public Builder setVersionRequirement(int i) {
                        this.bitField0_ |= 256;
                        this.versionRequirement_ = i;
                        return this;
                    }
                }

                private TypeAlias(ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private TypeAlias(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static TypeAlias getDefaultInstance() {
                    return defaultInstance;
                }

                public TypeAlias getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private TypeAlias(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r13, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r14) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r12 = this;
                    r12.<init>();
                    r0 = -1;
                    r12.memoizedIsInitialized = r0;
                    r12.memoizedSerializedSize = r0;
                    r12.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0016:
                    r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
                    r6 = 4;
                    if (r3 != 0) goto L_0x015d;
                L_0x001b:
                    r7 = r13.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == 0) goto L_0x0115;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0021:
                    r8 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r8) goto L_0x0108;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0025:
                    r9 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r9) goto L_0x00fa;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0029:
                    r10 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r10) goto L_0x00e0;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x002d:
                    r10 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r11 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r10) goto L_0x00b7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0032:
                    r10 = 40;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r10) goto L_0x00aa;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0036:
                    r8 = 50;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r8) goto L_0x0081;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x003a:
                    r8 = 56;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r8) goto L_0x0074;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x003e:
                    r8 = 66;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r8) goto L_0x005b;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0042:
                    r8 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r8) goto L_0x004e;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0046:
                    r7 = r12.parseUnknownField(r13, r2, r14, r7);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 != 0) goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x004c:
                    goto L_0x0115;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x004e:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 | 64;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.versionRequirement_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x005b:
                    r7 = r4 & 128;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r5) goto L_0x0068;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x005f:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.annotation_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r4 = r4 | 128;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0068:
                    r7 = r12.annotation_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r8 = r13.readMessage(r8, r14);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0074:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.expandedTypeId_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0081:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 & r9;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 != r9) goto L_0x008c;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0086:
                    r7 = r12.expandedType_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r11 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x008c:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r13.readMessage(r7, r14);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.expandedType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r11 == 0) goto L_0x00a3;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0098:
                    r7 = r12.expandedType_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r11.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r11.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.expandedType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00a3:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 | r9;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00aa:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.underlyingTypeId_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00b7:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 & r6;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 != r6) goto L_0x00c2;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00bc:
                    r7 = r12.underlyingType_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r11 = r7.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00c2:
                    r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r13.readMessage(r7, r14);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.underlyingType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r11 == 0) goto L_0x00d9;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00ce:
                    r7 = r12.underlyingType_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r11.mergeFrom(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r11.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.underlyingType_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00d9:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 | r6;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00e0:
                    r7 = r4 & 4;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    if (r7 == r6) goto L_0x00ed;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00e4:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.typeParameter_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r4 = r4 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00ed:
                    r7 = r12.typeParameter_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r8 = r13.readMessage(r8, r14);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x00fa:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.name_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                L_0x0108:
                    r7 = r12.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r7 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r7 = r13.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    r12.flags_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0129, IOException -> 0x011a }
                    goto L_0x0016;
                L_0x0115:
                    r3 = 1;
                    goto L_0x0016;
                L_0x0118:
                    r13 = move-exception;
                    goto L_0x012f;
                L_0x011a:
                    r13 = move-exception;
                    r14 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x0118 }
                    r13 = r13.getMessage();	 Catch:{ all -> 0x0118 }
                    r14.<init>(r13);	 Catch:{ all -> 0x0118 }
                    r13 = r14.setUnfinishedMessage(r12);	 Catch:{ all -> 0x0118 }
                    throw r13;	 Catch:{ all -> 0x0118 }
                L_0x0129:
                    r13 = move-exception;	 Catch:{ all -> 0x0118 }
                    r13 = r13.setUnfinishedMessage(r12);	 Catch:{ all -> 0x0118 }
                    throw r13;	 Catch:{ all -> 0x0118 }
                L_0x012f:
                    r14 = r4 & 4;
                    if (r14 != r6) goto L_0x013b;
                L_0x0133:
                    r14 = r12.typeParameter_;
                    r14 = java.util.Collections.unmodifiableList(r14);
                    r12.typeParameter_ = r14;
                L_0x013b:
                    r14 = r4 & 128;
                    if (r14 != r5) goto L_0x0147;
                L_0x013f:
                    r14 = r12.annotation_;
                    r14 = java.util.Collections.unmodifiableList(r14);
                    r12.annotation_ = r14;
                L_0x0147:
                    r2.flush();	 Catch:{ IOException -> 0x014a, all -> 0x0151 }
                L_0x014a:
                    r14 = r0.toByteString();
                    r12.unknownFields = r14;
                    goto L_0x0159;
                L_0x0151:
                    r13 = move-exception;
                    r14 = r0.toByteString();
                    r12.unknownFields = r14;
                    throw r13;
                L_0x0159:
                    r12.makeExtensionsImmutable();
                    throw r13;
                L_0x015d:
                    r13 = r4 & 4;
                    if (r13 != r6) goto L_0x0169;
                L_0x0161:
                    r13 = r12.typeParameter_;
                    r13 = java.util.Collections.unmodifiableList(r13);
                    r12.typeParameter_ = r13;
                L_0x0169:
                    r13 = r4 & 128;
                    if (r13 != r5) goto L_0x0175;
                L_0x016d:
                    r13 = r12.annotation_;
                    r13 = java.util.Collections.unmodifiableList(r13);
                    r12.annotation_ = r13;
                L_0x0175:
                    r2.flush();	 Catch:{ IOException -> 0x0178, all -> 0x017f }
                L_0x0178:
                    r13 = r0.toByteString();
                    r12.unknownFields = r13;
                    goto L_0x0187;
                L_0x017f:
                    r13 = move-exception;
                    r14 = r0.toByteString();
                    r12.unknownFields = r14;
                    throw r13;
                L_0x0187:
                    r12.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<TypeAlias> getParserForType() {
                    return PARSER;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public boolean hasName() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getName() {
                    return this.name_;
                }

                public List<TypeParameter> getTypeParameterList() {
                    return this.typeParameter_;
                }

                public int getTypeParameterCount() {
                    return this.typeParameter_.size();
                }

                public TypeParameter getTypeParameter(int i) {
                    return (TypeParameter) this.typeParameter_.get(i);
                }

                public boolean hasUnderlyingType() {
                    return (this.bitField0_ & 4) == 4;
                }

                public Type getUnderlyingType() {
                    return this.underlyingType_;
                }

                public boolean hasUnderlyingTypeId() {
                    return (this.bitField0_ & 8) == 8;
                }

                public int getUnderlyingTypeId() {
                    return this.underlyingTypeId_;
                }

                public boolean hasExpandedType() {
                    return (this.bitField0_ & 16) == 16;
                }

                public Type getExpandedType() {
                    return this.expandedType_;
                }

                public boolean hasExpandedTypeId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public int getExpandedTypeId() {
                    return this.expandedTypeId_;
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

                public boolean hasVersionRequirement() {
                    return (this.bitField0_ & 64) == 64;
                }

                public int getVersionRequirement() {
                    return this.versionRequirement_;
                }

                private void initFields() {
                    this.flags_ = 6;
                    this.name_ = 0;
                    this.typeParameter_ = Collections.emptyList();
                    this.underlyingType_ = Type.getDefaultInstance();
                    this.underlyingTypeId_ = 0;
                    this.expandedType_ = Type.getDefaultInstance();
                    this.expandedTypeId_ = 0;
                    this.annotation_ = Collections.emptyList();
                    this.versionRequirement_ = 0;
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (hasName()) {
                        int i = 0;
                        while (i < getTypeParameterCount()) {
                            if (getTypeParameter(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        } else if (!hasExpandedType() || getExpandedType().isInitialized()) {
                            i = 0;
                            while (i < getAnnotationCount()) {
                                if (getAnnotation(i).isInitialized()) {
                                    i++;
                                } else {
                                    this.memoizedIsInitialized = (byte) 0;
                                    return false;
                                }
                            }
                            if (extensionsAreInitialized()) {
                                this.memoizedIsInitialized = (byte) 1;
                                return true;
                            }
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        } else {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(1, this.flags_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(2, this.name_);
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                        codedOutputStream.writeMessage(3, (MessageLite) this.typeParameter_.get(i2));
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeMessage(4, this.underlyingType_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeInt32(5, this.underlyingTypeId_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeMessage(6, this.expandedType_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(7, this.expandedTypeId_);
                    }
                    while (i < this.annotation_.size()) {
                        codedOutputStream.writeMessage(8, (MessageLite) this.annotation_.get(i));
                        i++;
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(31, this.versionRequirement_);
                    }
                    newExtensionWriter.writeUntil(Callback.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) + 0 : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(2, this.name_);
                    }
                    int i3 = i;
                    for (i = 0; i < this.typeParameter_.size(); i++) {
                        i3 += CodedOutputStream.computeMessageSize(3, (MessageLite) this.typeParameter_.get(i));
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i3 += CodedOutputStream.computeMessageSize(4, this.underlyingType_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i3 += CodedOutputStream.computeInt32Size(5, this.underlyingTypeId_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i3 += CodedOutputStream.computeMessageSize(6, this.expandedType_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i3 += CodedOutputStream.computeInt32Size(7, this.expandedTypeId_);
                    }
                    while (i2 < this.annotation_.size()) {
                        i3 += CodedOutputStream.computeMessageSize(8, (MessageLite) this.annotation_.get(i2));
                        i2++;
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        i3 += CodedOutputStream.computeInt32Size(31, this.versionRequirement_);
                    }
                    i3 = (i3 + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i3;
                    return i3;
                }

                public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (TypeAlias) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(TypeAlias typeAlias) {
                    return newBuilder().mergeFrom(typeAlias);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class TypeParameter extends ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
                public static Parser<TypeParameter> PARSER = new C185071();
                private static final TypeParameter defaultInstance = new TypeParameter(true);
                private int bitField0_;
                private int id_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int name_;
                private boolean reified_;
                private final ByteString unknownFields;
                private int upperBoundIdMemoizedSerializedSize;
                private List<Integer> upperBoundId_;
                private List<Type> upperBound_;
                private Variance variance_;

                public enum Variance implements EnumLite {
                    IN(0, 0),
                    OUT(1, 1),
                    INV(2, 2);
                    
                    private static EnumLiteMap<Variance> internalValueMap;
                    private final int value;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$1 */
                    static class C176001 implements EnumLiteMap<Variance> {
                        C176001() {
                        }

                        public Variance findValueByNumber(int i) {
                            return Variance.valueOf(i);
                        }
                    }

                    static {
                        internalValueMap = new C176001();
                    }

                    public final int getNumber() {
                        return this.value;
                    }

                    public static Variance valueOf(int i) {
                        switch (i) {
                            case 0:
                                return IN;
                            case 1:
                                return OUT;
                            case 2:
                                return INV;
                            default:
                                return 0;
                        }
                    }

                    private Variance(int i, int i2) {
                        this.value = i2;
                    }
                }

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1 */
                static class C185071 extends AbstractParser<TypeParameter> {
                    C185071() {
                    }

                    public TypeParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new TypeParameter(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
                    private int bitField0_;
                    private int id_;
                    private int name_;
                    private boolean reified_;
                    private List<Integer> upperBoundId_ = Collections.emptyList();
                    private List<Type> upperBound_ = Collections.emptyList();
                    private Variance variance_ = Variance.INV;

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

                    public TypeParameter getDefaultInstanceForType() {
                        return TypeParameter.getDefaultInstance();
                    }

                    public TypeParameter build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public TypeParameter buildPartial() {
                        TypeParameter typeParameter = new TypeParameter((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        typeParameter.id_ = this.id_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        typeParameter.name_ = this.name_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        typeParameter.reified_ = this.reified_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        typeParameter.variance_ = this.variance_;
                        if ((this.bitField0_ & 16) == 16) {
                            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                            this.bitField0_ &= -17;
                        }
                        typeParameter.upperBound_ = this.upperBound_;
                        if ((this.bitField0_ & 32) == 32) {
                            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                            this.bitField0_ &= -33;
                        }
                        typeParameter.upperBoundId_ = this.upperBoundId_;
                        typeParameter.bitField0_ = i2;
                        return typeParameter;
                    }

                    public Builder mergeFrom(TypeParameter typeParameter) {
                        if (typeParameter == TypeParameter.getDefaultInstance()) {
                            return this;
                        }
                        if (typeParameter.hasId()) {
                            setId(typeParameter.getId());
                        }
                        if (typeParameter.hasName()) {
                            setName(typeParameter.getName());
                        }
                        if (typeParameter.hasReified()) {
                            setReified(typeParameter.getReified());
                        }
                        if (typeParameter.hasVariance()) {
                            setVariance(typeParameter.getVariance());
                        }
                        if (!typeParameter.upperBound_.isEmpty()) {
                            if (this.upperBound_.isEmpty()) {
                                this.upperBound_ = typeParameter.upperBound_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureUpperBoundIsMutable();
                                this.upperBound_.addAll(typeParameter.upperBound_);
                            }
                        }
                        if (!typeParameter.upperBoundId_.isEmpty()) {
                            if (this.upperBoundId_.isEmpty()) {
                                this.upperBoundId_ = typeParameter.upperBoundId_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureUpperBoundIdIsMutable();
                                this.upperBoundId_.addAll(typeParameter.upperBoundId_);
                            }
                        }
                        mergeExtensionFields(typeParameter);
                        setUnknownFields(getUnknownFields().concat(typeParameter.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (!hasId() || !hasName()) {
                            return false;
                        }
                        for (int i = 0; i < getUpperBoundCount(); i++) {
                            if (!getUpperBound(i).isInitialized()) {
                                return false;
                            }
                        }
                        if (extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        TypeParameter typeParameter;
                        TypeParameter typeParameter2 = null;
                        try {
                            TypeParameter typeParameter3 = (TypeParameter) TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (typeParameter3 != null) {
                                mergeFrom(typeParameter3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            typeParameter = (TypeParameter) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            typeParameter2 = typeParameter;
                        }
                        if (typeParameter2 != null) {
                            mergeFrom(typeParameter2);
                        }
                        throw codedInputStream2;
                    }

                    public boolean hasId() {
                        return (this.bitField0_ & 1) == 1;
                    }

                    public Builder setId(int i) {
                        this.bitField0_ |= 1;
                        this.id_ = i;
                        return this;
                    }

                    public boolean hasName() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public Builder setName(int i) {
                        this.bitField0_ |= 2;
                        this.name_ = i;
                        return this;
                    }

                    public Builder setReified(boolean z) {
                        this.bitField0_ |= 4;
                        this.reified_ = z;
                        return this;
                    }

                    public Builder setVariance(Variance variance) {
                        if (variance == null) {
                            throw new NullPointerException();
                        }
                        this.bitField0_ |= 8;
                        this.variance_ = variance;
                        return this;
                    }

                    private void ensureUpperBoundIsMutable() {
                        if ((this.bitField0_ & 16) != 16) {
                            this.upperBound_ = new ArrayList(this.upperBound_);
                            this.bitField0_ |= 16;
                        }
                    }

                    public int getUpperBoundCount() {
                        return this.upperBound_.size();
                    }

                    public Type getUpperBound(int i) {
                        return (Type) this.upperBound_.get(i);
                    }

                    private void ensureUpperBoundIdIsMutable() {
                        if ((this.bitField0_ & 32) != 32) {
                            this.upperBoundId_ = new ArrayList(this.upperBoundId_);
                            this.bitField0_ |= 32;
                        }
                    }
                }

                private TypeParameter(ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.upperBoundIdMemoizedSerializedSize = -1;
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private TypeParameter(boolean z) {
                    this.upperBoundIdMemoizedSerializedSize = -1;
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static TypeParameter getDefaultInstance() {
                    return defaultInstance;
                }

                public TypeParameter getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r12, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r11 = this;
                    r11.<init>();
                    r0 = -1;
                    r11.upperBoundIdMemoizedSerializedSize = r0;
                    r11.memoizedIsInitialized = r0;
                    r11.memoizedSerializedSize = r0;
                    r11.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                    r4 = 0;
                L_0x0018:
                    r5 = 16;
                    r6 = 32;
                    if (r3 != 0) goto L_0x0138;
                L_0x001e:
                    r7 = r12.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == 0) goto L_0x00f0;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0024:
                    r8 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == r8) goto L_0x00e3;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0028:
                    if (r7 == r5) goto L_0x00d5;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x002a:
                    r9 = 24;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == r9) goto L_0x00c7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x002e:
                    if (r7 == r6) goto L_0x00ac;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0030:
                    r8 = 42;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == r8) goto L_0x0092;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0034:
                    r8 = 48;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == r8) goto L_0x0077;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0038:
                    r8 = 50;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == r8) goto L_0x0044;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x003c:
                    r7 = r11.parseUnknownField(r12, r2, r13, r7);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 != 0) goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0042:
                    goto L_0x00f0;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0044:
                    r7 = r12.readRawVarint32();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r12.pushLimit(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r8 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r8 == r6) goto L_0x005f;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0050:
                    r8 = r12.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r8 <= 0) goto L_0x005f;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0056:
                    r8 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r8.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.upperBoundId_ = r8;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x005f:
                    r8 = r12.getBytesUntilLimit();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r8 <= 0) goto L_0x0073;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0065:
                    r8 = r11.upperBoundId_;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r9 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r9 = java.lang.Integer.valueOf(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r8.add(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x005f;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0073:
                    r12.popLimit(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0077:
                    r7 = r4 & 32;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == r6) goto L_0x0084;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x007b:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.upperBoundId_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0084:
                    r7 = r11.upperBoundId_;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r8 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r8 = java.lang.Integer.valueOf(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0092:
                    r7 = r4 & 16;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r7 == r5) goto L_0x009f;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x0096:
                    r7 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.upperBound_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r4 = r4 | 16;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x009f:
                    r7 = r11.upperBound_;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r8 = r12.readMessage(r8, r13);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7.add(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x00ac:
                    r9 = r12.readEnum();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.valueOf(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    if (r10 != 0) goto L_0x00be;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x00b6:
                    r2.writeRawVarint32(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r2.writeRawVarint32(r9);	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x00be:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r7 | r8;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.variance_ = r10;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x00c7:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r7 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r12.readBool();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.reified_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x00d5:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r7 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.name_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                L_0x00e3:
                    r7 = r11.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r7 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.bitField0_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r7 = r12.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    r11.id_ = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0104, IOException -> 0x00f5 }
                    goto L_0x0018;
                L_0x00f0:
                    r3 = 1;
                    goto L_0x0018;
                L_0x00f3:
                    r12 = move-exception;
                    goto L_0x010a;
                L_0x00f5:
                    r12 = move-exception;
                    r13 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00f3 }
                    r12 = r12.getMessage();	 Catch:{ all -> 0x00f3 }
                    r13.<init>(r12);	 Catch:{ all -> 0x00f3 }
                    r12 = r13.setUnfinishedMessage(r11);	 Catch:{ all -> 0x00f3 }
                    throw r12;	 Catch:{ all -> 0x00f3 }
                L_0x0104:
                    r12 = move-exception;	 Catch:{ all -> 0x00f3 }
                    r12 = r12.setUnfinishedMessage(r11);	 Catch:{ all -> 0x00f3 }
                    throw r12;	 Catch:{ all -> 0x00f3 }
                L_0x010a:
                    r13 = r4 & 16;
                    if (r13 != r5) goto L_0x0116;
                L_0x010e:
                    r13 = r11.upperBound_;
                    r13 = java.util.Collections.unmodifiableList(r13);
                    r11.upperBound_ = r13;
                L_0x0116:
                    r13 = r4 & 32;
                    if (r13 != r6) goto L_0x0122;
                L_0x011a:
                    r13 = r11.upperBoundId_;
                    r13 = java.util.Collections.unmodifiableList(r13);
                    r11.upperBoundId_ = r13;
                L_0x0122:
                    r2.flush();	 Catch:{ IOException -> 0x0125, all -> 0x012c }
                L_0x0125:
                    r13 = r0.toByteString();
                    r11.unknownFields = r13;
                    goto L_0x0134;
                L_0x012c:
                    r12 = move-exception;
                    r13 = r0.toByteString();
                    r11.unknownFields = r13;
                    throw r12;
                L_0x0134:
                    r11.makeExtensionsImmutable();
                    throw r12;
                L_0x0138:
                    r12 = r4 & 16;
                    if (r12 != r5) goto L_0x0144;
                L_0x013c:
                    r12 = r11.upperBound_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r11.upperBound_ = r12;
                L_0x0144:
                    r12 = r4 & 32;
                    if (r12 != r6) goto L_0x0150;
                L_0x0148:
                    r12 = r11.upperBoundId_;
                    r12 = java.util.Collections.unmodifiableList(r12);
                    r11.upperBoundId_ = r12;
                L_0x0150:
                    r2.flush();	 Catch:{ IOException -> 0x0153, all -> 0x015a }
                L_0x0153:
                    r12 = r0.toByteString();
                    r11.unknownFields = r12;
                    goto L_0x0162;
                L_0x015a:
                    r12 = move-exception;
                    r13 = r0.toByteString();
                    r11.unknownFields = r13;
                    throw r12;
                L_0x0162:
                    r11.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<TypeParameter> getParserForType() {
                    return PARSER;
                }

                public boolean hasId() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getId() {
                    return this.id_;
                }

                public boolean hasName() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getName() {
                    return this.name_;
                }

                public boolean hasReified() {
                    return (this.bitField0_ & 4) == 4;
                }

                public boolean getReified() {
                    return this.reified_;
                }

                public boolean hasVariance() {
                    return (this.bitField0_ & 8) == 8;
                }

                public Variance getVariance() {
                    return this.variance_;
                }

                public List<Type> getUpperBoundList() {
                    return this.upperBound_;
                }

                public int getUpperBoundCount() {
                    return this.upperBound_.size();
                }

                public Type getUpperBound(int i) {
                    return (Type) this.upperBound_.get(i);
                }

                public List<Integer> getUpperBoundIdList() {
                    return this.upperBoundId_;
                }

                private void initFields() {
                    this.id_ = 0;
                    this.name_ = 0;
                    this.reified_ = false;
                    this.variance_ = Variance.INV;
                    this.upperBound_ = Collections.emptyList();
                    this.upperBoundId_ = Collections.emptyList();
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (!hasId()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (hasName()) {
                        int i = 0;
                        while (i < getUpperBoundCount()) {
                            if (getUpperBound(i).isInitialized()) {
                                i++;
                            } else {
                                this.memoizedIsInitialized = (byte) 0;
                                return false;
                            }
                        }
                        if (extensionsAreInitialized()) {
                            this.memoizedIsInitialized = (byte) 1;
                            return true;
                        }
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(1, this.id_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(2, this.name_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeBool(3, this.reified_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeEnum(4, this.variance_.getNumber());
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
                        codedOutputStream.writeMessage(5, (MessageLite) this.upperBound_.get(i2));
                    }
                    if (getUpperBoundIdList().size() > 0) {
                        codedOutputStream.writeRawVarint32(50);
                        codedOutputStream.writeRawVarint32(this.upperBoundIdMemoizedSerializedSize);
                    }
                    while (i < this.upperBoundId_.size()) {
                        codedOutputStream.writeInt32NoTag(((Integer) this.upperBoundId_.get(i)).intValue());
                        i++;
                    }
                    newExtensionWriter.writeUntil(AdError.NETWORK_ERROR_CODE, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    i = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.id_) + 0 : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(2, this.name_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeBoolSize(3, this.reified_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeEnumSize(4, this.variance_.getNumber());
                    }
                    int i3 = i;
                    for (i = 0; i < this.upperBound_.size(); i++) {
                        i3 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.upperBound_.get(i));
                    }
                    i = 0;
                    while (i2 < this.upperBoundId_.size()) {
                        i += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.upperBoundId_.get(i2)).intValue());
                        i2++;
                    }
                    i3 += i;
                    if (!getUpperBoundIdList().isEmpty()) {
                        i3 = (i3 + 1) + CodedOutputStream.computeInt32SizeNoTag(i);
                    }
                    this.upperBoundIdMemoizedSerializedSize = i;
                    i3 = (i3 + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i3;
                    return i3;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(TypeParameter typeParameter) {
                    return newBuilder().mergeFrom(typeParameter);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }

            public static final class ValueParameter extends ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
                public static Parser<ValueParameter> PARSER = new C185091();
                private static final ValueParameter defaultInstance = new ValueParameter(true);
                private int bitField0_;
                private int flags_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int name_;
                private int typeId_;
                private Type type_;
                private final ByteString unknownFields;
                private int varargElementTypeId_;
                private Type varargElementType_;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1 */
                static class C185091 extends AbstractParser<ValueParameter> {
                    C185091() {
                    }

                    public ValueParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new ValueParameter(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
                    private int bitField0_;
                    private int flags_;
                    private int name_;
                    private int typeId_;
                    private Type type_ = Type.getDefaultInstance();
                    private int varargElementTypeId_;
                    private Type varargElementType_ = Type.getDefaultInstance();

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

                    public ValueParameter getDefaultInstanceForType() {
                        return ValueParameter.getDefaultInstance();
                    }

                    public ValueParameter build() {
                        Object buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                    }

                    public ValueParameter buildPartial() {
                        ValueParameter valueParameter = new ValueParameter((ExtendableBuilder) this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        valueParameter.flags_ = this.flags_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        valueParameter.name_ = this.name_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        valueParameter.type_ = this.type_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        valueParameter.typeId_ = this.typeId_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        valueParameter.varargElementType_ = this.varargElementType_;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        valueParameter.varargElementTypeId_ = this.varargElementTypeId_;
                        valueParameter.bitField0_ = i2;
                        return valueParameter;
                    }

                    public Builder mergeFrom(ValueParameter valueParameter) {
                        if (valueParameter == ValueParameter.getDefaultInstance()) {
                            return this;
                        }
                        if (valueParameter.hasFlags()) {
                            setFlags(valueParameter.getFlags());
                        }
                        if (valueParameter.hasName()) {
                            setName(valueParameter.getName());
                        }
                        if (valueParameter.hasType()) {
                            mergeType(valueParameter.getType());
                        }
                        if (valueParameter.hasTypeId()) {
                            setTypeId(valueParameter.getTypeId());
                        }
                        if (valueParameter.hasVarargElementType()) {
                            mergeVarargElementType(valueParameter.getVarargElementType());
                        }
                        if (valueParameter.hasVarargElementTypeId()) {
                            setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                        }
                        mergeExtensionFields(valueParameter);
                        setUnknownFields(getUnknownFields().concat(valueParameter.unknownFields));
                        return this;
                    }

                    public final boolean isInitialized() {
                        if (!hasName()) {
                            return false;
                        }
                        if (hasType() && !getType().isInitialized()) {
                            return false;
                        }
                        if ((!hasVarargElementType() || getVarargElementType().isInitialized()) && extensionsAreInitialized()) {
                            return true;
                        }
                        return false;
                    }

                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        ValueParameter valueParameter;
                        ValueParameter valueParameter2 = null;
                        try {
                            ValueParameter valueParameter3 = (ValueParameter) ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (valueParameter3 != null) {
                                mergeFrom(valueParameter3);
                            }
                            return this;
                        } catch (CodedInputStream codedInputStream2) {
                            valueParameter = (ValueParameter) codedInputStream2.getUnfinishedMessage();
                            throw codedInputStream2;
                        } catch (Throwable th) {
                            codedInputStream2 = th;
                            valueParameter2 = valueParameter;
                        }
                        if (valueParameter2 != null) {
                            mergeFrom(valueParameter2);
                        }
                        throw codedInputStream2;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1;
                        this.flags_ = i;
                        return this;
                    }

                    public boolean hasName() {
                        return (this.bitField0_ & 2) == 2;
                    }

                    public Builder setName(int i) {
                        this.bitField0_ |= 2;
                        this.name_ = i;
                        return this;
                    }

                    public boolean hasType() {
                        return (this.bitField0_ & 4) == 4;
                    }

                    public Type getType() {
                        return this.type_;
                    }

                    public Builder mergeType(Type type) {
                        if ((this.bitField0_ & 4) != 4 || this.type_ == Type.getDefaultInstance()) {
                            this.type_ = type;
                        } else {
                            this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 4;
                        return this;
                    }

                    public Builder setTypeId(int i) {
                        this.bitField0_ |= 8;
                        this.typeId_ = i;
                        return this;
                    }

                    public boolean hasVarargElementType() {
                        return (this.bitField0_ & 16) == 16;
                    }

                    public Type getVarargElementType() {
                        return this.varargElementType_;
                    }

                    public Builder mergeVarargElementType(Type type) {
                        if ((this.bitField0_ & 16) != 16 || this.varargElementType_ == Type.getDefaultInstance()) {
                            this.varargElementType_ = type;
                        } else {
                            this.varargElementType_ = Type.newBuilder(this.varargElementType_).mergeFrom(type).buildPartial();
                        }
                        this.bitField0_ |= 16;
                        return this;
                    }

                    public Builder setVarargElementTypeId(int i) {
                        this.bitField0_ |= 32;
                        this.varargElementTypeId_ = i;
                        return this;
                    }
                }

                private ValueParameter(ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
                    super(extendableBuilder);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = extendableBuilder.getUnknownFields();
                }

                private ValueParameter(boolean z) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public static ValueParameter getDefaultInstance() {
                    return defaultInstance;
                }

                public ValueParameter getDefaultInstanceForType() {
                    return defaultInstance;
                }

                private ValueParameter(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r9 = this;
                    r9.<init>();
                    r0 = -1;
                    r9.memoizedIsInitialized = r0;
                    r9.memoizedSerializedSize = r0;
                    r9.initFields();
                    r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput();
                    r1 = 1;
                    r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1);
                    r3 = 0;
                L_0x0015:
                    if (r3 != 0) goto L_0x00f4;
                L_0x0017:
                    r4 = r10.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 == 0) goto L_0x00c4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x001d:
                    r5 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 == r5) goto L_0x00b7;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0021:
                    r6 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 == r6) goto L_0x00a9;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0025:
                    r7 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r8 = 0;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 == r7) goto L_0x007f;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x002a:
                    r7 = 34;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 == r7) goto L_0x0057;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x002e:
                    r6 = 40;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 == r6) goto L_0x004b;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0032:
                    r5 = 48;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 == r5) goto L_0x003e;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0036:
                    r4 = r9.parseUnknownField(r10, r2, r11, r4);	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 != 0) goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x003c:
                    goto L_0x00c4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x003e:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 | 32;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.varargElementTypeId_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x004b:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.typeId_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0057:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 & r6;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 != r6) goto L_0x0062;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x005c:
                    r4 = r9.varargElementType_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r8 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0062:
                    r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r10.readMessage(r4, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.varargElementType_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r8 == 0) goto L_0x0079;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x006e:
                    r4 = r9.varargElementType_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r8.mergeFrom(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.varargElementType_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0079:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 | r6;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x007f:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r5 = 4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 & r5;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r4 != r5) goto L_0x008b;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0085:
                    r4 = r9.type_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r8 = r4.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x008b:
                    r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r10.readMessage(r4, r11);	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.type_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    if (r8 == 0) goto L_0x00a2;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x0097:
                    r4 = r9.type_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r8.mergeFrom(r4);	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r8.buildPartial();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.type_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x00a2:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 | r5;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x00a9:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.name_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    goto L_0x0015;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                L_0x00b7:
                    r4 = r9.bitField0_;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.bitField0_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r4 = r10.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    r9.flags_ = r4;	 Catch:{ InvalidProtocolBufferException -> 0x00d8, IOException -> 0x00c9 }
                    goto L_0x0015;
                L_0x00c4:
                    r3 = 1;
                    goto L_0x0015;
                L_0x00c7:
                    r10 = move-exception;
                    goto L_0x00de;
                L_0x00c9:
                    r10 = move-exception;
                    r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;	 Catch:{ all -> 0x00c7 }
                    r10 = r10.getMessage();	 Catch:{ all -> 0x00c7 }
                    r11.<init>(r10);	 Catch:{ all -> 0x00c7 }
                    r10 = r11.setUnfinishedMessage(r9);	 Catch:{ all -> 0x00c7 }
                    throw r10;	 Catch:{ all -> 0x00c7 }
                L_0x00d8:
                    r10 = move-exception;	 Catch:{ all -> 0x00c7 }
                    r10 = r10.setUnfinishedMessage(r9);	 Catch:{ all -> 0x00c7 }
                    throw r10;	 Catch:{ all -> 0x00c7 }
                L_0x00de:
                    r2.flush();	 Catch:{ IOException -> 0x00e1, all -> 0x00e8 }
                L_0x00e1:
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    goto L_0x00f0;
                L_0x00e8:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x00f0:
                    r9.makeExtensionsImmutable();
                    throw r10;
                L_0x00f4:
                    r2.flush();	 Catch:{ IOException -> 0x00f7, all -> 0x00fe }
                L_0x00f7:
                    r10 = r0.toByteString();
                    r9.unknownFields = r10;
                    goto L_0x0106;
                L_0x00fe:
                    r10 = move-exception;
                    r11 = r0.toByteString();
                    r9.unknownFields = r11;
                    throw r10;
                L_0x0106:
                    r9.makeExtensionsImmutable();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }

                static {
                    defaultInstance.initFields();
                }

                public Parser<ValueParameter> getParserForType() {
                    return PARSER;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 1) == 1;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public boolean hasName() {
                    return (this.bitField0_ & 2) == 2;
                }

                public int getName() {
                    return this.name_;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 4) == 4;
                }

                public Type getType() {
                    return this.type_;
                }

                public boolean hasTypeId() {
                    return (this.bitField0_ & 8) == 8;
                }

                public int getTypeId() {
                    return this.typeId_;
                }

                public boolean hasVarargElementType() {
                    return (this.bitField0_ & 16) == 16;
                }

                public Type getVarargElementType() {
                    return this.varargElementType_;
                }

                public boolean hasVarargElementTypeId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public int getVarargElementTypeId() {
                    return this.varargElementTypeId_;
                }

                private void initFields() {
                    this.flags_ = 0;
                    this.name_ = 0;
                    this.type_ = Type.getDefaultInstance();
                    this.typeId_ = 0;
                    this.varargElementType_ = Type.getDefaultInstance();
                    this.varargElementTypeId_ = 0;
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == (byte) 1) {
                        return true;
                    }
                    if (b == (byte) 0) {
                        return false;
                    }
                    if (!hasName()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (hasType() && !getType().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    } else if (extensionsAreInitialized()) {
                        this.memoizedIsInitialized = (byte) 1;
                        return true;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    ExtensionWriter newExtensionWriter = newExtensionWriter();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeInt32(1, this.flags_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeInt32(2, this.name_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeMessage(3, this.type_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeMessage(4, this.varargElementType_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeInt32(5, this.typeId_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.varargElementTypeId_);
                    }
                    newExtensionWriter.writeUntil(Callback.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    i = 0;
                    if ((this.bitField0_ & 1) == 1) {
                        i = 0 + CodedOutputStream.computeInt32Size(1, this.flags_);
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeInt32Size(2, this.name_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeMessageSize(3, this.type_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i += CodedOutputStream.computeMessageSize(4, this.varargElementType_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeInt32Size(5, this.typeId_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i += CodedOutputStream.computeInt32Size(6, this.varargElementTypeId_);
                    }
                    i = (i + extensionsSerializedSize()) + this.unknownFields.size();
                    this.memoizedSerializedSize = i;
                    return i;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder(ValueParameter valueParameter) {
                    return newBuilder().mergeFrom(valueParameter);
                }

                public Builder toBuilder() {
                    return newBuilder(this);
                }
            }
        }
