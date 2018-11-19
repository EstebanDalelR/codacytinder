package io.branch.referral;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import io.branch.referral.Defines.RequestPath;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.branch.referral.u */
class C15596u {
    /* renamed from: a */
    private static C15596u f48265a;
    /* renamed from: e */
    private static final Object f48266e = new Object();
    /* renamed from: b */
    private SharedPreferences f48267b;
    /* renamed from: c */
    private Editor f48268c = this.f48267b.edit();
    /* renamed from: d */
    private final List<ServerRequest> f48269d;

    /* renamed from: io.branch.referral.u$1 */
    class C155951 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C15596u f48264a;

        C155951(C15596u c15596u) {
            this.f48264a = c15596u;
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = io.branch.referral.C15596u.f48266e;
            monitor-enter(r0);
            r1 = new org.json.JSONArray;	 Catch:{ all -> 0x008a }
            r1.<init>();	 Catch:{ all -> 0x008a }
            r2 = r6.f48264a;	 Catch:{ all -> 0x008a }
            r2 = r2.f48269d;	 Catch:{ all -> 0x008a }
            r2 = r2.iterator();	 Catch:{ all -> 0x008a }
        L_0x0014:
            r3 = r2.hasNext();	 Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0030;	 Catch:{ all -> 0x008a }
        L_0x001a:
            r3 = r2.next();	 Catch:{ all -> 0x008a }
            r3 = (io.branch.referral.ServerRequest) r3;	 Catch:{ all -> 0x008a }
            r4 = r3.mo12777d();	 Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0014;	 Catch:{ all -> 0x008a }
        L_0x0026:
            r3 = r3.m58249k();	 Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0014;	 Catch:{ all -> 0x008a }
        L_0x002c:
            r1.put(r3);	 Catch:{ all -> 0x008a }
            goto L_0x0014;
        L_0x0030:
            r2 = r6.f48264a;	 Catch:{ Exception -> 0x0046 }
            r2 = r2.f48268c;	 Catch:{ Exception -> 0x0046 }
            r3 = "BNCServerRequestQueue";	 Catch:{ Exception -> 0x0046 }
            r4 = r1.toString();	 Catch:{ Exception -> 0x0046 }
            r2 = r2.putString(r3, r4);	 Catch:{ Exception -> 0x0046 }
            r2.commit();	 Catch:{ Exception -> 0x0046 }
            goto L_0x0074;
        L_0x0044:
            r2 = move-exception;
            goto L_0x0076;
        L_0x0046:
            r2 = move-exception;
            r3 = "Persisting Queue: ";	 Catch:{ all -> 0x0044 }
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0044 }
            r4.<init>();	 Catch:{ all -> 0x0044 }
            r5 = "Failed to persit queue ";	 Catch:{ all -> 0x0044 }
            r4.append(r5);	 Catch:{ all -> 0x0044 }
            r2 = r2.getMessage();	 Catch:{ all -> 0x0044 }
            r4.append(r2);	 Catch:{ all -> 0x0044 }
            r2 = r4.toString();	 Catch:{ all -> 0x0044 }
            io.branch.referral.C15593m.m58390b(r3, r2);	 Catch:{ all -> 0x0044 }
            r2 = r6.f48264a;	 Catch:{ Exception -> 0x0074 }
            r2 = r2.f48268c;	 Catch:{ Exception -> 0x0074 }
            r3 = "BNCServerRequestQueue";	 Catch:{ Exception -> 0x0074 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x0074 }
            r1 = r2.putString(r3, r1);	 Catch:{ Exception -> 0x0074 }
            r1.commit();	 Catch:{ Exception -> 0x0074 }
        L_0x0074:
            monitor-exit(r0);	 Catch:{ all -> 0x008a }
            return;
        L_0x0076:
            r3 = r6.f48264a;	 Catch:{ Exception -> 0x0089 }
            r3 = r3.f48268c;	 Catch:{ Exception -> 0x0089 }
            r4 = "BNCServerRequestQueue";	 Catch:{ Exception -> 0x0089 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x0089 }
            r1 = r3.putString(r4, r1);	 Catch:{ Exception -> 0x0089 }
            r1.commit();	 Catch:{ Exception -> 0x0089 }
        L_0x0089:
            throw r2;	 Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception;	 Catch:{ all -> 0x008a }
            monitor-exit(r0);	 Catch:{ all -> 0x008a }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.1.run():void");
        }
    }

    /* renamed from: a */
    public static C15596u m58477a(Context context) {
        if (f48265a == null) {
            synchronized (C15596u.class) {
                if (f48265a == null) {
                    f48265a = new C15596u(context);
                }
            }
        }
        return f48265a;
    }

    @SuppressLint({"CommitPrefEdits"})
    private C15596u(Context context) {
        this.f48267b = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.f48269d = m58480b(context);
    }

    /* renamed from: i */
    private void m58482i() {
        new Thread(new C155951(this)).start();
    }

    /* renamed from: b */
    private java.util.List<io.branch.referral.ServerRequest> m58480b(android.content.Context r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.f48267b;
        r1 = "BNCServerRequestQueue";
        r2 = 0;
        r0 = r0.getString(r1, r2);
        r1 = new java.util.LinkedList;
        r1.<init>();
        r1 = java.util.Collections.synchronizedList(r1);
        r2 = f48266e;
        monitor-enter(r2);
        if (r0 == 0) goto L_0x003b;
    L_0x0017:
        r3 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x003b }
        r3.<init>(r0);	 Catch:{ JSONException -> 0x003b }
        r0 = 0;	 Catch:{ JSONException -> 0x003b }
        r4 = r3.length();	 Catch:{ JSONException -> 0x003b }
        r5 = 25;	 Catch:{ JSONException -> 0x003b }
        r4 = java.lang.Math.min(r4, r5);	 Catch:{ JSONException -> 0x003b }
    L_0x0027:
        if (r0 >= r4) goto L_0x003b;	 Catch:{ JSONException -> 0x003b }
    L_0x0029:
        r5 = r3.getJSONObject(r0);	 Catch:{ JSONException -> 0x003b }
        r5 = io.branch.referral.ServerRequest.m58224a(r5, r7);	 Catch:{ JSONException -> 0x003b }
        if (r5 == 0) goto L_0x0036;	 Catch:{ JSONException -> 0x003b }
    L_0x0033:
        r1.add(r5);	 Catch:{ JSONException -> 0x003b }
    L_0x0036:
        r0 = r0 + 1;
        goto L_0x0027;
    L_0x0039:
        r7 = move-exception;
        goto L_0x003d;
    L_0x003b:
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        return r1;	 Catch:{ all -> 0x0039 }
    L_0x003d:
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.b(android.content.Context):java.util.List<io.branch.referral.ServerRequest>");
    }

    /* renamed from: a */
    public int m58483a() {
        int size;
        synchronized (f48266e) {
            size = this.f48269d.size();
        }
        return size;
    }

    /* renamed from: a */
    void m58487a(ServerRequest serverRequest) {
        synchronized (f48266e) {
            if (serverRequest != null) {
                this.f48269d.add(serverRequest);
                if (m58483a() >= 25) {
                    this.f48269d.remove(1);
                }
                m58482i();
            }
        }
    }

    /* renamed from: b */
    io.branch.referral.ServerRequest m58490b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = f48266e;
        monitor-enter(r0);
        r1 = 0;
        r2 = r4.f48269d;	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r3 = 0;	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r2 = r2.remove(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r2 = (io.branch.referral.ServerRequest) r2;	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r4.m58482i();	 Catch:{ IndexOutOfBoundsException -> 0x0014, IndexOutOfBoundsException -> 0x0014 }
        goto L_0x0014;
    L_0x0011:
        r1 = move-exception;
        goto L_0x0016;
    L_0x0013:
        r2 = r1;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0011 }
        return r2;	 Catch:{ all -> 0x0011 }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0011 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.b():io.branch.referral.ServerRequest");
    }

    /* renamed from: c */
    io.branch.referral.ServerRequest m58492c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = f48266e;
        monitor-enter(r0);
        r1 = r3.f48269d;	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        r2 = 0;	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        r1 = r1.get(r2);	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        r1 = (io.branch.referral.ServerRequest) r1;	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        goto L_0x0010;
    L_0x000d:
        r1 = move-exception;
        goto L_0x0012;
    L_0x000f:
        r1 = 0;
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x000d }
        return r1;	 Catch:{ all -> 0x000d }
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x000d }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.c():io.branch.referral.ServerRequest");
    }

    /* renamed from: a */
    io.branch.referral.ServerRequest m58484a(int r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = f48266e;
        monitor-enter(r0);
        r1 = r2.f48269d;	 Catch:{ IndexOutOfBoundsException -> 0x000e, IndexOutOfBoundsException -> 0x000e }
        r3 = r1.get(r3);	 Catch:{ IndexOutOfBoundsException -> 0x000e, IndexOutOfBoundsException -> 0x000e }
        r3 = (io.branch.referral.ServerRequest) r3;	 Catch:{ IndexOutOfBoundsException -> 0x000e, IndexOutOfBoundsException -> 0x000e }
        goto L_0x000f;
    L_0x000c:
        r3 = move-exception;
        goto L_0x0011;
    L_0x000e:
        r3 = 0;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        return r3;	 Catch:{ all -> 0x000c }
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.a(int):io.branch.referral.ServerRequest");
    }

    /* renamed from: a */
    void m58488a(io.branch.referral.ServerRequest r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = f48266e;
        monitor-enter(r0);
        r1 = r2.f48269d;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r1 = r1.size();	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        if (r1 >= r4) goto L_0x0011;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
    L_0x000b:
        r4 = r2.f48269d;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r4 = r4.size();	 Catch:{ IndexOutOfBoundsException -> 0x001c }
    L_0x0011:
        r1 = r2.f48269d;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r1.add(r4, r3);	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r2.m58482i();	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        goto L_0x001c;
    L_0x001a:
        r3 = move-exception;
        goto L_0x001e;
    L_0x001c:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return;	 Catch:{ all -> 0x001a }
    L_0x001e:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.a(io.branch.referral.ServerRequest, int):void");
    }

    /* renamed from: b */
    public boolean m58491b(io.branch.referral.ServerRequest r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = f48266e;
        monitor-enter(r0);
        r1 = 0;
        r2 = r3.f48269d;	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r4 = r2.remove(r4);	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r3.m58482i();	 Catch:{ UnsupportedOperationException -> 0x0011 }
        goto L_0x0011;
    L_0x000e:
        r4 = move-exception;
        goto L_0x0013;
    L_0x0010:
        r4 = 0;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        return r4;	 Catch:{ all -> 0x000e }
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.b(io.branch.referral.ServerRequest):boolean");
    }

    /* renamed from: d */
    void m58493d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = f48266e;
        monitor-enter(r0);
        r1 = r2.f48269d;	 Catch:{ UnsupportedOperationException -> 0x000e }
        r1.clear();	 Catch:{ UnsupportedOperationException -> 0x000e }
        r2.m58482i();	 Catch:{ UnsupportedOperationException -> 0x000e }
        goto L_0x000e;
    L_0x000c:
        r1 = move-exception;
        goto L_0x0010;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        return;	 Catch:{ all -> 0x000c }
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.u.d():void");
    }

    /* renamed from: e */
    boolean m58494e() {
        synchronized (f48266e) {
            for (ServerRequest serverRequest : this.f48269d) {
                if (serverRequest != null && serverRequest.m58244f().equals(RequestPath.RegisterClose.getPath())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    boolean m58495f() {
        synchronized (f48266e) {
            for (ServerRequest serverRequest : this.f48269d) {
                if (serverRequest != null && ((serverRequest instanceof C18328x) || (serverRequest instanceof C18329y))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    void m58489a(ServerRequest serverRequest, int i, Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        synchronized (f48266e) {
            Iterator it = this.f48269d.iterator();
            while (it.hasNext()) {
                ServerRequest serverRequest2 = (ServerRequest) it.next();
                if (serverRequest2 != null && ((serverRequest2 instanceof C18328x) || (serverRequest2 instanceof C18329y))) {
                    it.remove();
                    break;
                }
            }
        }
        m58488a(serverRequest, i == 0 ? 0 : 1);
    }

    /* renamed from: a */
    void m58485a(Branch$BranchReferralInitListener branch$BranchReferralInitListener) {
        synchronized (f48266e) {
            for (ServerRequest serverRequest : this.f48269d) {
                if (serverRequest != null) {
                    if (serverRequest instanceof C18328x) {
                        ((C18328x) serverRequest).m66344a(branch$BranchReferralInitListener);
                    } else if (serverRequest instanceof C18329y) {
                        ((C18329y) serverRequest).m66353a(branch$BranchReferralInitListener);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    void m58486a(PROCESS_WAIT_LOCK process_wait_lock) {
        synchronized (f48266e) {
            for (ServerRequest serverRequest : this.f48269d) {
                if (serverRequest != null) {
                    serverRequest.m58239b(process_wait_lock);
                }
            }
        }
    }

    /* renamed from: g */
    void m58496g() {
        synchronized (f48266e) {
            for (ServerRequest serverRequest : this.f48269d) {
                if (serverRequest != null && (serverRequest instanceof C17315s)) {
                    serverRequest.m58233a(PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                }
            }
        }
    }
}
