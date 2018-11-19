package com.tinder.main.tooltip;

import com.tinder.main.tooltip.C9835c.C9834a;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/main/tooltip/MainTabTooltipRequest;", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$DisplayRequest;", "mainTabTooltipTrigger", "Lcom/tinder/main/tooltip/MainTabTooltipTrigger;", "mainTabTooltipOwner", "Ldagger/Lazy;", "Lcom/tinder/main/tooltip/MainTabTooltipOwner;", "tooltipText", "", "(Lcom/tinder/main/tooltip/MainTabTooltipTrigger;Ldagger/Lazy;Ljava/lang/CharSequence;)V", "execute", "", "Factory", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tooltip.a */
public final class C12012a extends C9834a {
    /* renamed from: a */
    private final C12013b f38974a;
    /* renamed from: b */
    private final Lazy<MainTabTooltipOwner> f38975b;
    /* renamed from: c */
    private final CharSequence f38976c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/main/tooltip/MainTabTooltipRequest$Factory;", "", "mainTabTooltipOwner", "Ldagger/Lazy;", "Lcom/tinder/main/tooltip/MainTabTooltipOwner;", "(Ldagger/Lazy;)V", "create", "Lcom/tinder/main/tooltip/MainTabTooltipRequest;", "trigger", "Lcom/tinder/main/tooltip/MainTabTooltipTrigger;", "tooltipText", "", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tooltip.a$a */
    public static final class C9833a {
        /* renamed from: a */
        private final Lazy<MainTabTooltipOwner> f32546a;

        public C9833a(@NotNull Lazy<MainTabTooltipOwner> lazy) {
            C2668g.b(lazy, "mainTabTooltipOwner");
            this.f32546a = lazy;
        }

        @NotNull
        /* renamed from: a */
        public final C12012a m40444a(@NotNull C12013b c12013b, @NotNull CharSequence charSequence) {
            C2668g.b(c12013b, "trigger");
            C2668g.b(charSequence, "tooltipText");
            return new C12012a(c12013b, this.f32546a, charSequence);
        }
    }

    public C12012a(@NotNull C12013b c12013b, @NotNull Lazy<MainTabTooltipOwner> lazy, @NotNull CharSequence charSequence) {
        C2668g.b(c12013b, "mainTabTooltipTrigger");
        C2668g.b(lazy, "mainTabTooltipOwner");
        C2668g.b(charSequence, "tooltipText");
        super(c12013b);
        this.f38974a = c12013b;
        this.f38975b = lazy;
        this.f38976c = charSequence;
    }

    /* renamed from: a */
    public void mo10002a() {
        ((MainTabTooltipOwner) this.f38975b.get()).showTooltip(this.f38974a, this.f38974a.m48056e(), this.f38976c);
    }
}
