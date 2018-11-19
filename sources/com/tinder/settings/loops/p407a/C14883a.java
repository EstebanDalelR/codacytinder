package com.tinder.settings.loops.p407a;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.loops.usecase.UpdateAutoPlayLoopsSettingsOption;
import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import com.tinder.settings.loops.injection.AutoPlayLoopsOptionsActivityScope;
import com.tinder.settings.loops.target.AutoPlayLoopsOptionsTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/settings/loops/presenter/AutoPlayLoopsOptionsPresenter;", "", "autoPlayVideoSettingsRepository", "Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;", "updateAutoPlayLoopsSettingsOption", "Lcom/tinder/domain/loops/usecase/UpdateAutoPlayLoopsSettingsOption;", "(Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;Lcom/tinder/domain/loops/usecase/UpdateAutoPlayLoopsSettingsOption;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/settings/loops/target/AutoPlayLoopsOptionsTarget;", "getTarget$Tinder_release", "()Lcom/tinder/settings/loops/target/AutoPlayLoopsOptionsTarget;", "setTarget$Tinder_release", "(Lcom/tinder/settings/loops/target/AutoPlayLoopsOptionsTarget;)V", "clear", "", "enableSelectedOption", "onOptionClicked", "option", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@AutoPlayLoopsOptionsActivityScope
/* renamed from: com.tinder.settings.loops.a.a */
public final class C14883a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public AutoPlayLoopsOptionsTarget f46566a;
    /* renamed from: b */
    private final C17356a f46567b = new C17356a();
    /* renamed from: c */
    private final AutoPlayVideoSettingsRepository f46568c;
    /* renamed from: d */
    private final UpdateAutoPlayLoopsSettingsOption f46569d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.a.a$a */
    static final class C16642a<T> implements Consumer<AutoPlayVideoSettingsOption> {
        /* renamed from: a */
        final /* synthetic */ C14883a f51524a;

        C16642a(C14883a c14883a) {
            this.f51524a = c14883a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62107a((AutoPlayVideoSettingsOption) obj);
        }

        /* renamed from: a */
        public final void m62107a(AutoPlayVideoSettingsOption autoPlayVideoSettingsOption) {
            AutoPlayLoopsOptionsTarget a = this.f51524a.m56328a();
            C2668g.a(autoPlayVideoSettingsOption, "it");
            a.setOptionSelected(autoPlayVideoSettingsOption);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.a.a$b */
    static final class C16643b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16643b f51525a = new C16643b();

        C16643b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62108a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62108a(Throwable th) {
            C0001a.c(th, "Unable to observe from AutoPlayVideoSettingsRepository", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.a.a$c */
    static final class C16644c implements Action {
        /* renamed from: a */
        final /* synthetic */ C14883a f51526a;

        C16644c(C14883a c14883a) {
            this.f51526a = c14883a;
        }

        public final void run() {
            this.f51526a.m56330b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.a.a$d */
    static final class C16645d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16645d f51527a = new C16645d();

        C16645d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62109a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62109a(Throwable th) {
            C0001a.c(th, "Unable to update AutoPlayVideoSettingsRepository with new option", new Object[0]);
        }
    }

    @Inject
    public C14883a(@NotNull AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository, @NotNull UpdateAutoPlayLoopsSettingsOption updateAutoPlayLoopsSettingsOption) {
        C2668g.b(autoPlayVideoSettingsRepository, "autoPlayVideoSettingsRepository");
        C2668g.b(updateAutoPlayLoopsSettingsOption, "updateAutoPlayLoopsSettingsOption");
        this.f46568c = autoPlayVideoSettingsRepository;
        this.f46569d = updateAutoPlayLoopsSettingsOption;
    }

    @NotNull
    /* renamed from: a */
    public final AutoPlayLoopsOptionsTarget m56328a() {
        AutoPlayLoopsOptionsTarget autoPlayLoopsOptionsTarget = this.f46566a;
        if (autoPlayLoopsOptionsTarget == null) {
            C2668g.b("target");
        }
        return autoPlayLoopsOptionsTarget;
    }

    @Take
    /* renamed from: b */
    public final void m56330b() {
        this.f46567b.add(this.f46568c.observe().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16642a(this), C16643b.f51525a));
    }

    @Drop
    /* renamed from: c */
    public final void m56331c() {
        this.f46567b.m63446a();
    }

    /* renamed from: a */
    public final void m56329a(@NotNull AutoPlayVideoSettingsOption autoPlayVideoSettingsOption) {
        C2668g.b(autoPlayVideoSettingsOption, "option");
        this.f46567b.add(this.f46569d.execute(autoPlayVideoSettingsOption).b(C15756a.m59010b()).a(new C16644c(this), C16645d.f51527a));
    }
}
