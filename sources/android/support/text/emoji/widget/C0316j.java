package android.support.text.emoji.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.text.emoji.C0293b;
import android.support.v4.util.C0561l;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.widget.j */
public final class C0316j extends SpannableStringBuilder {
    /* renamed from: a */
    private final Class<?> f1074a;
    /* renamed from: b */
    private final List<C0315a> f1075b = new ArrayList();

    /* renamed from: android.support.text.emoji.widget.j$a */
    private static class C0315a implements SpanWatcher, TextWatcher {
        /* renamed from: a */
        private final Object f1072a;
        /* renamed from: b */
        private final AtomicInteger f1073b = new AtomicInteger(0);

        C0315a(Object obj) {
            this.f1072a = obj;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f1072a).beforeTextChanged(charSequence, i, i2, i3);
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f1072a).onTextChanged(charSequence, i, i2, i3);
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1072a).afterTextChanged(editable);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f1073b.get() <= 0 || !m1164a(obj)) {
                ((SpanWatcher) this.f1072a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f1073b.get() <= 0 || !m1164a(obj)) {
                ((SpanWatcher) this.f1072a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f1073b.get() <= 0 || !m1164a(obj)) {
                ((SpanWatcher) this.f1072a).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        final void m1165a() {
            this.f1073b.incrementAndGet();
        }

        /* renamed from: b */
        final void m1166b() {
            this.f1073b.decrementAndGet();
        }

        /* renamed from: a */
        private boolean m1164a(Object obj) {
            return obj instanceof C0293b;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    C0316j(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        C0561l.m2062a((Object) cls, (Object) "watcherClass cannot be null");
        this.f1074a = cls;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    C0316j(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C0561l.m2062a((Object) cls, (Object) "watcherClass cannot be null");
        this.f1074a = cls;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    static C0316j m1167a(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new C0316j(cls, charSequence);
    }

    /* renamed from: a */
    private boolean m1169a(@Nullable Object obj) {
        return (obj == null || m1168a(obj.getClass()) == null) ? null : true;
    }

    /* renamed from: a */
    private boolean m1168a(@NonNull Class<?> cls) {
        return this.f1074a == cls ? true : null;
    }

    public CharSequence subSequence(int i, int i2) {
        return new C0316j(this.f1074a, this, i, i2);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m1169a(obj)) {
            C0315a c0315a = new C0315a(obj);
            this.f1075b.add(c0315a);
            obj = c0315a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m1168a((Class) cls)) {
            return super.getSpans(i, i2, cls);
        }
        C0315a[] c0315aArr = (C0315a[]) super.getSpans(i, i2, C0315a.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, c0315aArr.length);
        for (cls = null; cls < c0315aArr.length; cls++) {
            objArr[cls] = c0315aArr[cls].f1072a;
        }
        return objArr;
    }

    public void removeSpan(Object obj) {
        Object b;
        if (m1169a(obj)) {
            b = m1170b(obj);
            if (b != null) {
                obj = b;
            }
        } else {
            b = null;
        }
        super.removeSpan(obj);
        if (b != null) {
            this.f1075b.remove(b);
        }
    }

    public int getSpanStart(Object obj) {
        if (m1169a(obj)) {
            C0315a b = m1170b(obj);
            if (b != null) {
                obj = b;
            }
        }
        return super.getSpanStart(obj);
    }

    public int getSpanEnd(Object obj) {
        if (m1169a(obj)) {
            C0315a b = m1170b(obj);
            if (b != null) {
                obj = b;
            }
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        if (m1169a(obj)) {
            C0315a b = m1170b(obj);
            if (b != null) {
                obj = b;
            }
        }
        return super.getSpanFlags(obj);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        if (m1168a(cls)) {
            cls = C0315a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    /* renamed from: b */
    private C0315a m1170b(Object obj) {
        for (int i = 0; i < this.f1075b.size(); i++) {
            C0315a c0315a = (C0315a) this.f1075b.get(i);
            if (c0315a.f1072a == obj) {
                return c0315a;
            }
        }
        return null;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void m1174a() {
        m1171c();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public void m1175b() {
        m1172d();
        m1173e();
    }

    /* renamed from: c */
    private void m1171c() {
        for (int i = 0; i < this.f1075b.size(); i++) {
            ((C0315a) this.f1075b.get(i)).m1165a();
        }
    }

    /* renamed from: d */
    private void m1172d() {
        for (int i = 0; i < this.f1075b.size(); i++) {
            ((C0315a) this.f1075b.get(i)).m1166b();
        }
    }

    /* renamed from: e */
    private void m1173e() {
        for (int i = 0; i < this.f1075b.size(); i++) {
            ((C0315a) this.f1075b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m1171c();
        super.replace(i, i2, charSequence);
        m1172d();
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m1171c();
        super.replace(i, i2, charSequence, i3, i4);
        m1172d();
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
