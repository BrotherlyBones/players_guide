package Weekly_Challenges.Queue;

interface Queue {
    void add(int value);

    int remove(int index);

    int peek();

    boolean isEmpty();

    int size();

    void print();

    void clear();

    void clear(int n);

    void printReverse();

    void jumpTheQueue(int n, int value);

    String toString();

    boolean equals(ImplementsQueue q);

    int indexOf(int value);

    int lastIndexOf(int value);
}
