package com.company.programmers.hash;

import java.sql.Array;
import java.util.*;
import java.util.HashMap;
public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i =0 ; i< completion.length;i++) if(!participant[i].equals(completion[i]))return participant[i];


        /*
        아쉽게 안된다.
        List<String> completionList = new ArrayList<>();
        completionList.addAll(Arrays.asList(completion));

        Optional<String> stringStream = Arrays.stream(participant).filter(t -> !(completionList.contains(t)&&completionList.remove(t))).findFirst();*/

        return participant[-1];
    }

    public String 남의빠른코드(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        //participant 의 값을 HashMap에 key로 넣고 나올떄마다 +1 하는 방식이다.
        //그래서 이름이 중복되지않으면 모든 key에 1 이있고
        //중복되는 이름은 2가된다.

        //그후 completion 를 반복돌려 해당 key의 값을 -1 하여 넣는다.
        //즉 출발한사람이 도착했다면 해당 key의 값은 0이다.
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){ //0이 아닌 사람은 도착하지 못한사람이다.
                answer = key;
                break;
            }
        }
        return answer;
    }
}
