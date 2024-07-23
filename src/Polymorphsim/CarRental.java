package Polymorphsim;

public class CarRental {
//abstraction
    int CarId;
    String CarType;
    float rent;

        void GetCar(int CarId, String CarType) {
            this.CarId = CarId;
            this.CarType = CarType;
        }
        void GetRent(){
            if (CarType=="Small"){
                rent=1000;
            }
            if (CarType=="Van"){
                rent=800;
        }else{
                rent=2500;
            }
    }
        void ShowCar(){
            System.out.println(CarId+" "+CarType+" "+rent);
        }

    public static void main(String[] args) {
        CarRental obj=new CarRental();
        obj.GetCar(89,"van");
        obj.GetRent();
        obj.ShowCar();
    }

}
