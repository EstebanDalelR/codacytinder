package com.tinder.domain.settings.email.usecase;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.profile.model.ProfileOption.EmailSettings;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.settings.email.model.EmailDisplaySettings;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/settings/email/usecase/LoadEmailDisplaySettings;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "canEditEmail", "Lkotlin/Function0;", "", "(Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lkotlin/jvm/functions/Function0;)V", "execute", "Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadEmailDisplaySettings implements ObservableResultUseCase<EmailDisplaySettings> {
    private final Function0<Boolean> canEditEmail;
    private final LoadProfileOptionData loadProfileOptionData;

    public LoadEmailDisplaySettings(@NotNull LoadProfileOptionData loadProfileOptionData, @NotNull Function0<Boolean> function0) {
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(function0, "canEditEmail");
        this.loadProfileOptionData = loadProfileOptionData;
        this.canEditEmail = function0;
    }

    @NotNull
    public C3959e<EmailDisplaySettings> execute() {
        C3959e<EmailDisplaySettings> combineLatest = C3959e.combineLatest(this.loadProfileOptionData.execute(EmailSettings.INSTANCE), C3959e.just(this.canEditEmail.invoke()), LoadEmailDisplaySettings$execute$1.INSTANCE);
        C2668g.a(combineLatest, "Observable.combineLatest…)\n            }\n        )");
        return combineLatest;
    }
}
