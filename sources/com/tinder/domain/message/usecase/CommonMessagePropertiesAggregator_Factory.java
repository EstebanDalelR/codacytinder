package com.tinder.domain.message.usecase;

import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

public final class CommonMessagePropertiesAggregator_Factory implements Factory<CommonMessagePropertiesAggregator> {
    private final Provider<Function0<String>> clientSideMessageIdGeneratorProvider;
    private final Provider<Function0<DateTime>> fallbackMessageSentDateProvider;
    private final Provider<GetCurrentUser> getCurrentUserProvider;
    private final Provider<GetLastMessageSentDate> getLastMessageSentDateProvider;
    private final Provider<GetMatch> getMatchProvider;

    public CommonMessagePropertiesAggregator_Factory(Provider<GetMatch> provider, Provider<GetCurrentUser> provider2, Provider<GetLastMessageSentDate> provider3, Provider<Function0<String>> provider4, Provider<Function0<DateTime>> provider5) {
        this.getMatchProvider = provider;
        this.getCurrentUserProvider = provider2;
        this.getLastMessageSentDateProvider = provider3;
        this.clientSideMessageIdGeneratorProvider = provider4;
        this.fallbackMessageSentDateProvider = provider5;
    }

    public CommonMessagePropertiesAggregator get() {
        return provideInstance(this.getMatchProvider, this.getCurrentUserProvider, this.getLastMessageSentDateProvider, this.clientSideMessageIdGeneratorProvider, this.fallbackMessageSentDateProvider);
    }

    public static CommonMessagePropertiesAggregator provideInstance(Provider<GetMatch> provider, Provider<GetCurrentUser> provider2, Provider<GetLastMessageSentDate> provider3, Provider<Function0<String>> provider4, Provider<Function0<DateTime>> provider5) {
        return new CommonMessagePropertiesAggregator((GetMatch) provider.get(), (GetCurrentUser) provider2.get(), (GetLastMessageSentDate) provider3.get(), (Function0) provider4.get(), (Function0) provider5.get());
    }

    public static CommonMessagePropertiesAggregator_Factory create(Provider<GetMatch> provider, Provider<GetCurrentUser> provider2, Provider<GetLastMessageSentDate> provider3, Provider<Function0<String>> provider4, Provider<Function0<DateTime>> provider5) {
        return new CommonMessagePropertiesAggregator_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static CommonMessagePropertiesAggregator newCommonMessagePropertiesAggregator(GetMatch getMatch, GetCurrentUser getCurrentUser, GetLastMessageSentDate getLastMessageSentDate, Function0<String> function0, Function0<DateTime> function02) {
        return new CommonMessagePropertiesAggregator(getMatch, getCurrentUser, getLastMessageSentDate, function0, function02);
    }
}
