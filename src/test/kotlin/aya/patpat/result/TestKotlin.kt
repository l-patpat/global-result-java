package aya.patpat.result

import com.google.gson.Gson
import org.junit.Test

class TestKotlin {

    @Test
    fun test() {
        val result = GlobalResult.SuccessWith("123")
        val json = Gson().toJson(result)
        println(json)
        try {
            throw GlobalResultException(GlobalResult.ErrInternal("≤‚ ‘"))
        } catch (e: GlobalResultException) {
            println("${e.result.result} ${e.result.msg}")
        }
    }
}