fun main()
{
    print("Enter a number: ")
    val a_draft = readLine()!!
    val a = a_draft.toInt() 
    if(a > 0)
    {
        print("Positive Numbers")
    }
    else if (a == 0)
    {
        print("Zero")
    }
    else
    {
        print("Negative number")
    }

    // readlnToNull() wont work for greater than or less than
}
