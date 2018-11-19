package com.tinder.main.tooltip;

import com.tinder.main.model.MainPage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/main/tooltip/MainTabTooltipOwner;", "", "showTooltip", "", "trigger", "Lcom/tinder/main/tooltip/MainTabTooltipTrigger;", "mainPage", "Lcom/tinder/main/model/MainPage;", "tooltipText", "", "main_release"}, k = 1, mv = {1, 1, 10})
public interface MainTabTooltipOwner {
    void showTooltip(@NotNull C12013b c12013b, @NotNull MainPage mainPage, @NotNull CharSequence charSequence);
}
