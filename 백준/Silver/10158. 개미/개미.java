import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt(); //가로길이
        int H = sc.nextInt(); //세로길이
        int P = sc.nextInt(); //가로좌표
        int Q = sc.nextInt(); //세로좌표
        int T = sc.nextInt(); //시간

        int timeX = T % (2 * W);
        int currentX = P;
        int deltaX = 1;
        while (timeX-- > 0){ //timeX 시간만큼 한 칸씩 이동
            if(currentX == W) deltaX = -1; //오른쪽으로 더이상 갈 수 없기때문에 -1설정
            else if(currentX == 0) deltaX =1; // 더이상 왼쪽으로 갈 수 없기때문에 1 설정
            currentX += deltaX;
        }

        int timeY = T % (2 * H);
        int currentY = Q;
        int deltaY = 1;
        while (timeY-- > 0){ //timeY 시간만큼 한 칸씩 이동
            if(currentY == H) deltaY = -1; //위쪽으로 더이상 갈 수 없기때문에 -1설정
            else if(currentY == 0) deltaY =1; // 더이상 아래으로 갈 수 없기때문에 1 설정
            currentY += deltaY;
        }

        System.out.println(currentX + " " + currentY);
    }
}