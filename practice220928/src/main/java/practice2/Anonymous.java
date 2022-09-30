package practice2;

public class Anonymous {
    Machine machine = new Machine() {
        @Override
        public int addition(int a, int b) {
            return a+b;
        }
    };
}
