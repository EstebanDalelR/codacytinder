package com.tinder.domain.settings.email.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.settings.email.model.EmailSettings;
import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class SaveEmailSettings$execute$1 implements Action {
    final /* synthetic */ EmailSettings $request;
    final /* synthetic */ SaveEmailSettings this$0;

    SaveEmailSettings$execute$1(SaveEmailSettings saveEmailSettings, EmailSettings emailSettings) {
        this.this$0 = saveEmailSettings;
        this.$request = emailSettings;
    }

    public final void run() {
        Logger access$getLogger$p = this.this$0.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Saved Email Settings ");
        stringBuilder.append(this.$request);
        access$getLogger$p.debug(stringBuilder.toString());
    }
}
