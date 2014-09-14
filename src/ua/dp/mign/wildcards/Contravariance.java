package ua.dp.mign.wildcards;

import java.util.List;

/**
* So we have some strict user which requires service that
* works only with Record data type.
**/
class StrictServiceUser {
    StrictServiceUser(RecordsService<Record> srv) {
        this.srv = srv;
    }

    void doWork() {
        srv.processRecord(new Record("Some text"));
    }
    private RecordsService<Record> srv;
}

interface RecordsService<T> {
    public void processRecord(T record);
}

/**
* And we have some legacy implementation which works with BaseRecord
* data type and it's current implementation perfectly suites our needs.
**/
class BaseRecordsServiceImpl implements RecordsService<BaseRecord> {
    public void processRecord(BaseRecord record) {
        record.printBaseRecordInfo();
    }
}

class Contravariance {
    public static void main(String[] args) {
        // StrictServiceUser user = new StrictServiceUser(new BaseRecordsServiceImpl());
        // as you can guess this will cause compilation error
        // because generic interfaces doesn't support covariance/contravariance in Java.
        // but we will handle it anyway :)

        StrictServiceUser user = new StrictServiceUser(new ContravarianceAdapter<Record>(new BaseRecordsServiceImpl()));
        user.doWork();
    }
}

/**
* This adapter will allow us to use any RecordsService<base of T> legacy implementation
* where RecordsService<T> is actually required.
*
* Please take a note that this adapter will allow us to use it for any user that
* requires service which works with T type or any of it's derived classes e.g. RecordEx.
*
* And it will allow to substitute RecordService implementation with any legacy implementation
* starting from RecordsService<T> e.g. RecordService<BaseBaseSuperAncientBaseRecord>.
**/
class ContravarianceAdapter<T> implements RecordsService<T> {
    public void processRecord(T rec) {
        this.srv.processRecord(rec);
    }
    ContravarianceAdapter(RecordsService<? super T> srv) {
        this.srv = srv;
    }
    private RecordsService<? super T> srv;
}
class Record extends BaseRecord {
    void printBaseRecordInfo() {
        System.out.println("Record.text:" + text);
    }
    Record(String text) {
        super(text);
    }
}
class BaseRecord {
    void printBaseRecordInfo() {
        System.out.println("BaseRecord.text:" + text);
    }
    BaseRecord(String text) {
        this.text = text;
    }
    protected String text;
}
