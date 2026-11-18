public class Product {
public static void main(String[] args){
double[] numbers ={25, 18, 20};

double sum = 0;
double max = numbers[0];

// Creating the sum
for(double num: numbers){ 
sum += num;
 // Creating the most sold
if (num > max) max = num
}

double average = sum/ numbers.length;

System.out.println("Average: " + average);
System.out.println("Sum: " + sum);
}
}
