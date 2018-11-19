package com.tinder.domain.message.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.message.MessageRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/message/usecase/CleanUpPendingMessages;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/message/MessageRepository;Lcom/tinder/common/logger/Logger;)V", "execute", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CleanUpPendingMessages implements SimpleVoidUseCase {
    private final Logger logger;
    private final MessageRepository messageRepository;

    @Inject
    public CleanUpPendingMessages(@NotNull MessageRepository messageRepository, @NotNull Logger logger) {
        C2668g.m10309b(messageRepository, "messageRepository");
        C2668g.m10309b(logger, "logger");
        this.messageRepository = messageRepository;
        this.logger = logger;
    }

    public void execute() {
        this.messageRepository.markAllPendingAsFailed().m10386b(Schedulers.io()).m10381a((Action0) new CleanUpPendingMessages$execute$1(this), (Action1) new CleanUpPendingMessages$execute$2(this));
    }
}
