package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

public final class SendFeedComment_Factory implements Factory<SendFeedComment> {
    private final Provider<Function0<DateTime>> dateTimeProvider;
    private final Provider<FeedRepository> feedRepositoryProvider;

    public SendFeedComment_Factory(Provider<FeedRepository> provider, Provider<Function0<DateTime>> provider2) {
        this.feedRepositoryProvider = provider;
        this.dateTimeProvider = provider2;
    }

    public SendFeedComment get() {
        return provideInstance(this.feedRepositoryProvider, this.dateTimeProvider);
    }

    public static SendFeedComment provideInstance(Provider<FeedRepository> provider, Provider<Function0<DateTime>> provider2) {
        return new SendFeedComment((FeedRepository) provider.get(), (Function0) provider2.get());
    }

    public static SendFeedComment_Factory create(Provider<FeedRepository> provider, Provider<Function0<DateTime>> provider2) {
        return new SendFeedComment_Factory(provider, provider2);
    }

    public static SendFeedComment newSendFeedComment(FeedRepository feedRepository, Function0<DateTime> function0) {
        return new SendFeedComment(feedRepository, function0);
    }
}
