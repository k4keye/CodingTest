package com.company.KaKao.StringCompression;

public class StringCompression {
    public StringCompression(){
        String s = "aabbaccc";
        int saveLength = s.length();
        int sLength = saveLength/2;

        for(int Quality =1 ;  Quality < sLength ; Quality++)
        { //압축 비율

            for(int pos =0 ; pos< sLength;)
            {
                int resultLength = saveLength; //하나의 압축이 다 돌았을때의 길이를 저장할것이다.
                String tag = s.substring(pos , (pos+Quality)-1); //압축 비율 만큼 문자열을 얻는다.
                int overCount =0; //중복되는 수 카운트
                pos+=Quality; //여기서 pos 를 압축 비율 만큼 더해서 아래에서 다음 문자열을 얻을수있게한다.
                for(; pos<sLength ; pos++)
                {
                    String compar = s.substring(pos,(pos+Quality)-1);
                    if(tag.equals(compar)) overCount++;//같이면 카운트 증가
                    else
                    {
                        if(overCount)
                    }
                }
            }




        }
    }
}
