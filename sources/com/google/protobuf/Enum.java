package com.google.protobuf;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Enum extends GeneratedMessageV3 implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE = new Enum();
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final Parser<Enum> PARSER = new C77711();
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<EnumValue> enumvalue_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Enum$1 */
    static class C77711 extends AbstractParser<Enum> {
        C77711() {
        }

        public Enum parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Enum(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements EnumOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<EnumValue, com.google.protobuf.EnumValue.Builder, EnumValueOrBuilder> enumvalueBuilder_;
        private List<EnumValue> enumvalue_;
        private Object name_;
        private RepeatedFieldBuilderV3<Option, com.google.protobuf.Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilderV3<SourceContext, com.google.protobuf.SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return TypeProto.internal_static_google_protobuf_Enum_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable.ensureFieldAccessorsInitialized(Enum.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.enumvalue_ = Collections.emptyList();
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.enumvalue_ = Collections.emptyList();
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getEnumvalueFieldBuilder();
                getOptionsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.name_ = "";
            if (this.enumvalueBuilder_ == null) {
                this.enumvalue_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                this.enumvalueBuilder_.clear();
            }
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -5;
            } else {
                this.optionsBuilder_.clear();
            }
            if (this.sourceContextBuilder_ == null) {
                this.sourceContext_ = null;
            } else {
                this.sourceContext_ = null;
                this.sourceContextBuilder_ = null;
            }
            this.syntax_ = 0;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return TypeProto.internal_static_google_protobuf_Enum_descriptor;
        }

        public Enum getDefaultInstanceForType() {
            return Enum.getDefaultInstance();
        }

        public Enum build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public Enum buildPartial() {
            Enum enumR = new Enum((com.google.protobuf.GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            enumR.name_ = this.name_;
            if (this.enumvalueBuilder_ == null) {
                if ((this.bitField0_ & 2) == 2) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                    this.bitField0_ &= -3;
                }
                enumR.enumvalue_ = this.enumvalue_;
            } else {
                enumR.enumvalue_ = this.enumvalueBuilder_.build();
            }
            if (this.optionsBuilder_ == null) {
                if ((this.bitField0_ & 4) == 4) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                enumR.options_ = this.options_;
            } else {
                enumR.options_ = this.optionsBuilder_.build();
            }
            if (this.sourceContextBuilder_ == null) {
                enumR.sourceContext_ = this.sourceContext_;
            } else {
                enumR.sourceContext_ = (SourceContext) this.sourceContextBuilder_.build();
            }
            enumR.syntax_ = this.syntax_;
            enumR.bitField0_ = 0;
            onBuilt();
            return enumR;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder clearField(FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearOneof(OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        public Builder addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Enum) {
                return mergeFrom((Enum) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Enum enumR) {
            if (enumR == Enum.getDefaultInstance()) {
                return this;
            }
            if (!enumR.getName().isEmpty()) {
                this.name_ = enumR.name_;
                onChanged();
            }
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
            if (this.enumvalueBuilder_ == null) {
                if (!enumR.enumvalue_.isEmpty()) {
                    if (this.enumvalue_.isEmpty()) {
                        this.enumvalue_ = enumR.enumvalue_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEnumvalueIsMutable();
                        this.enumvalue_.addAll(enumR.enumvalue_);
                    }
                    onChanged();
                }
            } else if (!enumR.enumvalue_.isEmpty()) {
                if (this.enumvalueBuilder_.isEmpty()) {
                    this.enumvalueBuilder_.dispose();
                    this.enumvalueBuilder_ = null;
                    this.enumvalue_ = enumR.enumvalue_;
                    this.bitField0_ &= -3;
                    this.enumvalueBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEnumvalueFieldBuilder() : null;
                } else {
                    this.enumvalueBuilder_.addAllMessages(enumR.enumvalue_);
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!enumR.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = enumR.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(enumR.options_);
                    }
                    onChanged();
                }
            } else if (!enumR.options_.isEmpty()) {
                if (this.optionsBuilder_.isEmpty()) {
                    this.optionsBuilder_.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = enumR.options_;
                    this.bitField0_ &= -5;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getOptionsFieldBuilder();
                    }
                    this.optionsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.optionsBuilder_.addAllMessages(enumR.options_);
                }
            }
            if (enumR.hasSourceContext()) {
                mergeSourceContext(enumR.getSourceContext());
            }
            if (enumR.syntax_ != 0) {
                setSyntaxValue(enumR.getSyntaxValue());
            }
            mergeUnknownFields(enumR.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Enum enumR;
            Enum enumR2 = null;
            try {
                Enum enumR3 = (Enum) Enum.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (enumR3 != null) {
                    mergeFrom(enumR3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                enumR = (Enum) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                enumR2 = enumR;
                if (enumR2 != null) {
                    mergeFrom(enumR2);
                }
                throw codedInputStream2;
            }
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = Enum.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        private void ensureEnumvalueIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
                this.enumvalue_ = new ArrayList(this.enumvalue_);
                this.bitField0_ |= 2;
            }
        }

        public List<EnumValue> getEnumvalueList() {
            if (this.enumvalueBuilder_ == null) {
                return Collections.unmodifiableList(this.enumvalue_);
            }
            return this.enumvalueBuilder_.getMessageList();
        }

        public int getEnumvalueCount() {
            if (this.enumvalueBuilder_ == null) {
                return this.enumvalue_.size();
            }
            return this.enumvalueBuilder_.getCount();
        }

        public EnumValue getEnumvalue(int i) {
            if (this.enumvalueBuilder_ == null) {
                return (EnumValue) this.enumvalue_.get(i);
            }
            return (EnumValue) this.enumvalueBuilder_.getMessage(i);
        }

        public Builder setEnumvalue(int i, EnumValue enumValue) {
            if (this.enumvalueBuilder_ != null) {
                this.enumvalueBuilder_.setMessage(i, enumValue);
            } else if (enumValue == null) {
                throw new NullPointerException();
            } else {
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i, enumValue);
                onChanged();
            }
            return this;
        }

        public Builder setEnumvalue(int i, com.google.protobuf.EnumValue.Builder builder) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i, builder.build());
                onChanged();
            } else {
                this.enumvalueBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue) {
            if (this.enumvalueBuilder_ != null) {
                this.enumvalueBuilder_.addMessage(enumValue);
            } else if (enumValue == null) {
                throw new NullPointerException();
            } else {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(enumValue);
                onChanged();
            }
            return this;
        }

        public Builder addEnumvalue(int i, EnumValue enumValue) {
            if (this.enumvalueBuilder_ != null) {
                this.enumvalueBuilder_.addMessage(i, enumValue);
            } else if (enumValue == null) {
                throw new NullPointerException();
            } else {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, enumValue);
                onChanged();
            }
            return this;
        }

        public Builder addEnumvalue(com.google.protobuf.EnumValue.Builder builder) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(builder.build());
                onChanged();
            } else {
                this.enumvalueBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public Builder addEnumvalue(int i, com.google.protobuf.EnumValue.Builder builder) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, builder.build());
                onChanged();
            } else {
                this.enumvalueBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.enumvalue_);
                onChanged();
            } else {
                this.enumvalueBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearEnumvalue() {
            if (this.enumvalueBuilder_ == null) {
                this.enumvalue_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                this.enumvalueBuilder_.clear();
            }
            return this;
        }

        public Builder removeEnumvalue(int i) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.remove(i);
                onChanged();
            } else {
                this.enumvalueBuilder_.remove(i);
            }
            return this;
        }

        public com.google.protobuf.EnumValue.Builder getEnumvalueBuilder(int i) {
            return (com.google.protobuf.EnumValue.Builder) getEnumvalueFieldBuilder().getBuilder(i);
        }

        public EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
            if (this.enumvalueBuilder_ == null) {
                return (EnumValueOrBuilder) this.enumvalue_.get(i);
            }
            return (EnumValueOrBuilder) this.enumvalueBuilder_.getMessageOrBuilder(i);
        }

        public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
            if (this.enumvalueBuilder_ != null) {
                return this.enumvalueBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.enumvalue_);
        }

        public com.google.protobuf.EnumValue.Builder addEnumvalueBuilder() {
            return (com.google.protobuf.EnumValue.Builder) getEnumvalueFieldBuilder().addBuilder(EnumValue.getDefaultInstance());
        }

        public com.google.protobuf.EnumValue.Builder addEnumvalueBuilder(int i) {
            return (com.google.protobuf.EnumValue.Builder) getEnumvalueFieldBuilder().addBuilder(i, EnumValue.getDefaultInstance());
        }

        public List<com.google.protobuf.EnumValue.Builder> getEnumvalueBuilderList() {
            return getEnumvalueFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<EnumValue, com.google.protobuf.EnumValue.Builder, EnumValueOrBuilder> getEnumvalueFieldBuilder() {
            if (this.enumvalueBuilder_ == null) {
                this.enumvalueBuilder_ = new RepeatedFieldBuilderV3(this.enumvalue_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                this.enumvalue_ = null;
            }
            return this.enumvalueBuilder_;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) != 4) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        public List<Option> getOptionsList() {
            if (this.optionsBuilder_ == null) {
                return Collections.unmodifiableList(this.options_);
            }
            return this.optionsBuilder_.getMessageList();
        }

        public int getOptionsCount() {
            if (this.optionsBuilder_ == null) {
                return this.options_.size();
            }
            return this.optionsBuilder_.getCount();
        }

        public Option getOptions(int i) {
            if (this.optionsBuilder_ == null) {
                return (Option) this.options_.get(i);
            }
            return (Option) this.optionsBuilder_.getMessage(i);
        }

        public Builder setOptions(int i, Option option) {
            if (this.optionsBuilder_ != null) {
                this.optionsBuilder_.setMessage(i, option);
            } else if (option == null) {
                throw new NullPointerException();
            } else {
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
            }
            return this;
        }

        public Builder setOptions(int i, com.google.protobuf.Option.Builder builder) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.set(i, builder.build());
                onChanged();
            } else {
                this.optionsBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addOptions(Option option) {
            if (this.optionsBuilder_ != null) {
                this.optionsBuilder_.addMessage(option);
            } else if (option == null) {
                throw new NullPointerException();
            } else {
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
            }
            return this;
        }

        public Builder addOptions(int i, Option option) {
            if (this.optionsBuilder_ != null) {
                this.optionsBuilder_.addMessage(i, option);
            } else if (option == null) {
                throw new NullPointerException();
            } else {
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
            }
            return this;
        }

        public Builder addOptions(com.google.protobuf.Option.Builder builder) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.add(builder.build());
                onChanged();
            } else {
                this.optionsBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public Builder addOptions(int i, com.google.protobuf.Option.Builder builder) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, builder.build());
                onChanged();
            } else {
                this.optionsBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.options_);
                onChanged();
            } else {
                this.optionsBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearOptions() {
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                this.optionsBuilder_.clear();
            }
            return this;
        }

        public Builder removeOptions(int i) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.remove(i);
                onChanged();
            } else {
                this.optionsBuilder_.remove(i);
            }
            return this;
        }

        public com.google.protobuf.Option.Builder getOptionsBuilder(int i) {
            return (com.google.protobuf.Option.Builder) getOptionsFieldBuilder().getBuilder(i);
        }

        public OptionOrBuilder getOptionsOrBuilder(int i) {
            if (this.optionsBuilder_ == null) {
                return (OptionOrBuilder) this.options_.get(i);
            }
            return (OptionOrBuilder) this.optionsBuilder_.getMessageOrBuilder(i);
        }

        public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
            if (this.optionsBuilder_ != null) {
                return this.optionsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.options_);
        }

        public com.google.protobuf.Option.Builder addOptionsBuilder() {
            return (com.google.protobuf.Option.Builder) getOptionsFieldBuilder().addBuilder(Option.getDefaultInstance());
        }

        public com.google.protobuf.Option.Builder addOptionsBuilder(int i) {
            return (com.google.protobuf.Option.Builder) getOptionsFieldBuilder().addBuilder(i, Option.getDefaultInstance());
        }

        public List<com.google.protobuf.Option.Builder> getOptionsBuilderList() {
            return getOptionsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Option, com.google.protobuf.Option.Builder, OptionOrBuilder> getOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new RepeatedFieldBuilderV3(this.options_, (this.bitField0_ & 4) == 4, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public boolean hasSourceContext() {
            if (this.sourceContextBuilder_ == null) {
                if (this.sourceContext_ == null) {
                    return false;
                }
            }
            return true;
        }

        public SourceContext getSourceContext() {
            if (this.sourceContextBuilder_ != null) {
                return (SourceContext) this.sourceContextBuilder_.getMessage();
            }
            return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            if (this.sourceContextBuilder_ != null) {
                this.sourceContextBuilder_.setMessage(sourceContext);
            } else if (sourceContext == null) {
                throw new NullPointerException();
            } else {
                this.sourceContext_ = sourceContext;
                onChanged();
            }
            return this;
        }

        public Builder setSourceContext(com.google.protobuf.SourceContext.Builder builder) {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContext_ = builder.build();
                onChanged();
            } else {
                this.sourceContextBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            if (this.sourceContextBuilder_ == null) {
                if (this.sourceContext_ != null) {
                    this.sourceContext_ = SourceContext.newBuilder(this.sourceContext_).mergeFrom(sourceContext).buildPartial();
                } else {
                    this.sourceContext_ = sourceContext;
                }
                onChanged();
            } else {
                this.sourceContextBuilder_.mergeFrom(sourceContext);
            }
            return this;
        }

        public Builder clearSourceContext() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContext_ = null;
                onChanged();
            } else {
                this.sourceContext_ = null;
                this.sourceContextBuilder_ = null;
            }
            return this;
        }

        public com.google.protobuf.SourceContext.Builder getSourceContextBuilder() {
            onChanged();
            return (com.google.protobuf.SourceContext.Builder) getSourceContextFieldBuilder().getBuilder();
        }

        public SourceContextOrBuilder getSourceContextOrBuilder() {
            if (this.sourceContextBuilder_ != null) {
                return (SourceContextOrBuilder) this.sourceContextBuilder_.getMessageOrBuilder();
            }
            return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
        }

        private SingleFieldBuilderV3<SourceContext, com.google.protobuf.SourceContext.Builder, SourceContextOrBuilder> getSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new SingleFieldBuilderV3(getSourceContext(), getParentForChildren(), isClean());
                this.sourceContext_ = null;
            }
            return this.sourceContextBuilder_;
        }

        public int getSyntaxValue() {
            return this.syntax_;
        }

        public Builder setSyntaxValue(int i) {
            this.syntax_ = i;
            onChanged();
            return this;
        }

        public Syntax getSyntax() {
            Syntax valueOf = Syntax.valueOf(this.syntax_);
            return valueOf == null ? Syntax.UNRECOGNIZED : valueOf;
        }

        public Builder setSyntax(Syntax syntax) {
            if (syntax == null) {
                throw new NullPointerException();
            }
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public Builder clearSyntax() {
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private Enum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Enum() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.enumvalue_ = Collections.emptyList();
        this.options_ = Collections.emptyList();
        this.syntax_ = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Enum(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        int i = 0;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 10) {
                        this.name_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 18) {
                        if ((i & 2) != 2) {
                            this.enumvalue_ = new ArrayList();
                            i |= 2;
                        }
                        this.enumvalue_.add(codedInputStream.readMessage(EnumValue.parser(), extensionRegistryLite));
                    } else if (readTag == 26) {
                        if ((i & 4) != 4) {
                            this.options_ = new ArrayList();
                            i |= 4;
                        }
                        this.options_.add(codedInputStream.readMessage(Option.parser(), extensionRegistryLite));
                    } else if (readTag == 34) {
                        com.google.protobuf.SourceContext.Builder builder = null;
                        if (this.sourceContext_ != null) {
                            builder = this.sourceContext_.toBuilder();
                        }
                        this.sourceContext_ = (SourceContext) codedInputStream.readMessage(SourceContext.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom(this.sourceContext_);
                            this.sourceContext_ = builder.buildPartial();
                        }
                    } else if (readTag == 40) {
                        this.syntax_ = codedInputStream.readEnum();
                    } else if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                    }
                }
                obj = 1;
            } catch (CodedInputStream codedInputStream2) {
                throw codedInputStream2.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } catch (Throwable th) {
                if ((i & 2) == 2) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                }
                if ((i & 4) == 4) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
        if ((i & 2) == 2) {
            this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
        }
        if ((i & 4) == 4) {
            this.options_ = Collections.unmodifiableList(this.options_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptor getDescriptor() {
        return TypeProto.internal_static_google_protobuf_Enum_descriptor;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable.ensureFieldAccessorsInitialized(Enum.class, Builder.class);
    }

    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    public EnumValue getEnumvalue(int i) {
        return (EnumValue) this.enumvalue_.get(i);
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
        return (EnumValueOrBuilder) this.enumvalue_.get(i);
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
        return (OptionOrBuilder) this.options_.get(i);
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
    }

    public SourceContextOrBuilder getSourceContextOrBuilder() {
        return getSourceContext();
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public Syntax getSyntax() {
        Syntax valueOf = Syntax.valueOf(this.syntax_);
        return valueOf == null ? Syntax.UNRECOGNIZED : valueOf;
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
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.enumvalue_.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.enumvalue_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.options_.get(i2));
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.writeMessage(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(5, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int computeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) + 0 : 0;
        for (i = 0; i < this.enumvalue_.size(); i++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.enumvalue_.get(i));
        }
        while (i2 < this.options_.size()) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.options_.get(i2));
            i2++;
        }
        if (this.sourceContext_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(5, this.syntax_);
        }
        computeStringSize += this.unknownFields.getSerializedSize();
        this.memoizedSize = computeStringSize;
        return computeStringSize;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Enum)) {
            return super.equals(obj);
        }
        Enum enumR = (Enum) obj;
        Object obj2 = ((getName().equals(enumR.getName()) ? 1 : null) == null || !getEnumvalueList().equals(enumR.getEnumvalueList())) ? null : 1;
        obj2 = (obj2 == null || !getOptionsList().equals(enumR.getOptionsList())) ? null : 1;
        obj2 = (obj2 == null || hasSourceContext() != enumR.hasSourceContext()) ? null : 1;
        if (hasSourceContext()) {
            obj2 = (obj2 == null || !getSourceContext().equals(enumR.getSourceContext())) ? null : 1;
        }
        obj2 = (obj2 == null || this.syntax_ != enumR.syntax_) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(enumR.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (getEnumvalueCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getEnumvalueList().hashCode();
        }
        if (getOptionsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        if (hasSourceContext()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getSourceContext().hashCode();
        }
        hashCode = (((((hashCode * 37) + 5) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteBuffer);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteString);
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(bArr);
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Enum enumR) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumR);
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Enum> parser() {
        return PARSER;
    }

    public Parser<Enum> getParserForType() {
        return PARSER;
    }

    public Enum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
