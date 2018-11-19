package com.foursquare.pilgrim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.text.TextUtils;
import android.util.Log;
import com.foursquare.api.Add3rdPartyCheckinParams.VenueIdType;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.ResponseV2;
import com.foursquare.api.types.Venue;
import com.foursquare.internal.data.db.DatabaseProvider;
import com.foursquare.internal.network.C1919a;
import com.foursquare.internal.network.C1919a.C1917b;
import com.foursquare.internal.network.C1919a.C3499a;
import com.foursquare.internal.network.C1920b;
import com.foursquare.internal.network.C1928e;
import com.foursquare.internal.network.FoursquareError;
import com.foursquare.internal.network.Request;
import com.foursquare.internal.p058a.C1912a;
import com.foursquare.internal.util.C1948m;
import com.foursquare.internal.util.FsLog;
import com.foursquare.pilgrim.BaseSpeedStrategy.C1950a;
import com.foursquare.pilgrim.internal.testing.TestingUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.C17692o;

public final class PilgrimSdk {
    /* renamed from: d */
    private static final String f5251d = "PilgrimSdk";
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: e */
    private static PilgrimSdk f5252e;
    @NonNull
    /* renamed from: a */
    final Context f5253a;
    @NonNull
    /* renamed from: b */
    final ak f5254b;
    @NonNull
    /* renamed from: c */
    av f5255c;
    /* renamed from: f */
    private final C1919a<C3549d> f5256f = new C42302(this);

    public static class Builder {
        /* renamed from: a */
        String f5246a;
        /* renamed from: b */
        String f5247b;
        /* renamed from: c */
        String f5248c;
        /* renamed from: d */
        final Context f5249d;
        @NonNull
        /* renamed from: e */
        private av f5250e = av.m6987a();

        public Builder(@NonNull Context context) {
            this.f5249d = context.getApplicationContext();
        }

        public Builder consumer(@NonNull String str, @NonNull String str2) {
            this.f5247b = str;
            this.f5248c = str2;
            return this;
        }

        public Builder oauthToken(String str) {
            this.f5246a = str;
            return this;
        }

        public Builder notificationHandler(@NonNull PilgrimNotificationHandler pilgrimNotificationHandler) {
            if (pilgrimNotificationHandler == null) {
                throw new IllegalArgumentException("handler must not be null");
            }
            this.f5250e = this.f5250e.m6999h().m6980a(pilgrimNotificationHandler).m6985a();
            return this;
        }

        public Builder exceptionHandler(@NonNull PilgrimExceptionHandler pilgrimExceptionHandler) {
            if (pilgrimExceptionHandler == null) {
                throw new IllegalArgumentException("handler must not be null");
            }
            this.f5250e = this.f5250e.m6999h().m6979a(pilgrimExceptionHandler).m6985a();
            return this;
        }

        public Builder logLevel(@NonNull LogLevel logLevel) {
            if (logLevel == null) {
                throw new IllegalArgumentException("logLevel must not be null");
            }
            this.f5250e = this.f5250e.m6999h().m6981a(logLevel).m6985a();
            return this;
        }

        public Builder enablePersistentLogs() {
            this.f5250e = this.f5250e.m6999h().m6984a(true).m6985a();
            return this;
        }

        public Builder userInfo(@NonNull PilgrimUserInfo pilgrimUserInfo) {
            if (pilgrimUserInfo == null) {
                throw new IllegalArgumentException("userInfo must not be null");
            }
            this.f5250e = this.f5250e.m6999h().m6982a(pilgrimUserInfo).m6985a();
            return this;
        }

        public Builder nearbyTriggers(@NonNull List<NearbyTrigger> list) {
            if (list == null) {
                throw new IllegalArgumentException("nearbyTriggers must not be null");
            }
            this.f5250e = this.f5250e.m6999h().m6983a((Collection) list).m6985a();
            return this;
        }
    }

    public enum LogLevel {
        DEBUG,
        ERROR,
        INFO
    }

    /* renamed from: com.foursquare.pilgrim.PilgrimSdk$1 */
    class C35081 extends C1919a<bk> {
        /* renamed from: a */
        final /* synthetic */ RegionType f10590a;
        /* renamed from: b */
        final /* synthetic */ Confidence f10591b;
        /* renamed from: c */
        final /* synthetic */ boolean f10592c;

        public void onFinish(String str) {
        }

        public void onStart(String str) {
        }

        C35081(RegionType regionType, Confidence confidence, boolean z) {
            this.f10590a = regionType;
            this.f10591b = confidence;
            this.f10592c = z;
        }

        public /* synthetic */ void onSuccess(FoursquareType foursquareType, C1917b c1917b) {
            m13293a((bk) foursquareType, c1917b);
        }

        /* renamed from: a */
        public void m13293a(bk bkVar, C1917b c1917b) {
            if (bkVar == null || bkVar.m13376b() == null) {
                PilgrimSdk.get().log(LogLevel.ERROR, "This visit did not match your configuration");
                return;
            }
            PilgrimSdk.get().log(LogLevel.INFO, "This visit matched your app configuration");
            C1917b currentPlace = new CurrentPlace(bkVar.m16804e(), this.f10590a, System.currentTimeMillis(), this.f10591b, "visitId", C1912a.m6645a().m6646b(), null, null, false);
            if (this.f10592c != null) {
                currentPlace.m6858a(System.currentTimeMillis());
            }
            PilgrimSdk.get().f5255c.m6997f().handlePlaceNotification(PilgrimSdk.get().f5253a, new PilgrimSdkPlaceNotification(currentPlace, currentPlace.getLocation()));
        }

        public void onFail(String str, FoursquareError foursquareError, String str2, ResponseV2<bk> responseV2, Request<bk> request) {
            PilgrimSdk.get().log(LogLevel.ERROR, "Problem validating the visit for your configuration");
        }
    }

    /* renamed from: com.foursquare.pilgrim.PilgrimSdk$2 */
    class C42302 extends C3499a<C3549d> {
        /* renamed from: a */
        final /* synthetic */ PilgrimSdk f13509a;

        C42302(PilgrimSdk pilgrimSdk) {
            this.f13509a = pilgrimSdk;
        }

        public /* synthetic */ void onSuccess(FoursquareType foursquareType, C1917b c1917b) {
            m16788a((C3549d) foursquareType, c1917b);
        }

        /* renamed from: a */
        public void m16788a(C3549d c3549d, C1917b c1917b) {
            if (c3549d != null && c3549d.m13377c() != null) {
                try {
                    ax.m7003a().m7027a(this.f13509a.f5253a, c3549d.m13377c());
                } catch (C3549d c3549d2) {
                    PilgrimSdk.get().log(LogLevel.ERROR, "Error while updating PilgrimSettings from PilgrimConfig", c3549d2);
                }
            }
        }
    }

    public static void with(@NonNull Builder builder) {
        au auVar = new au();
        if (f5252e == null) {
            auVar.m6977a(builder.f5249d);
        } else {
            FsLog.m6800a(f5251d, "SDK Already initialized, setting options only.");
        }
        if (!(TextUtils.isEmpty(builder.f5247b) || TextUtils.isEmpty(builder.f5248c))) {
            FsLog.m6800a(f5251d, "Updating SDK consumer.");
            auVar.m6978a(builder.f5247b, builder.f5248c);
        }
        PilgrimSdk pilgrimSdk = get();
        pilgrimSdk.setOauthToken(builder.f5246a);
        pilgrimSdk.f5255c = builder.f5250e;
    }

    @NonNull
    public static PilgrimSdk get() {
        PilgrimSdk pilgrimSdk = f5252e;
        if (pilgrimSdk != null) {
            return pilgrimSdk;
        }
        throw new IllegalStateException("Pilgrim SDK has not been initialized yet!Possible causes of this are:\n\t- You used a `tools:remove` attribute in your AndroidManifest.xml to remove Pilgrim's ContentProvider (which is fine) and did not call the alternative initialization method PilgrimSdk.with().\t- You used a `PilgrimSdk` method from a process other than your main process. This is not allowed.\n\nFrequently, the 2nd scenario will happen when using a library that adds a process to your app, like LeakCanary or ProcessPhoenix, if you forget to return early from your Application#onCreate.\nPlease contact us if you are seeing this error and none of these scenarios apply to you.");
    }

    PilgrimSdk(@NonNull Context context, @NonNull av avVar, @NonNull ak akVar) {
        this.f5253a = context;
        this.f5255c = avVar;
        this.f5254b = akVar;
    }

    @NonNull
    public static String getDebugInfo() {
        ax a = ax.m7003a();
        BaseSpeedStrategy a2 = C1950a.m6845a(get().f5253a, a.m7038h());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Local:\n");
        stringBuilder.append("Is Enabled?: ");
        stringBuilder.append(bh.m7123c());
        stringBuilder.append("\n");
        if (a.m7036f() != null) {
            stringBuilder.append("Monitoring your device stopped at: ");
            stringBuilder.append(a.m7036f().getLat());
            stringBuilder.append(",");
            stringBuilder.append(a.m7036f().getLng());
        } else {
            stringBuilder.append("We are not currently monitoring you at a specific location.\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append(a2.mo2057d());
        stringBuilder.append("Has home/work: ");
        stringBuilder.append(FrequentLocations.hasHomeOrWork(get().f5253a));
        return stringBuilder.toString();
    }

    @Nullable
    public CurrentPlace getCurrentPlace(@NonNull Context context) {
        return CurrentPlace.m6855a(context);
    }

    public static void sendTestNotification(@NonNull Context context, @NonNull Confidence confidence, @NonNull RegionType regionType, boolean z) {
        if (aj.m6921a().f5298c.mo2046a()) {
            FoursquareLocation a = C1912a.m6644a(get().f5253a);
            Venue venue = null;
            if (!regionType.isHomeOrWork()) {
                venue = TestingUtils.getSampleVenue();
            }
            CurrentPlace currentPlace = new CurrentPlace(venue, regionType, System.currentTimeMillis(), confidence, "aVisitId", a, null, null, false);
            if (z) {
                currentPlace.m6858a(System.currentTimeMillis() + 10000);
            }
            if (ag.m6911a(context).m6914a(currentPlace)) {
                get().f5255c.m6997f().handlePlaceNotification(get().f5253a, new PilgrimSdkPlaceNotification(currentPlace, a));
                return;
            }
            get().log(LogLevel.INFO, "Attempting to send a notification but no triggers matched.");
            return;
        }
        get().log(LogLevel.DEBUG, "Attempting to send a notification but the user has pilgrim disabled.");
    }

    public static void sendConnectedTestNotification(String str, @NonNull Confidence confidence, @NonNull RegionType regionType, boolean z) {
        C1928e.m6757a().m6761a(bf.m7089a().m7094a(str, confidence, regionType, z), new C35081(regionType, confidence, z));
    }

    @AnyThread
    public static void checkInAtVenueWithFoursquareVenueId(@NonNull String str) {
        m6876a(str, VenueIdType.FOURSQUARE);
    }

    @AnyThread
    public static void checkInAtVenueWithPartnerVenueId(@NonNull String str) {
        m6876a(str, VenueIdType.HARMONIZED_THIRD_PARTY);
    }

    /* renamed from: a */
    private static void m6876a(@NonNull String str, @NonNull VenueIdType venueIdType) {
        C3555k.m13402a(str, venueIdType, CurrentPlace.m6855a(get().f5253a)).m3756D();
    }

    /* renamed from: a */
    static synchronized void m6875a(@NonNull PilgrimSdk pilgrimSdk) {
        synchronized (PilgrimSdk.class) {
            if (f5252e != null) {
                FsLog.m6805c(f5251d, "PilgrimSdk.instance was already set");
                return;
            }
            f5252e = pilgrimSdk;
            pilgrimSdk.log(LogLevel.DEBUG, "PilgrimSdk.set called; Pilgrim initialized");
        }
    }

    public static void start(@NonNull Context context) {
        m6874a(context, false);
    }

    /* renamed from: a */
    static void m6874a(Context context, boolean z) {
        if (aj.m6926b()) {
            get().log(LogLevel.DEBUG, "API 15 is no longer supported");
            return;
        }
        boolean c = bh.m7123c();
        bh.m7113a(true);
        aj.m6925b(context, z);
        get().log(LogLevel.DEBUG, "Starting the Pilgrim SDK");
        if (!c) {
            C1928e.m6757a().m6761a(bf.m7089a().m7098a(true, bh.m7136l()), get().f5256f);
            bh.m7122c((boolean) null);
        }
    }

    public static void stop(@NonNull Context context) {
        boolean c = bh.m7123c();
        bh.m7113a(false);
        aj.m6922a(context);
        get().log(LogLevel.DEBUG, "Stopping the Pilgrim SDK");
        if (c) {
            C1928e.m6757a().m6760a(bf.m7089a().m7100c());
        }
    }

    public static void clear(@NonNull Context context) {
        bh.m7133i();
        DatabaseProvider.m6655a().m6658c();
        bb.m7079b(context);
        CurrentPlace.m6856a(context, null);
        am.m6943d(context);
        context = get();
        context.setOauthToken(null);
        context.f5255c = context.f5255c.m6999h().m6982a(null).m6985a();
        C1928e.m6757a().m6760a(bf.m7089a().m7101d());
        context.log(LogLevel.DEBUG, "Clearing the Pilgrim SDK");
    }

    @NonNull
    public static List<DebugLogItem> getLogs() {
        if (get().f5255c.m6994c()) {
            return C3551g.m13387a();
        }
        return new ArrayList();
    }

    public static void leaveVisitFeedback(@NonNull String str, @NonNull VisitFeedback visitFeedback, @Nullable String str2) {
        get().log(LogLevel.DEBUG, "Trying to leave visit feedback");
        if (!TextUtils.isEmpty(str)) {
            C1928e.m6757a().m6760a(bf.m7089a().m7095a(str, visitFeedback, str2));
        }
    }

    @NonNull
    public static String getPilgrimInstallId() {
        return bh.m7132h();
    }

    @NonNull
    public PilgrimSdk setOauthToken(@Nullable String str) {
        C1920b.m6688a().m6694a(str);
        return this;
    }

    @NonNull
    public PilgrimSdk setUserInfo(@Nullable PilgrimUserInfo pilgrimUserInfo) {
        this.f5255c = this.f5255c.m6999h().m6982a(pilgrimUserInfo).m6985a();
        return this;
    }

    @NonNull
    public PilgrimSdk setNearbyTriggers(@NonNull Collection<NearbyTrigger> collection) {
        this.f5255c = this.f5255c.m6999h().m6983a(new LinkedHashSet(collection)).m6985a();
        return this;
    }

    @NonNull
    public PilgrimSdk setLogLevel(@NonNull LogLevel logLevel) {
        this.f5255c = this.f5255c.m6999h().m6981a(logLevel).m6985a();
        return this;
    }

    @NonNull
    public PilgrimSdk setEnablePersistentLogs(boolean z) {
        this.f5255c = this.f5255c.m6999h().m6984a(z).m6985a();
        return this;
    }

    @NonNull
    public PilgrimSdk setExceptionHandler(@NonNull PilgrimExceptionHandler pilgrimExceptionHandler) {
        this.f5255c = this.f5255c.m6999h().m6979a(pilgrimExceptionHandler).m6985a();
        return this;
    }

    @NonNull
    public PilgrimSdk setNotificationHandler(@NonNull PilgrimNotificationHandler pilgrimNotificationHandler) {
        this.f5255c = this.f5255c.m6999h().m6980a(pilgrimNotificationHandler).m6985a();
        return this;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NonNull
    public PilgrimSdk setOkHttpClient(@NonNull C17692o c17692o) {
        C1920b.m6688a().m6696a(c17692o);
        return this;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void log(@NonNull LogLevel logLevel, @Nullable String str) {
        log(logLevel, str, null);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void log(@NonNull LogLevel logLevel, @Nullable String str, @Nullable Throwable th) {
        Object obj = 1;
        if (this.f5255c.m6993b().ordinal() <= logLevel.ordinal()) {
            switch (logLevel) {
                case DEBUG:
                    Log.d(f5251d, str);
                    break;
                case ERROR:
                    if (th == null) {
                        Log.e(f5251d, str);
                        break;
                    } else {
                        Log.e(f5251d, str, th);
                        break;
                    }
                case INFO:
                    Log.i(f5251d, str);
                    break;
                default:
                    th = new StringBuilder();
                    th.append("LogLevel enum entry ");
                    th.append(logLevel);
                    th.append(" not supported");
                    throw new UnsupportedOperationException(th.toString());
            }
        }
        obj = null;
        if (th != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("\n Exception: ");
            stringBuilder.append(C1948m.m6842a(th));
            str = stringBuilder.toString();
        }
        if (obj != null && this.f5255c.m6994c() != null) {
            C3551g.m13388a(logLevel, str);
        }
    }
}
