public class Main
{
    //binary search algorithm
    public static int searchNum(int[] numArr, int target)
    {
        System.out.println("numArr length" + numArr.length);
        int min = 0 ;
        int max = numArr.length;
        int currentMidPoint = (min + max)/ 2;
        int hold = 0;
        int loopCounter = 0;
        System.out.println("1stCmp " + currentMidPoint);

        while(numArr[currentMidPoint] != target && loopCounter!= numArr.length/2)
        {
            if (target < numArr[currentMidPoint])
            {
                max = currentMidPoint;
                currentMidPoint = (max + min)/2;
            } else {
                min = currentMidPoint;
                currentMidPoint = (max + min)/2;
            }
            loopCounter = loopCounter + 1;
        }

        if (loopCounter == numArr.length/2)
            currentMidPoint = -1;
        return currentMidPoint;
    }

}
