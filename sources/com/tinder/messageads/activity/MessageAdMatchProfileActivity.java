package com.tinder.messageads.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tinder.R;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.managers.ManagerApp;
import com.tinder.messageads.model.MessageAdTrackingEvent;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import com.tinder.profile.view.MatchProfileView;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/messageads/activity/MessageAdMatchProfileActivity;", "Lcom/tinder/base/ActivitySignedInBase;", "Lcom/tinder/profile/module/ProfileComponentProvider;", "()V", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "getAdUrlTracker", "()Lcom/tinder/addy/tracker/AdUrlTracker;", "setAdUrlTracker", "(Lcom/tinder/addy/tracker/AdUrlTracker;)V", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "getMatchRepository", "()Lcom/tinder/domain/match/repository/MatchRepository;", "setMatchRepository", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "profileComponent", "Lcom/tinder/profile/module/ProfileComponent;", "profileFactory", "Lcom/tinder/profile/model/Profile$Factory;", "getProfileFactory", "()Lcom/tinder/profile/model/Profile$Factory;", "setProfileFactory", "(Lcom/tinder/profile/model/Profile$Factory;)V", "profileView", "Lcom/tinder/profile/view/MatchProfileView;", "onCreate", "", "bundle", "Landroid/os/Bundle;", "provideComponent", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MessageAdMatchProfileActivity extends ActivitySignedInBase implements ProfileComponentProvider {
    /* renamed from: d */
    public static final C9899a f45423d = new C9899a();
    @Inject
    @NotNull
    /* renamed from: a */
    public MatchRepository f45424a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C14418b f45425b;
    @Inject
    @NotNull
    /* renamed from: c */
    public AdUrlTracker f45426c;
    /* renamed from: e */
    private ProfileComponent f45427e;
    /* renamed from: f */
    private MatchProfileView f45428f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/messageads/activity/MessageAdMatchProfileActivity$Companion;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "matchId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.MessageAdMatchProfileActivity$a */
    public static final class C9899a {
        private C9899a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m40715a(@NotNull Context context, @NotNull String str) {
            C2668g.b(context, "context");
            C2668g.b(str, "matchId");
            Intent intent = new Intent(context, MessageAdMatchProfileActivity.class);
            intent.putExtra("message_match_id", str);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/messageads/activity/MessageAdMatchProfileActivity$onCreate$1", "Lcom/tinder/profile/view/BasicInfoView$OnExitClickListener;", "(Lcom/tinder/messageads/activity/MessageAdMatchProfileActivity;)V", "onExitViewClick", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.MessageAdMatchProfileActivity$d */
    public static final class C12116d implements OnExitClickListener {
        /* renamed from: a */
        final /* synthetic */ MessageAdMatchProfileActivity f39294a;

        C12116d(MessageAdMatchProfileActivity messageAdMatchProfileActivity) {
            this.f39294a = messageAdMatchProfileActivity;
        }

        public void onExitViewClick() {
            this.f39294a.finish();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/profile/model/Profile;", "it", "Lcom/tinder/domain/match/model/MessageAdMatch;", "kotlin.jvm.PlatformType", "call", "com/tinder/messageads/activity/MessageAdMatchProfileActivity$onCreate$2$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.MessageAdMatchProfileActivity$b */
    static final class C13469b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ MessageAdMatchProfileActivity f42729a;

        C13469b(MessageAdMatchProfileActivity messageAdMatchProfileActivity) {
            this.f42729a = messageAdMatchProfileActivity;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52029a((MessageAdMatch) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Profile m52029a(MessageAdMatch messageAdMatch) {
            this.f42729a.m54563e().a(messageAdMatch.getId(), MessageAdTrackingEvent.PROFILE);
            return this.f42729a.m54562d().a(messageAdMatch);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.MessageAdMatchProfileActivity$e */
    static final class C13470e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13470e f42730a = new C13470e();

        C13470e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m52030a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m52030a(Optional<Match> optional) {
            return (Match) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/profile/model/Profile;", "kotlin.jvm.PlatformType", "call", "com/tinder/messageads/activity/MessageAdMatchProfileActivity$onCreate$2$3"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.MessageAdMatchProfileActivity$c */
    static final class C14080c<T> implements Action1<Profile> {
        /* renamed from: a */
        final /* synthetic */ MessageAdMatchProfileActivity f44599a;

        C14080c(MessageAdMatchProfileActivity messageAdMatchProfileActivity) {
            this.f44599a = messageAdMatchProfileActivity;
        }

        public /* synthetic */ void call(Object obj) {
            m53802a((Profile) obj);
        }

        /* renamed from: a */
        public final void m53802a(Profile profile) {
            MessageAdMatchProfileActivity.m54561a(this.f44599a).showProfile(profile, (String) null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.MessageAdMatchProfileActivity$f */
    static final class C14081f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14081f f44600a = new C14081f();

        C14081f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53803a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53803a(Throwable th) {
            C0001a.c(th, "Failed to load MessageAdMatch", new Object[0]);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ MatchProfileView m54561a(MessageAdMatchProfileActivity messageAdMatchProfileActivity) {
        messageAdMatchProfileActivity = messageAdMatchProfileActivity.f45428f;
        if (messageAdMatchProfileActivity == null) {
            C2668g.b("profileView");
        }
        return messageAdMatchProfileActivity;
    }

    @NotNull
    /* renamed from: d */
    public final C14418b m54562d() {
        C14418b c14418b = this.f45425b;
        if (c14418b == null) {
            C2668g.b("profileFactory");
        }
        return c14418b;
    }

    @NotNull
    /* renamed from: e */
    public final AdUrlTracker m54563e() {
        AdUrlTracker adUrlTracker = this.f45426c;
        if (adUrlTracker == null) {
            C2668g.b("adUrlTracker");
        }
        return adUrlTracker;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getApplication();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        bundle = ((ManagerApp) bundle).h().profileComponentBuilder().profileActivityContext(this).build();
        C2668g.a(bundle, "(application as ManagerA…his)\n            .build()");
        this.f45427e = bundle;
        bundle = this.f45427e;
        if (bundle == null) {
            C2668g.b("profileComponent");
        }
        bundle.inject(this);
        setContentView(R.layout.activity_message_ad_match_profile);
        bundle = findViewById(R.id.message_ad_match_profile_view);
        C2668g.a(bundle, "findViewById(R.id.message_ad_match_profile_view)");
        this.f45428f = (MatchProfileView) bundle;
        bundle = this.f45428f;
        if (bundle == null) {
            C2668g.b("profileView");
        }
        bundle.a(ProfileScreenSource.CHAT);
        bundle = this.f45428f;
        if (bundle == null) {
            C2668g.b("profileView");
        }
        bundle.setOnExitClickListener(new C12116d(this));
        bundle = getIntent().getStringExtra("message_match_id");
        if (bundle != null) {
            MatchRepository matchRepository = this.f45424a;
            if (matchRepository == null) {
                C2668g.b("matchRepository");
            }
            if (matchRepository.getMatch(bundle).b(Schedulers.io()).a(C19397a.a()).k(C13470e.f42730a).a(MessageAdMatch.class).k(new C13469b(this)).a(new C14080c(this), C14081f.f44600a) != null) {
                return;
            }
        }
        throw ((Throwable) new IllegalArgumentException("Must supply a Match ID"));
    }

    @NotNull
    public ProfileComponent provideComponent() {
        ProfileComponent profileComponent = this.f45427e;
        if (profileComponent == null) {
            C2668g.b("profileComponent");
        }
        return profileComponent;
    }
}
