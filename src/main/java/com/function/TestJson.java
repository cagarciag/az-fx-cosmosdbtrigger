package com.function;

public class TestJson {

    private String id;
    private String testid;
    private String _rid;
    private String _self;
    private String _etag;
    private String _attachments;
    private String _ts;
    private String _lsn;

    public TestJson() {
    }

    public TestJson(String id, String testid, String _rid, String _self, String _etag, String _attachments, String _ts, String _lsn) {
        this.id = id;
        this.testid = testid;
        this._rid = _rid;
        this._self = _self;
        this._etag = _etag;
        this._attachments = _attachments;
        this._ts = _ts;
        this._lsn = _lsn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String get_rid() {
        return _rid;
    }

    public void set_rid(String _rid) {
        this._rid = _rid;
    }

    public String get_self() {
        return _self;
    }

    public void set_self(String _self) {
        this._self = _self;
    }

    public String get_etag() {
        return _etag;
    }

    public void set_etag(String _etag) {
        this._etag = _etag;
    }

    public String get_attachments() {
        return _attachments;
    }

    public void set_attachments(String _attachments) {
        this._attachments = _attachments;
    }

    public String get_ts() {
        return _ts;
    }

    public void set_ts(String _ts) {
        this._ts = _ts;
    }

    public String get_lsn() {
        return _lsn;
    }

    public void set_lsn(String _lsn) {
        this._lsn = _lsn;
    }

    @Override
    public String toString() {
        return "TestJson [id=" + id + ", testid=" + testid + ", _rid=" + _rid + ", _self=" + _self + ", _etag=" + _etag
                + ", _attachments=" + _attachments + ", _ts=" + _ts + ", _lsn=" + _lsn + "]";
    }
}