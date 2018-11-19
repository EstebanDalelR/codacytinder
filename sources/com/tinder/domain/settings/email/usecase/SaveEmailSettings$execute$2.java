package com.tinder.domain.settings.email.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.settings.email.model.EmailSettings;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class SaveEmailSettings$execute$2<T> implements Consumer<Throwable> {
    final /* synthetic */ EmailSettings $request;
    final /* synthetic */ SaveEmailSettings this$0;

    SaveEmailSettings$execute$2(SaveEmailSettings saveEmailSettings, EmailSettings emailSettings) {
        this.this$0 = saveEmailSettings;
        this.$request = emailSettings;
    }

    public final void accept(Throwable th) {
        Logger access$getLogger$p = this.this$0.logger;
        C2668g.a(th, "it");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to Save Email Settings: ");
        stringBuilder.append(this.$request);
        access$getLogger$p.error(th, stringBuilder.toString());
    }
}
