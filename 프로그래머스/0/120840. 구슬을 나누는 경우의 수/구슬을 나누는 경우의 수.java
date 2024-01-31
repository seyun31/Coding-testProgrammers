import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger denom = BigInteger.ONE;  // 분모 (denominator) 초기화
        BigInteger numer = BigInteger.ONE;  // 분자 (numerator) 초기화
        
        // 분모 계산: balls부터 (balls - share + 1)까지의 곱
        for (int i = balls; i > (balls - share); i--) {
            denom = denom.multiply(BigInteger.valueOf(i));
        }
        
        // 분자 계산: 1부터 share까지의 곱
        for (int i = 1; i <= share; i++) {
            numer = numer.multiply(BigInteger.valueOf(i));
        }
        
        // 조합 계산: 분모를 분자로 나눈 결과 반환
        return denom.divide(numer);
    }
}
