package lv.Homework8;

//ctrl + alt + l
public class CarTest {

    public static void main(String[] args) {

        Truck truck = new Truck(50);
        Truck truck2 = new Truck(33);
        PassangerVehicle passangerVehicle = new PassangerVehicle(100000);
        PassangerVehicle passangerVehicle2 = new PassangerVehicle(100000);
        Bus bus2 = new Bus("Yellow");
        Bus bus = new Bus("Red") ;
//lieka rinda

        if(truck.equals(truck2)){
            System.out.println( "Truck 1 equals Truck 2");
        }else{
            System.out.println("Truck 1 does not equal Truck 2");
            System.out.println("Truck1: " +truck.toString());
            System.out.println("Truck2: " +truck2.toString());
        }

        if(passangerVehicle.equals(passangerVehicle2)){
            System.out.println("Passanger Vehicle 1 equials Passanger Vehicle 2");
        }else{
            System.out.println("Passanger vehicle 1 is not equal passanger vehicle 2");
            System.out.println("Passanger vehicle 1: "+ passangerVehicle.toString());
            System.out.println("Passanger vehicle 2: "+ passangerVehicle2.toString());
        }

        if(bus.equals(bus2)){
            System.out.println("bus 1 equals bus2");
        }else{
            System.out.println("bus 1 does not equal bus2");
            System.out.println("Bus1: " +bus.toString());
            System.out.println("Bus2: " +bus2.toString());
        }

    }
}
