package 변수;

import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
        // 4byte = stack
        int sum = 0;
        // 4byte = stack
        float avg = 0f;

        // score = stack & 20byte = heap
        int[] score = new int[]{10,20,30,40,50};

        for (int i= 0 ; i<score.length; i++ ){
            sum+=score[i];
        }

        avg = sum/(float)score.length;

        System.out.println(sum);
        System.out.println(avg);


        size i = new size();
        i.loop();

        lotto a = new lotto();
        a.random();
    }
}

class size{
    int[] score = new int[]{10,20,30,40,50};

    int max = score[0];
    int min = score[0];

    public void loop() {
        for (int i = 1; i < score.length; i++) {
            if(score[i]< max){
                min = score[i];
            }
            max = score[i];
        }

        System.out.println(max);
        System.out.println(min);
    }
}

class lotto {
    int[] lotto = {0,1,2,3,4,5,6,7,8,9};

    public void random(){
        for (int i = 0 ; i < 100; i++){
            int ran = (int)(Math.random()*10);
            int tmp = lotto[0];
            lotto[0] = lotto[ran];
            lotto[ran] = tmp;
        }
        System.out.println("Arrays.toString(lotto) = " + Arrays.toString(lotto));
    }
}
