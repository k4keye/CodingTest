package programmers;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 완주하지_못한_선수_TEST {
    @Test
    public void testcode1()
    {
        String[] participant = new String[]{"leo","kiki","eden"};
        String[] completion = new String[]{"kiki","eden"};


        com.company.programmers.hash.완주하지_못한_선수 Target = new com.company.programmers.hash.완주하지_못한_선수();
        String result = Target.solution(participant,completion);
        String expected ="leo";
        assertEquals(expected,result);

    }

    @Test
    public void testcode2()
    {
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"marina", "josipa", "nikola", "filipa"};


        com.company.programmers.hash.완주하지_못한_선수 Target = new com.company.programmers.hash.완주하지_못한_선수();
        String result = Target.solution(participant,completion);
        String expected ="vinko";
        assertEquals(expected,result);

    }
    @Test
    public void testcode3()
    {
        String[] participant = new String[]{"marina", "josipa", "nikola", "marina", "filipa"};
        String[] completion = new String[]{"marina", "josipa", "nikola", "filipa"};


        com.company.programmers.hash.완주하지_못한_선수 Target = new com.company.programmers.hash.완주하지_못한_선수();
        String result = Target.solution(participant,completion);
        String expected ="marina";
        assertEquals(expected,result);

    }
}
