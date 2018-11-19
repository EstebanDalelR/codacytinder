package com.tinder.pushnotifications.p380a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p012a.p014b.p015a.C0746a;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.module.ForApplication;
import com.tinder.pushnotifications.model.C16250a;
import com.tinder.pushnotifications.model.C16251b;
import com.tinder.pushnotifications.model.C16252c;
import com.tinder.pushnotifications.model.C16253d;
import com.tinder.pushnotifications.model.C16254e;
import com.tinder.pushnotifications.model.C16255f;
import com.tinder.pushnotifications.model.C16256g;
import com.tinder.pushnotifications.model.C16257h;
import com.tinder.pushnotifications.model.C16258i;
import com.tinder.pushnotifications.model.C16259j;
import com.tinder.pushnotifications.model.C16260k;
import com.tinder.pushnotifications.model.C16261l;
import com.tinder.pushnotifications.model.C16262m;
import com.tinder.pushnotifications.model.C16263n;
import com.tinder.pushnotifications.model.C16264o;
import com.tinder.pushnotifications.model.C16265p;
import com.tinder.pushnotifications.model.NotificationType;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.toppicks.notifications.C17050k;
import com.tinder.toppicks.notifications.C17051l;
import com.tinder.utils.C15362l;
import io.reactivex.BackpressureStrategy;
import java.util.Arrays;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Func1;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJi\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aJ)\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001dJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J.\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0006\u0010&\u001a\u00020\nJ\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0$2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\"\u0010)\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002J&\u0010*\u001a\b\u0012\u0004\u0012\u00020+0$2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010,\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010-\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0010J\b\u0010.\u001a\u00020\u0010H\u0002J\u0010\u0010/\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u0002022\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u00104\u001a\u0004\u0018\u0001022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J \u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "context", "Landroid/content/Context;", "bitmapFactory", "Lcom/tinder/utils/BitmapFactory;", "(Lcom/tinder/app/AppVisibilityTracker;Landroid/content/Context;Lcom/tinder/utils/BitmapFactory;)V", "create", "Lcom/tinder/pushnotifications/model/TinderNotification;", "data", "Landroid/os/Bundle;", "type", "Lcom/tinder/pushnotifications/model/NotificationType;", "msg", "", "imageUrl", "title", "notificationId", "matchId", "campaignId", "removeIds", "", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "(Lcom/tinder/pushnotifications/model/NotificationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tinder/app/AppVisibilityTracker$Visibility;)Lcom/tinder/pushnotifications/model/TinderNotification;", "message", "addToExistingNotifications", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/tinder/pushnotifications/model/TinderNotification;", "createBitmojiNotification", "didConnect", "createError", "Lcom/tinder/pushnotifications/model/ErrorNotification;", "createMatch", "Lrx/Single;", "Lcom/tinder/pushnotifications/model/MatchNotification;", "createPhoneNumberVerifiedNotification", "createScreenshotInAppNotification", "name", "createSimpleNotification", "createSuperlikeable", "Lcom/tinder/pushnotifications/model/SuperlikeableNotification;", "createTopPicksDailyNotification", "createTopPicksDiscoveryNotification", "getDefaultBackgroundTitle", "getDefaultForegroundMessage", "getDefaultForegroundTitle", "getDefaultIcon", "Landroid/graphics/Bitmap;", "getIconFromResources", "getImageFromBackend", "getValueWithLegacyFallback", "bundle", "preferredKey", "fallbackKey", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.a.a */
public final class C14548a {
    /* renamed from: a */
    public static final C14544a f45967a = new C14544a();
    /* renamed from: b */
    private final AppVisibilityTracker f45968b;
    /* renamed from: c */
    private final Context f45969c;
    /* renamed from: d */
    private final C15362l f45970d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/pushnotifications/factory/TinderNotificationFactory$Companion;", "", "()V", "CLIENT_ID", "", "LEGACY_PUSH_CAMPAIGN_ID", "LEGACY_PUSH_ID", "LEGACY_PUSH_MATCH_ID", "LEGACY_PUSH_MSG", "LEGACY_PUSH_TYPE", "PUSH_CAMPAIGN_ID", "PUSH_FROM_ID", "PUSH_ID", "PUSH_IMAGE", "PUSH_MATCH_ID", "PUSH_MSG", "PUSH_MSG_FOREGROUND", "PUSH_REMOVE_IDS", "PUSH_TITLE", "PUSH_TITLE_FOREGROUND", "PUSH_TYPE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a.a$a */
    public static final class C14544a {
        private C14544a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/pushnotifications/model/MatchNotification;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a.a$b */
    static final class C14545b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C14548a f45955a;
        /* renamed from: b */
        final /* synthetic */ String f45956b;
        /* renamed from: c */
        final /* synthetic */ String f45957c;
        /* renamed from: d */
        final /* synthetic */ String f45958d;
        /* renamed from: e */
        final /* synthetic */ String f45959e;

        C14545b(C14548a c14548a, String str, String str2, String str3, String str4) {
            this.f45955a = c14548a;
            this.f45956b = str;
            this.f45957c = str2;
            this.f45958d = str3;
            this.f45959e = str4;
        }

        public /* synthetic */ Object call() {
            return m55545a();
        }

        @NotNull
        /* renamed from: a */
        public final C16256g m55545a() {
            C14548a c14548a = this.f45955a;
            NotificationType notificationType = NotificationType.MATCH;
            String str = this.f45956b;
            String str2 = this.f45957c;
            String str3 = this.f45958d;
            if (str3 == null) {
                str3 = this.f45955a.m55555a(NotificationType.MATCH);
            }
            TinderNotification a = C14548a.m55549a(c14548a, notificationType, str, str2, str3, null, this.f45959e, null, null, AppVisibilityTracker$Visibility.FOREGROUND, 208, null);
            if (a != null) {
                return (C16256g) a;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.pushnotifications.model.MatchNotification");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/pushnotifications/model/TinderNotification;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a.a$c */
    static final class C14546c<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C14548a f45960a;
        /* renamed from: b */
        final /* synthetic */ TinderNotification f45961b;
        /* renamed from: c */
        final /* synthetic */ String f45962c;

        C14546c(C14548a c14548a, TinderNotification tinderNotification, String str) {
            this.f45960a = c14548a;
            this.f45961b = tinderNotification;
            this.f45962c = str;
        }

        public /* synthetic */ Object call() {
            return m55546a();
        }

        @NotNull
        /* renamed from: a */
        public final TinderNotification m55546a() {
            this.f45961b.m55580a(this.f45960a.m55560c(this.f45962c));
            return this.f45961b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/pushnotifications/model/SuperlikeableNotification;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a.a$d */
    static final class C14547d<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C14548a f45963a;
        /* renamed from: b */
        final /* synthetic */ String f45964b;
        /* renamed from: c */
        final /* synthetic */ String f45965c;
        /* renamed from: d */
        final /* synthetic */ String f45966d;

        C14547d(C14548a c14548a, String str, String str2, String str3) {
            this.f45963a = c14548a;
            this.f45964b = str;
            this.f45965c = str2;
            this.f45966d = str3;
        }

        public /* synthetic */ Object call() {
            return m55547a();
        }

        @NotNull
        /* renamed from: a */
        public final C16265p m55547a() {
            C14548a c14548a = this.f45963a;
            NotificationType notificationType = NotificationType.SUPER_LIKEABLE;
            String str = this.f45964b;
            String str2 = this.f45965c;
            String str3 = this.f45966d;
            if (str3 == null) {
                str3 = this.f45963a.m55555a(NotificationType.MATCH);
            }
            TinderNotification a = C14548a.m55549a(c14548a, notificationType, str, str2, str3, null, null, null, null, AppVisibilityTracker$Visibility.FOREGROUND, 240, null);
            if (a != null) {
                return (C16265p) a;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.pushnotifications.model.SuperlikeableNotification");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Landroid/graphics/Bitmap;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a.a$e */
    static final class C17875e<T, R> implements Func1<Throwable, Single<? extends Bitmap>> {
        /* renamed from: a */
        final /* synthetic */ C14548a f55754a;

        C17875e(C14548a c14548a) {
            this.f55754a = c14548a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65151a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<Bitmap> m65151a(Throwable th) {
            C0001a.c(th);
            return this.f55754a.f45970d.m57659a((int) R.drawable.ic_flame_tinderlogo);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Landroid/graphics/Bitmap;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a.a$f */
    static final class C17876f<T, R> implements Func1<Throwable, Single<? extends Bitmap>> {
        /* renamed from: a */
        final /* synthetic */ C14548a f55755a;

        C17876f(C14548a c14548a) {
            this.f55755a = c14548a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65152a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<Bitmap> m65152a(Throwable th) {
            C0001a.c(th);
            return this.f55755a.f45970d.m57659a((int) R.drawable.ic_flame_tinderlogo);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lrx/Single;", "Landroid/graphics/Bitmap;", "it", "", "kotlin.jvm.PlatformType", "call", "com/tinder/pushnotifications/factory/TinderNotificationFactory$getImageFromBackend$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a.a$g */
    static final class C17877g<T, R> implements Func1<Throwable, Single<? extends Bitmap>> {
        /* renamed from: a */
        final /* synthetic */ C14548a f55756a;

        C17877g(C14548a c14548a) {
            this.f55756a = c14548a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65153a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<Bitmap> m65153a(Throwable th) {
            C0001a.c(th);
            return this.f55756a.f45970d.m57659a((int) R.drawable.ic_flame_tinderlogo);
        }
    }

    @Inject
    public C14548a(@NotNull AppVisibilityTracker appVisibilityTracker, @NotNull @ForApplication Context context, @NotNull C15362l c15362l) {
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        C2668g.b(context, "context");
        C2668g.b(c15362l, "bitmapFactory");
        this.f45968b = appVisibilityTracker;
        this.f45969c = context;
        this.f45970d = c15362l;
    }

    @Nullable
    /* renamed from: a */
    public final TinderNotification m55562a(@NotNull Bundle bundle) {
        String string;
        C2668g.b(bundle, ManagerWebServices.FB_DATA);
        AppVisibilityTracker$Visibility appVisibilityTracker$Visibility = (AppVisibilityTracker$Visibility) RxJavaInteropExtKt.toV1Observable(this.f45968b.trackVisibility(), BackpressureStrategy.LATEST).u().a();
        String a = m55553a(bundle, "type", "notification.type");
        String a2 = m55553a(bundle, "campaignId", "notification.campaignId");
        String a3 = m55553a(bundle, "matchId", "notification.match_id");
        String string2 = bundle.getString("fromImageUrl");
        String string3 = bundle.getString("pushId");
        String string4 = bundle.getString("clientId");
        String[] stringArray = bundle.getStringArray("removeIds");
        if (appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.BACKGROUND) {
            string = bundle.getString(ManagerWebServices.PARAM_JOB_TITLE);
            bundle = m55553a(bundle, ManagerWebServices.PARAM_TEXT, "notification.message");
        } else {
            string = bundle.getString("foregroundTitle");
            bundle = bundle.getString("foregroundText");
        }
        NotificationType a4 = NotificationType.Factory.m55577a(a);
        if (TextUtils.isEmpty(string)) {
            if (appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.BACKGROUND) {
                string = m55556b();
            } else {
                string = m55555a(a4);
            }
        }
        String str = string;
        if (TextUtils.isEmpty((CharSequence) bundle) && appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.FOREGROUND) {
            bundle = m55557b(a4);
        }
        if ((TextUtils.isEmpty(a) || TextUtils.isEmpty((CharSequence) bundle)) && a4 != NotificationType.REMOVE) {
            return null;
        }
        if (bundle == null) {
            C2668g.a();
        }
        if (str == null) {
            C2668g.a();
        }
        String[] strArr = stringArray != null ? stringArray : new String[0];
        C2668g.a(appVisibilityTracker$Visibility, "visibility");
        bundle = m55551a(a4, bundle, string2, str, string4, a3, a2, strArr, appVisibilityTracker$Visibility);
        bundle.m55583a(string3);
        return bundle;
    }

    @NotNull
    /* renamed from: a */
    public final Single<C16265p> m55566a(@NotNull String str, @Nullable String str2, @NotNull String str3) {
        C2668g.b(str, "message");
        C2668g.b(str3, "imageUrl");
        str = Single.a(new C14547d(this, str, str3, str2));
        C2668g.a(str, "Single.fromCallable {\n  …bleNotification\n        }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<C16256g> m55567a(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        C2668g.b(str, "message");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "imageUrl");
        str = Single.a(new C14545b(this, str, str3, str4, str2));
        C2668g.a(str, "Single.fromCallable {\n  …tchNotification\n        }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final TinderNotification m55563a(@NotNull String str) {
        C2668g.b(str, "message");
        NotificationType notificationType = NotificationType.TOP_PICKS_DAILY;
        String string = this.f45969c.getString(notificationType.getTitleResource());
        C2668g.a(string, "context.getString(type.titleResource)");
        return C14548a.m55549a(this, notificationType, str, null, string, null, null, null, null, AppVisibilityTracker$Visibility.BACKGROUND, 244, null);
    }

    @NotNull
    /* renamed from: a */
    public final Single<TinderNotification> m55565a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "name");
        C2668g.b(str2, "imageUrl");
        String string = this.f45969c.getString(R.string.screenshot_notification_message);
        C15828l c15828l = C15828l.f49033a;
        String string2 = this.f45969c.getString(R.string.screenshot_notification_title);
        C2668g.a(string2, "context.getString(R.stri…nshot_notification_title)");
        Object[] objArr = new Object[]{str};
        str = String.format(string2, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str, "java.lang.String.format(format, *args)");
        String defaultNotificationId = NotificationType.SCREENSHOT.getDefaultNotificationId();
        C2668g.a(string, "message");
        str = Single.a((Callable) new C14546c(this, new C16262m(defaultNotificationId, string, str, m55559c(NotificationType.SCREENSHOT)), str2));
        C2668g.a(str, "Single.fromCallable {\n  …   notification\n        }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final TinderNotification m55564a(boolean z) {
        String string;
        String string2;
        if (z) {
            string = this.f45969c.getResources().getString(R.string.bitmoji_success_notification_title);
            C2668g.a(string, "context.resources.getStr…ccess_notification_title)");
            string2 = this.f45969c.getResources().getString(R.string.bitmoji_success_notification_body);
            C2668g.a(string2, "context.resources.getStr…uccess_notification_body)");
        } else {
            string = this.f45969c.getResources().getString(R.string.bitmoji_failure_notification_title);
            C2668g.a(string, "context.resources.getStr…ilure_notification_title)");
            string2 = this.f45969c.getResources().getString(R.string.bitmoji_failure_notification_body);
            C2668g.a(string2, "context.resources.getStr…ailure_notification_body)");
        }
        TinderNotification c16250a = new C16250a(NotificationType.BITMOJI.getDefaultNotificationId(), string2, string, m55559c(NotificationType.BITMOJI), z);
        Drawable drawable = this.f45969c.getResources().getDrawable(R.drawable.bitmoji_notification_icon);
        C2668g.a(drawable, "context.resources.getDra…itmoji_notification_icon)");
        c16250a.m55580a(C0746a.a(drawable, 0, 0, null, 7, null));
        return c16250a;
    }

    @NotNull
    /* renamed from: b */
    public final TinderNotification m55568b(@NotNull String str) {
        C2668g.b(str, "message");
        NotificationType notificationType = NotificationType.TOP_PICKS_DISCOVERY;
        String string = this.f45969c.getString(notificationType.getTitleResource());
        C2668g.a(string, "context.getString(type.titleResource)");
        return C14548a.m55549a(this, notificationType, str, null, string, null, null, null, null, AppVisibilityTracker$Visibility.FOREGROUND, 244, null);
    }

    @NotNull
    /* renamed from: a */
    public final TinderNotification m55561a() {
        NotificationType notificationType = NotificationType.PHONE_NUMBER_VERIFIED;
        String string = this.f45969c.getString(R.string.sms_verification_notification_message);
        C2668g.a(string, "context.getString(R.stri…ion_notification_message)");
        String string2 = this.f45969c.getString(R.string.sms_verification_notification_title);
        C2668g.a(string2, "context.getString(R.stri…ation_notification_title)");
        return C14548a.m55549a(this, notificationType, string, null, string2, null, null, null, null, AppVisibilityTracker$Visibility.FOREGROUND, 244, null);
    }

    @NotNull
    /* renamed from: b */
    public final C16253d m55569b(@NotNull String str, @Nullable String str2) {
        C2668g.b(str, "message");
        str = m55550a(NotificationType.ERROR, str, str2);
        if (str != null) {
            return (C16253d) str;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.pushnotifications.model.ErrorNotification");
    }

    /* renamed from: a */
    private final TinderNotification m55550a(NotificationType notificationType, String str, String str2) {
        if (str2 == null) {
            str2 = m55555a(notificationType);
        }
        return C14548a.m55549a(this, notificationType, str, null, str2, null, null, null, null, AppVisibilityTracker$Visibility.FOREGROUND, 244, null);
    }

    /* renamed from: a */
    static /* synthetic */ TinderNotification m55549a(C14548a c14548a, NotificationType notificationType, String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, AppVisibilityTracker$Visibility appVisibilityTracker$Visibility, int i, Object obj) {
        int i2 = i;
        return c14548a.m55551a(notificationType, str, (i2 & 4) != 0 ? (String) null : str2, str3, (i2 & 16) != 0 ? (String) null : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? new String[0] : strArr, appVisibilityTracker$Visibility);
    }

    /* renamed from: a */
    private final TinderNotification m55551a(NotificationType notificationType, String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        if (C14549b.f45971a[appVisibilityTracker$Visibility.ordinal()] != 1) {
            appVisibilityTracker$Visibility = m55558c();
        } else {
            appVisibilityTracker$Visibility = m55559c(notificationType);
        }
        Bitmap bitmap = appVisibilityTracker$Visibility;
        switch (C14549b.f45972b[notificationType.ordinal()]) {
            case 1:
                if (str4 == null) {
                    str4 = NotificationType.MATCH.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16256g(str4, str, str3, bitmap, str5);
                break;
            case 2:
                if (str4 == null) {
                    str4 = NotificationType.MESSAGE.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16257h(str4, str, bitmap, str3, str5);
                break;
            case 3:
                if (str4 == null) {
                    str4 = NotificationType.PHOTO_OPTIMIZED.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16259j(str4, str, bitmap, str3);
                break;
            case 4:
                if (str4 == null) {
                    str4 = NotificationType.BOOST.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16251b(str4, str, bitmap, str3);
                break;
            case 5:
                if (str4 == null) {
                    str4 = NotificationType.DISCOUNT.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16252c(str4, str, str3, bitmap);
                break;
            case 6:
                if (str4 == null) {
                    str4 = NotificationType.MARKET.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16255f(str4, str, str3, bitmap, str6);
                break;
            case 7:
                if (str4 == null) {
                    str4 = NotificationType.SUPERLIKE.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16264o(str4, str, bitmap, str3);
                break;
            case 8:
                if (str4 == null) {
                    str4 = "";
                }
                notificationType = (TinderNotification) new C16261l(str4, strArr, bitmap);
                break;
            case 9:
                if (str4 == null) {
                    str4 = NotificationType.FASTMATCH.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16254e(str4, str, str3, bitmap);
                break;
            case 10:
                if (str4 == null) {
                    str4 = NotificationType.SELECT.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16263n(str4, str, bitmap, str3);
                break;
            case 11:
                if (str4 == null) {
                    str4 = NotificationType.ERROR.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16253d(str4, str, bitmap, str3);
                break;
            case 12:
                if (str4 == null) {
                    str4 = NotificationType.SUPER_LIKEABLE.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16265p(str4, str, str3, bitmap);
                break;
            case 13:
                if (str4 == null) {
                    str4 = NotificationType.TOP_PICKS_DAILY.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C17050k(str4, str, str3, bitmap);
                break;
            case 14:
                if (str4 == null) {
                    str4 = NotificationType.PLACES.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16260k(str4, str, bitmap, str3);
                break;
            case 15:
                if (str4 == null) {
                    str4 = NotificationType.TOP_PICKS_DISCOVERY.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C17051l(str4, str, str3, bitmap);
                break;
            case 16:
                if (str4 == null) {
                    str4 = NotificationType.PHONE_NUMBER_VERIFIED.getDefaultNotificationId();
                }
                notificationType = (TinderNotification) new C16258i(str4, str, str3, bitmap);
                break;
            default:
                if (str4 == null) {
                    str4 = NotificationType.GENERAL.getDefaultNotificationId();
                }
                notificationType = new TinderNotification(str4, str, str3, bitmap);
                break;
        }
        notificationType.m55580a(m55560c(str2));
        return notificationType;
    }

    /* renamed from: a */
    private final String m55553a(Bundle bundle, String str, String str2) {
        Object obj;
        str = bundle.getString(str);
        CharSequence charSequence = str;
        if (charSequence != null) {
            if (charSequence.length() != 0) {
                obj = null;
                if (obj != null) {
                    C2668g.a(str, "preferredValue");
                    return str;
                }
                str = bundle.getString(str2);
                return str == null ? str : "";
            }
        }
        obj = 1;
        if (obj != null) {
            str = bundle.getString(str2);
            if (str == null) {
            }
        }
        C2668g.a(str, "preferredValue");
        return str;
    }

    /* renamed from: b */
    private final String m55556b() {
        String string = this.f45969c.getString(R.string.tinder_app_name);
        C2668g.a(string, "context.getString(R.string.tinder_app_name)");
        return string;
    }

    /* renamed from: a */
    private final String m55555a(NotificationType notificationType) {
        notificationType = this.f45969c.getString(notificationType.getTitleResource());
        C2668g.a(notificationType, "context.getString(type.titleResource)");
        return notificationType;
    }

    /* renamed from: b */
    private final String m55557b(NotificationType notificationType) {
        notificationType = this.f45969c.getString(notificationType.getMessageResource());
        C2668g.a(notificationType, "context.getString(type.messageResource)");
        return notificationType;
    }

    /* renamed from: c */
    private final Bitmap m55560c(String str) {
        return str != null ? (Bitmap) C15362l.m57658a(this.f45970d, str, 0, true, 2, null).f(new C17877g(this)).c().a() : null;
    }

    /* renamed from: c */
    private final Bitmap m55558c() {
        Object a = this.f45970d.m57659a((int) R.drawable.ian_icon_default).f(new C17875e(this)).c().a();
        C2668g.a(a, "bitmapFactory.fromResour…ng()\n            .value()");
        return (Bitmap) a;
    }

    /* renamed from: c */
    private final Bitmap m55559c(NotificationType notificationType) {
        notificationType = this.f45970d.m57659a(notificationType.getIconResource()).f(new C17876f(this)).c().a();
        C2668g.a(notificationType, "bitmapFactory.fromResour…ng()\n            .value()");
        return (Bitmap) notificationType;
    }
}
