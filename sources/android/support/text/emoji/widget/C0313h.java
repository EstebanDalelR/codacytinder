package android.support.text.emoji.widget;

import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.EmojiCompat;
import android.support.text.emoji.EmojiCompat.C0283d;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.widget.h */
final class C0313h implements TextWatcher {
    /* renamed from: a */
    private final EditText f1067a;
    /* renamed from: b */
    private C0283d f1068b;
    /* renamed from: c */
    private int f1069c = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    /* renamed from: d */
    private int f1070d = 0;

    /* renamed from: android.support.text.emoji.widget.h$a */
    private static class C2794a extends C0283d {
        /* renamed from: a */
        private final Reference<EditText> f8845a;

        C2794a(EditText editText) {
            this.f8845a = new WeakReference(editText);
        }

        /* renamed from: a */
        public void mo304a() {
            super.mo304a();
            EditText editText = (EditText) this.f8845a.get();
            if (editText != null && editText.isAttachedToWindow()) {
                CharSequence editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                EmojiCompat.m1053a().m1067a(editableText);
                C0308e.m1152a(editableText, selectionStart, selectionEnd);
            }
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    C0313h(EditText editText) {
        this.f1067a = editText;
    }

    /* renamed from: a */
    void m1161a(int i) {
        this.f1069c = i;
    }

    /* renamed from: b */
    void m1162b(int i) {
        this.f1070d = i;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!(this.f1067a.isInEditMode() || i2 > i3 || (charSequence instanceof Spannable) == 0)) {
            switch (EmojiCompat.m1053a().m1073b()) {
                case 0:
                    EmojiCompat.m1053a().m1071a(m1160a());
                    break;
                case 1:
                    EmojiCompat.m1053a().m1070a((Spannable) charSequence, i, i + i3, this.f1069c, this.f1070d);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private C0283d m1160a() {
        if (this.f1068b == null) {
            this.f1068b = new C2794a(this.f1067a);
        }
        return this.f1068b;
    }
}
