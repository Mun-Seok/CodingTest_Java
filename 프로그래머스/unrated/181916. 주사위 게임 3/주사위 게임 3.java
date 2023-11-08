class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        //모두 같을때
        if(a == b && b == c && c == d){
            answer += 1111 * a;
        }
        //세 주사위만 같을 때d만 다를떄,
        else if(a == b && b == c && c != d){
            answer += (10 * a + d) * (10 * a + d);
        }
        //세 주사위만 같을 때c만 다를 때.,
        else if(a == b && b == d && d != c){
            answer += (10 * a + c) * (10 * a + c);
        }
        //세 주사위만 같을 때 b만 다를 때 ,
        else if(a == d && d == c && c != b){
            answer += (10 * a + b) * (10 * a + b);
        }
        //a만 다를 때.
        else if(d == b && b == c && c != a){
            answer += (10 * d + a) * (10 * d + a);
        }

        //두 주사위만 같을 때,
        else if(a == b){
            if(c == d){
                answer += (a + c) * Math.abs(a - c);
            }
            else{
                answer += c * d;
            }
        }
        //두 주사위만 같을 때,
        else if(a == c){
            if(b == d){
                answer += (a + b) * Math.abs(a - b);
            }
            else{
              answer += b * d;  
            }
        }
        //두 주사위만 같을 때,
        else if(a == d){
            if(b == c){
                answer += (a + b) * Math.abs(a - b);
            }
            else{
                answer += b * c;
            }
        }
        //두 주사위만 같을 때,
        else if(b == c){
            if(a == d){
                answer += (b + a) * Math.abs(b - a);
            }
            else{
                answer += a * d;
            }
        }
        //두 주사위만 같을 때,
        else if(b == d){
            if(a == c){
                answer += (b + a) * Math.abs(b - a);
            }
            else{
                answer += a * c;
            }
        }
        //두 주사위만 같을 때,
        else if(c == d){
            if(b == a){
                answer += (c + b) * Math.abs(c - b);
            }
            else{
                answer += b * a;
            }
        }

        //모두 다를 때,
        else{
            answer += Math.min(Math.min(a,b),Math.min(c,d));
        }

        return answer;
    }
}