/** 
 * Takes three arguments
 * 
 *array of int 
 *int start - the start location (based from one)
 *int end - the end location (based from one)
 *
 *returns an int representing the sum of items from start to end positions inclusive
 */
public int sumArrayRange(int[] dataArray, int start, int end)
{
   int total = 0;
   int i = start - 1;
   
   while(i + 1 >= start && i + 1 <= end)
    {
        total = total + dataArray[i];
        i++;
    }
    
    return total;
}

//Tests
int[] anArray = {1,2,3,4,5,6,7};
System.out.println(sumArrayRange(anArray, 1, 3));

int[] anArray = {1,2,3,4,5,6,7};
System.out.println(sumArrayRange(anArray, 6, 7));

int[] anArray = {1,2,3,4,5,6,7};
System.out.println(sumArrayRange(anArray, 3, 7));

int[] anArray = {45,43,5,6,7,23,9,6,55,4,2,32,12};
System.out.println(sumArrayRange(anArray, 6, 13));

int[] anArray = {45,43,5,6,7,23,9,6,55,4,2,32,12};
System.out.println(sumArrayRange(anArray, 1, 2));

int[] anArray = {45,43,5,6,7,23,9,6,55,4,2,32,12};
System.out.println(sumArrayRange(anArray, 12, 13));

int[] anArray = {45,43,5,6,7,23,9,6,55,4,2,32,12};
System.out.println(sumArrayRange(anArray, 7, 7));