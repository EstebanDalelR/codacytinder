package com.google.android.m4b.maps.ac;

/* renamed from: com.google.android.m4b.maps.ac.c */
final class C4596c {

    /* renamed from: com.google.android.m4b.maps.ac.c$a */
    interface C4594a {
        /* renamed from: a */
        void mo4841a();

        /* renamed from: a */
        void mo4842a(byte b);
    }

    /* renamed from: com.google.android.m4b.maps.ac.c$b */
    interface C4595b {
        /* renamed from: a */
        void mo4846a(char c);
    }

    /* renamed from: com.google.android.m4b.maps.ac.c$1 */
    static class C63761 implements C4595b {
        /* renamed from: a */
        private /* synthetic */ StringBuilder f23706a;

        C63761(StringBuilder stringBuilder) {
            this.f23706a = stringBuilder;
        }

        /* renamed from: a */
        public final void mo4846a(char c) {
            this.f23706a.append(c);
        }

        public final String toString() {
            return this.f23706a.toString();
        }
    }
}
