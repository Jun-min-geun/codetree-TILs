import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3x3 배열 입력 받기
        int[][] board = new int[3][3];
        for(int i = 0; i < 3; i++) {
            String line = sc.next(); 
            for(int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j) - '0'; 
            }
        }

        int teamWins = 0;
        
        for(int i = 0; i < 3; i++) {
            if(isTeamWin(board[i][0], board[i][1], board[i][2])) {
                teamWins++;
            }
        }
        
        for(int i = 0; i < 3; i++) {
            if(isTeamWin(board[0][i], board[1][i], board[2][i])) {
                teamWins++;
            }
        }
        
        if(isTeamWin(board[0][0], board[1][1], board[2][2])) {
            teamWins++;
        }
        if(isTeamWin(board[0][2], board[1][1], board[2][0])) {
            teamWins++;
        }

        System.out.println(teamWins);
    }
    
    private static boolean isTeamWin(int a, int b, int c) {
        if(a == b && b == c) {
            return false;
        }
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(a, b, c));
        return uniqueNumbers.size() == 2;
    }
}