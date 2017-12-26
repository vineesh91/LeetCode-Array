public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9) {
            digits[digits.length - 1] +=1;
            return digits;
        }
        int[] newDigits = new int[digits.length+1];
        int carryOver = 1;
        for(int i = digits.length; i > 1; i--) {
            int sum = digits[i-1] + carryOver;
            newDigits[i] = sum%10;
            digits[i-1] = newDigits[i];
            carryOver = sum/10;
        }
        if(carryOver == 1 && digits[0] == 9) {
            newDigits[1] = 0;
            newDigits[0] = 1;
        }
        else {
            digits[0] += carryOver;
            return digits;
        }
        return newDigits;
    }
}
