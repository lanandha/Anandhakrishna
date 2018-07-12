
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Arraylist {
 ArrayList<Integer> al2 = new ArrayList<Integer>();
 ArrayList<Integer> al3 = new ArrayList<Integer>();
 static ArrayList<Integer> al1 = new ArrayList<Integer>();
 public ArrayList<Integer> SaveEvenNumbers(int n) {
  ArrayList<Integer> al = new ArrayList<Integer>();
  for (int i = 1; i <= n; i++) {
   if (i % 2 == 0) {
    al.add(i);
   }
  }
  return al;
 }
 public ArrayList<Integer> PrintEvenNumbers(ArrayList<Integer> al2) {
  System.out.println("Multiply by 2");
  for (int ad : al2) {
   ad = ad * 2;
   al3.add(ad);
    System.out.println(ad);
  }
  return al3;
 }
 public void PrintEvevnNumber(int va) {
  if (al1.contains(va)) {
   System.out.println();
   System.out.println(va);
  } else {
   System.out.println();
   System.out.println(0);
  }
 }
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the n value");
  int val = in.nextInt();
  Arraylist arr = new Arraylist();
  al1.addAll(arr.SaveEvenNumbers(val));
  Iterator it = al1.iterator();
  arr.PrintEvenNumbers(al1);
  arr.PrintEvevnNumber(val);
 }
}
