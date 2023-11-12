import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enuns.entities.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>(); //Adcionar as formas geométricas na lista

        System.out.println("Entre com o número de figuras: ");
        int N = sc.nextInt();

        for(int i = 0; i <= N; i++){
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Rec or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/ BLUE/ RED): ");
            Color color = Color.valueOf(sc.next()); //Palavra digitada será convertida para objeto enumerado color.
            if (ch == 'r'){
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width,height));
            } else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

        }
        System.out.println("Áreas: ");
        for(Shape shape : list){
            System.out.println("Area : " + String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}