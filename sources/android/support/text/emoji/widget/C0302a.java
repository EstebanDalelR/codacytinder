package android.support.text.emoji.widget;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.C0301e.C0300a;
import android.util.AttributeSet;
import android.view.View;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.widget.a */
public class C0302a {
    /* renamed from: a */
    private int f1055a;

    public C0302a(@NonNull View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            view = view.getContext().obtainStyledAttributes(attributeSet, C0300a.EmojiEditText, i, i2);
            this.f1055a = view.getInteger(C0300a.EmojiEditText_maxEmojiCount, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            view.recycle();
        }
    }

    /* renamed from: a */
    public int m1138a() {
        return this.f1055a;
    }
}
