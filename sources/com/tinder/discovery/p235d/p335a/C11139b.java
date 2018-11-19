package com.tinder.discovery.p235d.p335a;

import android.support.annotation.CallSuper;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11141b;
import com.tinder.discovery.tooltip.DiscoveryTooltipOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/discovery/trigger/decorator/DiscoveryDiscoveryTooltipOwnerDecorator;", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;", "discoveryTooltipOwner", "(Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;)V", "showTooltip", "", "trigger", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "tooltipText", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.d.a.b */
public abstract class C11139b implements DiscoveryTooltipOwner {
    /* renamed from: a */
    private final DiscoveryTooltipOwner f36025a;

    public C11139b(@NotNull DiscoveryTooltipOwner discoveryTooltipOwner) {
        C2668g.b(discoveryTooltipOwner, "discoveryTooltipOwner");
        this.f36025a = discoveryTooltipOwner;
    }

    @CallSuper
    public void showTooltip(@NotNull C11141b c11141b, @NotNull DiscoverySegment discoverySegment, @NotNull CharSequence charSequence) {
        C2668g.b(c11141b, "trigger");
        C2668g.b(discoverySegment, "discoverySegment");
        C2668g.b(charSequence, "tooltipText");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Showing Trigger [");
        stringBuilder.append(c11141b.m43884c());
        stringBuilder.append("]: ");
        stringBuilder.append(c11141b);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.f36025a.showTooltip(c11141b, discoverySegment, charSequence);
    }
}
