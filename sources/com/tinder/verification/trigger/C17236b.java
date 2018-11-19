package com.tinder.verification.trigger;

import com.tinder.api.ManagerWebServices;
import com.tinder.auth.model.C8291f;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import com.tinder.main.trigger.Trigger.RunStrategy;
import com.tinder.verification.C15388c.C15387a;
import com.tinder.verification.usecase.C15390a;
import io.reactivex.C15679f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/verification/trigger/SmsVerificationDisplayTrigger;", "Lcom/tinder/main/trigger/Trigger;", "displayQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "viewModelFactory", "Lcom/tinder/verification/VerificationDialogViewModel$Factory;", "observeSmsVerificationStatus", "Lcom/tinder/verification/usecase/ObserveSmsVerificationStatus;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "owner", "Lcom/tinder/verification/trigger/SmsVerificationDisplayOwner;", "(Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;Lcom/tinder/verification/VerificationDialogViewModel$Factory;Lcom/tinder/verification/usecase/ObserveSmsVerificationStatus;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/tinder/verification/trigger/SmsVerificationDisplayOwner;)V", "observeSmsVerificationStatusDisposable", "Lio/reactivex/disposables/Disposable;", "getRunStrategy", "Lcom/tinder/main/trigger/Trigger$RunStrategy;", "onCancelled", "", "onCompleted", "run", "verification_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.trigger.b */
public final class C17236b extends Trigger {
    /* renamed from: a */
    private Disposable f52841a;
    /* renamed from: b */
    private final C9835c f52842b;
    /* renamed from: c */
    private final C15387a f52843c;
    /* renamed from: d */
    private final C15390a f52844d;
    /* renamed from: e */
    private final C15679f f52845e;
    /* renamed from: f */
    private final C15679f f52846f;
    /* renamed from: g */
    private final SmsVerificationDisplayOwner f52847g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/auth/model/SmsVerificationStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.trigger.b$a */
    static final class C17233a<T> implements Predicate<C8291f> {
        /* renamed from: a */
        public static final C17233a f52838a = new C17233a();

        C17233a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m63139a((C8291f) obj);
        }

        /* renamed from: a */
        public final boolean m63139a(@NotNull C8291f c8291f) {
            C2668g.b(c8291f, "it");
            return c8291f.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/auth/model/SmsVerificationStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.trigger.b$b */
    static final class C17234b<T> implements Consumer<C8291f> {
        /* renamed from: a */
        final /* synthetic */ C17236b f52839a;

        C17234b(C17236b c17236b) {
            this.f52839a = c17236b;
        }

        public /* synthetic */ void accept(Object obj) {
            m63140a((C8291f) obj);
        }

        /* renamed from: a */
        public final void m63140a(C8291f c8291f) {
            this.f52839a.f52842b.a(new C17232a(this.f52839a.f52843c, c8291f.b(), this.f52839a, this.f52839a.f52847g));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.trigger.b$c */
    static final class C17235c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17235c f52840a = new C17235c();

        C17235c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63141a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63141a(Throwable th) {
            C0001a.c(th);
        }
    }

    public C17236b(@NotNull C9835c c9835c, @NotNull C15387a c15387a, @NotNull C15390a c15390a, @NotNull C15679f c15679f, @NotNull C15679f c15679f2, @NotNull SmsVerificationDisplayOwner smsVerificationDisplayOwner) {
        C2668g.b(c9835c, "displayQueue");
        C2668g.b(c15387a, "viewModelFactory");
        C2668g.b(c15390a, "observeSmsVerificationStatus");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        C2668g.b(smsVerificationDisplayOwner, ManagerWebServices.PARAM_GROUP_OWNER);
        this.f52842b = c9835c;
        this.f52843c = c15387a;
        this.f52844d = c15390a;
        this.f52845e = c15679f;
        this.f52846f = c15679f2;
        this.f52847g = smsVerificationDisplayOwner;
    }

    public void u_() {
        this.f52841a = this.f52844d.m57721a().b(this.f52845e).a(this.f52846f).a(C17233a.f52838a).a(new C17234b(this), C17235c.f52840a);
    }

    /* renamed from: d */
    public void m63147d() {
        Disposable disposable = this.f52841a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public void m63146b() {
        Disposable disposable = this.f52841a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @NotNull
    /* renamed from: a */
    public RunStrategy m63145a() {
        return RunStrategy.STICKY;
    }
}
