package io.branch.referral.util;

import android.content.Context;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch;
import io.branch.referral.C15601z;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import io.branch.referral.ServerRequest;
import io.branch.referral.ServerRequest.BRANCH_API_VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.branch.referral.util.a */
public class C15599a {
    /* renamed from: a */
    private final String f48270a;
    /* renamed from: b */
    private final boolean f48271b;
    /* renamed from: c */
    private final JSONObject f48272c;
    /* renamed from: d */
    private final JSONObject f48273d;
    /* renamed from: e */
    private final List<BranchUniversalObject> f48274e;

    /* renamed from: io.branch.referral.util.a$a */
    private class C17317a extends ServerRequest {
        /* renamed from: g */
        final /* synthetic */ C15599a f53020g;

        /* renamed from: a */
        public void mo12769a(int i, String str) {
        }

        /* renamed from: a */
        public void mo12770a(C15601z c15601z, Branch branch) {
        }

        /* renamed from: a */
        public boolean mo12771a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo12772a(Context context) {
            return false;
        }

        /* renamed from: b */
        public void mo12773b() {
        }

        /* renamed from: c */
        public boolean mo12774c() {
            return true;
        }

        /* renamed from: e */
        protected boolean mo12784e() {
            return true;
        }

        /* renamed from: i */
        public boolean mo12785i() {
            return true;
        }

        C17317a(C15599a c15599a, Context context, String str) {
            this.f53020g = c15599a;
            super(context, str);
            str = new JSONObject();
            try {
                str.put(Jsonkey.Name.getKey(), c15599a.f48270a);
                if (c15599a.f48273d.length() > 0) {
                    str.put(Jsonkey.CustomData.getKey(), c15599a.f48273d);
                }
                if (c15599a.f48272c.length() > 0) {
                    str.put(Jsonkey.EventData.getKey(), c15599a.f48272c);
                }
                if (c15599a.f48271b && c15599a.f48274e.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    str.put(Jsonkey.ContentItems.getKey(), jSONArray);
                    for (BranchUniversalObject convertToJson : c15599a.f48274e) {
                        jSONArray.put(convertToJson.convertToJson());
                    }
                }
                mo12783a((JSONObject) str);
            } catch (C15599a c15599a2) {
                c15599a2.printStackTrace();
            }
            m58232a(context, (JSONObject) str);
        }

        /* renamed from: r */
        public BRANCH_API_VERSION mo12788r() {
            return BRANCH_API_VERSION.V2;
        }
    }

    public C15599a(BRANCH_STANDARD_EVENT branch_standard_event) {
        this(branch_standard_event.getName(), true);
    }

    private C15599a(String str, boolean z) {
        this.f48272c = new JSONObject();
        this.f48273d = new JSONObject();
        this.f48270a = str;
        this.f48271b = z;
        this.f48274e = new ArrayList();
    }

    /* renamed from: a */
    public C15599a m58506a(BranchUniversalObject... branchUniversalObjectArr) {
        Collections.addAll(this.f48274e, branchUniversalObjectArr);
        return this;
    }

    /* renamed from: a */
    public boolean m58507a(Context context) {
        String path = (this.f48271b ? RequestPath.TrackStandardEvent : RequestPath.TrackCustomEvent).getPath();
        if (Branch.b() == null) {
            return null;
        }
        Branch.b().a(new C17317a(this, context, path));
        return true;
    }
}
