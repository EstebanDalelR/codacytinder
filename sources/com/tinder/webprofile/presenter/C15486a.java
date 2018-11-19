package com.tinder.webprofile.presenter;

import com.tinder.domain.profile.model.ProfileOption.WebProfile;
import com.tinder.domain.profile.model.exception.NoUsernameAvailableException;
import com.tinder.domain.profile.model.exception.UsernameTakenException;
import com.tinder.domain.profile.model.settings.WebProfileSettings;
import com.tinder.domain.profile.usecase.DeleteWebProfileUsername;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.UpdateWebProfileUsername;
import com.tinder.webprofile.p486a.C17267a;
import com.tinder.webprofile.p486a.C17269b;
import com.tinder.webprofile.p486a.C17271c;
import com.tinder.webprofile.target.WebProfileUsernameTarget;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/webprofile/presenter/WebProfileUsernamePresenter;", "", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "updateWebProfileUsername", "Lcom/tinder/domain/profile/usecase/UpdateWebProfileUsername;", "deleteWebProfileUsername", "Lcom/tinder/domain/profile/usecase/DeleteWebProfileUsername;", "addDeepLinkChangeIdEvent", "Lcom/tinder/webprofile/analytics/AddDeepLinkChangeIdEvent;", "addDeepLinkCreateIdEvent", "Lcom/tinder/webprofile/analytics/AddDeepLinkCreateIdEvent;", "addDeepLinkDeleteIdEvent", "Lcom/tinder/webprofile/analytics/AddDeepLinkDeleteIdEvent;", "(Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/domain/profile/usecase/UpdateWebProfileUsername;Lcom/tinder/domain/profile/usecase/DeleteWebProfileUsername;Lcom/tinder/webprofile/analytics/AddDeepLinkChangeIdEvent;Lcom/tinder/webprofile/analytics/AddDeepLinkCreateIdEvent;Lcom/tinder/webprofile/analytics/AddDeepLinkDeleteIdEvent;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentUsername", "", "target", "Lcom/tinder/webprofile/target/WebProfileUsernameTarget;", "dropTarget", "", "evaluateUsername", "username", "onConfirmClick", "onDeleteUsername", "onTextChange", "sendUpdateUsernameEvent", "Lio/reactivex/Completable;", "takeTarget", "webprofile_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.webprofile.presenter.a */
public final class C15486a {
    /* renamed from: a */
    private final C17356a f47918a = new C17356a();
    /* renamed from: b */
    private WebProfileUsernameTarget f47919b;
    /* renamed from: c */
    private String f47920c;
    /* renamed from: d */
    private final LoadProfileOptionData f47921d;
    /* renamed from: e */
    private final UpdateWebProfileUsername f47922e;
    /* renamed from: f */
    private final DeleteWebProfileUsername f47923f;
    /* renamed from: g */
    private final C17267a f47924g;
    /* renamed from: h */
    private final C17269b f47925h;
    /* renamed from: i */
    private final C17271c f47926i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.presenter.a$a */
    static final class C17273a implements Action {
        /* renamed from: a */
        final /* synthetic */ C15486a f52942a;

        C17273a(C15486a c15486a) {
            this.f52942a = c15486a;
        }

        public final void run() {
            WebProfileUsernameTarget b = this.f52942a.f47919b;
            if (b != null) {
                b.displaySuccessfulSaveState();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.presenter.a$b */
    static final class C17274b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C15486a f52943a;

        C17274b(C15486a c15486a) {
            this.f52943a = c15486a;
        }

        public /* synthetic */ void accept(Object obj) {
            m63219a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63219a(Throwable th) {
            if (th instanceof UsernameTakenException) {
                th = this.f52943a.f47919b;
                if (th != null) {
                    th.displayUnsuccessfulSaveState();
                    return;
                }
                return;
            }
            C0001a.b(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.presenter.a$c */
    static final class C17275c implements Action {
        /* renamed from: a */
        final /* synthetic */ C15486a f52944a;

        C17275c(C15486a c15486a) {
            this.f52944a = c15486a;
        }

        public final void run() {
            WebProfileUsernameTarget b = this.f52944a.f47919b;
            if (b != null) {
                b.displaySuccessfulDeleteMessage();
            }
            b = this.f52944a.f47919b;
            if (b != null) {
                b.bindUsername("");
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.presenter.a$d */
    static final class C17276d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C15486a f52945a;

        C17276d(C15486a c15486a) {
            this.f52945a = c15486a;
        }

        public /* synthetic */ void accept(Object obj) {
            m63220a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63220a(Throwable th) {
            if (th instanceof NoUsernameAvailableException) {
                th = this.f52945a.f47919b;
                if (th != null) {
                    th.displayUnsuccessfulDeleteState();
                    return;
                }
                return;
            }
            C0001a.b(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "webProfileSettings", "Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.presenter.a$e */
    static final class C17277e<T> implements Consumer<WebProfileSettings> {
        /* renamed from: a */
        final /* synthetic */ C15486a f52946a;
        /* renamed from: b */
        final /* synthetic */ WebProfileUsernameTarget f52947b;

        C17277e(C15486a c15486a, WebProfileUsernameTarget webProfileUsernameTarget) {
            this.f52946a = c15486a;
            this.f52947b = webProfileUsernameTarget;
        }

        public /* synthetic */ void accept(Object obj) {
            m63221a((WebProfileSettings) obj);
        }

        /* renamed from: a */
        public final void m63221a(WebProfileSettings webProfileSettings) {
            this.f52946a.f47920c = webProfileSettings.getUsername();
            webProfileSettings = this.f52946a.f47920c;
            if (webProfileSettings != null) {
                this.f52947b.showDeleteButton();
                this.f52947b.bindUsername(webProfileSettings);
            } else {
                this.f52947b.hideDeleteButton();
            }
            this.f52947b.disableConfirmButton();
        }
    }

    @Inject
    public C15486a(@NotNull LoadProfileOptionData loadProfileOptionData, @NotNull UpdateWebProfileUsername updateWebProfileUsername, @NotNull DeleteWebProfileUsername deleteWebProfileUsername, @NotNull C17267a c17267a, @NotNull C17269b c17269b, @NotNull C17271c c17271c) {
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(updateWebProfileUsername, "updateWebProfileUsername");
        C2668g.b(deleteWebProfileUsername, "deleteWebProfileUsername");
        C2668g.b(c17267a, "addDeepLinkChangeIdEvent");
        C2668g.b(c17269b, "addDeepLinkCreateIdEvent");
        C2668g.b(c17271c, "addDeepLinkDeleteIdEvent");
        this.f47921d = loadProfileOptionData;
        this.f47922e = updateWebProfileUsername;
        this.f47923f = deleteWebProfileUsername;
        this.f47924g = c17267a;
        this.f47925h = c17269b;
        this.f47926i = c17271c;
    }

    /* renamed from: a */
    public final void m57965a(@NotNull WebProfileUsernameTarget webProfileUsernameTarget) {
        C2668g.b(webProfileUsernameTarget, "target");
        this.f47919b = webProfileUsernameTarget;
        C3959e observeOn = this.f47921d.execute(WebProfile.INSTANCE).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a());
        Consumer c17277e = new C17277e(this, webProfileUsernameTarget);
        webProfileUsernameTarget = (Function1) WebProfileUsernamePresenter$takeTarget$2.f59427a;
        if (webProfileUsernameTarget != null) {
            webProfileUsernameTarget = new C17278b(webProfileUsernameTarget);
        }
        this.f47918a.add(observeOn.subscribe(c17277e, (Consumer) webProfileUsernameTarget));
    }

    /* renamed from: a */
    public final void m57964a() {
        this.f47919b = (WebProfileUsernameTarget) null;
        this.f47918a.m63446a();
    }

    /* renamed from: a */
    public final void m57966a(@NotNull String str) {
        C2668g.b(str, "username");
        m57963c(str);
        this.f47918a.add(this.f47922e.execute(str).b(m57962c()).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C17273a(this), new C17274b(this)));
    }

    /* renamed from: b */
    public final void m57967b() {
        this.f47918a.add(this.f47923f.execute().b(this.f47926i.execute()).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C17275c(this), new C17276d(this)));
    }

    /* renamed from: b */
    public final void m57968b(@NotNull String str) {
        C2668g.b(str, "username");
        m57963c(str);
    }

    /* renamed from: c */
    private final void m57963c(String str) {
        Object obj;
        C15828l c15828l;
        Locale locale;
        Object[] objArr;
        WebProfileUsernameTarget webProfileUsernameTarget;
        if ((C2668g.a(str, this.f47920c) ^ 1) != 0) {
            if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                obj = 1;
                c15828l = C15828l.f49033a;
                locale = Locale.getDefault();
                C2668g.a(locale, "Locale.getDefault()");
                objArr = new Object[]{Integer.valueOf(20 - str.length())};
                str = String.format(locale, "%d", Arrays.copyOf(objArr, objArr.length));
                C2668g.a(str, "java.lang.String.format(locale, format, *args)");
                webProfileUsernameTarget = this.f47919b;
                if (webProfileUsernameTarget != null) {
                    if (obj == null) {
                        webProfileUsernameTarget.enableConfirmButton();
                    } else {
                        webProfileUsernameTarget.disableConfirmButton();
                    }
                    webProfileUsernameTarget.resetStatusTextAlpha();
                    webProfileUsernameTarget.updateUsernameTextCount(str);
                }
            }
        }
        obj = null;
        c15828l = C15828l.f49033a;
        locale = Locale.getDefault();
        C2668g.a(locale, "Locale.getDefault()");
        objArr = new Object[]{Integer.valueOf(20 - str.length())};
        str = String.format(locale, "%d", Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str, "java.lang.String.format(locale, format, *args)");
        webProfileUsernameTarget = this.f47919b;
        if (webProfileUsernameTarget != null) {
            if (obj == null) {
                webProfileUsernameTarget.disableConfirmButton();
            } else {
                webProfileUsernameTarget.enableConfirmButton();
            }
            webProfileUsernameTarget.resetStatusTextAlpha();
            webProfileUsernameTarget.updateUsernameTextCount(str);
        }
    }

    /* renamed from: c */
    private final C3956a m57962c() {
        Object obj;
        CharSequence charSequence = this.f47920c;
        if (charSequence != null) {
            if (charSequence.length() != 0) {
                obj = null;
                if (obj == null) {
                    return this.f47925h.execute();
                }
                return this.f47924g.execute();
            }
        }
        obj = 1;
        if (obj == null) {
            return this.f47924g.execute();
        }
        return this.f47925h.execute();
    }
}
