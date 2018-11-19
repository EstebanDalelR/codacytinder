package com.tinder.managers;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tinder.auth.model.AuthType;
import com.tinder.data.boost.BoostCursorModel;
import com.tinder.data.user.CurrentUserIdProvider;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.module.Default;
import com.tinder.utils.ad;
import java.util.Locale;
import java8.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.joda.time.LocalDate;
import org.joda.time.format.C19322g;
import p000a.p001a.C0001a;

@Singleton
public class bk implements BoostCursorModel {
    /* renamed from: b */
    private static SharedPreferences f12404b;
    /* renamed from: c */
    private static Editor f12405c;
    /* renamed from: d */
    private final CurrentUserProvider f12406d;
    /* renamed from: e */
    private final CurrentUserIdProvider f12407e;

    @Inject
    public bk(@Default SharedPreferences sharedPreferences, CurrentUserProvider currentUserProvider, CurrentUserIdProvider currentUserIdProvider) {
        f12404b = sharedPreferences;
        this.f12406d = currentUserProvider;
        this.f12407e = currentUserIdProvider;
        f12405c = f12404b.edit();
    }

    /* renamed from: a */
    public static void m14906a() {
        ad.m10190a("Clearing preferences.");
        f12405c.clear();
        f12405c.commit();
    }

    /* renamed from: a */
    public void m14960a(boolean z) {
        f12405c.putBoolean("FETCH_CONNECTIONS", z);
        f12405c.commit();
    }

    /* renamed from: b */
    public static void m14907b(boolean z) {
        f12405c.putBoolean("ADD_FEEDBACK_TO_MENU", z).commit();
    }

    /* renamed from: c */
    public static void m14909c(boolean z) {
        f12405c.putBoolean("ADD_RATE_TO_MENU", z).commit();
    }

    /* renamed from: d */
    public static void m14911d(boolean z) {
        f12405c.putBoolean("HAS_RATED", z).commit();
    }

    /* renamed from: b */
    public static boolean m14908b() {
        return f12404b.getBoolean("HAS_RATED", false);
    }

    /* renamed from: e */
    public static void m14913e(boolean z) {
        f12405c.putBoolean("HAS_SENT_FEEDBACK", z).commit();
    }

    /* renamed from: c */
    public static boolean m14910c() {
        return f12404b.getBoolean("HAS_SENT_FEEDBACK", false);
    }

    /* renamed from: d */
    public static boolean m14912d() {
        return f12404b.getBoolean("VERSION_IS_RATEABLE", true);
    }

    /* renamed from: e */
    public boolean m14968e() {
        return f12404b.getBoolean("KEY_SUPERLIKE_PUSH_ENABLED", true);
    }

    /* renamed from: f */
    public boolean m14971f() {
        return f12404b.getBoolean("KEY_PHOTO_OPTIMIZER_HAS_RESULTS", false);
    }

    /* renamed from: f */
    public void m14970f(boolean z) {
        f12405c.putBoolean("KEY_PHOTO_OPTIMIZER_HAS_RESULTS", z).apply();
    }

    /* renamed from: g */
    public int m14972g() {
        return f12404b.getInt("KEY_VERSION_CODE", 0);
    }

    /* renamed from: a */
    public void m14955a(int i) {
        f12405c.putInt("KEY_VERSION_CODE", i).apply();
    }

    /* renamed from: h */
    public boolean m14976h() {
        return f12404b.getBoolean("KEY_NEW_MATCH_PUSH_ENABLED", true);
    }

    /* renamed from: i */
    public boolean m14980i() {
        return f12404b.getBoolean("KEY_NEW_MESSAGE_PUSH_ENABLED", true);
    }

    /* renamed from: j */
    public boolean m14982j() {
        return f12404b.getBoolean("KEY_MESSAGE_LIKE_PUSH_ENABLED", true);
    }

    /* renamed from: k */
    public boolean m14984k() {
        boolean z;
        SharedPreferences sharedPreferences = f12404b;
        String str = "PREFERS MILES";
        if (!Locale.US.equals(Locale.getDefault())) {
            if (!Locale.UK.equals(Locale.getDefault())) {
                z = false;
                return sharedPreferences.getBoolean(str, z);
            }
        }
        z = true;
        return sharedPreferences.getBoolean(str, z);
    }

    /* renamed from: g */
    public void m14974g(boolean z) {
        f12405c.putBoolean("PREFERS MILES", z).apply();
    }

    /* renamed from: l */
    boolean m14986l() {
        return f12404b.getBoolean("DISCOVER ENABLED", true);
    }

    /* renamed from: h */
    void m14975h(boolean z) {
        f12405c.putBoolean("DISCOVER ENABLED", z);
        f12405c.commit();
    }

    /* renamed from: m */
    public boolean m14988m() {
        return f12404b.getBoolean("NOTIFICATION_VIEWED_TAPPING_HEART", false);
    }

    /* renamed from: n */
    public void m14989n() {
        f12405c.putBoolean("NOTIFICATION_VIEWED_TAPPING_HEART", true).apply();
    }

    /* renamed from: o */
    public boolean m14992o() {
        return f12404b.getBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_LEFT", false);
    }

    /* renamed from: p */
    public void m14993p() {
        f12405c.putBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_LEFT", true).apply();
    }

    /* renamed from: q */
    public boolean m14996q() {
        return f12404b.getBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_RIGHT", false);
    }

    /* renamed from: r */
    public void m14997r() {
        f12405c.putBoolean("KEY_NOTIFICATION_VIEWED_DRAGGING_RIGHT", true).apply();
    }

    /* renamed from: s */
    public boolean m15000s() {
        return f12404b.getBoolean("NOTIFICATION_VIEWED_TAPPING_X", false);
    }

    /* renamed from: t */
    public void m15001t() {
        f12405c.putBoolean("NOTIFICATION_VIEWED_TAPPING_X", true).apply();
    }

    /* renamed from: u */
    public boolean m15004u() {
        return f12404b.getBoolean("KEY_SUPERLIKE_REMINDER_SHOWN", false);
    }

    /* renamed from: i */
    public void m14979i(boolean z) {
        f12405c.putBoolean("KEY_SUPERLIKE_REMINDER_SHOWN", z).apply();
    }

    /* renamed from: v */
    public boolean m15006v() {
        return f12404b.getBoolean("KEY_SUPERLIKE_REMINDER_SHOWN_TAPPING", false);
    }

    /* renamed from: w */
    public void m15007w() {
        f12405c.putBoolean("KEY_SUPERLIKE_REMINDER_SHOWN_TAPPING", true).apply();
    }

    /* renamed from: a */
    public void m14958a(String str) {
        f12405c.putString("APP VERSION NUM", str);
        f12405c.apply();
    }

    /* renamed from: x */
    public boolean m15010x() {
        return f12404b.getBoolean("REGISTERED TINDER PUSH", false);
    }

    /* renamed from: j */
    public void m14981j(boolean z) {
        f12405c.putBoolean("REGISTERED TINDER PUSH", z);
        f12405c.commit();
    }

    /* renamed from: a */
    public void m14953a(double d) {
        f12405c.putString("LATITUDE", String.valueOf(d));
        f12405c.commit();
    }

    /* renamed from: y */
    public double m15011y() {
        Object string = f12404b.getString("LATITUDE", null);
        if (TextUtils.isEmpty(string)) {
            return -100000.0d;
        }
        try {
            return Double.parseDouble(string);
        } catch (Throwable e) {
            ad.m10193a("Failed to parse saved latitude", e);
            return -100000.0d;
        }
    }

    /* renamed from: b */
    public void m14961b(double d) {
        f12405c.putString("LONGITUDE", String.valueOf(d));
        f12405c.commit();
    }

    /* renamed from: z */
    public double m15013z() {
        Object string = f12404b.getString("LONGITUDE", null);
        if (TextUtils.isEmpty(string)) {
            return -100000.0d;
        }
        try {
            return Double.parseDouble(string);
        } catch (Throwable e) {
            ad.m10193a("Failed to parse saved longitude", e);
            return -100000.0d;
        }
    }

    /* renamed from: k */
    public void m14983k(boolean z) {
        f12405c.putBoolean("SETTINGS_CHANGED", z);
        f12405c.commit();
    }

    /* renamed from: A */
    public boolean m14915A() {
        return f12404b.getBoolean("SETTINGS_CHANGED", false);
    }

    /* renamed from: l */
    public void m14985l(boolean z) {
        f12405c.putBoolean("PASSPORT_PREFS_CHANGED", z);
        f12405c.commit();
    }

    /* renamed from: B */
    public boolean m14917B() {
        return f12404b.getBoolean("PASSPORT_PREFS_CHANGED", false);
    }

    /* renamed from: m */
    public void m14987m(boolean z) {
        f12405c.putBoolean("SETTINGS_IS_PUSH_ON", z);
        f12405c.commit();
    }

    /* renamed from: C */
    public boolean m14919C() {
        return f12404b.getBoolean("SETTINGS_IS_PUSH_ON", true);
    }

    /* renamed from: n */
    public void m14990n(boolean z) {
        f12405c.putBoolean("HAS_VIEWED_INTRO", z);
        f12405c.commit();
    }

    /* renamed from: D */
    int m14920D() {
        return f12404b.getInt("AGE_MIN", 18);
    }

    /* renamed from: b */
    void m14962b(int i) {
        f12405c.putInt("AGE_MIN", i);
        f12405c.commit();
    }

    /* renamed from: E */
    int m14922E() {
        return f12404b.getInt("AGE_MAX", 55);
    }

    /* renamed from: c */
    void m14964c(int i) {
        f12405c.putInt("AGE_MAX", i);
        f12405c.commit();
    }

    /* renamed from: F */
    float m14924F() {
        float f;
        StringBuilder stringBuilder;
        try {
            f = f12404b.getFloat("DISTANCE", 50.0f);
            stringBuilder = new StringBuilder();
            stringBuilder.append("distance=");
            stringBuilder.append(f);
            ad.m10190a(stringBuilder.toString());
            return f;
        } catch (NumberFormatException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("exception=");
            stringBuilder.append(e);
            ad.m10195b(stringBuilder.toString());
            f = (float) f12404b.getInt("DISTANCE", 50);
            stringBuilder = new StringBuilder();
            stringBuilder.append("distance=");
            stringBuilder.append(f);
            ad.m10190a(stringBuilder.toString());
            return f;
        }
    }

    /* renamed from: a */
    void m14954a(float f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("distance=");
        stringBuilder.append(f);
        ad.m10190a(stringBuilder.toString());
        f12405c.putFloat("DISTANCE", f);
        f12405c.commit();
    }

    /* renamed from: G */
    boolean m14927G() {
        boolean z = f12404b.getBoolean("ARE_FEMALES_LIKED", false);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("areFemalesLiked=");
        stringBuilder.append(z);
        ad.m10190a(stringBuilder.toString());
        return z;
    }

    /* renamed from: o */
    void m14991o(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("areFemalesLiked=");
        stringBuilder.append(z);
        ad.m10190a(stringBuilder.toString());
        f12405c.putBoolean("ARE_FEMALES_LIKED", z);
        f12405c.commit();
    }

    /* renamed from: H */
    boolean m14929H() {
        return f12404b.getBoolean("ARE_MALES_LIKED", false);
    }

    /* renamed from: p */
    void m14994p(boolean z) {
        f12405c.putBoolean("ARE_MALES_LIKED", z);
        f12405c.commit();
    }

    @Nullable
    /* renamed from: I */
    public String m14930I() {
        return f12404b.getString("TOKEN_TINDER", null);
    }

    /* renamed from: b */
    public void m14963b(String str) {
        f12405c.putString("TOKEN_TINDER", str);
        f12405c.commit();
    }

    @Nullable
    /* renamed from: J */
    public String m14932J() {
        return f12404b.getString("TOKEN_ONBOARDING", null);
    }

    /* renamed from: c */
    public void m14965c(String str) {
        f12405c.putString("TOKEN_ONBOARDING", str).apply();
    }

    /* renamed from: d */
    public void m14966d(String str) {
        f12405c.putString("USER_ID", str).commit();
        this.f12407e.update(str);
    }

    @Nullable
    @Deprecated
    /* renamed from: K */
    public String m14934K() {
        return (String) this.f12407e.get();
    }

    /* renamed from: L */
    public boolean m14937L() {
        return f12404b.getBoolean("IS_LOGGED_IN", false);
    }

    /* renamed from: q */
    public void m14995q(boolean z) {
        f12405c.putBoolean("IS_LOGGED_IN", z);
        f12405c.commit();
    }

    /* renamed from: M */
    public boolean m14939M() {
        return f12404b.getBoolean("HAS_VIEWED_ROADBLOCK", false);
    }

    /* renamed from: r */
    public void m14998r(boolean z) {
        f12405c.putBoolean("HAS_VIEWED_ROADBLOCK", z);
        f12405c.commit();
    }

    /* renamed from: s */
    public void m14999s(boolean z) {
        f12405c.putBoolean("KEY_SUPERLIKE_ENABLED", z);
        f12405c.commit();
    }

    @Deprecated
    /* renamed from: e */
    public void m14967e(String str) {
        f12405c.putString("KEY_BLEND", str).commit();
    }

    @Deprecated
    /* renamed from: N */
    public String m14940N() {
        return f12404b.getString("KEY_BLEND", "optimal");
    }

    @Deprecated
    /* renamed from: f */
    public void m14969f(String str) {
        f12405c.putString("KEY_DISCOVERABILITY", str).commit();
    }

    @Deprecated
    /* renamed from: O */
    public String m14941O() {
        return f12404b.getString("KEY_DISCOVERABILITY", "everyone");
    }

    @Deprecated
    /* renamed from: t */
    public void m15002t(boolean z) {
        f12405c.putBoolean("KEY_HIDE_ADS", z).commit();
    }

    @Deprecated
    /* renamed from: P */
    public boolean m14942P() {
        return f12404b.getBoolean("KEY_HIDE_ADS", false);
    }

    @Deprecated
    /* renamed from: u */
    public void m15003u(boolean z) {
        ProfileUser profileUser = this.f12406d.get();
        if (profileUser != null) {
            this.f12406d.update(profileUser.withHideAge(z));
        }
        f12405c.putBoolean("KEY_HIDE_AGE", z).commit();
    }

    @Deprecated
    /* renamed from: Q */
    public boolean m14943Q() {
        return f12404b.getBoolean("KEY_HIDE_AGE", false);
    }

    @Deprecated
    /* renamed from: v */
    public void m15005v(boolean z) {
        ProfileUser profileUser = this.f12406d.get();
        if (profileUser != null) {
            this.f12406d.update(profileUser.withHideDistance(z));
        }
        f12405c.putBoolean("KEY_HIDE_DISTANCE", z).commit();
    }

    @Deprecated
    /* renamed from: R */
    public boolean m14944R() {
        return f12404b.getBoolean("KEY_HIDE_DISTANCE", false);
    }

    /* renamed from: w */
    public void m15008w(boolean z) {
        f12405c.putBoolean("KEY_VIDEO_BPC_ENABLED", z).commit();
    }

    /* renamed from: x */
    public void m15009x(boolean z) {
        f12405c.putBoolean("KEY_PHOTO_OPTIMIZER_ENABLED", z).commit();
    }

    /* renamed from: S */
    public boolean m14945S() {
        return f12404b.getBoolean("KEY_PHOTO_OPTIMIZER_ENABLED", false);
    }

    /* renamed from: y */
    public void m15012y(boolean z) {
        f12405c.putBoolean("KEY_HAS_AUTO_SHOW_DISCOUNTING_PAYWALL", z).apply();
    }

    /* renamed from: T */
    public boolean m14946T() {
        return f12404b.getBoolean("KEY_HAS_AUTO_SHOW_DISCOUNTING_PAYWALL", false);
    }

    /* renamed from: z */
    public void m15014z(boolean z) {
        f12405c.putBoolean("KEY_HAS_SEEN_INTIAL_BOOST_PAYWALL", z).commit();
    }

    /* renamed from: U */
    public boolean m14947U() {
        return f12404b.getBoolean("KEY_HAS_SEEN_INTIAL_BOOST_PAYWALL", false);
    }

    /* renamed from: V */
    public boolean m14948V() {
        return f12404b.getBoolean("KEY_SHOULD_SHOW_BOOST_SUMMARY", false);
    }

    /* renamed from: g */
    public void m14973g(String str) {
        f12405c.putString("KEY_HAS_SEEN_BOOST_SUMMARY", str).apply();
    }

    /* renamed from: h */
    public boolean m14977h(String str) {
        return f12404b.getString("KEY_HAS_SEEN_BOOST_SUMMARY", "").equals(str);
    }

    public void setBoostCursor(@NonNull String str) {
        f12405c.putString("KEY_BOOST_CURSOR", str).commit();
    }

    @NonNull
    public String getBoostCursor() {
        return f12404b.getString("KEY_BOOST_CURSOR", "0");
    }

    /* renamed from: A */
    public void m14914A(boolean z) {
        f12405c.putBoolean("KEY_HAS_SEEN_BOOST_TOOL_TIP", z).commit();
    }

    /* renamed from: W */
    public boolean m14949W() {
        return f12404b.getBoolean("KEY_HAS_SEEN_BOOST_TOOL_TIP", false);
    }

    /* renamed from: B */
    public void m14916B(boolean z) {
        f12405c.putBoolean("KEY_HAS_SEEN_BOOST_FASTMATCH_TOOL_TIP", z).apply();
    }

    /* renamed from: X */
    public boolean m14950X() {
        return f12404b.getBoolean("KEY_HAS_SEEN_BOOST_FASTMATCH_TOOL_TIP", false);
    }

    /* renamed from: C */
    public void m14918C(boolean z) {
        f12405c.putBoolean("KEY_CONFIG_PHOTO_PREVIEW_ENABLED", z).commit();
    }

    /* renamed from: D */
    public void m14921D(boolean z) {
        f12405c.putBoolean("KEY_SELECT_ENABLED", z).commit();
    }

    /* renamed from: Y */
    public boolean m14951Y() {
        return f12404b.getBoolean("KEY_SELECT_ENABLED", false);
    }

    /* renamed from: a */
    public void m14956a(long j) {
        if (j > 0) {
            f12405c.putLong("SAMPLE_NETWORK_MS", j).apply();
        }
    }

    /* renamed from: Z */
    public long m14952Z() {
        return f12404b.getLong("SAMPLE_NETWORK_MS", 0);
    }

    /* renamed from: a */
    public void m14957a(@NonNull AuthType authType) {
        f12405c.putString("KEY_AUTH_TYPE", authType.getKey()).apply();
    }

    @Nullable
    public AuthType aa() {
        return AuthType.fromValue(f12404b.getString("KEY_AUTH_TYPE", null));
    }

    /* renamed from: a */
    public void m14959a(@NonNull LocalDate localDate) {
        f12405c.putString("UPDATE_ACCOUNT_PASSWORD_LAST_SHOWN_DATE", localDate.toString()).apply();
    }

    @NonNull
    public Optional<LocalDate> ab() {
        String string = f12404b.getString("UPDATE_ACCOUNT_PASSWORD_LAST_SHOWN_DATE", "");
        if (TextUtils.isEmpty(string)) {
            return Optional.a();
        }
        try {
            return Optional.a(LocalDate.m18394a(string, C19322g.c()));
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error parsing updateAccountPasswordLastShownDate: ");
            stringBuilder.append(string);
            C0001a.m30c(e, stringBuilder.toString(), new Object[0]);
            return Optional.a();
        }
    }

    /* renamed from: E */
    public void m14923E(boolean z) {
        f12405c.putBoolean("KEY_TUTORIAL_SELECT", z);
    }

    public boolean ac() {
        return f12404b.getBoolean("KEY_TUTORIAL_SELECT", false);
    }

    public boolean ad() {
        return f12404b.getBoolean("KEY_HAS_SEEN_TINDER_GOLD_INTRO", false);
    }

    /* renamed from: F */
    public void m14925F(boolean z) {
        f12405c.putBoolean("KEY_HAS_SEEN_TINDER_GOLD_INTRO", z).apply();
    }

    public boolean ae() {
        return f12404b.getBoolean("KEY_HAS_SEEN_TINDER_REACTIONS_INTRO", false);
    }

    /* renamed from: G */
    public void m14926G(boolean z) {
        f12405c.putBoolean("KEY_HAS_SEEN_TINDER_REACTIONS_INTRO", z).apply();
    }

    /* renamed from: H */
    public void m14928H(boolean z) {
        f12405c.putBoolean("KEY_HAS_SEEN_FAST_MATCH_GRID_TUTORIAL", z).apply();
    }

    public boolean af() {
        return f12404b.getBoolean("KEY_HAS_SEEN_FAST_MATCH_GRID_TUTORIAL", false);
    }

    /* renamed from: i */
    public void m14978i(String str) {
        f12405c.putString("KEY_LANGUAGE", str).apply();
    }

    public String ag() {
        return f12404b.getString("KEY_LANGUAGE", "");
    }

    public boolean ah() {
        return f12404b.getBoolean("KEY_NOTIFICATION_REACTION_BUTTON", false);
    }

    /* renamed from: I */
    public void m14931I(boolean z) {
        f12405c.putBoolean("KEY_NOTIFICATION_REACTION_BUTTON", z).apply();
    }

    /* renamed from: J */
    public void m14933J(boolean z) {
        f12405c.putBoolean("KEY_ACCOUNT_PAUSED", z).apply();
    }

    public boolean ai() {
        return f12404b.getBoolean("KEY_ACCOUNT_PAUSED", false);
    }

    /* renamed from: K */
    public void m14935K(boolean z) {
        f12405c.putBoolean("KEY_AGE_VALIDATION_REQUIRED", z).apply();
    }

    /* renamed from: L */
    public void m14936L(boolean z) {
        f12405c.putBoolean("KEY_GENDER_VALIDATION_REQUIRED", z).apply();
    }

    /* renamed from: M */
    public void m14938M(boolean z) {
        f12405c.putBoolean("KEY_SMS_VALIDATION_REQUIRED", z).apply();
    }

    public boolean aj() {
        return f12404b.getBoolean("KEY_AGE_VALIDATION_REQUIRED", false);
    }

    public boolean ak() {
        return f12404b.getBoolean("KEY_GENDER_VALIDATION_REQUIRED", false);
    }

    public boolean al() {
        return f12404b.getBoolean("KEY_SMS_VALIDATION_REQUIRED", false);
    }
}
