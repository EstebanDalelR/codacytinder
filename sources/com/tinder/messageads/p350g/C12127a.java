package com.tinder.messageads.p350g;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.messageads.model.C9912b;
import com.tinder.messageads.repository.MessageAdSettingsRepository;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/messageads/usecase/LoadMessageAdMatchSettings;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "messageAdMatchSettingsRepository", "Lcom/tinder/messageads/repository/MessageAdSettingsRepository;", "(Lcom/tinder/messageads/repository/MessageAdSettingsRepository;)V", "execute", "Lio/reactivex/Single;", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.g.a */
public final class C12127a implements SingleResultUseCase<C9912b> {
    /* renamed from: a */
    private final MessageAdSettingsRepository f39350a;

    @Inject
    public C12127a(@NotNull MessageAdSettingsRepository messageAdSettingsRepository) {
        C2668g.b(messageAdSettingsRepository, "messageAdMatchSettingsRepository");
        this.f39350a = messageAdSettingsRepository;
    }

    @NotNull
    public C3960g<C9912b> execute() {
        return this.f39350a.load();
    }
}
