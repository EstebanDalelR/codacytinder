package com.tinder.domain.toppicks;

import io.reactivex.C3959e;
import io.reactivex.subjects.C18432c;
import io.reactivex.subjects.C19040a;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProviderAndNotifier;", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusNotifier;", "()V", "subject", "Lio/reactivex/subjects/Subject;", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatus;", "kotlin.jvm.PlatformType", "observeLoadingStatus", "Lio/reactivex/Observable;", "update", "", "status", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksLoadingStatusProviderAndNotifier implements TopPicksLoadingStatusNotifier, TopPicksLoadingStatusProvider {
    private final C18432c<TopPicksLoadingStatus> subject = C19040a.a(TopPicksLoadingStatus.UNINITIALIZED).d();

    @NotNull
    public C3959e<TopPicksLoadingStatus> observeLoadingStatus() {
        C3959e<TopPicksLoadingStatus> hide = this.subject.hide();
        C2668g.a(hide, "subject.hide()");
        return hide;
    }

    public void update(@NotNull TopPicksLoadingStatus topPicksLoadingStatus) {
        C2668g.b(topPicksLoadingStatus, "status");
        this.subject.onNext(topPicksLoadingStatus);
    }
}
