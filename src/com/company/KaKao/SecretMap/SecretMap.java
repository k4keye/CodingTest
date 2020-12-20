package com.company.KaKao.SecretMap;

public class SecretMap {
    public SecretMap()
    {
        int n =5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String reslut=null;
        int bit;

        for(int i =0 ; i<n ; i++) //지도의 세로는 n 이다
        {
            bit =1;
            reslut="";
            int arr = arr1[i] | arr2[i]; //두 지도의 같은 라인을 OR 연산자로 더한다.

            for(int j =0 ; j<5 ; j++) { //지도의 가로는 5칸이다.
                int tmp = (arr&bit); //해당위치가 참인지 본다

                if(tmp>=1) reslut="#"+reslut; //뒤에서 부터 앞으로 검사중이기때문에 결과를 앞으로 붙힌다.
                else reslut= " "+reslut;

                bit = bit<<1;
            }
            System.out.println(reslut);

        }
    }
}
