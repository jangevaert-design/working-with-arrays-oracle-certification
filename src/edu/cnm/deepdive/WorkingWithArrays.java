package edu.cnm.deepdive;

import java.util.Arrays;

public class WorkingWithArrays {

  public static void main(String[] args) {
    int[] one = new int[3];// array with 3 elements.
    int[]two = new int[]{10, 11, 12};//initialized array with 3 elements.
    //double[] a = new double[2.55];//will not compile.
    double[] b = new double[4 * 5 / 2];//compiles with length 10.

    int x = 4;
    int y = 5;

    double[] c = new double[x * y];// creates an empty array with 20 elements.
    int[] three = {10, 11, 12}; //this is called an anonymous array.
    int[] four = {}; // anonymous empty array.

    int[] a1;
    int a3[];// works as well.

    int[] ids, types;//will create an ids[] and a types[]. Square brackets in this case must be just
    //after the data type.
    int ids2[], types2;//this will create an ids2 array and a types2 int. Bad practice.

    String[] animals = {"parrot", "cat", "dog"};//anonymous String array (hence consisting of objects.
    String[] myAnimals = animals;
    String[] otherAnimals = {"parrot", "cat", "dog"};

    System.out.println(animals.equals(myAnimals));//true. In arrays this checks the reference equality.
    System.out.println(animals == myAnimals);//true.
    System.out.println(Arrays.equals(animals, myAnimals));// true. The content is the same.
    System.out.println(animals.equals(otherAnimals));//false because not the same reference.
    System.out.println(animals == otherAnimals);//false because not the same reference.
    System.out.println(Arrays.equals(animals, otherAnimals));//true because content is the same.

    System.out.println(animals);//will print [Ljava.lang.String:@1540e19d. [L means that it is an
    //array of Strings.
    System.out.println(animals.toString());//will print [Ljava.lang.String:@1540e19d. [L means
    // that it is an array of Strings.
    System.out.println(Arrays.toString(animals));//prints [parrot, cat, dog]

    //Arrays.toString() and Arrays.equal() are calls to the static Arrays class.
  }

}
