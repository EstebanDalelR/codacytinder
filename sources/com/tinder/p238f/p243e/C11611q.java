package com.tinder.p238f.p243e;

import android.support.annotation.NonNull;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.model.UserMeta;
import com.tinder.module.Default;
import com.tinder.p238f.p239a.C9363a;
import de.greenrobot.event.C2664c;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.f.e.q */
public class C11611q extends Watcher<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final C9363a f38017a;
    @NonNull
    /* renamed from: b */
    private final C2664c f38018b;

    protected /* synthetic */ void execute(@NonNull Object obj) {
        m47339a((UserMeta) obj);
    }

    @Inject
    C11611q(@NonNull C9363a c9363a, @Default @NonNull C2664c c2664c, @NonNull Logger logger) {
        super(logger);
        this.f38017a = c9363a;
        this.f38018b = c2664c;
    }

    /* renamed from: a */
    protected void m47339a(@NonNull UserMeta userMeta) {
        this.f38017a.m39207a(userMeta);
        this.f38018b.e(new EventGlobalsLoaded(userMeta.getGlobalConfig(), userMeta));
    }
}
