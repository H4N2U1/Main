import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int max=-1000001, min=1000001;
        int n[] = new int[a];
        for(int i=0; i<n.length; i++) {
            n[i] = scanner.nextInt();
            if(n[i]>max)
                max=n[i];
            if(n[i]<min)
                min=n[i];
        }
        System.out.println(min + " " + max);

        scanner.close();
    }
}