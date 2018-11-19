package com.tinder.data.message;

import com.tinder.data.model.ReactionModel.C8712a;
import com.tinder.data.model.ReactionModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"REACTION_FACTORY", "Lcom/tinder/data/model/ReactionModel$Factory;", "Lcom/tinder/data/message/Reaction;", "data_release"}, k = 2, mv = {1, 1, 10})
@JvmName(name = "ReactionModels")
public final class ba {
    @NotNull
    @JvmField
    /* renamed from: a */
    public static final C8712a<az> f30646a;

    static {
        Function3 function3 = ReactionModels$REACTION_FACTORY$1.f45280a;
        if (function3 != null) {
            function3 = new bb(function3);
        }
        f30646a = new C8712a((Creator) function3);
    }
}
