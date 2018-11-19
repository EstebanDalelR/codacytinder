package com.tinder.overflow.actionitem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.overflow.analytics.RecommendProfileBroadcastReceiver;
import com.tinder.overflow.model.OverflowSource;
import com.tinder.overflow.p299a.C10013a;
import com.tinder.overflow.target.RecommendProfileActionItemTarget;
import com.tinder.profile.model.C14420c;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p363b.aj;
import com.tinder.profile.p363b.aj.C14373a;
import com.tinder.utils.at;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0016\u0010%\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0012J\u0016\u0010%\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u0012J\b\u0010'\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\tH\u0016J(\u0010)\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0003J\b\u0010-\u001a\u00020\tH\u0016J\b\u0010.\u001a\u00020\tH\u0016J(\u0010/\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002J\u0010\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0006H\u0016J\b\u00102\u001a\u00020\tH\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/overflow/actionitem/RecommendProfileActionItem;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lcom/tinder/overflow/target/RecommendProfileActionItemTarget;", "context", "Landroid/content/Context;", "menuItemText", "", "onItemSelected", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getShareLinkUrl", "Lcom/tinder/profile/interactor/GetShareLinkUrl;", "getGetShareLinkUrl", "()Lcom/tinder/profile/interactor/GetShareLinkUrl;", "setGetShareLinkUrl", "(Lcom/tinder/profile/interactor/GetShareLinkUrl;)V", "overflowSource", "Lcom/tinder/overflow/model/OverflowSource;", "presenter", "Lcom/tinder/overflow/presenter/RecommendProfilePresenter;", "getPresenter", "()Lcom/tinder/overflow/presenter/RecommendProfilePresenter;", "setPresenter", "(Lcom/tinder/overflow/presenter/RecommendProfilePresenter;)V", "profile", "Lcom/tinder/profile/model/Profile;", "profileShareEventFactory", "Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "getProfileShareEventFactory", "()Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "setProfileShareEventFactory", "(Lcom/tinder/profile/interactor/ProfileShareEventFactory;)V", "recommendProfileInfo", "Lcom/tinder/profile/model/RecommendProfileInfo;", "userId", "username", "bind", "source", "drop", "onSelectedStrategy", "sendIntentAndDeeplinkShareIdEventInReceiver", "sharingIntent", "Landroid/content/Intent;", "referralUrl", "showGenericError", "showUserHasSharingDisabledError", "startActivityForIntentAndSendDeeplinkShareIdEvent", "startShareRecIntent", "shareText", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.g */
public final class C12231g extends C10020a implements RecommendProfileActionItemTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10013a f39591a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C16093z f39592b;
    @Inject
    @NotNull
    /* renamed from: c */
    public aj f39593c;
    /* renamed from: d */
    private Profile f39594d;
    /* renamed from: e */
    private C14420c f39595e;
    /* renamed from: f */
    private String f39596f;
    /* renamed from: g */
    private OverflowSource f39597g;
    /* renamed from: h */
    private String f39598h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "referralUrl", "", "kotlin.jvm.PlatformType", "accept", "com/tinder/overflow/actionitem/RecommendProfileActionItem$startShareRecIntent$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.actionitem.g$a */
    static final class C12230a<T> implements Consumer<String> {
        /* renamed from: a */
        final /* synthetic */ C12231g f39589a;
        /* renamed from: b */
        final /* synthetic */ Intent f39590b;

        C12230a(C12231g c12231g, Intent intent) {
            this.f39589a = c12231g;
            this.f39590b = intent;
        }

        public /* synthetic */ void accept(Object obj) {
            m48394a((String) obj);
        }

        /* renamed from: a */
        public final void m48394a(String str) {
            C12231g c12231g;
            Context e;
            Intent intent;
            String a;
            if (VERSION.SDK_INT >= 22) {
                c12231g = this.f39589a;
                e = this.f39589a.m41056e();
                intent = this.f39590b;
                if (str == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                a = C12231g.m48395a(this.f39589a);
                if (a == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                c12231g.m48396a(e, intent, str, a);
                return;
            }
            c12231g = this.f39589a;
            e = this.f39589a.m41056e();
            intent = this.f39590b;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            a = C12231g.m48395a(this.f39589a);
            if (a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            c12231g.m48398b(e, intent, str, a);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ String m48395a(C12231g c12231g) {
        c12231g = c12231g.f39598h;
        if (c12231g == null) {
            C2668g.b("username");
        }
        return c12231g;
    }

    public C12231g(@NotNull Context context, @NotNull String str, @NotNull Function0<C15813i> function0) {
        C2668g.b(context, "context");
        C2668g.b(str, "menuItemText");
        C2668g.b(function0, "onItemSelected");
        super(context, str, function0);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
    }

    /* renamed from: c */
    public void mo10691c() {
        C10013a c10013a = this.f39591a;
        if (c10013a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10013a);
    }

    /* renamed from: d */
    public void mo10692d() {
        Deadshot.drop(this);
    }

    /* renamed from: b */
    public void mo10690b() {
        OverflowSource overflowSource = this.f39597g;
        if (overflowSource == null) {
            throw new IllegalStateException("OverflowSource must not be null for action item");
        }
        C10013a c10013a;
        switch (C10022h.f32892a[overflowSource.ordinal()]) {
            case 1:
                C14420c c14420c = this.f39595e;
                if (c14420c != null) {
                    c10013a = this.f39591a;
                    if (c10013a == null) {
                        C2668g.b("presenter");
                    }
                    c10013a.m41032a(c14420c);
                    this.f39596f = c14420c.a();
                    this.f39598h = c14420c.b();
                    return;
                }
                throw new IllegalStateException("ProfileInfo must be bound to action item");
            case 2:
            case 3:
                Profile profile = this.f39594d;
                if (profile != null) {
                    c10013a = this.f39591a;
                    if (c10013a == null) {
                        C2668g.b("presenter");
                    }
                    String a = profile.a();
                    C2668g.a(a, "it.id()");
                    String b = profile.b();
                    C2668g.a(b, "it.name()");
                    c10013a.m41032a(new C14420c(a, b));
                    this.f39596f = profile.a();
                    String b2 = profile.b();
                    C2668g.a(b2, "it.name()");
                    this.f39598h = b2;
                    return;
                }
                throw new IllegalStateException("Profile must be bound to action item");
            default:
                return;
        }
    }

    public void startShareRecIntent(@NotNull String str) {
        C2668g.b(str, "shareText");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        str = this.f39596f;
        if (str != null) {
            C16093z c16093z = this.f39592b;
            if (c16093z == null) {
                C2668g.b("getShareLinkUrl");
            }
            str = c16093z.a(str).subscribeOn(C15756a.b()).observeOn(C15674a.a());
            Consumer c12230a = new C12230a(this, intent);
            Function1 function1 = RecommendProfileActionItem$startShareRecIntent$1$2.f45326a;
            if (function1 != null) {
                function1 = new C12232i(function1);
            }
            str.subscribe(c12230a, (Consumer) function1);
        }
    }

    public void showUserHasSharingDisabledError() {
        if (m41056e() instanceof Activity) {
            at.f47621a.b((Activity) m41056e(), R.string.cannot_share_rec);
        }
    }

    public void showGenericError() {
        if (m41056e() instanceof Activity) {
            at.f47621a.a((Activity) m41056e(), R.string.reported_warning_accept_agreement_error);
        }
    }

    /* renamed from: a */
    public final void m48400a(@NotNull Profile profile, @NotNull OverflowSource overflowSource) {
        C2668g.b(profile, "profile");
        C2668g.b(overflowSource, "source");
        this.f39594d = profile;
        this.f39597g = overflowSource;
    }

    /* renamed from: a */
    public final void m48401a(@NotNull C14420c c14420c, @NotNull OverflowSource overflowSource) {
        C2668g.b(c14420c, "recommendProfileInfo");
        C2668g.b(overflowSource, "source");
        this.f39595e = c14420c;
        this.f39597g = overflowSource;
    }

    @RequiresApi(22)
    /* renamed from: a */
    private final void m48396a(Context context, Intent intent, String str, String str2) {
        ProfileShareSource profileShareSource;
        Profile profile;
        RecommendProfileBroadcastReceiver recommendProfileBroadcastReceiver = new RecommendProfileBroadcastReceiver();
        Source source = null;
        if (this.f39597g == OverflowSource.FEED) {
            profileShareSource = ProfileShareSource.FEED;
            profile = (Profile) null;
        } else {
            aj ajVar = this.f39593c;
            if (ajVar == null) {
                C2668g.b("profileShareEventFactory");
            }
            Profile profile2 = this.f39594d;
            if (profile2 != null) {
                source = profile2.j();
            }
            if (source == null) {
                throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
            }
            profileShareSource = ajVar.a(source);
            profile = this.f39594d;
        }
        String str3 = this.f39596f;
        if (str3 == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        } else if (profileShareSource == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        } else {
            recommendProfileBroadcastReceiver.m41064a(context, intent, str2, str, str3, profileShareSource, ProfileShareAction.MENU, profile);
        }
    }

    /* renamed from: b */
    private final void m48398b(Context context, Intent intent, String str, String str2) {
        C15828l c15828l = C15828l.f49033a;
        String string = context.getString(R.string.share_sheet_title);
        C2668g.a(string, "context.getString(R.string.share_sheet_title)");
        Object[] objArr = new Object[]{str2};
        str2 = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str2, "java.lang.String.format(format, *args)");
        context.startActivity(Intent.createChooser(intent, str2));
        if (this.f39597g == OverflowSource.FEED) {
            context = ProfileShareSource.FEED;
        } else {
            context = this.f39593c;
            if (context == null) {
                C2668g.b("profileShareEventFactory");
            }
            intent = this.f39594d;
            intent = intent != null ? intent.j() : null;
            if (intent == null) {
                throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
            }
            context = context.a(intent);
        }
        String str3 = "N/A";
        if (str == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        } else if (context == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        } else {
            C14373a c14373a = new C14373a(str3, true, str, context, ProfileShareAction.MENU);
            if (context == ProfileShareSource.FEED) {
                context = this.f39591a;
                if (context == null) {
                    C2668g.b("presenter");
                }
                context.m41033a(this.f39596f, c14373a);
            }
            context = this.f39591a;
            if (context == null) {
                C2668g.b("presenter");
            }
            context.m41031a(this.f39594d, c14373a);
        }
    }
}
