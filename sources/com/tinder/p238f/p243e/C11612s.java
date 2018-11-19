package com.tinder.p238f.p243e;

import android.support.annotation.NonNull;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.model.UserMeta;
import com.tinder.tinderplus.model.C15214d;
import com.tinder.tinderplus.provider.C15220b;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.f.e.s */
public class C11612s extends Watcher<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final C15220b f38019a;

    protected /* synthetic */ void execute(@NonNull Object obj) {
        m47340a((UserMeta) obj);
    }

    @Inject
    C11612s(@NonNull C15220b c15220b, @NonNull Logger logger) {
        super(logger);
        this.f38019a = c15220b;
    }

    /* renamed from: a */
    protected void m47340a(@NonNull UserMeta userMeta) {
        this.f38019a.a(C15214d.a(userMeta));
    }
}
