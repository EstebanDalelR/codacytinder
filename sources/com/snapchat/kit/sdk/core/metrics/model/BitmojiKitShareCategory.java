package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum BitmojiKitShareCategory implements ProtocolMessageEnum {
    UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY(0),
    POPULAR(1),
    SEARCH(2),
    UNRECOGNIZED(-1);
    
    public static final int POPULAR_VALUE = 1;
    public static final int SEARCH_VALUE = 2;
    public static final int UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY_VALUE = 0;
    private static final BitmojiKitShareCategory[] VALUES = null;
    private static final EnumLiteMap<BitmojiKitShareCategory> internalValueMap = null;
    private final int value;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShareCategory$1 */
    static class C71461 implements EnumLiteMap<BitmojiKitShareCategory> {
        C71461() {
        }

        public BitmojiKitShareCategory findValueByNumber(int i) {
            return BitmojiKitShareCategory.forNumber(i);
        }
    }

    static {
        internalValueMap = new C71461();
        VALUES = values();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BitmojiKitShareCategory valueOf(int i) {
        return forNumber(i);
    }

    public static BitmojiKitShareCategory forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY;
            case 1:
                return POPULAR;
            case 2:
                return SEARCH;
            default:
                return 0;
        }
    }

    public static EnumLiteMap<BitmojiKitShareCategory> internalGetValueMap() {
        return internalValueMap;
    }

    public final EnumValueDescriptor getValueDescriptor() {
        return (EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
    }

    public final EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) Event.getDescriptor().getEnumTypes().get(3);
    }

    public static BitmojiKitShareCategory valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private BitmojiKitShareCategory(int i) {
        this.value = i;
    }
}
