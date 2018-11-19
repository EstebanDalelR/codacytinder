package android.support.text.emoji.widget;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.EmojiCompat;
import android.text.method.TransformationMethod;
import android.view.View;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.widget.i */
class C0314i implements TransformationMethod {
    /* renamed from: a */
    private final TransformationMethod f1071a;

    C0314i(TransformationMethod transformationMethod) {
        this.f1071a = transformationMethod;
    }

    public CharSequence getTransformation(@Nullable CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        if (this.f1071a != null) {
            charSequence = this.f1071a.getTransformation(charSequence, view);
        }
        if (charSequence != null) {
            if (EmojiCompat.m1053a().m1073b() == 1) {
                return EmojiCompat.m1053a().m1067a(charSequence);
            }
        }
        return charSequence;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        if (this.f1071a != null) {
            this.f1071a.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
