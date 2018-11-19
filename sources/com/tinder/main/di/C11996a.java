package com.tinder.main.di;

import com.tinder.main.di.MainViewComponent.Builder;
import dagger.internal.C15521i;

/* renamed from: com.tinder.main.di.a */
public final class C11996a implements MainViewComponent {

    /* renamed from: com.tinder.main.di.a$a */
    private static final class C11995a implements Builder {
        /* renamed from: a */
        private MainViewComponent$Parent f38951a;

        private C11995a() {
        }

        public /* synthetic */ Builder parent(MainViewComponent$Parent mainViewComponent$Parent) {
            return m48038a(mainViewComponent$Parent);
        }

        public MainViewComponent build() {
            if (this.f38951a != null) {
                return new C11996a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(MainViewComponent$Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C11995a m48038a(MainViewComponent$Parent mainViewComponent$Parent) {
            this.f38951a = (MainViewComponent$Parent) C15521i.a(mainViewComponent$Parent);
            return this;
        }
    }

    private C11996a(C11995a c11995a) {
    }

    /* renamed from: a */
    public static Builder m48039a() {
        return new C11995a();
    }
}
