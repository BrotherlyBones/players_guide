package Weekly_Challenges.Queue;

public class ImplementsQueue implements Queue {

    private int[] list = new int[0];

    public void add(int value) {
        int[] tempList = new int[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            tempList[i] = list[i];
        }
        list = tempList;
        list[list.length - 1] = value;
    }

    public int remove(int index) {
        int removedVal = list[index];
        int[] tempList = new int[list.length - 1];
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (!(i == index)) {
                tempList[j] = list[i];
                j++;
            }
        }
        list = tempList;
        return removedVal;
    }

    public int peek() {
        return list[0];
    }

    public boolean isEmpty() {
        return list.length == 0;
    }

    public int size() {
        return list.length;
    }

    public void print() {
        System.out.print("[");
        for (int value : list) {
            System.out.print(" " + value + " ");
        }
        System.out.println("]");
    }

    public void clear() {
        list = new int[0];
    }

    public void clear(int n) {
        for (int i = 0; i <= n; i++) {
            remove(0);
        }
    }

    public void printReverse() {
        System.out.print("[");
        for (int i = 1; i < list.length + 1; i++) {
            System.out.print(" " + list[list.length - i] + " ");
        }
        System.out.println("]");
    }

    public void jumpTheQueue(int n, int value) {
        int[] tempList = new int[list.length + 1];
        for (int i = 0; i < tempList.length; i++) {
            if (i < n) {
                tempList[i] = list[i];
            } else if (i == n) {
                tempList[i] = value;
            } else {
                tempList[i] = list[i - 1];
            }
        }
        list = tempList;
    }

    public String toString(){
        String tempString = "[";
        for (int value : list) {
            tempString += (" " + value + " ");
        }
        tempString += "]";
        return tempString;
    }

    public boolean equals(ImplementsQueue q) {
        return toString().equals(q.toString());
    }

    public int[] getList() {
        return list;
    }

    public int indexOf(int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i = list.length -1; i >= 0; i--) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

