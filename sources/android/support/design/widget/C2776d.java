package android.support.design.widget;

import android.graphics.Outline;
import android.support.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: android.support.design.widget.d */
class C2776d extends C0229c {
    C2776d() {
    }

    public void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
