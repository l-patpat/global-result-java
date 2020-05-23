package aya.patpat.result;

public class GlobalResult {

    public static final String SUCCESS = "SUCCESS";
    public static final String FAILURE = "FAILURE";
    public static final String CANCEL = "CANCEL";
    public static final String ERR_TIMEOUT = "ERR_TIMEOUT";
    public static final String ERR_ABORT = "ERR_ABORT";
    public static final String ERR_INTERNAL = "ERR_INTERNAL";
    public static final String ERR_SERVER = "ERR_SERVER";
    public static final String ERR_PARAMS_INVALID = "ERR_PARAMS_INVALID";
    public static final String ERR_NETWORK = "ERR_NETWORK";

    public long id = -1;
    private String result = "";
    private String msg = "";

    public GlobalResult(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public String getResult() { return this.result == null ? "" : this.result; }
    public void setResult(String result) { this.result = result; }

    public String getMsg() { return this.msg == null ? "" : this.msg; }
    public void setMsg(String msg) { this.msg = msg; }

    public boolean isSuccess() {
        return SUCCESS.equals(getResult());
    }

    public static class Normal<T> extends GlobalResult {
        public T data = null;
        public Normal(T data, String result, String msg) {
            super(result, msg);
            this.data = data;
        }
    }

    public static class Success extends GlobalResult {
        public Success() { super(SUCCESS, "�����ɹ�"); }
        public Success(String msg) { super(SUCCESS, msg); }
    }

    public static class SuccessWith<T> extends Normal<T> {
        public SuccessWith(T data) { super(data, SUCCESS, "�����ɹ�"); }
        public SuccessWith(T data, String msg) { super(data, SUCCESS, msg); }
    }

    public static class Failure extends GlobalResult {
        public Failure() { super(FAILURE, "����ʧ��"); }
        public Failure(String msg) { super(FAILURE, msg); }
    }

    public static class Cancel extends GlobalResult {
        public Cancel() { super(CANCEL, "ȡ��"); }
        public Cancel(String msg) { super(CANCEL, msg); }
    }

    public static class Abort extends GlobalResult {
        public Abort() { super(CANCEL, "�쳣��ֹ"); }
        public Abort(String msg) { super(CANCEL, msg); }
    }

    public static class Timeout extends GlobalResult {
        public Timeout() { super(ERR_TIMEOUT, "������ʱ"); }
        public Timeout(String msg) { super(ERR_TIMEOUT, msg); }
    }

    public static class ErrInternal extends GlobalResult {
        public ErrInternal() { super(ERR_INTERNAL, "�ڲ�����"); }
        public ErrInternal(String msg) { super(ERR_INTERNAL, msg); }
    }

    public static class ErrServer extends GlobalResult {
        public ErrServer() { super(ERR_SERVER, "����������"); }
        public ErrServer(String msg) { super(ERR_SERVER, msg); }
    }

    public static class ErrParamsInvalid extends GlobalResult {
        public ErrParamsInvalid() { super(ERR_PARAMS_INVALID, "������Ч"); }
        public ErrParamsInvalid(String msg) { super(ERR_PARAMS_INVALID, msg); }
    }

    public static class ErrNetwork extends GlobalResult {
        public ErrNetwork() { super(ERR_NETWORK, "�������"); }
        public ErrNetwork(String msg) { super(ERR_NETWORK, msg); }
    }
}
