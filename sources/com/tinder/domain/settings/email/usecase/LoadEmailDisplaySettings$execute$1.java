package com.tinder.domain.settings.email.usecase;

import com.tinder.domain.settings.email.model.EmailDisplaySettings;
import com.tinder.domain.settings.email.model.EmailSettings;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;", "emailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "canEditEmail", "", "apply", "(Lcom/tinder/domain/settings/email/model/EmailSettings;Ljava/lang/Boolean;)Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;"}, k = 3, mv = {1, 1, 10})
final class LoadEmailDisplaySettings$execute$1<T1, T2, R> implements BiFunction<EmailSettings, Boolean, EmailDisplaySettings> {
    public static final LoadEmailDisplaySettings$execute$1 INSTANCE = new LoadEmailDisplaySettings$execute$1();

    LoadEmailDisplaySettings$execute$1() {
    }

    @NotNull
    public final EmailDisplaySettings apply(@NotNull EmailSettings emailSettings, @NotNull Boolean bool) {
        C2668g.b(emailSettings, "emailSettings");
        C2668g.b(bool, "canEditEmail");
        return new EmailDisplaySettings(emailSettings, bool.booleanValue());
    }
}
