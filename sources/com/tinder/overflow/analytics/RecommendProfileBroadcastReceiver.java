package com.tinder.overflow.analytics;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresApi;
import com.tinder.R;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.managers.ManagerApp;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Adornment;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.aj;
import com.tinder.profile.p363b.aj.C14373a;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J(\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0014H\u0003JJ\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J^\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006."}, d2 = {"Lcom/tinder/overflow/analytics/RecommendProfileBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "addProfileShareEvent", "Lcom/tinder/profile/interactor/AddProfileShareEvent;", "getAddProfileShareEvent", "()Lcom/tinder/profile/interactor/AddProfileShareEvent;", "setAddProfileShareEvent", "(Lcom/tinder/profile/interactor/AddProfileShareEvent;)V", "chosenComponentName", "Landroid/content/ComponentName;", "profileShareEventFactory", "Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "getProfileShareEventFactory", "()Lcom/tinder/profile/interactor/ProfileShareEventFactory;", "setProfileShareEventFactory", "(Lcom/tinder/profile/interactor/ProfileShareEventFactory;)V", "mapStringToProfileShareAction", "Lcom/tinder/profile/model/ProfileShareAction;", "shareAction", "", "mapStringToProfileShareSource", "Lcom/tinder/profile/model/ProfileShareSource;", "shareSource", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "sendIntent", "sharingIntent", "receivingIntent", "intentChooserTitle", "username", "referralUrl", "otherId", "profile", "Lcom/tinder/profile/model/Profile;", "sendIntentFromCardstack", "isSuperlike", "", "isRecTraveling", "commonConnections", "", "Lcom/tinder/domain/common/model/CommonConnection;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecommendProfileBroadcastReceiver extends BroadcastReceiver {
    @Inject
    @NotNull
    /* renamed from: a */
    public aj f32895a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C14386k f32896b;
    /* renamed from: c */
    private ComponentName f32897c;

    @RequiresApi(22)
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        C2668g.b(context, "context");
        C2668g.b(intent, "intent");
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        context = intent.getExtras();
        context = context != null ? context.get("android.intent.extra.CHOSEN_COMPONENT") : null;
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentName");
        }
        Context context2;
        boolean z;
        String stringExtra;
        ProfileShareSource a;
        C14373a c14373a;
        aj ajVar;
        this.f32897c = (ComponentName) context;
        context = this.f32897c;
        if (context != null) {
            context = context.getClassName();
            if (context != null) {
                context2 = context;
                z = this.f32897c == null;
                stringExtra = intent.getStringExtra("EXTRA_REFERRAL_URL");
                C2668g.a(stringExtra, "intent.getStringExtra(EXTRA_REFERRAL_URL)");
                context = intent.getStringExtra("EXTRA_SHARE_SOURCE");
                C2668g.a(context, "intent.getStringExtra(EXTRA_SHARE_SOURCE)");
                a = m41061a(context);
                context = intent.getStringExtra("EXTRA_SHARE_ACTION");
                C2668g.a(context, "intent.getStringExtra(EXTRA_SHARE_ACTION)");
                c14373a = new C14373a(context2, z, stringExtra, a, m41063b(context));
                if (C2668g.a(intent.getStringExtra("EXTRA_SHARE_SOURCE"), "feed") == null) {
                    context = this.f32896b;
                    if (context == null) {
                        C2668g.b("addProfileShareEvent");
                    }
                    ajVar = this.f32895a;
                    if (ajVar == null) {
                        C2668g.b("profileShareEventFactory");
                    }
                    intent = intent.getStringExtra("EXTRA_OTHER_ID");
                    C2668g.a(intent, "intent.getStringExtra(EXTRA_OTHER_ID)");
                    context.a(ajVar.a(intent, c14373a));
                }
                context = this.f32896b;
                if (context == null) {
                    C2668g.b("addProfileShareEvent");
                }
                ajVar = this.f32895a;
                if (ajVar == null) {
                    C2668g.b("profileShareEventFactory");
                }
                String stringExtra2 = intent.getStringExtra("EXTRA_OTHER_ID");
                C2668g.a(stringExtra2, "intent.getStringExtra(EXTRA_OTHER_ID)");
                context.a(ajVar.a(stringExtra2, intent.getBooleanExtra("EXTRA_DID_SUPERLIKE", false), intent.getBooleanExtra("EXTRA_REC_SUPERLIKE", false), intent.getIntExtra("EXTRA_FIRST_DEGREES", 0), intent.getIntExtra("EXTRA_SECOND_DEGREES", 0), c14373a));
                return;
            }
        }
        context = "N/A";
        context2 = context;
        if (this.f32897c == null) {
        }
        stringExtra = intent.getStringExtra("EXTRA_REFERRAL_URL");
        C2668g.a(stringExtra, "intent.getStringExtra(EXTRA_REFERRAL_URL)");
        context = intent.getStringExtra("EXTRA_SHARE_SOURCE");
        C2668g.a(context, "intent.getStringExtra(EXTRA_SHARE_SOURCE)");
        a = m41061a(context);
        context = intent.getStringExtra("EXTRA_SHARE_ACTION");
        C2668g.a(context, "intent.getStringExtra(EXTRA_SHARE_ACTION)");
        c14373a = new C14373a(context2, z, stringExtra, a, m41063b(context));
        if (C2668g.a(intent.getStringExtra("EXTRA_SHARE_SOURCE"), "feed") == null) {
            context = this.f32896b;
            if (context == null) {
                C2668g.b("addProfileShareEvent");
            }
            ajVar = this.f32895a;
            if (ajVar == null) {
                C2668g.b("profileShareEventFactory");
            }
            String stringExtra22 = intent.getStringExtra("EXTRA_OTHER_ID");
            C2668g.a(stringExtra22, "intent.getStringExtra(EXTRA_OTHER_ID)");
            context.a(ajVar.a(stringExtra22, intent.getBooleanExtra("EXTRA_DID_SUPERLIKE", false), intent.getBooleanExtra("EXTRA_REC_SUPERLIKE", false), intent.getIntExtra("EXTRA_FIRST_DEGREES", 0), intent.getIntExtra("EXTRA_SECOND_DEGREES", 0), c14373a));
            return;
        }
        context = this.f32896b;
        if (context == null) {
            C2668g.b("addProfileShareEvent");
        }
        ajVar = this.f32895a;
        if (ajVar == null) {
            C2668g.b("profileShareEventFactory");
        }
        intent = intent.getStringExtra("EXTRA_OTHER_ID");
        C2668g.a(intent, "intent.getStringExtra(EXTRA_OTHER_ID)");
        context.a(ajVar.a(intent, c14373a));
    }

    @RequiresApi(22)
    /* renamed from: a */
    public final void m41064a(@NotNull Context context, @NotNull Intent intent, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ProfileShareSource profileShareSource, @NotNull ProfileShareAction profileShareAction, @Nullable Profile profile) {
        C2668g.b(context, "context");
        C2668g.b(intent, "sharingIntent");
        C2668g.b(str, "username");
        C2668g.b(str2, "referralUrl");
        C2668g.b(str3, "otherId");
        C2668g.b(profileShareSource, "shareSource");
        C2668g.b(profileShareAction, "shareAction");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) applicationContext).h().inject(this);
        C15828l c15828l = C15828l.f49033a;
        String string = context.getString(R.string.share_sheet_title);
        C2668g.a(string, "context.getString(R.string.share_sheet_title)");
        Object[] objArr = new Object[]{str};
        str = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str, "java.lang.String.format(format, *args)");
        Intent intent2 = new Intent(context, getClass());
        intent2.putExtra("EXTRA_REFERRAL_URL", str2).putExtra("EXTRA_OTHER_ID", str3).putExtra("EXTRA_SHARE_SOURCE", profileShareSource.getValue()).putExtra("EXTRA_SHARE_ACTION", profileShareAction.getValue());
        if (profileShareSource != ProfileShareSource.FEED) {
            List v;
            str3 = null;
            str2 = intent2.putExtra("EXTRA_DID_SUPERLIKE", profile != null ? Boolean.valueOf(profile.B()) : null);
            profileShareSource = "EXTRA_REC_SUPERLIKE";
            if (profile != null) {
                profileShareAction = profile.k();
                if (profileShareAction != null) {
                    profileShareAction = Boolean.valueOf(profileShareAction.contains(Adornment.PASSPORT));
                    str2 = str2.putExtra(profileShareSource, profileShareAction);
                    profileShareSource = "EXTRA_FIRST_DEGREES";
                    profileShareAction = this.f32895a;
                    if (profileShareAction == null) {
                        C2668g.b("profileShareEventFactory");
                    }
                    v = profile == null ? profile.v() : null;
                    if (v != null) {
                        throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
                    }
                    str2 = str2.putExtra(profileShareSource, profileShareAction.a(v));
                    profileShareSource = "EXTRA_SECOND_DEGREES";
                    profileShareAction = this.f32895a;
                    if (profileShareAction == null) {
                        C2668g.b("profileShareEventFactory");
                    }
                    if (profile != null) {
                        str3 = profile.v();
                    }
                    if (str3 != null) {
                        throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
                    }
                    str2.putExtra(profileShareSource, profileShareAction.b(str3));
                }
            }
            profileShareAction = null;
            str2 = str2.putExtra(profileShareSource, profileShareAction);
            profileShareSource = "EXTRA_FIRST_DEGREES";
            profileShareAction = this.f32895a;
            if (profileShareAction == null) {
                C2668g.b("profileShareEventFactory");
            }
            if (profile == null) {
            }
            if (v != null) {
                str2 = str2.putExtra(profileShareSource, profileShareAction.a(v));
                profileShareSource = "EXTRA_SECOND_DEGREES";
                profileShareAction = this.f32895a;
                if (profileShareAction == null) {
                    C2668g.b("profileShareEventFactory");
                }
                if (profile != null) {
                    str3 = profile.v();
                }
                if (str3 != null) {
                    str2.putExtra(profileShareSource, profileShareAction.b(str3));
                } else {
                    throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
                }
            }
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        m41062a(context, intent, intent2, str);
    }

    @RequiresApi(22)
    /* renamed from: a */
    public final void m41065a(@NotNull Context context, @NotNull Intent intent, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ProfileShareSource profileShareSource, @NotNull ProfileShareAction profileShareAction, boolean z, boolean z2, @NotNull List<? extends CommonConnection> list) {
        C2668g.b(context, "context");
        C2668g.b(intent, "sharingIntent");
        C2668g.b(str, "username");
        C2668g.b(str2, "referralUrl");
        C2668g.b(str3, "otherId");
        C2668g.b(profileShareSource, "shareSource");
        C2668g.b(profileShareAction, "shareAction");
        C2668g.b(list, "commonConnections");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) applicationContext).h().inject(this);
        C15828l c15828l = C15828l.f49033a;
        String string = context.getString(R.string.share_sheet_title);
        C2668g.a(string, "context.getString(R.string.share_sheet_title)");
        Object[] objArr = new Object[]{str};
        str = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str, "java.lang.String.format(format, *args)");
        Intent intent2 = new Intent(context, getClass());
        intent2.putExtra("EXTRA_REFERRAL_URL", str2);
        intent2.putExtra("EXTRA_OTHER_ID", str3);
        intent2.putExtra("EXTRA_SHARE_SOURCE", profileShareSource.getValue());
        intent2.putExtra("EXTRA_SHARE_ACTION", profileShareAction.getValue());
        intent2.putExtra("EXTRA_DID_SUPERLIKE", z);
        intent2.putExtra("EXTRA_REC_SUPERLIKE", z2);
        str2 = "EXTRA_FIRST_DEGREES";
        str3 = this.f32895a;
        if (str3 == null) {
            C2668g.b("profileShareEventFactory");
        }
        intent2.putExtra(str2, str3.a(list));
        str2 = "EXTRA_SECOND_DEGREES";
        str3 = this.f32895a;
        if (str3 == null) {
            C2668g.b("profileShareEventFactory");
        }
        intent2.putExtra(str2, str3.b(list));
        m41062a(context, intent, intent2, str);
    }

    @RequiresApi(22)
    /* renamed from: a */
    private final void m41062a(Context context, Intent intent, Intent intent2, String str) {
        intent2 = PendingIntent.getBroadcast(context, 0, intent2, 134217728);
        CharSequence charSequence = str;
        C2668g.a(intent2, "receivingIntentCallback");
        context.startActivity(Intent.createChooser(intent, charSequence, intent2.getIntentSender()));
    }

    /* renamed from: a */
    private final ProfileShareSource m41061a(String str) {
        switch (str.hashCode()) {
            case -1776527087:
                if (str.equals("cardstackProfile") != null) {
                    return ProfileShareSource.CARDSTACK_PROFILE;
                }
                break;
            case -985774004:
                if (str.equals("places") != null) {
                    return ProfileShareSource.PLACES;
                }
                break;
            case -980197347:
                if (str.equals("topPicks") != null) {
                    return ProfileShareSource.TOPPICKS;
                }
                break;
            case -226578056:
                if (str.equals("cardstack") != null) {
                    return ProfileShareSource.CARDSTACK;
                }
                break;
            case -44045623:
                if (str.equals("fastMatch") != null) {
                    return ProfileShareSource.FASTMATCH;
                }
                break;
            case 3138974:
                if (str.equals("feed") != null) {
                    return ProfileShareSource.FEED;
                }
                break;
            case 103668165:
                if (str.equals("match") != null) {
                    return ProfileShareSource.MATCH;
                }
                break;
            default:
                break;
        }
        throw ((Throwable) new IllegalStateException("String denoting share source does not map to a valid share source "));
    }

    /* renamed from: b */
    private final ProfileShareAction m41063b(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode != 3347807) {
                if (hashCode == 941345842) {
                    if (str.equals("screenshotBanner") != null) {
                        return ProfileShareAction.SCREENSHOT_BANNER;
                    }
                }
            } else if (str.equals("menu") != null) {
                return ProfileShareAction.MENU;
            }
        } else if (str.equals(AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON) != null) {
            return ProfileShareAction.BUTTON;
        }
        throw ((Throwable) new IllegalStateException("String denoting share action does not map to a valid share action"));
    }
}
