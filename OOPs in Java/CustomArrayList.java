class ArrayList {
    int[] arr;
    int idx = 0;
    int size = 0;

    ArrayList() {
        arr = new int[2];
    }

    ArrayList(int size) {
        arr = new int[size];
    }

    // Ekdum seedha function: Sahi index par true, galat par false
    private boolean isIndexValid(int index, boolean isInsert) {
        int limit = isInsert ? size : size - 1;
        
        // Agar index range ke andar hai toh sahi hai (true)
        if (index >= 0 && index <= limit) {
            return true;
        }
        
        // Range ke bahaar hai toh galat hai (false)
        System.out.println("Invalid Index!");
        return false;
    }

    void add(int ele) {
        if (this.idx == arr.length) {
            int[] arr2 = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            this.arr = arr2;
        }
        arr[this.idx++] = ele;
        size++;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void pop() {
        if (size == 0) {
            System.out.println("ArrayList is empty!");
            return;
        }
        this.idx--;
        this.size--;
    }

    void remove(int index) {
        // Agar function ne false diya (yaani index galat hai), toh yahin se return ho jao
        if (isIndexValid(index, false) == false) return; 
        
        // Agar upar se bach gaye, matlab true aaya tha, toh ab kaam karo!
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        this.idx--;
        this.size--;
    }

    void insert(int index, int value) {
        // Agar index galat hai (false aaya), toh return ho jao
        if (isIndexValid(index, true) == false) return;

        // True aane par niche ka kaam shuru
        if (this.idx == arr.length) {
            int[] arr2 = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            this.arr = arr2;
        }

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        this.idx++;
        this.size++;
    }

    int get(int idx) {
        if (isIndexValid(idx, false) == false) return -1; // Galat index par return
        return arr[idx]; // Sahi index par kaam karo
    }

    void set(int index, int value) {
        if (isIndexValid(index, false) == false) return; // Galat index par return
        arr[index] = value; // Sahi index par kaam karo
    }

    int capacity() {
        return arr.length;
    }
}

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(3);
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.display(); // Output: 10 20 30
        
        list.insert(1, 50);
        list.display(); // Output: 10 50 20 30
        
        list.remove(2);
        list.display(); // Output: 10 50 30
        
        // Galat index check karne ke liye
        list.get(10); // Output: Invalid Index!
    }
}
