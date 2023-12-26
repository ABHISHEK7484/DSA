package loops;

import java.util.stream.Stream;

public class pattern2 {
    public static void main(String args[]){
        int h=4,w=6;
        for (int i = 0; i < h; i++){
            System.out.println();
            for (int j = 0; j < w; j++){
                if (i == 0 || i == h-1 ||j== 0 || j == w-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
    }
}
