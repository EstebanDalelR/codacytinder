package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BitmojiKitSearch extends GeneratedMessageV3 implements BitmojiKitSearchOrBuilder {
    public static final int BITMOJI_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final BitmojiKitSearch DEFAULT_INSTANCE = new BitmojiKitSearch();
    private static final Parser<BitmojiKitSearch> PARSER = new C78991();
    public static final int SEARCH_TERMS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private BitmojiKitEventBase bitmojiKitEventBase_;
    private byte memoizedIsInitialized;
    private List<BitmojiKitSearchTerm> searchTerms_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch$1 */
    static class C78991 extends AbstractParser<BitmojiKitSearch> {
        C78991() {
        }

        public BitmojiKitSearch parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitSearch(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitSearchOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> bitmojiKitEventBaseBuilder_;
        private BitmojiKitEventBase bitmojiKitEventBase_;
        private RepeatedFieldBuilderV3<BitmojiKitSearchTerm, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder, BitmojiKitSearchTermOrBuilder> searchTermsBuilder_;
        private List<BitmojiKitSearchTerm> searchTerms_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21724xf1213b0a;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21725xf3d1b788.ensureFieldAccessorsInitialized(BitmojiKitSearch.class, Builder.class);
        }

        private Builder() {
            this.bitmojiKitEventBase_ = null;
            this.searchTerms_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.bitmojiKitEventBase_ = null;
            this.searchTerms_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (BitmojiKitSearch.alwaysUseFieldBuilders) {
                getSearchTermsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = null;
            } else {
                this.bitmojiKitEventBase_ = null;
                this.bitmojiKitEventBaseBuilder_ = null;
            }
            if (this.searchTermsBuilder_ == null) {
                this.searchTerms_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                this.searchTermsBuilder_.clear();
            }
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21724xf1213b0a;
        }

        public BitmojiKitSearch getDefaultInstanceForType() {
            return BitmojiKitSearch.getDefaultInstance();
        }

        public BitmojiKitSearch build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitSearch buildPartial() {
            BitmojiKitSearch bitmojiKitSearch = new BitmojiKitSearch((com.google.protobuf.GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                bitmojiKitSearch.bitmojiKitEventBase_ = this.bitmojiKitEventBase_;
            } else {
                bitmojiKitSearch.bitmojiKitEventBase_ = (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.build();
            }
            if (this.searchTermsBuilder_ == null) {
                if ((this.bitField0_ & 2) == 2) {
                    this.searchTerms_ = Collections.unmodifiableList(this.searchTerms_);
                    this.bitField0_ &= -3;
                }
                bitmojiKitSearch.searchTerms_ = this.searchTerms_;
            } else {
                bitmojiKitSearch.searchTerms_ = this.searchTermsBuilder_.build();
            }
            bitmojiKitSearch.bitField0_ = 0;
            onBuilt();
            return bitmojiKitSearch;
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
            if (message instanceof BitmojiKitSearch) {
                return mergeFrom((BitmojiKitSearch) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitSearch bitmojiKitSearch) {
            if (bitmojiKitSearch == BitmojiKitSearch.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitSearch.hasBitmojiKitEventBase()) {
                mergeBitmojiKitEventBase(bitmojiKitSearch.getBitmojiKitEventBase());
            }
            if (this.searchTermsBuilder_ == null) {
                if (!bitmojiKitSearch.searchTerms_.isEmpty()) {
                    if (this.searchTerms_.isEmpty()) {
                        this.searchTerms_ = bitmojiKitSearch.searchTerms_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureSearchTermsIsMutable();
                        this.searchTerms_.addAll(bitmojiKitSearch.searchTerms_);
                    }
                    onChanged();
                }
            } else if (!bitmojiKitSearch.searchTerms_.isEmpty()) {
                if (this.searchTermsBuilder_.isEmpty()) {
                    this.searchTermsBuilder_.dispose();
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
                    this.searchTermsBuilder_ = null;
                    this.searchTerms_ = bitmojiKitSearch.searchTerms_;
                    this.bitField0_ &= -3;
                    if (BitmojiKitSearch.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getSearchTermsFieldBuilder();
                    }
                    this.searchTermsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.searchTermsBuilder_.addAllMessages(bitmojiKitSearch.searchTerms_);
                }
            }
            mergeUnknownFields(bitmojiKitSearch.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitSearch bitmojiKitSearch;
            BitmojiKitSearch bitmojiKitSearch2 = null;
            try {
                BitmojiKitSearch bitmojiKitSearch3 = (BitmojiKitSearch) BitmojiKitSearch.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitSearch3 != null) {
                    mergeFrom(bitmojiKitSearch3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitSearch = (BitmojiKitSearch) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitSearch2 = bitmojiKitSearch;
                if (bitmojiKitSearch2 != null) {
                    mergeFrom(bitmojiKitSearch2);
                }
                throw codedInputStream2;
            }
        }

        public boolean hasBitmojiKitEventBase() {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                if (this.bitmojiKitEventBase_ == null) {
                    return false;
                }
            }
            return true;
        }

        public BitmojiKitEventBase getBitmojiKitEventBase() {
            if (this.bitmojiKitEventBaseBuilder_ != null) {
                return (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.getMessage();
            }
            return this.bitmojiKitEventBase_ == null ? BitmojiKitEventBase.getDefaultInstance() : this.bitmojiKitEventBase_;
        }

        public Builder setBitmojiKitEventBase(BitmojiKitEventBase bitmojiKitEventBase) {
            if (this.bitmojiKitEventBaseBuilder_ != null) {
                this.bitmojiKitEventBaseBuilder_.setMessage(bitmojiKitEventBase);
            } else if (bitmojiKitEventBase == null) {
                throw new NullPointerException();
            } else {
                this.bitmojiKitEventBase_ = bitmojiKitEventBase;
                onChanged();
            }
            return this;
        }

        public Builder setBitmojiKitEventBase(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder builder) {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitEventBaseBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeBitmojiKitEventBase(BitmojiKitEventBase bitmojiKitEventBase) {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                if (this.bitmojiKitEventBase_ != null) {
                    this.bitmojiKitEventBase_ = BitmojiKitEventBase.newBuilder(this.bitmojiKitEventBase_).mergeFrom(bitmojiKitEventBase).buildPartial();
                } else {
                    this.bitmojiKitEventBase_ = bitmojiKitEventBase;
                }
                onChanged();
            } else {
                this.bitmojiKitEventBaseBuilder_.mergeFrom(bitmojiKitEventBase);
            }
            return this;
        }

        public Builder clearBitmojiKitEventBase() {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = null;
                onChanged();
            } else {
                this.bitmojiKitEventBase_ = null;
                this.bitmojiKitEventBaseBuilder_ = null;
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder getBitmojiKitEventBaseBuilder() {
            onChanged();
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder) getBitmojiKitEventBaseFieldBuilder().getBuilder();
        }

        public BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder() {
            if (this.bitmojiKitEventBaseBuilder_ != null) {
                return (BitmojiKitEventBaseOrBuilder) this.bitmojiKitEventBaseBuilder_.getMessageOrBuilder();
            }
            return this.bitmojiKitEventBase_ == null ? BitmojiKitEventBase.getDefaultInstance() : this.bitmojiKitEventBase_;
        }

        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> getBitmojiKitEventBaseFieldBuilder() {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBaseBuilder_ = new SingleFieldBuilderV3(getBitmojiKitEventBase(), getParentForChildren(), isClean());
                this.bitmojiKitEventBase_ = null;
            }
            return this.bitmojiKitEventBaseBuilder_;
        }

        private void ensureSearchTermsIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
                this.searchTerms_ = new ArrayList(this.searchTerms_);
                this.bitField0_ |= 2;
            }
        }

        public List<BitmojiKitSearchTerm> getSearchTermsList() {
            if (this.searchTermsBuilder_ == null) {
                return Collections.unmodifiableList(this.searchTerms_);
            }
            return this.searchTermsBuilder_.getMessageList();
        }

        public int getSearchTermsCount() {
            if (this.searchTermsBuilder_ == null) {
                return this.searchTerms_.size();
            }
            return this.searchTermsBuilder_.getCount();
        }

        public BitmojiKitSearchTerm getSearchTerms(int i) {
            if (this.searchTermsBuilder_ == null) {
                return (BitmojiKitSearchTerm) this.searchTerms_.get(i);
            }
            return (BitmojiKitSearchTerm) this.searchTermsBuilder_.getMessage(i);
        }

        public Builder setSearchTerms(int i, BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            if (this.searchTermsBuilder_ != null) {
                this.searchTermsBuilder_.setMessage(i, bitmojiKitSearchTerm);
            } else if (bitmojiKitSearchTerm == null) {
                throw new NullPointerException();
            } else {
                ensureSearchTermsIsMutable();
                this.searchTerms_.set(i, bitmojiKitSearchTerm);
                onChanged();
            }
            return this;
        }

        public Builder setSearchTerms(int i, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder builder) {
            if (this.searchTermsBuilder_ == null) {
                ensureSearchTermsIsMutable();
                this.searchTerms_.set(i, builder.build());
                onChanged();
            } else {
                this.searchTermsBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addSearchTerms(BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            if (this.searchTermsBuilder_ != null) {
                this.searchTermsBuilder_.addMessage(bitmojiKitSearchTerm);
            } else if (bitmojiKitSearchTerm == null) {
                throw new NullPointerException();
            } else {
                ensureSearchTermsIsMutable();
                this.searchTerms_.add(bitmojiKitSearchTerm);
                onChanged();
            }
            return this;
        }

        public Builder addSearchTerms(int i, BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            if (this.searchTermsBuilder_ != null) {
                this.searchTermsBuilder_.addMessage(i, bitmojiKitSearchTerm);
            } else if (bitmojiKitSearchTerm == null) {
                throw new NullPointerException();
            } else {
                ensureSearchTermsIsMutable();
                this.searchTerms_.add(i, bitmojiKitSearchTerm);
                onChanged();
            }
            return this;
        }

        public Builder addSearchTerms(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder builder) {
            if (this.searchTermsBuilder_ == null) {
                ensureSearchTermsIsMutable();
                this.searchTerms_.add(builder.build());
                onChanged();
            } else {
                this.searchTermsBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public Builder addSearchTerms(int i, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder builder) {
            if (this.searchTermsBuilder_ == null) {
                ensureSearchTermsIsMutable();
                this.searchTerms_.add(i, builder.build());
                onChanged();
            } else {
                this.searchTermsBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllSearchTerms(Iterable<? extends BitmojiKitSearchTerm> iterable) {
            if (this.searchTermsBuilder_ == null) {
                ensureSearchTermsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.searchTerms_);
                onChanged();
            } else {
                this.searchTermsBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearSearchTerms() {
            if (this.searchTermsBuilder_ == null) {
                this.searchTerms_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                this.searchTermsBuilder_.clear();
            }
            return this;
        }

        public Builder removeSearchTerms(int i) {
            if (this.searchTermsBuilder_ == null) {
                ensureSearchTermsIsMutable();
                this.searchTerms_.remove(i);
                onChanged();
            } else {
                this.searchTermsBuilder_.remove(i);
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder getSearchTermsBuilder(int i) {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder) getSearchTermsFieldBuilder().getBuilder(i);
        }

        public BitmojiKitSearchTermOrBuilder getSearchTermsOrBuilder(int i) {
            if (this.searchTermsBuilder_ == null) {
                return (BitmojiKitSearchTermOrBuilder) this.searchTerms_.get(i);
            }
            return (BitmojiKitSearchTermOrBuilder) this.searchTermsBuilder_.getMessageOrBuilder(i);
        }

        public List<? extends BitmojiKitSearchTermOrBuilder> getSearchTermsOrBuilderList() {
            if (this.searchTermsBuilder_ != null) {
                return this.searchTermsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.searchTerms_);
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder addSearchTermsBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder) getSearchTermsFieldBuilder().addBuilder(BitmojiKitSearchTerm.getDefaultInstance());
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder addSearchTermsBuilder(int i) {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder) getSearchTermsFieldBuilder().addBuilder(i, BitmojiKitSearchTerm.getDefaultInstance());
        }

        public List<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder> getSearchTermsBuilderList() {
            return getSearchTermsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<BitmojiKitSearchTerm, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.Builder, BitmojiKitSearchTermOrBuilder> getSearchTermsFieldBuilder() {
            if (this.searchTermsBuilder_ == null) {
                this.searchTermsBuilder_ = new RepeatedFieldBuilderV3(this.searchTerms_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                this.searchTerms_ = null;
            }
            return this.searchTermsBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private BitmojiKitSearch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitSearch() {
        this.memoizedIsInitialized = (byte) -1;
        this.searchTerms_ = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitSearch(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        int i = 0;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 10) {
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder builder = null;
                        if (this.bitmojiKitEventBase_ != null) {
                            builder = this.bitmojiKitEventBase_.toBuilder();
                        }
                        this.bitmojiKitEventBase_ = (BitmojiKitEventBase) codedInputStream.readMessage(BitmojiKitEventBase.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom(this.bitmojiKitEventBase_);
                            this.bitmojiKitEventBase_ = builder.buildPartial();
                        }
                    } else if (readTag == 18) {
                        if ((i & 2) != 2) {
                            this.searchTerms_ = new ArrayList();
                            i |= 2;
                        }
                        this.searchTerms_.add(codedInputStream.readMessage(BitmojiKitSearchTerm.parser(), extensionRegistryLite));
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
                    this.searchTerms_ = Collections.unmodifiableList(this.searchTerms_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
        if ((i & 2) == 2) {
            this.searchTerms_ = Collections.unmodifiableList(this.searchTerms_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptor getDescriptor() {
        return Event.f21724xf1213b0a;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21725xf3d1b788.ensureFieldAccessorsInitialized(BitmojiKitSearch.class, Builder.class);
    }

    public boolean hasBitmojiKitEventBase() {
        return this.bitmojiKitEventBase_ != null;
    }

    public BitmojiKitEventBase getBitmojiKitEventBase() {
        return this.bitmojiKitEventBase_ == null ? BitmojiKitEventBase.getDefaultInstance() : this.bitmojiKitEventBase_;
    }

    public BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder() {
        return getBitmojiKitEventBase();
    }

    public List<BitmojiKitSearchTerm> getSearchTermsList() {
        return this.searchTerms_;
    }

    public List<? extends BitmojiKitSearchTermOrBuilder> getSearchTermsOrBuilderList() {
        return this.searchTerms_;
    }

    public int getSearchTermsCount() {
        return this.searchTerms_.size();
    }

    public BitmojiKitSearchTerm getSearchTerms(int i) {
        return (BitmojiKitSearchTerm) this.searchTerms_.get(i);
    }

    public BitmojiKitSearchTermOrBuilder getSearchTermsOrBuilder(int i) {
        return (BitmojiKitSearchTermOrBuilder) this.searchTerms_.get(i);
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
        if (this.bitmojiKitEventBase_ != null) {
            codedOutputStream.writeMessage(1, getBitmojiKitEventBase());
        }
        for (int i = 0; i < this.searchTerms_.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.searchTerms_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        i = this.bitmojiKitEventBase_ != null ? CodedOutputStream.computeMessageSize(1, getBitmojiKitEventBase()) + 0 : 0;
        while (i2 < this.searchTerms_.size()) {
            i += CodedOutputStream.computeMessageSize(2, (MessageLite) this.searchTerms_.get(i2));
            i2++;
        }
        i += this.unknownFields.getSerializedSize();
        this.memoizedSize = i;
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitSearch)) {
            return super.equals(obj);
        }
        BitmojiKitSearch bitmojiKitSearch = (BitmojiKitSearch) obj;
        Object obj2 = hasBitmojiKitEventBase() == bitmojiKitSearch.hasBitmojiKitEventBase() ? 1 : null;
        if (hasBitmojiKitEventBase()) {
            obj2 = (obj2 == null || !getBitmojiKitEventBase().equals(bitmojiKitSearch.getBitmojiKitEventBase())) ? null : 1;
        }
        obj2 = (obj2 == null || !getSearchTermsList().equals(bitmojiKitSearch.getSearchTermsList())) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(bitmojiKitSearch.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasBitmojiKitEventBase()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getBitmojiKitEventBase().hashCode();
        }
        if (getSearchTermsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getSearchTermsList().hashCode();
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static BitmojiKitSearch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitSearch) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitSearch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSearch) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitSearch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitSearch) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitSearch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSearch) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitSearch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitSearch) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitSearch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSearch) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitSearch parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSearch) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSearch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSearch) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSearch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSearch) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSearch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSearch) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSearch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitSearch) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitSearch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSearch) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitSearch bitmojiKitSearch) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitSearch);
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

    public static BitmojiKitSearch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitSearch> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitSearch> getParserForType() {
        return PARSER;
    }

    public BitmojiKitSearch getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
