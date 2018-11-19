package io.branch.referral;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import io.branch.referral.Defines.Jsonkey;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

class Branch$b extends C15582d<Void, Void, C15601z> {
    /* renamed from: a */
    ServerRequest f52974a;
    /* renamed from: b */
    final /* synthetic */ Branch f52975b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m63265a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m63266a((C15601z) obj);
    }

    public Branch$b(Branch branch, ServerRequest serverRequest) {
        this.f52975b = branch;
        this.f52974a = serverRequest;
    }

    protected void onPreExecute() {
        super.onPreExecute();
        this.f52974a.mo12786q();
        this.f52974a.m58250l();
    }

    /* renamed from: a */
    protected C15601z m63265a(Void... voidArr) {
        voidArr = this.f52975b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f52974a.m58244f());
        stringBuilder.append("-");
        stringBuilder.append(Jsonkey.Queue_Wait_Time.getKey());
        voidArr.a(stringBuilder.toString(), String.valueOf(this.f52974a.m58253o()));
        this.f52974a.m58251m();
        if (this.f52975b.a() != null && this.f52974a.mo12787t() == null) {
            return new C15601z(this.f52974a.m58244f(), -117);
        }
        if (this.f52974a.mo12771a() != null) {
            return Branch.h(this.f52975b).m58475a(this.f52974a.mo12782g(), this.f52974a.m58248j(), this.f52974a.m58244f(), Branch.a(this.f52975b).m58425f());
        }
        return Branch.h(this.f52975b).m58476a(this.f52974a.m58230a(Branch.i(this.f52975b)), this.f52974a.mo12782g(), this.f52974a.m58244f(), Branch.a(this.f52975b).m58425f());
    }

    /* renamed from: a */
    protected void m63266a(C15601z c15601z) {
        super.onPostExecute(c15601z);
        if (c15601z != null) {
            try {
                int a = c15601z.m58526a();
                Branch.b(this.f52975b, true);
                if (c15601z.m58526a() == -117) {
                    this.f52974a.m58257s();
                    Branch.b(this.f52975b).m58491b(this.f52974a);
                } else if (a != Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                    if (this.f52974a instanceof C17315s) {
                        Branch.a(this.f52975b, Branch$SESSION_STATE.UNINITIALISED);
                    }
                    if (a == 409) {
                        Branch.b(this.f52975b).m58491b(this.f52974a);
                        if ((this.f52974a instanceof C17311o) != null) {
                            ((C17311o) this.f52974a).mo12781x();
                        } else {
                            Log.i("BranchSDK", "Branch API Error: Conflicting resource error code from API");
                            Branch.a(this.f52975b, 0, a);
                        }
                    } else {
                        Branch.b(this.f52975b, false);
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < Branch.b(this.f52975b).m58483a(); i++) {
                            arrayList.add(Branch.b(this.f52975b).m58484a(i));
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ServerRequest serverRequest = (ServerRequest) it.next();
                            if (serverRequest == null || !serverRequest.mo12774c()) {
                                Branch.b(this.f52975b).m58491b(serverRequest);
                            }
                        }
                        Branch.a(this.f52975b, 0);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ServerRequest serverRequest2 = (ServerRequest) it2.next();
                            if (serverRequest2 != null) {
                                serverRequest2.mo12769a(a, c15601z.m58530d());
                                if (serverRequest2.mo12774c()) {
                                    serverRequest2.mo12773b();
                                }
                            }
                        }
                    }
                } else {
                    Branch.b(this.f52975b, true);
                    if (this.f52974a instanceof C17311o) {
                        if (c15601z.m58528b() != null) {
                            Branch.j(this.f52975b).put(((C17311o) this.f52974a).mo12778u(), c15601z.m58528b().getString("url"));
                        }
                    } else if (this.f52974a instanceof C17316t) {
                        Branch.j(this.f52975b).clear();
                        Branch.b(this.f52975b).m58493d();
                    }
                    Branch.b(this.f52975b).m58490b();
                    if (!(this.f52974a instanceof C17315s)) {
                        if (!(this.f52974a instanceof C17314r)) {
                            this.f52974a.mo12770a(c15601z, Branch.k());
                        }
                    }
                    JSONObject b = c15601z.m58528b();
                    if (b != null) {
                        Object obj;
                        if (this.f52975b.a()) {
                            obj = null;
                        } else {
                            if (b.has(Jsonkey.SessionID.getKey())) {
                                Branch.a(this.f52975b).m58421d(b.getString(Jsonkey.SessionID.getKey()));
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (b.has(Jsonkey.IdentityID.getKey())) {
                                if (!Branch.a(this.f52975b).m58431i().equals(b.getString(Jsonkey.IdentityID.getKey()))) {
                                    Branch.j(this.f52975b).clear();
                                    Branch.a(this.f52975b).m58423e(b.getString(Jsonkey.IdentityID.getKey()));
                                    obj = 1;
                                }
                            }
                            if (b.has(Jsonkey.DeviceFingerprintID.getKey())) {
                                Branch.a(this.f52975b).m58417c(b.getString(Jsonkey.DeviceFingerprintID.getKey()));
                                obj = 1;
                            }
                        }
                        if (obj != null) {
                            Branch.k(this.f52975b);
                        }
                        if (this.f52974a instanceof C17315s) {
                            Branch.a(this.f52975b, Branch$SESSION_STATE.INITIALISED);
                            this.f52974a.mo12770a(c15601z, Branch.k());
                            if (!this.f52975b.f12590f && ((C17315s) this.f52974a).m63331a(c15601z) == null) {
                                Branch.l(this.f52975b);
                            }
                            if (((C17315s) this.f52974a).mo12779v() != null) {
                                this.f52975b.f12590f = true;
                            }
                            if (Branch.m(this.f52975b) != null) {
                                Branch.m(this.f52975b).countDown();
                            }
                            if (Branch.n(this.f52975b) != null) {
                                Branch.n(this.f52975b).countDown();
                            }
                        } else {
                            this.f52974a.mo12770a(c15601z, Branch.k());
                        }
                    }
                }
                Branch.a(this.f52975b, 0);
                if (Branch.o(this.f52975b) != null && Branch.e(this.f52975b) != Branch$SESSION_STATE.UNINITIALISED) {
                    Branch.c(this.f52975b);
                }
            } catch (C15601z c15601z2) {
                c15601z2.printStackTrace();
            }
        }
    }
}
