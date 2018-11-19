package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum ServerTier implements ProtocolMessageEnum {
    OPS_TIER(0),
    CRITICAL_TIER(1),
    BUSINESS_TIER(2),
    UNRECOGNIZED(-1);
    
    public static final int BUSINESS_TIER_VALUE = 2;
    public static final int CRITICAL_TIER_VALUE = 1;
    public static final int OPS_TIER_VALUE = 0;
    private static final ServerTier[] VALUES = null;
    private static final EnumLiteMap<ServerTier> internalValueMap = null;
    private final int value;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.ServerTier$1 */
    static class C71521 implements EnumLiteMap<ServerTier> {
        C71521() {
        }

        public ServerTier findValueByNumber(int i) {
            return ServerTier.forNumber(i);
        }
    }

    static {
        internalValueMap = new C71521();
        VALUES = values();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ServerTier valueOf(int i) {
        return forNumber(i);
    }

    public static ServerTier forNumber(int i) {
        switch (i) {
            case 0:
                return OPS_TIER;
            case 1:
                return CRITICAL_TIER;
            case 2:
                return BUSINESS_TIER;
            default:
                return 0;
        }
    }

    public static EnumLiteMap<ServerTier> internalGetValueMap() {
        return internalValueMap;
    }

    public final EnumValueDescriptor getValueDescriptor() {
        return (EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
    }

    public final EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) Event.getDescriptor().getEnumTypes().get(0);
    }

    public static ServerTier valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private ServerTier(int i) {
        this.value = i;
    }
}
