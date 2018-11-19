package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.C0911f.C0910a;
import com.android.volley.Cache.C0901a;
import com.android.volley.Response.ErrorListener;
import com.tinder.api.ManagerWebServices;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Request<T> implements Comparable<Request<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private static long sCounter;
    private C0901a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private ErrorListener mErrorListener;
    private final C0910a mEventLog;
    private String mIdentifier;
    private final int mMethod;
    private String mRedirectUrl;
    private RequestQueue mRequestQueue;
    private boolean mResponseDelivered;
    private RetryPolicy mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private Object mTag;
    private final String mUrl;

    public interface Method {
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    protected abstract void deliverResponse(T t);

    protected Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    protected String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    protected VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    protected abstract Response<T> parseNetworkResponse(NetworkResponse networkResponse);

    @Deprecated
    public Request(String str, ErrorListener errorListener) {
        this(-1, str, errorListener);
    }

    public Request(int i, String str, ErrorListener errorListener) {
        this.mEventLog = C0910a.f2383a ? new C0910a() : null;
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mIdentifier = createIdentifier(i, str);
        this.mErrorListener = errorListener;
        setRetryPolicy(new C3001b());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Request<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public Object getTag() {
        return this.mTag;
    }

    public ErrorListener getErrorListener() {
        return this.mErrorListener;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    private static int findDefaultTrafficStatsTag(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = Uri.parse(str);
            if (str != null) {
                str = str.getHost();
                if (str != null) {
                    return str.hashCode();
                }
            }
        }
        return null;
    }

    public Request<?> setRetryPolicy(RetryPolicy retryPolicy) {
        this.mRetryPolicy = retryPolicy;
        return this;
    }

    public void addMarker(String str) {
        if (C0910a.f2383a) {
            this.mEventLog.m3054a(str, Thread.currentThread().getId());
        }
    }

    void finish(final String str) {
        if (this.mRequestQueue != null) {
            this.mRequestQueue.m3038b(this);
            onFinish();
        }
        if (C0910a.f2383a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ Request f2342c;

                    public void run() {
                        this.f2342c.mEventLog.m3054a(str, id);
                        this.f2342c.mEventLog.m3053a(toString());
                    }
                });
            } else {
                this.mEventLog.m3054a(str, id);
                this.mEventLog.m3053a(toString());
            }
        }
    }

    protected void onFinish() {
        this.mErrorListener = null;
    }

    public Request<?> setRequestQueue(RequestQueue requestQueue) {
        this.mRequestQueue = requestQueue;
        return this;
    }

    public final Request<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    public final int getSequence() {
        if (this.mSequence != null) {
            return this.mSequence.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public String getUrl() {
        return this.mRedirectUrl != null ? this.mRedirectUrl : this.mUrl;
    }

    public String getOriginUrl() {
        return this.mUrl;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public void setRedirectUrl(String str) {
        this.mRedirectUrl = str;
    }

    public String getCacheKey() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mMethod);
        stringBuilder.append(":");
        stringBuilder.append(this.mUrl);
        return stringBuilder.toString();
    }

    public Request<?> setCacheEntry(C0901a c0901a) {
        this.mCacheEntry = c0901a;
        return this;
    }

    public C0901a getCacheEntry() {
        return this.mCacheEntry;
    }

    public void cancel() {
        this.mCanceled = true;
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.emptyMap();
    }

    @Deprecated
    protected Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public byte[] getPostBody() throws AuthFailureError {
        Map postParams = getPostParams();
        return (postParams == null || postParams.size() <= 0) ? null : encodeParameters(postParams, getPostParamsEncoding());
    }

    public String getBodyContentType() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("application/x-www-form-urlencoded; charset=");
        stringBuilder.append(getParamsEncoding());
        return stringBuilder.toString();
    }

    public byte[] getBody() throws AuthFailureError {
        Map params = getParams();
        return (params == null || params.size() <= 0) ? null : encodeParameters(params, getParamsEncoding());
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Map<String, String> map2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Encoding not supported: ");
            stringBuilder2.append(str);
            throw new RuntimeException(stringBuilder2.toString(), map2);
        }
    }

    public final Request<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public final int getTimeoutMs() {
        return this.mRetryPolicy.getCurrentTimeout();
    }

    public RetryPolicy getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public void markDelivered() {
        this.mResponseDelivered = true;
    }

    public boolean hasHadResponseDelivered() {
        return this.mResponseDelivered;
    }

    public void deliverError(VolleyError volleyError) {
        if (this.mErrorListener != null) {
            this.mErrorListener.onErrorResponse(volleyError);
        }
    }

    public int compareTo(Request<T> request) {
        Priority priority = getPriority();
        Priority priority2 = request.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - request.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x");
        stringBuilder.append(Integer.toHexString(getTrafficStatsTag()));
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.mCanceled ? "[X] " : "[ ] ");
        stringBuilder3.append(getUrl());
        stringBuilder3.append(" ");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(" ");
        stringBuilder3.append(getPriority());
        stringBuilder3.append(" ");
        stringBuilder3.append(this.mSequence);
        return stringBuilder3.toString();
    }

    private static String createIdentifier(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request:");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append(":");
        i = sCounter;
        sCounter = i + 1;
        stringBuilder.append(i);
        return C0907d.m3047a(stringBuilder.toString());
    }
}
