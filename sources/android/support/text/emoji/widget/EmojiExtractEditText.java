package android.support.text.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

@RestrictTo({Scope.LIBRARY_GROUP})
public class EmojiExtractEditText extends ExtractEditText {
    /* renamed from: a */
    private C0305b f1053a;
    /* renamed from: b */
    private boolean f1054b;

    public EmojiExtractEditText(Context context) {
        super(context);
        m1137a(null, 0, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1137a(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1137a(attributeSet, i, null);
    }

    @RequiresApi(21)
    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1137a(attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1137a(@Nullable AttributeSet attributeSet, int i, int i2) {
        if (!this.f1054b) {
            this.f1054b = true;
            setMaxEmojiCount(new C0302a(this, attributeSet, i, i2).m1138a());
            setKeyListener(super.getKeyListener());
        }
    }

    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().m1144a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().m1145a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i) {
        getEmojiEditTextHelper().m1146a(i);
    }

    public void setEmojiReplaceStrategy(int i) {
        getEmojiEditTextHelper().m1148b(i);
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().m1147b();
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().m1143a();
    }

    private C0305b getEmojiEditTextHelper() {
        if (this.f1053a == null) {
            this.f1053a = new C0305b(this);
        }
        return this.f1053a;
    }
}
