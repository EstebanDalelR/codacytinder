package com.tinder.discovery.tooltip;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11141b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;", "", "showTooltip", "", "trigger", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "tooltipText", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
public interface DiscoveryTooltipOwner {
    void showTooltip(@NotNull C11141b c11141b, @NotNull DiscoverySegment discoverySegment, @NotNull CharSequence charSequence);
}
