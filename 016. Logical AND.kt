fun main()
{
    //// logical AND (&&)

    print("Enter a number: ")
    var num_draft = readLine()!!
    var num = num_draft.toInt()
    if (num%2 == 0 && num%3 == 0)  
    {
        // it means, dividing num by 2 and 3 cause reminder as 0, then this condition fullfiled
        /* both parameters must be fullfiled. 
        If num%2 == 0 but num%3 != 0, then this condition won't work. 
        Same for, if num%3 == 0 but num%2 != 0, then this condition won't work. */ 

        print("yes")
    }
    else
    {
        print("No")
    }
}
