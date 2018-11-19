package android.support.design.widget;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.C0582a;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.C0586b;
import android.support.v7.appcompat.C0667R;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

@RestrictTo({Scope.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    /* renamed from: a */
    private static final int[] f12683a = new int[]{16842912};
    /* renamed from: b */
    private boolean f12684b;

    /* renamed from: android.support.design.widget.CheckableImageButton$1 */
    class C27621 extends C0582a {
        /* renamed from: a */
        final /* synthetic */ CheckableImageButton f8712a;

        C27621(CheckableImageButton checkableImageButton) {
            this.f8712a = checkableImageButton;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f8712a.isChecked());
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            c0586b.m2260a(true);
            c0586b.m2266b(this.f8712a.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0667R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewCompat.m2185a((View) this, new C27621(this));
    }

    public void setChecked(boolean z) {
        if (this.f12684b != z) {
            this.f12684b = z;
            refreshDrawableState();
            sendAccessibilityEvent(true);
        }
    }

    public boolean isChecked() {
        return this.f12684b;
    }

    public void toggle() {
        setChecked(this.f12684b ^ 1);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f12684b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f12683a.length), f12683a);
        }
        return super.onCreateDrawableState(i);
    }
}
