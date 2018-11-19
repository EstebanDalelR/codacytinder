package android.support.text.emoji.widget;

import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.EmojiCompat;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.widget.f */
final class C0309f implements KeyListener {
    /* renamed from: a */
    private final KeyListener f1065a;

    C0309f(KeyListener keyListener) {
        this.f1065a = keyListener;
    }

    public int getInputType() {
        return this.f1065a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (!EmojiCompat.m1058a(editable, i, keyEvent)) {
            if (this.f1065a.onKeyDown(view, editable, i, keyEvent) == null) {
                return null;
            }
        }
        return true;
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1065a.onKeyUp(view, editable, i, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1065a.onKeyOther(view, editable, keyEvent);
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1065a.clearMetaKeyState(view, editable, i);
    }
}
