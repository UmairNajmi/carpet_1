// Carpet.java
// Displays the floor space of a room and price of 

// carprting 
class Carpet
{
    public static void main (String[] args)
    {
        double lenght, width, price,spFeet, totalPrice;
        lenght = 15.0;
        width = 25.0;
        price = 5.25;
        spFeet = lenght * width;
        totalPrice = spFeet * price;
        System.out.println("The floor space is " + 
            spFeet + "square feet");
        System.out.println("The price for carpet is $" + 
        totalPrice);
    }
}                