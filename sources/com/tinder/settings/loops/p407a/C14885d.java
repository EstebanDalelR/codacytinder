package com.tinder.settings.loops.p407a;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Take;
import com.tinder.p204d.p205a.C8609a;
import com.tinder.settings.loops.target.AutoPlayVideoSettingsTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tinder/settings/loops/presenter/AutoPlayVideoSettingsPresenter;", "", "loopsExperimentUtility", "Lcom/tinder/loop/experiment/LoopsExperimentUtility;", "(Lcom/tinder/loop/experiment/LoopsExperimentUtility;)V", "target", "Lcom/tinder/settings/loops/target/AutoPlayVideoSettingsTarget;", "getTarget$Tinder_release", "()Lcom/tinder/settings/loops/target/AutoPlayVideoSettingsTarget;", "setTarget$Tinder_release", "(Lcom/tinder/settings/loops/target/AutoPlayVideoSettingsTarget;)V", "onAutoPlaySettingsClicked", "", "toggleAutoPlayControlSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.loops.a.d */
public final class C14885d {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public AutoPlayVideoSettingsTarget f46570a;
    /* renamed from: b */
    private final C8609a f46571b;

    @Inject
    public C14885d(@NotNull C8609a c8609a) {
        C2668g.b(c8609a, "loopsExperimentUtility");
        this.f46571b = c8609a;
    }

    @Take
    /* renamed from: a */
    public final void m56334a() {
        if (!this.f46571b.d()) {
            AutoPlayVideoSettingsTarget autoPlayVideoSettingsTarget = this.f46570a;
            if (autoPlayVideoSettingsTarget == null) {
                C2668g.b("target");
            }
            autoPlayVideoSettingsTarget.hideAutoPlaySettings();
        }
    }

    /* renamed from: b */
    public final void m56335b() {
        AutoPlayVideoSettingsTarget autoPlayVideoSettingsTarget = this.f46570a;
        if (autoPlayVideoSettingsTarget == null) {
            C2668g.b("target");
        }
        autoPlayVideoSettingsTarget.launchAutoPlaySettings();
    }
}
