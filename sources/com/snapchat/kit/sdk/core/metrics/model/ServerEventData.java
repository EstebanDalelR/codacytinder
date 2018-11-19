package com.snapchat.kit.sdk.core.metrics.model;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
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
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ServerEventData extends GeneratedMessageV3 implements ServerEventDataOrBuilder {
    public static final int BITMOJI_KIT_CREATE_AVATAR_TAP_FIELD_NUMBER = 36;
    public static final int BITMOJI_KIT_SEARCH_FIELD_NUMBER = 33;
    public static final int BITMOJI_KIT_SHARE_FIELD_NUMBER = 32;
    public static final int BITMOJI_KIT_SNAPCHAT_LINK_SUCCESS_FIELD_NUMBER = 35;
    public static final int BITMOJI_KIT_SNAPCHAT_LINK_TAP_FIELD_NUMBER = 34;
    public static final int BITMOJI_KIT_STICKER_PICKER_CLOSE_FIELD_NUMBER = 31;
    public static final int BITMOJI_KIT_STICKER_PICKER_OPEN_FIELD_NUMBER = 30;
    public static final int CREATIVE_KIT_SHARE_COMPLETE_FIELD_NUMBER = 29;
    public static final int CREATIVE_KIT_SHARE_START_FIELD_NUMBER = 28;
    private static final ServerEventData DEFAULT_INSTANCE = new ServerEventData();
    public static final int LOGIN_KIT_AUTH_COMPLETE_FIELD_NUMBER = 38;
    public static final int LOGIN_KIT_AUTH_START_FIELD_NUMBER = 37;
    private static final Parser<ServerEventData> PARSER = new C79201();
    private static final long serialVersionUID = 0;
    private int eventTypeCase_;
    private Object eventType_;
    private byte memoizedIsInitialized;

    public enum EventTypeCase implements EnumLite {
        CREATIVE_KIT_SHARE_START(28),
        CREATIVE_KIT_SHARE_COMPLETE(29),
        BITMOJI_KIT_STICKER_PICKER_OPEN(30),
        BITMOJI_KIT_STICKER_PICKER_CLOSE(31),
        BITMOJI_KIT_SHARE(32),
        BITMOJI_KIT_SEARCH(33),
        BITMOJI_KIT_SNAPCHAT_LINK_TAP(34),
        BITMOJI_KIT_SNAPCHAT_LINK_SUCCESS(35),
        BITMOJI_KIT_CREATE_AVATAR_TAP(36),
        LOGIN_KIT_AUTH_START(37),
        LOGIN_KIT_AUTH_COMPLETE(38),
        EVENTTYPE_NOT_SET(0);
        
        private final int value;

        private EventTypeCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static EventTypeCase valueOf(int i) {
            return forNumber(i);
        }

        public static EventTypeCase forNumber(int i) {
            if (i == 0) {
                return EVENTTYPE_NOT_SET;
            }
            switch (i) {
                case 28:
                    return CREATIVE_KIT_SHARE_START;
                case 29:
                    return CREATIVE_KIT_SHARE_COMPLETE;
                case 30:
                    return BITMOJI_KIT_STICKER_PICKER_OPEN;
                case 31:
                    return BITMOJI_KIT_STICKER_PICKER_CLOSE;
                case 32:
                    return BITMOJI_KIT_SHARE;
                case 33:
                    return BITMOJI_KIT_SEARCH;
                case 34:
                    return BITMOJI_KIT_SNAPCHAT_LINK_TAP;
                case 35:
                    return BITMOJI_KIT_SNAPCHAT_LINK_SUCCESS;
                case 36:
                    return BITMOJI_KIT_CREATE_AVATAR_TAP;
                case 37:
                    return LOGIN_KIT_AUTH_START;
                case 38:
                    return LOGIN_KIT_AUTH_COMPLETE;
                default:
                    return 0;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.ServerEventData$1 */
    static class C79201 extends AbstractParser<ServerEventData> {
        C79201() {
        }

        public ServerEventData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ServerEventData(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements ServerEventDataOrBuilder {
        private SingleFieldBuilderV3<BitmojiKitCreateAvatarTap, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap.Builder, BitmojiKitCreateAvatarTapOrBuilder> bitmojiKitCreateAvatarTapBuilder_;
        private SingleFieldBuilderV3<BitmojiKitSearch, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch.Builder, BitmojiKitSearchOrBuilder> bitmojiKitSearchBuilder_;
        private SingleFieldBuilderV3<BitmojiKitShare, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.Builder, BitmojiKitShareOrBuilder> bitmojiKitShareBuilder_;
        private SingleFieldBuilderV3<BitmojiKitSnapchatLinkSuccess, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess.Builder, BitmojiKitSnapchatLinkSuccessOrBuilder> bitmojiKitSnapchatLinkSuccessBuilder_;
        private SingleFieldBuilderV3<BitmojiKitSnapchatLinkTap, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap.Builder, BitmojiKitSnapchatLinkTapOrBuilder> bitmojiKitSnapchatLinkTapBuilder_;
        private SingleFieldBuilderV3<BitmojiKitStickerPickerClose, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose.Builder, BitmojiKitStickerPickerCloseOrBuilder> bitmojiKitStickerPickerCloseBuilder_;
        private SingleFieldBuilderV3<BitmojiKitStickerPickerOpen, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen.Builder, BitmojiKitStickerPickerOpenOrBuilder> bitmojiKitStickerPickerOpenBuilder_;
        private SingleFieldBuilderV3<CreativeKitShareComplete, com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete.Builder, CreativeKitShareCompleteOrBuilder> creativeKitShareCompleteBuilder_;
        private SingleFieldBuilderV3<CreativeKitShareStart, com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart.Builder, CreativeKitShareStartOrBuilder> creativeKitShareStartBuilder_;
        private int eventTypeCase_;
        private Object eventType_;
        private SingleFieldBuilderV3<LoginKitAuthComplete, com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete.Builder, LoginKitAuthCompleteOrBuilder> loginKitAuthCompleteBuilder_;
        private SingleFieldBuilderV3<LoginKitAuthStart, com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart.Builder, LoginKitAuthStartOrBuilder> loginKitAuthStartBuilder_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21752xaa6c74c1;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21753x6bbf4a3f.ensureFieldAccessorsInitialized(ServerEventData.class, Builder.class);
        }

        private Builder() {
            this.eventTypeCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.eventTypeCase_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            ServerEventData.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21752xaa6c74c1;
        }

        public ServerEventData getDefaultInstanceForType() {
            return ServerEventData.getDefaultInstance();
        }

        public ServerEventData build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public ServerEventData buildPartial() {
            ServerEventData serverEventData = new ServerEventData((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.eventTypeCase_ == 28) {
                if (this.creativeKitShareStartBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.creativeKitShareStartBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 29) {
                if (this.creativeKitShareCompleteBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.creativeKitShareCompleteBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 30) {
                if (this.bitmojiKitStickerPickerOpenBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.bitmojiKitStickerPickerOpenBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 31) {
                if (this.bitmojiKitStickerPickerCloseBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.bitmojiKitStickerPickerCloseBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 32) {
                if (this.bitmojiKitShareBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.bitmojiKitShareBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 33) {
                if (this.bitmojiKitSearchBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.bitmojiKitSearchBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 34) {
                if (this.bitmojiKitSnapchatLinkTapBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.bitmojiKitSnapchatLinkTapBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 35) {
                if (this.bitmojiKitSnapchatLinkSuccessBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.bitmojiKitSnapchatLinkSuccessBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 36) {
                if (this.bitmojiKitCreateAvatarTapBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.bitmojiKitCreateAvatarTapBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 37) {
                if (this.loginKitAuthStartBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.loginKitAuthStartBuilder_.build();
                }
            }
            if (this.eventTypeCase_ == 38) {
                if (this.loginKitAuthCompleteBuilder_ == null) {
                    serverEventData.eventType_ = this.eventType_;
                } else {
                    serverEventData.eventType_ = this.loginKitAuthCompleteBuilder_.build();
                }
            }
            serverEventData.eventTypeCase_ = this.eventTypeCase_;
            onBuilt();
            return serverEventData;
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
            if (message instanceof ServerEventData) {
                return mergeFrom((ServerEventData) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ServerEventData serverEventData) {
            if (serverEventData == ServerEventData.getDefaultInstance()) {
                return this;
            }
            switch (serverEventData.getEventTypeCase()) {
                case CREATIVE_KIT_SHARE_START:
                    mergeCreativeKitShareStart(serverEventData.getCreativeKitShareStart());
                    break;
                case CREATIVE_KIT_SHARE_COMPLETE:
                    mergeCreativeKitShareComplete(serverEventData.getCreativeKitShareComplete());
                    break;
                case BITMOJI_KIT_STICKER_PICKER_OPEN:
                    mergeBitmojiKitStickerPickerOpen(serverEventData.getBitmojiKitStickerPickerOpen());
                    break;
                case BITMOJI_KIT_STICKER_PICKER_CLOSE:
                    mergeBitmojiKitStickerPickerClose(serverEventData.getBitmojiKitStickerPickerClose());
                    break;
                case BITMOJI_KIT_SHARE:
                    mergeBitmojiKitShare(serverEventData.getBitmojiKitShare());
                    break;
                case BITMOJI_KIT_SEARCH:
                    mergeBitmojiKitSearch(serverEventData.getBitmojiKitSearch());
                    break;
                case BITMOJI_KIT_SNAPCHAT_LINK_TAP:
                    mergeBitmojiKitSnapchatLinkTap(serverEventData.getBitmojiKitSnapchatLinkTap());
                    break;
                case BITMOJI_KIT_SNAPCHAT_LINK_SUCCESS:
                    mergeBitmojiKitSnapchatLinkSuccess(serverEventData.getBitmojiKitSnapchatLinkSuccess());
                    break;
                case BITMOJI_KIT_CREATE_AVATAR_TAP:
                    mergeBitmojiKitCreateAvatarTap(serverEventData.getBitmojiKitCreateAvatarTap());
                    break;
                case LOGIN_KIT_AUTH_START:
                    mergeLoginKitAuthStart(serverEventData.getLoginKitAuthStart());
                    break;
                case LOGIN_KIT_AUTH_COMPLETE:
                    mergeLoginKitAuthComplete(serverEventData.getLoginKitAuthComplete());
                    break;
                default:
                    break;
            }
            mergeUnknownFields(serverEventData.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ServerEventData serverEventData;
            ServerEventData serverEventData2 = null;
            try {
                ServerEventData serverEventData3 = (ServerEventData) ServerEventData.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (serverEventData3 != null) {
                    mergeFrom(serverEventData3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                serverEventData = (ServerEventData) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                serverEventData2 = serverEventData;
                if (serverEventData2 != null) {
                    mergeFrom(serverEventData2);
                }
                throw codedInputStream2;
            }
        }

        public EventTypeCase getEventTypeCase() {
            return EventTypeCase.forNumber(this.eventTypeCase_);
        }

        public Builder clearEventType() {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
            onChanged();
            return this;
        }

        public boolean hasCreativeKitShareStart() {
            return this.eventTypeCase_ == 28;
        }

        public CreativeKitShareStart getCreativeKitShareStart() {
            if (this.creativeKitShareStartBuilder_ == null) {
                if (this.eventTypeCase_ == 28) {
                    return (CreativeKitShareStart) this.eventType_;
                }
                return CreativeKitShareStart.getDefaultInstance();
            } else if (this.eventTypeCase_ == 28) {
                return (CreativeKitShareStart) this.creativeKitShareStartBuilder_.getMessage();
            } else {
                return CreativeKitShareStart.getDefaultInstance();
            }
        }

        public Builder setCreativeKitShareStart(CreativeKitShareStart creativeKitShareStart) {
            if (this.creativeKitShareStartBuilder_ != null) {
                this.creativeKitShareStartBuilder_.setMessage(creativeKitShareStart);
            } else if (creativeKitShareStart == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = creativeKitShareStart;
                onChanged();
            }
            this.eventTypeCase_ = 28;
            return this;
        }

        public Builder setCreativeKitShareStart(com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart.Builder builder) {
            if (this.creativeKitShareStartBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.creativeKitShareStartBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 28;
            return this;
        }

        public Builder mergeCreativeKitShareStart(CreativeKitShareStart creativeKitShareStart) {
            if (this.creativeKitShareStartBuilder_ == null) {
                if (this.eventTypeCase_ != 28 || this.eventType_ == CreativeKitShareStart.getDefaultInstance()) {
                    this.eventType_ = creativeKitShareStart;
                } else {
                    this.eventType_ = CreativeKitShareStart.newBuilder((CreativeKitShareStart) this.eventType_).mergeFrom(creativeKitShareStart).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 28) {
                    this.creativeKitShareStartBuilder_.mergeFrom(creativeKitShareStart);
                }
                this.creativeKitShareStartBuilder_.setMessage(creativeKitShareStart);
            }
            this.eventTypeCase_ = 28;
            return this;
        }

        public Builder clearCreativeKitShareStart() {
            if (this.creativeKitShareStartBuilder_ != null) {
                if (this.eventTypeCase_ == 28) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.creativeKitShareStartBuilder_.clear();
            } else if (this.eventTypeCase_ == 28) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart.Builder getCreativeKitShareStartBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart.Builder) getCreativeKitShareStartFieldBuilder().getBuilder();
        }

        public CreativeKitShareStartOrBuilder getCreativeKitShareStartOrBuilder() {
            if (this.eventTypeCase_ == 28 && this.creativeKitShareStartBuilder_ != null) {
                return (CreativeKitShareStartOrBuilder) this.creativeKitShareStartBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 28) {
                return (CreativeKitShareStart) this.eventType_;
            }
            return CreativeKitShareStart.getDefaultInstance();
        }

        private SingleFieldBuilderV3<CreativeKitShareStart, com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart.Builder, CreativeKitShareStartOrBuilder> getCreativeKitShareStartFieldBuilder() {
            if (this.creativeKitShareStartBuilder_ == null) {
                if (this.eventTypeCase_ != 28) {
                    this.eventType_ = CreativeKitShareStart.getDefaultInstance();
                }
                this.creativeKitShareStartBuilder_ = new SingleFieldBuilderV3((CreativeKitShareStart) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 28;
            onChanged();
            return this.creativeKitShareStartBuilder_;
        }

        public boolean hasCreativeKitShareComplete() {
            return this.eventTypeCase_ == 29;
        }

        public CreativeKitShareComplete getCreativeKitShareComplete() {
            if (this.creativeKitShareCompleteBuilder_ == null) {
                if (this.eventTypeCase_ == 29) {
                    return (CreativeKitShareComplete) this.eventType_;
                }
                return CreativeKitShareComplete.getDefaultInstance();
            } else if (this.eventTypeCase_ == 29) {
                return (CreativeKitShareComplete) this.creativeKitShareCompleteBuilder_.getMessage();
            } else {
                return CreativeKitShareComplete.getDefaultInstance();
            }
        }

        public Builder setCreativeKitShareComplete(CreativeKitShareComplete creativeKitShareComplete) {
            if (this.creativeKitShareCompleteBuilder_ != null) {
                this.creativeKitShareCompleteBuilder_.setMessage(creativeKitShareComplete);
            } else if (creativeKitShareComplete == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = creativeKitShareComplete;
                onChanged();
            }
            this.eventTypeCase_ = 29;
            return this;
        }

        public Builder setCreativeKitShareComplete(com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete.Builder builder) {
            if (this.creativeKitShareCompleteBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.creativeKitShareCompleteBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 29;
            return this;
        }

        public Builder mergeCreativeKitShareComplete(CreativeKitShareComplete creativeKitShareComplete) {
            if (this.creativeKitShareCompleteBuilder_ == null) {
                if (this.eventTypeCase_ != 29 || this.eventType_ == CreativeKitShareComplete.getDefaultInstance()) {
                    this.eventType_ = creativeKitShareComplete;
                } else {
                    this.eventType_ = CreativeKitShareComplete.newBuilder((CreativeKitShareComplete) this.eventType_).mergeFrom(creativeKitShareComplete).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 29) {
                    this.creativeKitShareCompleteBuilder_.mergeFrom(creativeKitShareComplete);
                }
                this.creativeKitShareCompleteBuilder_.setMessage(creativeKitShareComplete);
            }
            this.eventTypeCase_ = 29;
            return this;
        }

        public Builder clearCreativeKitShareComplete() {
            if (this.creativeKitShareCompleteBuilder_ != null) {
                if (this.eventTypeCase_ == 29) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.creativeKitShareCompleteBuilder_.clear();
            } else if (this.eventTypeCase_ == 29) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete.Builder getCreativeKitShareCompleteBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete.Builder) getCreativeKitShareCompleteFieldBuilder().getBuilder();
        }

        public CreativeKitShareCompleteOrBuilder getCreativeKitShareCompleteOrBuilder() {
            if (this.eventTypeCase_ == 29 && this.creativeKitShareCompleteBuilder_ != null) {
                return (CreativeKitShareCompleteOrBuilder) this.creativeKitShareCompleteBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 29) {
                return (CreativeKitShareComplete) this.eventType_;
            }
            return CreativeKitShareComplete.getDefaultInstance();
        }

        private SingleFieldBuilderV3<CreativeKitShareComplete, com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete.Builder, CreativeKitShareCompleteOrBuilder> getCreativeKitShareCompleteFieldBuilder() {
            if (this.creativeKitShareCompleteBuilder_ == null) {
                if (this.eventTypeCase_ != 29) {
                    this.eventType_ = CreativeKitShareComplete.getDefaultInstance();
                }
                this.creativeKitShareCompleteBuilder_ = new SingleFieldBuilderV3((CreativeKitShareComplete) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 29;
            onChanged();
            return this.creativeKitShareCompleteBuilder_;
        }

        public boolean hasBitmojiKitStickerPickerOpen() {
            return this.eventTypeCase_ == 30;
        }

        public BitmojiKitStickerPickerOpen getBitmojiKitStickerPickerOpen() {
            if (this.bitmojiKitStickerPickerOpenBuilder_ == null) {
                if (this.eventTypeCase_ == 30) {
                    return (BitmojiKitStickerPickerOpen) this.eventType_;
                }
                return BitmojiKitStickerPickerOpen.getDefaultInstance();
            } else if (this.eventTypeCase_ == 30) {
                return (BitmojiKitStickerPickerOpen) this.bitmojiKitStickerPickerOpenBuilder_.getMessage();
            } else {
                return BitmojiKitStickerPickerOpen.getDefaultInstance();
            }
        }

        public Builder setBitmojiKitStickerPickerOpen(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            if (this.bitmojiKitStickerPickerOpenBuilder_ != null) {
                this.bitmojiKitStickerPickerOpenBuilder_.setMessage(bitmojiKitStickerPickerOpen);
            } else if (bitmojiKitStickerPickerOpen == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = bitmojiKitStickerPickerOpen;
                onChanged();
            }
            this.eventTypeCase_ = 30;
            return this;
        }

        public Builder setBitmojiKitStickerPickerOpen(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen.Builder builder) {
            if (this.bitmojiKitStickerPickerOpenBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitStickerPickerOpenBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 30;
            return this;
        }

        public Builder mergeBitmojiKitStickerPickerOpen(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            if (this.bitmojiKitStickerPickerOpenBuilder_ == null) {
                if (this.eventTypeCase_ != 30 || this.eventType_ == BitmojiKitStickerPickerOpen.getDefaultInstance()) {
                    this.eventType_ = bitmojiKitStickerPickerOpen;
                } else {
                    this.eventType_ = BitmojiKitStickerPickerOpen.newBuilder((BitmojiKitStickerPickerOpen) this.eventType_).mergeFrom(bitmojiKitStickerPickerOpen).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 30) {
                    this.bitmojiKitStickerPickerOpenBuilder_.mergeFrom(bitmojiKitStickerPickerOpen);
                }
                this.bitmojiKitStickerPickerOpenBuilder_.setMessage(bitmojiKitStickerPickerOpen);
            }
            this.eventTypeCase_ = 30;
            return this;
        }

        public Builder clearBitmojiKitStickerPickerOpen() {
            if (this.bitmojiKitStickerPickerOpenBuilder_ != null) {
                if (this.eventTypeCase_ == 30) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.bitmojiKitStickerPickerOpenBuilder_.clear();
            } else if (this.eventTypeCase_ == 30) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen.Builder getBitmojiKitStickerPickerOpenBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen.Builder) getBitmojiKitStickerPickerOpenFieldBuilder().getBuilder();
        }

        public BitmojiKitStickerPickerOpenOrBuilder getBitmojiKitStickerPickerOpenOrBuilder() {
            if (this.eventTypeCase_ == 30 && this.bitmojiKitStickerPickerOpenBuilder_ != null) {
                return (BitmojiKitStickerPickerOpenOrBuilder) this.bitmojiKitStickerPickerOpenBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 30) {
                return (BitmojiKitStickerPickerOpen) this.eventType_;
            }
            return BitmojiKitStickerPickerOpen.getDefaultInstance();
        }

        private SingleFieldBuilderV3<BitmojiKitStickerPickerOpen, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen.Builder, BitmojiKitStickerPickerOpenOrBuilder> getBitmojiKitStickerPickerOpenFieldBuilder() {
            if (this.bitmojiKitStickerPickerOpenBuilder_ == null) {
                if (this.eventTypeCase_ != 30) {
                    this.eventType_ = BitmojiKitStickerPickerOpen.getDefaultInstance();
                }
                this.bitmojiKitStickerPickerOpenBuilder_ = new SingleFieldBuilderV3((BitmojiKitStickerPickerOpen) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 30;
            onChanged();
            return this.bitmojiKitStickerPickerOpenBuilder_;
        }

        public boolean hasBitmojiKitStickerPickerClose() {
            return this.eventTypeCase_ == 31;
        }

        public BitmojiKitStickerPickerClose getBitmojiKitStickerPickerClose() {
            if (this.bitmojiKitStickerPickerCloseBuilder_ == null) {
                if (this.eventTypeCase_ == 31) {
                    return (BitmojiKitStickerPickerClose) this.eventType_;
                }
                return BitmojiKitStickerPickerClose.getDefaultInstance();
            } else if (this.eventTypeCase_ == 31) {
                return (BitmojiKitStickerPickerClose) this.bitmojiKitStickerPickerCloseBuilder_.getMessage();
            } else {
                return BitmojiKitStickerPickerClose.getDefaultInstance();
            }
        }

        public Builder setBitmojiKitStickerPickerClose(BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
            if (this.bitmojiKitStickerPickerCloseBuilder_ != null) {
                this.bitmojiKitStickerPickerCloseBuilder_.setMessage(bitmojiKitStickerPickerClose);
            } else if (bitmojiKitStickerPickerClose == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = bitmojiKitStickerPickerClose;
                onChanged();
            }
            this.eventTypeCase_ = 31;
            return this;
        }

        public Builder setBitmojiKitStickerPickerClose(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose.Builder builder) {
            if (this.bitmojiKitStickerPickerCloseBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitStickerPickerCloseBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 31;
            return this;
        }

        public Builder mergeBitmojiKitStickerPickerClose(BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
            if (this.bitmojiKitStickerPickerCloseBuilder_ == null) {
                if (this.eventTypeCase_ != 31 || this.eventType_ == BitmojiKitStickerPickerClose.getDefaultInstance()) {
                    this.eventType_ = bitmojiKitStickerPickerClose;
                } else {
                    this.eventType_ = BitmojiKitStickerPickerClose.newBuilder((BitmojiKitStickerPickerClose) this.eventType_).mergeFrom(bitmojiKitStickerPickerClose).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 31) {
                    this.bitmojiKitStickerPickerCloseBuilder_.mergeFrom(bitmojiKitStickerPickerClose);
                }
                this.bitmojiKitStickerPickerCloseBuilder_.setMessage(bitmojiKitStickerPickerClose);
            }
            this.eventTypeCase_ = 31;
            return this;
        }

        public Builder clearBitmojiKitStickerPickerClose() {
            if (this.bitmojiKitStickerPickerCloseBuilder_ != null) {
                if (this.eventTypeCase_ == 31) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.bitmojiKitStickerPickerCloseBuilder_.clear();
            } else if (this.eventTypeCase_ == 31) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose.Builder getBitmojiKitStickerPickerCloseBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose.Builder) getBitmojiKitStickerPickerCloseFieldBuilder().getBuilder();
        }

        public BitmojiKitStickerPickerCloseOrBuilder getBitmojiKitStickerPickerCloseOrBuilder() {
            if (this.eventTypeCase_ == 31 && this.bitmojiKitStickerPickerCloseBuilder_ != null) {
                return (BitmojiKitStickerPickerCloseOrBuilder) this.bitmojiKitStickerPickerCloseBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 31) {
                return (BitmojiKitStickerPickerClose) this.eventType_;
            }
            return BitmojiKitStickerPickerClose.getDefaultInstance();
        }

        private SingleFieldBuilderV3<BitmojiKitStickerPickerClose, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose.Builder, BitmojiKitStickerPickerCloseOrBuilder> getBitmojiKitStickerPickerCloseFieldBuilder() {
            if (this.bitmojiKitStickerPickerCloseBuilder_ == null) {
                if (this.eventTypeCase_ != 31) {
                    this.eventType_ = BitmojiKitStickerPickerClose.getDefaultInstance();
                }
                this.bitmojiKitStickerPickerCloseBuilder_ = new SingleFieldBuilderV3((BitmojiKitStickerPickerClose) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 31;
            onChanged();
            return this.bitmojiKitStickerPickerCloseBuilder_;
        }

        public boolean hasBitmojiKitShare() {
            return this.eventTypeCase_ == 32;
        }

        public BitmojiKitShare getBitmojiKitShare() {
            if (this.bitmojiKitShareBuilder_ == null) {
                if (this.eventTypeCase_ == 32) {
                    return (BitmojiKitShare) this.eventType_;
                }
                return BitmojiKitShare.getDefaultInstance();
            } else if (this.eventTypeCase_ == 32) {
                return (BitmojiKitShare) this.bitmojiKitShareBuilder_.getMessage();
            } else {
                return BitmojiKitShare.getDefaultInstance();
            }
        }

        public Builder setBitmojiKitShare(BitmojiKitShare bitmojiKitShare) {
            if (this.bitmojiKitShareBuilder_ != null) {
                this.bitmojiKitShareBuilder_.setMessage(bitmojiKitShare);
            } else if (bitmojiKitShare == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = bitmojiKitShare;
                onChanged();
            }
            this.eventTypeCase_ = 32;
            return this;
        }

        public Builder setBitmojiKitShare(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.Builder builder) {
            if (this.bitmojiKitShareBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitShareBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 32;
            return this;
        }

        public Builder mergeBitmojiKitShare(BitmojiKitShare bitmojiKitShare) {
            if (this.bitmojiKitShareBuilder_ == null) {
                if (this.eventTypeCase_ != 32 || this.eventType_ == BitmojiKitShare.getDefaultInstance()) {
                    this.eventType_ = bitmojiKitShare;
                } else {
                    this.eventType_ = BitmojiKitShare.newBuilder((BitmojiKitShare) this.eventType_).mergeFrom(bitmojiKitShare).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 32) {
                    this.bitmojiKitShareBuilder_.mergeFrom(bitmojiKitShare);
                }
                this.bitmojiKitShareBuilder_.setMessage(bitmojiKitShare);
            }
            this.eventTypeCase_ = 32;
            return this;
        }

        public Builder clearBitmojiKitShare() {
            if (this.bitmojiKitShareBuilder_ != null) {
                if (this.eventTypeCase_ == 32) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.bitmojiKitShareBuilder_.clear();
            } else if (this.eventTypeCase_ == 32) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.Builder getBitmojiKitShareBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.Builder) getBitmojiKitShareFieldBuilder().getBuilder();
        }

        public BitmojiKitShareOrBuilder getBitmojiKitShareOrBuilder() {
            if (this.eventTypeCase_ == 32 && this.bitmojiKitShareBuilder_ != null) {
                return (BitmojiKitShareOrBuilder) this.bitmojiKitShareBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 32) {
                return (BitmojiKitShare) this.eventType_;
            }
            return BitmojiKitShare.getDefaultInstance();
        }

        private SingleFieldBuilderV3<BitmojiKitShare, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.Builder, BitmojiKitShareOrBuilder> getBitmojiKitShareFieldBuilder() {
            if (this.bitmojiKitShareBuilder_ == null) {
                if (this.eventTypeCase_ != 32) {
                    this.eventType_ = BitmojiKitShare.getDefaultInstance();
                }
                this.bitmojiKitShareBuilder_ = new SingleFieldBuilderV3((BitmojiKitShare) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 32;
            onChanged();
            return this.bitmojiKitShareBuilder_;
        }

        public boolean hasBitmojiKitSearch() {
            return this.eventTypeCase_ == 33;
        }

        public BitmojiKitSearch getBitmojiKitSearch() {
            if (this.bitmojiKitSearchBuilder_ == null) {
                if (this.eventTypeCase_ == 33) {
                    return (BitmojiKitSearch) this.eventType_;
                }
                return BitmojiKitSearch.getDefaultInstance();
            } else if (this.eventTypeCase_ == 33) {
                return (BitmojiKitSearch) this.bitmojiKitSearchBuilder_.getMessage();
            } else {
                return BitmojiKitSearch.getDefaultInstance();
            }
        }

        public Builder setBitmojiKitSearch(BitmojiKitSearch bitmojiKitSearch) {
            if (this.bitmojiKitSearchBuilder_ != null) {
                this.bitmojiKitSearchBuilder_.setMessage(bitmojiKitSearch);
            } else if (bitmojiKitSearch == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = bitmojiKitSearch;
                onChanged();
            }
            this.eventTypeCase_ = 33;
            return this;
        }

        public Builder setBitmojiKitSearch(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch.Builder builder) {
            if (this.bitmojiKitSearchBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitSearchBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 33;
            return this;
        }

        public Builder mergeBitmojiKitSearch(BitmojiKitSearch bitmojiKitSearch) {
            if (this.bitmojiKitSearchBuilder_ == null) {
                if (this.eventTypeCase_ != 33 || this.eventType_ == BitmojiKitSearch.getDefaultInstance()) {
                    this.eventType_ = bitmojiKitSearch;
                } else {
                    this.eventType_ = BitmojiKitSearch.newBuilder((BitmojiKitSearch) this.eventType_).mergeFrom(bitmojiKitSearch).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 33) {
                    this.bitmojiKitSearchBuilder_.mergeFrom(bitmojiKitSearch);
                }
                this.bitmojiKitSearchBuilder_.setMessage(bitmojiKitSearch);
            }
            this.eventTypeCase_ = 33;
            return this;
        }

        public Builder clearBitmojiKitSearch() {
            if (this.bitmojiKitSearchBuilder_ != null) {
                if (this.eventTypeCase_ == 33) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.bitmojiKitSearchBuilder_.clear();
            } else if (this.eventTypeCase_ == 33) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch.Builder getBitmojiKitSearchBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch.Builder) getBitmojiKitSearchFieldBuilder().getBuilder();
        }

        public BitmojiKitSearchOrBuilder getBitmojiKitSearchOrBuilder() {
            if (this.eventTypeCase_ == 33 && this.bitmojiKitSearchBuilder_ != null) {
                return (BitmojiKitSearchOrBuilder) this.bitmojiKitSearchBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 33) {
                return (BitmojiKitSearch) this.eventType_;
            }
            return BitmojiKitSearch.getDefaultInstance();
        }

        private SingleFieldBuilderV3<BitmojiKitSearch, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch.Builder, BitmojiKitSearchOrBuilder> getBitmojiKitSearchFieldBuilder() {
            if (this.bitmojiKitSearchBuilder_ == null) {
                if (this.eventTypeCase_ != 33) {
                    this.eventType_ = BitmojiKitSearch.getDefaultInstance();
                }
                this.bitmojiKitSearchBuilder_ = new SingleFieldBuilderV3((BitmojiKitSearch) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 33;
            onChanged();
            return this.bitmojiKitSearchBuilder_;
        }

        public boolean hasBitmojiKitSnapchatLinkTap() {
            return this.eventTypeCase_ == 34;
        }

        public BitmojiKitSnapchatLinkTap getBitmojiKitSnapchatLinkTap() {
            if (this.bitmojiKitSnapchatLinkTapBuilder_ == null) {
                if (this.eventTypeCase_ == 34) {
                    return (BitmojiKitSnapchatLinkTap) this.eventType_;
                }
                return BitmojiKitSnapchatLinkTap.getDefaultInstance();
            } else if (this.eventTypeCase_ == 34) {
                return (BitmojiKitSnapchatLinkTap) this.bitmojiKitSnapchatLinkTapBuilder_.getMessage();
            } else {
                return BitmojiKitSnapchatLinkTap.getDefaultInstance();
            }
        }

        public Builder setBitmojiKitSnapchatLinkTap(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            if (this.bitmojiKitSnapchatLinkTapBuilder_ != null) {
                this.bitmojiKitSnapchatLinkTapBuilder_.setMessage(bitmojiKitSnapchatLinkTap);
            } else if (bitmojiKitSnapchatLinkTap == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = bitmojiKitSnapchatLinkTap;
                onChanged();
            }
            this.eventTypeCase_ = 34;
            return this;
        }

        public Builder setBitmojiKitSnapchatLinkTap(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap.Builder builder) {
            if (this.bitmojiKitSnapchatLinkTapBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitSnapchatLinkTapBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 34;
            return this;
        }

        public Builder mergeBitmojiKitSnapchatLinkTap(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            if (this.bitmojiKitSnapchatLinkTapBuilder_ == null) {
                if (this.eventTypeCase_ != 34 || this.eventType_ == BitmojiKitSnapchatLinkTap.getDefaultInstance()) {
                    this.eventType_ = bitmojiKitSnapchatLinkTap;
                } else {
                    this.eventType_ = BitmojiKitSnapchatLinkTap.newBuilder((BitmojiKitSnapchatLinkTap) this.eventType_).mergeFrom(bitmojiKitSnapchatLinkTap).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 34) {
                    this.bitmojiKitSnapchatLinkTapBuilder_.mergeFrom(bitmojiKitSnapchatLinkTap);
                }
                this.bitmojiKitSnapchatLinkTapBuilder_.setMessage(bitmojiKitSnapchatLinkTap);
            }
            this.eventTypeCase_ = 34;
            return this;
        }

        public Builder clearBitmojiKitSnapchatLinkTap() {
            if (this.bitmojiKitSnapchatLinkTapBuilder_ != null) {
                if (this.eventTypeCase_ == 34) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.bitmojiKitSnapchatLinkTapBuilder_.clear();
            } else if (this.eventTypeCase_ == 34) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap.Builder getBitmojiKitSnapchatLinkTapBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap.Builder) getBitmojiKitSnapchatLinkTapFieldBuilder().getBuilder();
        }

        public BitmojiKitSnapchatLinkTapOrBuilder getBitmojiKitSnapchatLinkTapOrBuilder() {
            if (this.eventTypeCase_ == 34 && this.bitmojiKitSnapchatLinkTapBuilder_ != null) {
                return (BitmojiKitSnapchatLinkTapOrBuilder) this.bitmojiKitSnapchatLinkTapBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 34) {
                return (BitmojiKitSnapchatLinkTap) this.eventType_;
            }
            return BitmojiKitSnapchatLinkTap.getDefaultInstance();
        }

        private SingleFieldBuilderV3<BitmojiKitSnapchatLinkTap, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap.Builder, BitmojiKitSnapchatLinkTapOrBuilder> getBitmojiKitSnapchatLinkTapFieldBuilder() {
            if (this.bitmojiKitSnapchatLinkTapBuilder_ == null) {
                if (this.eventTypeCase_ != 34) {
                    this.eventType_ = BitmojiKitSnapchatLinkTap.getDefaultInstance();
                }
                this.bitmojiKitSnapchatLinkTapBuilder_ = new SingleFieldBuilderV3((BitmojiKitSnapchatLinkTap) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 34;
            onChanged();
            return this.bitmojiKitSnapchatLinkTapBuilder_;
        }

        public boolean hasBitmojiKitSnapchatLinkSuccess() {
            return this.eventTypeCase_ == 35;
        }

        public BitmojiKitSnapchatLinkSuccess getBitmojiKitSnapchatLinkSuccess() {
            if (this.bitmojiKitSnapchatLinkSuccessBuilder_ == null) {
                if (this.eventTypeCase_ == 35) {
                    return (BitmojiKitSnapchatLinkSuccess) this.eventType_;
                }
                return BitmojiKitSnapchatLinkSuccess.getDefaultInstance();
            } else if (this.eventTypeCase_ == 35) {
                return (BitmojiKitSnapchatLinkSuccess) this.bitmojiKitSnapchatLinkSuccessBuilder_.getMessage();
            } else {
                return BitmojiKitSnapchatLinkSuccess.getDefaultInstance();
            }
        }

        public Builder setBitmojiKitSnapchatLinkSuccess(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
            if (this.bitmojiKitSnapchatLinkSuccessBuilder_ != null) {
                this.bitmojiKitSnapchatLinkSuccessBuilder_.setMessage(bitmojiKitSnapchatLinkSuccess);
            } else if (bitmojiKitSnapchatLinkSuccess == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = bitmojiKitSnapchatLinkSuccess;
                onChanged();
            }
            this.eventTypeCase_ = 35;
            return this;
        }

        public Builder setBitmojiKitSnapchatLinkSuccess(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess.Builder builder) {
            if (this.bitmojiKitSnapchatLinkSuccessBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitSnapchatLinkSuccessBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 35;
            return this;
        }

        public Builder mergeBitmojiKitSnapchatLinkSuccess(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
            if (this.bitmojiKitSnapchatLinkSuccessBuilder_ == null) {
                if (this.eventTypeCase_ != 35 || this.eventType_ == BitmojiKitSnapchatLinkSuccess.getDefaultInstance()) {
                    this.eventType_ = bitmojiKitSnapchatLinkSuccess;
                } else {
                    this.eventType_ = BitmojiKitSnapchatLinkSuccess.newBuilder((BitmojiKitSnapchatLinkSuccess) this.eventType_).mergeFrom(bitmojiKitSnapchatLinkSuccess).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 35) {
                    this.bitmojiKitSnapchatLinkSuccessBuilder_.mergeFrom(bitmojiKitSnapchatLinkSuccess);
                }
                this.bitmojiKitSnapchatLinkSuccessBuilder_.setMessage(bitmojiKitSnapchatLinkSuccess);
            }
            this.eventTypeCase_ = 35;
            return this;
        }

        public Builder clearBitmojiKitSnapchatLinkSuccess() {
            if (this.bitmojiKitSnapchatLinkSuccessBuilder_ != null) {
                if (this.eventTypeCase_ == 35) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.bitmojiKitSnapchatLinkSuccessBuilder_.clear();
            } else if (this.eventTypeCase_ == 35) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess.Builder getBitmojiKitSnapchatLinkSuccessBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess.Builder) getBitmojiKitSnapchatLinkSuccessFieldBuilder().getBuilder();
        }

        public BitmojiKitSnapchatLinkSuccessOrBuilder getBitmojiKitSnapchatLinkSuccessOrBuilder() {
            if (this.eventTypeCase_ == 35 && this.bitmojiKitSnapchatLinkSuccessBuilder_ != null) {
                return (BitmojiKitSnapchatLinkSuccessOrBuilder) this.bitmojiKitSnapchatLinkSuccessBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 35) {
                return (BitmojiKitSnapchatLinkSuccess) this.eventType_;
            }
            return BitmojiKitSnapchatLinkSuccess.getDefaultInstance();
        }

        private SingleFieldBuilderV3<BitmojiKitSnapchatLinkSuccess, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess.Builder, BitmojiKitSnapchatLinkSuccessOrBuilder> getBitmojiKitSnapchatLinkSuccessFieldBuilder() {
            if (this.bitmojiKitSnapchatLinkSuccessBuilder_ == null) {
                if (this.eventTypeCase_ != 35) {
                    this.eventType_ = BitmojiKitSnapchatLinkSuccess.getDefaultInstance();
                }
                this.bitmojiKitSnapchatLinkSuccessBuilder_ = new SingleFieldBuilderV3((BitmojiKitSnapchatLinkSuccess) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 35;
            onChanged();
            return this.bitmojiKitSnapchatLinkSuccessBuilder_;
        }

        public boolean hasBitmojiKitCreateAvatarTap() {
            return this.eventTypeCase_ == 36;
        }

        public BitmojiKitCreateAvatarTap getBitmojiKitCreateAvatarTap() {
            if (this.bitmojiKitCreateAvatarTapBuilder_ == null) {
                if (this.eventTypeCase_ == 36) {
                    return (BitmojiKitCreateAvatarTap) this.eventType_;
                }
                return BitmojiKitCreateAvatarTap.getDefaultInstance();
            } else if (this.eventTypeCase_ == 36) {
                return (BitmojiKitCreateAvatarTap) this.bitmojiKitCreateAvatarTapBuilder_.getMessage();
            } else {
                return BitmojiKitCreateAvatarTap.getDefaultInstance();
            }
        }

        public Builder setBitmojiKitCreateAvatarTap(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            if (this.bitmojiKitCreateAvatarTapBuilder_ != null) {
                this.bitmojiKitCreateAvatarTapBuilder_.setMessage(bitmojiKitCreateAvatarTap);
            } else if (bitmojiKitCreateAvatarTap == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = bitmojiKitCreateAvatarTap;
                onChanged();
            }
            this.eventTypeCase_ = 36;
            return this;
        }

        public Builder setBitmojiKitCreateAvatarTap(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap.Builder builder) {
            if (this.bitmojiKitCreateAvatarTapBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitCreateAvatarTapBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 36;
            return this;
        }

        public Builder mergeBitmojiKitCreateAvatarTap(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            if (this.bitmojiKitCreateAvatarTapBuilder_ == null) {
                if (this.eventTypeCase_ != 36 || this.eventType_ == BitmojiKitCreateAvatarTap.getDefaultInstance()) {
                    this.eventType_ = bitmojiKitCreateAvatarTap;
                } else {
                    this.eventType_ = BitmojiKitCreateAvatarTap.newBuilder((BitmojiKitCreateAvatarTap) this.eventType_).mergeFrom(bitmojiKitCreateAvatarTap).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 36) {
                    this.bitmojiKitCreateAvatarTapBuilder_.mergeFrom(bitmojiKitCreateAvatarTap);
                }
                this.bitmojiKitCreateAvatarTapBuilder_.setMessage(bitmojiKitCreateAvatarTap);
            }
            this.eventTypeCase_ = 36;
            return this;
        }

        public Builder clearBitmojiKitCreateAvatarTap() {
            if (this.bitmojiKitCreateAvatarTapBuilder_ != null) {
                if (this.eventTypeCase_ == 36) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.bitmojiKitCreateAvatarTapBuilder_.clear();
            } else if (this.eventTypeCase_ == 36) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap.Builder getBitmojiKitCreateAvatarTapBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap.Builder) getBitmojiKitCreateAvatarTapFieldBuilder().getBuilder();
        }

        public BitmojiKitCreateAvatarTapOrBuilder getBitmojiKitCreateAvatarTapOrBuilder() {
            if (this.eventTypeCase_ == 36 && this.bitmojiKitCreateAvatarTapBuilder_ != null) {
                return (BitmojiKitCreateAvatarTapOrBuilder) this.bitmojiKitCreateAvatarTapBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 36) {
                return (BitmojiKitCreateAvatarTap) this.eventType_;
            }
            return BitmojiKitCreateAvatarTap.getDefaultInstance();
        }

        private SingleFieldBuilderV3<BitmojiKitCreateAvatarTap, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap.Builder, BitmojiKitCreateAvatarTapOrBuilder> getBitmojiKitCreateAvatarTapFieldBuilder() {
            if (this.bitmojiKitCreateAvatarTapBuilder_ == null) {
                if (this.eventTypeCase_ != 36) {
                    this.eventType_ = BitmojiKitCreateAvatarTap.getDefaultInstance();
                }
                this.bitmojiKitCreateAvatarTapBuilder_ = new SingleFieldBuilderV3((BitmojiKitCreateAvatarTap) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 36;
            onChanged();
            return this.bitmojiKitCreateAvatarTapBuilder_;
        }

        public boolean hasLoginKitAuthStart() {
            return this.eventTypeCase_ == 37;
        }

        public LoginKitAuthStart getLoginKitAuthStart() {
            if (this.loginKitAuthStartBuilder_ == null) {
                if (this.eventTypeCase_ == 37) {
                    return (LoginKitAuthStart) this.eventType_;
                }
                return LoginKitAuthStart.getDefaultInstance();
            } else if (this.eventTypeCase_ == 37) {
                return (LoginKitAuthStart) this.loginKitAuthStartBuilder_.getMessage();
            } else {
                return LoginKitAuthStart.getDefaultInstance();
            }
        }

        public Builder setLoginKitAuthStart(LoginKitAuthStart loginKitAuthStart) {
            if (this.loginKitAuthStartBuilder_ != null) {
                this.loginKitAuthStartBuilder_.setMessage(loginKitAuthStart);
            } else if (loginKitAuthStart == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = loginKitAuthStart;
                onChanged();
            }
            this.eventTypeCase_ = 37;
            return this;
        }

        public Builder setLoginKitAuthStart(com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart.Builder builder) {
            if (this.loginKitAuthStartBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.loginKitAuthStartBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 37;
            return this;
        }

        public Builder mergeLoginKitAuthStart(LoginKitAuthStart loginKitAuthStart) {
            if (this.loginKitAuthStartBuilder_ == null) {
                if (this.eventTypeCase_ != 37 || this.eventType_ == LoginKitAuthStart.getDefaultInstance()) {
                    this.eventType_ = loginKitAuthStart;
                } else {
                    this.eventType_ = LoginKitAuthStart.newBuilder((LoginKitAuthStart) this.eventType_).mergeFrom(loginKitAuthStart).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 37) {
                    this.loginKitAuthStartBuilder_.mergeFrom(loginKitAuthStart);
                }
                this.loginKitAuthStartBuilder_.setMessage(loginKitAuthStart);
            }
            this.eventTypeCase_ = 37;
            return this;
        }

        public Builder clearLoginKitAuthStart() {
            if (this.loginKitAuthStartBuilder_ != null) {
                if (this.eventTypeCase_ == 37) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.loginKitAuthStartBuilder_.clear();
            } else if (this.eventTypeCase_ == 37) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart.Builder getLoginKitAuthStartBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart.Builder) getLoginKitAuthStartFieldBuilder().getBuilder();
        }

        public LoginKitAuthStartOrBuilder getLoginKitAuthStartOrBuilder() {
            if (this.eventTypeCase_ == 37 && this.loginKitAuthStartBuilder_ != null) {
                return (LoginKitAuthStartOrBuilder) this.loginKitAuthStartBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 37) {
                return (LoginKitAuthStart) this.eventType_;
            }
            return LoginKitAuthStart.getDefaultInstance();
        }

        private SingleFieldBuilderV3<LoginKitAuthStart, com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart.Builder, LoginKitAuthStartOrBuilder> getLoginKitAuthStartFieldBuilder() {
            if (this.loginKitAuthStartBuilder_ == null) {
                if (this.eventTypeCase_ != 37) {
                    this.eventType_ = LoginKitAuthStart.getDefaultInstance();
                }
                this.loginKitAuthStartBuilder_ = new SingleFieldBuilderV3((LoginKitAuthStart) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 37;
            onChanged();
            return this.loginKitAuthStartBuilder_;
        }

        public boolean hasLoginKitAuthComplete() {
            return this.eventTypeCase_ == 38;
        }

        public LoginKitAuthComplete getLoginKitAuthComplete() {
            if (this.loginKitAuthCompleteBuilder_ == null) {
                if (this.eventTypeCase_ == 38) {
                    return (LoginKitAuthComplete) this.eventType_;
                }
                return LoginKitAuthComplete.getDefaultInstance();
            } else if (this.eventTypeCase_ == 38) {
                return (LoginKitAuthComplete) this.loginKitAuthCompleteBuilder_.getMessage();
            } else {
                return LoginKitAuthComplete.getDefaultInstance();
            }
        }

        public Builder setLoginKitAuthComplete(LoginKitAuthComplete loginKitAuthComplete) {
            if (this.loginKitAuthCompleteBuilder_ != null) {
                this.loginKitAuthCompleteBuilder_.setMessage(loginKitAuthComplete);
            } else if (loginKitAuthComplete == null) {
                throw new NullPointerException();
            } else {
                this.eventType_ = loginKitAuthComplete;
                onChanged();
            }
            this.eventTypeCase_ = 38;
            return this;
        }

        public Builder setLoginKitAuthComplete(com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete.Builder builder) {
            if (this.loginKitAuthCompleteBuilder_ == null) {
                this.eventType_ = builder.build();
                onChanged();
            } else {
                this.loginKitAuthCompleteBuilder_.setMessage(builder.build());
            }
            this.eventTypeCase_ = 38;
            return this;
        }

        public Builder mergeLoginKitAuthComplete(LoginKitAuthComplete loginKitAuthComplete) {
            if (this.loginKitAuthCompleteBuilder_ == null) {
                if (this.eventTypeCase_ != 38 || this.eventType_ == LoginKitAuthComplete.getDefaultInstance()) {
                    this.eventType_ = loginKitAuthComplete;
                } else {
                    this.eventType_ = LoginKitAuthComplete.newBuilder((LoginKitAuthComplete) this.eventType_).mergeFrom(loginKitAuthComplete).buildPartial();
                }
                onChanged();
            } else {
                if (this.eventTypeCase_ == 38) {
                    this.loginKitAuthCompleteBuilder_.mergeFrom(loginKitAuthComplete);
                }
                this.loginKitAuthCompleteBuilder_.setMessage(loginKitAuthComplete);
            }
            this.eventTypeCase_ = 38;
            return this;
        }

        public Builder clearLoginKitAuthComplete() {
            if (this.loginKitAuthCompleteBuilder_ != null) {
                if (this.eventTypeCase_ == 38) {
                    this.eventTypeCase_ = 0;
                    this.eventType_ = null;
                }
                this.loginKitAuthCompleteBuilder_.clear();
            } else if (this.eventTypeCase_ == 38) {
                this.eventTypeCase_ = 0;
                this.eventType_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete.Builder getLoginKitAuthCompleteBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete.Builder) getLoginKitAuthCompleteFieldBuilder().getBuilder();
        }

        public LoginKitAuthCompleteOrBuilder getLoginKitAuthCompleteOrBuilder() {
            if (this.eventTypeCase_ == 38 && this.loginKitAuthCompleteBuilder_ != null) {
                return (LoginKitAuthCompleteOrBuilder) this.loginKitAuthCompleteBuilder_.getMessageOrBuilder();
            }
            if (this.eventTypeCase_ == 38) {
                return (LoginKitAuthComplete) this.eventType_;
            }
            return LoginKitAuthComplete.getDefaultInstance();
        }

        private SingleFieldBuilderV3<LoginKitAuthComplete, com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete.Builder, LoginKitAuthCompleteOrBuilder> getLoginKitAuthCompleteFieldBuilder() {
            if (this.loginKitAuthCompleteBuilder_ == null) {
                if (this.eventTypeCase_ != 38) {
                    this.eventType_ = LoginKitAuthComplete.getDefaultInstance();
                }
                this.loginKitAuthCompleteBuilder_ = new SingleFieldBuilderV3((LoginKitAuthComplete) this.eventType_, getParentForChildren(), isClean());
                this.eventType_ = null;
            }
            this.eventTypeCase_ = 38;
            onChanged();
            return this.loginKitAuthCompleteBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private ServerEventData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.eventTypeCase_ = null;
        this.memoizedIsInitialized = (byte) -1;
    }

    private ServerEventData() {
        this.eventTypeCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private ServerEventData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart.Builder builder = null;
                switch (readTag) {
                    case 0:
                        obj = 1;
                        break;
                    case 226:
                        if (this.eventTypeCase_ == 28) {
                            builder = ((CreativeKitShareStart) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(CreativeKitShareStart.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom((CreativeKitShareStart) this.eventType_);
                            this.eventType_ = builder.buildPartial();
                        }
                        this.eventTypeCase_ = 28;
                        break;
                    case 234:
                        com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete.Builder toBuilder;
                        if (this.eventTypeCase_ == 29) {
                            toBuilder = ((CreativeKitShareComplete) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(CreativeKitShareComplete.parser(), extensionRegistryLite);
                        if (toBuilder != null) {
                            toBuilder.mergeFrom((CreativeKitShareComplete) this.eventType_);
                            this.eventType_ = toBuilder.buildPartial();
                        }
                        this.eventTypeCase_ = 29;
                        break;
                    case 242:
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen.Builder toBuilder2;
                        if (this.eventTypeCase_ == 30) {
                            toBuilder2 = ((BitmojiKitStickerPickerOpen) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(BitmojiKitStickerPickerOpen.parser(), extensionRegistryLite);
                        if (toBuilder2 != null) {
                            toBuilder2.mergeFrom((BitmojiKitStickerPickerOpen) this.eventType_);
                            this.eventType_ = toBuilder2.buildPartial();
                        }
                        this.eventTypeCase_ = 30;
                        break;
                    case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose.Builder toBuilder3;
                        if (this.eventTypeCase_ == 31) {
                            toBuilder3 = ((BitmojiKitStickerPickerClose) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(BitmojiKitStickerPickerClose.parser(), extensionRegistryLite);
                        if (toBuilder3 != null) {
                            toBuilder3.mergeFrom((BitmojiKitStickerPickerClose) this.eventType_);
                            this.eventType_ = toBuilder3.buildPartial();
                        }
                        this.eventTypeCase_ = 31;
                        break;
                    case 258:
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.Builder toBuilder4;
                        if (this.eventTypeCase_ == 32) {
                            toBuilder4 = ((BitmojiKitShare) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(BitmojiKitShare.parser(), extensionRegistryLite);
                        if (toBuilder4 != null) {
                            toBuilder4.mergeFrom((BitmojiKitShare) this.eventType_);
                            this.eventType_ = toBuilder4.buildPartial();
                        }
                        this.eventTypeCase_ = 32;
                        break;
                    case 266:
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch.Builder toBuilder5;
                        if (this.eventTypeCase_ == 33) {
                            toBuilder5 = ((BitmojiKitSearch) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(BitmojiKitSearch.parser(), extensionRegistryLite);
                        if (toBuilder5 != null) {
                            toBuilder5.mergeFrom((BitmojiKitSearch) this.eventType_);
                            this.eventType_ = toBuilder5.buildPartial();
                        }
                        this.eventTypeCase_ = 33;
                        break;
                    case 274:
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap.Builder toBuilder6;
                        if (this.eventTypeCase_ == 34) {
                            toBuilder6 = ((BitmojiKitSnapchatLinkTap) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(BitmojiKitSnapchatLinkTap.parser(), extensionRegistryLite);
                        if (toBuilder6 != null) {
                            toBuilder6.mergeFrom((BitmojiKitSnapchatLinkTap) this.eventType_);
                            this.eventType_ = toBuilder6.buildPartial();
                        }
                        this.eventTypeCase_ = 34;
                        break;
                    case 282:
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess.Builder toBuilder7;
                        if (this.eventTypeCase_ == 35) {
                            toBuilder7 = ((BitmojiKitSnapchatLinkSuccess) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(BitmojiKitSnapchatLinkSuccess.parser(), extensionRegistryLite);
                        if (toBuilder7 != null) {
                            toBuilder7.mergeFrom((BitmojiKitSnapchatLinkSuccess) this.eventType_);
                            this.eventType_ = toBuilder7.buildPartial();
                        }
                        this.eventTypeCase_ = 35;
                        break;
                    case 290:
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap.Builder toBuilder8;
                        if (this.eventTypeCase_ == 36) {
                            toBuilder8 = ((BitmojiKitCreateAvatarTap) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(BitmojiKitCreateAvatarTap.parser(), extensionRegistryLite);
                        if (toBuilder8 != null) {
                            toBuilder8.mergeFrom((BitmojiKitCreateAvatarTap) this.eventType_);
                            this.eventType_ = toBuilder8.buildPartial();
                        }
                        this.eventTypeCase_ = 36;
                        break;
                    case 298:
                        com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart.Builder toBuilder9;
                        if (this.eventTypeCase_ == 37) {
                            toBuilder9 = ((LoginKitAuthStart) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(LoginKitAuthStart.parser(), extensionRegistryLite);
                        if (toBuilder9 != null) {
                            toBuilder9.mergeFrom((LoginKitAuthStart) this.eventType_);
                            this.eventType_ = toBuilder9.buildPartial();
                        }
                        this.eventTypeCase_ = 37;
                        break;
                    case 306:
                        com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete.Builder toBuilder10;
                        if (this.eventTypeCase_ == 38) {
                            toBuilder10 = ((LoginKitAuthComplete) this.eventType_).toBuilder();
                        }
                        this.eventType_ = codedInputStream.readMessage(LoginKitAuthComplete.parser(), extensionRegistryLite);
                        if (toBuilder10 != null) {
                            toBuilder10.mergeFrom((LoginKitAuthComplete) this.eventType_);
                            this.eventType_ = toBuilder10.buildPartial();
                        }
                        this.eventTypeCase_ = 38;
                        break;
                    default:
                        if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            obj = 1;
                            break;
                        }
                        break;
                }
            } catch (CodedInputStream codedInputStream2) {
                throw codedInputStream2.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } catch (Throwable th) {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptor getDescriptor() {
        return Event.f21752xaa6c74c1;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21753x6bbf4a3f.ensureFieldAccessorsInitialized(ServerEventData.class, Builder.class);
    }

    public EventTypeCase getEventTypeCase() {
        return EventTypeCase.forNumber(this.eventTypeCase_);
    }

    public boolean hasCreativeKitShareStart() {
        return this.eventTypeCase_ == 28;
    }

    public CreativeKitShareStart getCreativeKitShareStart() {
        if (this.eventTypeCase_ == 28) {
            return (CreativeKitShareStart) this.eventType_;
        }
        return CreativeKitShareStart.getDefaultInstance();
    }

    public CreativeKitShareStartOrBuilder getCreativeKitShareStartOrBuilder() {
        if (this.eventTypeCase_ == 28) {
            return (CreativeKitShareStart) this.eventType_;
        }
        return CreativeKitShareStart.getDefaultInstance();
    }

    public boolean hasCreativeKitShareComplete() {
        return this.eventTypeCase_ == 29;
    }

    public CreativeKitShareComplete getCreativeKitShareComplete() {
        if (this.eventTypeCase_ == 29) {
            return (CreativeKitShareComplete) this.eventType_;
        }
        return CreativeKitShareComplete.getDefaultInstance();
    }

    public CreativeKitShareCompleteOrBuilder getCreativeKitShareCompleteOrBuilder() {
        if (this.eventTypeCase_ == 29) {
            return (CreativeKitShareComplete) this.eventType_;
        }
        return CreativeKitShareComplete.getDefaultInstance();
    }

    public boolean hasBitmojiKitStickerPickerOpen() {
        return this.eventTypeCase_ == 30;
    }

    public BitmojiKitStickerPickerOpen getBitmojiKitStickerPickerOpen() {
        if (this.eventTypeCase_ == 30) {
            return (BitmojiKitStickerPickerOpen) this.eventType_;
        }
        return BitmojiKitStickerPickerOpen.getDefaultInstance();
    }

    public BitmojiKitStickerPickerOpenOrBuilder getBitmojiKitStickerPickerOpenOrBuilder() {
        if (this.eventTypeCase_ == 30) {
            return (BitmojiKitStickerPickerOpen) this.eventType_;
        }
        return BitmojiKitStickerPickerOpen.getDefaultInstance();
    }

    public boolean hasBitmojiKitStickerPickerClose() {
        return this.eventTypeCase_ == 31;
    }

    public BitmojiKitStickerPickerClose getBitmojiKitStickerPickerClose() {
        if (this.eventTypeCase_ == 31) {
            return (BitmojiKitStickerPickerClose) this.eventType_;
        }
        return BitmojiKitStickerPickerClose.getDefaultInstance();
    }

    public BitmojiKitStickerPickerCloseOrBuilder getBitmojiKitStickerPickerCloseOrBuilder() {
        if (this.eventTypeCase_ == 31) {
            return (BitmojiKitStickerPickerClose) this.eventType_;
        }
        return BitmojiKitStickerPickerClose.getDefaultInstance();
    }

    public boolean hasBitmojiKitShare() {
        return this.eventTypeCase_ == 32;
    }

    public BitmojiKitShare getBitmojiKitShare() {
        if (this.eventTypeCase_ == 32) {
            return (BitmojiKitShare) this.eventType_;
        }
        return BitmojiKitShare.getDefaultInstance();
    }

    public BitmojiKitShareOrBuilder getBitmojiKitShareOrBuilder() {
        if (this.eventTypeCase_ == 32) {
            return (BitmojiKitShare) this.eventType_;
        }
        return BitmojiKitShare.getDefaultInstance();
    }

    public boolean hasBitmojiKitSearch() {
        return this.eventTypeCase_ == 33;
    }

    public BitmojiKitSearch getBitmojiKitSearch() {
        if (this.eventTypeCase_ == 33) {
            return (BitmojiKitSearch) this.eventType_;
        }
        return BitmojiKitSearch.getDefaultInstance();
    }

    public BitmojiKitSearchOrBuilder getBitmojiKitSearchOrBuilder() {
        if (this.eventTypeCase_ == 33) {
            return (BitmojiKitSearch) this.eventType_;
        }
        return BitmojiKitSearch.getDefaultInstance();
    }

    public boolean hasBitmojiKitSnapchatLinkTap() {
        return this.eventTypeCase_ == 34;
    }

    public BitmojiKitSnapchatLinkTap getBitmojiKitSnapchatLinkTap() {
        if (this.eventTypeCase_ == 34) {
            return (BitmojiKitSnapchatLinkTap) this.eventType_;
        }
        return BitmojiKitSnapchatLinkTap.getDefaultInstance();
    }

    public BitmojiKitSnapchatLinkTapOrBuilder getBitmojiKitSnapchatLinkTapOrBuilder() {
        if (this.eventTypeCase_ == 34) {
            return (BitmojiKitSnapchatLinkTap) this.eventType_;
        }
        return BitmojiKitSnapchatLinkTap.getDefaultInstance();
    }

    public boolean hasBitmojiKitSnapchatLinkSuccess() {
        return this.eventTypeCase_ == 35;
    }

    public BitmojiKitSnapchatLinkSuccess getBitmojiKitSnapchatLinkSuccess() {
        if (this.eventTypeCase_ == 35) {
            return (BitmojiKitSnapchatLinkSuccess) this.eventType_;
        }
        return BitmojiKitSnapchatLinkSuccess.getDefaultInstance();
    }

    public BitmojiKitSnapchatLinkSuccessOrBuilder getBitmojiKitSnapchatLinkSuccessOrBuilder() {
        if (this.eventTypeCase_ == 35) {
            return (BitmojiKitSnapchatLinkSuccess) this.eventType_;
        }
        return BitmojiKitSnapchatLinkSuccess.getDefaultInstance();
    }

    public boolean hasBitmojiKitCreateAvatarTap() {
        return this.eventTypeCase_ == 36;
    }

    public BitmojiKitCreateAvatarTap getBitmojiKitCreateAvatarTap() {
        if (this.eventTypeCase_ == 36) {
            return (BitmojiKitCreateAvatarTap) this.eventType_;
        }
        return BitmojiKitCreateAvatarTap.getDefaultInstance();
    }

    public BitmojiKitCreateAvatarTapOrBuilder getBitmojiKitCreateAvatarTapOrBuilder() {
        if (this.eventTypeCase_ == 36) {
            return (BitmojiKitCreateAvatarTap) this.eventType_;
        }
        return BitmojiKitCreateAvatarTap.getDefaultInstance();
    }

    public boolean hasLoginKitAuthStart() {
        return this.eventTypeCase_ == 37;
    }

    public LoginKitAuthStart getLoginKitAuthStart() {
        if (this.eventTypeCase_ == 37) {
            return (LoginKitAuthStart) this.eventType_;
        }
        return LoginKitAuthStart.getDefaultInstance();
    }

    public LoginKitAuthStartOrBuilder getLoginKitAuthStartOrBuilder() {
        if (this.eventTypeCase_ == 37) {
            return (LoginKitAuthStart) this.eventType_;
        }
        return LoginKitAuthStart.getDefaultInstance();
    }

    public boolean hasLoginKitAuthComplete() {
        return this.eventTypeCase_ == 38;
    }

    public LoginKitAuthComplete getLoginKitAuthComplete() {
        if (this.eventTypeCase_ == 38) {
            return (LoginKitAuthComplete) this.eventType_;
        }
        return LoginKitAuthComplete.getDefaultInstance();
    }

    public LoginKitAuthCompleteOrBuilder getLoginKitAuthCompleteOrBuilder() {
        if (this.eventTypeCase_ == 38) {
            return (LoginKitAuthComplete) this.eventType_;
        }
        return LoginKitAuthComplete.getDefaultInstance();
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
        if (this.eventTypeCase_ == 28) {
            codedOutputStream.writeMessage(28, (CreativeKitShareStart) this.eventType_);
        }
        if (this.eventTypeCase_ == 29) {
            codedOutputStream.writeMessage(29, (CreativeKitShareComplete) this.eventType_);
        }
        if (this.eventTypeCase_ == 30) {
            codedOutputStream.writeMessage(30, (BitmojiKitStickerPickerOpen) this.eventType_);
        }
        if (this.eventTypeCase_ == 31) {
            codedOutputStream.writeMessage(31, (BitmojiKitStickerPickerClose) this.eventType_);
        }
        if (this.eventTypeCase_ == 32) {
            codedOutputStream.writeMessage(32, (BitmojiKitShare) this.eventType_);
        }
        if (this.eventTypeCase_ == 33) {
            codedOutputStream.writeMessage(33, (BitmojiKitSearch) this.eventType_);
        }
        if (this.eventTypeCase_ == 34) {
            codedOutputStream.writeMessage(34, (BitmojiKitSnapchatLinkTap) this.eventType_);
        }
        if (this.eventTypeCase_ == 35) {
            codedOutputStream.writeMessage(35, (BitmojiKitSnapchatLinkSuccess) this.eventType_);
        }
        if (this.eventTypeCase_ == 36) {
            codedOutputStream.writeMessage(36, (BitmojiKitCreateAvatarTap) this.eventType_);
        }
        if (this.eventTypeCase_ == 37) {
            codedOutputStream.writeMessage(37, (LoginKitAuthStart) this.eventType_);
        }
        if (this.eventTypeCase_ == 38) {
            codedOutputStream.writeMessage(38, (LoginKitAuthComplete) this.eventType_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (this.eventTypeCase_ == 28) {
            i = 0 + CodedOutputStream.computeMessageSize(28, (CreativeKitShareStart) this.eventType_);
        }
        if (this.eventTypeCase_ == 29) {
            i += CodedOutputStream.computeMessageSize(29, (CreativeKitShareComplete) this.eventType_);
        }
        if (this.eventTypeCase_ == 30) {
            i += CodedOutputStream.computeMessageSize(30, (BitmojiKitStickerPickerOpen) this.eventType_);
        }
        if (this.eventTypeCase_ == 31) {
            i += CodedOutputStream.computeMessageSize(31, (BitmojiKitStickerPickerClose) this.eventType_);
        }
        if (this.eventTypeCase_ == 32) {
            i += CodedOutputStream.computeMessageSize(32, (BitmojiKitShare) this.eventType_);
        }
        if (this.eventTypeCase_ == 33) {
            i += CodedOutputStream.computeMessageSize(33, (BitmojiKitSearch) this.eventType_);
        }
        if (this.eventTypeCase_ == 34) {
            i += CodedOutputStream.computeMessageSize(34, (BitmojiKitSnapchatLinkTap) this.eventType_);
        }
        if (this.eventTypeCase_ == 35) {
            i += CodedOutputStream.computeMessageSize(35, (BitmojiKitSnapchatLinkSuccess) this.eventType_);
        }
        if (this.eventTypeCase_ == 36) {
            i += CodedOutputStream.computeMessageSize(36, (BitmojiKitCreateAvatarTap) this.eventType_);
        }
        if (this.eventTypeCase_ == 37) {
            i += CodedOutputStream.computeMessageSize(37, (LoginKitAuthStart) this.eventType_);
        }
        if (this.eventTypeCase_ == 38) {
            i += CodedOutputStream.computeMessageSize(38, (LoginKitAuthComplete) this.eventType_);
        }
        i += this.unknownFields.getSerializedSize();
        this.memoizedSize = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
        if (r1 != 0) goto L_0x000d;
    L_0x0008:
        r5 = super.equals(r5);
        return r5;
    L_0x000d:
        r5 = (com.snapchat.kit.sdk.core.metrics.model.ServerEventData) r5;
        r1 = r4.getEventTypeCase();
        r2 = r5.getEventTypeCase();
        r1 = r1.equals(r2);
        r2 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x001e:
        r1 = 1;
        goto L_0x0021;
    L_0x0020:
        r1 = 0;
    L_0x0021:
        if (r1 != 0) goto L_0x0024;
    L_0x0023:
        return r2;
    L_0x0024:
        r3 = r4.eventTypeCase_;
        switch(r3) {
            case 28: goto L_0x00dc;
            case 29: goto L_0x00ca;
            case 30: goto L_0x00b8;
            case 31: goto L_0x00a7;
            case 32: goto L_0x0096;
            case 33: goto L_0x0085;
            case 34: goto L_0x0074;
            case 35: goto L_0x0063;
            case 36: goto L_0x0052;
            case 37: goto L_0x0041;
            case 38: goto L_0x002b;
            default: goto L_0x0029;
        };
    L_0x0029:
        goto L_0x00ee;
    L_0x002b:
        if (r1 == 0) goto L_0x003e;
    L_0x002d:
        r1 = r4.getLoginKitAuthComplete();
        r3 = r5.getLoginKitAuthComplete();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x003b:
        r1 = 1;
        goto L_0x00ee;
    L_0x003e:
        r1 = 0;
        goto L_0x00ee;
    L_0x0041:
        if (r1 == 0) goto L_0x003e;
    L_0x0043:
        r1 = r4.getLoginKitAuthStart();
        r3 = r5.getLoginKitAuthStart();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x0051:
        goto L_0x003b;
    L_0x0052:
        if (r1 == 0) goto L_0x003e;
    L_0x0054:
        r1 = r4.getBitmojiKitCreateAvatarTap();
        r3 = r5.getBitmojiKitCreateAvatarTap();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x0062:
        goto L_0x003b;
    L_0x0063:
        if (r1 == 0) goto L_0x003e;
    L_0x0065:
        r1 = r4.getBitmojiKitSnapchatLinkSuccess();
        r3 = r5.getBitmojiKitSnapchatLinkSuccess();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x0073:
        goto L_0x003b;
    L_0x0074:
        if (r1 == 0) goto L_0x003e;
    L_0x0076:
        r1 = r4.getBitmojiKitSnapchatLinkTap();
        r3 = r5.getBitmojiKitSnapchatLinkTap();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x0084:
        goto L_0x003b;
    L_0x0085:
        if (r1 == 0) goto L_0x003e;
    L_0x0087:
        r1 = r4.getBitmojiKitSearch();
        r3 = r5.getBitmojiKitSearch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x0095:
        goto L_0x003b;
    L_0x0096:
        if (r1 == 0) goto L_0x003e;
    L_0x0098:
        r1 = r4.getBitmojiKitShare();
        r3 = r5.getBitmojiKitShare();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x00a6:
        goto L_0x003b;
    L_0x00a7:
        if (r1 == 0) goto L_0x003e;
    L_0x00a9:
        r1 = r4.getBitmojiKitStickerPickerClose();
        r3 = r5.getBitmojiKitStickerPickerClose();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x00b7:
        goto L_0x003b;
    L_0x00b8:
        if (r1 == 0) goto L_0x003e;
    L_0x00ba:
        r1 = r4.getBitmojiKitStickerPickerOpen();
        r3 = r5.getBitmojiKitStickerPickerOpen();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x00c8:
        goto L_0x003b;
    L_0x00ca:
        if (r1 == 0) goto L_0x003e;
    L_0x00cc:
        r1 = r4.getCreativeKitShareComplete();
        r3 = r5.getCreativeKitShareComplete();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x00da:
        goto L_0x003b;
    L_0x00dc:
        if (r1 == 0) goto L_0x003e;
    L_0x00de:
        r1 = r4.getCreativeKitShareStart();
        r3 = r5.getCreativeKitShareStart();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003e;
    L_0x00ec:
        goto L_0x003b;
    L_0x00ee:
        if (r1 == 0) goto L_0x00fb;
    L_0x00f0:
        r1 = r4.unknownFields;
        r5 = r5.unknownFields;
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x00fc;
    L_0x00fb:
        r0 = 0;
    L_0x00fc:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.ServerEventData.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        switch (this.eventTypeCase_) {
            case 28:
                hashCode = (((hashCode * 37) + 28) * 53) + getCreativeKitShareStart().hashCode();
                break;
            case 29:
                hashCode = (((hashCode * 37) + 29) * 53) + getCreativeKitShareComplete().hashCode();
                break;
            case 30:
                hashCode = (((hashCode * 37) + 30) * 53) + getBitmojiKitStickerPickerOpen().hashCode();
                break;
            case 31:
                hashCode = (((hashCode * 37) + 31) * 53) + getBitmojiKitStickerPickerClose().hashCode();
                break;
            case 32:
                hashCode = (((hashCode * 37) + 32) * 53) + getBitmojiKitShare().hashCode();
                break;
            case 33:
                hashCode = (((hashCode * 37) + 33) * 53) + getBitmojiKitSearch().hashCode();
                break;
            case 34:
                hashCode = (((hashCode * 37) + 34) * 53) + getBitmojiKitSnapchatLinkTap().hashCode();
                break;
            case 35:
                hashCode = (((hashCode * 37) + 35) * 53) + getBitmojiKitSnapchatLinkSuccess().hashCode();
                break;
            case 36:
                hashCode = (((hashCode * 37) + 36) * 53) + getBitmojiKitCreateAvatarTap().hashCode();
                break;
            case 37:
                hashCode = (((hashCode * 37) + 37) * 53) + getLoginKitAuthStart().hashCode();
                break;
            case 38:
                hashCode = (((hashCode * 37) + 38) * 53) + getLoginKitAuthComplete().hashCode();
                break;
            default:
                break;
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static ServerEventData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ServerEventData) PARSER.parseFrom(byteBuffer);
    }

    public static ServerEventData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEventData) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ServerEventData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ServerEventData) PARSER.parseFrom(byteString);
    }

    public static ServerEventData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEventData) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ServerEventData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ServerEventData) PARSER.parseFrom(bArr);
    }

    public static ServerEventData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEventData) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ServerEventData parseFrom(InputStream inputStream) throws IOException {
        return (ServerEventData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ServerEventData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEventData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServerEventData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ServerEventData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ServerEventData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEventData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServerEventData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ServerEventData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ServerEventData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEventData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ServerEventData serverEventData) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(serverEventData);
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

    public static ServerEventData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ServerEventData> parser() {
        return PARSER;
    }

    public Parser<ServerEventData> getParserForType() {
        return PARSER;
    }

    public ServerEventData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
