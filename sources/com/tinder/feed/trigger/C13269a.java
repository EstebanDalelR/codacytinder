package com.tinder.feed.trigger;

import android.content.Context;
import com.tinder.R;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.main.model.MainPage;
import com.tinder.main.tooltip.C12012a.C9833a;
import com.tinder.main.tooltip.C12013b;
import com.tinder.main.tooltip.C9835c;
import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/feed/trigger/FeedTabTooltipTrigger;", "Lcom/tinder/main/tooltip/MainTabTooltipTrigger;", "tooltipQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "context", "Landroid/content/Context;", "tooltipRequestFactory", "Lcom/tinder/main/tooltip/MainTabTooltipRequest$Factory;", "shouldShowFeedTooltip", "Lcom/tinder/feed/trigger/ShouldShowFeedTooltip;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;Landroid/content/Context;Lcom/tinder/main/tooltip/MainTabTooltipRequest$Factory;Lcom/tinder/feed/trigger/ShouldShowFeedTooltip;Lcom/tinder/core/experiment/AbTestUtility;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "onCancelled", "", "onCompleted", "run", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.trigger.a */
public final class C13269a extends C12013b {
    /* renamed from: a */
    private Disposable f42026a;
    /* renamed from: b */
    private final Context f42027b;
    /* renamed from: c */
    private final C9833a f42028c;
    /* renamed from: d */
    private final C11705c f42029d;
    /* renamed from: e */
    private final AbTestUtility f42030e;
    /* renamed from: f */
    private final C15679f f42031f;
    /* renamed from: g */
    private final C15679f f42032g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.trigger.a$a */
    static final class C11701a<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C11701a f38210a = new C11701a();

        C11701a() {
        }

        @NotNull
        /* renamed from: a */
        public final Boolean m47529a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47529a((Boolean) obj).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.trigger.a$b */
    static final class C11702b<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C13269a f38211a;

        C11702b(C13269a c13269a) {
            this.f38211a = c13269a;
        }

        public /* synthetic */ void accept(Object obj) {
            m47530a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m47530a(Boolean bool) {
            bool = this.f38211a;
            C9833a a = this.f38211a.f42028c;
            C12013b c12013b = this.f38211a;
            String string = this.f38211a.f42027b.getString(R.string.new_feed_activity_tooltip_text);
            C2668g.a(string, "context.getString(R.stri…ed_activity_tooltip_text)");
            bool.m48055a(a.m40444a(c12013b, string));
        }
    }

    public C13269a(@NotNull C9835c c9835c, @NotNull Context context, @NotNull C9833a c9833a, @NotNull C11705c c11705c, @NotNull AbTestUtility abTestUtility, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2) {
        C2668g.b(c9835c, "tooltipQueue");
        C2668g.b(context, "context");
        C2668g.b(c9833a, "tooltipRequestFactory");
        C2668g.b(c11705c, "shouldShowFeedTooltip");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        super(MainPage.MATCHES, c9835c);
        this.f42027b = context;
        this.f42028c = c9833a;
        this.f42029d = c11705c;
        this.f42030e = abTestUtility;
        this.f42031f = c15679f;
        this.f42032g = c15679f2;
    }

    public void u_() {
        if (this.f42030e.isFeedTooltipEnabled()) {
            C3959e observeOn = this.f42029d.execute().filter(C11701a.f38210a).subscribeOn(this.f42031f).observeOn(this.f42032g);
            Consumer c11702b = new C11702b(this);
            Function1 function1 = FeedTabTooltipTrigger$run$3.f45320a;
            if (function1 != null) {
                function1 = new C11703b(function1);
            }
            this.f42026a = observeOn.subscribe(c11702b, (Consumer) function1);
        }
    }

    /* renamed from: d */
    public void mo11131d() {
        Disposable disposable = this.f42026a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public void mo10000b() {
        Disposable disposable = this.f42026a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
