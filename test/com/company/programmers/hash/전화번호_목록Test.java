package com.company.programmers.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 전화번호_목록Test {

    @Test
    void 예제1() {
        String[] phone_book = new String[]{
                "119", "97674223", "1195524421"

        };

        전화번호_목록 Target =new 전화번호_목록();
        boolean result = Target.solution2(phone_book);
        assertEquals(false,result);
    }

    @Test
    void 예제2() {
        String[] phone_book = new String[]{
                "123", "456", "789"

        };

        전화번호_목록 Target =new 전화번호_목록();
        boolean result = Target.solution2(phone_book);
        assertEquals(true,result);
    }

    @Test
    void 예제3() {
        String[] phone_book = new String[]{
                "12", "123", "1235","567","88"

        };

        전화번호_목록 Target =new 전화번호_목록();
        boolean result = Target.solution2(phone_book);
        assertEquals(false,result);
    }
}