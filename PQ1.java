package PriorityQueues;

import java.util.ArrayList;

public class PQ1 {

        // Complete this class
        private ArrayList<Integer> heap;
        public PQ1() {
            heap = new ArrayList<>();
        }
        public int getSize() {
            return heap.size();
        }
        public boolean isEmpty() {
            return heap.size() == 0;
        }
        public int getMax() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return heap.get(0);
        }

        public void insert(int element) {
            heap.add(element);
            int childIndex = heap.size() - 1;
            int parentIndex = (childIndex - 1) / 2;
            while (childIndex > 0) {
                if (heap.get(childIndex) > heap.get(parentIndex)) {
                    int temp = heap.get(childIndex);
                    heap.set(childIndex, heap.get(parentIndex));
                    heap.set(parentIndex, temp);
                    childIndex = parentIndex;
                    parentIndex = (childIndex - 1) / 2;
                } else {
                    return;
                }
            }
        }

        public int removeMax() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int temp = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            int index = 0;
            int maxIndex = index;
            int leftChildIndex = 1;
            int rightChildIndex = 2;
            while (leftChildIndex < heap.size()) {
                if (heap.get(leftChildIndex) > heap.get(maxIndex)) {
                    maxIndex = leftChildIndex;
                }
                if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
                    maxIndex = rightChildIndex;
                }
                if (maxIndex == index) {
                    break;
                } else {
                    int temp2 = heap.get(index);
                    heap.set(index, heap.get(maxIndex));
                    heap.set(maxIndex, temp2);
                    index = maxIndex;
                    leftChildIndex = 2 * index + 1;
                    rightChildIndex = 2 * index + 2;
                }
            }
            return temp;
        }
    }
