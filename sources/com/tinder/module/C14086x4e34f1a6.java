package com.tinder.module;

import com.tinder.managers.UserMetaManager;
import com.tinder.model.GlobalConfig;
import com.tinder.model.UserMeta;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.module.EmailSettingsEmailEditableModule$provideLoadEmailDisplaySettings$1 */
final class C14086x4e34f1a6 extends Lambda implements Function0<Boolean> {
    /* renamed from: a */
    final /* synthetic */ UserMetaManager f44615a;

    C14086x4e34f1a6(UserMetaManager userMetaManager) {
        this.f44615a = userMetaManager;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Boolean.valueOf(m53813a());
    }

    /* renamed from: a */
    public final boolean m53813a() {
        UserMeta metaUser = this.f44615a.getMetaUser();
        if (metaUser != null) {
            GlobalConfig globalConfig = metaUser.getGlobalConfig();
            if (globalConfig != null) {
                return globalConfig.canEditEmail();
            }
        }
        return false;
    }
}
