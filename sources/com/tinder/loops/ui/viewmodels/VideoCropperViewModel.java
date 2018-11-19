package com.tinder.loops.ui.viewmodels;

import android.arch.lifecycle.C2686i;
import com.tinder.loops.data.CroppingRectangleRepository;
import com.tinder.loops.engine.creation.p277d.C9781a;
import com.tinder.loops.ui.view.PannableImageView.C9808a;
import com.tinder.p258h.C9694a;
import com.tinder.viewmodel.TinderViewModel;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/loops/ui/viewmodels/VideoCropperViewModel;", "Lcom/tinder/viewmodel/TinderViewModel;", "croppingRectangleRepository", "Lcom/tinder/loops/data/CroppingRectangleRepository;", "(Lcom/tinder/loops/data/CroppingRectangleRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "croppingArea", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "handlePanning", "", "onPanEvents", "Lio/reactivex/Observable;", "observeCroppingArea", "release", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public final class VideoCropperViewModel extends TinderViewModel {
    /* renamed from: a */
    private final C17356a f42408a = new C17356a();
    /* renamed from: b */
    private final C2686i<C9808a> f42409b = new C2686i();
    /* renamed from: c */
    private final CroppingRectangleRepository f42410c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoCropperViewModel$a */
    static final class C11971a<T> implements Consumer<C9808a> {
        /* renamed from: a */
        final /* synthetic */ VideoCropperViewModel f38905a;

        C11971a(VideoCropperViewModel videoCropperViewModel) {
            this.f38905a = videoCropperViewModel;
        }

        public /* synthetic */ void accept(Object obj) {
            m48003a((C9808a) obj);
        }

        /* renamed from: a */
        public final void m48003a(C9808a c9808a) {
            this.f38905a.f42409b.b(c9808a);
            this.f38905a.f42410c.update(new C9781a(c9808a.m40428a(), c9808a.m40429b(), c9808a.m40430c(), c9808a.m40431d()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoCropperViewModel$b */
    static final class C11972b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11972b f38906a = new C11972b();

        C11972b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48004a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48004a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Inject
    public VideoCropperViewModel(@NotNull CroppingRectangleRepository croppingRectangleRepository) {
        C2668g.b(croppingRectangleRepository, "croppingRectangleRepository");
        this.f42410c = croppingRectangleRepository;
    }

    /* renamed from: a */
    public final void m51748a(@NotNull C3959e<C9808a> c3959e) {
        C2668g.b(c3959e, "onPanEvents");
        this.f42408a.a();
        this.f42408a.add(c3959e.subscribe(new C11971a(this), C11972b.f38906a));
    }

    /* renamed from: d */
    public void m51749d() {
        this.f42408a.a();
        this.f42410c.clear();
    }
}
