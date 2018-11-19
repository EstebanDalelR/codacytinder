package com.tinder.loops.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider.Factory;
import android.arch.paging.C0054f;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.tinder.loops.C9753a.C9748c;
import com.tinder.loops.C9753a.C9749d;
import com.tinder.loops.C9753a.C9750e;
import com.tinder.loops.di.LoopsApplicationComponentProvider;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.creation.p277d.C9782b;
import com.tinder.loops.engine.extraction.p281c.C9794b;
import com.tinder.loops.p267a.C9752a;
import com.tinder.loops.ui.p284a.C13379a;
import com.tinder.loops.ui.p285b.C9805a;
import com.tinder.loops.ui.view.PannableImageView;
import com.tinder.loops.ui.view.PannableImageView.C14048c;
import com.tinder.loops.ui.view.VideoTimeline;
import com.tinder.loops.ui.viewmodels.VideoCreationViewModel;
import com.tinder.loops.ui.viewmodels.VideoCropperViewModel;
import com.tinder.loops.ui.viewmodels.VideoExtractorViewModel;
import com.tinder.loops.ui.viewmodels.VideoExtractorViewModel.LoopSpeed;
import com.tinder.loops.ui.viewmodels.VideoFrameViewModel;
import com.tinder.p258h.C9694a;
import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020'H\u0002J\b\u0010-\u001a\u00020'H\u0003J\b\u0010.\u001a\u00020'H\u0002J\b\u0010/\u001a\u00020'H\u0002J\u0012\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020'H\u0014J\b\u00104\u001a\u00020'H\u0014J\b\u00105\u001a\u00020'H\u0002J\b\u00106\u001a\u00020'H\u0002J\b\u00107\u001a\u00020'H\u0002J\b\u00108\u001a\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006:"}, d2 = {"Lcom/tinder/loops/activity/TrimAndCropActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "adapter", "Lcom/tinder/loops/ui/adapter/TimelineRecyclerViewAdapter;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "layoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "videoCreationViewModel", "Lcom/tinder/loops/ui/viewmodels/VideoCreationViewModel;", "getVideoCreationViewModel", "()Lcom/tinder/loops/ui/viewmodels/VideoCreationViewModel;", "videoCreationViewModel$delegate", "Lkotlin/Lazy;", "videoCropperViewModel", "Lcom/tinder/loops/ui/viewmodels/VideoCropperViewModel;", "getVideoCropperViewModel", "()Lcom/tinder/loops/ui/viewmodels/VideoCropperViewModel;", "videoCropperViewModel$delegate", "videoExtractorViewModel", "Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel;", "getVideoExtractorViewModel", "()Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel;", "videoExtractorViewModel$delegate", "videoFrameViewModel", "Lcom/tinder/loops/ui/viewmodels/VideoFrameViewModel;", "getVideoFrameViewModel", "()Lcom/tinder/loops/ui/viewmodels/VideoFrameViewModel;", "videoFrameViewModel$delegate", "videoPath", "", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$loops_release", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$loops_release", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "buildTimeline", "", "handlePanning", "handlePreviewbuttonClicked", "observeCurrentLoopSpeed", "observeExtractedFrame", "observeSelectedStartTimePosition", "observeSpeedToggle", "observeVideoCreation", "observeVideoFrame", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "setVideoPath", "setupDagger", "setupPreviewButton", "setupVideoTimeline", "Companion", "loops_release"}, k = 1, mv = {1, 1, 10})
public final class TrimAndCropActivity extends AppCompatActivity {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f45383a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(TrimAndCropActivity.class), "videoCropperViewModel", "getVideoCropperViewModel()Lcom/tinder/loops/ui/viewmodels/VideoCropperViewModel;")), C15825i.a(new PropertyReference1Impl(C15825i.a(TrimAndCropActivity.class), "videoExtractorViewModel", "getVideoExtractorViewModel()Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel;")), C15825i.a(new PropertyReference1Impl(C15825i.a(TrimAndCropActivity.class), "videoFrameViewModel", "getVideoFrameViewModel()Lcom/tinder/loops/ui/viewmodels/VideoFrameViewModel;")), C15825i.a(new PropertyReference1Impl(C15825i.a(TrimAndCropActivity.class), "videoCreationViewModel", "getVideoCreationViewModel()Lcom/tinder/loops/ui/viewmodels/VideoCreationViewModel;"))};
    /* renamed from: c */
    public static final C9756a f45384c = new C9756a();
    @Inject
    @NotNull
    /* renamed from: b */
    public Factory f45385b;
    /* renamed from: d */
    private final Lazy f45386d = C18451c.a(new TrimAndCropActivity$videoCropperViewModel$2(this));
    /* renamed from: e */
    private final Lazy f45387e = C18451c.a(new TrimAndCropActivity$videoExtractorViewModel$2(this));
    /* renamed from: f */
    private final Lazy f45388f = C18451c.a(new TrimAndCropActivity$videoFrameViewModel$2(this));
    /* renamed from: g */
    private final Lazy f45389g = C18451c.a(new TrimAndCropActivity$videoCreationViewModel$2(this));
    /* renamed from: h */
    private final C13379a f45390h = new C13379a();
    /* renamed from: i */
    private final LinearLayoutManager f45391i = new LinearLayoutManager(this, 0, false);
    /* renamed from: j */
    private String f45392j;
    /* renamed from: k */
    private final C17356a f45393k = new C17356a();
    /* renamed from: l */
    private HashMap f45394l;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/tinder/loops/activity/TrimAndCropActivity$Companion;", "", "()V", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", "", "loops_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$a */
    public static final class C9756a {
        private C9756a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$m */
    static final class C9757m implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f32376a;

        C9757m(TrimAndCropActivity trimAndCropActivity) {
            this.f32376a = trimAndCropActivity;
        }

        public final void onClick(View view) {
            this.f32376a.m54519p();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/loops/ui/view/PannableImageView$OnPanObservable;", "Lcom/tinder/loops/ui/view/PannableImageView;", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$b */
    static final class C11897b<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38793a;

        C11897b(TrimAndCropActivity trimAndCropActivity) {
            this.f38793a = trimAndCropActivity;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47901a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final C14048c m47901a(@NotNull Object obj) {
            C2668g.b(obj, "it");
            return ((PannableImageView) this.f38793a.m54523a(C9749d.pannableImage)).m53769a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$c */
    static final class C11898c<T> implements Consumer<C15813i> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38794a;

        C11898c(TrimAndCropActivity trimAndCropActivity) {
            this.f38794a = trimAndCropActivity;
        }

        public /* synthetic */ void accept(Object obj) {
            m47902a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m47902a(C15813i c15813i) {
            this.f38794a.m54519p();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$d */
    static final class C11899d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11899d f38795a = new C11899d();

        C11899d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47903a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47903a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "speed", "Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel$LoopSpeed;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$e */
    static final class C11900e<T> implements Observer<LoopSpeed> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38796a;

        C11900e(TrimAndCropActivity trimAndCropActivity) {
            this.f38796a = trimAndCropActivity;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m47904a((LoopSpeed) obj);
        }

        /* renamed from: a */
        public final void m47904a(@Nullable LoopSpeed loopSpeed) {
            if (loopSpeed != null) {
                switch (C9758a.f32377a[loopSpeed.ordinal()]) {
                    case 1:
                        ((ImageView) this.f38796a.m54523a(C9749d.speedToggle)).setImageResource(C9748c.ic_play_1x);
                        return;
                    case 2:
                        ((ImageView) this.f38796a.m54523a(C9749d.speedToggle)).setImageResource(C9748c.ic_play_2x);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "extractedFrameContext", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$f */
    static final class C11901f<T> implements Observer<C9794b> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38797a;

        C11901f(TrimAndCropActivity trimAndCropActivity) {
            this.f38797a = trimAndCropActivity;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m47905a((C9794b) obj);
        }

        /* renamed from: a */
        public final void m47905a(@Nullable C9794b c9794b) {
            if (c9794b != null) {
                c9794b = c9794b.m40380a();
                Resources resources = this.f38797a.getResources();
                C2668g.a(resources, "resources");
                ((PannableImageView) this.f38797a.m54523a(C9749d.pannableImage)).setAnimationDrawable(C9805a.m40426a(c9794b, resources));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$g */
    static final class C11902g<T> implements Consumer<Long> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38798a;

        C11902g(TrimAndCropActivity trimAndCropActivity) {
            this.f38798a = trimAndCropActivity;
        }

        public /* synthetic */ void accept(Object obj) {
            m47906a((Long) obj);
        }

        /* renamed from: a */
        public final void m47906a(Long l) {
            VideoExtractorViewModel a = this.f38798a.m54505c();
            String b = TrimAndCropActivity.m54503b(this.f38798a);
            C2668g.a(l, "it");
            a.m51757a(b, l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$h */
    static final class C11903h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11903h f38799a = new C11903h();

        C11903h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47907a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47907a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$i */
    static final class C11904i<T> implements Consumer<Object> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38800a;

        C11904i(TrimAndCropActivity trimAndCropActivity) {
            this.f38800a = trimAndCropActivity;
        }

        public final void accept(Object obj) {
            this.f38800a.m54505c().m51763g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$j */
    static final class C11905j<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11905j f38801a = new C11905j();

        C11905j() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47908a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47908a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "video", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$k */
    static final class C11906k<T> implements Observer<C9782b> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38802a;

        C11906k(TrimAndCropActivity trimAndCropActivity) {
            this.f38802a = trimAndCropActivity;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m47909a((C9782b) obj);
        }

        /* renamed from: a */
        public final void m47909a(@Nullable C9782b c9782b) {
            if (c9782b != null) {
                C9752a c9752a = new C9752a(c9782b.m40345e(), this.f38802a);
                ProgressBar progressBar = (ProgressBar) this.f38802a.m54523a(C9749d.creatingProgressingBar);
                C2668g.a(progressBar, "creatingProgressingBar");
                progressBar.setVisibility(8);
                Button button = (Button) this.f38802a.m54523a(C9749d.previewButton);
                C2668g.a(button, "previewButton");
                button.setEnabled(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "pageList", "Landroid/arch/paging/PagedList;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.TrimAndCropActivity$l */
    static final class C11907l<T> implements Observer<C0054f<C9770a>> {
        /* renamed from: a */
        final /* synthetic */ TrimAndCropActivity f38803a;

        C11907l(TrimAndCropActivity trimAndCropActivity) {
            this.f38803a = trimAndCropActivity;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m47910a((C0054f) obj);
        }

        /* renamed from: a */
        public final void m47910a(@Nullable C0054f<C9770a> c0054f) {
            if (c0054f != null) {
                this.f38803a.f45390h.a(c0054f);
            }
        }
    }

    /* renamed from: b */
    private final VideoCropperViewModel m54502b() {
        Lazy lazy = this.f45386d;
        KProperty kProperty = f45383a[0];
        return (VideoCropperViewModel) lazy.getValue();
    }

    /* renamed from: c */
    private final VideoExtractorViewModel m54505c() {
        Lazy lazy = this.f45387e;
        KProperty kProperty = f45383a[1];
        return (VideoExtractorViewModel) lazy.getValue();
    }

    /* renamed from: d */
    private final VideoFrameViewModel m54506d() {
        Lazy lazy = this.f45388f;
        KProperty kProperty = f45383a[2];
        return (VideoFrameViewModel) lazy.getValue();
    }

    /* renamed from: e */
    private final VideoCreationViewModel m54508e() {
        Lazy lazy = this.f45389g;
        KProperty kProperty = f45383a[3];
        return (VideoCreationViewModel) lazy.getValue();
    }

    /* renamed from: a */
    public View m54523a(int i) {
        if (this.f45394l == null) {
            this.f45394l = new HashMap();
        }
        View view = (View) this.f45394l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45394l.put(Integer.valueOf(i), view);
        return view;
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ String m54503b(TrimAndCropActivity trimAndCropActivity) {
        trimAndCropActivity = trimAndCropActivity.f45392j;
        if (trimAndCropActivity == null) {
            C2668g.b("videoPath");
        }
        return trimAndCropActivity;
    }

    @NotNull
    /* renamed from: a */
    public final Factory m54522a() {
        Factory factory = this.f45385b;
        if (factory == null) {
            C2668g.b("viewModelFactory");
        }
        return factory;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C9750e.activity_trim_and_crop);
        m54510g();
        m54512i();
        m54513j();
        m54514k();
        m54515l();
        m54517n();
        m54516m();
        m54509f();
        m54518o();
        m54521r();
        m54520q();
    }

    protected void onResume() {
        super.onResume();
        m54511h();
    }

    protected void onPause() {
        super.onPause();
        this.f45393k.a();
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: f */
    private final void m54509f() {
        this.f45393k.add(C5716a.b((ImageView) m54523a(C9749d.speedToggle)).subscribe(new C11904i(this), C11905j.f38801a));
    }

    /* renamed from: g */
    private final void m54510g() {
        String stringExtra = getIntent().getStringExtra("video-url-key");
        C2668g.a(stringExtra, "intent.getStringExtra(VIDEO_URL_KEY)");
        this.f45392j = stringExtra;
    }

    /* renamed from: h */
    private final void m54511h() {
        this.f45393k.add(((VideoTimeline) m54523a(C9749d.videoTimeline)).m53779a().subscribe(new C11902g(this), C11903h.f38799a));
    }

    /* renamed from: i */
    private final void m54512i() {
        Application application = getApplication();
        if (application == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.loops.di.LoopsApplicationComponentProvider");
        }
        ((LoopsApplicationComponentProvider) application).provideLoopsApplicationComponent().TrimAndCropActivitySubcomponentBuilder().build().inject(this);
    }

    /* renamed from: j */
    private final void m54513j() {
        VideoTimeline videoTimeline = (VideoTimeline) m54523a(C9749d.videoTimeline);
        C2668g.a(videoTimeline, "videoTimeline");
        videoTimeline.setLayoutManager(this.f45391i);
        videoTimeline = (VideoTimeline) m54523a(C9749d.videoTimeline);
        C2668g.a(videoTimeline, "videoTimeline");
        videoTimeline.setAdapter(this.f45390h);
    }

    /* renamed from: k */
    private final void m54514k() {
        m54505c().m51759c().a(this, new C11901f(this));
    }

    /* renamed from: l */
    private final void m54515l() {
        m54506d().m51765b().a(this, new C11907l(this));
    }

    /* renamed from: m */
    private final void m54516m() {
        VideoFrameViewModel d = m54506d();
        String str = this.f45392j;
        if (str == null) {
            C2668g.b("videoPath");
        }
        d.m51764a(str, ((VideoTimeline) m54523a(C9749d.videoTimeline)).getFrameHeight());
    }

    /* renamed from: n */
    private final void m54517n() {
        VideoCropperViewModel b = m54502b();
        C3959e flatMap = C5716a.c((PannableImageView) m54523a(C9749d.pannableImage)).flatMap(new C11897b(this));
        C2668g.a(flatMap, "RxView\n                .…age.observeOnPanEvent() }");
        b.m51748a(flatMap);
    }

    /* renamed from: o */
    private final void m54518o() {
        ((Button) m54523a(C9749d.previewButton)).setOnClickListener(new C9757m(this));
    }

    /* renamed from: p */
    private final void m54519p() {
        if (m54505c().m51762f()) {
            C3957b.a(C15813i.f49016a).a(500, TimeUnit.MILLISECONDS).a(C15674a.a()).a(new C11898c(this), C11899d.f38795a);
            return;
        }
        ProgressBar progressBar = (ProgressBar) m54523a(C9749d.creatingProgressingBar);
        C2668g.a(progressBar, "creatingProgressingBar");
        progressBar.setVisibility(0);
        Button button = (Button) m54523a(C9749d.previewButton);
        C2668g.a(button, "previewButton");
        button.setEnabled(false);
        m54508e().m51744c();
    }

    /* renamed from: q */
    private final void m54520q() {
        m54508e().m51743b().a(new C11906k(this));
    }

    /* renamed from: r */
    private final void m54521r() {
        m54505c().m51761e().a(this, new C11900e(this));
    }
}
