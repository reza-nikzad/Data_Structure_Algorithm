public abstract class Sort {
    int[] array;

    public Sort(int[] array) {
        this.array = array;
    }
    abstract void sort();

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for(int i = 0; i< array.length ; i++ ){
            sb.append(array[i]);
            sb.append(", ");
        }
        sb.replace(sb.length()-2,sb.length()-1,"}");
        return sb.toString();
    }

}
