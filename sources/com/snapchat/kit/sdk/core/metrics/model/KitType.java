package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum KitType implements ProtocolMessageEnum {
    UNKNOWN_KIT_TYPE(0),
    BITMOJI_KIT(1),
    CREATIVE_KIT(2),
    LOGIN_KIT(3),
    UNRECOGNIZED(-1);
    
    public static final int BITMOJI_KIT_VALUE = 1;
    public static final int CREATIVE_KIT_VALUE = 2;
    public static final int LOGIN_KIT_VALUE = 3;
    public static final int UNKNOWN_KIT_TYPE_VALUE = 0;
    private static final KitType[] VALUES = null;
    private static final EnumLiteMap<KitType> internalValueMap = null;
    private final int value;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.KitType$1 */
    static class C71491 implements EnumLiteMap<KitType> {
        C71491() {
        }

        public KitType findValueByNumber(int i) {
            return KitType.forNumber(i);
        }
    }

    static {
        internalValueMap = new C71491();
        VALUES = values();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KitType valueOf(int i) {
        return forNumber(i);
    }

    public static KitType forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_KIT_TYPE;
            case 1:
                return BITMOJI_KIT;
            case 2:
                return CREATIVE_KIT;
            case 3:
                return LOGIN_KIT;
            default:
                return 0;
        }
    }

    public static EnumLiteMap<KitType> internalGetValueMap() {
        return internalValueMap;
    }

    public final EnumValueDescriptor getValueDescriptor() {
        return (EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
    }

    public final EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) Event.getDescriptor().getEnumTypes().get(1);
    }

    public static KitType valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private KitType(int i) {
        this.value = i;
    }
}
