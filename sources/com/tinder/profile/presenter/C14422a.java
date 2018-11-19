package com.tinder.profile.presenter;

import com.tinder.feed.view.model.C9541g;
import com.tinder.overflow.analytics.C12245c;
import com.tinder.overflow.analytics.C12245c.C10025a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/profile/presenter/BasicInfoPresenter;", "", "addFeedbackUserReportEventFromProfile", "Lcom/tinder/overflow/analytics/AddFeedbackUserReportEventFromProfile;", "(Lcom/tinder/overflow/analytics/AddFeedbackUserReportEventFromProfile;)V", "onReportFeedbackReceived", "", "matchId", "", "personId", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.presenter.a */
public final class C14422a {
    /* renamed from: a */
    private final C12245c f45637a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.a$a */
    static final class C16109a implements Action {
        /* renamed from: a */
        public static final C16109a f50158a = new C16109a();

        C16109a() {
        }

        public final void run() {
            C0001a.b("Sent Feedback User Event for reporting through profile", new Object[0]);
        }
    }

    @Inject
    public C14422a(@NotNull C12245c c12245c) {
        C2668g.b(c12245c, "addFeedbackUserReportEventFromProfile");
        this.f45637a = c12245c;
    }

    /* renamed from: a */
    public final void m54971a(@Nullable String str, @Nullable String str2, @NotNull C9541g c9541g) {
        C2668g.b(c9541g, "feedbackInfo");
        str = this.f45637a.a(new C10025a(str, str2, c9541g)).b(C15756a.m59010b());
        Action action = (Action) C16109a.f50158a;
        c9541g = (Function1) BasicInfoPresenter$onReportFeedbackReceived$2.f59369a;
        if (c9541g != null) {
            c9541g = new C16110b(c9541g);
        }
        str.a(action, (Consumer) c9541g);
    }
}
