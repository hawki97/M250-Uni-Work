/**
 *  This method takes two arguments
 *  If the first is odd and the second even it returns their sum as an int, otherwise it returns zero.
 *  
 */
public int oddEven(int a, int b)
{
    if((a % 2 == 1) && (b % 2 == 0))
    {
        return(a + b);
    }
else 
{
    return 0;
}
}

//Tests
oddEven(1, 2)
oddEven(0, 2)
oddEven(1, 3)
oddEven(-1, -9)
oddEven(5, 5)
oddEven(4, 7)
oddEven(7,14)