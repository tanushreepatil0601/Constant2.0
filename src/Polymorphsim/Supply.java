package Polymorphsim;

public class Supply {

    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    void GetType() {
        if (Sticker == "Green") {
            FoodType = "Veg";
        } else if (Sticker == "Yellow") {
            FoodType = "Contains egg";
        } else {
            FoodType = "Non veg";
        }
    }
    void FoodIn(int code, String FoodName, String Sticker){
    this.Code=Code;
    this.FoodType=FoodType;
    this.FoodName=FoodName;
    this.Sticker=Sticker;
    {
        }
    }
    void FoodOut(){
        System.out.println(Code+" "+FoodType+" "+Sticker);
    }
            public static void main(String[] args){
                Supply obj = new Supply();
                obj.FoodIn(23, "Briyani", "Green");
                obj.FoodOut();
            }
        }
