package week_2.skwent77;

public class PGS_주식가격 {
    public int[] solution(int[] prices){
        int size = prices.length;
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            int count=0;
            for(int j=i+1; j<size; j++){

                if(prices[i]>prices[j]){
                    count++;
                    break;
                }
                count++;
            }
            answer[i] = count;
        }

        return answer;

    }
}
