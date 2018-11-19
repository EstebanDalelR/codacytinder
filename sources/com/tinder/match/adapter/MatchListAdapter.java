package com.tinder.match.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.util.C0559j;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.match.p293e.C12051b;
import com.tinder.match.viewmodel.C12099h;
import com.tinder.match.viewmodel.MatchListItem;
import com.tinder.match.views.MatchMessagesRowView;
import com.tinder.match.views.NewMatchesView;
import com.tinder.utils.RxUtils;
import java.util.ArrayList;
import java.util.List;
import rx.Single;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

public class MatchListAdapter extends Adapter<ViewHolder> {
    /* renamed from: a */
    private final List<MatchListItem> f39140a = new ArrayList();
    @Nullable
    /* renamed from: b */
    private Subscription f39141b;

    static class EmptyMessageListViewHolder extends ViewHolder {
        @BindString(2131821124)
        String getSwiping;
        @BindString(2131822142)
        String noMatches;
        @BindString(2131821375)
        String noMessages;
        @BindView(2131362961)
        TextView placeHolderSummary;
        @BindView(2131362959)
        TextView placeholderHeader;
        @BindView(2131362960)
        ImageView placeholderImage;
        @BindString(2131821803)
        String sayHello;

        EmptyMessageListViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }

        /* renamed from: a */
        void m48124a() {
            this.placeholderImage.setBackgroundResource(R.drawable.no_matches_placeholder);
            this.placeholderHeader.setText(this.getSwiping);
            this.placeHolderSummary.setText(this.noMatches);
        }

        /* renamed from: b */
        void m48125b() {
            this.placeholderImage.setBackgroundResource(R.drawable.message_placeholder);
            this.placeholderHeader.setText(this.sayHello);
            this.placeHolderSummary.setText(this.noMessages);
        }
    }

    public class EmptyMessageListViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private EmptyMessageListViewHolder f39137b;

        @UiThread
        public EmptyMessageListViewHolder_ViewBinding(EmptyMessageListViewHolder emptyMessageListViewHolder, View view) {
            this.f39137b = emptyMessageListViewHolder;
            emptyMessageListViewHolder.placeholderImage = (ImageView) C0761c.b(view, R.id.message_placeholder_logo, "field 'placeholderImage'", ImageView.class);
            emptyMessageListViewHolder.placeholderHeader = (TextView) C0761c.b(view, R.id.message_placeholder_header, "field 'placeholderHeader'", TextView.class);
            emptyMessageListViewHolder.placeHolderSummary = (TextView) C0761c.b(view, R.id.message_placeholder_summary, "field 'placeHolderSummary'", TextView.class);
            view = view.getContext().getResources();
            emptyMessageListViewHolder.getSwiping = view.getString(R.string.get_swiping);
            emptyMessageListViewHolder.sayHello = view.getString(R.string.say_hello);
            emptyMessageListViewHolder.noMatches = view.getString(R.string.you_have_no_matches);
            emptyMessageListViewHolder.noMessages = view.getString(R.string.match_list_chat);
        }

        @CallSuper
        public void unbind() {
            EmptyMessageListViewHolder emptyMessageListViewHolder = this.f39137b;
            if (emptyMessageListViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f39137b = null;
            emptyMessageListViewHolder.placeholderImage = null;
            emptyMessageListViewHolder.placeholderHeader = null;
            emptyMessageListViewHolder.placeHolderSummary = null;
        }
    }

    static class MatchesMessagesHeaderViewHolder extends ViewHolder {
        @BindView(2131362925)
        TextView messagesCount;

        MatchesMessagesHeaderViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
            view.setVisibility(0);
        }

        /* renamed from: a */
        void m48126a(@Nullable String str) {
            if (TextUtils.isEmpty(str)) {
                this.messagesCount.setVisibility(8);
                return;
            }
            this.messagesCount.setVisibility(0);
            this.messagesCount.setText(str);
        }
    }

    public class MatchesMessagesHeaderViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private MatchesMessagesHeaderViewHolder f39138b;

        @UiThread
        public MatchesMessagesHeaderViewHolder_ViewBinding(MatchesMessagesHeaderViewHolder matchesMessagesHeaderViewHolder, View view) {
            this.f39138b = matchesMessagesHeaderViewHolder;
            matchesMessagesHeaderViewHolder.messagesCount = (TextView) C0761c.b(view, R.id.matches_count, "field 'messagesCount'", TextView.class);
        }

        @CallSuper
        public void unbind() {
            MatchesMessagesHeaderViewHolder matchesMessagesHeaderViewHolder = this.f39138b;
            if (matchesMessagesHeaderViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f39138b = null;
            matchesMessagesHeaderViewHolder.messagesCount = null;
        }
    }

    /* renamed from: com.tinder.match.adapter.MatchListAdapter$a */
    private static class C12032a extends ViewHolder {
        /* renamed from: a */
        private MatchMessagesRowView f39139a;

        C12032a(View view) {
            super(view);
            this.f39139a = (MatchMessagesRowView) view;
        }
    }

    /* renamed from: com.tinder.match.adapter.MatchListAdapter$b */
    private static class C12033b extends ViewHolder {
        C12033b(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m48130a(C0559j c0559j) {
        m48128b(c0559j);
    }

    /* renamed from: a */
    public void m48131a(List<MatchListItem> list) {
        RxUtils.b(this.f39141b);
        this.f39141b = m48129c(list).b(Schedulers.computation()).a(C19397a.a()).a(new C14053a(this), C14054b.f44565a);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        RxUtils.b(this.f39141b);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 1:
                return new C12033b(new NewMatchesView(viewGroup.getContext()));
            case 2:
                return new C12032a(new MatchMessagesRowView(viewGroup.getContext()));
            case 3:
                i = new EmptyMessageListViewHolder(from.inflate(R.layout.empty_matches_message_view, viewGroup, false));
                i.m48125b();
                return i;
            case 4:
                return new MatchesMessagesHeaderViewHolder(from.inflate(R.layout.matches_messages_header, viewGroup, false));
            case 5:
                i = new EmptyMessageListViewHolder(from.inflate(R.layout.empty_matches_message_view, viewGroup, false));
                i.m48124a();
                return i;
            default:
                throw new IllegalStateException("This view type is not supported");
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        switch (getItemViewType(i)) {
            case 2:
                C12032a c12032a = (C12032a) viewHolder;
                C12099h a = ((MatchListItem) this.f39140a.get(i)).mo10600a();
                if (a != 0) {
                    c12032a.f39139a.m48223a(a);
                    return;
                }
                return;
            case 3:
            case 5:
                ((EmptyMessageListViewHolder) viewHolder).itemView.setVisibility(0);
                return;
            case 4:
                ((MatchesMessagesHeaderViewHolder) viewHolder).m48126a(((MatchListItem) this.f39140a.get(i)).mo10601b());
                return;
            default:
                return;
        }
    }

    public int getItemCount() {
        return this.f39140a.size();
    }

    public int getItemViewType(int i) {
        switch (((MatchListItem) this.f39140a.get(i)).mo10602c()) {
            case NEW_MATCHES:
                return 1;
            case MESSAGES_HEADER:
                return 4;
            case MATCH_WITH_MESSAGE:
                return 2;
            case NO_MESSAGES:
                return 3;
            case NO_MATCHES:
                return 5;
            default:
                throw new IllegalStateException("Unsupported view type in the matches list");
        }
    }

    /* renamed from: c */
    private Single<C0559j<DiffResult, List<MatchListItem>>> m48129c(List<MatchListItem> list) {
        return Single.a(new C9840c(this, list));
    }

    /* renamed from: b */
    final /* synthetic */ C0559j m48132b(List list) throws Exception {
        return C0559j.a(DiffUtil.calculateDiff(new C12051b(this.f39140a, list)), list);
    }

    /* renamed from: b */
    private void m48128b(C0559j<DiffResult, List<MatchListItem>> c0559j) {
        DiffResult diffResult = (DiffResult) c0559j.f1724a;
        List list = (List) c0559j.f1725b;
        this.f39140a.clear();
        this.f39140a.addAll(list);
        diffResult.dispatchUpdatesTo(this);
    }
}
