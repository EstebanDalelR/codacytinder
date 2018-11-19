package com.tinder.shimmy;

import com.tinder.shimmy.ShimmerFrameLayout$ConfigManager.Listener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManagerListener;", "Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager$Listener;", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "onConfigChanged", "", "shimmy_release"}, k = 1, mv = {1, 1, 9})
final class ShimmerFrameLayout$c implements Listener {
    /* renamed from: a */
    final /* synthetic */ ShimmerFrameLayout f51701a;

    public ShimmerFrameLayout$c(ShimmerFrameLayout shimmerFrameLayout) {
        this.f51701a = shimmerFrameLayout;
    }

    public void onConfigChanged() {
        ShimmerFrameLayout.a(this.f51701a);
    }
}
