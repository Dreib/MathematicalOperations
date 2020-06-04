package org.fasttrackit;

public class App
{
    public static void main( String[] args )
    {

        int x = 100;
        int y = 25;

        Operations operation = new Operations();
        operation.sum(x, y);
        operation.substraction(x, y);
        operation.multiplication(x, y);
        operation.division(x, y);

    }
}
