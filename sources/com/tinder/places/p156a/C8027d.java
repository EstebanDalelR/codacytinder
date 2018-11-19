package com.tinder.places.p156a;

import android.content.Context;
import com.tinder.R;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11141b;
import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger.RunStrategy;
import com.tinder.module.ForApplication;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/places/badge/PlacesTooltipTrigger;", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "shouldShowPlacesTooltip", "Lcom/tinder/places/badge/ShouldShowPlacesTooltip;", "context", "Landroid/content/Context;", "displayQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "discoveryTooltipRequestFactory", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;", "(Lcom/tinder/places/badge/ShouldShowPlacesTooltip;Landroid/content/Context;Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "getRunStrategy", "Lcom/tinder/main/trigger/Trigger$RunStrategy;", "onCancelled", "", "onCompleted", "run", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.a.d */
public final class C8027d extends C11141b {
    /* renamed from: a */
    private Disposable f28672a;
    /* renamed from: b */
    private final C7357l f28673b;
    /* renamed from: c */
    private final Context f28674c;
    /* renamed from: d */
    private final C8892a f28675d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.d$a */
    static final class C7347a<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C7347a f26516a = new C7347a();

        C7347a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m31325a((Boolean) obj);
        }

        /* renamed from: a */
        public final boolean m31325a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return C2668g.a(bool, Boolean.valueOf(true));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.d$b */
    static final class C7348b<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C8027d f26517a;

        C7348b(C8027d c8027d) {
            this.f26517a = c8027d;
        }

        public /* synthetic */ void accept(Object obj) {
            m31326a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m31326a(Boolean bool) {
            bool = this.f26517a;
            C8892a a = this.f26517a.f28675d;
            C11141b c11141b = this.f26517a;
            String string = this.f26517a.f28674c.getString(R.string.places_tooltip_check_out_places);
            C2668g.a(string, "context.getString(R.stri…ces\n                    )");
            bool.a(a.a(c11141b, string));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.d$c */
    static final class C7349c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C7349c f26518a = new C7349c();

        C7349c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m31327a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m31327a(Throwable th) {
            C0001a.c(th, "Error showing places tooltip trigger", new Object[0]);
        }
    }

    public C8027d(@NotNull C7357l c7357l, @NotNull @ForApplication Context context, @NotNull C9835c c9835c, @NotNull C8892a c8892a) {
        C2668g.b(c7357l, "shouldShowPlacesTooltip");
        C2668g.b(context, "context");
        C2668g.b(c9835c, "displayQueue");
        C2668g.b(c8892a, "discoveryTooltipRequestFactory");
        super(DiscoverySegment.PLACES, c9835c);
        this.f28673b = c7357l;
        this.f28674c = context;
        this.f28675d = c8892a;
    }

    public void u_() {
        this.f28672a = this.f28673b.execute().distinctUntilChanged().filter(C7347a.f26516a).subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C7348b(this), C7349c.f26518a);
    }

    /* renamed from: d */
    public void m33940d() {
        Disposable disposable = this.f28672a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public void m33939b() {
        Disposable disposable = this.f28672a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @NotNull
    /* renamed from: a */
    public RunStrategy m33938a() {
        return RunStrategy.STICKY;
    }
}
