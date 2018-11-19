package com.tinder.overflow.p299a;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.overflow.target.RecommendProfileActionItemTarget;
import com.tinder.profile.exception.ShareTextException;
import com.tinder.profile.exception.ShareTextException.ExceptionType;
import com.tinder.profile.model.C14420c;
import com.tinder.profile.model.Profile;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.ab;
import com.tinder.profile.p363b.aj;
import com.tinder.profile.p363b.aj.C14373a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u0017\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/tinder/overflow/presenter/RecommendProfilePresenter;", "", "getShareText", "Lcom/tinder/profile/interactor/GetShareText;", "addProfileShareEvent", "Lcom/tinder/profile/interactor/AddProfileShareEvent;", "profileShareEventFactory", "Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "(Lcom/tinder/profile/interactor/GetShareText;Lcom/tinder/profile/interactor/AddProfileShareEvent;Lcom/tinder/profile/interactor/ProfileShareEventFactory;)V", "target", "Lcom/tinder/overflow/target/RecommendProfileActionItemTarget;", "getTarget$Tinder_release", "()Lcom/tinder/overflow/target/RecommendProfileActionItemTarget;", "setTarget$Tinder_release", "(Lcom/tinder/overflow/target/RecommendProfileActionItemTarget;)V", "isUserHidden", "", "throwable", "", "onProfileRecommended", "", "recommendProfileInfo", "Lcom/tinder/profile/model/RecommendProfileInfo;", "onShareChooserCreated", "profile", "Lcom/tinder/profile/model/Profile;", "shareInformation", "Lcom/tinder/profile/interactor/ProfileShareEventFactory$ShareInformation;", "userId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.a.a */
public final class C10013a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public RecommendProfileActionItemTarget f32873a;
    /* renamed from: b */
    private final ab f32874b;
    /* renamed from: c */
    private final C14386k f32875c;
    /* renamed from: d */
    private final aj f32876d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "shareText", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.a$a */
    static final class C12222a<T> implements Consumer<String> {
        /* renamed from: a */
        final /* synthetic */ C10013a f39581a;

        C12222a(C10013a c10013a) {
            this.f39581a = c10013a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48384a((String) obj);
        }

        /* renamed from: a */
        public final void m48384a(String str) {
            if (str == null) {
                throw new IllegalStateException("Share URL cannot be null".toString());
            }
            this.f39581a.m41030a().startShareRecIntent(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.a$b */
    static final class C12223b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10013a f39582a;
        /* renamed from: b */
        final /* synthetic */ C14420c f39583b;

        C12223b(C10013a c10013a, C14420c c14420c) {
            this.f39582a = c10013a;
            this.f39583b = c14420c;
        }

        public /* synthetic */ void accept(Object obj) {
            m48385a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48385a(Throwable th) {
            C0001a.c(th, "Error sharing user with id %s:", new Object[]{this.f39583b.a()});
            C10013a c10013a = this.f39582a;
            C2668g.a(th, "throwable");
            if (c10013a.m41029a(th) != null) {
                this.f39582a.m41030a().showUserHasSharingDisabledError();
            } else {
                this.f39582a.m41030a().showGenericError();
            }
        }
    }

    @Inject
    public C10013a(@NotNull ab abVar, @NotNull C14386k c14386k, @NotNull aj ajVar) {
        C2668g.b(abVar, "getShareText");
        C2668g.b(c14386k, "addProfileShareEvent");
        C2668g.b(ajVar, "profileShareEventFactory");
        this.f32874b = abVar;
        this.f32875c = c14386k;
        this.f32876d = ajVar;
    }

    @NotNull
    /* renamed from: a */
    public final RecommendProfileActionItemTarget m41030a() {
        RecommendProfileActionItemTarget recommendProfileActionItemTarget = this.f32873a;
        if (recommendProfileActionItemTarget == null) {
            C2668g.b("target");
        }
        return recommendProfileActionItemTarget;
    }

    /* renamed from: a */
    public final void m41032a(@NotNull C14420c c14420c) {
        C2668g.b(c14420c, "recommendProfileInfo");
        Single a = this.f32874b.a(c14420c.a());
        C2668g.a(a, "getShareText\n           …ommendProfileInfo.userId)");
        RxJavaInteropExtKt.toV2Single(a).b(C15756a.b()).a(C15674a.a()).a(new C12222a(this), new C12223b(this, c14420c));
    }

    /* renamed from: a */
    public final void m41031a(@Nullable Profile profile, @NotNull C14373a c14373a) {
        C2668g.b(c14373a, "shareInformation");
        if (profile != null) {
            this.f32875c.a(this.f32876d.a(profile, c14373a));
        }
    }

    /* renamed from: a */
    public final void m41033a(@Nullable String str, @NotNull C14373a c14373a) {
        C2668g.b(c14373a, "shareInformation");
        if (str != null) {
            this.f32875c.a(this.f32876d.a(str, c14373a));
        }
    }

    /* renamed from: a */
    private final boolean m41029a(Throwable th) {
        return ((th instanceof ShareTextException) && ((ShareTextException) th).d() == ExceptionType.USER_IS_HIDDEN) ? true : null;
    }
}
