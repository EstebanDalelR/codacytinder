package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.C15630n;
import io.fabric.sdk.android.services.concurrency.C17337a;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: io.fabric.sdk.android.f */
class C18330f<Result> extends C17337a<Void, Void, Result> {
    /* renamed from: a */
    final C15611g<Result> f56797a;

    public C18330f(C15611g<Result> c15611g) {
        this.f56797a = c15611g;
    }

    /* renamed from: a */
    protected void mo13550a() {
        super.mo13550a();
        C15630n a = m66360a("onPreExecute");
        try {
            boolean onPreExecute = this.f56797a.onPreExecute();
            a.m58708b();
            if (onPreExecute) {
                return;
            }
        } catch (UnmetDependencyException e) {
            throw e;
        } catch (Throwable e2) {
            C15608c.m58560h().mo12794e("Fabric", "Failure onPreExecute()", e2);
            a.m58708b();
        } catch (Throwable th) {
            a.m58708b();
            m58721a(true);
        }
        m58721a(true);
    }

    /* renamed from: a */
    protected Result m66362a(Void... voidArr) {
        voidArr = m66360a("doInBackground");
        Result doInBackground = !m58726d() ? this.f56797a.doInBackground() : null;
        voidArr.m58708b();
        return doInBackground;
    }

    /* renamed from: a */
    protected void mo13551a(Result result) {
        this.f56797a.onPostExecute(result);
        this.f56797a.initializationCallback.success(result);
    }

    /* renamed from: b */
    protected void mo13552b(Result result) {
        this.f56797a.onCancelled(result);
        result = new StringBuilder();
        result.append(this.f56797a.getIdentifier());
        result.append(" Initialization was cancelled");
        this.f56797a.initializationCallback.failure(new InitializationException(result.toString()));
    }

    public Priority getPriority() {
        return Priority.HIGH;
    }

    /* renamed from: a */
    private C15630n m66360a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f56797a.getIdentifier());
        stringBuilder.append(".");
        stringBuilder.append(str);
        C15630n c15630n = new C15630n(stringBuilder.toString(), "KitInitialization");
        c15630n.m58707a();
        return c15630n;
    }
}
