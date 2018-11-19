package com.tinder.pushnotifications.strategy;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tinder.R;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.module.ForApplication;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.p381b.C14551a;
import com.tinder.pushnotifications.usecase.NotifyPushServer;
import com.tinder.pushnotifications.usecase.NotifyPushServer.NotifyReason;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.HashSet;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/pushnotifications/strategy/ForegroundNotificationStrategy;", "Lcom/tinder/pushnotifications/strategy/NotificationStrategy;", "context", "Landroid/content/Context;", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "mainThreadHandler", "Landroid/os/Handler;", "notifyPushServer", "Lcom/tinder/pushnotifications/usecase/NotifyPushServer;", "inAppNotificationProvider", "Lcom/tinder/pushnotifications/provider/InAppNotificationProvider;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Landroid/content/Context;Lcom/tinder/app/AppVisibilityTracker;Landroid/os/Handler;Lcom/tinder/pushnotifications/usecase/NotifyPushServer;Lcom/tinder/pushnotifications/provider/InAppNotificationProvider;Lcom/tinder/core/experiment/AbTestUtility;)V", "legacyInAppNotificationHeight", "", "pileOfToast", "Ljava/util/HashSet;", "Landroid/widget/Toast;", "Lkotlin/collections/HashSet;", "sendNotification", "", "notification", "Lcom/tinder/pushnotifications/model/TinderNotification;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.strategy.c */
public final class C16270c implements NotificationStrategy {
    /* renamed from: a */
    private final int f50672a = ((int) this.f50674c.getResources().getDimension(R.dimen.actionbar_size));
    /* renamed from: b */
    private final HashSet<Toast> f50673b = new HashSet();
    /* renamed from: c */
    private final Context f50674c;
    /* renamed from: d */
    private final Handler f50675d;
    /* renamed from: e */
    private final NotifyPushServer f50676e;
    /* renamed from: f */
    private final C14551a f50677f;
    /* renamed from: g */
    private final AbTestUtility f50678g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.strategy.c$a */
    static final class C14573a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C16270c f45999a;
        /* renamed from: b */
        final /* synthetic */ View f46000b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.pushnotifications.strategy.c$a$a */
        static final class C14572a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ Toast f45998a;

            C14572a(Toast toast) {
                this.f45998a = toast;
            }

            public final void onClick(View view) {
                this.f45998a.cancel();
            }
        }

        C14573a(C16270c c16270c, View view) {
            this.f45999a = c16270c;
            this.f46000b = view;
        }

        public final void run() {
            Toast toast = new Toast(this.f45999a.f50674c);
            toast.setDuration(1);
            toast.setView(this.f46000b);
            toast.setGravity(55, 0, this.f45999a.f50672a);
            this.f46000b.setOnClickListener(new C14572a(toast));
            this.f45999a.f50673b.add(toast);
            toast.show();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.strategy.c$1 */
    static final class C162671<T> implements Predicate<AppVisibilityTracker$Visibility> {
        /* renamed from: a */
        public static final C162671 f50669a = new C162671();

        C162671() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61443a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final boolean m61443a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            C2668g.b(appVisibilityTracker$Visibility, "it");
            return appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.BACKGROUND ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.strategy.c$3 */
    static final class C162693<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C162693 f50671a = new C162693();

        C162693() {
        }

        /* renamed from: a */
        public final void m61445a(Throwable th) {
        }

        public /* synthetic */ void accept(Object obj) {
            m61445a((Throwable) obj);
        }
    }

    @Inject
    public C16270c(@NotNull @ForApplication Context context, @NotNull AppVisibilityTracker appVisibilityTracker, @NotNull @Named("main_thread_handler") Handler handler, @NotNull NotifyPushServer notifyPushServer, @NotNull C14551a c14551a, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(context, "context");
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        C2668g.b(handler, "mainThreadHandler");
        C2668g.b(notifyPushServer, "notifyPushServer");
        C2668g.b(c14551a, "inAppNotificationProvider");
        C2668g.b(abTestUtility, "abTestUtility");
        this.f50674c = context;
        this.f50675d = handler;
        this.f50676e = notifyPushServer;
        this.f50677f = c14551a;
        this.f50678g = abTestUtility;
        appVisibilityTracker.trackVisibility().filter((Predicate) C162671.f50669a).subscribe((Consumer) new Consumer<AppVisibilityTracker$Visibility>() {
            public /* synthetic */ void accept(Object obj) {
                m61444a((AppVisibilityTracker$Visibility) obj);
            }

            /* renamed from: a */
            public final void m61444a(AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
                for (Toast cancel : this.f50673b) {
                    cancel.cancel();
                }
                this.f50673b.clear();
            }
        }, (Consumer) C162693.f50671a);
    }

    public void sendNotification(@NotNull TinderNotification tinderNotification) {
        C2668g.b(tinderNotification, "notification");
        this.f50676e.m55608a(NotifyReason.PN_RECEIVED_IN_FOREGROUND);
        if (this.f50678g.isNewInAppNotificationEnabled()) {
            this.f50677f.m55575a(tinderNotification);
            return;
        }
        this.f50675d.post(new C14573a(this, tinderNotification.m55587c(this.f50674c)));
    }
}
