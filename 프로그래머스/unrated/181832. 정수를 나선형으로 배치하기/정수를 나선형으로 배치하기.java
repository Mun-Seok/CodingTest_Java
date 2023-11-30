class Solution {
    public int[][] solution(int n) {
        int x = 0; // x축 방향
        int y = 0; // y축 방향
        int temp = 0; // 각 축의 방향 임시 저장 변수
        int value = 1; // 1~n 즉, 채워야할 정수 값.
        int[][] twoArr = new int[n][n];
        while(value <= n * n){ // 배열에 전부 채워지면 종료.
            for(int right = x; right < n - x; right++){ // x 축 증가 for문.
                twoArr[y][right] = value++;
                temp = right;// x 축으로 증가.
                if(value  >= n * n)
                    break;
            } y++; x = temp;
            for(int down = y; down <= n - y; down++){ // y 축으로 증가 for문.
                twoArr[down][x] = value++;
                temp = down;
                if(value  >= n * n)
                    break;
            } x--; y = temp;
            for(int left = x; left >= n - 1 - y; left--){ // x 축 감소 for문.
                twoArr[y][left] = value++;
                temp = left;
                if(value  >= n * n)
                    break;
            }y--; x = temp;
            for(int up = y; up > x; up--){ // y 축 감소 for문.
                twoArr[up][x] = value++;
                temp = up;
                if(value  >= n * n)
                    break;
            }x++; y = temp;
        }
        return twoArr;
    }
}