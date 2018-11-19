package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum BitmojiKitStickerPickerView implements ProtocolMessageEnum {
    UNKNOWN_BITMOJI_KIT_PICKER_VIEW(0),
    STICKER_PICKER(1),
    CREATE_AVATAR(2),
    LINK_ACCOUNT(3),
    UNRECOGNIZED(-1);
    
    public static final int CREATE_AVATAR_VALUE = 2;
    public static final int LINK_ACCOUNT_VALUE = 3;
    public static final int STICKER_PICKER_VALUE = 1;
    public static final int UNKNOWN_BITMOJI_KIT_PICKER_VIEW_VALUE = 0;
    private static final BitmojiKitStickerPickerView[] VALUES = null;
    private static final EnumLiteMap<BitmojiKitStickerPickerView> internalValueMap = null;
    private final int value;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView$1 */
    static class C71471 implements EnumLiteMap<BitmojiKitStickerPickerView> {
        C71471() {
        }

        public BitmojiKitStickerPickerView findValueByNumber(int i) {
            return BitmojiKitStickerPickerView.forNumber(i);
        }
    }

    static {
        internalValueMap = new C71471();
        VALUES = values();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BitmojiKitStickerPickerView valueOf(int i) {
        return forNumber(i);
    }

    public static BitmojiKitStickerPickerView forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BITMOJI_KIT_PICKER_VIEW;
            case 1:
                return STICKER_PICKER;
            case 2:
                return CREATE_AVATAR;
            case 3:
                return LINK_ACCOUNT;
            default:
                return 0;
        }
    }

    public static EnumLiteMap<BitmojiKitStickerPickerView> internalGetValueMap() {
        return internalValueMap;
    }

    public final EnumValueDescriptor getValueDescriptor() {
        return (EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
    }

    public final EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) Event.getDescriptor().getEnumTypes().get(2);
    }

    public static BitmojiKitStickerPickerView valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private BitmojiKitStickerPickerView(int i) {
        this.value = i;
    }
}
