fun main()
{
    //// logical operators
    // greater than (>)
    // less than (<)
    // greater than or equal (>=)
    // less than or equal (<=)
    // equal (==)
    // not equal (!=)


    //// nested if-else condition
    print("Enter a number: ")
    var a_draft = readLine()!!
    var a = a_draft.toInt()
    if(a >= 0) // a is greater than 0 or a == 0
    {
        if(a != 0)
        {
            print("Positive numbers")
        }
        else
        {
            print("zero")
        }
    }
    else if(a <= -10)
    {
        if (a == -11)
        {
            print("Minus eleven")
        }
        else
        {
            print("Less than minus eleven")
        }
    }
    else
    {
        print("-1 to -9")
    }

}
