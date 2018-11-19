package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum BitmojiKitSearchCategory implements ProtocolMessageEnum {
    UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY(0),
    TEXT(1),
    AUTOCOMPLETE(2),
    PROGRAMMED_PILLS(3),
    UNRECOGNIZED(-1);
    
    public static final int AUTOCOMPLETE_VALUE = 2;
    public static final int PROGRAMMED_PILLS_VALUE = 3;
    public static final int TEXT_VALUE = 1;
    public static final int UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY_VALUE = 0;
    private static final BitmojiKitSearchCategory[] VALUES = null;
    private static final EnumLiteMap<BitmojiKitSearchCategory> internalValueMap = null;
    private final int value;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory$1 */
    static class C71451 implements EnumLiteMap<BitmojiKitSearchCategory> {
        C71451() {
        }

        public BitmojiKitSearchCategory findValueByNumber(int i) {
            return BitmojiKitSearchCategory.forNumber(i);
        }
    }

    static {
        internalValueMap = new C71451();
        VALUES = values();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BitmojiKitSearchCategory valueOf(int i) {
        return forNumber(i);
    }

    public static BitmojiKitSearchCategory forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
            case 1:
                return TEXT;
            case 2:
                return AUTOCOMPLETE;
            case 3:
                return PROGRAMMED_PILLS;
            default:
                return 0;
        }
    }

    public static EnumLiteMap<BitmojiKitSearchCategory> internalGetValueMap() {
        return internalValueMap;
    }

    public final EnumValueDescriptor getValueDescriptor() {
        return (EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
    }

    public final EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) Event.getDescriptor().getEnumTypes().get(4);
    }

    public static BitmojiKitSearchCategory valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private BitmojiKitSearchCategory(int i) {
        this.value = i;
    }
}
