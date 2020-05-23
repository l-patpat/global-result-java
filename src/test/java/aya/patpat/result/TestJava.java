package aya.patpat.result;

import com.google.gson.Gson;
import org.junit.Test;

public class TestJava {

    @Test
    public void test() {
        GlobalResult result = new GlobalResult.SuccessWith<>("123");
        String json = new Gson().toJson(result);
        System.out.println(json);
    }
}
