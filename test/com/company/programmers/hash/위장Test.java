package com.company.programmers.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 위장Test {

    @Test
    void 예제1() {
        String[][] clothes = new String[][]{
                {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}
        };
        위장 Target = new 위장();
        int result = Target.solution(clothes);
        assertEquals(5,result);
    }

    @Test
    void 예제2() {
        String[][] clothes = new String[][]{
                {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}
        };
        위장 Target = new 위장();
        int result = Target.solution(clothes);
        assertEquals(3,result);
    }

    @Test
    void 예제3() {
        String[][] clothes = new String[][]{
                {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}
                , {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}
        };
        위장 Target = new 위장();
        int result = Target.solution(clothes);
        assertEquals(23,result);
    }

    @Test
    void 스트림연습() {

        위장 Target = new 위장();
        Target.streamTest();
    }
}

//[[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]