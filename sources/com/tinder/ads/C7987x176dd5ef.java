package com.tinder.ads;

import com.tinder.ads.V1BrandedProfileCardMatchInsertionRule.MessageAdMatchFactory;
import dagger.internal.Factory;

/* renamed from: com.tinder.ads.V1BrandedProfileCardMatchInsertionRule_MessageAdMatchFactory_Factory */
public final class C7987x176dd5ef implements Factory<MessageAdMatchFactory> {
    private static final C7987x176dd5ef INSTANCE = new C7987x176dd5ef();

    public MessageAdMatchFactory get() {
        return C7987x176dd5ef.provideInstance();
    }

    public static MessageAdMatchFactory provideInstance() {
        return new MessageAdMatchFactory();
    }

    public static C7987x176dd5ef create() {
        return INSTANCE;
    }

    public static MessageAdMatchFactory newMessageAdMatchFactory() {
        return new MessageAdMatchFactory();
    }
}
