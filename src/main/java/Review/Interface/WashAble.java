package Review.Interface;

public interface WashAble {
    void wash();
interface TrusrAble{
    void trust();
    }
    class House implements WashAble,TrusrAble{
        @Override
        public void wash() {
            System.out.println("Washing the horse");

        }

        @Override
        public void trust() {
            System.out.println("Horse can b they are loyal");
        }
    }
    class Car implements WashAble,TrusrAble{
        @Override
        public void wash() {
            System.out.println("Washing the car");

        }

        @Override
        public void trust() {
            System.out.println("you vn trust Toyota cars");
        }
    }
    class Laptop{}
}
