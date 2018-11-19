package com.tinder.settings.feed.p406a;

import com.tinder.domain.settings.feed.model.FeedSettings;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.domain.settings.feed.model.FeedSharingType;
import com.tinder.domain.settings.feed.usecase.SaveFeedSettings;
import com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase;
import com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase.C14871a;
import com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase.Type;
import com.tinder.settings.feed.analytics.C16628b;
import com.tinder.settings.feed.analytics.C16628b.C14873a;
import com.tinder.settings.feed.injection.FeedSettingsActivityScope;
import com.tinder.settings.feed.provider.C14879a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0014J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/settings/feed/controller/FeedSettingsController;", "", "feedSettingsShadowProvider", "Lcom/tinder/settings/feed/provider/FeedSettingsShadowProvider;", "saveFeedSettings", "Lcom/tinder/domain/settings/feed/usecase/SaveFeedSettings;", "addSettingsFeedInteractUseCase", "Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase;", "addSettingsFeedUseCase", "Lcom/tinder/settings/feed/analytics/AddSettingsFeedUseCase;", "(Lcom/tinder/settings/feed/provider/FeedSettingsShadowProvider;Lcom/tinder/domain/settings/feed/usecase/SaveFeedSettings;Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase;Lcom/tinder/settings/feed/analytics/AddSettingsFeedUseCase;)V", "disableFeedSharingOptions", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "feedSettings", "enableFeedSharingOptions", "getAddSettingsFeedInteractUseCaseTypeFromFeedSharingType", "Lcom/tinder/settings/feed/analytics/AddSettingsFeedInteractUseCase$Type;", "feedSharingOption", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "onFeedSharingDisabled", "", "onFeedSharingEnabled", "onSharingOptionChanged", "saveSettings", "toggleFeedSharingOptions", "toggle", "", "updateFeedSharingOption", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@FeedSettingsActivityScope
/* renamed from: com.tinder.settings.feed.a.a */
public final class C14868a {
    /* renamed from: a */
    private final C14879a f46543a;
    /* renamed from: b */
    private final SaveFeedSettings f46544b;
    /* renamed from: c */
    private final AddSettingsFeedInteractUseCase f46545c;
    /* renamed from: d */
    private final C16628b f46546d;

    @Inject
    public C14868a(@NotNull C14879a c14879a, @NotNull SaveFeedSettings saveFeedSettings, @NotNull AddSettingsFeedInteractUseCase addSettingsFeedInteractUseCase, @NotNull C16628b c16628b) {
        C2668g.b(c14879a, "feedSettingsShadowProvider");
        C2668g.b(saveFeedSettings, "saveFeedSettings");
        C2668g.b(addSettingsFeedInteractUseCase, "addSettingsFeedInteractUseCase");
        C2668g.b(c16628b, "addSettingsFeedUseCase");
        this.f46543a = c14879a;
        this.f46544b = saveFeedSettings;
        this.f46545c = addSettingsFeedInteractUseCase;
        this.f46546d = c16628b;
    }

    /* renamed from: a */
    public final void m56294a() {
        this.f46543a.m56322a(m56289a(this.f46543a.m56321a()));
        this.f46545c.m62083a(new C14871a(Type.ALL, true));
    }

    /* renamed from: b */
    public final void m56296b() {
        this.f46543a.m56322a(m56292b(this.f46543a.m56321a()));
        this.f46545c.m62083a(new C14871a(Type.ALL, false));
    }

    /* renamed from: a */
    public final void m56295a(@NotNull FeedSharingOption feedSharingOption) {
        C2668g.b(feedSharingOption, "feedSharingOption");
        this.f46543a.m56322a(m56290a(this.f46543a.m56321a(), feedSharingOption));
        this.f46545c.m62083a(new C14871a(m56293b(feedSharingOption), feedSharingOption.getEnabled()));
    }

    /* renamed from: c */
    public final void m56297c() {
        FeedSettings a = this.f46543a.m56321a();
        if (!a.getOptions().isEmpty()) {
            this.f46544b.execute(a);
            this.f46546d.m62089a(new C14873a(a.getOption(FeedSharingType.PROFILE_PHOTOS).getEnabled(), a.getOption(FeedSharingType.SPOTIFY_ANTHEM).getEnabled(), a.getOption(FeedSharingType.SPOTIFY_TOP_ARTISTS).getEnabled()));
        }
    }

    /* renamed from: a */
    private final FeedSettings m56289a(FeedSettings feedSettings) {
        return m56291a(feedSettings, true);
    }

    /* renamed from: b */
    private final FeedSettings m56292b(FeedSettings feedSettings) {
        return m56291a(feedSettings, false);
    }

    /* renamed from: a */
    private final FeedSettings m56291a(FeedSettings feedSettings, boolean z) {
        Set linkedHashSet = new LinkedHashSet();
        for (FeedSharingOption feedSharingType : C19299w.m68845q(feedSettings.getOptions())) {
            linkedHashSet.add(new FeedSharingOption(feedSharingType.getFeedSharingType(), z));
        }
        return new FeedSettings(linkedHashSet);
    }

    /* renamed from: a */
    private final FeedSettings m56290a(FeedSettings feedSettings, FeedSharingOption feedSharingOption) {
        Set q = C19299w.m68845q(feedSettings.getOptions());
        Collection collection = q;
        for (Object next : feedSettings.getOptions()) {
            Object obj;
            if (((FeedSharingOption) next).getFeedSharingType() == feedSharingOption.getFeedSharingType()) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        if (collection == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        C15829m.m59880c(collection).remove(next2);
        q.add(feedSharingOption);
        return new FeedSettings(q);
    }

    /* renamed from: b */
    private final Type m56293b(FeedSharingOption feedSharingOption) {
        switch (C14869b.f46547a[feedSharingOption.getFeedSharingType().ordinal()]) {
            case 1:
                return Type.INSTAGRAM;
            case 2:
                return Type.SPOTIFY_TOP_ARTISTS;
            case 3:
                return Type.SPOTIFY_ANTHEM;
            case 4:
                return Type.PHOTOS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
