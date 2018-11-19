package io.branch.referral;

import android.os.AsyncTask;
import io.branch.referral.Defines.RequestPath;
import io.branch.referral.network.BranchRemoteInterface;
import org.json.JSONObject;

class Branch$d extends AsyncTask<ServerRequest, Void, C15601z> {
    /* renamed from: a */
    final /* synthetic */ Branch f48103a;

    private Branch$d(Branch branch) {
        this.f48103a = branch;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m58178a((ServerRequest[]) objArr);
    }

    /* renamed from: a */
    protected C15601z m58178a(ServerRequest... serverRequestArr) {
        BranchRemoteInterface h = Branch.h(this.f48103a);
        JSONObject h2 = serverRequestArr[0].m58246h();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Branch.a(this.f48103a).m58402a());
        stringBuilder.append("v1/url");
        return h.m58476a(h2, stringBuilder.toString(), RequestPath.GetURL.getPath(), Branch.a(this.f48103a).m58425f());
    }
}
