package paint;

public class Prog {



    public Prog(){} //create a class

    public double area (double length1, double width1){ //method calculates area of room
        double num1 = length1;
        double num2 = width1;

        double roomarea = num1 * num2;
        return roomarea;
    }



    public double volume (double length, double width, double height){ //method calculates volume of room
        double num1 = length;
        double num2 = height;
        double num3 = width;

        double roomvolume = num1 * num2 * num3;
        return roomvolume;
    }


    public double paintvalue(double height1, double width1){ //We will need the length and width of the wall so we use the height and width of the room
        double num1 = height1;
        double num2 = width1;

        double area = num1 * num2;

        double value = (area*10*4); //We are going under the assumption that paint required is 10m^2 per litre of paint
        //then multiply by 4 to get total for all 4 walls
        return value;





    }
}
