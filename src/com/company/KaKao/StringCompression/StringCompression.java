package com.company.KaKao.StringCompression;

public class StringCompression {
    public StringCompression()
    {
        String s = "aabbaccc";
        String[] s_arr = new String[s.length()];
        int sLength = s.length();
        String result =null;
        result ="";

        for(int i =0 ; i<sLength;i++)
        {
            String sChar = s.substring(i,i+1);
            System.out.println("[기준 대상] "+ sChar);
            System.out.println("[기준 대상 i] "+ i);
            int equalsCount = 1; //같은 문자 카운트
            for(int j = i+1 ; j<sLength ; j++)
            {
                String comparison = s.substring(j,j+1);
                System.out.println("비교 "+ comparison);

                if(sChar.equals(comparison) ) //문자가 같다면
                {
                    System.out.println("같다");
                    equalsCount++;
                    if(j == sLength-1)
                    {
                        if(equalsCount < 2) result += sChar;
                        else result += equalsCount+ sChar;

                        System.out.println(result);
                        i+=(equalsCount-1); //i 를 같은 문자열 길이만큼 증가
                        break;
                    }
                }
                else
                {
                    if(equalsCount < 2) result += sChar;
                    else result += equalsCount+ sChar;

                    System.out.println(result);
                    i+=(equalsCount-1); //i 를 같은 문자열 길이만큼 증가
                    break;
                }
            }

        }
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}
