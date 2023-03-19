import java.util.Scanner;
public class DatosDePaciente {
    private String name;
    private int age;
    //estatura
    private int height;
    //peso
    private double weight;
    private char sex;
    Scanner sc = new Scanner(System.in);

    public DatosDePaciente(String name, int age, int height, double weight, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    double IMC(double weight, int height){
        return (double) weight/(height*height);
    }
    public String compotition (double imc{
        if (imc <= 18.5) {
            return "underweight";
        }
        else if (imc > 18.5 && imc <= 24.9){
            return "normal";
        }
        else if (imc > 25){
            return "overheight"
        }
        else {
            return "obesity";
        }
    }
    public void IndiceDeMasaCorporal(double height, double weight){

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public char getSex(){
        return sex;
    }


}

