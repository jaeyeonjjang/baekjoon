import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];
        for (int i=0; i<N; i++){
            map[i] = sc.next().toCharArray();
        }

        // 1. 각 행/열에 대해 경비원이 있는지 확인한다.

        boolean[] rowExist = new boolean[N];
        boolean[] colExist = new boolean[M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (map[i][j] == 'X') {
                    rowExist[i] = true;
                    colExist[j] = true;
                }

        // 2. 보호받지 못하는 행/열의 개수를 구한다.
        int rowNeedCount = N;
        int colNeedCount = M;
        for (int i = 0; i < N; i++)
            if (rowExist[i]) rowNeedCount--;
        for (int i = 0; i < M; i++)
            if (colExist[i]) colNeedCount--;

        // 3. 둘 중 큰 값을 출력한다.
        System.out.println(Math.max(rowNeedCount,colNeedCount));
    }
}