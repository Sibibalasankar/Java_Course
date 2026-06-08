package graph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No of Nodes:");
        int N = sc.nextInt();

        EdgeList el = new EdgeList(N);

        System.out.println("Enter a number of Edges: ");
        int E = sc.nextInt();

        for(int i=0;i<E;i++){
            System.out.println("Enter Edge: " + (i+1));

            System.out.println("Enter u: ");
            int u = sc.nextInt();

            System.out.println("Enter v: ");
            int v=sc.nextInt();

            el.add(u,v);
        }

        el.print();

    }
}