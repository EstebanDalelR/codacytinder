package android.support.text.emoji.widget;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.EmojiCompat;
import android.support.text.emoji.EmojiCompat.C0283d;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.widget.e */
final class C0308e implements InputFilter {
    /* renamed from: a */
    private final TextView f1063a;
    /* renamed from: b */
    private C0283d f1064b;

    /* renamed from: android.support.text.emoji.widget.e$a */
    private static class C2792a extends C0283d {
        /* renamed from: a */
        private final Reference<TextView> f8842a;

        C2792a(TextView textView) {
            this.f8842a = new WeakReference(textView);
        }

        /* renamed from: a */
        public void mo304a() {
            super.mo304a();
            TextView textView = (TextView) this.f8842a.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence a = EmojiCompat.m1053a().m1067a(textView.getText());
                int selectionStart = Selection.getSelectionStart(a);
                int selectionEnd = Selection.getSelectionEnd(a);
                textView.setText(a);
                if (a instanceof Spannable) {
                    C0308e.m1152a((Spannable) a, selectionStart, selectionEnd);
                }
            }
        }
    }

    C0308e(@NonNull TextView textView) {
        this.f1063a = textView;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f1063a.isInEditMode()) {
            return charSequence;
        }
        switch (EmojiCompat.m1053a().m1073b()) {
            case 0:
                EmojiCompat.m1053a().m1071a(m1151a());
                return charSequence;
            case 1:
                Object obj = 1;
                if (i4 == 0 && i3 == 0 && spanned.length() == null && charSequence == this.f1063a.getText()) {
                    obj = null;
                }
                if (obj == null || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.m1053a().m1068a(charSequence, 0, charSequence.length());
            default:
                return charSequence;
        }
    }

    /* renamed from: a */
    private C0283d m1151a() {
        if (this.f1064b == null) {
            this.f1064b = new C2792a(this.f1063a);
        }
        return this.f1064b;
    }

    /* renamed from: a */
    static void m1152a(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }
}
