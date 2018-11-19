package com.tinder.discovery.tooltip;

import com.tinder.discovery.p235d.C11141b;
import com.tinder.main.tooltip.C9835c.C9834a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest;", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$DisplayRequest;", "discoveryTooltipTrigger", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "discoveryTooltipOwner", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;", "tooltipText", "", "(Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;Ljava/lang/CharSequence;)V", "execute", "", "Factory", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.tooltip.a */
public final class C11145a extends C9834a {
    /* renamed from: a */
    private final C11141b f36036a;
    /* renamed from: b */
    private final DiscoveryTooltipOwner f36037b;
    /* renamed from: c */
    private final CharSequence f36038c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;", "", "discoveryTooltipOwner", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;", "(Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;)V", "create", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest;", "trigger", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "tooltipText", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.tooltip.a$a */
    public static final class C8892a {
        /* renamed from: a */
        private final DiscoveryTooltipOwner f31124a;

        public C8892a(@NotNull DiscoveryTooltipOwner discoveryTooltipOwner) {
            C2668g.b(discoveryTooltipOwner, "discoveryTooltipOwner");
            this.f31124a = discoveryTooltipOwner;
        }

        @NotNull
        /* renamed from: a */
        public final C11145a m37696a(@NotNull C11141b c11141b, @NotNull CharSequence charSequence) {
            C2668g.b(c11141b, "trigger");
            C2668g.b(charSequence, "tooltipText");
            return new C11145a(c11141b, this.f31124a, charSequence);
        }
    }

    public C11145a(@NotNull C11141b c11141b, @NotNull DiscoveryTooltipOwner discoveryTooltipOwner, @NotNull CharSequence charSequence) {
        C2668g.b(c11141b, "discoveryTooltipTrigger");
        C2668g.b(discoveryTooltipOwner, "discoveryTooltipOwner");
        C2668g.b(charSequence, "tooltipText");
        super(c11141b);
        this.f36036a = c11141b;
        this.f36037b = discoveryTooltipOwner;
        this.f36038c = charSequence;
    }

    /* renamed from: a */
    public void mo10002a() {
        this.f36037b.showTooltip(this.f36036a, this.f36036a.m43884c(), this.f36038c);
    }
}
