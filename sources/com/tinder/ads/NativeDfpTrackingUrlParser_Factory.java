package com.tinder.ads;

import dagger.internal.Factory;

public final class NativeDfpTrackingUrlParser_Factory implements Factory<NativeDfpTrackingUrlParser> {
    private static final NativeDfpTrackingUrlParser_Factory INSTANCE = new NativeDfpTrackingUrlParser_Factory();

    public NativeDfpTrackingUrlParser get() {
        return provideInstance();
    }

    public static NativeDfpTrackingUrlParser provideInstance() {
        return new NativeDfpTrackingUrlParser();
    }

    public static NativeDfpTrackingUrlParser_Factory create() {
        return INSTANCE;
    }

    public static NativeDfpTrackingUrlParser newNativeDfpTrackingUrlParser() {
        return new NativeDfpTrackingUrlParser();
    }
}
