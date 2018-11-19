package com.tinder.data.profile;

import com.tinder.data.profile.persistence.C10960a;
import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.onboarding.Onboarding;
import com.tinder.domain.onboarding.Onboarding.Tutorial;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Name;
import com.tinder.domain.onboarding.TutorialToOnboardingTutorialNameAdapter;
import com.tinder.domain.profile.model.ProfileDataRequest;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfileOption.AccountInfo;
import com.tinder.domain.profile.model.ProfileOption.AccountSettings;
import com.tinder.domain.profile.model.ProfileOption.ActivityFeed;
import com.tinder.domain.profile.model.ProfileOption.Boost;
import com.tinder.domain.profile.model.ProfileOption.Discovery;
import com.tinder.domain.profile.model.ProfileOption.EmailSettings;
import com.tinder.domain.profile.model.ProfileOption.Facebook;
import com.tinder.domain.profile.model.ProfileOption.Instagram;
import com.tinder.domain.profile.model.ProfileOption.Interests;
import com.tinder.domain.profile.model.ProfileOption.Likes;
import com.tinder.domain.profile.model.ProfileOption.Notifications;
import com.tinder.domain.profile.model.ProfileOption.Passport;
import com.tinder.domain.profile.model.ProfileOption.Places;
import com.tinder.domain.profile.model.ProfileOption.PlusControl;
import com.tinder.domain.profile.model.ProfileOption.Products;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.model.ProfileOption.Select;
import com.tinder.domain.profile.model.ProfileOption.ShowGender;
import com.tinder.domain.profile.model.ProfileOption.SmartPhoto;
import com.tinder.domain.profile.model.ProfileOption.Spotify;
import com.tinder.domain.profile.model.ProfileOption.SuperLikes;
import com.tinder.domain.profile.model.ProfileOption.User;
import com.tinder.domain.profile.model.ProfileOption.WebProfile;
import com.tinder.domain.profile.model.ProfileUpdateRequest;
import com.tinder.domain.profile.model.Tutorials;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002JA\u0010\u0017\u001a\u00020\r\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00180\u001dH\u0002¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/data/profile/ProfileRemoteDataRepository;", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "client", "Lcom/tinder/data/profile/ProfileClient;", "dataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "tutorialToOnboardingTutorialNameAdapter", "Lcom/tinder/domain/onboarding/TutorialToOnboardingTutorialNameAdapter;", "(Lcom/tinder/data/profile/ProfileClient;Lcom/tinder/data/profile/persistence/ProfileDataStore;Lcom/tinder/domain/onboarding/TutorialToOnboardingTutorialNameAdapter;)V", "adaptToPaperUser", "Lcom/tinder/domain/common/model/User;", "user", "fetch", "Lio/reactivex/Completable;", "request", "Lcom/tinder/domain/profile/model/ProfileDataRequest;", "persistResult", "it", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "processOnboardingTutorialsUpdate", "Lio/reactivex/Single;", "result", "processUpdateResult", "saveData", "T", "profileOption", "Lcom/tinder/domain/profile/model/ProfileOption;", "data", "interceptor", "Lkotlin/Function1;", "(Lcom/tinder/domain/profile/model/ProfileOption;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;", "update", "Lcom/tinder/domain/profile/model/ProfileUpdateRequest;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.q */
public final class C10975q implements ProfileRemoteRepository {
    /* renamed from: a */
    private final C8761i f35691a;
    /* renamed from: b */
    private final ProfileDataStore f35692b;
    /* renamed from: c */
    private final TutorialToOnboardingTutorialNameAdapter f35693c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$a */
    static final class C10965a<T, R> implements Function<C8762k, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10975q f35681a;

        C10965a(C10975q c10975q) {
            this.f35681a = c10975q;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43561a((C8762k) obj);
        }

        @Nullable
        /* renamed from: a */
        public final C3956a m43561a(@NotNull C8762k c8762k) {
            C2668g.b(c8762k, "it");
            return this.f35681a.m43573a(c8762k);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$b */
    static final class C10966b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10966b f35682a = new C10966b();

        C10966b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43562a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43562a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/domain/onboarding/Onboarding;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$c */
    static final class C10967c<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ List f35683a;

        C10967c(List list) {
            this.f35683a = list;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43563a((Onboarding) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Onboarding m43563a(@NotNull Onboarding onboarding) {
            C2668g.b(onboarding, "it");
            Collection arrayList = new ArrayList();
            for (Object next : onboarding.getTutorials()) {
                if (this.f35683a.contains(((Tutorial) next).getName())) {
                    arrayList.add(next);
                }
            }
            return onboarding.copy(C19301m.l(C19301m.b(onboarding.getTutorials(), (List) arrayList)));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "Lcom/tinder/domain/onboarding/Onboarding;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$d */
    static final class C10968d<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8762k f35684a;

        C10968d(C8762k c8762k) {
            this.f35684a = c8762k;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43564a((Onboarding) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43564a(@NotNull Onboarding onboarding) {
            C2668g.b(onboarding, "it");
            return C8762k.m37340a(this.f35684a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, onboarding, 33554431, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/profile/model/Tutorial;", "it", "Lcom/tinder/domain/profile/model/Tutorials;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$e */
    static final class C10969e<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ Tutorials f35685a;

        C10969e(Tutorials tutorials) {
            this.f35685a = tutorials;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43565a((Tutorials) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<com.tinder.domain.profile.model.Tutorial> m43565a(@NotNull Tutorials tutorials) {
            C2668g.b(tutorials, "it");
            return C19301m.l(C19301m.b(tutorials.getTutorials(), this.f35685a.getTutorials()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "", "Lcom/tinder/domain/profile/model/Tutorial;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$f */
    static final class C10970f<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8762k f35686a;

        C10970f(C8762k c8762k) {
            this.f35686a = c8762k;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43566a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8762k m43566a(@NotNull List<? extends com.tinder.domain.profile.model.Tutorial> list) {
            List<? extends com.tinder.domain.profile.model.Tutorial> list2 = list;
            C2668g.b(list2, "it");
            return C8762k.m37340a(this.f35686a, null, null, null, null, null, new Tutorials(list2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108831, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$g */
    static final class C10971g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ Object f35687a;

        C10971g(Object obj) {
            this.f35687a = obj;
        }

        public /* synthetic */ void accept(Object obj) {
            m43567a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43567a(Throwable th) {
            th = new StringBuilder();
            th.append("Failed to persist: ");
            th.append(this.f35687a);
            C0001a.e(th.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$h */
    static final class C10972h<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10975q f35688a;

        C10972h(C10975q c10975q) {
            this.f35688a = c10975q;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43568a((C8762k) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<C8762k> m43568a(@NotNull C8762k c8762k) {
            C2668g.b(c8762k, "it");
            return this.f35688a.m43579c(c8762k);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$i */
    static final class C10973i<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10975q f35689a;

        C10973i(C10975q c10975q) {
            this.f35689a = c10975q;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43569a((C8762k) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<C8762k> m43569a(@NotNull C8762k c8762k) {
            C2668g.b(c8762k, "it");
            return this.f35689a.m43577b(c8762k);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/data/profile/ProfileDataSyncResult;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.q$j */
    static final class C10974j<T, R> implements Function<C8762k, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10975q f35690a;

        C10974j(C10975q c10975q) {
            this.f35690a = c10975q;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43570a((C8762k) obj);
        }

        @Nullable
        /* renamed from: a */
        public final C3956a m43570a(@NotNull C8762k c8762k) {
            C2668g.b(c8762k, "it");
            return this.f35690a.m43573a(c8762k);
        }
    }

    @Inject
    public C10975q(@NotNull C8761i c8761i, @NotNull ProfileDataStore profileDataStore, @NotNull TutorialToOnboardingTutorialNameAdapter tutorialToOnboardingTutorialNameAdapter) {
        C2668g.b(c8761i, "client");
        C2668g.b(profileDataStore, "dataStore");
        C2668g.b(tutorialToOnboardingTutorialNameAdapter, "tutorialToOnboardingTutorialNameAdapter");
        this.f35691a = c8761i;
        this.f35692b = profileDataStore;
        this.f35693c = tutorialToOnboardingTutorialNameAdapter;
    }

    @NotNull
    public C3956a fetch(@NotNull ProfileDataRequest profileDataRequest) {
        C2668g.b(profileDataRequest, "request");
        profileDataRequest = this.f35691a.m37338a(profileDataRequest).d(new C10965a(this)).a(C10966b.f35682a).c();
        C2668g.a(profileDataRequest, "client.get(request)\n    …       .onErrorComplete()");
        return profileDataRequest;
    }

    @NotNull
    public C3956a update(@NotNull ProfileUpdateRequest profileUpdateRequest) {
        C2668g.b(profileUpdateRequest, "request");
        profileUpdateRequest = this.f35691a.m37339a(profileUpdateRequest).a(new C10972h(this)).a(new C10973i(this)).d(new C10974j(this));
        C2668g.a(profileUpdateRequest, "client.post(request)\n   …ble { persistResult(it) }");
        return profileUpdateRequest;
    }

    /* renamed from: a */
    private final C3956a m43573a(C8762k c8762k) {
        return C3956a.a(C19301m.b(new C3956a[]{m43576a(User.INSTANCE, c8762k.m37342a(), new ProfileRemoteDataRepository$persistResult$1(this)), C10975q.m43575a(this, PlusControl.INSTANCE, c8762k.m37343b(), null, 4, null), C10975q.m43575a(this, Spotify.INSTANCE, c8762k.m37344c(), null, 4, null), C10975q.m43575a(this, Boost.INSTANCE, c8762k.m37345d(), null, 4, null), C10975q.m43575a(this, Select.INSTANCE, c8762k.m37346e(), null, 4, null), C10975q.m43575a(this, ProfileOption.Tutorials.INSTANCE, c8762k.m37347f(), null, 4, null), C10975q.m43575a(this, Passport.INSTANCE, c8762k.m37348g(), null, 4, null), C10975q.m43575a(this, Notifications.INSTANCE, c8762k.m37349h(), null, 4, null), C10975q.m43575a(this, Purchase.INSTANCE, c8762k.m37350i(), null, 4, null), C10975q.m43575a(this, Products.INSTANCE, c8762k.m37351j(), null, 4, null), C10975q.m43575a(this, Likes.INSTANCE, c8762k.m37352k(), null, 4, null), C10975q.m43575a(this, SuperLikes.INSTANCE, c8762k.m37353l(), null, 4, null), C10975q.m43575a(this, Instagram.INSTANCE, c8762k.m37354m(), null, 4, null), C10975q.m43575a(this, ActivityFeed.INSTANCE, c8762k.m37355n(), null, 4, null), C10975q.m43575a(this, Discovery.INSTANCE, c8762k.m37356o(), null, 4, null), C10975q.m43575a(this, SmartPhoto.INSTANCE, c8762k.m37357p(), null, 4, null), C10975q.m43575a(this, AccountSettings.INSTANCE, c8762k.m37358q(), null, 4, null), C10975q.m43575a(this, AccountInfo.INSTANCE, c8762k.m37359r(), null, 4, null), C10975q.m43575a(this, WebProfile.INSTANCE, c8762k.m37360s(), null, 4, null), C10975q.m43575a(this, Places.INSTANCE, c8762k.m37361t(), null, 4, null), C10975q.m43575a(this, Facebook.INSTANCE, c8762k.m37362u(), null, 4, null), C10975q.m43575a(this, Interests.INSTANCE, c8762k.m37363v(), null, 4, null), C10975q.m43575a(this, ShowGender.INSTANCE, c8762k.m37364w(), null, 4, null), C10975q.m43575a(this, EmailSettings.INSTANCE, c8762k.m37365x(), null, 4, null), C10975q.m43575a(this, ProfileOption.Onboarding.INSTANCE, c8762k.m37366y(), null, 4, null)}));
    }

    /* renamed from: b */
    private final C3960g<C8762k> m43577b(C8762k c8762k) {
        Tutorials f = c8762k.m37347f();
        if (f != null) {
            c8762k = this.f35692b.get(ProfileOption.Tutorials.INSTANCE).map(new C10969e(f)).map(new C10970f(c8762k)).firstOrError();
            C2668g.a(c8762k, "dataStore.get(ProfileOpt…          .firstOrError()");
            return c8762k;
        }
        c8762k = C3960g.a(c8762k);
        C2668g.a(c8762k, "Single.just(result)");
        return c8762k;
    }

    /* renamed from: c */
    private final C3960g<C8762k> m43579c(C8762k c8762k) {
        List tutorials;
        Tutorials f = c8762k.m37347f();
        if (f != null) {
            tutorials = f.getTutorials();
            if (tutorials != null) {
                Iterable<com.tinder.domain.profile.model.Tutorial> iterable = tutorials;
                Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
                for (com.tinder.domain.profile.model.Tutorial toOnboardingTutorialName : iterable) {
                    arrayList.add(this.f35693c.toOnboardingTutorialName(toOnboardingTutorialName));
                }
                Collection arrayList2 = new ArrayList();
                for (Object next : (List) arrayList) {
                    if ((((Name) next) != Name.NONE ? 1 : null) != null) {
                        arrayList2.add(next);
                    }
                }
                tutorials = (List) arrayList2;
                if ((1 ^ tutorials.isEmpty()) == 0) {
                    c8762k = this.f35692b.get(ProfileOption.Onboarding.INSTANCE).map(new C10967c(tutorials)).map(new C10968d(c8762k)).firstOrError();
                    C2668g.a(c8762k, "dataStore.get(ProfileOpt…          .firstOrError()");
                    return c8762k;
                }
                c8762k = C3960g.a(c8762k);
                C2668g.a(c8762k, "Single.just(result)");
                return c8762k;
            }
        }
        tutorials = C19301m.a();
        if ((1 ^ tutorials.isEmpty()) == 0) {
            c8762k = C3960g.a(c8762k);
            C2668g.a(c8762k, "Single.just(result)");
            return c8762k;
        }
        c8762k = this.f35692b.get(ProfileOption.Onboarding.INSTANCE).map(new C10967c(tutorials)).map(new C10968d(c8762k)).firstOrError();
        C2668g.a(c8762k, "dataStore.get(ProfileOpt…          .firstOrError()");
        return c8762k;
    }

    /* renamed from: a */
    static /* synthetic */ C3956a m43575a(C10975q c10975q, ProfileOption profileOption, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = ProfileRemoteDataRepository$saveData$1.f43967a;
        }
        return c10975q.m43576a(profileOption, obj, function1);
    }

    /* renamed from: a */
    private final <T> C3956a m43576a(ProfileOption<? extends T> profileOption, T t, Function1<? super T, ? extends T> function1) {
        if (t != null) {
            profileOption = this.f35692b.save(profileOption, function1.invoke(t)).a((Consumer) new C10971g(t));
            if (profileOption != null) {
                return profileOption;
            }
        }
        profileOption = C3956a.a();
        C2668g.a(profileOption, "Completable.complete()");
        return profileOption;
    }

    /* renamed from: a */
    private final com.tinder.domain.common.model.User m43572a(com.tinder.domain.common.model.User user) {
        String id = user.id();
        C2668g.a(id, "user.id()");
        List badges = user.badges();
        C2668g.a(badges, "user.badges()");
        String bio = user.bio();
        DateTime birthDate = user.birthDate();
        Gender gender = user.gender();
        C2668g.a(gender, "user.gender()");
        String name = user.name();
        C2668g.a(name, "user.name()");
        List photos = user.photos();
        C2668g.a(photos, "user.photos()");
        List jobs = user.jobs();
        C2668g.a(jobs, "user.jobs()");
        List schools = user.schools();
        C2668g.a(schools, "user.schools()");
        return new C10960a(id, badges, bio, birthDate, gender, name, photos, jobs, schools);
    }
}
