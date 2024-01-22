package week02;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    // Return the size of the list using recursion
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();

    }

    // Return the size of the list using iteration
    public int iterativeSize() {
        IntList p = this;

        int count = 0;
        while (p != null) {
            ++count;
            p = p.rest;
        }
        return count;
    }

    // Return the index of i from the list using recursion
    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        else {
            return this.rest.get(i - 1);
        }

    }
    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

//        System.out.println(L.rest);
//        System.out.println(L.size());
//        System.out.println(L.iterativeSize());
        System.out.println(L.get(0));


//        L.first = 5;
//        L.rest = null;
//
//        L.rest = new IntList();
//        L.rest.first = 10;
//
//        L.rest.rest = new IntList();
//        L.rest.rest.first = 15;



    }

}
