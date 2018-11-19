package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BitmojiKitShare extends GeneratedMessageV3 implements BitmojiKitShareOrBuilder {
    public static final int BITMOJI_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final BitmojiKitShare DEFAULT_INSTANCE = new BitmojiKitShare();
    private static final Parser<BitmojiKitShare> PARSER = new C79011();
    public static final int SEARCH_CATEGORY_FIELD_NUMBER = 5;
    public static final int SEARCH_TERM_FIELD_NUMBER = 6;
    public static final int SHARE_CATEGORY_FIELD_NUMBER = 4;
    public static final int STICKER_ID_FIELD_NUMBER = 3;
    public static final int SUBJECT_USER_IDS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private BitmojiKitEventBase bitmojiKitEventBase_;
    private byte memoizedIsInitialized;
    private int searchCategory_;
    private volatile Object searchTerm_;
    private int shareCategory_;
    private volatile Object stickerId_;
    private LazyStringList subjectUserIds_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare$1 */
    static class C79011 extends AbstractParser<BitmojiKitShare> {
        C79011() {
        }

        public BitmojiKitShare parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitShare(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitShareOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> bitmojiKitEventBaseBuilder_;
        private BitmojiKitEventBase bitmojiKitEventBase_;
        private int searchCategory_;
        private Object searchTerm_;
        private int shareCategory_;
        private Object stickerId_;
        private LazyStringList subjectUserIds_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21726xa2a9d2ab;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21727x39dd1e29.ensureFieldAccessorsInitialized(BitmojiKitShare.class, Builder.class);
        }

        private Builder() {
            this.bitmojiKitEventBase_ = null;
            this.subjectUserIds_ = LazyStringArrayList.EMPTY;
            this.stickerId_ = "";
            this.shareCategory_ = 0;
            this.searchCategory_ = 0;
            this.searchTerm_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.bitmojiKitEventBase_ = null;
            this.subjectUserIds_ = LazyStringArrayList.EMPTY;
            this.stickerId_ = "";
            this.shareCategory_ = 0;
            this.searchCategory_ = 0;
            this.searchTerm_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            BitmojiKitShare.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = null;
            } else {
                this.bitmojiKitEventBase_ = null;
                this.bitmojiKitEventBaseBuilder_ = null;
            }
            this.subjectUserIds_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.stickerId_ = "";
            this.shareCategory_ = 0;
            this.searchCategory_ = 0;
            this.searchTerm_ = "";
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21726xa2a9d2ab;
        }

        public BitmojiKitShare getDefaultInstanceForType() {
            return BitmojiKitShare.getDefaultInstance();
        }

        public BitmojiKitShare build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitShare buildPartial() {
            BitmojiKitShare bitmojiKitShare = new BitmojiKitShare((com.google.protobuf.GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                bitmojiKitShare.bitmojiKitEventBase_ = this.bitmojiKitEventBase_;
            } else {
                bitmojiKitShare.bitmojiKitEventBase_ = (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.build();
            }
            if ((this.bitField0_ & 2) == 2) {
                this.subjectUserIds_ = this.subjectUserIds_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            bitmojiKitShare.subjectUserIds_ = this.subjectUserIds_;
            bitmojiKitShare.stickerId_ = this.stickerId_;
            bitmojiKitShare.shareCategory_ = this.shareCategory_;
            bitmojiKitShare.searchCategory_ = this.searchCategory_;
            bitmojiKitShare.searchTerm_ = this.searchTerm_;
            bitmojiKitShare.bitField0_ = 0;
            onBuilt();
            return bitmojiKitShare;
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
            if (message instanceof BitmojiKitShare) {
                return mergeFrom((BitmojiKitShare) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitShare bitmojiKitShare) {
            if (bitmojiKitShare == BitmojiKitShare.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitShare.hasBitmojiKitEventBase()) {
                mergeBitmojiKitEventBase(bitmojiKitShare.getBitmojiKitEventBase());
            }
            if (!bitmojiKitShare.subjectUserIds_.isEmpty()) {
                if (this.subjectUserIds_.isEmpty()) {
                    this.subjectUserIds_ = bitmojiKitShare.subjectUserIds_;
                    this.bitField0_ &= -3;
                } else {
                    ensureSubjectUserIdsIsMutable();
                    this.subjectUserIds_.addAll(bitmojiKitShare.subjectUserIds_);
                }
                onChanged();
            }
            if (!bitmojiKitShare.getStickerId().isEmpty()) {
                this.stickerId_ = bitmojiKitShare.stickerId_;
                onChanged();
            }
            if (bitmojiKitShare.shareCategory_ != 0) {
                setShareCategoryValue(bitmojiKitShare.getShareCategoryValue());
            }
            if (bitmojiKitShare.searchCategory_ != 0) {
                setSearchCategoryValue(bitmojiKitShare.getSearchCategoryValue());
            }
            if (!bitmojiKitShare.getSearchTerm().isEmpty()) {
                this.searchTerm_ = bitmojiKitShare.searchTerm_;
                onChanged();
            }
            mergeUnknownFields(bitmojiKitShare.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitShare bitmojiKitShare;
            BitmojiKitShare bitmojiKitShare2 = null;
            try {
                BitmojiKitShare bitmojiKitShare3 = (BitmojiKitShare) BitmojiKitShare.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitShare3 != null) {
                    mergeFrom(bitmojiKitShare3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitShare = (BitmojiKitShare) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitShare2 = bitmojiKitShare;
                if (bitmojiKitShare2 != null) {
                    mergeFrom(bitmojiKitShare2);
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

        private void ensureSubjectUserIdsIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
                this.subjectUserIds_ = new LazyStringArrayList(this.subjectUserIds_);
                this.bitField0_ |= 2;
            }
        }

        public ProtocolStringList getSubjectUserIdsList() {
            return this.subjectUserIds_.getUnmodifiableView();
        }

        public int getSubjectUserIdsCount() {
            return this.subjectUserIds_.size();
        }

        public String getSubjectUserIds(int i) {
            return (String) this.subjectUserIds_.get(i);
        }

        public ByteString getSubjectUserIdsBytes(int i) {
            return this.subjectUserIds_.getByteString(i);
        }

        public Builder setSubjectUserIds(int i, String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensureSubjectUserIdsIsMutable();
            this.subjectUserIds_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addSubjectUserIds(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensureSubjectUserIdsIsMutable();
            this.subjectUserIds_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllSubjectUserIds(Iterable<String> iterable) {
            ensureSubjectUserIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.subjectUserIds_);
            onChanged();
            return this;
        }

        public Builder clearSubjectUserIds() {
            this.subjectUserIds_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addSubjectUserIdsBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureSubjectUserIdsIsMutable();
            this.subjectUserIds_.add(byteString);
            onChanged();
            return this;
        }

        public String getStickerId() {
            Object obj = this.stickerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stickerId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getStickerIdBytes() {
            Object obj = this.stickerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stickerId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setStickerId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.stickerId_ = str;
            onChanged();
            return this;
        }

        public Builder clearStickerId() {
            this.stickerId_ = BitmojiKitShare.getDefaultInstance().getStickerId();
            onChanged();
            return this;
        }

        public Builder setStickerIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.stickerId_ = byteString;
            onChanged();
            return this;
        }

        public int getShareCategoryValue() {
            return this.shareCategory_;
        }

        public Builder setShareCategoryValue(int i) {
            this.shareCategory_ = i;
            onChanged();
            return this;
        }

        public BitmojiKitShareCategory getShareCategory() {
            BitmojiKitShareCategory valueOf = BitmojiKitShareCategory.valueOf(this.shareCategory_);
            return valueOf == null ? BitmojiKitShareCategory.UNRECOGNIZED : valueOf;
        }

        public Builder setShareCategory(BitmojiKitShareCategory bitmojiKitShareCategory) {
            if (bitmojiKitShareCategory == null) {
                throw new NullPointerException();
            }
            this.shareCategory_ = bitmojiKitShareCategory.getNumber();
            onChanged();
            return this;
        }

        public Builder clearShareCategory() {
            this.shareCategory_ = 0;
            onChanged();
            return this;
        }

        public int getSearchCategoryValue() {
            return this.searchCategory_;
        }

        public Builder setSearchCategoryValue(int i) {
            this.searchCategory_ = i;
            onChanged();
            return this;
        }

        public BitmojiKitSearchCategory getSearchCategory() {
            BitmojiKitSearchCategory valueOf = BitmojiKitSearchCategory.valueOf(this.searchCategory_);
            return valueOf == null ? BitmojiKitSearchCategory.UNRECOGNIZED : valueOf;
        }

        public Builder setSearchCategory(BitmojiKitSearchCategory bitmojiKitSearchCategory) {
            if (bitmojiKitSearchCategory == null) {
                throw new NullPointerException();
            }
            this.searchCategory_ = bitmojiKitSearchCategory.getNumber();
            onChanged();
            return this;
        }

        public Builder clearSearchCategory() {
            this.searchCategory_ = 0;
            onChanged();
            return this;
        }

        public String getSearchTerm() {
            Object obj = this.searchTerm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.searchTerm_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getSearchTermBytes() {
            Object obj = this.searchTerm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.searchTerm_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSearchTerm(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.searchTerm_ = str;
            onChanged();
            return this;
        }

        public Builder clearSearchTerm() {
            this.searchTerm_ = BitmojiKitShare.getDefaultInstance().getSearchTerm();
            onChanged();
            return this;
        }

        public Builder setSearchTermBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.searchTerm_ = byteString;
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

    private BitmojiKitShare(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitShare() {
        this.memoizedIsInitialized = (byte) -1;
        this.subjectUserIds_ = LazyStringArrayList.EMPTY;
        this.stickerId_ = "";
        this.shareCategory_ = 0;
        this.searchCategory_ = 0;
        this.searchTerm_ = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitShare(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                        if ((i & 2) != 2) {
                            this.subjectUserIds_ = new LazyStringArrayList();
                            i |= 2;
                        }
                        this.subjectUserIds_.add(readStringRequireUtf8);
                    } else if (readTag == 26) {
                        this.stickerId_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 32) {
                        this.shareCategory_ = codedInputStream.readEnum();
                    } else if (readTag == 40) {
                        this.searchCategory_ = codedInputStream.readEnum();
                    } else if (readTag == 50) {
                        this.searchTerm_ = codedInputStream.readStringRequireUtf8();
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
                    this.subjectUserIds_ = this.subjectUserIds_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
        if ((i & 2) == 2) {
            this.subjectUserIds_ = this.subjectUserIds_.getUnmodifiableView();
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptor getDescriptor() {
        return Event.f21726xa2a9d2ab;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21727x39dd1e29.ensureFieldAccessorsInitialized(BitmojiKitShare.class, Builder.class);
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

    public ProtocolStringList getSubjectUserIdsList() {
        return this.subjectUserIds_;
    }

    public int getSubjectUserIdsCount() {
        return this.subjectUserIds_.size();
    }

    public String getSubjectUserIds(int i) {
        return (String) this.subjectUserIds_.get(i);
    }

    public ByteString getSubjectUserIdsBytes(int i) {
        return this.subjectUserIds_.getByteString(i);
    }

    public String getStickerId() {
        Object obj = this.stickerId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.stickerId_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getStickerIdBytes() {
        Object obj = this.stickerId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.stickerId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getShareCategoryValue() {
        return this.shareCategory_;
    }

    public BitmojiKitShareCategory getShareCategory() {
        BitmojiKitShareCategory valueOf = BitmojiKitShareCategory.valueOf(this.shareCategory_);
        return valueOf == null ? BitmojiKitShareCategory.UNRECOGNIZED : valueOf;
    }

    public int getSearchCategoryValue() {
        return this.searchCategory_;
    }

    public BitmojiKitSearchCategory getSearchCategory() {
        BitmojiKitSearchCategory valueOf = BitmojiKitSearchCategory.valueOf(this.searchCategory_);
        return valueOf == null ? BitmojiKitSearchCategory.UNRECOGNIZED : valueOf;
    }

    public String getSearchTerm() {
        Object obj = this.searchTerm_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.searchTerm_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getSearchTermBytes() {
        Object obj = this.searchTerm_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.searchTerm_ = copyFromUtf8;
        return copyFromUtf8;
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
        for (int i = 0; i < this.subjectUserIds_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.subjectUserIds_.getRaw(i));
        }
        if (!getStickerIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.stickerId_);
        }
        if (this.shareCategory_ != BitmojiKitShareCategory.UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY.getNumber()) {
            codedOutputStream.writeEnum(4, this.shareCategory_);
        }
        if (this.searchCategory_ != BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY.getNumber()) {
            codedOutputStream.writeEnum(5, this.searchCategory_);
        }
        if (!getSearchTermBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.searchTerm_);
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
        int i3 = 0;
        while (i2 < this.subjectUserIds_.size()) {
            i3 += GeneratedMessageV3.computeStringSizeNoTag(this.subjectUserIds_.getRaw(i2));
            i2++;
        }
        i = (i + i3) + (getSubjectUserIdsList().size() * 1);
        if (!getStickerIdBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(3, this.stickerId_);
        }
        if (this.shareCategory_ != BitmojiKitShareCategory.UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY.getNumber()) {
            i += CodedOutputStream.computeEnumSize(4, this.shareCategory_);
        }
        if (this.searchCategory_ != BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY.getNumber()) {
            i += CodedOutputStream.computeEnumSize(5, this.searchCategory_);
        }
        if (!getSearchTermBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(6, this.searchTerm_);
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
        if (!(obj instanceof BitmojiKitShare)) {
            return super.equals(obj);
        }
        BitmojiKitShare bitmojiKitShare = (BitmojiKitShare) obj;
        Object obj2 = hasBitmojiKitEventBase() == bitmojiKitShare.hasBitmojiKitEventBase() ? 1 : null;
        if (hasBitmojiKitEventBase()) {
            obj2 = (obj2 == null || !getBitmojiKitEventBase().equals(bitmojiKitShare.getBitmojiKitEventBase())) ? null : 1;
        }
        obj2 = (obj2 == null || !getSubjectUserIdsList().equals(bitmojiKitShare.getSubjectUserIdsList())) ? null : 1;
        obj2 = (obj2 == null || !getStickerId().equals(bitmojiKitShare.getStickerId())) ? null : 1;
        obj2 = (obj2 == null || this.shareCategory_ != bitmojiKitShare.shareCategory_) ? null : 1;
        obj2 = (obj2 == null || this.searchCategory_ != bitmojiKitShare.searchCategory_) ? null : 1;
        obj2 = (obj2 == null || !getSearchTerm().equals(bitmojiKitShare.getSearchTerm())) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(bitmojiKitShare.unknownFields) == null) {
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
        if (getSubjectUserIdsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getSubjectUserIdsList().hashCode();
        }
        hashCode = (((((((((((((((((hashCode * 37) + 3) * 53) + getStickerId().hashCode()) * 37) + 4) * 53) + this.shareCategory_) * 37) + 5) * 53) + this.searchCategory_) * 37) + 6) * 53) + getSearchTerm().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static BitmojiKitShare parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitShare) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitShare parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitShare) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitShare parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitShare) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitShare parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitShare) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitShare parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitShare) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitShare parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitShare) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitShare parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitShare) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitShare parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitShare) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitShare parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitShare) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitShare parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitShare) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitShare parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitShare) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitShare parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitShare) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitShare bitmojiKitShare) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitShare);
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

    public static BitmojiKitShare getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitShare> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitShare> getParserForType() {
        return PARSER;
    }

    public BitmojiKitShare getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
