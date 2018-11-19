package android.support.text.emoji.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.InputFilter;
import android.util.AttributeSet;

public class EmojiAppCompatTextView extends AppCompatTextView {
    /* renamed from: a */
    private C0312g f12741a;
    /* renamed from: b */
    private boolean f12742b;

    public EmojiAppCompatTextView(Context context) {
        super(context);
        m15696a();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15696a();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15696a();
    }

    /* renamed from: a */
    private void m15696a() {
        if (!this.f12742b) {
            this.f12742b = true;
            getEmojiTextViewHelper().m1157a();
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1159a(inputFilterArr));
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1158a(z);
    }

    private C0312g getEmojiTextViewHelper() {
        if (this.f12741a == null) {
            this.f12741a = new C0312g(this);
        }
        return this.f12741a;
    }
}
