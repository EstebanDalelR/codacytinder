package com.tinder.crashindicator.reporter;

import android.os.Looper;
import android.support.annotation.UiThread;
import com.tinder.crashindicator.p321c.C10715c;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import java.lang.Thread.UncaughtExceptionHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0017J\b\u0010\u0018\u001a\u00020\u0011H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/crashindicator/reporter/CrashUncaughtExceptionHandler;", "Lcom/tinder/crashindicator/reporter/UncaughtExceptionTracker;", "appCloseOnUncaughtExceptionHandler", "Lcom/tinder/crashindicator/reporter/AppCloseOnUncaughtExceptionHandler;", "saveCrashTimeStamp", "Lcom/tinder/crashindicator/usecase/SaveCrashTimeStamp;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/crashindicator/reporter/AppCloseOnUncaughtExceptionHandler;Lcom/tinder/crashindicator/usecase/SaveCrashTimeStamp;Lkotlin/jvm/functions/Function0;)V", "isStarted", "", "startTimer", "", "uncaughtExceptionHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "handleUncaughtException", "", "thread", "Ljava/lang/Thread;", "throwable", "", "handleUncaughtException$Tinder_release", "startUncaughtExceptionTracker", "stopUncaughtExceptionTracker", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.reporter.a */
public final class C10716a implements UncaughtExceptionTracker {
    /* renamed from: a */
    private UncaughtExceptionHandler f35077a;
    /* renamed from: b */
    private long f35078b;
    /* renamed from: c */
    private boolean f35079c;
    /* renamed from: d */
    private final AppCloseOnUncaughtExceptionHandler f35080d;
    /* renamed from: e */
    private final C10715c f35081e;
    /* renamed from: f */
    private final Function0<DateTime> f35082f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "thread", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "throwable", "", "uncaughtException"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.reporter.a$a */
    static final class C8607a implements UncaughtExceptionHandler {
        /* renamed from: a */
        final /* synthetic */ C10716a f30462a;

        C8607a(C10716a c10716a) {
            this.f30462a = c10716a;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            C10716a c10716a = this.f30462a;
            C2668g.a(thread, "thread");
            c10716a.m43058a(thread, th);
        }
    }

    @Inject
    public C10716a(@NotNull AppCloseOnUncaughtExceptionHandler appCloseOnUncaughtExceptionHandler, @NotNull C10715c c10715c, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(appCloseOnUncaughtExceptionHandler, "appCloseOnUncaughtExceptionHandler");
        C2668g.b(c10715c, "saveCrashTimeStamp");
        C2668g.b(function0, "dateTimeProvider");
        this.f35080d = appCloseOnUncaughtExceptionHandler;
        this.f35081e = c10715c;
        this.f35082f = function0;
    }

    @UiThread
    public void startUncaughtExceptionTracker() {
        if (this.f35079c) {
            C0001a.e("CrashUncaughtExceptionHandler.startUncaughtExceptionTracker has already been invoked. Start must be called only once.", new Object[0]);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        C2668g.a(mainLooper, "Looper.getMainLooper()");
        Thread thread = mainLooper.getThread();
        this.f35078b = ((DateTime) this.f35082f.invoke()).getMillis();
        C2668g.a(thread, "mainThread");
        this.f35077a = thread.getUncaughtExceptionHandler();
        thread.setUncaughtExceptionHandler(new C8607a(this));
        this.f35079c = true;
    }

    @UiThread
    public void stopUncaughtExceptionTracker() {
        Looper mainLooper = Looper.getMainLooper();
        C2668g.a(mainLooper, "Looper.getMainLooper()");
        Thread thread = mainLooper.getThread();
        C2668g.a(thread, "Looper.getMainLooper().thread");
        thread.setUncaughtExceptionHandler((UncaughtExceptionHandler) null);
        this.f35079c = false;
    }

    /* renamed from: a */
    public final void m43058a(@NotNull Thread thread, @Nullable Throwable th) {
        UncaughtExceptionHandler uncaughtExceptionHandler;
        C2668g.b(thread, "thread");
        long millis = ((DateTime) this.f35082f.invoke()).getMillis();
        this.f35081e.m43057a(millis);
        this.f35080d.onAppClose(millis - this.f35078b);
        this.f35078b = 0;
        if (this.f35077a != null) {
            uncaughtExceptionHandler = this.f35077a;
        } else {
            uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
