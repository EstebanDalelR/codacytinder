package com.leanplum;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.leanplum.callbacks.InboxChangedCallback;
import com.leanplum.callbacks.InboxSyncedCallback;
import com.leanplum.p069a.C2573a;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aq;
import com.leanplum.p069a.aw;
import com.leanplum.p069a.bo;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LeanplumInbox {
    /* renamed from: a */
    static Set<String> f7842a = null;
    /* renamed from: b */
    static boolean f7843b = true;
    /* renamed from: c */
    private static LeanplumInbox f7844c = new LeanplumInbox();
    /* renamed from: d */
    private int f7845d;
    /* renamed from: e */
    private Map<String, LeanplumInboxMessage> f7846e;
    /* renamed from: f */
    private boolean f7847f;
    /* renamed from: g */
    private final List<InboxChangedCallback> f7848g;
    /* renamed from: h */
    private final List<InboxSyncedCallback> f7849h;
    /* renamed from: i */
    private final Object f7850i;

    private LeanplumInbox() {
        this.f7847f = false;
        this.f7850i = new Object();
        this.f7845d = 0;
        this.f7846e = new HashMap();
        this.f7847f = false;
        this.f7848g = new ArrayList();
        this.f7849h = new ArrayList();
        f7842a = new HashSet();
    }

    public static void disableImagePrefetching() {
        f7843b = false;
    }

    public int count() {
        return this.f7846e.size();
    }

    public int unreadCount() {
        return this.f7845d;
    }

    public List<String> messagesIds() {
        List<String> arrayList = new ArrayList(this.f7846e.keySet());
        try {
            Collections.sort(arrayList, new LeanplumInbox$1(this));
        } catch (Throwable th) {
            bo.m9608a(th);
        }
        return arrayList;
    }

    public List<LeanplumInboxMessage> allMessages() {
        return m9395a(new ArrayList());
    }

    public List<LeanplumInboxMessage> unreadMessages() {
        return m9396b(new ArrayList());
    }

    public LeanplumInboxMessage messageForId(String str) {
        return (LeanplumInboxMessage) this.f7846e.get(str);
    }

    public void addChangedHandler(InboxChangedCallback inboxChangedCallback) {
        synchronized (this.f7848g) {
            this.f7848g.add(inboxChangedCallback);
        }
        if (this.f7847f) {
            inboxChangedCallback.inboxChanged();
        }
    }

    public void removeChangedHandler(InboxChangedCallback inboxChangedCallback) {
        synchronized (this.f7848g) {
            this.f7848g.remove(inboxChangedCallback);
        }
    }

    public void addSyncedHandler(InboxSyncedCallback inboxSyncedCallback) {
        synchronized (this.f7849h) {
            this.f7849h.add(inboxSyncedCallback);
        }
    }

    public void removeSyncedHandler(InboxSyncedCallback inboxSyncedCallback) {
        synchronized (this.f7849h) {
            this.f7849h.remove(inboxSyncedCallback);
        }
    }

    /* renamed from: a */
    static LeanplumInbox m9394a() {
        return f7844c;
    }

    /* renamed from: b */
    static boolean m9397b() {
        return f7843b;
    }

    /* renamed from: a */
    final void m9400a(int i) {
        this.f7845d = i;
        m9399f();
        m9398e();
    }

    /* renamed from: a */
    final void m9402a(Map<String, LeanplumInboxMessage> map, int i, boolean z) {
        try {
            synchronized (this.f7850i) {
                this.f7845d = i;
                if (map != null) {
                    this.f7846e = map;
                }
            }
            this.f7847f = true;
            if (z) {
                m9399f();
            }
            m9398e();
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    /* renamed from: a */
    final void m9401a(String str) {
        int i = this.f7845d;
        LeanplumInboxMessage messageForId = messageForId(str);
        if (!(messageForId == null || messageForId.isRead())) {
            i--;
        }
        this.f7846e.remove(str);
        m9402a(this.f7846e, i, true);
        if (!C2590h.m9712a()) {
            Map hashMap = new HashMap();
            hashMap.put("newsfeedMessageId", str);
            aw.m9544b("deleteNewsfeedMessage", hashMap).m9579h();
        }
    }

    /* renamed from: e */
    private void m9398e() {
        synchronized (this.f7848g) {
            for (InboxChangedCallback a : this.f7848g) {
                aq.m9522a().m9523a(a);
            }
        }
    }

    /* renamed from: a */
    final void m9403a(boolean z) {
        synchronized (this.f7848g) {
            for (InboxSyncedCallback inboxSyncedCallback : this.f7849h) {
                inboxSyncedCallback.setSuccess(z);
                aq.m9522a().m9523a(inboxSyncedCallback);
            }
        }
    }

    /* renamed from: c */
    final void m9404c() {
        if (!C2590h.m9712a()) {
            SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences("__leanplum__", 0);
            if (aw.m9530a() == null) {
                m9402a(new HashMap(), 0, false);
                return;
            }
            int i;
            String a = new C2573a(aw.m9560e(), aw.m9530a()).m9448a(sharedPreferences, "__leanplum_newsfeed", "{}");
            Map a2 = ab.m9452a(a);
            Map hashMap = new HashMap();
            if (a2 == null) {
                Object[] objArr = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Could not parse newsfeed string: ");
                stringBuilder.append(a);
                objArr[0] = stringBuilder.toString();
                ao.m9516a(objArr);
                i = 0;
            } else {
                i = 0;
                for (Entry entry : a2.entrySet()) {
                    String str = (String) entry.getKey();
                    LeanplumInboxMessage a3 = LeanplumInboxMessage.a(str, (Map) entry.getValue());
                    if (a3 != null && a3.c()) {
                        hashMap.put(str, a3);
                        if (!a3.isRead()) {
                            i++;
                        }
                    }
                }
            }
            m9402a(hashMap, i, false);
        }
    }

    /* renamed from: f */
    private void m9399f() {
        if (!C2590h.m9712a() && aw.m9530a() != null) {
            Editor edit = Leanplum.getContext().getSharedPreferences("__leanplum__", 0).edit();
            Map hashMap = new HashMap();
            for (Entry entry : this.f7846e.entrySet()) {
                hashMap.put((String) entry.getKey(), ((LeanplumInboxMessage) entry.getValue()).b());
            }
            String a = ab.m9450a(hashMap);
            edit.putString("__leanplum_newsfeed", new C2573a(aw.m9560e(), aw.m9530a()).m9449a(a));
            SharedPreferencesUtil.commitChanges(edit);
        }
    }

    /* renamed from: d */
    final void m9405d() {
        if (!C2590h.m9712a()) {
            aw b = aw.m9544b("getNewsfeedMessages", null);
            b.m9575a(new LeanplumInbox$2(this));
            b.m9574a(new LeanplumInbox$3(this));
            b.m9581j();
        }
    }

    /* renamed from: a */
    private List<LeanplumInboxMessage> m9395a(List<LeanplumInboxMessage> list) {
        if (list == null) {
            list = new ArrayList();
        }
        try {
            for (String messageForId : messagesIds()) {
                list.add(messageForId(messageForId));
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
        return list;
    }

    /* renamed from: b */
    private List<LeanplumInboxMessage> m9396b(List<LeanplumInboxMessage> list) {
        for (LeanplumInboxMessage leanplumInboxMessage : m9395a(null)) {
            if (!leanplumInboxMessage.isRead()) {
                list.add(leanplumInboxMessage);
            }
        }
        return list;
    }
}
