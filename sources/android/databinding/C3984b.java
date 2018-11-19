package android.databinding;

import android.databinding.Observable.C0095a;

/* renamed from: android.databinding.b */
abstract class C3984b extends C2727a {

    /* renamed from: android.databinding.b$a */
    class C2728a extends C0095a {
        /* renamed from: a */
        final /* synthetic */ C3984b f8587a;

        C2728a(C3984b c3984b) {
            this.f8587a = c3984b;
        }

        /* renamed from: a */
        public void mo137a(Observable observable, int i) {
            this.f8587a.notifyChange();
        }
    }

    public C3984b(Observable... observableArr) {
        if (observableArr != null && observableArr.length != 0) {
            C0095a c2728a = new C2728a(this);
            for (Observable addOnPropertyChangedCallback : observableArr) {
                addOnPropertyChangedCallback.addOnPropertyChangedCallback(c2728a);
            }
        }
    }
}
