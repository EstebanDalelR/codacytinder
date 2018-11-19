package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.C17703e;
import okio.C18549c;
import okio.Sink;

/* renamed from: com.squareup.okhttp.internal.c */
class C7944c extends C17703e {
    /* renamed from: a */
    private boolean f28546a;

    /* renamed from: a */
    protected void mo7612a(IOException iOException) {
    }

    public C7944c(Sink sink) {
        super(sink);
    }

    public void write(C18549c c18549c, long j) throws IOException {
        if (this.f28546a) {
            c18549c.skip(j);
            return;
        }
        try {
            super.write(c18549c, j);
        } catch (C18549c c18549c2) {
            this.f28546a = 1;
            mo7612a(c18549c2);
        }
    }

    public void flush() throws IOException {
        if (!this.f28546a) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f28546a = true;
                mo7612a(e);
            }
        }
    }

    public void close() throws IOException {
        if (!this.f28546a) {
            try {
                super.close();
            } catch (IOException e) {
                this.f28546a = true;
                mo7612a(e);
            }
        }
    }
}
