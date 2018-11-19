package com.tinder.bitmoji.keyboard;

import android.graphics.drawable.ColorDrawable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class KeyboardHeightWorker$c implements Runnable {
    /* renamed from: a */
    final /* synthetic */ KeyboardHeightWorker f29607a;

    KeyboardHeightWorker$c(KeyboardHeightWorker keyboardHeightWorker) {
        this.f29607a = keyboardHeightWorker;
    }

    public final void run() {
        if (!this.f29607a.isShowing() && KeyboardHeightWorker.a(this.f29607a).getWindowToken() != null) {
            this.f29607a.setBackgroundDrawable(new ColorDrawable(0));
            this.f29607a.showAtLocation(KeyboardHeightWorker.a(this.f29607a), 0, 0, 0);
        }
    }
}
