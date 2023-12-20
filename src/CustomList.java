import java.util.Arrays;

public class CustomList {
    private int[] list;

    public CustomList() {
        this.list = new int[0];
    }

    public CustomList(int[] list) {
        this.list = list;
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
        for (int i = list.length - 1; i >= 0 ; i--) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index, int defaultValue) {
        if (index < this.list.length && index >= 0) {
            return this.list[index];
        }
        return defaultValue;
    }

    public int get(int index) {
        return get(index, 0);
    }

    public void add(int value) {
        int[] newList = new int[this.list.length + 1];
        copyArray(this.list, newList);
        newList[this.list.length] = value;
        this.list = newList;
    }

    public int getMax() {
        int max = this.list[0];
        for (int value : this.list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int pop() {
        int value = this.get(this.list.length - 1);
        int[] newArray = new int[this.list.length - 1];
        copyArray(this.list, newArray);
        this.list = newArray;
        return value;
    }

    public void remove(int value) {
        int index = this.indexOf(value);
        if (index != -1) {
            shiftByIndex(index);
            pop();
        }
    }

    public void removeRight(int value) {
        int index = this.lastIndexOf(value);
        if (index != -1) {
            shiftByIndex(index);
            pop();
        }
    }

    public void removeAll(int value) {
        int i = 0;
        while (i < this.list.length) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
            } else {
                i++;
            }
        }
    }

    public void removeByIndex(int index) {
        if (index >= 0 && index < this.list.length) {
            shiftByIndex(index);
            pop();
        } else {
            System.out.println("invalid index");
        }
    }

    public void removeAllByIndex(int index) {
        if (index >= 0 && index < this.list.length) {
            int deletedValue = this.list[index];
            removeAll(deletedValue);
        } else {
            System.out.println("invalid index");
        }
    }

    public void reverse() {
        for (int i = 0; i < this.list.length / 2; i++) {
            swap(i, this.list.length - i -1);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - i -1; j++) {
                if (this.list[j] > this.list[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void bubbleSort(boolean desc) {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - i -1; j++) {
                if (this.list[j] < this.list[j + 1] == desc) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < this.list.length; i++) {
            int max = this.list[0];
            int maxIndex = 0;
            for (int j = 0; j < this.list.length - i; j++) {
                if (this.list[j] > max) {
                    max = this.list[j];
                    maxIndex = j;
                }
            }
            swap(maxIndex, this.list.length - i - 1);
        }
    }

    public void selectionSort(boolean desc) {
        for (int i = 0; i < this.list.length; i++) {
            int targetIndex = 0;
            for (int j = 0; j < this.list.length - i; j++) {
                if (this.list[j] < this.list[targetIndex] == desc) {
                    targetIndex = j;
                }
            }
            swap(targetIndex, this.list.length - i - 1);
        }
    }

    public void invert() {
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] *= -1;
        }
    }

    public void positive() {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] < 0) {
                this.list[i] *= -1;
            }
        }
    }

    public void changeSign(boolean positive) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] < 0 == positive) {
                this.list[i] *= -1;
            }
        }
    }

    private void swap(int index1, int index2) {
        int tmp = this.list[index1];
        this.list[index1] = this.list[index2];
        this.list[index2] = tmp;
    }

    private void shiftByIndex(int index) {
        for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
    }

    private void copyArray(int[] init, int[] result) {
        int minLength = Math.min(init.length, result.length);
        for (int i = 0; i < minLength; i++) {
            result[i] = init[i];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }
}
