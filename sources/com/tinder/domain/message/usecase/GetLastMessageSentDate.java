package com.tinder.domain.message.usecase;

import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.message.MessageRepository;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/message/usecase/GetLastMessageSentDate;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "Ljava8/util/Optional;", "Lorg/joda/time/DateTime;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/message/MessageRepository;)V", "execute", "Lrx/Single;", "matchId", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class GetLastMessageSentDate implements SingleUseCase<String, Optional<DateTime>> {
    private final MessageRepository messageRepository;

    @Inject
    public GetLastMessageSentDate(@NotNull MessageRepository messageRepository) {
        C2668g.b(messageRepository, "messageRepository");
        this.messageRepository = messageRepository;
    }

    @NotNull
    public Single<Optional<DateTime>> execute(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.messageRepository.minSentDateForPageSize(str, 1).h().a();
        C2668g.a(str, "messageRepository\n      …              .toSingle()");
        return str;
    }
}
