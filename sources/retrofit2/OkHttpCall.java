package retrofit2;

import android.support.v7.widget.helper.ItemTouchHelper;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.C15958m;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15968t;
import okhttp3.Call;
import okhttp3.Callback;
import okio.BufferedSource;
import okio.C15976k;
import okio.C17704f;
import okio.C18549c;

final class OkHttpCall<T> implements Call<T> {
    @Nullable
    private final Object[] args;
    private volatile boolean canceled;
    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;
    @GuardedBy("this")
    private boolean executed;
    @GuardedBy("this")
    @Nullable
    private Call rawCall;
    private final ServiceMethod<T, ?> serviceMethod;

    static final class ExceptionCatchingRequestBody extends C15968t {
        private final C15968t delegate;
        IOException thrownException;

        ExceptionCatchingRequestBody(C15968t c15968t) {
            this.delegate = c15968t;
        }

        public C15958m contentType() {
            return this.delegate.contentType();
        }

        public long contentLength() {
            return this.delegate.contentLength();
        }

        public BufferedSource source() {
            return C15976k.a(new C17704f(this.delegate.source()) {
                public long read(C18549c c18549c, long j) throws IOException {
                    try {
                        return super.read(c18549c, j);
                    } catch (C18549c c18549c2) {
                        ExceptionCatchingRequestBody.this.thrownException = c18549c2;
                        throw c18549c2;
                    }
                }
            });
        }

        public void close() {
            this.delegate.close();
        }

        void throwIfCaught() throws IOException {
            if (this.thrownException != null) {
                throw this.thrownException;
            }
        }
    }

    static final class NoContentResponseBody extends C15968t {
        private final long contentLength;
        private final C15958m contentType;

        NoContentResponseBody(C15958m c15958m, long j) {
            this.contentType = c15958m;
            this.contentLength = j;
        }

        public C15958m contentType() {
            return this.contentType;
        }

        public long contentLength() {
            return this.contentLength;
        }

        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    OkHttpCall(ServiceMethod<T, ?> serviceMethod, @Nullable Object[] objArr) {
        this.serviceMethod = serviceMethod;
        this.args = objArr;
    }

    public OkHttpCall<T> clone() {
        return new OkHttpCall(this.serviceMethod, this.args);
    }

    public synchronized C15963q request() {
        Call call = this.rawCall;
        if (call != null) {
            return call.request();
        } else if (this.creationFailure == null) {
            try {
                call = createRawCall();
                this.rawCall = call;
                return call.request();
            } catch (Throwable e) {
                this.creationFailure = e;
                throw e;
            } catch (Throwable e2) {
                this.creationFailure = e2;
                throw new RuntimeException("Unable to create request.", e2);
            }
        } else if (this.creationFailure instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.creationFailure);
        } else {
            throw ((RuntimeException) this.creationFailure);
        }
    }

    public void enqueue(final Callback<T> callback) {
        Utils.checkNotNull(callback, "callback == null");
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            Call call = this.rawCall;
            Throwable th = this.creationFailure;
            if (call == null && th == null) {
                try {
                    Call createRawCall = createRawCall();
                    this.rawCall = createRawCall;
                    call = createRawCall;
                } catch (Throwable th2) {
                    th = th2;
                    this.creationFailure = th;
                }
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new Callback() {
            public void onResponse(Call call, C15966s c15966s) throws IOException {
                try {
                    callSuccess(OkHttpCall.this.parseResponse(c15966s));
                } catch (Call call2) {
                    callFailure(call2);
                }
            }

            public void onFailure(Call call, IOException iOException) {
                try {
                    callback.onFailure(OkHttpCall.this, iOException);
                } catch (Call call2) {
                    call2.printStackTrace();
                }
            }

            private void callFailure(Throwable th) {
                try {
                    callback.onFailure(OkHttpCall.this, th);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }

            private void callSuccess(Response<T> response) {
                try {
                    callback.onResponse(OkHttpCall.this, response);
                } catch (Response<T> response2) {
                    response2.printStackTrace();
                }
            }
        });
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> execute() throws IOException {
        Call call;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            if (this.creationFailure == null) {
                call = this.rawCall;
                if (call == null) {
                    try {
                        call = createRawCall();
                        this.rawCall = call;
                    } catch (Throwable e) {
                        this.creationFailure = e;
                        throw e;
                    }
                }
            } else if (this.creationFailure instanceof IOException) {
                throw ((IOException) this.creationFailure);
            } else {
                throw ((RuntimeException) this.creationFailure);
            }
        }
        if (this.canceled) {
            call.cancel();
        }
        return parseResponse(call.execute());
    }

    private Call createRawCall() throws IOException {
        Call newCall = this.serviceMethod.callFactory.newCall(this.serviceMethod.toRequest(this.args));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    Response<T> parseResponse(C15966s c15966s) throws IOException {
        C15968t h = c15966s.h();
        c15966s = c15966s.i().a(new NoContentResponseBody(h.contentType(), h.contentLength())).a();
        int c = c15966s.c();
        if (c >= ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
            if (c < MapboxConstants.ANIMATION_DURATION) {
                if (c != 204) {
                    if (c != 205) {
                        C15968t exceptionCatchingRequestBody = new ExceptionCatchingRequestBody(h);
                        try {
                            return Response.success(this.serviceMethod.toResponse(exceptionCatchingRequestBody), c15966s);
                        } catch (C15966s c15966s2) {
                            exceptionCatchingRequestBody.throwIfCaught();
                            throw c15966s2;
                        }
                    }
                }
                h.close();
                return Response.success(null, c15966s2);
            }
        }
        try {
            c15966s2 = Response.error(Utils.buffer(h), c15966s2);
            return c15966s2;
        } finally {
            h.close();
        }
    }

    public void cancel() {
        this.canceled = true;
        synchronized (this) {
            Call call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            if (this.rawCall == null || !this.rawCall.isCanceled()) {
                z = false;
            }
        }
        return z;
    }
}
