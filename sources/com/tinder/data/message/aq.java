package com.tinder.data.message;

import android.support.annotation.NonNull;
import com.squareup.sqldelight.C7263a;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.C10739n;
import com.tinder.data.model.MessageModel;
import com.tinder.data.model.MessageModel.C10861f;
import com.tinder.data.model.MessageModel.C10862g;
import com.tinder.data.model.MessageModel.C8710b;
import com.tinder.data.model.MessageModel.Message_viewModel;
import com.tinder.data.model.MessageModel.Select_latest_message_by_matchModel;
import com.tinder.domain.message.DeliveryStatus;
import org.joda.time.DateTime;

final class aq {
    @NonNull
    /* renamed from: a */
    static final C8710b<C10833b> f30625a = new C8710b(ar.f35430a, f30629e, f30630f, f30631g);
    @NonNull
    /* renamed from: b */
    static final C10862g<C10833b, C10835f, az, C10834c, C10832a> f30626b = f30625a.m37188a(as.f35431a, C8693g.f30647a, ba.f30646a, at.f35432a);
    @NonNull
    /* renamed from: c */
    static final C10861f<C10833b, C10835f, az, C10834c> f30627c = f30625a.m37187a(au.f35433a, C8693g.f30647a, ba.f30646a);
    @NonNull
    /* renamed from: d */
    static final RowMapper<DateTime> f30628d = f30625a.m37189b();
    @NonNull
    /* renamed from: e */
    private static final ColumnAdapter<DateTime, Long> f30629e = new C10739n();
    @NonNull
    /* renamed from: f */
    private static final ColumnAdapter<MessageType, String> f30630f = C7263a.a(MessageType.class);
    @NonNull
    /* renamed from: g */
    private static final ColumnAdapter<DeliveryStatus, String> f30631g = C7263a.a(DeliveryStatus.class);

    /* renamed from: com.tinder.data.message.aq$a */
    static abstract class C10832a implements Select_latest_message_by_matchModel<C10833b, C10835f, az, C10834c> {
        C10832a() {
        }
    }

    /* renamed from: com.tinder.data.message.aq$b */
    static abstract class C10833b implements MessageModel {
        C10833b() {
        }
    }

    /* renamed from: com.tinder.data.message.aq$c */
    static abstract class C10834c implements Message_viewModel<C10833b, C10835f, az> {
        C10834c() {
        }
    }
}
