package com.tinder.typingindicator.repository;

import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.typingindicator.model.TypingIndicator;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;", "", "addTypingIndicator", "Lio/reactivex/Completable;", "typingIndicator", "Lcom/tinder/typingindicator/model/TypingIndicator;", "interruptTypingIndicatorForMatchId", "", "matchId", "", "observeConfig", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "observeTypingIndicatorForMatchId", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TypingIndicatorRepository {
    @NotNull
    C3956a addTypingIndicator(@NotNull TypingIndicator typingIndicator);

    void interruptTypingIndicatorForMatchId(@NotNull String str);

    @NotNull
    C3957b<TypingIndicatorConfig> observeConfig();

    @NotNull
    C3957b<TypingIndicator> observeTypingIndicatorForMatchId(@NotNull String str);
}
