package com.tinder.main.trigger.p348a;

import com.tinder.main.model.MainPage;
import com.tinder.main.tooltip.C12013b;
import com.tinder.main.tooltip.MainTabTooltipOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/main/trigger/decorator/MainTabTooltipOwnerDecorator;", "Lcom/tinder/main/tooltip/MainTabTooltipOwner;", "tooltipOwner", "(Lcom/tinder/main/tooltip/MainTabTooltipOwner;)V", "showTooltip", "", "trigger", "Lcom/tinder/main/tooltip/MainTabTooltipTrigger;", "mainPage", "Lcom/tinder/main/model/MainPage;", "tooltipText", "", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.trigger.a.a */
public abstract class C12017a implements MainTabTooltipOwner {
    /* renamed from: a */
    private final MainTabTooltipOwner f38985a;

    public C12017a(@NotNull MainTabTooltipOwner mainTabTooltipOwner) {
        C2668g.b(mainTabTooltipOwner, "tooltipOwner");
        this.f38985a = mainTabTooltipOwner;
    }

    public void showTooltip(@NotNull C12013b c12013b, @NotNull MainPage mainPage, @NotNull CharSequence charSequence) {
        C2668g.b(c12013b, "trigger");
        C2668g.b(mainPage, "mainPage");
        C2668g.b(charSequence, "tooltipText");
        this.f38985a.showTooltip(c12013b, mainPage, charSequence);
    }
}
