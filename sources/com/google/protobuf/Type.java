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

public final class Type extends GeneratedMessageV3 implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE = new Type();
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static final Parser<Type> PARSER = new C77921();
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<Field> fields_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private LazyStringList oneofs_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Type$1 */
    static class C77921 extends AbstractParser<Type> {
        C77921() {
        }

        public Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Type(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements TypeOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Field, com.google.protobuf.Field.Builder, FieldOrBuilder> fieldsBuilder_;
        private List<Field> fields_;
        private Object name_;
        private LazyStringList oneofs_;
        private RepeatedFieldBuilderV3<Option, com.google.protobuf.Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilderV3<SourceContext, com.google.protobuf.SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return TypeProto.internal_static_google_protobuf_Type_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TypeProto.internal_static_google_protobuf_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(Type.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.fields_ = Collections.emptyList();
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.fields_ = Collections.emptyList();
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getFieldsFieldBuilder();
                getOptionsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.name_ = "";
            if (this.fieldsBuilder_ == null) {
                this.fields_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                this.fieldsBuilder_.clear();
            }
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -9;
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
            return TypeProto.internal_static_google_protobuf_Type_descriptor;
        }

        public Type getDefaultInstanceForType() {
            return Type.getDefaultInstance();
        }

        public Type build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public Type buildPartial() {
            Type type = new Type((com.google.protobuf.GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            type.name_ = this.name_;
            if (this.fieldsBuilder_ == null) {
                if ((this.bitField0_ & 2) == 2) {
                    this.fields_ = Collections.unmodifiableList(this.fields_);
                    this.bitField0_ &= -3;
                }
                type.fields_ = this.fields_;
            } else {
                type.fields_ = this.fieldsBuilder_.build();
            }
            if ((this.bitField0_ & 4) == 4) {
                this.oneofs_ = this.oneofs_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            type.oneofs_ = this.oneofs_;
            if (this.optionsBuilder_ == null) {
                if ((this.bitField0_ & 8) == 8) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -9;
                }
                type.options_ = this.options_;
            } else {
                type.options_ = this.optionsBuilder_.build();
            }
            if (this.sourceContextBuilder_ == null) {
                type.sourceContext_ = this.sourceContext_;
            } else {
                type.sourceContext_ = (SourceContext) this.sourceContextBuilder_.build();
            }
            type.syntax_ = this.syntax_;
            type.bitField0_ = 0;
            onBuilt();
            return type;
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
            if (message instanceof Type) {
                return mergeFrom((Type) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Type type) {
            if (type == Type.getDefaultInstance()) {
                return this;
            }
            if (!type.getName().isEmpty()) {
                this.name_ = type.name_;
                onChanged();
            }
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
            if (this.fieldsBuilder_ == null) {
                if (!type.fields_.isEmpty()) {
                    if (this.fields_.isEmpty()) {
                        this.fields_ = type.fields_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureFieldsIsMutable();
                        this.fields_.addAll(type.fields_);
                    }
                    onChanged();
                }
            } else if (!type.fields_.isEmpty()) {
                if (this.fieldsBuilder_.isEmpty()) {
                    this.fieldsBuilder_.dispose();
                    this.fieldsBuilder_ = null;
                    this.fields_ = type.fields_;
                    this.bitField0_ &= -3;
                    this.fieldsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFieldsFieldBuilder() : null;
                } else {
                    this.fieldsBuilder_.addAllMessages(type.fields_);
                }
            }
            if (!type.oneofs_.isEmpty()) {
                if (this.oneofs_.isEmpty()) {
                    this.oneofs_ = type.oneofs_;
                    this.bitField0_ &= -5;
                } else {
                    ensureOneofsIsMutable();
                    this.oneofs_.addAll(type.oneofs_);
                }
                onChanged();
            }
            if (this.optionsBuilder_ == null) {
                if (!type.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = type.options_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(type.options_);
                    }
                    onChanged();
                }
            } else if (!type.options_.isEmpty()) {
                if (this.optionsBuilder_.isEmpty()) {
                    this.optionsBuilder_.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = type.options_;
                    this.bitField0_ &= -9;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getOptionsFieldBuilder();
                    }
                    this.optionsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.optionsBuilder_.addAllMessages(type.options_);
                }
            }
            if (type.hasSourceContext()) {
                mergeSourceContext(type.getSourceContext());
            }
            if (type.syntax_ != 0) {
                setSyntaxValue(type.getSyntaxValue());
            }
            mergeUnknownFields(type.unknownFields);
            onChanged();
            return this;
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
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                type2 = type;
                if (type2 != null) {
                    mergeFrom(type2);
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
            this.name_ = Type.getDefaultInstance().getName();
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

        private void ensureFieldsIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
                this.fields_ = new ArrayList(this.fields_);
                this.bitField0_ |= 2;
            }
        }

        public List<Field> getFieldsList() {
            if (this.fieldsBuilder_ == null) {
                return Collections.unmodifiableList(this.fields_);
            }
            return this.fieldsBuilder_.getMessageList();
        }

        public int getFieldsCount() {
            if (this.fieldsBuilder_ == null) {
                return this.fields_.size();
            }
            return this.fieldsBuilder_.getCount();
        }

        public Field getFields(int i) {
            if (this.fieldsBuilder_ == null) {
                return (Field) this.fields_.get(i);
            }
            return (Field) this.fieldsBuilder_.getMessage(i);
        }

        public Builder setFields(int i, Field field) {
            if (this.fieldsBuilder_ != null) {
                this.fieldsBuilder_.setMessage(i, field);
            } else if (field == null) {
                throw new NullPointerException();
            } else {
                ensureFieldsIsMutable();
                this.fields_.set(i, field);
                onChanged();
            }
            return this;
        }

        public Builder setFields(int i, com.google.protobuf.Field.Builder builder) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.set(i, builder.build());
                onChanged();
            } else {
                this.fieldsBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addFields(Field field) {
            if (this.fieldsBuilder_ != null) {
                this.fieldsBuilder_.addMessage(field);
            } else if (field == null) {
                throw new NullPointerException();
            } else {
                ensureFieldsIsMutable();
                this.fields_.add(field);
                onChanged();
            }
            return this;
        }

        public Builder addFields(int i, Field field) {
            if (this.fieldsBuilder_ != null) {
                this.fieldsBuilder_.addMessage(i, field);
            } else if (field == null) {
                throw new NullPointerException();
            } else {
                ensureFieldsIsMutable();
                this.fields_.add(i, field);
                onChanged();
            }
            return this;
        }

        public Builder addFields(com.google.protobuf.Field.Builder builder) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.add(builder.build());
                onChanged();
            } else {
                this.fieldsBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public Builder addFields(int i, com.google.protobuf.Field.Builder builder) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.add(i, builder.build());
                onChanged();
            } else {
                this.fieldsBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllFields(Iterable<? extends Field> iterable) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.fields_);
                onChanged();
            } else {
                this.fieldsBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearFields() {
            if (this.fieldsBuilder_ == null) {
                this.fields_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                this.fieldsBuilder_.clear();
            }
            return this;
        }

        public Builder removeFields(int i) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.remove(i);
                onChanged();
            } else {
                this.fieldsBuilder_.remove(i);
            }
            return this;
        }

        public com.google.protobuf.Field.Builder getFieldsBuilder(int i) {
            return (com.google.protobuf.Field.Builder) getFieldsFieldBuilder().getBuilder(i);
        }

        public FieldOrBuilder getFieldsOrBuilder(int i) {
            if (this.fieldsBuilder_ == null) {
                return (FieldOrBuilder) this.fields_.get(i);
            }
            return (FieldOrBuilder) this.fieldsBuilder_.getMessageOrBuilder(i);
        }

        public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
            if (this.fieldsBuilder_ != null) {
                return this.fieldsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.fields_);
        }

        public com.google.protobuf.Field.Builder addFieldsBuilder() {
            return (com.google.protobuf.Field.Builder) getFieldsFieldBuilder().addBuilder(Field.getDefaultInstance());
        }

        public com.google.protobuf.Field.Builder addFieldsBuilder(int i) {
            return (com.google.protobuf.Field.Builder) getFieldsFieldBuilder().addBuilder(i, Field.getDefaultInstance());
        }

        public List<com.google.protobuf.Field.Builder> getFieldsBuilderList() {
            return getFieldsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Field, com.google.protobuf.Field.Builder, FieldOrBuilder> getFieldsFieldBuilder() {
            if (this.fieldsBuilder_ == null) {
                this.fieldsBuilder_ = new RepeatedFieldBuilderV3(this.fields_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                this.fields_ = null;
            }
            return this.fieldsBuilder_;
        }

        private void ensureOneofsIsMutable() {
            if ((this.bitField0_ & 4) != 4) {
                this.oneofs_ = new LazyStringArrayList(this.oneofs_);
                this.bitField0_ |= 4;
            }
        }

        public ProtocolStringList getOneofsList() {
            return this.oneofs_.getUnmodifiableView();
        }

        public int getOneofsCount() {
            return this.oneofs_.size();
        }

        public String getOneofs(int i) {
            return (String) this.oneofs_.get(i);
        }

        public ByteString getOneofsBytes(int i) {
            return this.oneofs_.getByteString(i);
        }

        public Builder setOneofs(int i, String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensureOneofsIsMutable();
            this.oneofs_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addOneofs(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensureOneofsIsMutable();
            this.oneofs_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllOneofs(Iterable<String> iterable) {
            ensureOneofsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.oneofs_);
            onChanged();
            return this;
        }

        public Builder clearOneofs() {
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addOneofsBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureOneofsIsMutable();
            this.oneofs_.add(byteString);
            onChanged();
            return this;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 8) != 8) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 8;
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
                this.bitField0_ &= -9;
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
                this.optionsBuilder_ = new RepeatedFieldBuilderV3(this.options_, (this.bitField0_ & 8) == 8, getParentForChildren(), isClean());
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

    private Type(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Type() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.fields_ = Collections.emptyList();
        this.oneofs_ = LazyStringArrayList.EMPTY;
        this.options_ = Collections.emptyList();
        this.syntax_ = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.fields_ = new ArrayList();
                            i |= 2;
                        }
                        this.fields_.add(codedInputStream.readMessage(Field.parser(), extensionRegistryLite));
                    } else if (readTag == 26) {
                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                        if ((i & 4) != 4) {
                            this.oneofs_ = new LazyStringArrayList();
                            i |= 4;
                        }
                        this.oneofs_.add(readStringRequireUtf8);
                    } else if (readTag == 34) {
                        if ((i & 8) != 8) {
                            this.options_ = new ArrayList();
                            i |= 8;
                        }
                        this.options_.add(codedInputStream.readMessage(Option.parser(), extensionRegistryLite));
                    } else if (readTag == 42) {
                        com.google.protobuf.SourceContext.Builder builder = null;
                        if (this.sourceContext_ != null) {
                            builder = this.sourceContext_.toBuilder();
                        }
                        this.sourceContext_ = (SourceContext) codedInputStream.readMessage(SourceContext.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom(this.sourceContext_);
                            this.sourceContext_ = builder.buildPartial();
                        }
                    } else if (readTag == 48) {
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
                    this.fields_ = Collections.unmodifiableList(this.fields_);
                }
                if ((i & 4) == 4) {
                    this.oneofs_ = this.oneofs_.getUnmodifiableView();
                }
                if ((i & 8) == 8) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
        if ((i & 2) == 2) {
            this.fields_ = Collections.unmodifiableList(this.fields_);
        }
        if ((i & 4) == 4) {
            this.oneofs_ = this.oneofs_.getUnmodifiableView();
        }
        if ((i & 8) == 8) {
            this.options_ = Collections.unmodifiableList(this.options_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptor getDescriptor() {
        return TypeProto.internal_static_google_protobuf_Type_descriptor;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return TypeProto.internal_static_google_protobuf_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(Type.class, Builder.class);
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

    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public Field getFields(int i) {
        return (Field) this.fields_.get(i);
    }

    public FieldOrBuilder getFieldsOrBuilder(int i) {
        return (FieldOrBuilder) this.fields_.get(i);
    }

    public ProtocolStringList getOneofsList() {
        return this.oneofs_;
    }

    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    public String getOneofs(int i) {
        return (String) this.oneofs_.get(i);
    }

    public ByteString getOneofsBytes(int i) {
        return this.oneofs_.getByteString(i);
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
        int i;
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (i = 0; i < this.fields_.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.fields_.get(i));
        }
        for (i = 0; i < this.oneofs_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.oneofs_.getRaw(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.options_.get(i2));
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.writeMessage(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(6, this.syntax_);
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
        for (i = 0; i < this.fields_.size(); i++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.fields_.get(i));
        }
        int i3 = 0;
        for (i = 0; i < this.oneofs_.size(); i++) {
            i3 += GeneratedMessageV3.computeStringSizeNoTag(this.oneofs_.getRaw(i));
        }
        computeStringSize = (computeStringSize + i3) + (getOneofsList().size() * 1);
        while (i2 < this.options_.size()) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.options_.get(i2));
            i2++;
        }
        if (this.sourceContext_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(6, this.syntax_);
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
        if (!(obj instanceof Type)) {
            return super.equals(obj);
        }
        Type type = (Type) obj;
        Object obj2 = ((getName().equals(type.getName()) ? 1 : null) == null || !getFieldsList().equals(type.getFieldsList())) ? null : 1;
        obj2 = (obj2 == null || !getOneofsList().equals(type.getOneofsList())) ? null : 1;
        obj2 = (obj2 == null || !getOptionsList().equals(type.getOptionsList())) ? null : 1;
        obj2 = (obj2 == null || hasSourceContext() != type.hasSourceContext()) ? null : 1;
        if (hasSourceContext()) {
            obj2 = (obj2 == null || !getSourceContext().equals(type.getSourceContext())) ? null : 1;
        }
        obj2 = (obj2 == null || this.syntax_ != type.syntax_) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(type.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (getFieldsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getFieldsList().hashCode();
        }
        if (getOneofsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getOneofsList().hashCode();
        }
        if (getOptionsCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getOptionsList().hashCode();
        }
        if (hasSourceContext()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getSourceContext().hashCode();
        }
        hashCode = (((((hashCode * 37) + 6) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteBuffer);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteString);
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(bArr);
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Type type) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(type);
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

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Type> parser() {
        return PARSER;
    }

    public Parser<Type> getParserForType() {
        return PARSER;
    }

    public Type getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
