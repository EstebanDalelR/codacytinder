package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

public final class GameRequestContent implements ShareModel {
    public static final Creator<GameRequestContent> CREATOR = new C18431();
    private final ActionType actionType;
    private final String data;
    private final Filters filters;
    private final String message;
    private final String objectId;
    private final List<String> recipients;
    private final List<String> suggestions;
    private final String title;

    /* renamed from: com.facebook.share.model.GameRequestContent$1 */
    static class C18431 implements Creator<GameRequestContent> {
        C18431() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6487a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6488a(i);
        }

        /* renamed from: a */
        public GameRequestContent m6487a(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        /* renamed from: a */
        public GameRequestContent[] m6488a(int i) {
            return new GameRequestContent[i];
        }
    }

    public enum ActionType {
        SEND,
        ASKFOR,
        TURN
    }

    public enum Filters {
        APP_USERS,
        APP_NON_USERS
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    public static class C4220a implements ShareModelBuilder<GameRequestContent, C4220a> {
        /* renamed from: a */
        private String f13480a;
        /* renamed from: b */
        private List<String> f13481b;
        /* renamed from: c */
        private String f13482c;
        /* renamed from: d */
        private String f13483d;
        /* renamed from: e */
        private ActionType f13484e;
        /* renamed from: f */
        private String f13485f;
        /* renamed from: g */
        private Filters f13486g;
        /* renamed from: h */
        private List<String> f13487h;

        public /* synthetic */ Object build() {
            return m16728a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m16725a((GameRequestContent) shareModel);
        }

        /* renamed from: a */
        public C4220a m16726a(String str) {
            this.f13480a = str;
            return this;
        }

        /* renamed from: a */
        public C4220a m16727a(List<String> list) {
            this.f13481b = list;
            return this;
        }

        /* renamed from: b */
        public C4220a m16729b(String str) {
            this.f13482c = str;
            return this;
        }

        /* renamed from: c */
        public C4220a m16731c(String str) {
            this.f13483d = str;
            return this;
        }

        /* renamed from: a */
        public C4220a m16723a(ActionType actionType) {
            this.f13484e = actionType;
            return this;
        }

        /* renamed from: d */
        public C4220a m16732d(String str) {
            this.f13485f = str;
            return this;
        }

        /* renamed from: a */
        public C4220a m16724a(Filters filters) {
            this.f13486g = filters;
            return this;
        }

        /* renamed from: b */
        public C4220a m16730b(List<String> list) {
            this.f13487h = list;
            return this;
        }

        /* renamed from: a */
        public GameRequestContent m16728a() {
            return new GameRequestContent();
        }

        /* renamed from: a */
        public C4220a m16725a(GameRequestContent gameRequestContent) {
            if (gameRequestContent == null) {
                return this;
            }
            return m16726a(gameRequestContent.getMessage()).m16727a(gameRequestContent.getRecipients()).m16731c(gameRequestContent.getTitle()).m16729b(gameRequestContent.getData()).m16723a(gameRequestContent.getActionType()).m16732d(gameRequestContent.getObjectId()).m16724a(gameRequestContent.getFilters()).m16730b(gameRequestContent.getSuggestions());
        }
    }

    public int describeContents() {
        return 0;
    }

    private GameRequestContent(C4220a c4220a) {
        this.message = c4220a.f13480a;
        this.recipients = c4220a.f13481b;
        this.title = c4220a.f13483d;
        this.data = c4220a.f13482c;
        this.actionType = c4220a.f13484e;
        this.objectId = c4220a.f13485f;
        this.filters = c4220a.f13486g;
        this.suggestions = c4220a.f13487h;
    }

    GameRequestContent(Parcel parcel) {
        this.message = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (ActionType) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (Filters) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
        parcel.readStringList(this.suggestions);
    }

    public String getMessage() {
        return this.message;
    }

    public String getTo() {
        return getRecipients() != null ? TextUtils.join(",", getRecipients()) : null;
    }

    public List<String> getRecipients() {
        return this.recipients;
    }

    public String getTitle() {
        return this.title;
    }

    public String getData() {
        return this.data;
    }

    public ActionType getActionType() {
        return this.actionType;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public Filters getFilters() {
        return this.filters;
    }

    public List<String> getSuggestions() {
        return this.suggestions;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.message);
        parcel.writeStringList(this.recipients);
        parcel.writeString(this.title);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.actionType);
        parcel.writeString(this.objectId);
        parcel.writeSerializable(this.filters);
        parcel.writeStringList(this.suggestions);
    }
}
