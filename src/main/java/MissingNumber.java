public class MissingNumber {
    public static void main(String args[]){
        int[] array = {3,5,4,1};
        int sumOfOriginalArray = 0;
        //Get sum of array elements with the missing number
        for( int i : array) {
            sumOfOriginalArray += i;
        }

        // Get Minimum and Maximum values from the array
        int min = getMin(array);
        int max = getMax(array);

        // Get total value of array with the missing number
        int totalOverall = getTotalOverall(min,max);

        System.out.println("The Missing number is " + (totalOverall - sumOfOriginalArray));
    }

    // Method for getting total value of array with the missing number
    public static int getTotalOverall(int min, int max){
        int totalWithMissing = 0;
        for (int i = min; i <= max; i++) {
            totalWithMissing = totalWithMissing + i;
        }
        return totalWithMissing;
    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

