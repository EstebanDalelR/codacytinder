package android.support.text.emoji.widget;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.util.C0561l;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: android.support.text.emoji.widget.g */
public final class C0312g {
    /* renamed from: a */
    private final C0311a f1066a;

    /* renamed from: android.support.text.emoji.widget.g$a */
    private static class C0311a {
        /* renamed from: a */
        TransformationMethod mo305a(TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        /* renamed from: a */
        void mo306a() {
        }

        /* renamed from: a */
        void mo307a(boolean z) {
        }

        /* renamed from: a */
        InputFilter[] mo308a(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        private C0311a() {
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.text.emoji.widget.g$b */
    private static class C2793b extends C0311a {
        /* renamed from: a */
        private final TextView f8843a;
        /* renamed from: b */
        private final C0308e f8844b;

        C2793b(TextView textView) {
            super();
            this.f8843a = textView;
            this.f8844b = new C0308e(textView);
        }

        /* renamed from: a */
        void mo306a() {
            TransformationMethod transformationMethod = this.f8843a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                this.f8843a.setTransformationMethod(mo305a(transformationMethod));
            }
        }

        /* renamed from: a */
        InputFilter[] mo308a(@NonNull InputFilter[] inputFilterArr) {
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof C0308e) {
                    return inputFilterArr;
                }
            }
            Object obj = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, obj, 0, r0);
            obj[r0] = this.f8844b;
            return obj;
        }

        /* renamed from: a */
        TransformationMethod mo305a(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C0314i) {
                return transformationMethod;
            }
            return new C0314i(transformationMethod);
        }

        /* renamed from: a */
        void mo307a(boolean z) {
            if (z) {
                mo306a();
            }
        }
    }

    public C0312g(@NonNull TextView textView) {
        C0561l.m2062a((Object) textView, (Object) "textView cannot be null");
        this.f1066a = VERSION.SDK_INT >= 19 ? new C2793b(textView) : new C0311a();
    }

    /* renamed from: a */
    public void m1157a() {
        this.f1066a.mo306a();
    }

    @NonNull
    /* renamed from: a */
    public InputFilter[] m1159a(@NonNull InputFilter[] inputFilterArr) {
        return this.f1066a.mo308a(inputFilterArr);
    }

    /* renamed from: a */
    public void m1158a(boolean z) {
        this.f1066a.mo307a(z);
    }
}
