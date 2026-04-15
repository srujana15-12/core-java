class CarExecutor
{
    public static void main(String[] args)
    {
        Car c1=new Car();
        c1.brand="Toyota";

        Car c2=new Car();
        c2.brand="Honda";

        Car c3=new Car();
        c3.brand="Hyundai";

        Car c4=new Car();
        c4.brand="BMW";

        Car c5=new Car();
        c5.brand="Audi";

        Car c6=new Car();
        c6.brand="Mercedes";

        Car c7=new Car();
        c7.brand="Kia";

        Car c8=new Car();
        c8.brand="Ford";

        Car c9=new Car();
        c9.brand="Chevrolet";

        Car c10=new Car();
        c10.brand="Nissan";

        Car c11=new Car();
        c11.brand="Volkswagen";

        Car c12=new Car();
        c12.brand="Skoda";

        Car c13=new Car();
        c13.brand="Renault";

        Car c14=new Car();
        c14.brand="Tata";

        Car c15=new Car();
        c15.brand="Mahindra";

        Car[] cars=new Car[15];
        cars[0]=c1;
        cars[1]=c2;
        cars[2]=c3;
        cars[3]=c4;
        cars[4]=c5;
        cars[5]=c6;
        cars[6]=c7;
        cars[7]=c8;
        cars[8]=c9;
        cars[9]=c10;
        cars[10]=c11;
        cars[11]=c12;
        cars[12]=c13;
        cars[13]=c14;
        cars[14]=c15;

        for (Car car : cars)
            System.out.println(car.brand);
    }
}

