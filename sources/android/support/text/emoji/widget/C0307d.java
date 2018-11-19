package android.support.text.emoji.widget;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.EmojiCompat;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.widget.d */
final class C0307d extends InputConnectionWrapper {
    /* renamed from: a */
    private final TextView f1062a;

    C0307d(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f1062a = textView;
        EmojiCompat.m1053a().m1072a(editorInfo);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (EmojiCompat.m1059a((InputConnection) this, m1150a(), i, i2, false) || super.deleteSurroundingText(i, i2) != 0) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (EmojiCompat.m1059a((InputConnection) this, m1150a(), i, i2, true)) {
            return true;
        }
        if (super.deleteSurroundingTextInCodePoints(i, i2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Editable m1150a() {
        return this.f1062a.getEditableText();
    }
}
