package aya.patpat.result;

public class GlobalResultException extends java.lang.Exception {

    private GlobalResult mResult = null;

    public GlobalResultException(GlobalResult result) {
        mResult = result;
    }
    public GlobalResult getResult() {
        return mResult;
    }
}

