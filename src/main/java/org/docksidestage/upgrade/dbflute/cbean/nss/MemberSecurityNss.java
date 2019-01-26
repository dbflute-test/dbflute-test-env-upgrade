package org.docksidestage.upgrade.dbflute.cbean.nss;

import org.docksidestage.upgrade.dbflute.cbean.cq.MemberSecurityCQ;

/**
 * The nest select set-upper of MEMBER_SECURITY.
 * @author DBFlute(AutoGenerator)
 */
public class MemberSecurityNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MemberSecurityCQ _query;
    public MemberSecurityNss(MemberSecurityCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
}
