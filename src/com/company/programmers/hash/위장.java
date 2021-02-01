package com.company.programmers.hash;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class 위장 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i =0 ; i <clothes.length; i++)
        {
            hm.put(clothes[i][1] , hm.getOrDefault(clothes[i][1],0)+1);
        }

        int answer = 1;
        for(String key : hm.keySet()) // 3 1 2
        {
            answer *= (hm.get(key)+1);
        }
        return answer-=1;

        //두 수의 경우의 수를 만들려면 각 수를 곱하면된다.
        //하지만 하나만 있는경우도 포함하려면 +1 을 해야한다.
    }



    //다른 사람 코드
    public int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], Collectors.mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(Collectors.reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;



        }

    public int 해석(String[][] clothes) {

        int i = Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], counting()))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;



        //1 라인 2차원 배열을 stream 으로 변환
        //2 라인 각 배열의 구성요소를 그룹핑 하는데 기준은 2번 배열(종류) 의 카운 을 그룹핑한다 -> 각 종류의 개수 확인
        //3 라인 위의 결과를 얻어온다.
        //4 라인 다시 stream으로 변환
        //5 라인 리듀싱을 한다 시작값은 1 이고 x는 연산결과 y는 연산할값이다.
        //5-1 가지고있는 값에 종류의 개수를 +1한후 곱한다. 반복\
        //출력할때 -1 하고 출려한다.

        //reducing 매개변수
        //1. 리듀싱 연산의 시작값이나 스트림에 인수가없을때 의 반환값
        //2. 변환함수
        //3. 바이너리 오퍼

        //https://napasun-programming.tistory.com/39
        return i;

    }

}

