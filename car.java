package com.company;


interface car
{
    public void start();
    public void stop();
    public void move();
}
 class maruti implements car
 {
    public void start()
    {
        System.out.println("Starting BLACKBIRD");
    }
    public void stop()
    {
        System.out.println("stopping BLACKBIRD");
    }
    public void move()
    {
        System.out.println("moving BLACKBIRD");
    }
    void autodrive()
    {
        System.out.println("Autodriving BLACKBIRD");
    }
}
 class bmw implements car
 {
     public void start()
     {
         System.out.println("Starting BMW-i8");
     }

     public void stop()
     {
         System.out.println("stopping BMW-i8");
     }

     public void move()
     {
         System.out.println("moving BMW-i8");
     }

     void autodrive()
     {
         System.out.println("Autodriving BMW-i8");
     }

     void hybrid()
     {
         System.out.println("Switch to Electric");
     }
 }


     class vehicle
     {
         public static void main(String[] args) {
             maruti blackbird = new maruti();
             bmw i8 = new bmw();
             blackbird.start();
             blackbird.stop();
             blackbird.move();
             blackbird.autodrive();
             i8.start();
             i8.stop();
             i8.move();
             i8.autodrive();
             i8.hybrid();
         }


     }